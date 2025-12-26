// Desafios JavaScript na DIO tem funções "gets" e "print" acessíveis globalmente:
// - "gets": lê uma linha com dados de entrada (input) do usuário;
// - "print": imprime um texto de saída (output) pulando uma linha.
// - "gets" e "print" não são funções nativas da linguagem e sim criadas para os desafios na DIO.

// Lê os valores de entrada:
const valorSalario = parseFloat(gets());
const valorBeneficios = parseFloat(gets());

// Calcula o imposto através da função calcularImposto():
const valorImposto = calcularImposto(valorSalario);

// Calcula e imprime a saída (com 2 casas decimais):
const saida = (valorSalario - valorImposto) + valorBeneficios;
print(saida.toFixed(2));

// Função para o cálculo do imposto (baseado nas alíquotas):
function calcularImposto(salario){
    let aliquota;
    if (salario >= 0 && salario <= 1100){
        aliquota = 0.05;
    }
    else if (valorSalario > 1100 && valorSalario <= 2500){
        aliquota = 0.10;
    } else{
        aliquota = 0.15;
    }    
    return aliquota * salario;
}