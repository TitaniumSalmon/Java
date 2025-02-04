import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> cars = new ArrayList<Integer>();
        cars.add(6);
        cars.add(5);
        cars.add(7);
        cars.add(8);
        int[] carArray = new int[4];
        for (int i : cars)
            System.out.println(i);
    }
}