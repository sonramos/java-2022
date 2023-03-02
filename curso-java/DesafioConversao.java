import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        double salario1, salario2, salario3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Salario 1:");
        salario1 = Double.parseDouble(scanner.next().replaceAll(",","."));
        System.out.print("Salario 1:");
        salario2 = Double.parseDouble(scanner.next().replaceAll(",","."));
        System.out.print("Salario 1:");
        salario3 = Double.parseDouble(scanner.next().replaceAll(",","."));

        scanner.close();

        System.out.println("Media dos salarios = "+(salario1+salario2+salario3)/3);
    }
}
