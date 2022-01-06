/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.management.system;

import airline.management.system.Add_Customer;
import airline.management.system.Cancel;
import airline.management.system.Flight_Info;
import airline.management.system.Journey_Details;
import airline.management.system.Payment_Details;
import airline.management.system.Pymt;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author HP
 */
public class MainframeUser extends JFrame {
    
     public MainframeUser() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM - User Portal");
        initialize();
    }

     public static void main(String[] args) {
        new MainframeUser().setVisible(true);
    }
      private void initialize() {
	
        setForeground(Color.CYAN);
        setLayout(null); 

        JLabel NewLabel = new JLabel("");
	NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/front.jpg")));
        NewLabel.setBounds(0, 0, 2200, 1200); 
	
	add(NewLabel); 
        
        JLabel AirlineManagementSystem = new JLabel("GLOBAL AIRLINE RESERVATION SYSTEM");
	AirlineManagementSystem.setForeground(Color.BLACK);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 36));
	AirlineManagementSystem.setBounds(700, 60, 1000, 55);
	NewLabel.add(AirlineManagementSystem);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
        
		
        JMenu AirlineSystem = new JMenu("AIRLINE SYSTEM");
        AirlineSystem.setForeground(Color.BLUE);
	menuBar.add(AirlineSystem);
		
        JMenuItem FlightDetails = new JMenuItem("FLIGHT_INFO");
	AirlineSystem.add(FlightDetails);
        
	JMenuItem BookFlight = new JMenuItem("BOOK_FLIGHT");
	AirlineSystem.add(BookFlight);
		
//	JMenuItem SectorDetails_1 = new JMenuItem("PAYMENT_DETAILS");
//	AirlineSystem.add(SectorDetails_1);
		
//	JMenuItem Cancellation = new JMenuItem("CANCELLATION");
//	AirlineSystem.add(Cancellation);
		
	//JMenu Pymt = new JMenu("PYMT");
        //Pymt.setForeground(Color.RED);
	//menuBar.add(Pymt);
		
       /*JMenu List = new JMenu("LIST");
        List.setForeground(Color.BLUE);
	menuBar.add(List);
		
	JMenu Misc = new JMenu("MISC");
        Misc.setForeground(Color.RED);
	menuBar.add(Misc);
        */
		
	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Flight_Info();
            }
	});
        
	BookFlight.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Bookflight();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
//		
//        PassengerDetails.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//                try {
//                    new Journey_Details();
//                } catch (Exception e) {
//                    e.printStackTrace();
//		}
//            }
//	});
//		
//        SectorDetails_1.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//                try {
//                    new Payment_Details();
//		} catch (Exception e) {
//                    e.printStackTrace();
//		}
//            }
//	});
//		
        //Pymt.addActionListener(new ActionListener(){
          //  public void actionPerformed(ActionEvent ae){
            //    new Pymt();
            //}
	//});
		
        setSize(1950,1090);
	setVisible(true);
    }
    
    
}
