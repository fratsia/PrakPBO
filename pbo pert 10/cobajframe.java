import javax.swing.*;
import java.awt.*;

public class cobajframe extends JFrame{
    public cobajframe(){
        setTitle("login page");
        setSize(600,400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(5,5));
        JPanel paneltengah=new JPanel(new GridLayout(2,2));
        JLabel usernamLabel=new JLabel("Username: ");
        JLabel passwLabel=new JLabel("Password: ");
        JTextField usernamField=new JTextField();
        JPasswordField passwordField=new JPasswordField();
        add(paneltengah, BorderLayout.CENTER);
        paneltengah.add(usernamLabel);
        paneltengah.add(usernamField);
        paneltengah.add(passwLabel);
        paneltengah.add(passwordField);
        JButton masuk=new JButton("masuk");
        add(masuk,BorderLayout.SOUTH);

        masuk.addActionListener(
            e -> {
                String usename = usernamField.getText();
                String password = String.valueOf(passwordField.getPassword());
                System.out.println(usename);
                System.out.println(password);
                System.out.println(usename.equals(usename) && password.equals("silahkan"));
                
                if (usename.equals(usename) && password.equals("silahkan")) {
                    JOptionPane.showMessageDialog(this, "berhasil masuk");
                    dispose();
                } else{
                    JOptionPane.showMessageDialog(this, "masuk gagal");
                }
            } 
        );

    }
}

class dasboard extends JFrame {
    
}
