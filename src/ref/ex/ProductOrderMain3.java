package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int orderCount = 0;

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        orderCount = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[orderCount];

        for (int i = 0; i < orderCount; i++) {
            ProductOrder productOrder = new ProductOrder();

            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            productOrder.productName = scanner.nextLine();

            System.out.print("가격: ");
            productOrder.price = scanner.nextInt();

            System.out.print("수량: ");
            productOrder.quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = productOrder;
        }
        printOrders(orders);
        System.out.println("총 결제 금액: " + getTotal(orders));

    }
    static void printOrders(ProductOrder[] orders) {

        for (ProductOrder productOrder : orders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
        }
    }

    static int getTotal(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder productOrder : orders) {
            total += productOrder.price * productOrder.quantity;

        }
        return total;
    }
}
