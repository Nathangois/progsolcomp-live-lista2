/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Faça um programa que imprima todos os números pares de 1 a 100
na ordem inversa
Data: 14/05/2023
*/    
public class atv11{
    public static void main(String args[]) {

        for(int i = 100; i >= 1; i--){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }    
    }
}