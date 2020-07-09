package br.edu.univas.main;
import java.util.Scanner;
public class Questao3 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

        float salario[] = new float[150];
        float folhaSalarial = 0;
        float folhaAumento = 0;


        for (int i = 0; i < 150; i++) {

            System.out.println("Digite o salário"); 
            salario[i] = leitura.nextFloat();
            folhaAumento = folhaAumento + (salario[i] * 1.15f);
            folhaSalarial += salario[i];



        }

        System.out.println("A folha salarial sem aumento é: " + folhaSalarial);
        System.out.println("A folha salarial com aumento é: " + folhaAumento) ;
	}

}
