import java.util.ArrayList;
//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        ArrayList <Integer>  numberList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numberList.add(i);
        }
        // Ejercicio 2
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Habia");
        stringList.add("una");
        stringList.add("vestruz");
        // Ejercicio 3
        System.out.print(numberList);
        // Ejercicio 4
        System.out.print(numberList.size());
        // Ejercicio 5
        stringList.remove(1);
        System.out.print(stringList);
        // Ejercicio 6
        System.out.print(numberList.isEmpty());
        // Ejercicio 7
        //Arrays.sort(numberList);
    }
}
