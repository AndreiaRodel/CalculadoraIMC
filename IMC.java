import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

    public static void main(String [] args) {
        Double peso,altura,imc;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        System.out.println("Cálcule o seu Índice de Massa Corporal - IMC");

        System.out.print("Digite o seu peso: ");
        peso = teclado.nextDouble();
        System.out.print("Digite a sua altura: ");
        altura = teclado.nextDouble();
       
        imc = peso / (altura * altura);

        System.out.println("IMC: " + formatador.format(imc));

        teclado.close();

        System.out.println(" ");
        System.out.println("A interpretação do IMC pelos parâmetros da OMS são: ");
        System.out.println("MAGREZA: <18,5");
        System.out.println("NORMAL: Entre 18,5 e 24,9");
        System.out.println("SOBREPESO: Entre 25 e 29,9 - Nível I de obesidade");
        System.out.println("OBESIDADE: Entre 30 e 39,9 - Nível II de obesidade");
        System.out.println("OBESIDADE GRAVE: >40 - Nível III de obesidade");
        
    }
}