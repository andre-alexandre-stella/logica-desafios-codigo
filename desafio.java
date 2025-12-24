// Para ler e escrever dados em Java, padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de entradas, com métodos úteis com prefixo "next";
// - System.out.println: imprime um texto de saída (output) pulando uma linha.

import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    // Lê os valores de entrada:
    Scanner leitorDeEntradas = new Scanner(System.in);
    float valorSalario = leitorDeEntradas.nextFloat();
    float valorBeneficios = leitorDeEntradas.nextFloat();

    // Atribui a alíquota de imposto mediante o salário:
    float valorImposto = 0;
    if (valorSalario >= 0 && valorSalario <= 1100){
        valorImposto = 0.05F * valorSalario;
    } else if (valorSalario > 1100 && valorSalario <= 2500){
        valorImposto = 0.10F * valorSalario;
    } else {
        valorImposto = 0.15F * valorSalario;
    }

    // Calcula e imprime a saída (com 2 casas decimais):
    float saida = (valorSalario - valorImposto) + valorBeneficios;
    System.out.println(String.format("%.2f", saida));
  }
}