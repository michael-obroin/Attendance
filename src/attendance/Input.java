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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
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
        paid = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        notPaid = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        notOnList = new javax.swing.JTextArea();
        inputField = new javax.swing.JFormattedTextField();
        paidLabel = new javax.swing.JLabel();
        notPaidLabel = new javax.swing.JLabel();
        notOnListLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
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

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        paid.setEditable(false);
        paid.setColumns(20);
        paid.setRows(5);
        jScrollPane3.setViewportView(paid);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        notPaid.setEditable(false);
        notPaid.setColumns(20);
        notPaid.setRows(5);
        jScrollPane4.setViewportView(notPaid);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        notOnList.setEditable(false);
        notOnList.setColumns(20);
        notOnList.setRows(5);
        jScrollPane5.setViewportView(notOnList);

        inputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFieldActionPerformed(evt);
            }
        });

        paidLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        paidLabel.setLabelFor(paid);
        paidLabel.setText("Paid");

        notPaidLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        notPaidLabel.setLabelFor(notPaid);
        notPaidLabel.setText("Not Paid");

        notOnListLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        notOnListLabel.setLabelFor(notOnList);
        notOnListLabel.setText("Not on List");

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendance/SI.png"))); // NOI18N
        imageLabel.setLabelFor(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(inputField)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addComponent(imageLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paidLabel)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notPaidLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notOnListLabel)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(paidLabel)
                        .addComponent(notPaidLabel)
                        .addComponent(notOnListLabel))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(imageLabel))
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5))
                .addContainerGap())
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
        if (result == JOptionPane.OK_OPTION) 
        {
            System.exit(0);     
        }
    }//GEN-LAST:event_formWindowClosing

    private static void checkName() throws FileNotFoundException, IOException
    {
        //if the input is found on the list this is set to true
        boolean foundID = false;
        
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
        //for (int i = 0; i < numRows; i++)
        {
            Cell cell1 = row.getCell(0);
            
            if((int)cell1.getNumericCellValue() == idNum)
            {
                //foundID = true;
                Cell lastName = row.getCell(1);
                Cell firstName = row.getCell(2);
                Cell grade = row.getCell(4);
                
                addingName = (int)grade.getNumericCellValue() + "    " + lastName.getStringCellValue() + " " + firstName.getStringCellValue();
                
                String paidStatus = row.getCell(3).toString();
                
                switch (paidStatus) {
                    case "Y":
                        paid.append(addingName);
                        paid.append("\n");
                        break;
                    case "N":
                        notPaid.append(addingName);
                        notPaid.append("\n");
                        break;
                    default:
                        notOnList.append(addingName);
                        notOnList.append("\n");
                        break;
                }
            }
        }
//        if(foundID)
//        {
//            notOnList.append(Integer.toString(idNum));
//            notOnList.append("\n");
//        }
    }
    
    public static void main(String args[]) throws IOException, FileNotFoundException
    {
        //sets the file path as the file chosen  
        try 
        {
            fileImport();
        } catch (Exception e) {
            //not entirely sure if setting it to false is needed
            fileChosen = false;
            confirmChoice();
        }
        
        //debugging
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
            //apparently this is a labda now, guess it works
            java.awt.EventQueue.invokeLater(() -> {
                new Input().setVisible(true);
            });
        }
    }
    
    public static void fileImport() throws IOException
    {   
        //variable assignment
        fileChosen = true;
        chooseError = "";
        
        //creates filechooser with desktop as default directory
        String userhome = System.getProperty("user.home");
        JFileChooser chooser = new JFileChooser(userhome + "\\Desktop");
        
        //opens filechooser, assigns choice to status
        int status = chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();

        //if they don't click approve, assume no file chosen
        if (status != JFileChooser.APPROVE_OPTION)
        {
            //System.out.println("No File Chosen");
            fileChosen = false;
            chooseError = "No File Chosen";
        }
        
        //if a file is chosen but not ending in .xls, restart
        if(fileChosen)
        {
            filePath = file.getAbsolutePath();
          
            if(!filePath.endsWith(".xls"))
            {
              chooseError = "Choose a file that ends with .xls";
              confirmChoice();
            }
        }
    }
    
    public static void confirmChoice()
    {
        int choice = JOptionPane.showConfirmDialog(null, "Do You want to quit?", chooseError, JOptionPane.YES_NO_OPTION);
        
        //only tries filechooser again if they explicitly say they don't want to quit
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
    public static javax.swing.JLabel imageLabel;
    public static javax.swing.JFormattedTextField inputField;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea2;
    public static javax.swing.JTextArea notOnList;
    private javax.swing.JLabel notOnListLabel;
    public static javax.swing.JTextArea notPaid;
    private javax.swing.JLabel notPaidLabel;
    public static javax.swing.JTextArea paid;
    private javax.swing.JLabel paidLabel;
    // End of variables declaration//GEN-END:variables
}
