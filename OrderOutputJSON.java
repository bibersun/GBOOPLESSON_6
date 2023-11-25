import java.io.FileWriter;
import java.io.IOException;

public class OrderOutputJSON implements ToJSON{

    private final String fileName;
    private final Order_2 order_2;

    public OrderOutputJSON(String fileName) {
        order_2 = new InputConsoleToOrder();
        this.fileName = fileName;
    }

    @Override
    public void saveToJson() {

        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ this.order_2.getClientName() + "\",\n");
            writer.write("\"product\":\""+ this.order_2.getProduct()+"\",\n");
            writer.write("\"qnt\":"+ this.order_2.getQnt()+",\n");
            writer.write("\"price\":"+this.order_2.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
