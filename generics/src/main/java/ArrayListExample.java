import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList();  // So we add Type in <>

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("apple"); //No compile time error. It is complaining at RunTime

        printDouble(items);


    }

    private static void printDouble(ArrayList<Integer> items) {
        for(Integer i : items){  // Instead of Object we use Integer
            System.out.print(i * 2 + " ");  //Needs Casting manually ((Integer)i * 2 + " ")
        }
    }
}
