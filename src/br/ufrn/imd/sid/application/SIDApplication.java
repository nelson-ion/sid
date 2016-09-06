package br.ufrn.imd.sid.application;

import java.awt.Dimension;

import javax.swing.JFrame;

import br.ufrn.imd.sid.services.BombeirosService;
import br.ufrn.imd.sid.widgets.FireSensor;
import context.arch.discoverer.Discoverer;
import context.arch.enactor.Enactor;
import context.arch.widget.Widget;


public class SIDApplication {
	

	protected Widget fireSensor;
	
	protected Enactor bombeirosEnactor;
	
	protected BombeirosService bombeirosService;
	
	protected WindowApplicationUI app;
	
	public SIDApplication() {
		// Instanciando o Widget do Sensor
		fireSensor = new FireSensor("Centro da Cidade");
		
		// Instancinado o Service dos Bombeiros
		bombeirosService = new BombeirosService(fireSensor);
		
		// Adicionando o serviço ao widget
		fireSensor.addService(bombeirosService);
		
		// Instanciando a classe de interface
		app = new WindowApplicationUI(fireSensor,bombeirosService.fireLabel);
	}
	
	
	public static void main(String[] args) {
		
		Discoverer.start();
		
		SIDApplication sid = new SIDApplication();
		
		/*
		 * GUI frame
		 */
		JFrame frame = new JFrame("SID 2016.2");
		//Adicionando a interface ao JFrame
		frame.add(sid.app);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(300, 200));
		frame.setLocationRelativeTo(null); // center of screen
		frame.setVisible(true);

	}

}
