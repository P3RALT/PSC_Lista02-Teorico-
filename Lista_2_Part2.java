/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;
import java.util.Scanner;
public class Lista_2_Part2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double [] PCombustivel = new double [3];
        /* PCombustivel [0] - Alcool
           PCombustivel [1] - Gasolina Comum
           PCombustivel [2] - Gasolina Aditivada
        */
        PCombustivel[0] = 2.85;
        PCombustivel[1] = 6.09;
        PCombustivel[2] = 6.29;
        
        System.out.println("---- Bem Vindo ao Posto UnasCarga --- " + "\nEscolha Seu Combustivel: 1 Alcool - 2 Gasolina Comum - 3 Gasolina Aditivada");
        byte opcao = entrada.nextByte();
        
        switch(opcao){
            case 1: System.out.println("Quantos Livros vc colocou?"); 
                    int litros = entrada.nextInt();
                    double soma = litros * PCombustivel[0];
                    System.out.println("PRECO TOTAL: " + soma);
                    break;
            case 2: System.out.println("Quantos Livros vc colocou?"); 
                    litros = entrada.nextInt();
                    soma = litros * PCombustivel[1];
                    System.out.println("PRECO TOTAL: " + soma);
                    break;
            case 3: System.out.println("Quantos Livros vc colocou?"); 
                    litros = entrada.nextInt();
                    soma = litros * PCombustivel[2];
                    System.out.println("PRECO TOTAL: " + soma);

                    break;
        };
    }    
}
