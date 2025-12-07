package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {


        ProductOrder order1 = new ProductOrder("두부", 2000, 2);
        ProductOrder order2 = new ProductOrder("김치", 5000, 1);
        ProductOrder order3 = new ProductOrder("콜라", 1500, 2);

        ProductOrder[] productOrders = {order1, order2, order3};

        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " +productOrder.productName + ", 가격: " +productOrder.price + ", 수량: " +productOrder.quantity);
        }

        System.out.println("총 결제 금액 : " + allOrderPrice(productOrders));
    }

    private static int allOrderPrice(ProductOrder[] productOrders) {
        int totalPrice = 0;

        for (ProductOrder productOrder : productOrders) {
            totalPrice += productOrder.price * productOrder.quantity;
        }

        return totalPrice;
    }
}
