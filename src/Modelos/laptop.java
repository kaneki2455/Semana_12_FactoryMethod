package Modelos;

public abstract class laptop {

    private String marcaYModelo;
    private int añoFabricacion;
    private String procesador;
    private int tamañoPantalla;

    public laptop(String marcaYModelo, int añoFabricacion, String procesador, int tamañoPantalla) {
        this.marcaYModelo = marcaYModelo;
        this.añoFabricacion = añoFabricacion;
        this.procesador = procesador;
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getMarcaYModelo() {
        return marcaYModelo;
    }

    public abstract void ejecutarPrueba();

    @Override
    public String toString() {
        return "Marca y Modelo: " + marcaYModelo +
                "\nAño de Fabricacion: " + añoFabricacion +
                "\nProcesador: " + procesador +
                "\nTamaño de la Pantalla: " + tamañoPantalla;
    }
}