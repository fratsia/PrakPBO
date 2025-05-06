import javax.swing.SwingUtilities;

class main {
    public static void main(String[] args) {
    SwingUtilities.invokeLater(
        ()->new cobajframe().setVisible(true)
    );
    }
}
