import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Informe um número para a tabuada:");
            int number = read.nextInt();

            System.out.println("Tabela de multiplicação de " + number);

            for (int i = 0; i <= 10; i++){
                System.out.println(i + "*" + number + "=" + i*number);
            }
        }
    }
}
