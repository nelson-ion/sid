package br.ufrn.imd.sid.widgets;

import context.arch.storage.Attribute;
import context.arch.widget.Widget;

public class TemperatureAndHumiditySensor extends Widget{
	
	public static final String CLASSNAME = PollutionSensor.class.getName();
	
	
	
	public TemperatureAndHumiditySensor(String emplacement, String widgetClassName) {
		super(emplacement, widgetClassName);
	}
	
	/**
	 * Definindo os atributos do sensor de Temperatura e Umidade.
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
