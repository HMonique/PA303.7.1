

public class Integer {
    public static void main(String[] args) {
        int[] thing = {12, 5, 42, 53, 9};

        for (int j = 0; j < thing.length; j++) {

            thing[j] = thing[j] * 2;

            System.out.println(thing[j]);
        }
    }
}

