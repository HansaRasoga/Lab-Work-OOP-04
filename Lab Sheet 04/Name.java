import java.util.Scanner; 
public class Name 
{
    private String First_Name;
    private String Middle_Name;
    private String Last_Name;

    public Name()
    {
        this.First_Name = "";
        this.Middle_Name = "";
        this.Last_Name = "";
    }

    public Name(String First_Name)
    {
        this.First_Name = First_Name;
        this.Middle_Name = "";
        this.Last_Name = "";
    }

    public Name(String First_Name, String Middle_Name)
    {
        this.First_Name = First_Name;
        this.Middle_Name = Middle_Name;
        this.Last_Name = "";
    }

    public Name(String First_Name, String Middle_Name, String Last_Name)
    {
        this.First_Name = First_Name;
        this.Middle_Name = Middle_Name;
        this.Last_Name = Last_Name;
    }

    public void input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        First_Name = scanner.nextLine();
        System.out.print("Enter Middle Name: ");
        Middle_Name = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        Last_Name = scanner.nextLine();
        // Do not close scanner here to avoid closing System.in
    }

    public String toString()
    {
        return "First Name: " + First_Name + ", Middle Name: " + Middle_Name + ", Last Name: " + Last_Name;
    }

    public void myName() {
        if (First_Name.isEmpty() || Middle_Name.isEmpty() || Last_Name.isEmpty()) {
            System.out.println("Please enter all names first.");
            return;
        }
        // Get first letter of first and middle name
        char firstLetter = First_Name.charAt(0);
        char middleLetter = Middle_Name.charAt(0);

        // Combine initials and last name
        String initials = firstLetter + "." + middleLetter + ".";
        String fullName = initials + " " + Last_Name;

        System.out.println(fullName);
    }

    public static void main(String[] args) 
    {
        Name name = new Name();
        name.input();
        System.out.println(name.toString());
        name.myName();
    }
}
