public class estudiante_regular extends estudiante {

    public estudiante_regular(String nombre, int edad, double nota) {
        super(nombre, edad, nota);
    }

    @Override
    public String obtenerTipo() {
        return "Regular";
    }
}