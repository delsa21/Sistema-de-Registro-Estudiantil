public class estudiante_beca extends estudiante {

    // Constructor
    public estudiante_beca(String nombre, int edad, double nota) {
        super(nombre, edad, nota);
    }

    @Override
    public String obtenerTipo() {
        return "Becado";
    }
}