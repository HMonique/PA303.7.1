import java.util.Arrays;

public class Colors {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "yellow"};
        String[] newcolors = colors.clone();

        System.out.println("colors: " + Arrays.toString(colors));
        System.out.println("newcolors: " + Arrays.toString(newcolors));
    }
}
