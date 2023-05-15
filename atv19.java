/* Nome do Aluno: Nathan Almeida Gois
RA: 722311425
Nome do Programa: Um determinado gás duplica seu volume a cada segundo. Dada um
volume inicial, em centímetros cúbicos, digitado pelo usuário
faça um programa que determine o tempo necessário para que
esse volume se torne maior que 1000 centímetros cúbicos.
(utilize while)

Data: 14/05/2023
*/  
import java.util.Scanner;
public class atv19 {
    public static void main(String[] args) throws Exception {

        int volume;
        int tempo = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o volume em cm³");
        volume = teclado.nextInt();
        teclado.close();

        while (volume <= 1000) {
            volume *= 2;
            tempo++;
        }

        System.out.println("O volume do gás será maior que 1000 cm³ em " + tempo + " segundos.");
    }
}