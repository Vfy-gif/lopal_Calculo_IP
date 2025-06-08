package br.conectamais.calculadora_ip;

import br.conectamais.calculadora_ip.model.IP;

public class calculadora_ip {

	public static void main (String[] args) {
		
		IP ip = new IP();
		
		ip.calcularClasse();
		System.out.println(ip.calcularMascara());
	}
	
}
