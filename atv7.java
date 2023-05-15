/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Faça um programa calcula o total de uma hospedagem em um
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.
Data: 14/05/2023
*/
import java.util.Scanner;
public class atv7 {
    public static void main(String[] args) throws Exception {
    double diaria;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantas diarias consumida no hotel");
        diaria = teclado.nextDouble();
        teclado.close();

        if(diaria < 15){
            System.out.println("O valor é R$"+((60 * diaria) + 5.50));
        }
        else if(diaria == 15){
            System.out.println("O valor é R$"+((60 * diaria) + 6));
        }
        else if (diaria > 15){
            System.out.println("O valor é R$"+((60 * diaria) + 8));
 }
}
}
