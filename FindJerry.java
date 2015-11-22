import java.awt.event.*;
import java.awt.*;
import java.util.Locale;
import javax.swing.*;  
public class FindJerry implements ActionListener{ 
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int award=0;
    int fail=0;
    int limit=10;
    int scor;
   FindJerry(){
   
   JFrame f=new JFrame();    
     f=new JFrame(); 
    
    b1=new JButton(new ImageIcon(""));
    Image img = new ImageIcon(this.getClass().getResource("blackhole.png")).getImage();
    b1.setIcon(new ImageIcon(img));
    b2=new JButton("");  
    b2.setIcon(new ImageIcon(img));
    b3=new JButton("");  
    b3.setIcon(new ImageIcon(img));
    b4=new JButton(""); 
    b4.setIcon(new ImageIcon(img));
    b5=new JButton("");  
    b5.setIcon(new ImageIcon(img));
    b6=new JButton("");  
    b6.setIcon(new ImageIcon(img));
    b7=new JButton("");  
    b7.setIcon(new ImageIcon(img));
    b8=new JButton("");  
    b8.setIcon(new ImageIcon(img));
    b9=new JButton(""); 
    b9.setIcon(new ImageIcon(img));
    
    //Setting Action listenner
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
     
        
          
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
    f.add(b6);f.add(b7);f.add(b8);f.add(b9);  
  
    f.setLayout(new GridLayout(3,3));  
    //setting grid layout of 3 rows and 3 columns  
    f.setTitle("Find Jerry"+fail);
    f.setSize(500,500);  
    f.setVisible(true); 
    f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("jerry.png")));
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
   }

