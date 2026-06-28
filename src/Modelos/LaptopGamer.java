package Modelos;

public class LaptopGamer extends laptop {

    public LaptopGamer(String marcaYModelo, int añoFabricacion, String procesador, int tamañoPantalla) {
        super(marcaYModelo, añoFabricacion, procesador, tamañoPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop para Gamer");
    }
}