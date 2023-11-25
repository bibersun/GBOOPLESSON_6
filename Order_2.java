public class Order_2 {
    protected String clientName;
    protected String product;
    protected int qnt;
    protected int price;


    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

//    public void setClientName(String clientName) {
//        this.clientName = clientName;
//    }
//
//    public void setProduct(String product) {
//        this.product = product;
//    }
//
//    public void setQnt(int qnt) {
//        this.qnt = qnt;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }

    public int getPrice() {
        return price;
    }

    public Order_2() {
    }

    public Order_2(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }
}


