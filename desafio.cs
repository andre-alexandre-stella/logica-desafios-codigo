// Para ler e escrever dados em C#, utilizamos os seguintes métodos da classe Console:
// - Console.ReadLine: lê uma linha com dados de entrada (input) do usuário;
// - Console.WriteLine: imprime um texto de saída (output) pulando uma linha.

using System;

public class Desafio
{
    public static void Main()
    {
        // Lê os valores de entrada
        float valorSalario = float.Parse(Console.ReadLine());
        float valorBeneficios = float.Parse(Console.ReadLine());

        // Atribui a alíquota de imposto mediante o salário:
        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100)
        {
            valorImposto = 0.05F * valorSalario;
        }
        else if (valorSalario > 1100 && valorSalario <= 2500)
        {
            valorImposto = 0.10F * valorSalario;
        }
        else
        {
            valorImposto = 0.15F * valorSalario;
        }
        
        // Calcula e imprime a saída (com 2 casas decimais):
        float saida = (valorSalario - valorImposto) + valorBeneficios;
        Console.WriteLine(saida.ToString("0.00"));
    }
}