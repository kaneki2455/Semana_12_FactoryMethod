package Ejecutable;

import Fabrica.FabricaLaptop;
import Modelos.laptop;

public class Main {

    public static void main(String[] args) {

        System.out.println("BIENVENIDOS A LA FABRICA DE LAPTOPS\n");

        FabricaLaptop fabrica = new FabricaLaptop();

        laptop gamer = fabrica.crearLaptop("gamer");
        gamer.ejecutarPrueba();
        System.out.println(gamer.toString());

        System.out.println();

        laptop basica = fabrica.crearLaptop("basica");
        basica.ejecutarPrueba();
        System.out.println(basica.toString());

        System.out.println();

        laptop profesional = fabrica.crearLaptop("profesional");
        profesional.ejecutarPrueba();
        System.out.println(profesional.toString());
    }
}