package Modelos;

public class LaptopProfesional extends laptop {

    public LaptopProfesional(String marcaYModelo, int añoFabricacion, String procesador, int tamañoPantalla) {
        super(marcaYModelo, añoFabricacion, procesador, tamañoPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Profesional");
    }
}