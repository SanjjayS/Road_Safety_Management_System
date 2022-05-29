import java.sql.*;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;


class Roadsafety{
    String nameofrule;
    int Fineprice;
    public String getname()
    {
        return nameofrule;
    }
    public int getfine()
    {
        return Fineprice;
    }
}
class Overspeed extends Roadsafety{
    public String getname()
    {
        return "Over Speed";
    }
    public int getfine()
    {
        return 350;
    }
}
class SeatBelt extends Roadsafety{
    public String getname()
    {
        return "Not wearing a SeatBelt";
    }
    public int getfine()
    {
        return 250;
    }
}
class Helmet extends Roadsafety{
    public String getname()
    {
        return "Not wearing a Helmet";
    }
    public int getfine()
    {
        return 500;
    }
}


public class Roadsafetymanagement {
    JTable j ;
    int penalty;
    String status;
    JButton dpay;
    JButton pay;
    int flag;
    Roadsafetymanagement()
    {
        Border border = BorderFactory.createLineBorder(Color.black , 2, true);
        Color c = new Color(199, 245, 255);
        //Font f1 = new Font("SansSerif", Font.BOLD, 18);
        JFrame f = new JFrame("Road Safety Management");
        f.getContentPane().setBackground(c);

        JLabel heading = new JLabel("ROAD SAFETY MANAGMENT");
        heading.setFont(new Font("SansSerif", Font.BOLD, 25));

        JPanel left = new JPanel();
        left.setPreferredSize(new Dimension(450,500));
        left.setLayout(new GridBagLayout());
        GridBagConstraints gc1 = new GridBagConstraints();

        JLabel rulename = new JLabel("Rule Name",JLabel.CENTER);
        rulename.setFont(new Font("SansSerif", Font.BOLD, 20));
        rulename.setPreferredSize(new Dimension(200,40));
        gc1.insets = new Insets(10,10,10,10);
        gc1.gridx = 0;
        gc1.gridy = 0;
        left.add(rulename, gc1);

        JTextField tf = new JTextField();
        tf.setBorder(border);
        tf.setPreferredSize(new Dimension(200,30));
        tf.setFont(new Font("SansSerif",Font.BOLD,20));  
        gc1.gridx = 1;
        gc1.gridy = 0;
        left.add(tf, gc1);

        JButton cal = new JButton("Calculate!");
        cal.setFont(new Font("SansSerif", Font.BOLD, 20));
        cal.setPreferredSize(new Dimension(200,50));
        cal.setBackground(c);
        gc1.gridx = 0;
        gc1.gridy = 1;
        //gc1.insets = new Insets(10,10,10,10);
        left.add(cal, gc1);

        JLabel fineamount = new JLabel("",JLabel.CENTER);
        fineamount.setFont(new Font("SansSerif", Font.BOLD, 20));
        fineamount.setPreferredSize(new Dimension(200,40));
        gc1.gridx = 1;
        gc1.gridy = 1;
       // gc1.insets = new Insets(10,10,10,10);
        left.add(fineamount, gc1);

        cal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ee)
            {
                try {
                    // Connection connection;
                    // String location = "C:\\Users\\Rahul\\Downloads\\Busdetails.accdb";
                    // String databaseURL = "jdbc:ucanaccess://" + location;
                    // connection = DriverManager.getConnection(databaseURL);
                    // System.out.println("Connected To Derby Database!");
                    
                    Overspeed os = new Overspeed();
                    SeatBelt sb = new SeatBelt();
                    Helmet hm = new Helmet();
                    if(os.getname().equals(tf.getText()))
                    {
                        JOptionPane.showMessageDialog(f, "The amount is "+os.getfine());
                    }
                    
                    else if(sb.getname().equals(tf.getText()))
                    {
                        JOptionPane.showMessageDialog(f, "The amount is "+sb.getfine());
                    }
                    else if(hm.getname().equals(tf.getText()))
                    {
                        JOptionPane.showMessageDialog(f, "The amount is "+hm.getfine());
                    }
                    else{
                        JOptionPane.showMessageDialog(f, "Type a valid Rule");
                    }
                    // if(os.getname().equals(tf.getText()))
                    // {
                    //     fineamount.setText("Rs. "+os.getfine());
                    // }
                    
                    // else if(sb.getname().equals(tf.getText()))
                    // {
                    //     fineamount.setText("Rs. "+sb.getfine());
                    // }
                    // else if(hm.getname().equals(tf.getText()))
                    // {
                    //     fineamount.setText("Rs. "+hm.getfine());
                    // }
                    // else
                    // {
                    //     JOptionPane.showMessageDialog(f, "Type a valid Rule");
                    // }

                    // Statement s = connection.createStatement();
                    // ResultSet rs = s.executeQuery("select * from RULEBOOK where Rulename = \'"+tf.getText()+"\'");
                    // while(rs.next())
                    // {
                    //     fineamount.setText("Rs. "+String.valueOf(rs.getInt(2)));
                    // }
                    // System.out.println("HIT");
                    //connection.close();
                }
                catch(Exception e)
                {
                    
                }
            }
        });


        JLabel Personname = new JLabel("Driver Name",JLabel.CENTER);
        Personname.setFont(new Font("SansSerif", Font.BOLD, 20));
        Personname.setPreferredSize(new Dimension(200,40));
        gc1.gridx = 0;
        gc1.gridy = 2;
        //gc1.insets = new Insets(10,10,10,10);
        left.add(Personname, gc1);

        JTextField tf1 = new JTextField();
        tf1.setBorder(border);
        tf1.setPreferredSize(new Dimension(200,30));
        tf1.setFont(new Font("SansSerif",Font.BOLD,20));  
        gc1.gridx = 1;
        gc1.gridy = 2;
        //gc1.insets = new Insets(10,10,10,10);
        left.add(tf1, gc1);

        JLabel registeredno = new JLabel("Registered No.",JLabel.CENTER);
        registeredno.setFont(new Font("SansSerif", Font.BOLD, 20));
        registeredno.setPreferredSize(new Dimension(200,40));
        gc1.gridx = 0;
        gc1.gridy = 3;
        //gc1.insets = new Insets(10,10,10,10);
        left.add(registeredno, gc1);

        JTextField tf2 = new JTextField();
        tf2.setBorder(border);
        tf2.setPreferredSize(new Dimension(200,30));
        tf2.setFont(new Font("SansSerif",Font.BOLD,20));  
        gc1.gridx = 1;
        gc1.gridy = 3;
        //gc1.insets = new Insets(10,10,10,10);
        left.add(tf2, gc1);

        JButton overspeed = new JButton("Over Speed");
        overspeed.setFont(new Font("SansSerif", Font.BOLD, 20));
        overspeed.setPreferredSize(new Dimension(200,50));
        overspeed.setBackground(c);
        gc1.gridx = 0;
        gc1.gridy = 4;
        //gc1.insets = new Insets(10,10,10,10);
        left.add(overspeed, gc1);

        overspeed.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ee)
            {
                penalty += 350;
                overspeed.setEnabled(false);
            }
        });

        JButton Seatbelt = new JButton("No Seatbelt");
        Seatbelt.setFont(new Font("SansSerif", Font.BOLD, 20));
        Seatbelt.setPreferredSize(new Dimension(200,50));
        Seatbelt.setBackground(c);
        gc1.gridx = 1;
        gc1.gridy = 4;
        //gc1.insets = new Insets(10,10,10,10);
        left.add(Seatbelt, gc1);
        

        JButton Helmet = new JButton("No Helmet");
        Helmet.setFont(new Font("SansSerif", Font.BOLD, 20));
        Helmet.setPreferredSize(new Dimension(200,50));
        Helmet.setBackground(c);
        gc1.gridx = 0;
        gc1.gridy = 5;
        //gc1.insets = new Insets(10,10,10,10);
        left.add(Helmet, gc1);

        Seatbelt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ee)
            {
                penalty += 250;
                Seatbelt.setEnabled(false);
                Helmet.setEnabled(false);
            }
        });

        Helmet.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ee)
            {
                penalty += 500;
                Seatbelt.setEnabled(false);
                Helmet.setEnabled(false);
            }
        });

        JButton add = new JButton("Add");
        add.setFont(new Font("SansSerif", Font.BOLD, 20));
        add.setPreferredSize(new Dimension(200,50));
        add.setBackground(c);
        gc1.gridx = 1;
        gc1.gridy = 5;
        //gc1.insets = new Insets(10,10,10,10);
        left.add(add, gc1);

        pay = new JButton("Pay");
        pay.setFont(new Font("SansSerif", Font.BOLD, 20));
        pay.setPreferredSize(new Dimension(200,50));
        pay.setBackground(c);
        gc1.gridx = 0;
        gc1.gridy = 6;
        //gc1.insets = new Insets(10,10,10,10);
        left.add(pay, gc1);

        pay.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ee)
            {
                status = "PAID";   
                pay.setEnabled(false);
                dpay.setEnabled(false);
            }
        });


        dpay = new JButton("Don't Pay");
        dpay.setFont(new Font("SansSerif", Font.BOLD, 20));
        dpay.setPreferredSize(new Dimension(200,50));
        dpay.setBackground(c);
        gc1.gridx = 1;
        gc1.gridy = 6;
        //gc1.insets = new Insets(10,10,10,10);
        left.add(dpay, gc1);

        dpay.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ee)
            {
                status = "NOT PAID"; 
                pay.setEnabled(false);
                dpay.setEnabled(false);
            }
        });

        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ee)
            {
                try{
                    /*String location = "C:\\Users\\Rahul\\Downloads\\Busdetails.accdb";
                    String databaseURL = "jdbc:ucanaccess://" + location;
                    Connection con = DriverManager.getConnection(databaseURL);*/
                    Connection con = DriverManager.getConnection("jdbc:derby:testdb;create=true");

                    PreparedStatement ps = con.prepareStatement("insert into POLICE values(?,?,?,?)");

                    ps.setString(1, tf1.getText());
                    ps.setString(2, tf2.getText());
                    ps.setInt(3, penalty);
                    ps.setString(4, status);
                    ps.executeUpdate();

                    penalty = 0;
                    status = "";
                
                    con.close();
                }
                catch(Exception eee)
                {
        
                }
                new Roadsafetymanagement();
                f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
            }
        });


        int n = 0;
        try{
            Connection con = DriverManager.getConnection("jdbc:derby:testdb;create=true");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from POLICE");
            
            while(rs.next())
            {
                n++;
            }
            con.close();
        }
        catch(Exception ee)
        {

        }

        String[][] data = new String[n][3];
        String[] columnNames = { "Name","Registered Number","STATUS" };
        j = new JTable(data, columnNames);

        j.getTableHeader().setFont(new Font("SansSerif",Font.BOLD,20));
        j.getTableHeader().setOpaque(false);
        j.getTableHeader().setBackground(new Color(32,136,203));
        j.getTableHeader().setForeground(new Color(255,255,255));
        j.setFont(new Font("SansSerif",Font.BOLD,18));
        j.setRowHeight(30);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        centerRenderer.setVerticalAlignment(JLabel.TOP);
        j.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        j.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        j.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );

        JScrollPane sp = new JScrollPane(j);
        sp.setPreferredSize(new Dimension(500,500));
        


        try{
            Connection con = DriverManager.getConnection("jdbc:derby:testdb;create=true");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from POLICE");
            int j1 = 0;
            while(rs.next())
            {
                j.setValueAt(rs.getString(1),j1,0);
                j.setValueAt(rs.getString(2),j1,1);
                j.setValueAt(rs.getString(4),j1,2);
                j1++;
            }
            con.close();
        }
        catch(Exception ee)
        {

        }

        JPanel right = new JPanel();
        right.setPreferredSize(new Dimension(400,500));
        right.setLayout(new GridBagLayout());
        GridBagConstraints gc2 = new GridBagConstraints();

        JLabel registerednoinput = new JLabel("Enter Registered Number",JLabel.CENTER);
        registerednoinput.setFont(new Font("SansSerif", Font.BOLD, 20));
        registerednoinput.setPreferredSize(new Dimension(300,30));
        gc2.gridx = 0;
        gc2.gridy = 0;
        gc2.insets = new Insets(20,20,20,20);
        right.add(registerednoinput, gc2);

        JTextField tf3 = new JTextField();
        tf3.setBorder(border);
        tf3.setPreferredSize(new Dimension(200,30));
        tf3.setFont(new Font("SansSerif",Font.BOLD,20));  
        gc2.gridx = 0;
        gc2.gridy = 1;
        //gc1.insets = new Insets(10,10,10,10);
        right.add(tf3, gc2);

        JButton getpenalty = new JButton("Get Penalty !");
        getpenalty.setFont(new Font("SansSerif", Font.BOLD, 20));
        getpenalty.setPreferredSize(new Dimension(200,50));
        getpenalty.setBackground(c);
        gc2.gridx = 0;
        gc2.gridy = 2;
        //gc1.insets = new Insets(10,10,10,10);
        right.add(getpenalty, gc2);

        JLabel totpenalty = new JLabel("",JLabel.CENTER);
        totpenalty.setFont(new Font("SansSerif", Font.BOLD, 20));
        totpenalty.setPreferredSize(new Dimension(200,30));
        gc2.gridx = 0;
        gc2.gridy = 3;
       // gc1.insets = new Insets(10,10,10,10);
        right.add(totpenalty, gc2);

        getpenalty.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ee)
            {
                
                try {
                    Connection connection = DriverManager.getConnection("jdbc:derby:testdb;create=true");
                    System.out.println("Connected To Derby Database!");
                    
                    Statement s = connection.createStatement();
                    ResultSet rs = s.executeQuery("select * from POLICE where RegisteredNumber = \'"+tf3.getText()+"\'");
                    while(rs.next())
                    {
                        totpenalty.setText("Rs. "+String.valueOf(rs.getInt(3)));
                    }
                    System.out.println("HIT");
                    connection.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });

        left.setBackground(new Color(138, 210, 255));
        sp.setBackground(new Color(138, 210, 255));
        right.setBackground(new Color(138, 210, 255));

        f.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(-150,10,10,10);
        f.add(heading,gc);

        gc.gridx = 0;
        gc.gridy = 1;
        gc.insets = new Insets(50,10,10,10);
        f.add(left,gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.insets = new Insets(50,10,10,10);
        f.add(sp,gc);

        gc.gridx = 2;
        gc.gridy = 1;
        gc.insets = new Insets(50,10,10,10);
        f.add(right,gc);

        f.setSize(1920,1080);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Roadsafetymanagement();
    }
    
}


