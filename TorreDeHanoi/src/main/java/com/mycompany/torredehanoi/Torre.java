/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.torredehanoi;

/**
 *
 * @author yan-l
 */
public class Torre {

	public long moverDiscos(int n, char Origem, char Auxiliar, char Destino) {
		long movimentos = 0;
		if (n == 1) {
			movimentos++;
		} else {
			movimentos += moverDiscos(n - 1, Origem, Destino, Auxiliar);
			movimentos++;
			movimentos += moverDiscos(n - 1, Auxiliar, Origem, Destino);
		}
		return movimentos;
	}
}