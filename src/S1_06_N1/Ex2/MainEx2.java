package S1_06_N1.Ex2;

public class MainEx2 {
    public static void main(String[] args) {
        Persona persona = new Persona("Miquel", "Debon", 27);
        String nom = "Eduard";
        int numero = 3;

        GenericMethods.printConsole(persona,nom, numero);
        GenericMethods.printConsole(numero, persona, nom);
        GenericMethods.printConsole(nom,numero, persona);

    }
}
