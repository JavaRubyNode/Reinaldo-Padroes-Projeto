package br.com.delta.mediador;

import java.util.ArrayList;
import java.util.List;

import br.com.delta.modelo.Passageiro;
import br.com.delta.modelo.Taxi;

public class MediadorTaxi {
	private List<Passageiro> listaPassageiro;
	private List<Taxi> listaTaxi;	
	public MediadorTaxi() {
		listaPassageiro = new ArrayList<Passageiro>();
		listaTaxi = new ArrayList<Taxi>();
	}
	public List<Passageiro> getListaPassageiro() {
		return listaPassageiro;
	}
	public void setListaPassageiro(List<Passageiro> listaPassageiro) {
		this.listaPassageiro = listaPassageiro;
	}
	public List<Taxi> getListaTaxi() {
		return listaTaxi;
	}
	public void setListaTaxi(List<Taxi> listaTaxi) {
		this.listaTaxi = listaTaxi;
	}
	public void incluirPassageiro(Passageiro passageiro) {
		getListaPassageiro().add(passageiro);
	}
	public void incluirTaxi(Taxi taxi) {
		getListaTaxi().add(taxi);
	}
	public void listarPassageiros() {
		for (Passageiro passageiro : getListaPassageiro()) {
			System.out.println(passageiro.getNome());
		}						
	}
	public void listarTaxis() {
		for (Taxi taxi : getListaTaxi()) {
			System.out.println(taxi.getPlaca());
		}		
	}	
}
