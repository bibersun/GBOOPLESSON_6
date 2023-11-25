import java.util.Scanner;

public class InputConsoleToOrder extends Order_2 implements FromConsole{

    private final Scanner scanner = new Scanner(System.in);

    public InputConsoleToOrder() {
        this.setClientName(promptConsole("Имя клиента: "));
        this.setProduct(promptConsole("Продукт: "));
        this.setQnt(Integer.parseInt(promptConsole("Кол-во: ")));
        this.setPrice(Integer.parseInt(promptConsole("Цена: ")));

    }

    @Override
    public String promptConsole(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
