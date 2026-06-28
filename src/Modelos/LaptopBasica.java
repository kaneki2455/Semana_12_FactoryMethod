package Modelos;

public class LaptopBasica extends laptop {

    public LaptopBasica(String marcaYModelo, int añoFabricacion, String procesador, int tamañoPantalla) {
        super(marcaYModelo, añoFabricacion, procesador, tamañoPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Basica");
    }
}