package br.ufrn.imd.sid.enactors;

import context.arch.discoverer.component.NonConstantAttributeElement;
import context.arch.discoverer.query.AbstractQueryItem;
import context.arch.discoverer.query.ORQueryItem;
import context.arch.discoverer.query.RuleQueryItem;
import context.arch.enactor.Enactor;
import context.arch.enactor.EnactorReference;
import context.arch.service.helper.ServiceInput;
import context.arch.storage.AttributeNameValue;

public class BombeirosEnactor extends Enactor{
	
	public BombeirosEnactor(AbstractQueryItem<?,?> inWidgetQuery, AbstractQueryItem<?,?> outWidgetQuery) {
		super(inWidgetQuery, outWidgetQuery, "fireDetectEnactor", "");
	
	
		AbstractQueryItem<?, ?> fireQueryItem = new ORQueryItem(
												RuleQueryItem.instance(new NonConstantAttributeElement(AttributeNameValue.instance("fire", true)))
										 );
		
		EnactorReference er; 
		
		er = new BombeirosEnactorReference(this, fireQueryItem, "fireOff");
		er.addServiceInput(new ServiceInput("BombeirosService", "fireOff"));
		addReference(er);
		
		er = new BombeirosEnactorReference(this, fireQueryItem, "fireOn");
		er.addServiceInput(new ServiceInput("BombeirosService", "fireOn"));
		
		addReference(er);
		
		start();
	
	}
}
