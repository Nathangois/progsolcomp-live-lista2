/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Faça um programa para imprimir o conceito de um aluno. O
conceito é calculado em função da nota do aluno que varia de 0
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo
Data: 14/05/2023
*/
import java.util.Scanner;
public class atv6 {
    public static void main(String[] args) throws Exception {

        double nota;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Me informe a nota");
        nota = teclado.nextDouble();
        teclado.close();

        if(nota < 49){
            System.out.println("Nota conceito Insuficiente");
        }
        else if(nota < 64){
            System.out.println("Nota conceito Regular");
        }
        else if (nota < 84){
            System.out.println("Nota conceito Bom");
        }
            else if (nota < 100){
            System.out.println("Ótimo");
        }
        }
        }