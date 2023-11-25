import java.util.Scanner;

public class InputConsoleToOrder extends Order_2 implements FromConsole{

    private final Scanner scanner = new Scanner(System.in);

    public InputConsoleToOrder() {
        this.clientName = promptConsole("Имя клиента: ");
        this.product = promptConsole("Продукт: ");
        this.qnt = Integer.parseInt(promptConsole("Кол-во: "));
        this.price = Integer.parseInt(promptConsole("Цена: "));

    }

    @Override
    public String promptConsole(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
