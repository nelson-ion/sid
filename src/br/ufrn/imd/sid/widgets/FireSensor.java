package br.ufrn.imd.sid.widgets;

import context.arch.service.helper.FunctionDescription;
import context.arch.service.helper.FunctionDescriptions;
import context.arch.storage.Attribute;
import context.arch.widget.Widget;

public class FireSensor extends Widget {

	public static final String CLASSNAME = FireSensor.class.getName();

	private FunctionDescriptions functionsDescritions;

	public FireSensor(String emplacement) {
		super(emplacement, CLASSNAME);
		initAtributtes();
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
	 * Definindo os atributos do sensor de fogo.
	 * */
	protected void init() {
		// non-constant attributes
		addAttribute(Attribute.instance("EMPLACEMENT_DESCRIPTION", String.class));
		addAttribute(Attribute.instance("LATITUDE", Integer.class));
		addAttribute(Attribute.instance("LONGITUDE", Integer.class));
		addAttribute(Attribute.instance("FIRE_DETECTED", Boolean.class));
	}

}
