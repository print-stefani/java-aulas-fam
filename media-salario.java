import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Média de Salário "); // titulação do programa
    
    System.out.print("Digite o salário de Rebeca: "); // coleta de dados 1
    float salario = sc.nextFloat();
    
    System.out.print("Digite o salário de Reinaldo: "); // coleta de dados 2
    float salario2 = sc.nextFloat();
    
    System.out.print("Digite o salário de Pietra: "); // coleta de dados 3
    float salario3 = sc.nextFloat();
    
    System.out.print("Digite o salário de Carl: "); // coleta de dados 4
    float salario4 = sc.nextFloat();
    
    float media; // variavel inicial
    
    media = (salario + salario2 + salario3 + salario4) /4; // calculo da media
    
    System.out.printf("Media Salário = %3.2f %n", media); //resultado final
  }
}
