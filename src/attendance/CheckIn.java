/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.Timer;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CheckIn extends javax.swing.JFrame {

    private static String filePath, addingName = "null", chooseError;
    private static String idNum;
    private static boolean fileChosen = true;
    private static final int NAME_COL = 2;
    private static final int NUM_SHEETS = 4;
    private static final int ID_COL = 0, PAIDSTATUS_COL = 3, CHECKED_IN_COL = 4;
    private static final ArrayList<String> alreadyPaidAL = new ArrayList<>();
    private static FileInputStream file1;
    private static ArrayList<Sheet> sheets = new ArrayList();
    private static Workbook workbook;
    
    public CheckIn() {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jPaidTextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jNotPaidTextArea = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jCheckedInTextArea = new javax.swing.JTextArea();
        jInputField = new javax.swing.JFormattedTextField();
        jPaidLabel = new javax.swing.JLabel();
        jNotPaidLabel = new javax.swing.JLabel();
        jCheckedInLabel = new javax.swing.JLabel();
        jImageLabel = new javax.swing.JLabel();
        jInputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPaidTextArea.setEditable(false);
        jPaidTextArea.setColumns(20);
        jPaidTextArea.setRows(5);
        jPaidTextArea.setFocusable(false);
        jScrollPane3.setViewportView(jPaidTextArea);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jNotPaidTextArea.setEditable(false);
        jNotPaidTextArea.setColumns(20);
        jNotPaidTextArea.setRows(5);
        jNotPaidTextArea.setFocusable(false);
        jScrollPane4.setViewportView(jNotPaidTextArea);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jCheckedInTextArea.setEditable(false);
        jCheckedInTextArea.setColumns(20);
        jCheckedInTextArea.setRows(5);
        jCheckedInTextArea.setFocusable(false);
        jScrollPane5.setViewportView(jCheckedInTextArea);

        jInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInputFieldActionPerformed(evt);
            }
        });

        jPaidLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPaidLabel.setLabelFor(jPaidTextArea);
        jPaidLabel.setText("Paid");
        jPaidLabel.setFocusable(false);

        jNotPaidLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNotPaidLabel.setLabelFor(jNotPaidTextArea);
        jNotPaidLabel.setText("Not Paid");
        jNotPaidLabel.setFocusable(false);

        jCheckedInLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckedInLabel.setLabelFor(jCheckedInTextArea);
        jCheckedInLabel.setText("Already Checked In");
        jCheckedInLabel.setFocusable(false);

        jImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendance/SI.png"))); // NOI18N
        jImageLabel.setLabelFor(this);
        jImageLabel.setFocusable(false);

        jInputLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jInputLabel.setText("Scan ID Below");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jImageLabel)
                    .addComponent(jInputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPaidLabel)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNotPaidLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckedInLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPaidLabel)
                    .addComponent(jNotPaidLabel)
                    .addComponent(jCheckedInLabel)
                    .addComponent(jInputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jImageLabel)
                        .addGap(33, 33, 33))
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInputFieldActionPerformed
        try {
            // TODO add your handling code here:
            checkName();
        } catch (IOException ex) {
            Logger.getLogger(CheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jInputFieldActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Exit the application?");
        if (result == JOptionPane.OK_OPTION) 
        {
            try {
                FileOutputStream fileOut = new FileOutputStream(filePath);
                workbook.write(fileOut);
                fileOut.close();
                
            } catch (IOException ex) {
                Logger.getLogger(CheckIn.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);     
        }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) throws IOException, FileNotFoundException
    {
        try 
        {
            fileImport();
        } catch (IOException e) {
            //not entirely sure if setting it to false is needed
            fileChosen = false;
            confirmChoice();
        }
        
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
           
        if(fileChosen)
        {
            /* Create and display the form */
            //apparently this is a labda now, guess it works
            java.awt.EventQueue.invokeLater(() -> {
                new CheckIn().setVisible(true);
            });
        }   
    }
    
    private static void checkName() throws FileNotFoundException, IOException
    {
        idNum = jInputField.getText() + ".0";
        jInputField.setText("");
        
        for(Sheet sheet : sheets)
        {
            for (Row row : sheet)
            {
                String cell1 = row.getCell(ID_COL).toString();
                
                if(cell1.equals(idNum))
                {
                    Cell name = row.getCell(NAME_COL);
                    addingName = name.getStringCellValue();

                    String paidStatus = row.getCell(PAIDSTATUS_COL).toString();
                    
                    if(row.getCell(CHECKED_IN_COL).toString().equals("Checked In"))
                    {
                        jCheckedInTextArea.append(addingName + "\n");
                        
                        flashColor(Color.red, jCheckedInTextArea);
                    }else if(!paidStatus.equals(""))
                    {
                        jPaidTextArea.append(addingName + "\n");
                        row.getCell(CHECKED_IN_COL).setCellValue("Checked In");
                        alreadyPaidAL.add(addingName);
                        flashColor(Color.GREEN, jPaidTextArea);
                    } else 
                    {
                        jNotPaidTextArea.append(addingName + "\n");
                        row.getCell(CHECKED_IN_COL).setCellValue("Checked In");
                        flashColor(Color.red, jNotPaidTextArea);
                    }
                }
            }
        }
    }
    private static void flashColor(Color c, JTextArea ta)
    {
        ta.setBackground(c);
        Timer timer = new Timer(0, (ActionEvent listener) -> { ta.setBackground(Color.WHITE); });
        timer.setInitialDelay(500);
        timer.setRepeats(false);
        timer.start();
    }
    
    private static void fileImport() throws IOException
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
            confirmChoice();
        }

        file1 = new FileInputStream(new File(filePath));
        
        if(filePath.endsWith(".xls"))
            workbook = new HSSFWorkbook(file1);
        else if(filePath.endsWith(".xlsx"))
            workbook = new XSSFWorkbook(file1);
        
        for (int i = 0; i < NUM_SHEETS; i++) 
        {
            sheets.add(workbook.getSheetAt(i));
        }
    }
    
    private static void confirmChoice()
    {
        int choice = JOptionPane.showConfirmDialog(null, "Do You want to quit?", chooseError, JOptionPane.YES_NO_OPTION);
        
        //only tries filechooser again if they explicitly say they don't want to quit
        if(choice == JOptionPane.NO_OPTION)
        {
            try {
                fileImport();
            } catch (IOException ex) {
                Logger.getLogger(CheckIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCheckedInLabel;
    public static javax.swing.JTextArea jCheckedInTextArea;
    public static javax.swing.JLabel jImageLabel;
    private static javax.swing.JFormattedTextField jInputField;
    private javax.swing.JLabel jInputLabel;
    private javax.swing.JLabel jNotPaidLabel;
    private static javax.swing.JTextArea jNotPaidTextArea;
    private javax.swing.JLabel jPaidLabel;
    private static javax.swing.JTextArea jPaidTextArea;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
