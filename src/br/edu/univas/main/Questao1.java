package br.edu.univas.main;
import java.util.Scanner;
public class Questao1 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
        double contaA[] = new double[12];
        double contaB[] = new double[12];
        double ContaMaiorA = 0;
        double ContaMaiorB = 0;
        double ContaMenorA = 10000;
        double ContaMenorB = 10000;
        double somaA = 0;
        double somaB = 0;
        
   
        for (int i = 0; i < 12; i++) {
            System.out.println("Digite o valor da conta do primeiro vizinho:");
            contaA[i] = leitura.nextInt();
            
            System.out.println("Digite o valor da conta de luz do segundo vizinho:");
            double vizinho2 = leitura.nextInt();
            contaB[i] = leitura.nextInt();

            if(contaA[i] > ContaMaiorA) {
                ContaMaiorA = contaA[i];
            } 
            if(contaA[i] < ContaMenorA) {
                ContaMenorA = contaA[i];
            }
            somaA += contaA[i];

            if(contaB[i] > ContaMaiorB) {
                ContaMaiorB = contaB[i];
            } 
            if(contaB[i] < ContaMenorB) {
                ContaMenorB = contaB[i];
            }
            somaB += contaB[i];
        }
        System.out.println("A conta com o maior valor é igual a R$" + ContaMaiorA);
        System.out.println("A conta com o maior valor é igual a R$" + ContaMaiorB);
        System.out.println("A conta com o menor valor é igual a R$" + ContaMenorA);
        System.out.println("A conta com o menor valor é igual a R$" + ContaMenorB);
        System.out.println("A soma das contas é igual a R$" + somaA);
        System.out.println("A soma das contas é igual a R$" + somaB);
    }
}

