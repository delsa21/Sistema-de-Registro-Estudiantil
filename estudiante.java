public class estudiante extends persona {

    private double nota;

    public estudiante(String nombre, int edad, double nota) {
        super(nombre, edad);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String obtenerEstado() {
        if (nota >= 6.0) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre() + " Nota: " + nota);
    }

    public void mostrarInfo(boolean mostrarEstado) {
        if (mostrarEstado) {
            System.out.println("Nombre: " + getNombre() +
                    " Nota: " + nota +
                    " Estado: " + obtenerEstado());
        } else {
            mostrarInfo();
        }
    }

    public String obtenerTipo() {
        return "Estudiante";
    }
}