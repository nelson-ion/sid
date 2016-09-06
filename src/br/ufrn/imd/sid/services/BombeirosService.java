package br.ufrn.imd.sid.services;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import context.arch.comm.DataObject;
import context.arch.service.Service;
import context.arch.service.helper.FunctionDescription;
import context.arch.service.helper.FunctionDescriptions;
import context.arch.service.helper.ServiceInput;
import context.arch.widget.Widget;

public class BombeirosService extends Service{

//	private FunctionDescriptions fuctionsDescription = new FunctionDescriptions();
	
	public JLabel fireLabel;
	
	public BombeirosService(final Widget widget){
		super(widget,"BombeirosService",
				new FunctionDescriptions() {
					private static final long serialVersionUID = -2946354496849483731L;
	
					{ // constructor
						// define function for the service
						add(new FunctionDescription(
								"fireControl", 
								"Sets the fire control", 
								widget.getNonConstantAttributes()));
					}
				}
		);
		
		fireLabel  = new JLabel("0") {
			private static final long serialVersionUID = 1L;

		{
			setHorizontalAlignment(JLabel.RIGHT);
			setBorder(BorderFactory.createEtchedBorder());
			
			setOpaque(true); 			// to allow background color to show
										// set color to represent light level
			setBackground(Color.black); // initially dark
		}};
		
	}
	
	@Override
	public DataObject execute(ServiceInput serviceInput) {
		boolean fire = serviceInput.getInput().getAttributeValue("FIRE_DETECTED");

		// fire is true or false
		fireLabel.setText(String.valueOf(fire));
		fireLabel.setBackground(new Color(255, 255, 255));
		
		return new DataObject(); // no particular info to return
	}

}
