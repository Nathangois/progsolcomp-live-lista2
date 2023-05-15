/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Faça um programa que determine o fatorial de um número. Para
este problema, tem-se como entrada o valor do número do qual
se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O
fatorial de um número N (N!) é definido conforme a seguir
(utilize for):
i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
Data: 14/05/2023
*/  
import java.util.Scanner;

public class atv18{
    public static void main(String args[]) {

        int numero;
        int resultado = 1;
       
       Scanner teclado = new Scanner(System.in);
       System.out.println("Informe o número para saber o fatorial");
       numero = teclado.nextInt();
       teclado.close();
        
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }
}