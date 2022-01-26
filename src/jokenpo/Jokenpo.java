package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		int escolhaUsuario, escolhaComputador;
		int pedra = 1;
		int papel = 2;
		int tesoura = 3;
		
		System.out.println("-----------------");
		System.out.println("   JOKENPO   ");
		System.out.println("-----------------");
		System.out.println("");
		System.out.println("Escolha uma opção: 1 - Pedra, 2 - Papel, 3 - Tesoura"); 
		
		Scanner sc = new Scanner(System.in);
		escolhaUsuario = sc.nextInt();
		
		Random aleatorio = new Random();
		escolhaComputador = aleatorio.nextInt(3);
		
		System.out.println("Você escolheu " + escolhaUsuario);
		System.out.println("O computador escolheu " + escolhaComputador);
		
		
		if (escolhaUsuario == pedra && escolhaComputador == papel) {
			System.out.println("Você perdeu essa partida!");			
		} else if (escolhaUsuario == pedra && escolhaComputador == tesoura) {
			System.out.println("Você venceu essa partida");		
		} else if (escolhaUsuario == pedra && escolhaComputador == pedra) {
			System.out.println("Houve um empate nessa partida!!!");
		} else if (escolhaUsuario == papel && escolhaComputador == papel) {
			System.out.println("Houve um empate nessa partida!!!");
		} else if (escolhaUsuario == papel && escolhaComputador == tesoura) {	
			System.out.println("Você perdeu essa partida");
		} else if (escolhaUsuario == papel && escolhaComputador == pedra) {
			System.out.println("Você venceu essa partida");
		} else if (escolhaUsuario == tesoura && escolhaComputador == tesoura) { 
			System.out.println("Houve um empate nessa partida!!!");
		} else if (escolhaUsuario == tesoura && escolhaComputador == papel) {
			System.out.println("Você venceu essa partida");	
		} else if (escolhaUsuario == tesoura && escolhaComputador == pedra) {
			System.out.println("Você perdeu essa partida");
		} else {
			System.out.println("Você digitou um valor inválido, recomece a partida! ");
		}
			
	}

}
