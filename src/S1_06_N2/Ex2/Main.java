package S1_06_N2.Ex2;

import S1_06_N1.Ex2.Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Miquel");
        arrayList.add("Marta");
        arrayList.add("Jordi");

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Julia");
        hashMap.put(1, "Silvia");
        hashMap.put(3, "Marta");

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(0);
        hashSet.add(7);

        GenericMethods.printConsole(arrayList, hashMap, hashSet);
    }
}
