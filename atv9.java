/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Faça um programa que receba o valor da venda, escolha a
condição de pagamento no menu e mostre o total da venda final
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7%
Data: 14/05/2023
*/
import java.util.Scanner;
public class atv9 {
    public static void main(String[] args) throws Exception {
        double valorVenda;
        int forma;
    
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o valor da venda");
            valorVenda = teclado.nextDouble();

            System.out.println("O valor da venda é R$"+valorVenda);
            System.out.println("1-Venda a Vista - desconto de 10% \n 2-Venda a Prazo 30 dias - desconto de 5% \n 3-Venda a Prazo 60 dias - mesmo preço \n 4-Venda a Prazo 90 dias - acréscimo de 5% \n 5-Venda com cartão de débito - desconto de 8% \n 6-Venda com cartão de crédito - desconto de 7%");
            System.out.println("Informe o formato de pagamento");
            forma = teclado.nextInt();
            teclado.close();

            if (forma == 1) {
                System.out.println("O valor da venda é R$"+(valorVenda-(valorVenda*0.10)));
            }
            else if (forma == 2){
            System.out.println("O valor da venda é R$"+(valorVenda-(valorVenda*0.05)));
        }
        else if (forma == 3){
            System.out.println("O valor da venda é R$"+valorVenda);
        }
        else if (forma == 4){
            System.out.println("O valor da venda é R$"+(valorVenda+(valorVenda*0.10)));
        }
        else if (forma == 5){
            System.out.println("O valor da venda é R$"+(valorVenda-(valorVenda*0.08)));
        }
        else if (forma == 6){
            System.out.println("O valor da venda é R$"+(valorVenda-(valorVenda*0.07)));
        }
    }
}