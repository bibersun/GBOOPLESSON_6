public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     *
     * @param args
     */
    public static void main(String[] args) {

        OrderOutputJSON orderOutputJSON = new OrderOutputJSON("order.json");

        orderOutputJSON.saveToJson();

    }

}
