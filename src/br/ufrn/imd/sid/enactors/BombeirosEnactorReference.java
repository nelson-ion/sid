package br.ufrn.imd.sid.enactors;

import context.arch.discoverer.query.AbstractQueryItem;
import context.arch.enactor.Enactor;
import context.arch.enactor.EnactorReference;

public class BombeirosEnactorReference extends EnactorReference {

	private Boolean fire;
	
	public BombeirosEnactorReference(Enactor enactor, AbstractQueryItem<?, ?> conditionQuery, String outcomeValue) {
		super(enactor, conditionQuery, outcomeValue);
	}

	public Boolean getFire() {
		return fire;
	}
	
}
