package br.ufrn.imd.sid.widgets;

import context.arch.storage.Attribute;
import context.arch.widget.Widget;

public class PollutionSensor extends Widget{
	
	public static final String CLASSNAME = PollutionSensor.class.getName();
	
	/** Threshold for Pollution Alert */
	public static final Integer ALERT_POLUTION_VALUE = 39;
	
	public PollutionSensor(String emplacement, String widgetClassName) {
		super(emplacement, widgetClassName);
	}
		
	
	/**
	 * Definindo os atributos do sensor de poulioção.
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
