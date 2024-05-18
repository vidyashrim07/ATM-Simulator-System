package bank.management.system;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;


   class SignupTwo extends JFrame implements ActionListener {
    
    JTextField pan,aadhar;
    JRadioButton syes,sno,eyes,eno;
String formno;
    
    JButton next;
    JComboBox religion, category, occupation, educational, income;
    SignupTwo(String formno){
this.formno=formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE");
                
                
        JLabel additionalDetails=new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290,70,400,24);
        add(additionalDetails);
        
        JLabel name=new JLabel("Religion:" );
        name.setFont(new Font("Raleway", Font.BOLD, 16));
        name.setBounds(100,120,100,20);
        add(name);
        
        String valReligion[]={"Hindu", "Muslim", "Sikh", "Christian", "Other"};
         religion=new JComboBox(valReligion);
        religion.setBounds(300, 120, 400, 22);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel fname=new JLabel("Category:" );
        fname.setFont(new Font("Raleway", Font.BOLD, 16));
        fname.setBounds(100,170,200,22);
        add(fname);
        
        String valCategory[]={"General", "OBC", "SC", "ST", "Other"};
         category=new JComboBox(valCategory);
        category.setBounds(300, 170, 400, 22);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob=new JLabel("Income:" );
        dob.setFont(new Font("Raleway", Font.BOLD, 16));
        dob.setBounds(100,220,200,22);
        add(dob);
        
        String valIncome[]={"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10Lakh"};
        income=new JComboBox(valIncome);
        income.setBounds(300, 220, 400, 22);
        income.setBackground(Color.WHITE);
        add(income);
        
         
        
        JLabel gender=new JLabel("Educational" );
        gender.setFont(new Font("Raleway", Font.BOLD, 16));
        gender.setBounds(100,270,200,22);
        add(gender);
         
        JLabel email=new JLabel("Qualification:" );
        email.setFont(new Font("Raleway", Font.BOLD, 16));
        email.setBounds(100,295,200,22);
        add(email);
        
        String educationalValues[]={"Non Graduation", "Graduate", "Post Graduation", "Doctrate", "Others"};
       educational=new JComboBox(educationalValues);
        educational.setBounds(300, 295, 400, 22);
         educational.setBackground(Color.WHITE);
        add( educational);
        
        JLabel marital=new JLabel("Occupation:" );
        marital.setFont(new Font("Raleway", Font.BOLD, 16));
        marital.setBounds(100,370,200,22);
        add(marital);
        
         String occupationValues[]={"Salaried", "Self Employed", "Business", "Student", "Retired", "Others"};
        occupation=new JComboBox(occupationValues);
       occupation.setBounds(300, 370, 400, 22);
         occupation.setBackground(Color.WHITE);
        add( occupation);
        
        JLabel panN=new JLabel("PAN Number:" );
        panN.setFont(new Font("Raleway", Font.BOLD, 16));
        panN.setBounds(100,420,200,22);
        add(panN);
        
        pan=new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 12));
        pan.setBounds(300, 420, 400, 22);
        add(pan);
        
        JLabel aadharN=new JLabel("Aadhar Number:" );
        aadharN.setFont(new Font("Raleway", Font.BOLD, 16));
        aadharN.setBounds(100,470,200,22);
        add(aadharN);
        
        aadhar=new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 12));
        aadhar.setBounds(300, 470, 400, 22);
        add(aadhar);
        
        JLabel state=new JLabel("Senior Citizen:" );
        state.setFont(new Font("Raleway", Font.BOLD, 16));
        state.setBounds(100,520,200,22);
        add(state);
        
        syes=new JRadioButton("Yes");
        syes.setBounds(300,520,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setBounds(450,520,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup citizengroup=new ButtonGroup();
        citizengroup.add(syes);
        citizengroup.add(sno);
        
        
        
        JLabel pincode=new JLabel("Existing Account:" );
        pincode.setFont(new Font("Raleway", Font.BOLD, 16));
        pincode.setBounds(100,570,200,22);
        add(pincode);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,570,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setBounds(450,570,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existinggroup=new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);
        
        
        
        
        
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
        
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation=(String)educational.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        
        String seniorcitizen=null;
        if(syes.isSelected()){
        seniorcitizen="Yes";
    }else if(sno.isSelected()){
        seniorcitizen="No";
    }
        
        String existingaccount=null;
        if(eyes.isSelected()){
            existingaccount="Yes";
            
        }
        else if(eno.isSelected()){
            existingaccount="No";
        }
        
        
        String span=pan.getText();
        String saadhar=aadhar.getText();
        
        
        try{
            Conn c=new Conn();
            String query ="insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+existingaccount+"', '"+seniorcitizen+"')";
                c.s.executeUpdate(query);
                
                //signup3 object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
        
        
    
    
    

    
    public static void main(String args[]) {
        new SignupTwo("");
        
    }
}
