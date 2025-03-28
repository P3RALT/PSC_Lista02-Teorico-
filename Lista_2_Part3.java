
package teste;
import java.util.Scanner;
public class Lista_2_Part3 {
    public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    
    /* DECLARAÇÃO VARIAVEL -----------------------------*/
    int  Viajantes;
    double [] ValorP = new double[4];
    double [] VDepositado = new double [4];
    /* DECLARAÇÃO VARIAVEL -----------------------------*/
    
    System.out.print("Quantas Pessageiros? ");
    Viajantes = ler.nextInt();
    System.out.print("Preço Viagem Alemanha: $");
    ValorP[0] = ler.nextDouble();
    System.out.print("Preço Viagem Italia: $");    
    ValorP[1] = ler.nextDouble();
    System.out.print("Preço Viagem Portugal: $");    
    ValorP[2] = ler.nextDouble();
    
    /* SOMA TOTAL ------------------------------------*/
    ValorP[3] = ValorP[0]+ValorP[1]+ValorP[2]+ValorP[3];
    
    System.out.println("---- EUROTRIP ---- \nViajantes: " + Viajantes 
            + "\nAlemanha: " + ValorP[0] + "\nPortugal: " + ValorP[1] + "\nItalia: " + ValorP[2] 
            + "\nValor Total: " + ValorP[3] + " Total Guardado: " + VDepositado[0]);
    System.out.println("Opções: - 1 Depositar 2 - Sacar");
    byte opcao = ler.nextByte();
    
    /* SWITCH ------------------------- */
    switch (opcao){
        case 1:  System.out.print("Depositar: $"); 
                 VDepositado[0] = ler.nextDouble();      
                 System.out.println("Saldo: " + VDepositado[0]);
        break;
        case 2:  System.out.print("Sacar: $"); 
                 VDepositado[0] = VDepositado[0] - ler.nextDouble();
                 break; }
    /* SWITCH ------------------------- */
     System.out.println("---- EUROTRIP ---- \nViajantes: " + Viajantes 
            + "\nAlemanha: " + ValorP[0] + "\nPortugal: " + ValorP[1] + "\nItalia: " + ValorP[2] 
            + "\nValor Total: " + ValorP[3] + " Total Guardado: " + VDepositado[0]);   
        
    }
}
