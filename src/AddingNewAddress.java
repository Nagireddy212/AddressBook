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
    public void EditPerson()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n enter First name to edit details:");

        String name = scan.next();

        for (AddressBook person : ContactsBook) {
            System.out.println(person.toString());

            if (name.equals(person.FirstName)) {

                System.out.println("\"Select the option to edit: \n"
                        + "1) Mobile no\n"
                        + "2) Email-Id\n"
                        + "3) Address\n"
                        + "4) Quit");
                int numb = scan.nextInt();

                switch (numb) {
                    case 1 : {
                        System.out.println("Enter new Mobile number:");
                        long mobileNo = scan.nextLong();

                        person.setMobileNo(mobileNo);
                        System.out.println("Updated Mobile number: \n");
                        break;
                    }
                    case 2 : {
                        System.out.println("Enter new Email:");
                        String Email = scan.nextLine();

                        person.setEmail(Email);
                        System.out.println("Updated Email is: \n");
                        break;
                    }
                    case 3 : {
                        System.out.println("Enter your city");
                        String City = scan.nextLine();

                        System.out.println("Enter your state");
                        String State = scan.nextLine();

                        System.out.println("Enter your zip code");
                        int Zip = scan.nextInt();

                        person.setCity(City);
                        person.setState(State);
                        person.setZip(Zip);
                        System.out.println("Updated Address is: \n");
                        break;
                    }
                    default : System.out.println("Please enter Correct Number");
                }
            }
            else
                System.out.println("Person do not have details Registered");
        }
    }
    public static void main(String[] args)
    {
        AddingNewAddress address = new AddingNewAddress();
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Add Contact Details");
        System.out.println("2.Edit Contact Details");
        System.out.println("3.Display Contact Details");
        System.out.println("4.Exit");
        int N=0;
        while(N==0) {
            System.out.println("Enter the choice Number:");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    address.AddContacts();
                    ;
                    break;
                case 2:
                    address.PersonData();
                    break;
                case 3:
                    address.EditPerson();
                    break;
                case 4:
                    System.out.println("Exit");
                    N = 1;
                    break;
            }
        }
    }
}
