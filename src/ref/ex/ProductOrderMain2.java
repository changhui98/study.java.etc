package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {

        ProductOrder order1 = new ProductOrder("두부", 2000, 2);
        ProductOrder order2 = new ProductOrder("김치", 5000, 1);
        ProductOrder order3 = new ProductOrder("콜라", 1500, 2);

        ProductOrder[] productOrders = {order1, order2, order3};

        printOrders(productOrders);

        System.out.println("총 결제 금액: " + getTotalAmount(productOrders));
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder productOrder : orders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격 : " + productOrder.price + ", 수량: " + productOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int result = 0;

        for (ProductOrder order : orders) {
            result += order.price * order.quantity;
        }
        return result;
    }
}
