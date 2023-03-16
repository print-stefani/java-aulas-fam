

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Comparação de Valores \n"); // titulação do programa
    
    System.out.print("Digite o valor de A: ") // declarar variavel 
      int valorA = sc.nextInt();
    
    System.out.print("Digite o valor de B: "); // declarar variavel 
    int valorB = sc.nextInt();
    
    // comparação das condições das variaveis
    
    if (valorA > valorB){
      int diferenca = valorA - valorB; // calculo de diferença 
      System.out.printf("A diferença entre A e B é: " + diferenca + "\n" ); // resultado impresso com menssagem
    }
    else if (valorB > valorA){
      int diferenca = valorB - valorA; // calculo de diferença 
      System.out.printf("A diferença entre B e A é: " + diferenca + "\n"); // resultado impresso com menssagem
    } 
    // somar variaveis caso seja condições falsas 
    else { 
      int soma = valorB + valorA; 
      System.out.printf("A soma é: " + soma + "\n"); // resultado impresso com menssagem
    }
  }
}
