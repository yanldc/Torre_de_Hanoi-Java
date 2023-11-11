/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.torredehanoi;
import javax.swing.JOptionPane;

/**
 *
 * @author yan-l
 */
public class TorreDeHanoi {
    public static void main(String[] args) {
        Torre torre = new Torre();
        String sc;
        int quantidade;
        
        sc = JOptionPane.showInputDialog("Entre com a quantidade de discos: ");
        quantidade = Integer.parseInt(sc);

        long startTime = System.currentTimeMillis();

        long movimentos = torre.moverDiscos(quantidade, 'A', 'B', 'C');

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        long hours = (elapsedTime / (1000 * 60 * 60)) % 24;
        long minutes = (elapsedTime / (1000 * 60)) % 60;
        long seconds = (elapsedTime / 1000) % 60;
        long milliseconds = elapsedTime % 1000;

        String formattedTime = String.format("%02d:%02d:%02d:%03d", hours, minutes, seconds, milliseconds);

        JOptionPane.showMessageDialog(null,"Para "+ sc + " discos, a quantidade de movimentos é: " + movimentos + "\nTempo de execução: " + formattedTime);
        System.out.println("Para "+ sc + " discos, a quantidade de movimentos é: " + movimentos + "\nTempo de execução: " + formattedTime);
    }
}