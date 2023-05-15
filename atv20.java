/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Escreva um programa que, dada a carga máxima de um elevador e
a quantidade máxima de pessoas digitadas pelo usuário, leia o
peso de cada pessoa, também digitada pelo usuário, que entra
no elevador até que a carga máxima seja atingida ou o número
máximo de pessoas seja atingido (utilize do / while).
Data: 14/05/2023
*/  
import java.util.Scanner;
public class atv20{
        public static void main(String[] args) throws Exception {
    
            double cargamaxima, peso, pesototal, somapeso;
            int qtdmaxpessoas, somaqtdpessoas;
    
            Scanner teclado = new Scanner(System.in);
            System.out.println("Qual a carga máxima?");
            cargamaxima = teclado.nextDouble();
    
            System.out.println("Qual quantidade limite de pessoas no elevador?");
            qtdmaxpessoas = teclado.nextInt();
            System.out.println("");
               
            somapeso = 0;
            somaqtdpessoas = 1;
            do {
            //Entrada
              System.out.println("Qual o peso da pessoa "+ somaqtdpessoas + "?");
            peso = teclado.nextDouble();
            pesototal = peso;
              //procesamento
            somapeso = pesototal * somaqtdpessoas;
            somapeso++;
            somaqtdpessoas++;
            } while (somapeso <= cargamaxima && somaqtdpessoas <= qtdmaxpessoas);
    
            System.out.print("Atingiu a carga máxima ou quantidade de pessoas");
            teclado.close();
       }
}