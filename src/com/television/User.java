package com.television;

import com.television.model.SmartTV;

public class User {

	public static void main(String[] args) {
		SmartTV television = new SmartTV();
		
		System.out.println("A televisão está " + (television.on ? "ligada" : "desligada"));
		System.out.println("Está no canal " + television.channel);
		System.out.println("E no volume " + television.volume);
		System.out.println(" ");
		System.out.println("== Ligando a TV ==");
		television.turnOn();
		System.out.println("A televisão está ligada");
		System.out.println(" ");
		System.out.println("== Mudando para o próximo canal ==");
		television.nextChannel();
		System.out.println("A tv está no canal " + television.channel);
		System.out.println(" ");
		System.out.println("== Diminuindo o volume ==");
		television.volumeDown();
		System.out.println("O volume está em " + television.volume);

	}

}
