/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Faça um programa que leia um número inteiro e mostre uma
mensagem indicando se este número é par ou ímpar e se é
positivo ou negativo.
Data: 14/05/2023
*/
import java.util.Scanner;
public class atv4 {
    public static void main(String[] args) throws Exception {

        double NumeroA;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Me informe o numero");
        NumeroA = teclado.nextDouble();
        teclado.close();
        
        if (NumeroA % 2 ==0) {
            System.out.print("Par");
        }else{
            System.out.print("Impar");
        }

        if (NumeroA >=0) {
            System.out.print(" e positivo");
        } else {
            System.out.print(" e negativo");
        }
    }
}