import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameGui extends JFrame {
    JLabel labelbg;
    JLabel labelchar;
    int charakterx=350;
    int charaktery=350;
    public GameGui(){
        setTitle("Ini Game");
        setLocationRelativeTo(null);
        setSize(800,600);
        setResizable(false);
        addBackgground();
        Karakter();
        Kylistener();
    }
    public void addBackgground(){
        ImageIcon bg=new ImageIcon("Assets/bg.jpg");
        labelbg=new JLabel(bg);
        labelbg.setBounds(0,0,800,600);
        add(labelbg);
    }
    public void Karakter(){
        ImageIcon character=new ImageIcon("Assets/char.jpg");
        labelchar=new JLabel(character);
        labelchar.setBounds(charakterx,charaktery,100,100);
        labelbg.add(labelchar);
    }
    public void Kylistener(){
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keycode=e.getKeyCode();
                switch (keycode){
                    case KeyEvent.VK_W:
                        charaktery-=10;
                        break;
                    case KeyEvent.VK_A:
                        charakterx-=10;
                        break;
                    case KeyEvent.VK_S:
                        charaktery+=10;
                        break;
                    case KeyEvent.VK_D:
                        charakterx+=10;
                        break;
                }
                labelchar.setLocation(charakterx,charaktery);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> new GameGui().setVisible(true));
    }
}
