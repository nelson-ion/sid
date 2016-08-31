package br.ufrn.imd.sid.services;

import context.arch.comm.DataObject;
import context.arch.service.Service;
import context.arch.service.helper.ServiceInput;
import context.arch.widget.Widget;

public class BombeirosService extends Service{

//	private FunctionDescriptions fuctionsDescription = new FunctionDescriptions();
	
	public BombeirosService(final Widget widget){
		super(widget,"BombeirosService",null);
	}
	
	@Override
	public DataObject execute(ServiceInput arg0) {
		// TODO Implementar Serviço de Bombeiro
		return null;
	}

}
