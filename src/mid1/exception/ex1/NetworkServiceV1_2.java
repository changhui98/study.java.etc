package mid1.exception.ex1;

public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[Network Fail] code : " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[Network Fail] code : " + sendResult);
            return;
        }

        client.disconnect();
    }

    private static boolean isError(String error) {
        return !error.equalsIgnoreCase("success");
    }

}
