import java.util.Scanner;

public class CountingDecimalNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        String entrada = scanner.nextLine().trim(); // Leemos la entrada como una cadena

        // Eliminamos el signo negativo si lo hay
        if (entrada.startsWith("-")) {
            entrada = entrada.substring(1);
        }

        // Eliminamos el punto decimal si lo hay
        if (entrada.contains(".")) {
            entrada = entrada.replace(".", "");
        }

        // Contamos la longitud de la cadena para obtener el número de dígitos
        int cantidadDigitos = entrada.length();

        // Consideramos el caso especial cuando la entrada es "0"
        if (entrada.equals("0")) {
            cantidadDigitos = 1;
        }

        System.out.println("El número tiene " + cantidadDigitos + " dígitos.");



    }
}
