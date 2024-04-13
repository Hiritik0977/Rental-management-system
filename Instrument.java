
/**
 * Write a description of class Instrument here.
 *
 * @author (Hiritik sonar)
 * @version (a version number or a date)
 */

public class Instrument {
    //instance variables
    private static int Instrument_Id; // static
    private String instrumentName;
    private String customerName;
    private String customerMobileNumber;
    private int PAN;

    // constructor
    Instrument(String instrumentName) {
        this.instrumentName = instrumentName;
        Instrument_Id++; // addition by one
        this.customerName = "";
        this.customerMobileNumber = "";
        this.PAN = 0;
    }

    // setter method 
    public void setInstrument_Id(int Instrument_Id) {
        Instrument.Instrument_Id = Instrument_Id;

    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerMobileNumber(String customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public void setPan(int PAN) {
        this.PAN = PAN;
    }

    // getter method 
    public int getInstrument_Id() {
        return Instrument_Id;
    }

    public String getInstrumentName() {
        return this.instrumentName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public int getPan() {
        return PAN;
    }

    void Display() {
        System.out.println("Details are as follow: ");

        if (this.customerName != "" && this.customerMobileNumber != "" && this.PAN != 0) {
            System.out.println("Instrument ID : " + this.getInstrument_Id() + "\n" + "Instrument Name : "
            + this.getInstrumentName() + "\n" + "Customer Name : " + this.getCustomerName()
            + "\n" + "Customer Mobile number : " + this.getCustomerMobileNumber() + "\n"
            + "Customer PAN No : " + this.getPan());
        } else {
            System.out.println("Instrument ID : " + this.getInstrument_Id() + "\n" + "Instrument Name : "
            + this.getInstrumentName());
        }
    }
}