package mid1.enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            value.print();
        }
    }
}
