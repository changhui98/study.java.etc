package mid1.lang.string.test;

public class TestString2 {

    public static void main(String[] args) {

        int sum = 0;

        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        for (String s : arr) {
            System.out.println(s + ": " + s.length());
            sum += s.length();
        }
        System.out.println("sum : " + sum);
    }

}
