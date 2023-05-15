/* Nome do Aluno: Nathan Almeida Gois
 RA: 722311425
Nome do Programa: Elabore um programa que lê dois valores A e B e os escreve com
a mensagem: “São múltiplos” ou “Não são múltiplos”.
Data: 14/05/2023
*/
import java.util.Scanner;
public class atv3 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Me informe valor A");
        int a = teclado.nextInt();
        System.out.println("Me informe valor B");
        int b = teclado.nextInt();
        teclado.close();
        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }       
        }
        }