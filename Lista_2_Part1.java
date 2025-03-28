/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;
import java.util.Scanner;
public class Lista_2_Part1 {
      public static void main(String[] args){
      Scanner ler = new Scanner(System.in);
      
       
           /* EXERCICIO 2 --------------------------------*/
           double [] nota = new double[4];
           double media, total;
           
           System.out.println("Qual sua Nota do primeiro Bimestre? ");
           nota[0] = ler.nextDouble();
           System.out.println("Qual sua Nota do Segundo Bimestre? ");
           nota[1] = ler.nextDouble();
           System.out.println("Qual sua Nota do Terceiro Bimestre? ");
           nota[2] = ler.nextDouble();
           System.out.println("Qual sua Nota do Quarto Bimestre? ");
           nota[3]= ler.nextDouble();
           
           total = nota[0]+nota[1]+nota[2]+nota[3];
           media = total/4;
           if (total >= 60){
               System.out.println("Total: " + total + ("\nMedia: " + media)+ "\nSituacao: Aprovado" );}
           else {
               System.out.println("Total: " + total + ("\nMedia: " + media)+ "\nSituacao: Aprovado" );}
                   
      }
      
}
