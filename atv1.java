/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Faça um programa que leia dois números A e B e imprima o maior
deles.
Data: 10/04/2023
*/
import java.util.Scanner;
public class atv1 {
    public static void main(String[] args) throws Exception {

        double NumeroA, NumeroB;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Me informe número A");
        NumeroA = teclado.nextDouble();
        System.out.println("Me informe número B");
        NumeroB = teclado.nextDouble();
        teclado.close();
        if (NumeroA > NumeroB) {
            System.out.print("O número maior é " + NumeroA);
        }
        if (NumeroA < NumeroB) {
            System.out.print("O número maior é " + NumeroB);
        }
    }
}