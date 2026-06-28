package Fabrica;

import Modelos.laptop;
import Modelos.LaptopBasica;
import Modelos.LaptopGamer;
import Modelos.LaptopProfesional;

public class FabricaLaptop {

    public laptop crearLaptop(String tipo) {
        switch (tipo.toLowerCase()) {
            case "gamer":
                return new LaptopGamer("Macbook air", 2017, "Silicon M1", 13);
            case "basica":
                return new LaptopBasica("Dell Latitude", 2020, "intel core i7", 14);
            case "profesional":
                return new LaptopProfesional("Macbook Pro", 2022, "Apple Silicon M2", 16);
            default:
                return null;
        }
    }
}