// import java.sql.*;

// public class Tablepolice {
// 	public static void main(String args[])
// 	{
// 		try {
// 			Connection connection = DriverManager.getConnection("jdbc:derby:testdb;create=true");
// 			System.out.println("Connected To Derby Database!");
// 			Statement st = connection.createStatement();
// 			st.executeUpdate("create table POLICE (Name varchar(30), RegisteredNumber varchar(30), Penalty int, Status varchar(30))");
//             System.out.println("HIT");
// 			connection.close();
// 		}
// 		catch(Exception ee)
// 		{
			
// 		}
// 	}
// }


// import java.sql.*;

// public class Tablerules {
// 	public static void main(String args[])
// 	{
// 		try {
// 			Connection connection = DriverManager.getConnection("jdbc:derby:testdb;create=true");
// 			System.out.println("Connected To Derby Database!");
// 			// Statement st = connection.createStatement();
// 			// st.executeUpdate("create table RULEBOOK (Rulename varchar(30), Fine int)");
//             Statement st1 = connection.createStatement();
// 			st1.executeUpdate("insert into RULEBOOK values ('Over Speed', 350)");
//             Statement st2 = connection.createStatement();
// 			st2.executeUpdate("insert into RULEBOOK values ('Not wearing a SeatBelt', 250)");
//             Statement st3 = connection.createStatement();
// 			st3.executeUpdate("insert into RULEBOOK values ('Not wearing a Helmet', 500)");
//             System.out.println("HIT");
// 			connection.close();
// 		}
// 		catch(Exception ee)
// 		{
			
// 		}
// 	}
// }