package mid1.nested.inner;

import mid1.nested.inner.InnerOuter.Inner;

public class InnerOuterMain {

    public static void main(String[] args) {

        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();

        inner.print();
        System.out.println("innerClass : " + inner.getClass());


    }

}
