import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int operador1 =0,operador2 = 0;

        System.out.println("Bienvenido");
        System.out.println();
        System.out.print("Por favor ingresa un valor entero: ");
        operador1 = entrada.nextInt();
        System.out.print("Por favor ingresa otro valor entero:");
        operador2 = entrada.nextInt();

        operadores operadores = new operadores();
        operadores.suma(operador1,operador2);
        operadores.resta(operador1,operador2);
        operadores.multiplicacion(operador1,operador2);
        operadores.division(operador1,operador2);
        operadores.modulo(operador1,operador2);

    }
}