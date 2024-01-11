import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del triangulo y rectángulo: ");
        int base = scanner.nextInt();

        System.out.println("Ingrese la altura del triangulo, el cilindro y el rectángulo: ");
        int altura = scanner.nextInt();
        
        System.out.println("Ingrese el radio de la circunferencia y el cilindro: ");
		int radio = scanner.nextInt();

        double area = calcularArea(base, altura);
        double areaCircunferencia = calcularAreaCircunferencia(radio);
		double perimetroCircunferencia = calcularAreaCircunferencia(radio);


        System.out.println("El area del triangulo es: " + area);
        System.out.println("El area de la circunferencia es: " + areaCircunferencia);
		System.out.println("El perimetro de la circunferencia es: " + perimetroCircunferencia);
		System.out.println("El area del cilindro es: " + areaCilindro(radio, altura));
		System.out.println("El area del rectangulo es: "  +calcularAreaRectangulo(base,altura));
        
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
	
	public static double areaCilindro(double radio, double altura) {
        double areaBase = Math.PI * Math.pow(radio, 2); 
        double areaLateral = 2 * Math.PI * radio * altura; 
        return 2 * areaBase + areaLateral;
    }
	
	public static double calcularAreaRectangulo(double base, double altura) {
		return base * altura;
	}

}