public static void main(String[] args) {  
  // JOptionPane.showMessageDialog(null,"This is a mini game about a mouse who is hidding in a hole among 9 holes you have to find out the mice");
  // JOptionPane.showMessageDialog(null,"if you find him a massage will shown and you will rewarded other wise you area a loser have fun ");
    new FindJerry();
}  

    
    public void actionPerformed(ActionEvent e) {
        //First Button Pressed 
        if(e.getSource()==b1){  
        int res =(int)(Math.random()*9+1);
        if(res==1){
            award=award+1;
          JOptionPane.showMessageDialog(null,"\n                 JERRY"+"\n                     '.'"+"\n               Your score is "+award);

        }
        else {
           
            JOptionPane.showMessageDialog(null,"\n                 MISSED !");
            
            fail=fail+1;
            
            if(fail==10){
                JOptionPane.showMessageDialog(null,"Sorry You Lost the game\n          Your Score is  "+award+"\n\n                 Try again");
                    fail=0;
                    award=0;
            }
        }
    }  
        //Second Button PRessed 
        if(e.getSource()==b2){  
        int res =(int)(Math.random()*9+1);
        if(res==2){
            award=award+1;
        JOptionPane.showMessageDialog(null,"\n                 JERRY"+"\n                     '.'"+"\n               Your score is "+award);

        }
        else {
           
            JOptionPane.showMessageDialog(null,"\n                 MISSED !");
            
            fail=fail+1;
            
            if(fail==10){
                JOptionPane.showMessageDialog(null,"Sorry You Lost the game\n          Your Score is  "+award+"\n\n                 Try again");
                    fail=0;
                    award=0;
            }
        }
    }
        //Third Button Pressed
        if(e.getSource()==b3){  
        int res =(int)(Math.random()*9+1);
        if(res==3){
            award=award+1;
        JOptionPane.showMessageDialog(null,"\n                 JERRY"+"\n                     '.'"+"\n               Your score is "+award);

        }
        else {
           
            JOptionPane.showMessageDialog(null,"\n                 MISSED !");
            
            fail=fail+1;
            
            if(fail==10){
                JOptionPane.showMessageDialog(null,"Sorry You Lost the game\n          Your Score is  "+award+"\n\n                 Try again");
                    fail=0;
                    award=0;
            }
        }
    }
        //Fourth Button Pressed
        if(e.getSource()==b4){  
        int res =(int)(Math.random()*9+1);
        if(res==4){
            award=award+1;
        JOptionPane.showMessageDialog(null,"\n                 JERRY"+"\n                     '.'"+"\n               Your score is "+award);

        }
        else {
           
            JOptionPane.showMessageDialog(null,"\n                 MISSED !");
            
            fail=fail+1;
            
            if(fail==10){
                JOptionPane.showMessageDialog(null,"Sorry You Lost the game\n          Your Score is  "+award+"\n\n                 Try again");
                    fail=0;
                    award=0;
            }
        }
    }  
        //5TH BUTTON
        if(e.getSource()==b5){  
        int res =(int)(Math.random()*9+1);
        if(res==5){
            award=award+1;
        JOptionPane.showMessageDialog(null,"\n                 JERRY"+"\n                     '.'"+"\n               Your score is "+award);

        }
        else {
           
            JOptionPane.showMessageDialog(null,"\n                 MISSED !");
            
            fail=fail+1;
            
            if(fail==10){
                JOptionPane.showMessageDialog(null,"Sorry You Lost the game\n          Your Score is  "+award+"\n\n                 Try again");
                    fail=0;
                    award=0;
            }
        }
    }  
        //6TH BUTTON
        if(e.getSource()==b6){  
        int res =(int)(Math.random()*9+1);
        if(res==6){
            award=award+1;
        JOptionPane.showMessageDialog(null,"\n                 JERRY"+"\n                     '.'"+"\n               Your score is "+award);

        }
        else {
           
            JOptionPane.showMessageDialog(null,"\n                 MISSED !");
            
            fail=fail+1;
            
            if(fail==10){
                JOptionPane.showMessageDialog(null,"Sorry You Lost the game\n          Your Score is  "+award+"\n\n                 Try again");
                    fail=0;
                    award=0;
            }
        }
    }  
        //7TH BUTTON
        if(e.getSource()==b7){  
        int res =(int)(Math.random()*9+1);
        if(res==7){
            award=award+1;
        JOptionPane.showMessageDialog(null,"\n                 JERRY"+"\n                     '.'"+"\n               Your score is "+award);

        }
        else {
           
            JOptionPane.showMessageDialog(null,"\n                 MISSED !");
            
            fail=fail+1;
            
            if(fail==10){
                JOptionPane.showMessageDialog(null,"Sorry You Lost the game\n          Your Score is  "+award+"\n\n                 Try again");
                    fail=0;
                    award=0;
            }
        }
    }  
        //8TH BUTTON
        if(e.getSource()==b8){  
        int res =(int)(Math.random()*9+1);
        if(res==8){
            award=award+1;
        JOptionPane.showMessageDialog(null,"\n                 JERRY"+"\n                     '.'"+"\n               Your score is "+award);

        }
        else {
           
            JOptionPane.showMessageDialog(null,"\n                 MISSED !");
            
            fail=fail+1;
            
            if(fail==10){
                JOptionPane.showMessageDialog(null,"Sorry You Lost the game\n          Your Score is  "+award+"\n\n                 Try again");
                    fail=0;
                    award=0;
            }
        }
    }  
        //9TH BUTTON
        if(e.getSource()==b9){  
        int res =(int)(Math.random()*9+1);
        if(res==9){
            award=award+1;
        JOptionPane.showMessageDialog(null,"\n                 JERRY"+"\n                     '.'"+"\n               Your score is "+award);

        }
        else {
           
            JOptionPane.showMessageDialog(null,"\n                 MISSED !");
            
            fail=fail+1;
            
            if(fail==10){
                JOptionPane.showMessageDialog(null,"Sorry You Lost the game\n          Your Score is  "+award+"\n\n                 Try again");
                    fail=0;
                    award=0;
            }
        }
    }  
    }

    
    
    
}  
