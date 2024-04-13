
/**
 * Write a description of class SarangiSansar here.
 *
 * @author (Hiritik sonar)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SarangiSansar {

    ArrayList<Instrument> instrumentList = new ArrayList<>();


    JFrame frame;
    JPanel panel1, panel2, subPanel1, subPanel2, subPanel3, subPanel4, subPanel5, subPanel6;
    JLabel Instr_Rent_Add_Name, Instr_Rent_Label, Instr_Sell_Label, CPD_Label, Instr_Rent_Name,
            Customer_Name, Rent_Ph, DateofRent, DateofReturn, NOofDays, Instr_Name_Return, PANRent,
            Instr_Sell_Add_Name, Price, Instr_Sell_Name, Customer_Name_Sell, Customer_Ph_Sell, PANSell,Sell_Date,
            discountPercent;
    JTextField Instr_Rent_Add_NameTF, chargePerDayTF, Instr_Rent_NameTF, Customer_NameTF, Rent_PhTF,
            NOofDaysTF, Instr_Name_ReturnTF, PANRentTF, Instr_Sell_Add_NameTF, PriceTF, Instr_Sell_NameTF,
            Customer_Name_SellTF, Customer_Ph_SellTF, PANSellTF, discountPercentTF;
     JButton addToInstrument, rentHandler, returnHandler, displayRentHandler, clearRentHandler,
            addToSellInstrument, sellHandler, displaySellHandler, clearSellHandler;
     JComboBox Day, month, year, DayR, monthR, yearR, DayS, monthS, yearS;

    public SarangiSansar() {

        // date
        String Days[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
        String years[] = { "2022", "2023", "2024", "2025" };

        // color
        Color c1 = new Color(134,149,164);


        // frame
        frame = new JFrame();
        frame.setTitle("SarangiSansar");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setResizable(false);

        // panel 1 --> Instrument to rent
        panel1 = new JPanel();
        panel1.setBounds(20, 20, 700, 650);
        panel1.setLayout(null);
        panel1.setBackground(c1);
        frame.add(panel1);

        Instr_Rent_Label = new JLabel();
        Instr_Rent_Label.setText("Instrument To Rent");
        Instr_Rent_Label.setBounds(200, 10, 200, 20);
        Instr_Rent_Label.setBackground(Color.black);
        panel1.add(Instr_Rent_Label);

        // sub panel 1 --> add to instrument
        subPanel1 = new JPanel();
        subPanel1.setBounds(10, 40, 480, 130);
        subPanel1.setLayout(null);
        panel1.add(subPanel1);

        Instr_Rent_Add_Name = new JLabel();
        Instr_Rent_Add_Name.setText("Instrument Name: ");
        Instr_Rent_Add_Name.setBounds(10, 15, 150, 30);
        subPanel1.add(Instr_Rent_Add_Name);

        Instr_Rent_Add_NameTF = new JTextField();
        Instr_Rent_Add_NameTF.setBounds(170, 15, 180, 30);
        Instr_Rent_Add_NameTF.setBackground(Color.decode("#cad9cd"));
        subPanel1.add(Instr_Rent_Add_NameTF);

        CPD_Label = new JLabel();
        CPD_Label.setText("Charge per Day: ");
        CPD_Label.setBounds(10, 50, 150, 30);
        subPanel1.add(CPD_Label);

        chargePerDayTF = new JTextField();
        chargePerDayTF.setBounds(170, 50, 180, 30);
        chargePerDayTF.setBackground(Color.decode("#cad9cd"));
        subPanel1.add(chargePerDayTF);

        // add to instrument button
        addToInstrument = new JButton("Add");
        addToInstrument.setBounds(260, 90, 90, 30);
        addToInstrument.setBackground(Color.decode("#0f8581"));
        addToInstrument.setFocusPainted(false);
        addToInstrument.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInstrumentHandler();
            }
        });
        subPanel1.add(addToInstrument);

        // sub panel 2 --> rent the instrument

        subPanel2 = new JPanel();
        subPanel2.setBounds(10, 180, 480, 310);
        subPanel2.setLayout(null);
        panel1.add(subPanel2);

        Instr_Rent_Name = new JLabel();
        Instr_Rent_Name.setText("Instrument Name: ");
        Instr_Rent_Name.setBounds(10, 15, 150, 30);
        subPanel2.add(Instr_Rent_Name);

        Instr_Rent_NameTF = new JTextField();
        Instr_Rent_NameTF.setBounds(170, 15, 180, 30);
        Instr_Rent_NameTF.setBackground(Color.decode("#cad9cd"));
        subPanel2.add(Instr_Rent_NameTF);

        Customer_Name = new JLabel();
        Customer_Name.setText("Customer Name: ");
        Customer_Name.setBounds(10, 50, 150, 30);
        subPanel2.add(Customer_Name);

        Customer_NameTF = new JTextField();
        Customer_NameTF.setBounds(170, 50, 180, 30);
        Customer_NameTF.setBackground(Color.decode("#cad9cd"));
        subPanel2.add(Customer_NameTF);

        Rent_Ph = new JLabel();
        Rent_Ph.setText("Phone no:");
        Rent_Ph.setBounds(10, 85, 150, 30);
        subPanel2.add(Rent_Ph);

        Rent_PhTF = new JTextField();
        Rent_PhTF.setBounds(170, 85, 180, 30);
        Rent_PhTF.setBackground(Color.decode("#cad9cd"));
        subPanel2.add(Rent_PhTF);

        PANRent = new JLabel();
        PANRent.setText("PAN No:");
        PANRent.setBounds(10, 120, 150, 30);
        subPanel2.add(PANRent);

        PANRentTF = new JTextField();
        PANRentTF.setBounds(170, 120, 180, 30);
        PANRentTF.setBackground(Color.decode("#cad9cd"));
        subPanel2.add(PANRentTF);

        DateofRent = new JLabel();
        DateofRent.setText("Date of Rent: ");
        DateofRent.setBounds(10, 150, 150, 30);
        subPanel2.add(DateofRent);

        Day = new JComboBox<>(Days);
        month = new JComboBox<>(months);
        year = new JComboBox<>(years);

        Day.setBounds(170, 155, 50, 20);
        month.setBounds(225, 155, 50, 20);
        year.setBounds(280, 155, 60, 20);

        subPanel2.add(Day);
        subPanel2.add(month);
        subPanel2.add(year);

        DateofReturn = new JLabel();
        DateofReturn.setText("Date of Return: ");
        DateofReturn.setBounds(10, 185, 150, 30);
        subPanel2.add(DateofReturn);

        DayR = new JComboBox<>(Days);
        monthR = new JComboBox<>(months);
        yearR = new JComboBox<>(years);

        DayR.setBounds(170, 190, 50, 20);
        monthR.setBounds(225, 190, 50, 20);
        yearR.setBounds(280, 190, 60, 20);

        subPanel2.add(DayR);
        subPanel2.add(monthR);
        subPanel2.add(yearR);

        NOofDays = new JLabel();
        NOofDays.setText("No of Days: ");
        NOofDays.setBounds(10, 225, 150, 30);
        subPanel2.add(NOofDays);

        NOofDaysTF = new JTextField();
        NOofDaysTF.setBounds(170, 225, 70, 30);
        NOofDaysTF.setBackground(Color.decode("#cad9cd"));
        subPanel2.add(NOofDaysTF);

        // rent handler
        rentHandler = new JButton("Rent");
        rentHandler.setBounds(275, 265, 90, 30);
        rentHandler.setBackground(Color.decode("#0f8581"));
        rentHandler.setFocusPainted(false);
        rentHandler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rentInstrument();
            }
        });
        subPanel2.add(rentHandler);

        // subPanel3 --> return
        subPanel3 = new JPanel();
        subPanel3.setBounds(10, 500, 480, 100);
        subPanel3.setLayout(null);
        panel1.add(subPanel3);

        Instr_Name_Return = new JLabel();
        Instr_Name_Return.setText("Instrument Name: ");
        Instr_Name_Return.setBounds(10, 15, 150, 30);
        subPanel3.add(Instr_Name_Return);

        Instr_Name_ReturnTF = new JTextField();
        Instr_Name_ReturnTF.setBounds(170, 15, 180, 30);
        Instr_Name_ReturnTF.setBackground(Color.decode("#cad9cd"));
        subPanel3.add(Instr_Name_ReturnTF);

        // return handler
        returnHandler = new JButton("Return");
        returnHandler.setBounds(275, 55, 90, 30);
        returnHandler.setBackground(Color.decode("#0f8581"));
        returnHandler.setFocusPainted(false);
        returnHandler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                returnInstrument();
            }
        });
        subPanel3.add(returnHandler);

        // display handler for rent
        displayRentHandler = new JButton("Display");
        displayRentHandler.setBounds(150, 610, 90, 30);
        displayRentHandler.setBackground(Color.decode("#0f8581"));
        displayRentHandler.setFocusPainted(false);
        displayRentHandler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (instrumentList.size() > 0) {
                    for (int i = 0; i < instrumentList.size(); i++) {
                        if (instrumentList.get(i) instanceof InstrumentToRent) {
                            InstrumentToRent obj = (InstrumentToRent) instrumentList.get(i);
                            obj.Display();
                        }
                    }
                } else {
                    System.out
                            .println("There is nothing to display, not a instrument is rented or nothing is in stock");
                }
            }
        });
        panel1.add(displayRentHandler);

        // clear handler for rent
        clearRentHandler = new JButton("Clear");
        clearRentHandler.setBounds(250, 610, 90, 30);
        clearRentHandler.setBackground(Color.decode("#0f8581"));
        clearRentHandler.setFocusPainted(false);
        clearRentHandler.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                clearRent();
            }
        });
        panel1.add(clearRentHandler);

        // panel 2 --> Instrument to sell
        panel2 = new JPanel();
        panel2.setBounds(750, 20, 500, 650);
        panel2.setLayout(null);
        panel2.setBackground(c1);
        frame.add(panel2);

        Instr_Sell_Label = new JLabel();
        Instr_Sell_Label.setText("Instrument To Sell");
        Instr_Sell_Label.setBounds(200, 10, 150, 20);
        panel2.add(Instr_Sell_Label);

        // sub panel 4 --> add to instrument for sell
        subPanel4 = new JPanel();
        subPanel4.setBounds(10, 40, 480, 130);
        subPanel4.setLayout(null);
        panel2.add(subPanel4);

        Instr_Sell_Add_Name = new JLabel();
        Instr_Sell_Add_Name.setText("Instrument Name: ");
        Instr_Sell_Add_Name.setBounds(10, 15, 150, 30);
        subPanel4.add(Instr_Sell_Add_Name);

        Instr_Sell_Add_NameTF = new JTextField();
        Instr_Sell_Add_NameTF.setBounds(170, 15, 180, 30);
        Instr_Sell_Add_NameTF.setBackground(Color.decode("#cad9cd"));
        subPanel4.add(Instr_Sell_Add_NameTF);

        Price = new JLabel();
        Price.setText("Price: ");
        Price.setBounds(10, 50, 150, 30);
        subPanel4.add(Price);

        PriceTF = new JTextField();
        PriceTF.setBounds(170, 50, 180, 30);
        PriceTF.setBackground(Color.decode("#cad9cd"));
        subPanel4.add(PriceTF);

        // add to instrument for sell button
        addToSellInstrument = new JButton("Add");
        addToSellInstrument.setBounds(260, 90, 90, 30);
        addToSellInstrument.setBackground(Color.decode("#0f8581"));
        addToSellInstrument.setFocusPainted(false);
        addToSellInstrument.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInstrumentForSell();
            }
        });
        subPanel4.add(addToSellInstrument);

        // sub panel 5 --> sell the instrument

        subPanel5 = new JPanel();
        subPanel5.setBounds(10, 180, 480, 270);
        subPanel5.setLayout(null);
        panel2.add(subPanel5);

        Instr_Sell_Name = new JLabel();
        Instr_Sell_Name.setText("Instrument Name: ");
        Instr_Sell_Name.setBounds(10, 15, 150, 30);
        subPanel5.add(Instr_Sell_Name);

        Instr_Sell_NameTF = new JTextField();
        Instr_Sell_NameTF.setBounds(170, 15, 180, 30);
        Instr_Sell_NameTF.setBackground(Color.decode("#cad9cd"));
        subPanel5.add(Instr_Sell_NameTF);

        Customer_Name_Sell = new JLabel();
        Customer_Name_Sell.setText("Customer Name: ");
        Customer_Name_Sell.setBounds(10, 50, 150, 30);
        subPanel5.add(Customer_Name_Sell);

        Customer_Name_SellTF = new JTextField();
        Customer_Name_SellTF.setBounds(170, 50, 180, 30);
        Customer_Name_SellTF.setBackground(Color.decode("#cad9cd"));
        subPanel5.add(Customer_Name_SellTF);

        Customer_Ph_Sell = new JLabel();
        Customer_Ph_Sell.setText("Customer Number:");
        Customer_Ph_Sell.setBounds(10, 85, 150, 30);
        subPanel5.add(Customer_Ph_Sell);

        Customer_Ph_SellTF = new JTextField();
        Customer_Ph_SellTF.setBounds(170, 85, 180, 30);
        Customer_Ph_SellTF.setBackground(Color.decode("#cad9cd"));
        subPanel5.add(Customer_Ph_SellTF);

        PANSell = new JLabel();
        PANSell.setText("PAN No:");
        PANSell.setBounds(10, 120, 150, 30);
        subPanel5.add(PANSell);

        PANSellTF = new JTextField();
        PANSellTF.setBounds(170, 120, 180, 30);
        PANSellTF.setBackground(Color.decode("#cad9cd"));
        subPanel5.add(PANSellTF);

       Sell_Date = new JLabel();
       Sell_Date.setText("Date of Sell: ");
       Sell_Date.setBounds(10, 150, 150, 30);
        subPanel5.add(Sell_Date);

        DayS = new JComboBox<>(Days);
        monthS = new JComboBox<>(months);
        yearS = new JComboBox<>(years);

        DayS.setBounds(170, 155, 50, 20);
        monthS.setBounds(225, 155, 50, 20);
        yearS.setBounds(280, 155, 60, 20);

        subPanel5.add(DayS);
        subPanel5.add(monthS);
        subPanel5.add(yearS);

        discountPercent = new JLabel();
        discountPercent.setText("Discount Percent: ");
        discountPercent.setBounds(10, 185, 150, 30);
        subPanel5.add(discountPercent);

        discountPercentTF = new JTextField();
        discountPercentTF.setBounds(170, 185, 70, 30);
        discountPercentTF.setBackground(Color.decode("#cad9cd"));
        subPanel5.add(discountPercentTF);

        // sell handler
        sellHandler = new JButton("Sell");
        sellHandler.setBounds(275, 225, 90, 30);
        sellHandler.setBackground(Color.decode("#0f8581"));
        sellHandler.setFocusPainted(false);
        sellHandler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sellInstrument();
            }
        });
        subPanel5.add(sellHandler);

        // display handler for sell
        displaySellHandler = new JButton("Display");
        displaySellHandler.setBounds(150, 500, 90, 30);
        displaySellHandler.setBackground(Color.decode("#0f8581"));
        displaySellHandler.setFocusPainted(false);
        displaySellHandler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (instrumentList.size() > 0) {
                    for (int i = 0; i < instrumentList.size(); i++) {
                        if (instrumentList.get(i) instanceof InstrumentToSell) {
                            InstrumentToSell objS = (InstrumentToSell) instrumentList.get(i);
                            objS.Display();
                        }
                    }
                } else {
                    System.out.println("There is nothing to display, not a instrument is sold or nothing is in stock");
                }
            }
        });
        panel2.add(displaySellHandler);

        // clear handler for sell
        clearSellHandler = new JButton("Clear");
        clearSellHandler.setBounds(250, 500, 90, 30);
        clearSellHandler.setBackground(Color.decode("#0f8581"));
        clearSellHandler.setFocusPainted(false);
        clearSellHandler.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearSell();
            }
        });
        panel2.add(clearSellHandler);

        subPanel6 = new JPanel();
        subPanel6.setBounds(10, 500, 140, 140);
        subPanel6.setBackground(c1);
        panel2.add(subPanel6);

        // 2
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SarangiSansar();
    }

    // add to instrument handler-->rent
    public void addInstrumentHandler() {
        String instrumentName = getInstr_Rent_Name();
        int chargePerDay = getChargePerDay();
        boolean isUnique = true;

        // negative
        if (e == 2) {
            e = 1;
            return;
        }

        // valid
        if (x == "invalid") {
            x = " ";
            return;
        }

        if (instrumentName.isEmpty() || chargePerDay == EMPTY) {
            JOptionPane.showMessageDialog(frame, "Empty field! Please fill the field", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (int i = 0; i < instrumentList.size(); i++) {
            if (instrumentList.get(i).getInstrumentName().toLowerCase().equals(instrumentName.toLowerCase())) {
                isUnique = false;
                JOptionPane.showMessageDialog(frame, "A unique instrument name is required", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                break;
            }
        }

        if (isUnique && chargePerDay != INVALID) {
            instrumentList.add(new InstrumentToRent(instrumentName, chargePerDay));
            JOptionPane.showMessageDialog(frame, "successfully included into the rental stock");
        }

    }

    // instrument name --> rent
    public String getInstr_Rent_Name() {
        return Instr_Rent_Add_NameTF.getText().trim();
    }

    // charge per Day -->rent
    public int getChargePerDay() {
        // empty -1 //invalid -2
        String chargePerDayText = chargePerDayTF.getText().trim();
        int chargePerDay = INVALID;

        if (chargePerDayText.isEmpty()) {
            chargePerDay = EMPTY;
            return chargePerDay;
        }

        try {
            chargePerDay = Integer.parseInt(chargePerDayText);
            if (chargePerDay <= 0) {
                JOptionPane.showMessageDialog(frame, "There can be no negative or zero charges each Day", "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                chargePerDay = INVALID;
                e = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Charges made each Day are invalid.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            x = "invalid";
        }
        return chargePerDay;

    }

    // rent the instrument
    public void rentInstrument() {
        String instrumentToRentText = Instr_Rent_NameTF.getText().trim();
        String Customer_NameText = Customer_NameTF.getText().trim();
        String phoneText = Rent_PhTF.getText().trim();
        int panText = getPanNoRent();
        String DateofRent = Day.getSelectedItem().toString() + " " +
                month.getSelectedItem().toString() + " "
                + year.getSelectedItem().toString();
        String DateofReturn = DayR.getSelectedItem().toString() + " " +
                monthR.getSelectedItem().toString() + " "
                + year.getSelectedItem().toString();
        int NOofDaysText = getNOofDays();
        boolean isUnique = true;

        if (instrumentToRentText.isEmpty() || panText == EMPTY || NOofDaysText == EMPTY || Customer_NameText.isEmpty()
                || phoneText.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Empty field! Please fill the field", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // negative
        if (e == 2) {
            e = 1;
            return;
        }

        // valid
        if (x == "invalid") {
            x = " ";
            return;
        }

        if (instrumentList.size() > 0) {
            for (int i = 0; i < instrumentList.size(); i++) {
                if (instrumentList.get(i).getInstrumentName().toLowerCase()
                        .equals(instrumentToRentText.toLowerCase())) {
                    if (instrumentList.get(i) instanceof InstrumentToRent) {
                        InstrumentToRent obj = (InstrumentToRent) instrumentList.get(i);
                        if (obj.getIsRented()) {
                            isUnique = false;
                            JOptionPane.showMessageDialog(frame, "It's already been leased", "WARNING",
                                    JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        obj.rentOut(Customer_NameText, phoneText, panText, DateofRent,
                                DateofReturn,
                                NOofDaysText);
                        isUnique = false;
                        obj.setIsRented(true);
                        JOptionPane.showMessageDialog(frame, "Successfully rented");

                        break;

                    }
                }
            }
        }

        if (isUnique == true) {
            JOptionPane.showMessageDialog(frame, "It's not available in stores", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    // get pan no for --> rent
    public int getPanNoRent() {
        String panNoText = PANRentTF.getText().trim();
        int panNo = INVALID;

        if (panNoText.isEmpty()) {
            panNo = EMPTY;
            return panNo;
        }

        try {
            panNo = Integer.parseInt(panNoText);
            if (panNo <= 0) {
                JOptionPane.showMessageDialog(frame, "PAN Number cannot be 0 or negative",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                panNo = INVALID;
                e = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "PAN NO. is not valid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            x = "invalid";

        }
        return panNo;

    }

    // get no of Day --> rent
    public int getNOofDays() {
        String NOofDaysText = NOofDaysTF.getText().trim();
        int NOofDays = INVALID;

        if (NOofDaysText.isEmpty()) {
            NOofDays = EMPTY;
            return NOofDays;
        }

        try {
            NOofDays = Integer.parseInt(NOofDaysText);
            if (NOofDays <= 0) {
                JOptionPane.showMessageDialog(frame, "Days Cannot Be Negative in Number",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                NOofDays = INVALID;
                e = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Day Count is invalid.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            x = "invalid";

        }
        return NOofDays;

    }

    // return instrument
    public void returnInstrument() {
        String instrumentName = Instr_Name_ReturnTF.getText().trim();
        boolean moreThanZero = false;

        if (instrumentName.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Empty field! Please fill the field", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (instrumentList.size() > 0) {

            for (int i = 0; i < instrumentList.size(); i++) {
                if (instrumentList.get(i).getInstrumentName().toLowerCase().equals(instrumentName.toLowerCase())) {
                    if (instrumentList.get(i) instanceof InstrumentToRent) {
                        InstrumentToRent obj = (InstrumentToRent) instrumentList.get(i);
                        if (obj.getIsRented() == false) {
                            JOptionPane.showMessageDialog(frame, "This instrument was not rented by us",
                                    "ERROR",
                                    JOptionPane.ERROR_MESSAGE);
                            moreThanZero = true;
                            return;
                        }
                        obj.returnInstrument();
                        JOptionPane.showMessageDialog(frame, "Returned successfully");
                        obj.setIsRented(false);
                        moreThanZero = true;
                        break;

                    }
                }
            }

            if (moreThanZero == false) {
                JOptionPane.showMessageDialog(frame, "It is neither in our inventory nor is it available for rental", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // clear in rent
    public void clearRent() {
        Instr_Rent_Add_NameTF.setText("");
        chargePerDayTF.setText("");
        Instr_Rent_NameTF.setText("");
        Customer_NameTF.setText("");
        Rent_PhTF.setText("");
        PANRentTF.setText("");
        NOofDaysTF.setText("");
        Instr_Name_ReturnTF.setText("");
    }

    // validation for sell
    // add to instrument handler-->sell
    public void addInstrumentForSell() {
        String instrumentName = Instr_Sell_Add_NameTF.getText().trim();
        int Price = getPrice();
        boolean isUnique = true;

        // negative
        if (e == 2) {
            e = 1;
            return;
        }

        // valid
        if (x == "invalid") {
            x = " ";
            return;
        }

        if (instrumentName.isEmpty() || Price == EMPTY) {
            JOptionPane.showMessageDialog(frame, "Empty field! Please fill the field", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (int i = 0; i < instrumentList.size(); i++) {
            if (instrumentList.get(i).getInstrumentName().toLowerCase().equals(instrumentName.toLowerCase())) {
                isUnique = false;
                JOptionPane.showMessageDialog(frame, "A unique instrument name is required",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                break;
            }
        }

        if (isUnique && Price != INVALID) {
            instrumentList.add(new InstrumentToSell(instrumentName, Price));
            JOptionPane.showMessageDialog(frame, "successfully added the stock for sale");
        }

    }

    // Price for sell -->sell
    public int getPrice() {
        // empty -1 //invalid -2
        String PriceText = PriceTF.getText().trim();
        int Price = INVALID;

        if (PriceText.isEmpty()) {
            Price = EMPTY;
            return Price;
        }

        try {
            Price = Integer.parseInt(PriceText);
            if (Price <= 0) {
                JOptionPane.showMessageDialog(frame, "Prices cannot be zero or negative",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                Price = INVALID;
                e = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Price invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            x = "invalid";
        }
        return Price;
    }

    // sell the instrument
    public void sellInstrument() {
        String instrumentToSellText = Instr_Sell_NameTF.getText().trim();
        String Customer_Name_SellText = Customer_Name_SellTF.getText().trim();
        String customerPhoneText = Customer_Ph_SellTF.getText().trim();
        int customerPanText = getPanNoSell();
        String dateOfSell = DayS.getSelectedItem().toString() + " " +
        monthS.getSelectedItem().toString() + " "
        + yearS.getSelectedItem().toString();
        int discountPercent = getDiscountPercent();
        boolean isUnique = true;

        if (instrumentToSellText.isEmpty() || customerPanText == EMPTY ||
                discountPercent == EMPTY
                || Customer_Name_SellText.isEmpty()
                || customerPhoneText.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Empty field! Please fill the field", "WARNING",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // negative
        if (e == 2) {
            e = 1;
            return;
        }

        // valid
        if (x == "invalid") {
            x = " ";
            return;
        }

        if (instrumentList.size() > 0) {
            for (int i = 0; i < instrumentList.size(); i++) {
                if (instrumentList.get(i).getInstrumentName().toLowerCase()
                        .equals(instrumentToSellText.toLowerCase())) {
                    if (instrumentList.get(i) instanceof InstrumentToSell) {
                        InstrumentToSell objS = (InstrumentToSell) instrumentList.get(i);
                        if (objS.getIssold() == true) {
                            isUnique = false;
                            JOptionPane.showMessageDialog(frame, "It has been sold", "WARNING",
                                    JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        isUnique = false;
                        objS.sell(Customer_Name_SellText, customerPhoneText,
                                customerPanText,
                                dateOfSell,
                                discountPercent);
                        objS.setIsSold(true);
                        JOptionPane.showMessageDialog(frame, "sold effectively");

                    }

                    break;
                }

            }
        }
        if (isUnique == true) {
            JOptionPane.showMessageDialog(frame, "It's not available in stores", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // pan no --> sell
    public int getPanNoSell() {
        String panNoSellText = PANSellTF.getText().trim();
        int panNoSell = INVALID;

        if (panNoSellText.isEmpty()) {
            panNoSell = EMPTY;
            return panNoSell;
        }

        try {
            panNoSell = Integer.parseInt(panNoSellText);
            if (panNoSell <= 0) {
                JOptionPane.showMessageDialog(frame, "PAN No. cannot be 0 or in the negative",
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                panNoSell = INVALID;
                e = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "PAN NO. is not valid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            x = "invalid";
        }
        return panNoSell;
    }

    // discount percent --> sell
    public int getDiscountPercent() {
        String discountPercentText = discountPercentTF.getText().trim();
        int discountPercent = INVALID;

        if (discountPercentText.isEmpty()) {
            discountPercent = EMPTY;
            return discountPercent;
        }

        try {
            discountPercent = Integer.parseInt(discountPercentText);
            if (discountPercent <= 0) {
                JOptionPane.showMessageDialog(frame, "Discount % cannot be 0 or in the negative", "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                discountPercent = INVALID;
                e = 2;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Discount Percent is invalid", "Error",
                    JOptionPane.ERROR_MESSAGE);
            x = "invalid";
        }
        return discountPercent;
    }

    // clear--> sell
    public void clearSell() {
        Instr_Sell_Add_NameTF.setText("");
        PriceTF.setText("");
        Instr_Sell_NameTF.setText("");
        Customer_Name_SellTF.setText("");
        Customer_Ph_SellTF.setText("");
        PANSellTF.setText("");
        discountPercentTF.setText("");
    }
    final static int EMPTY = -1;
    final static int INVALID = -2;
    int e = 1;
    String x = " ";
}