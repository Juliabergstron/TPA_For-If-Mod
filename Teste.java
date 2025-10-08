/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Teste {

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite um número:");
    int numero = leitor.nextInt();
    
    for( int valor=0; valor <= numero; valor++){
        
    if(valor % 2 == 0){
        System.out.println("O número " + valor + " é par!");
    }else{
        System.out.println("O número " + valor + " é impar!");
    }
    }
    
    }
}
