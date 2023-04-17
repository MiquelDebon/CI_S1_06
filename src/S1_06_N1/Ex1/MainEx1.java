package S1_06_N1.Ex1;

public class MainEx1 {
    public static void main(String[] args) {

        //No entiendo lo que pide el anunciado :)
        NoGenericMethods<String> strings = new NoGenericMethods<>("nombre1", "nombre2", "nombre3");
        NoGenericMethods<String> strings2 = new NoGenericMethods<>("nombre2", "nombre1", "nombre3");

        System.out.println(strings);
    }
}
