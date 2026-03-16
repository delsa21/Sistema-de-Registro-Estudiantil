import java.util.*;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<estudiante> estudiantes = new ArrayList<>();
        double[] notas = new double[100];
        int contador = 0;

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n╔══════════════════════════════════╗");
            System.out.println("║     SISTEMA ESTUDIANTIL v1.0     ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println("║  1. Registrar estudiantes        ║");
            System.out.println("║  2. Ver calificaciones           ║");
            System.out.println("║  3. Ver estadísticas             ║");
            System.out.println("║  4. Buscar estudiante            ║");
            System.out.println("║  5. Salir                        ║");
            System.out.println("╚══════════════════════════════════╝");

            System.out.print("Seleccione una opción: ");
            try {
                opcion = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida, ingrese un número del 1 al 5.");
                sc.next(); // consume invalid input
                opcion = 0; // reset to continue loop
                continue;
            }

            switch (opcion) {

                case 1:

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    int edad;
                    int tipo;

                    System.out.print("Edad: ");
                    try {
                        edad = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Edad inválida, ingrese un número.");
                        sc.next();
                        break;
                    }

                    System.out.print("Tipo (1. Regular, 2. Beca): ");
                    try {
                        tipo = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Tipo inválido, ingrese 1 o 2.");
                        sc.next();
                        break;
                    }

                    System.out.print("Nota: ");

                    if (!sc.hasNextDouble()) {
                        System.out.println("Error: debes ingresar un número.");
                        sc.next();
                        break;
                    }

                    double nota = sc.nextDouble();
                    sc.nextLine();

                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota inválida");
                        break;
                    }

                    estudiante nuevoEstudiante;
                    if (tipo == 1) {
                        nuevoEstudiante = new estudiante_regular(nombre, edad, nota);
                    } else if (tipo == 2) {
                        nuevoEstudiante = new estudiante_beca(nombre, edad, nota);
                    } else {
                        System.out.println("Tipo inválido");
                        break;
                    }

                    estudiantes.add(nuevoEstudiante);
                    notas[contador] = nota;
                    contador++;

                    System.out.println("Estudiante registrado");

                    break;

                case 2:

                    System.out.println("\nLista de estudiantes:");

                    for (estudiante e : estudiantes) {
                        e.mostrarInfo(true);
                    }

                    break;

                case 3:

                    if (contador == 0) {
                        System.out.println("No hay datos");
                        break;
                    }

                    double[] notasActuales = Arrays.copyOf(notas, contador);

                    System.out.println("Promedio: " +
                            estadisticas.calcularPromedio(notasActuales));

                    System.out.println("Nota más alta: " +
                            estadisticas.notaMasAlta(notasActuales));

                    System.out.println("Nota más baja: " +
                            estadisticas.notaMasBaja(notasActuales));

                    System.out.println("Aprobados: " +
                            estadisticas.contarAprobados(notasActuales));

                    break;

                case 4:

                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();

                    boolean encontrado = false;
                    for (estudiante e : estudiantes) {
                        if (e.getNombre().equals(buscar)) {
                            System.out.println("Nota: " + e.getNota());
                            System.out.println("Estado: " + e.obtenerEstado());
                            System.out.println("Tipo: " + e.obtenerTipo());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Estudiante no encontrado");
                    }

                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }

        sc.close();
    }
}