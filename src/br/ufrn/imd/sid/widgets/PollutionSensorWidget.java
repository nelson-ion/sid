package br.ufrn.imd.sid.widgets;

import context.arch.service.helper.FunctionDescription;
import context.arch.service.helper.FunctionDescriptions;
import context.arch.storage.Attribute;
import context.arch.widget.Widget;

/**
 * Class to define a pollution sensor.
 * 
 * @author nelson
 */
public class PollutionSensorWidget extends Widget{
	
	public static final String CLASSNAME = PollutionSensorWidget.class.getName();
	
	private FunctionDescriptions functionsDescritions;
	
	/** Threshold for Pollution Alert */
	public static final Integer ALERT_POLUTION_VALUE = 39;
	
	public PollutionSensorWidget(String emplacement, String widgetClassName) {
		super(emplacement, widgetClassName);
		initAtributtes();
		start(true);
	}
	
	private void initAtributtes() {
		init();
		if (functionsDescritions == null) {
			functionsDescritions = new FunctionDescriptions();
		}
		FunctionDescription FD = new FunctionDescription("PollutionSensor", "Sensor for detect ar pollution", this.getNonConstantAttributes());
		functionsDescritions.add(FD);
	}
	
	/**
	 * Defining attributes for a pollution sensor.
	 * */
	protected void init() {
		// non-constant attributes
		addAttribute(Attribute.instance("EMPLACEMENT", String.class));
		addAttribute(Attribute.instance("LATITUDE", Integer.class));
		addAttribute(Attribute.instance("LONGITUDE", Integer.class));
		addAttribute(Attribute.instance("CO2", Integer.class));
		addAttribute(Attribute.instance("CO", Integer.class));

		// constant attributes
		// addAttribute(AttributeNameValue.instance(ROOM, room));
	}	

}
