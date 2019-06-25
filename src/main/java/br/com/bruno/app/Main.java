package br.com.bruno.app;

import br.com.bruno.utils.AppLock;
import br.com.bruno.view.JFrmPrincipal;
import br.com.bruno.view.JFrmPrincipal1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) throws Exception {

        if (AppLock.lock()) {
            AppLock.adicionarShutdownHook();

            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

            JFrmPrincipal1 login = new JFrmPrincipal1();
            login.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "A aplicação já se encontra em execução!", "Sped-Fiscal", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }

}
