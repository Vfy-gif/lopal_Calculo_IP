package br.conectamais.calculadora_ip.ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.conectamais.calculadora_ip.model.IP;

public class TelaCalculadoraIP {
	
	private JTextField textIP;
	private JLabel labelClasse;
	private JLabel labelMascara;
	private JLabel labelMascaraBinario;
	private JLabel labelIPsDisponiveis;
	private JButton btnCalcular;
	private JLabel labelMensagemErro;
	
	public void criarTelaCalculadoraIp() {
		
		JFrame tela = new JFrame();
		Dimension tamanho = new Dimension();
		tamanho.setSize(500, 250);
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Calculadora IP");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);
		
		textIP = new JTextField();
		textIP.setBounds(20, 20, 445, 40);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(20, 60, 445, 40);
		
		labelClasse = new JLabel("Classe: ");
		labelClasse.setBounds(20, 110, 100, 40);
		
		labelMascara = new JLabel("Máscara: ");
		labelMascara.setBounds(20, 130, 200, 40);
		
		labelMascaraBinario = new JLabel("Máscara em Binário: ");
		labelMascaraBinario.setBounds(20, 150, 200, 40);
		
		labelIPsDisponiveis = new JLabel("IPs Disponíveis: ");
		labelIPsDisponiveis.setBounds(20, 170, 200, 40);
	
		
		Container painel = tela.getContentPane();
		
		painel.add(textIP);
		painel.add(labelClasse);
		painel.add(labelMascara);
		painel.add(labelMascaraBinario);
		painel.add(labelIPsDisponiveis);
		painel.add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				IP ip = new IP();
				labelClasse.setText(ip.calcularClasse());
				labelMascara.setText(ip.calcularMascara());
				labelMascaraBinario.setText(ip.calcularMascaraBinario());
				String ips = String.valueOf(ip.calcularIPsDisponiveis());
				labelIPsDisponiveis.setText(ips);
				String ipDigitado = textIP.getText();
				ip.setIp(ipDigitado);
				
				
			}
		});
		
		
		tela.setVisible(true);
		
	}
	
}
