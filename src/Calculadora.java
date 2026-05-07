public class Calculadora {
    // Funciones de la calculadora



    public static int suma(int a, int b) {



        return a + b;



    }



    public static int resta(int a, int b) {



        return a - b;



    }



    public static int multiplicacion(int a, int b) {



        return a * b;



    }



    public static double division(int a, int b) {



        if (b == 0) {



            System.out.println("Error: no se puede dividir entre 0");



            return 0;



        }



        return (double) a / b;



    }



    // Método principal



    public static void main(String[] args) {



        // 1. Suma de números positivos



        int a = 10;



        int b = 5;



        System.out.println("1. Suma positivos: " + suma(a, b));



        // 2. Suma de un positivo y un negativo



        a = 10;



        b = -5;



        System.out.println("2. Suma positivo y negativo: " + suma(a, b));



        // 3. Resta de números positivos



        a = 20;



        b = 8;



        System.out.println("3. Resta positivos: " + resta(a, b));



        // 4. Resta de un negativo y un positivo



        a = -10;



        b = 5;



        System.out.println("4. Resta negativo y positivo: " + resta(a, b));



        // 5. Multiplicación de números positivos



        a = 4;



        b = 6;



        System.out.println("5. Multiplicación positivos: " + multiplicacion(a, b));



        // 6. Multiplicación de un positivo y un negativo



        a = 7;



        b = -3;



        System.out.println("6. Multiplicación positivo y negativo: " + multiplicacion(a, b));



        // 7. División de números positivos



        a = 20;



        b = 4;



        System.out.println("7. División positivos: " + division(a, b));



    }



}

