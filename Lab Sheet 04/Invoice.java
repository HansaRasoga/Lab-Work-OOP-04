public class Invoice 
{
    private String  partNumber;
    private String partDescription;
    private int quantityOfTheItem;
    private double pricePerItem;

    public Invoice() 
    {
        this.partNumber = "";
        this.partDescription = "";
        this.quantityOfTheItem = 0;
        this.pricePerItem = 0.0;
    }

    public Invoice(String partNumber)
    {
        this.partNumber = partNumber;
        this.partDescription = "";
        this.quantityOfTheItem = 0;
        this.pricePerItem = 0.0;
    }

    public Invoice(String partNumber, String partDescription)
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityOfTheItem = 0;
        this.pricePerItem = 0.0;
    }

    public Invoice(String partNumber, String partDescription, int quantityOfTheItem, double pricePerItem)
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityOfTheItem = quantityOfTheItem;
        this.pricePerItem = pricePerItem;
    }

    public Invoice(Invoice Invoice2)
    {
        this.partNumber = Invoice2.partNumber;
        this.partDescription = Invoice2.partDescription;
        this.quantityOfTheItem = Invoice2.quantityOfTheItem;
        this.pricePerItem = Invoice2.pricePerItem;
    }
}
