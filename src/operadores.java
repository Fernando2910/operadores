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
    public int division (int op1, int op2){
        int resultado=0;

        resultado = op1 / op2;
        System.out.println("El resultado de la division es:" + resultado);
        return resultado;
    }
    public float modulo (int op1, int op2){
        float resultado=0;

        resultado = op1 % op2;
        System.out.println("El resultado de la modulo es:" + resultado);
        return resultado;
    }
}
