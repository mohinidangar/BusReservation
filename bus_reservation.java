import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class bus_reservation {

    public static void main(String args[]) {
        // frame is intialize
        JFrame fr = new JFrame();

        Label lname = new Label("Enter Name : ");
        lname.setBounds(50, 60, 80, 21);
        TextField tfname = new TextField(10);
        tfname.setBounds(150, 60, 150, 21);
        fr.add(lname);
        fr.add(tfname);

        Label lemail = new Label("Enter Email : ");
        lemail.setBounds(50, 100, 80, 21);
        TextField tfemail = new TextField(10);
        tfemail.setBounds(150, 100, 150, 21);
        fr.add(lemail);
        fr.add(tfemail);

        Label lpassw = new Label("Enter Password : ");
        lpassw.setBounds(50, 140, 100, 21);
        TextField tfpassw = new TextField(10);
        tfpassw.setBounds(150, 140, 150, 21);
        fr.add(lpassw);
        fr.add(tfpassw);

        // Source and destinationF
        Label lsrc = new Label("Source : ");
        lsrc.setBounds(50, 180, 100, 21);
        TextField tfsrc = new TextField(10);
        tfsrc.setBounds(150, 180, 150, 21);
        fr.add(lsrc);
        fr.add(tfsrc);

        Label ldstn = new Label("Destination : ");
        ldstn.setBounds(320, 180, 80, 21);
        TextField tfdstn = new TextField(10);
        tfdstn.setBounds(400, 180, 150, 21);
        fr.add(ldstn);
        fr.add(tfdstn);

        // Bus Routes
        Label lbus_rte = new Label(" Bus Routes : ");
        lbus_rte.setBounds(50, 220, 90, 21);
        Choice chbus_rte = new Choice();
        chbus_rte.add("Mumbai to Pune");
        chbus_rte.add("Pune to Mumbai");
        chbus_rte.add("Pune to Ahmednagar");
        chbus_rte.add("Nagpur to Amaravti");
        chbus_rte.add("Pune to Nasik");
        chbus_rte.add("Pune to Mumbai");
        chbus_rte.add("Ahmednagar to Pune");
        chbus_rte.add("Aurangabad to Pune");
        chbus_rte.add("Thane to Pune");
        chbus_rte.add("Aurangabad to Ahmednagar");
        chbus_rte.add("Mumbai to Satara");
        chbus_rte.add("Pune to Thane");
        chbus_rte.add("Nagpur to Warora");
        chbus_rte.add("Chandrapur to Nagpur");
        chbus_rte.add("Pune to Solapur");
        chbus_rte.add("Mandangad to Mumbai");
        chbus_rte.add("Nagpur to Chandrapur");
        chbus_rte.add("Nasik to Dhule");
        chbus_rte.add("Mumbai to Khandala");
        chbus_rte.add("Mumbai to Chiplun");
        chbus_rte.add("Solapur to Pune");
        chbus_rte.add("Thane to Nasik");
        chbus_rte.setBounds(150, 220, 130, 21);
        fr.add(lbus_rte);
        fr.add(chbus_rte);


        Label ltype = new Label("Bus Type : ");
        ltype.setBounds(50, 260, 80, 21);
        Choice chtype = new Choice();
        chtype.add("Tour bus");
        chtype.add("school bus");
        chtype.add("City bus");
        chtype.add("Red bus");
        chtype.setBounds(150, 260, 80, 21);
        fr.add(ltype);
        fr.add(chtype);


        Label ltime = new Label("Bus Time : ");
        ltime.setBounds(50, 300, 80, 21);
        Choice chtime = new Choice();
        chtime.add("12:30");
        chtime.add("5:00");
        chtime.add("3:40");
        chtime.add("9:30");
        chtime.setBounds(150, 300, 80, 2);
        Choice campm = new Choice();
        campm.add("AM");
        campm.add("PM");
        campm.setBounds(240, 300, 60, 2);
        fr.add(campm);
        fr.add(ltime);
        fr.add(chtime);

        Label l10 = new Label("Gender : ");
        l10.setBounds(50, 340, 80, 21);
        Checkbox cb1 = new Checkbox("Male", false);
        cb1.setBounds(150, 340, 80, 21);
        Checkbox cb2 = new Checkbox("Female", false);
        cb2.setBounds(250, 340, 80, 21);
        fr.add(l10);
        fr.add(cb1);
        fr.add(cb2);

        Label l11 = new Label("Payment Methods");
        l11.setBounds(50, 380, 80, 21);
        Choice ch4 = new Choice();
        ch4.add("Paytm");
        ch4.add("UPI");
        ch4.add("Bank transaction");
        ch4.setBounds(150, 380, 80, 21);
        fr.add(l11);
        fr.add(ch4);

        JButton button = new JButton("Submit");
        button.setBounds(120, 430, 80, 30);
        fr.add(button);

        fr.setSize(600, 600);
        fr.setTitle("Bus_Reservation");
        fr.setLayout(null); // most important to intialize the layout
        fr.setVisible(true);
    }
} 