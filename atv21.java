/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Escreva um programa que, dado um número positivo digitado
pelo o usuário mostre a tabuada de todos os números de 1 até o
número digitado. (utilize for)
Data: 14/05/2023
*/
import java.util.Scanner;

public class atv21 {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Me informe o numero positivo");
    int Numero = teclado.nextInt();
    teclado.close();

    for (int i = 1; i <= Numero; i++) {
        System.out.println("Tabuada do " + i + ":");
        for (int j = 1; j <= 10; j++) {
            int resultado = i * j;
            System.out.println(i + " x " + j + " = " + resultado);
        }
        System.out.println(" ");
    }   
}
}