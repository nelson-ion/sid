package br.ufrn.imd.sid.widgets;

import context.arch.service.helper.FunctionDescription;
import context.arch.service.helper.FunctionDescriptions;
import context.arch.storage.Attribute;
import context.arch.widget.Widget;

/**
 * Class to define a temperature and humidity sensor.
 * 
 * @author nelson
 */
public class TemperatureAndHumiditySensorWidget extends Widget{
	
	public static final String CLASSNAME = PollutionSensorWidget.class.getName();
	
	private FunctionDescriptions functionsDescritions;
	
	public TemperatureAndHumiditySensorWidget(String emplacement, String widgetClassName) {
		super(emplacement, widgetClassName);
		initAtributtes();
		start(true);
	}
	
	private void initAtributtes() {
		init();
		if (functionsDescritions == null) {
			functionsDescritions = new FunctionDescriptions();
		}
		FunctionDescription FD = new FunctionDescription("TemperatureAndHumidySensor", "Sensor for monitor temperature and humidity", this.getNonConstantAttributes());
		functionsDescritions.add(FD);
	}
	
	/**
	 * Defining attributes for a temperature and humidity sensor.
	 * */
	protected void init() {
		// non-constant attributes
		addAttribute(Attribute.instance("EMPLACEMENT", String.class));
		addAttribute(Attribute.instance("LATITUDE", Integer.class));
		addAttribute(Attribute.instance("LONGITUDE", Integer.class));
		addAttribute(Attribute.instance("HUMIDITY", Integer.class));
		addAttribute(Attribute.instance("TEMPERATURE", Integer.class));

		// constant attributes
		// addAttribute(AttributeNameValue.instance(ROOM, room));
	}	

}
