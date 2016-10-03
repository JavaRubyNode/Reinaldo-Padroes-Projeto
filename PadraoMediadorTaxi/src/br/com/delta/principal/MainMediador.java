package br.com.delta.principal;

import java.util.ArrayList;
import java.util.List;

import br.com.delta.mediador.MediadorTaxi;
import br.com.delta.modelo.Passageiro;
import br.com.delta.modelo.Taxi;

public class MainMediador {
	public static void main(String[] args) {
		
		MediadorTaxi mediador = new MediadorTaxi();
		mediador.incluirPassageiro(new Passageiro("Elias"));
		mediador.incluirPassageiro(new Passageiro("Paula"));
		mediador.incluirTaxi(new Taxi("ABC-1234"));
		mediador.incluirTaxi(new Taxi("ABC-4321"));
		mediador.listarPassageiros();
		mediador.listarTaxis();
		
	}	
}
