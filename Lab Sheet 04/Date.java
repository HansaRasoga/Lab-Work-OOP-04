public class Date 
{
    private int day;
    private int month;
    private int year;

    public Date()
    {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    

    public void displayDate()
    {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

    public static void main(String [] args)
    {
        Date date=new Date(15, 8, 2023);
        date.displayDate();
    }
}
