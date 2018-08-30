/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checking_drives;

import static checking_drives.loading_frame.percentage;
import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Sundeep & Manoj
 */
public class Checking_Drives {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Available_Drives().setVisible(true);
            }
        });
}}
    
    

