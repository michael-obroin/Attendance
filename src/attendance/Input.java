/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Input extends javax.swing.JFrame {

    static String filePath, addingName = "null", chooseError;
    static int idNum;
    static boolean fileChosen = true, endsWith;
    
    public Input() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        letIn = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        keepOut = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        notOnList = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        letInTitle = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        dontLetInTitle = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        notOnListTitle = new javax.swing.JTextArea();
        inputField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Scan the ID Below");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setAutoscrolls(false);
        jScrollPane2.setViewportView(jTextArea2);

        letIn.setEditable(false);
        letIn.setColumns(20);
        letIn.setRows(5);
        jScrollPane3.setViewportView(letIn);

        keepOut.setEditable(false);
        keepOut.setColumns(20);
        keepOut.setRows(5);
        jScrollPane4.setViewportView(keepOut);

        notOnList.setEditable(false);
        notOnList.setColumns(20);
        notOnList.setRows(5);
        jScrollPane5.setViewportView(notOnList);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        letInTitle.setEditable(false);
        letInTitle.setColumns(20);
        letInTitle.setRows(5);
        letInTitle.setText("Let in");
        jScrollPane6.setViewportView(letInTitle);

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        dontLetInTitle.setEditable(false);
        dontLetInTitle.setColumns(20);
        dontLetInTitle.setRows(5);
        dontLetInTitle.setText("Don't let in\n");
        jScrollPane7.setViewportView(dontLetInTitle);

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        notOnListTitle.setEditable(false);
        notOnListTitle.setColumns(20);
        notOnListTitle.setRows(5);
        notOnListTitle.setText("Not on the List");
        jScrollPane8.setViewportView(notOnListTitle);

        inputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(inputField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane5))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFieldActionPerformed
        try {
            // TODO add your handling code here:
            checkName();
        } catch (IOException ex) {
            Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inputFieldActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Exit the application?");
        if (result==JOptionPane.OK_OPTION) {
            System.exit(0);     
        }
    }//GEN-LAST:event_formWindowClosing

    
    
    private static void checkName() throws FileNotFoundException, IOException
    {
        //stores the input from the formatted text field
        idNum = Integer.parseInt(inputField.getText());
        
        //clears the input field
        inputField.setText("");
        
        //System.out.println(idNum);
        
         //start of reading excel file
        FileInputStream file = new FileInputStream(new File(filePath));
        
        HSSFWorkbook workbook = new HSSFWorkbook(file);
        HSSFSheet sheet = workbook.getSheetAt(0);
        
        for (Row row : sheet) 
        {
            Cell cell1 = row.getCell(0);
            
            if((int)cell1.getNumericCellValue() == idNum)
            {
                Cell lastName = row.getCell(1);
                Cell firstName = row.getCell(2);
                
                addingName = lastName.getStringCellValue() + " " + firstName.getStringCellValue();
                
                letIn.append(addingName);
                letIn.append("\n");
            }
            
        }
        
    }
    
    public static void main(String args[]) throws IOException, FileNotFoundException
    {
        //sets the file path as the file chosen  
        try 
        {
            fileImport();
        } catch (Exception e) {
            fileChosen = false;
            confirmChoice();
        }

        //System.out.println(filePath);
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        if(fileChosen)
        {
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Input().setVisible(true);
                }
            });
        }
        
    }
    
    public static void fileImport() throws IOException
    {   
        fileChosen = true;
        chooseError = "";
        
        //creates filechooser with desktop as default directory
        String userhome = System.getProperty("user.home");
        JFileChooser chooser = new JFileChooser(userhome + "\\Desktop");
        
        
        int status = chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();

        if (status != JFileChooser.APPROVE_OPTION)
        {
            //System.out.println("No File Chosen");
            fileChosen = false;
            chooseError = "No File Chosen";
        }
        
        //if the file doesn't end with .xls, restart filechooser
        if(fileChosen)
        {
          filePath = file.getAbsolutePath();
          
          if(!filePath.endsWith(".xls"))
          {
              chooseError = "Choose a file that ends with .xls";
              confirmChoice();
          }
          
        } else
        {
            confirmChoice();
        }
        
    }
    
    public static void confirmChoice()
    {
        int choice;
        choice = JOptionPane.showConfirmDialog(null, "Do You want to quit?", chooseError, JOptionPane.YES_NO_OPTION);
        
        //only tries filechooser again if they explicity say they don't want to quit
        if(choice == JOptionPane.NO_OPTION)
        {
            try {
                fileImport();
            } catch (IOException ex) {
                Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea dontLetInTitle;
    public static javax.swing.JFormattedTextField inputField;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea2;
    public static javax.swing.JTextArea keepOut;
    public static javax.swing.JTextArea letIn;
    private javax.swing.JTextArea letInTitle;
    public static javax.swing.JTextArea notOnList;
    private javax.swing.JTextArea notOnListTitle;
    // End of variables declaration//GEN-END:variables
}
