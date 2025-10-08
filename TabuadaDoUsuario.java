/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadadousuario;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class TabuadaDoUsuario {

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in); 
    
    System.out.println("Escolha um número para aparecer a tabuáda dele até o 10:");
    int numero = leitor.nextInt();
    
    for(int valor = 1; valor <= 10; valor++){
    
    System.out.println( "Tabuada do número " + numero + " : " + valor + "x" + numero + " = " + (numero * valor));
    }
    }
}
