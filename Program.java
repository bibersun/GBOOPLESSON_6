public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     *
     * @param args
     */
    public static void main(String[] args) {
        //строка ниже в данной реализации бессмысленна
        Order_2 order = new Order_2("", "", 0, 0);

        order = new InputConsoleToOrder();

        OrderOutputJSON orderOutputJSON = new OrderOutputJSON(order,"order.json");

        orderOutputJSON.saveToJson();


    }

}
