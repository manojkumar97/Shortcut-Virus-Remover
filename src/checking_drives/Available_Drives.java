/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checking_drives;

import static checking_drives.loading_frame.percentage;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Sundeep & Manoj
 */
public class Available_Drives extends javax.swing.JFrame  {

    public Timer timer;
    public int count;
    public Available_Drives() {
        initComponents();
        detect_drives();
        startbuttonimage.setVisible(false);
       //statusgif.setVisible(false);
         Desktop desktop=Desktop.getDesktop();
    }
    
   
    
    public void detect_drives()
    {
         Desktop desktop=Desktop.getDesktop();
         File a=new File("A:");
         File b=new File("B:");
         File c=new File("C:");
         File d=new File("D:");
         File e=new File("E:");
         File f=new File("F:");
         File g=new File("G:");
         File h=new File("H:");
         File i=new File("I:");
         File j=new File("J:");
         File k=new File("K:");
         File l=new File("L:");
         File m=new File("M:");
         File n=new File("N:");
         File o=new File("O:");
         File p=new File("P:");
         File q=new File("Q:");
         File r=new File("R:");
         File s=new File("S:");
         File t=new File("T:");
         File u=new File("U:");
         File v=new File("V:");
         File w=new File("W:");
         File x=new File("X:");
         File y=new File("Y:");
         File z=new File("Z:");
      if(a.exists())
      {
          
          drive_combobox.addItem("A:");
          
      }
     
       if(b.exists())
              {
                  drive_combobox.addItem("B:");
                  
              }
              if(c.exists())
              {
                  drive_combobox.addItem("C:");
           
                  
              }
            if(d.exists())
              {
                  drive_combobox.addItem("D:");
                 
              }
        if(e.exists())
              {
                  drive_combobox.addItem("E:");
              }
          if(f.exists())
              {
                  drive_combobox.addItem("F:");
              }
             if(g.exists())
              {
                  drive_combobox.addItem("G:");
              }
                if(h.exists())
              {
                  drive_combobox.addItem("H:");
              }
            if(i.exists())
              {
                  drive_combobox.addItem("I:");
              }
    if(j.exists())
              {
                  drive_combobox.addItem("J:");
              }
           if(k.exists())
              {
                  drive_combobox.addItem("K:");
              }
             if(l.exists())
              {
                  drive_combobox.addItem("L:");
              }
               if(m.exists())
              {
                  drive_combobox.addItem("M:");
              }
                if(n.exists())
              {
                  drive_combobox.addItem("N:");
              }
              if(o.exists())
              {
                  drive_combobox.addItem("O:");
              }
             if(p.exists())
              {
                  drive_combobox.addItem("P:");
              }
                if(q.exists())
              {
                  drive_combobox.addItem("Q:");
              }
                if(r.exists())
              {
                  drive_combobox.addItem("R:");
              }
            if(s.exists())
              {
                  drive_combobox.addItem("S:");
              }
               if(t.exists())
              {
                  drive_combobox.addItem("T:");
              }
      if(u.exists())
              {
                  drive_combobox.addItem("U:");
              }
               if(v.exists())
              {
                  drive_combobox.addItem("V:");
              }
             if(w.exists())
              {
                  drive_combobox.addItem("W:");
              }
              if(x.exists())
              {
                  drive_combobox.addItem("X:");
              }
               if(y.exists())
              {
                  drive_combobox.addItem("Y:");
              }
             if(z.exists())
              {
                  drive_combobox.addItem("Z:");
                  
              }
              else
              {
                 // JOptionPane.showMessageDialog(null,"Could'nt detect drives");
              }
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        drive_combobox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        startbuttonimage = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        drive_combobox.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        drive_combobox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        drive_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drive_comboboxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checking_drives/close_small.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Remove Shortcut Viruses Permanently");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("     Selected Affected Drive");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        startbuttonimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checking_drives/startgif.gif"))); // NOI18N
        startbuttonimage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startbuttonimageMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("SMART SCAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 784, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(drive_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addContainerGap(159, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(startbuttonimage, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drive_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startbuttonimage, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void drive_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drive_comboboxActionPerformed
     startbuttonimage.setVisible(true);
    }//GEN-LAST:event_drive_comboboxActionPerformed

    private void startbuttonimageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startbuttonimageMouseClicked

          File a=new File("A:");
         File b=new File("B:");
         File c=new File("C:");
         File d=new File("D:");
         File edrive=new File("E:");
         File f=new File("F:");
         File g=new File("G:");
         File h=new File("H:");
         File i=new File("I:");
         File j=new File("J:");
         File k=new File("K:");
         File l=new File("L:");
         File m=new File("M:");
         File n=new File("N:");
         File o=new File("O:");
         File p=new File("P:");
         File q=new File("Q:");
         File r=new File("R:");
         File s=new File("S:");
         File t=new File("T:");
         File u=new File("U:");
         File v=new File("V:");
         File w=new File("W:");
         File x=new File("X:");
         File y=new File("Y:");
         File z=new File("Z:");
           Desktop desktop=Desktop.getDesktop();
        String drive=drive_combobox.getSelectedItem().toString();
        
       
        //executing command for deletting shortcuts
        
        
        try
        {
            ProcessBuilder builder1 = new ProcessBuilder("cmd.exe", "/c",drive);
            
             ProcessBuilder builder2 = new ProcessBuilder("cmd.exe", "/c", "attrib -s -r -h *.* /s /d /l");
        
        builder1.redirectErrorStream(true);
        builder2.redirectErrorStream(true);
        Process pr1;
        Process pr2;
        try {
            pr1 = builder1.start();
             pr2 = builder2.start();
             
             
     
        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Administrative Issues");
        }
        
            
        }
        catch(Exception ed)
        {
           JOptionPane.showMessageDialog(null,"Administrative Issues");
        }
        
        
        
      loading_frame lf=new loading_frame();
      this.setVisible(false);
      lf.setVisible(true);
      timer=new Timer(500,new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
            loading_frame lf=new loading_frame();
            Available_Drives ad=new Available_Drives();
            
           
              count++;
              
              if(count==5)
              {
                 lf.setVisible(false); 
                 ad.setVisible(true);
                 timer.stop();
                 String drive=drive_combobox.getSelectedItem().toString();
                  JOptionPane.showMessageDialog(null,"Scan successfully finished");
                  int option=JOptionPane.showConfirmDialog(null,"Do you want to open the "+ drive +" drive","Open "+drive+" drive",JOptionPane.YES_NO_OPTION);
                  if(option==0) 
                  {
                                     if(drive.equals("A:"))
        {
             try {
                 desktop.open(a);
               
             } catch (IOException ex) {
               
             }
        }
          
        if(drive.equals("B:"))
        {
             try {
                 desktop.open(b);
                 
             } catch (IOException ex) {
                
             }
        }
         if(drive.equals("C:"))
        {
             try {
                 desktop.open(c);
                
             } catch (IOException ex) {
                
             }
        }
          if(drive.equals("D:"))
        {
             try {
                 desktop.open(d);
                 
             } catch (IOException ex) {
                
             }
        }
           if(drive.equals("E:"))
        {
             try {
                 desktop.open(edrive);
                
             } 
             catch (Exception ex) {
                
             }
        }
            if(drive.equals("F:"))
        {
             try {
                 desktop.open(f);
                 
             } catch (IOException ex) {
                
             }
        }
             if(drive.equals("G:"))
        {
             try {
                 desktop.open(g);
               
                 
             } catch (IOException ex) {
                
             }
        }
              if(drive.equals("H:"))
        {
             try {
                 desktop.open(h);
                
             } catch (IOException ex) {
                
             }
        }
               if(drive.equals("I:"))
        {
             try {
                 desktop.open(i);
                
             } catch (IOException ex) {
                
             }
        }
                if(drive.equals("J:"))
        {
             try {
                 desktop.open(j);
                
             } catch (IOException ex) {
                
             }
        }
                 if(drive.equals("K:"))
        {
             try {
                 desktop.open(k);
                
             } catch (IOException ex) {
                
             }
        }
                  if(drive.equals("L:"))
        {
             try {
                 desktop.open(l);
                
             } catch (IOException ex) {
                
             }
        }
                   if(drive.equals("M:"))
                       
        {
             try {
                 desktop.open(m);
                 
             } catch (IOException ex) {
                
             }
        }
                    if(drive.equals("N:"))
        {
             try {
                 desktop.open(n);
                 
             } catch (IOException ex) {
                
             }
        }
                     if(drive.equals("O:"))
        {
             try {
                 desktop.open(o);
                 
             } catch (IOException ex) {
                
             }
        }
                      if(drive.equals("P:"))
        {
             try {
                 desktop.open(p);
                
             } catch (IOException ex) {
                
             }
        }
                       if(drive.equals("Q:"))
        {
             try {
                 desktop.open(q);
                 
             } catch (IOException ex) {
                
             }
        }
                        if(drive.equals("R:"))
        {
             try {
                 desktop.open(r);
                 
             } catch (IOException ex) {
                
             }
        }
                         if(drive.equals("S:"))
        {
             try {
                 desktop.open(s);
                
             } catch (IOException ex) {
                
             }
        }
                          if(drive.equals("T:"))
        {
             try {
                 desktop.open(t);
                
             } catch (IOException ex) {
                
             }
        }
                           if(drive.equals("U:"))
        {
             try {
                 desktop.open(u);
                
             } catch (IOException ex) {
                
             }
        }
                            if(drive.equals("V:"))
        {
             try {
                 desktop.open(v);
                 
             } catch (IOException ex) {
                
             }
        }
                             if(drive.equals("W:"))
        {
             try {
                 desktop.open(w);
               
                
             } catch (IOException ex) {
                
             }
        }
                              if(drive.equals("X:"))
        {
             try {
                 desktop.open(x);
                
             } catch (IOException ex) {
                
             }
        }
                               if(drive.equals("Y:"))
        {
             try {
                 desktop.open(y);
                 
             } catch (IOException ex) {
                
             }
        }
                                if(drive.equals("Z:"))
        {
             try {
                 desktop.open(z);
                
             } catch (IOException ex) {
                
             }
        }
                      
                  }
                 
          
                  
              }
          }
      });
      timer.start();
       
    }//GEN-LAST:event_startbuttonimageMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        //startbuttonimage.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception{
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Available_Drives().setVisible(true);
            }
        });
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox drive_combobox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel startbuttonimage;
    // End of variables declaration//GEN-END:variables
}
