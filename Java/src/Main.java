import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.print("Digite um numero: ");

        if (n < 0){
            System.out.println("Negativo");
        }
        else {
            System.out.println("Não é NEGATIVO");
        }

    }
}