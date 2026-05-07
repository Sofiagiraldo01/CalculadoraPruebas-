public class PruebasFallidas {
    public static double division(int a, int b) {



        return a / b;



    }



    public static void main(String[] args) {



        // 1. División entre cero



        try {



            System.out.println("1. División entre cero: " + division(10, 0));



        } catch (Exception e) {



            System.out.println("1. Error: División entre cero");



        }



        // 2. Números demasiado grandes



        int a = 2147483647; // máximo valor int



        int b = 1;



        System.out.println("2. Overflow suma: " + (a + b));



        // 3. Resultado inesperado por división entera



        System.out.println("3. División entera: " + (5 / 2));



        // 4. Multiplicación con overflow



        int x = 1000000;



        int y = 1000000;



        System.out.println("4. Multiplicación overflow: " + (x * y));



        // 5. Entrada inválida (simulada)



        String texto = "hola";



        try {



            int numero = Integer.parseInt(texto);



            System.out.println(numero);



        } catch (Exception e) {



            System.out.println("5. Error: Entrada no numérica");



        }



        // 6. Operación con valores nulos (simulado con Integer)



        Integer n1 = null;



        Integer n2 = 5;



        try {



            System.out.println("6. Suma null: " + (n1 + n2));



        } catch (Exception e) {



            System.out.println("6. Error: valor nulo");



        }



    }
}
