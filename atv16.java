/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Faça um programa que solicite ao usuário que digite um número
até que ele digite um número menor que 0 (utilize while)
Data: 14/05/2023
*/  
import java.util.Scanner;
public class atv16{
    public static void main(String args[]) {
        int numero;
          do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Informe um número: ");
            numero = teclado.nextInt();
            teclado.close();
        } while (numero >=0);
        }
}