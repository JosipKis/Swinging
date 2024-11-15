import View.MainFrame;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;

public class MainApp {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatMacDarkLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}