import java.util.ArrayList;
import java.util.Scanner;
public class AddingNewAddress {
    public ArrayList<AddressBook> ContactsBook = new ArrayList<>();
    public void AddContacts()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Name");
        String first = scan.nextLine();
        System.out.println("Enter Last Name");
        String last = scan.nextLine();
        System.out.println("Enter Address");
        String address = scan.nextLine();
        System.out.println("Enter City");
        String city = scan.nextLine();
        System.out.println("Enter State");
        String state = scan.nextLine();
        System.out.println("Enter Zip Code");
        int zip = scan.nextInt();
        System.out.println("Enter Phone Number");
        long mobileNo = scan.nextLong();
        System.out.println("Enter E-mail");
        String email = scan.next();
        AddressBook AddressBook = new AddressBook(first, last, address, city, state,  email,mobileNo, zip);
        ContactsBook.add(AddressBook);
        System.out.println("Contact added Successfully");
    }
    public void PersonData()
    {
        System.out.println("\n Address Book details of Person: ");
        for (AddressBook person : ContactsBook)
        {
            System.out.println(person.toString());
        }
    }
    public static void main(String[] args)
    {
        AddingNewAddress address = new AddingNewAddress();
        address.AddContacts();;
        address.PersonData();
    }
}
