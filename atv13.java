/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Faça um programa que some os números de 1 a 100 e imprima
somente o valor total da soma
Data: 14/05/2023
*/  
public class atv13{
    public static void main(String args[]) {

        int soma = 0;

        for(int i = 1; i <= 100; i++){
            soma += i;
        }    
        System.out.println(soma);
    }
}