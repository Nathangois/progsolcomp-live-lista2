/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Construa um programa que receba como entrada três valores A, B
e C e os imprima em ordem crescente.
Data: 14/05/2023
*/
import java.util.Scanner;
public class atv2 {
    public static void main(String[] args) throws Exception {

        int A,B,C;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Me informe número A");
        A = teclado.nextInt();
        System.out.println("Me informe número B");
        B = teclado.nextInt();
        System.out.println("Me informe número C");
        C = teclado.nextInt();
        teclado.close();
    
        if (A <= C && A <= B) 
        {
            System.out.println(A+"-"+B+"-"+C);
            }
            else if ((A <= C) && (C > B)) {
                System.out.println(A+"-"+C+"-"+B);
            } 
            else if (( B <= A ) && (A <= C)){
                System.out.println(B+"-"+A+"-"+C);
            }
            else if((B <= C) && ( C <= A)){
                System.out.println(B+"-"+C+"-"+A);
            } 
            else if ((C <= A) && (A <= B)){
                System.out.println(C+"-"+A+"-"+B);
            } 
            else
            {
                System.out.println(C+"-"+B+"-"+A);
            }
        }
}