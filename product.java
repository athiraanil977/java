class Product
{
    int pcode;
    String pname;
    double price;
Product(int pcode,String pname,double price)
{
    this.pcode = pcode;
    this.pname = pname;
    this.price = price;
}
}
public class Lowestprice
{
public static void main(String[]args)
{
    Product p1 = new Product(101,"pen",10);
    Product p2 = new Product(102,"notebook",40);
    Product p3 = new Product(103,"pencil",5);
    if(p2.price < lowest.price){
        lowest = p2;
    }
    if(p3.price < lowest.price){
        lowest = p3;
    }
    System.out.println("product with lowest price:");
    System.out.println("product code:" + lowest.pcode);
    System.out.println("product name:" + lowest.pname);
    System.out.println("price:" + lowest.price);
}
}

