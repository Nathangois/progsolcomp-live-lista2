/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Faça um programa que leia o nome, o sobrenome, a idade, em
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja
visualizar dados completos?”. Se o caractere digitado pelo
usuário for ‘S’ o programa deve imprimir na tela Nome,
Sobrenome, idade e naturalidade. Se o caractere digitado pelo
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
o caractere não for nenhuma das outras opções acima o programa
deve imprimir “Digitação errada. Tente Novamente”.
Data: 14/05/2023
*/
import java.util.Scanner;
public class atv5 {
    public static void main(String[] args) throws Exception {

        String nome, sobrenome, naturalidade, opcao;
        int idade;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Me informe o seu nome");
        nome = teclado.next();
        System.out.println("Me informe o seu sobrenome");
        sobrenome = teclado.next();
        System.out.println("Me informe a idade");
        idade = teclado.nextInt();
        System.out.println("Me informe a sua naturalidade");
        naturalidade = teclado.next();
        System.out.println("Deseja visualizar dados completos?");
        opcao = teclado.next();
        teclado.close();

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);
        System.out.println(idade);
        System.out.println(naturalidade);
        System.out.println(opcao);

        if(opcao.equals("S")) {
            System.out.println("Nome completo"+nome+" "+sobrenome+"Idade "+idade+"naturalidade "+naturalidade);
        } else if (opcao.equals("N")) {
            System.out.println("Primeiro nome "+nome+" Idade "+idade);
        }
        else {
            System.out.println("Digitação errada. Tente Novamente");
        }
        }
        }