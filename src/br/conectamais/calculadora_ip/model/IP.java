package br.conectamais.calculadora_ip.model;

public class IP {

	private String ip = "192.168.0.0/24";
	
	private String getIp() {
		return ip;
	}
	
	private void setIp() {
		this.ip = ip;
	}
	
	int separador = ip.indexOf("/");
	
	
	public String calcularClasse() {
		
		String inicio = ip.substring(0,3);
		int ipclass = Integer.parseInt(inicio);
		String classe = "";
		
		
		if (ipclass >= 1 && ipclass <= 127 ) {
			
			classe = "Classe A";
			
		} 
		
		if (ipclass >= 128 && ipclass <= 191 ) {
			
			classe = "Classe B";
			
		}
		
		if (ipclass >= 192 && ipclass <= 223) {
			
			classe = "Classe C";
			
		}
		
		if (ipclass >= 224 && ipclass <= 239) {
			
			classe = "Classe D";
			
		}
		
		if (ipclass >= 240 && ipclass <= 255) {
			
			classe = "Classe E";
		
		} 
		return classe;
	}
	
	
	
	public String calcularMascara() {
		
		String CIDR = ip.substring(separador + 1);
		int bits = Integer.parseInt(CIDR);
		
		int primeiroocteto = 0;
		int segundoocteto = 0;
		int terceiroocteto = 0;
		int quartoocteto = 0;
		
		
			if (bits > 0) {
		    int valor = 0;
		    int potencia = 128;
		    for (int i = 0; i < Math.min(bits, 8); i++) {
		        valor += potencia;
		        potencia = potencia / 2;
		    }
		    primeiroocteto = valor;
		    bits -= 8;
		}

		// Segundo octeto (bits 9-16)
		if (bits > 0) {
		    int valor = 0;
		    int potencia = 128;
		    for (int i = 0; i < Math.min(bits, 8); i++) {
		        valor += potencia;
		        potencia = potencia / 2;
		    }
		    segundoocteto = valor;
		    bits -= 8;
		}

		// Terceiro octeto (bits 17-24)
		if (bits > 0) {
		    int valor = 0;
		    int potencia = 128;
		    for (int i = 0; i < Math.min(bits, 8); i++) {
		        valor += potencia;
		        potencia = potencia / 2;
		    }
		    terceiroocteto = valor;
		    bits -= 8;
		}

		// Quarto octeto (bits 25-32)
		if (bits > 0) {
		    int valor = 0;
		    int potencia = 128;
		    for (int i = 0; i < Math.min(bits, 8); i++) {
		        valor += potencia;
		        potencia = potencia / 2;
		    }
		    quartoocteto = valor;
		}

		String mascara = primeiroocteto + "." + segundoocteto + "." + terceiroocteto + "." + quartoocteto;
		return mascara;
		}
	
	}
	
	
	

