import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        boolean result;

        String s= "1234";
        char[] str = s.toCharArray();

        for (int i = 0; i < str.length; i++) {

            if (str[i] >= '0' && str[i] <= '9') {
                result = true;
            } else {
                result = false;
            }
            System.out.println(result);
        }

    }
}
