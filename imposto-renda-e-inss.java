/*Programa para cálculo do salário líquido em que três valores devem ser informados pelo usuário como variáveis: 
o nome do funcionário, a quantidade de horas trabalhadas e o salário hora. */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float INSS, IR; // declarar variaveis internas de calculo
    
    System.out.print("Digite o seu nome: "); // coleta de dados
    String funcionario = sc.nextLine();
    
    System.out.print("Digite quantidade de horas trabalhadas no mês: "); // coleta de dados
    float hora = sc.nextFloat();
    
    System.out.print("Digite seu salario por hora: "); // coleta de dados
    float salario = sc.nextFloat();
    
    float salarioBruto = hora * salario; // declaração do calculo de salario bruto
    
    // condições de verificação de INSS e IR 
    
    if (salarioBruto <= 1000){
      INSS = (float) (salarioBruto * (8.5 /100)); // calculo INSS 
    }
    else{
      INSS = salarioBruto * 9/100; // calculo INSS salarios acima de mil reais
    }
    if (salarioBruto <= 2500) {
      IR = 0;
    }
    else {
      IR = salarioBruto * 3/100; // calculo IR salarios acima de dois mil e quientos reais
    }
    
    System.out.printf("Funcionario(a) " + funcionario + "\n"); // nome impresso
    System.out.printf("Seu salario Bruto = " + salarioBruto + "\n"); // salario sem desconto
    System.out.printf("Seu salario Liquido = " + (salarioBruto - INSS - IR) + "\n"); // salario com os descontos INSS e IR
