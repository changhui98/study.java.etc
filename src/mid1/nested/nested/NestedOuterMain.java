package mid1.nested.nested;

import mid1.nested.nested.NestedOuter.Nested;

public class NestedOuterMain {

    public static void main(String[] args) {

        NestedOuter outer = new NestedOuter();
        Nested inner = new Nested();
        inner.print();
        System.out.println(inner.getClass());
    }

}
