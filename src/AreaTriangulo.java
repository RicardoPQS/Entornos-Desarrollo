import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del lado 1 del triangulo: ");
        int lado1 = scanner.nextInt();

        System.out.println("Ingrese la longitud del lado 2 del triangulo: ");
        int lado2 = scanner.nextInt();
        
        System.out.println("Ingrese el radio de la circunferencia: ");
		int radio = scanner.nextInt();


        double area = calcularArea(lado1, lado2);
        double areaCircunferencia = calcularAreaCircunferencia(radio);
		double perimetroCircunferencia = calcularAreaCircunferencia(radio);


        System.out.println("El area del triangulo es: " + area);
        System.out.println("El area de la circunferencia es: " + areaCircunferencia);
		System.out.println("El perimetro de la circunferencia es: " + perimetroCircunferencia);
        
    }

    public static double calcularArea(int lado1, int lado2) {
        double area = 0.5 * lado1 * lado2;
        return area;
    }
    
    public static double calcularAreaCircunferencia(int radio) {
		return Math.PI * Math.pow(radio, 2);
	}

	public static double calcularPerimetroCircunferencia(int radio) {
		return 2 * Math.PI * radio;
	}
}
