package br.conectamais.calculadora_ip.model;

public class IP {

	private String ip;
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
	
	
	public String calcularClasse() {
		
		String inicio = ip.substring(0,3);
		int ipclass = Integer.parseInt(inicio);
		String classe = "";
		
		
		if (ipclass >= 1 && ipclass <= 127 ) {
			
			classe = "A";
			
		} 
		
		if (ipclass >= 128 && ipclass <= 191 ) {
			
			classe = "B";
			
		}
		
		if (ipclass >= 192 && ipclass <= 223) {
			
			classe = "C";
			
		}
		
		if (ipclass >= 224 && ipclass <= 239) {
			
			classe = "D";
			
		}
		
		if (ipclass >= 240 && ipclass <= 255) {
			
			classe = "E";
		
		} 
		return classe;
	}
	
	int separador = ip.indexOf("/");
	String CIDR = ip.substring(separador + 1);
	
	public String calcularMascara() {
		
		
		int bits = Integer.parseInt(CIDR);
		int bitBkp = Integer.parseInt(CIDR);
		
	
		int i = 4;
		int valor = 129;
		int primeiroocteto = 0;
		int segundoocteto = 0;
		int terceiroocteto = 0;
		int quartoocteto = 0;
		
		
		// Condição para ser adicionado automaticamente máscara 255 ao primeiro octeto da 
		// esquerda para direita 
		
		while (bits >= 8 && i == 4) {
			primeiroocteto = primeiroocteto + 255;
			i = i - 1;
			
		}
		
		// Condição para ser adicionado automaticamente máscara 255 ao segundo octeto da 
		// esquerda para direita 
		
		while (bits >= 17 && i == 3 ) {
			segundoocteto = segundoocteto + 255;
			i = i - 1;
			
		}
		
		// Condição para ser adicionado automaticamente máscara 255 ao terceiro octeto da 
		// esquerda para direita 
		
		while (bits >= 25 && i == 2 ) {
			terceiroocteto = terceiroocteto + 255;
			i = i - 1;
			
		}
		
		
		while (bits >= 2 && i != 1 && bits != 9 && bits < 9) {
				primeiroocteto = primeiroocteto + valor;
				valor = valor /2;
				bits = bits - 1;
			}
			
		while (primeiroocteto == 129 && bitBkp == 2) {
				primeiroocteto = primeiroocteto + 63;
			}
		
		while (primeiroocteto == 193 && bitBkp == 3) {
				primeiroocteto = primeiroocteto + 31;
			}
			while (primeiroocteto == 225 && bitBkp == 4) {
				primeiroocteto = primeiroocteto + 15;
			}
			while (primeiroocteto == 241 && bitBkp == 5) {
				primeiroocteto = primeiroocteto + 7;
			}
			while (primeiroocteto == 249 && bitBkp == 6) {
				primeiroocteto = primeiroocteto + 3;
			}
			while (primeiroocteto == 253 && bitBkp == 7) {
				primeiroocteto = primeiroocteto + 1;
			}
			
			while (bits >= 9 && i != 1 && bits != 17 && bits < 17) {
				segundoocteto = segundoocteto + valor;
				valor = valor /2;
				bits = bits - 1;
			}
			
			
			
			while (segundoocteto == 129 && bitBkp == 9) {
				segundoocteto = segundoocteto - 1;
			}
			while (segundoocteto == 193 && bitBkp == 10) {
				segundoocteto = segundoocteto - 1;
			}
			while (segundoocteto == 225 && bitBkp == 11) {
				segundoocteto = segundoocteto - 1;
			}
			while (segundoocteto == 241 && bitBkp == 12) {
				segundoocteto = segundoocteto - 1;
			}
			while (segundoocteto == 249 && bitBkp == 13) {
				segundoocteto = segundoocteto - 1;
			}
			while (segundoocteto == 253 && bitBkp == 14) {
				segundoocteto = segundoocteto - 1;
			}
			while (segundoocteto == 255 && bitBkp == 15) {
				segundoocteto = segundoocteto - 1;
			}
			while (segundoocteto == 256 && bitBkp == 16) {
				segundoocteto = segundoocteto - 1;
			}
			
			
			while (bits >= 17 && i != 1 && bits != 25 && bits < 25) {
				terceiroocteto = terceiroocteto + valor;
				valor = valor /2;
				bits = bits - 1;
			}
			
			
			while (terceiroocteto == 129 && bitBkp == 17) {
				terceiroocteto = terceiroocteto - 1;
			}
			
			while (terceiroocteto == 193 && bitBkp == 18) {
				terceiroocteto = terceiroocteto - 1;
			}
			
			while (terceiroocteto == 225 && bitBkp == 19) {
				terceiroocteto = terceiroocteto - 1;
			}
			
			while (terceiroocteto == 241 && bitBkp == 20) {
				terceiroocteto = terceiroocteto - 1;
			}
			
			while (terceiroocteto == 249 && bitBkp == 21) {
				terceiroocteto = terceiroocteto - 1;
			}
			
			while (terceiroocteto == 253 && bitBkp == 22) {
				terceiroocteto = terceiroocteto - 1;
			}
			
			while (terceiroocteto == 255 && bitBkp == 23) {
				terceiroocteto = terceiroocteto - 1;
			}
			
			while (terceiroocteto == 256 && bitBkp == 24) {
				terceiroocteto = terceiroocteto - 1;
			}
			
			while (bits >= 25 && i != -1 && bits != 33 && bits < 33) {
				quartoocteto = quartoocteto + valor;
				valor = valor /2;
				bits = bits - 1;
			}
			
			while (quartoocteto == 129 && bitBkp == 25) {
				quartoocteto = quartoocteto - 1;
			}
			
			while (quartoocteto == 193 && bitBkp == 26) {
				quartoocteto = quartoocteto - 1;
			}
			
			while (quartoocteto == 225 && bitBkp == 27) {
				quartoocteto = quartoocteto - 1;
			}
			
			while (quartoocteto == 241 && bitBkp == 28) {
				quartoocteto = quartoocteto - 1;
			}
			
			while (quartoocteto == 249 && bitBkp == 29) {
				quartoocteto = quartoocteto - 1;
			}
			
			while (quartoocteto == 253 && bitBkp == 30) {
				quartoocteto = quartoocteto - 1;
			}
			
			while (quartoocteto == 255 && bitBkp == 31) {
				quartoocteto = quartoocteto - 1;
			}
			
			while (quartoocteto == 256 && bitBkp == 32) {
				quartoocteto = quartoocteto - 1;
			}
			
			String mascara = primeiroocteto + "." + segundoocteto + "." + terceiroocteto + "." + quartoocteto;
		return mascara;
		}
	
	
	

	
		public String calcularMascaraBinario() {
			
			
			int ponto = ip.indexOf(".");
			int ponto2 = ip.indexOf(".", ponto + 1);
			int ponto3 = ip.indexOf(".", ponto2 + 1);
			int ponto4 = ip.lastIndexOf(".");
			
			String octeto1 = ip.substring(0, ponto);
			int o1 = Integer.parseInt(octeto1);
			String binario1 = Integer.toBinaryString(o1);
			
	
			
			
			String octeto2 = ip.substring(ponto + 1 , ponto2);
			int o2 = Integer.parseInt(octeto2);
			String binario2 = Integer.toBinaryString(o2);
			
			
			String octeto3 = ip.substring(ponto2 + 1 , ponto3);
			int o3 = Integer.parseInt(octeto3);
			String binario3 = Integer.toBinaryString(o3);
			
			
			
			String octeto4 = ip.substring(ponto4 + 1 , separador);
			int o4 = Integer.parseInt(octeto4);
			String binario4 = Integer.toBinaryString(o4);
			
			String mascarabinario = binario1 + "." + binario2 + "." + binario3 + "." + binario4;
			return mascarabinario;
		}
		
		public double calcularIPsDisponiveis() {
			
			int CIDRint = Integer.parseInt(CIDR);
			int potencia = 32 - CIDRint;
			double ips = Math.pow(2, potencia);
			
			return ips;
		}
		
	
	}
	
	
	

