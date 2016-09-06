package br.ufrn.imd.sid.enactors;

import context.arch.discoverer.query.AbstractQueryItem;
import context.arch.enactor.Enactor;

public class BombeirosEnactor extends Enactor{

	public BombeirosEnactor(AbstractQueryItem<?,?> inWidgetQuery, AbstractQueryItem<?,?> outWidgetQuery) {
		super(inWidgetQuery, outWidgetQuery, "light", "");
	}

}
