import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x =0,y = 0;

        System.out.println("Bienvenido");
        System.out.println();
        System.out.print("Por favor ingresa un valor entero: ");
        x = entrada.nextInt();
        System.out.print("Por favor ingresa otro valor entero:");
        y = entrada.nextInt();

        System.out.println();


        operadores operadores = new operadores();
        operadores.suma(x,y);
        operadores.resta(x,y);
        operadores.multiplicacion(x,y);
        operadores.division(x,y);
        operadores.modulo(x,y);
    }
}