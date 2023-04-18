package S1_06_N3;

public class Generica{

    public static <T extends Telefon> void method1 (T telefon){
        telefon.trucar();
        //telefon.ferForots ->No es posible
    }


    public static <S extends Smartphone> void method2 (S smartphone){
        smartphone.trucar();
        smartphone.ferFotos();
    }

}
