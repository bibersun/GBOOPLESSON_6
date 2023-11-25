import java.io.FileWriter;
import java.io.IOException;

public class OrderOutputJSON extends Order_2 implements ToJSON{

    private final String fileName;


    public OrderOutputJSON(Order_2 order_2, String fileName) {
        super(order_2.clientName,
                order_2.product,
                order_2.qnt,
                order_2.price);
        this.fileName = fileName;

    }

    @Override
    public void saveToJson() {

        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ this.getClientName() + "\",\n");
            writer.write("\"product\":\""+ this.getProduct()+"\",\n");
            writer.write("\"qnt\":"+ this.getQnt()+",\n");
            writer.write("\"price\":"+this.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
