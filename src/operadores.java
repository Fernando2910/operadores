import java.text.DecimalFormat;

public class operadores {

    public int suma (int op1, int op2){
        int resultado=0;

        resultado = op1 + op2;
        System.out.println("El resultado de la suma es:" + resultado);
        return resultado;
    }
    public int resta (int op1, int op2){
        int resultado=0;

        resultado = op1 - op2;
        System.out.println("El resultado de la resta es:" + resultado);
        return resultado;
    }
    public int multiplicacion (int op1, int op2){
        int resultado=0;

        resultado = op1 * op2;
        System.out.println("El resultado de la multiplicacion es:" + resultado);
        return resultado;
    }
    public float division (float op1, float op2){
        DecimalFormat formato1 = new DecimalFormat("#.00");
        float resultado=0;

        resultado = op1 / op2;
        System.out.println("El resultado de la division es:" + formato1.format(resultado));
        return resultado;
    }
    public int modulo (int op1, int op2){
        int resultado=0;

        resultado = op1 % op2;
        System.out.println("El resultado de la modulo es:" + resultado);
        return resultado;
    }
}
