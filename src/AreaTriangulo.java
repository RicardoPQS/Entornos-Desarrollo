import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del lado 1 del triangulo: ");
        int lado1 = scanner.nextInt();

        System.out.println("Ingrese la longitud del lado 2 del triangulo: ");
        int lado2 = scanner.nextInt();

        double area = calcularArea(lado1, lado2);

        System.out.println("El area del triangulo es: " + area);
    }

    public static double calcularArea(int lado1, int lado2) {
        double area = 0.5 * lado1 * lado2;
        return area;
    }
}
