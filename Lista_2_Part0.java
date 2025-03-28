/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author Vilmar Canuto
 */
public class Lista_2_Part0 {
        public static void main(String[] args){
      Scanner ler = new Scanner(System.in);
      
          /* EXERCICIO 1 ---------------------------- */
          int soma;   
          System.out.println("Digite um Numero: ");
          int numero = ler.nextInt();
          System.out.println("Numero Digitado: " +numero);
          
           System.out.println("Digite outro Numero pra realizarmos uma soma: ");
           int numero2 = ler.nextInt();
           System.out.println("Numero Digitado: " +numero2);
           
           soma = numero+numero2;
           System.out.println("Resultado: " +soma);
        }
}
