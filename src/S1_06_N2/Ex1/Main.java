package S1_06_N2.Ex1;

import S1_06_N1.Ex2.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Miquel", "Debon", 27);

        GenericMethods.printConsole(persona, "Miquel", 23);
        GenericMethods.printConsole(23, "Miquel", persona);
    }
}
