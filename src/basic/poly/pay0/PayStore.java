package basic.poly.pay0;

public abstract class PayStore {

    public static Pay findPay(String option) {
        if (option.equalsIgnoreCase("kakao")) {
            return new KakaoPay();
        } else if(option.equalsIgnoreCase("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
