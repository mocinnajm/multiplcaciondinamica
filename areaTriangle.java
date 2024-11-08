import java.util.Scanner;

public class areaTriangle {
    public static void main(String[] args) {
        System.out.println("Introduce el base de la triangulo¿");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Introduce el alto de la triangulo¿");
        int alto = sc.nextInt();
        int area = (base * alto) / 2;
        System.out.println("La area del triangulo es " + area);
             
        
    }
    
}
