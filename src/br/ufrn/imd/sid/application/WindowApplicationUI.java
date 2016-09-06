package br.ufrn.imd.sid.application;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import context.arch.widget.Widget;


/**
 * 
 * Class to define Graphic Interface for the application. 
 * 
 * @author nelson
 *
 */
public class WindowApplicationUI extends JPanel{


	private static final long serialVersionUID = -3040544370627331590L;
	
	private JSlider brightnessSlider;
	private JSpinner presenceSpinner;
	
	private float fontSize = 20f;
	
	public WindowApplicationUI(Widget widget, JLabel fireLabel) {			
		setLayout(new GridLayout(3, 2)); // 3 rows, 2 columns
		
		/*
		 * UI for brightness
		 */
		add(new JLabel("brightness") {{ setFont(getFont().deriveFont(fontSize)); }});
		
		add(brightnessSlider = new JSlider(new DefaultBoundedRangeModel(255, 0, 0, 255)) {{
			addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent evt) {
					// brightness is from 0 to 255
					short brightness = (short)brightnessSlider.getValue();
						widget.updateData("brightness", brightness);
					
					// set color to represent brightness level
					setBackground(new Color(brightness, brightness, brightness));
				}
			});
			setOpaque(true); // to allow background color to show
			setMajorTickSpacing(50);
			setPaintTicks(true);
			setPaintLabels(true);
		}});
		
		/*
		 * UI for presence
		 */
		add(new JLabel("presence") {{ setFont(getFont().deriveFont(fontSize)); }});
		
		add(presenceSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 5, 1)) {{ // # people from 0 to 5
			// get text field to color text
			final JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) getEditor();
			final JFormattedTextField tf = editor.getTextField();
			tf.setForeground(Color.red);
			setFont(getFont().deriveFont(fontSize));
			
			addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent evt) {
					int presence = (Integer) presenceSpinner.getValue();
					widget.updateData("presence", presence);
					
					// color text red for when presence is red
					if (presence == 0) { tf.setForeground(Color.red); }
					else { tf.setForeground(Color.black); }
				}
			});
		}});
		
		// UI for light level
		add(new JLabel("light") {{ setFont(getFont().deriveFont(fontSize)); }});
		add(fireLabel);
		
		/*
		 * Init state of widgets
		 */
		short brightness = (short)brightnessSlider.getValue();
		int presence = (Integer) presenceSpinner.getValue();
		widget.updateData("brightness", brightness);
		widget.updateData("presence", presence);
	}
	
}