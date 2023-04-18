package S1_06_N2.Ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GenericMethods {
    //Standard Class, Generic Method
    static public <T,K,V,E> void printConsole(ArrayList<T> t1, HashMap<K,V> t2, HashSet<E> t3){
        System.out.println(t1 + " " + t2 + " " + t3);
    }
}
