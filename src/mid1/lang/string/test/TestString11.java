package mid1.lang.string.test;

public class TestString11 {

    public static void main(String[] args) {

        String str = "Hello Java";
        StringBuilder sb = new StringBuilder();
        String reversed = sb.append(str).reverse().toString();
        System.out.println(reversed);
    }

}
