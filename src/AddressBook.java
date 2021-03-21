public class AddressBook {

    String FirstName;
    String LastName;
    String Address;
    String City;
    String State;
    String Email;
    long MobileNo;
    int Zip;


    public AddressBook(String FirstName, String LastName, String Address, String City, String State, String Email, long MobileNo, int Zip) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.City = City;
        this.State = State;
        this.Email = Email;
        this.MobileNo = MobileNo;
        this.Zip = Zip;

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public long getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(long MobileNo) {
        this.MobileNo = MobileNo;
    }

    public int getZip() {
        return Zip;
    }

    public void setZip(int Zip) {
        this.Zip = Zip;
    }

    public String toString() {
        return "ADDRESSBOOK [FIRSTNAME=" + FirstName + ", LASTNAME=" + LastName + ", CITY=" + City
                + ", STATE=" + State + ", PINCODE=" + Zip + ", MOBILENO=" + MobileNo + ", EMAIL =" + Email + "]" + "\n";
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
    }
}