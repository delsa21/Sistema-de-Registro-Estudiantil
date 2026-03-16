
Reto Intermedio Java: "Sistema de Registro Estudiantil"
Contexto
Eres el desarrollador de un pequeño sistema para que un profesor registre y analice el rendimiento de su grupo. El sistema debe funcionar en consola y aplicar todos los conceptos vistos hasta la Semana 5.

Parte 1 – Fundamentos (Semanas 1 y 2)
Crea un menú principal usando switch y un bucle while que no termine hasta que el usuario elija "Salir":

╔══════════════════════════════════╗
║     SISTEMA ESTUDIANTIL v1.0     ║
╠══════════════════════════════════╣
║  1. Registrar estudiantes        ║
║  2. Ver calificaciones           ║
║  3. Ver estadísticas             ║
║  4. Buscar estudiante            ║
║  5. Salir                        ║
╚══════════════════════════════════╝
Requisitos:

Variables con tipos correctos: String nombre, int edad, double nota
Validar con if/else que la nota esté entre 0.0 y 10.0
Usar for para mostrar la lista completa de estudiantes
Parte 2 – Métodos (Semana 3)
Crea los siguientes métodos fuera del main, cada uno con su propósito claro:

Método	Descripción
double calcularPromedio(double[] notas)	Retorna el promedio del grupo
String obtenerEstado(double nota)	Retorna "Aprobado" o "Reprobado"
double notaMasAlta(double[] notas)	Retorna la nota máxima
double notaMasBaja(double[] notas)	Retorna la nota mínima
int contarAprobados(double[] notas)	Cuenta cuántos aprobaron (nota ≥ 6.0)
double sumarNotas(double[] notas, int i)	⭐ Recursivo — suma las notas una por una
💡 El método recursivo sumarNotas debe ser usado internamente por calcularPromedio.

Parte 3 – Arreglos y Colecciones
Usar un arreglo double[] notas para almacenar las calificaciones
Usar un ArrayList<String> para guardar los nombres de los estudiantes
Usar un HashMap<String, Double> para asociar cada nombre con su nota
Al buscar un estudiante (opción 4 del menú), buscarlo en el HashMap y mostrar su nota y estado
Parte 4 – POO 
Modela el sistema con las siguientes clases:

Persona
  └── Estudiante
        ├── EstudianteRegular
        └── EstudianteBeca
Persona (clase base)

java
private String nombre;
private int edad;
// Constructor, getters y setters
Estudiante extiende Persona

java
private double nota;
public String obtenerEstado() { ... }  // "Aprobado" o "Reprobado"
EstudianteRegular y EstudianteBeca sobreescriben:

java
public String obtenerTipo() // "Regular" o "Becado"
Sobrecarga obligatoria en Estudiante:

java
void mostrarInfo()                        // muestra nombre y nota
void mostrarInfo(boolean mostrarEstado)  // muestra también Aprobado/Reprobado
