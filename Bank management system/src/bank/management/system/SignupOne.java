
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


   class SignupOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField, fnameTextField,dobTextField, emailTextField,addressTextField, stateTextField, cityTextField, pincodeTextField;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChooser;
    JButton next;
    SignupOne(){
        setLayout(null);
        Random ran=new Random();
        random=Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno=new JLabel("APPLICATION FORM NO." + random );
        formno.setFont(new Font("Raleway", Font.BOLD, 22));
        formno.setBounds(185,20,600,40);
        add(formno);
        
        JLabel personalDetails=new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290,70,400,24);
        add(personalDetails);
        
        JLabel name=new JLabel("Name:" );
        name.setFont(new Font("Raleway", Font.BOLD, 16));
        name.setBounds(100,120,100,20);
        add(name);
        
        nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        nameTextField.setBounds(300, 120, 400, 22);
        add(nameTextField);
        
        JLabel fname=new JLabel("Father's Name:" );
        fname.setFont(new Font("Raleway", Font.BOLD, 16));
        fname.setBounds(100,170,200,22);
        add(fname);
        
        fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        fnameTextField.setBounds(300, 170, 400, 22);
        add(fnameTextField);
        
        JLabel dob=new JLabel("Date of Birth:" );
        dob.setFont(new Font("Raleway", Font.BOLD, 16));
        dob.setBounds(100,220,200,22);
        add(dob);
        
         dateChooser=new JDateChooser();
         dateChooser.setBounds(300, 220, 400, 22);
         dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);
        
        JLabel gender=new JLabel("Gender:" );
        gender.setFont(new Font("Raleway", Font.BOLD, 16));
        gender.setBounds(100,270,200,22);
        add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(300,270,60,22);
        male.setBackground(Color.WHITE);
        add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(450,270,120,22);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        JLabel email=new JLabel("Email Address:" );
        email.setFont(new Font("Raleway", Font.BOLD, 16));
        email.setBounds(100,320,200,22);
        add(email);
        
        emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        emailTextField.setBounds(300, 320, 400, 22);
        add(emailTextField);
        
        JLabel marital=new JLabel("Marital Status:" );
        marital.setFont(new Font("Raleway", Font.BOLD, 16));
        marital.setBounds(100,370,200,22);
        add(marital);
        
        married=new JRadioButton("Married");
        married.setBounds(300,370,100,22);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450,370,120,22);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other=new JRadioButton("Other");
        other.setBounds(630,370,100,22);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        JLabel address=new JLabel("Address:" );
        address.setFont(new Font("Raleway", Font.BOLD, 16));
        address.setBounds(100,420,200,22);
        add(address);
        
        addressTextField=new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        addressTextField.setBounds(300, 420, 400, 22);
        add(addressTextField);
        
        JLabel city=new JLabel("City:" );
        city.setFont(new Font("Raleway", Font.BOLD, 16));
        city.setBounds(100,470,200,22);
        add(city);
        
        cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        cityTextField.setBounds(300, 470, 400, 22);
        add(cityTextField);
        
        JLabel state=new JLabel("State:" );
        state.setFont(new Font("Raleway", Font.BOLD, 16));
        state.setBounds(100,520,200,22);
        add(state);
        
        stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        stateTextField.setBounds(300, 520, 400, 22);
        add(stateTextField);
        
        JLabel pincode=new JLabel("Pin Code:" );
        pincode.setFont(new Font("Raleway", Font.BOLD, 16));
        pincode.setBounds(100,570,200,22);
        add(pincode);
        
        pincodeTextField=new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 12));
        pincodeTextField.setBounds(300, 570, 400, 22);
        add(pincodeTextField);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 615, 80, 22);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(750, 750);
        setLocation(250,1);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String formno= ""+ random;
        String name=nameTextField.getText();
        String fname=fnameTextField.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
        gender="Male";
    }else if(female.isSelected()){
        gender="Female";
    }
        String email=emailTextField.getText();
        String marital=null;
        if(married.isSelected()){
            marital="Married";
            
        }
        else if(unmarried.isSelected()){
            marital="Unmarried";
        }
        else if(other.isSelected()){
            marital="Other";
        }
        String address=addressTextField.getText();
        String city=cityTextField.getText();
        String state=stateTextField.getText();
        String pincode=pincodeTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }else{
                Conn c=new Conn();
                String query ="insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
    

    
    public static void main(String args[]) {
        new SignupOne();
       
    }
}
