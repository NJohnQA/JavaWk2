package ArrayListMain;

import java.util.ArrayList;

public class FavouriteNumbers {
	public static void main(String[] args){
        ArrayList<Integer> faveNums = new ArrayList<>();

        faveNums.add(10);
        faveNums.add(1355417);
        faveNums.add(63);

        for (int i : faveNums){
            System.out.println(i);
        }
    }
}
