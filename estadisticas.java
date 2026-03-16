public class estadisticas {

    public static double sumarNotas(double[] notas, int i) {
        if (i == notas.length) {
            return 0;
        }
        return notas[i] + sumarNotas(notas, i + 1);
    }

    public static double calcularPromedio(double[] notas) {
        double suma = sumarNotas(notas, 0);
        return suma / notas.length;
    }

    public static String obtenerEstado(double nota) {
        if (nota >= 6.0) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public static double notaMasAlta(double[] notas) {
        double max = notas[0];

        for (double n : notas) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }

    public static double notaMasBaja(double[] notas) {
        double min = notas[0];

        for (double n : notas) {
            if (n < min) {
                min = n;
            }
        }

        return min;
    }

    public static int contarAprobados(double[] notas) {

        int contador = 0;

        for (double n : notas) {
            if (n >= 6.0) {
                contador++;
            }
        }

        return contador;
    }
}