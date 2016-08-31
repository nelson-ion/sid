package br.ufrn.imd.sid.widgets;

import context.arch.storage.Attribute;
import context.arch.widget.Widget;

public class PollutionSensor extends Widget{
	
	public static final String CLASSNAME = PollutionSensor.class.getName();
	
	/** Threshold for Pollution Alert */
	public static final Integer ALERT_POLUTION_VALUE = 39;
	
	// Attributes 
	private int latitude;
	private int longitude;
	private int co2;
	private int co;

	public PollutionSensor(String emplacement, String widgetClassName) {
		super(emplacement, widgetClassName);
		latitude = 0;
		longitude = 0;
		co2 = 0;
		co = 0;
	}
		
	protected void init() {
		// non-constant attributes
		addAttribute(Attribute.instance("EMPLACEMENT", String.class));
		addAttribute(Attribute.instance("LATITUDE", Integer.class));
		addAttribute(Attribute.instance("LONGITUDE", Integer.class));
		addAttribute(Attribute.instance("CO2", Integer.class));
		addAttribute(Attribute.instance("CO", Integer.class));

		// constant attributes
//		addAttribute(AttributeNameValue.instance(ROOM, room));
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getCo2() {
		return co2;
	}

	public void setCo2(int co2) {
		this.co2 = co2;
	}

	public int getCo() {
		return co;
	}

	public void setCo(int co) {
		this.co = co;
	}

	
	

}
