/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Faça um programa que exiba todos os números pares a
partir de 0 até que encontre um múltiplo de 7 (utilize
do/while)
Data: 14/05/2023
*/
public class atv12 {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        do{
            if(numero % 2 ==0){
                System.out.print(numero + " ");
            }
            if(numero % 7 == 0 && numero !=0){
                break;
            }
            numero++;
        } while(true);
        }
        }