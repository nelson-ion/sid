package br.ufrn.imd.sid.widgets;

import context.arch.service.helper.FunctionDescription;
import context.arch.service.helper.FunctionDescriptions;
import context.arch.storage.Attribute;
import context.arch.widget.Widget;


/**
 * 
 * Class to define a fire sensor.
 * 
 * @author nelson
 */
public class FireSensorWidget extends Widget {

	public static final String CLASSNAME = FireSensorWidget.class.getName();

	private FunctionDescriptions functionsDescritions;

	public FireSensorWidget(String emplacement) {
		super(emplacement, CLASSNAME);
		initAtributtes();
		start(true);
	}

	private void initAtributtes() {
		init();
		if (functionsDescritions == null) {
			functionsDescritions = new FunctionDescriptions();
		}
		FunctionDescription FD = new FunctionDescription("FireSensor", "Sensor for detect fire", this.getNonConstantAttributes());
		functionsDescritions.add(FD);
	}

	
	/**
	 * Defining attributes for fire sensor.
	 * */
	protected void init() {
		// non-constant attributes
		addAttribute(Attribute.instance("EMPLACEMENT_DESCRIPTION", String.class));
		addAttribute(Attribute.instance("LATITUDE", Integer.class));
		addAttribute(Attribute.instance("LONGITUDE", Integer.class));
		addAttribute(Attribute.instance("FIRE_DETECTED", Boolean.class));
	}

}
