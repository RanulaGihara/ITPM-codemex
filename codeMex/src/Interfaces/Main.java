/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Analytics.Controller;
import Analytics.FileAnalyzer;
import Coupling.Coupling;
import Coupling.CouplingMain;
import Coupling.CustomFile;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.parser.TokenType.EOF;

/**
 *
 * @author nuwan
 */
public class Main extends javax.swing.JFrame {

    public static String filepath;
    ArrayList <CustomFile> fileList = new ArrayList<>();
    public FileAnalyzer analit = new FileAnalyzer();
    Controller ctrl = new Controller();
    AnalyzerForm anzf = new AnalyzerForm();
    CouplingMain cpMain;
    FileReader read;
    BufferedReader br;
    File fl;
    Coupling cp;
            
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setSize(1050,900);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        filNameField = new javax.swing.JTextField();
        FileTypeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CodeViewer = new javax.swing.JTextArea();
        NumOfLines = new javax.swing.JLabel();
        AnalyzeButton = new javax.swing.JButton();
        svmCheckBox = new javax.swing.JCheckBox();
        InheritanceCheckBox = new javax.swing.JCheckBox();
        CouplingCheckBox = new javax.swing.JCheckBox();
        ControlStructureCheckBox = new javax.swing.JCheckBox();
        FileBrowseButton = new javax.swing.JButton();
        selectedPathField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Number of Lines :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        filNameField.setEditable(false);
        filNameField.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        filNameField.setForeground(new java.awt.Color(102, 102, 102));
        filNameField.setText("File name");
        filNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(filNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 410, 30));

        FileTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FileTypeLabel.setText("--");
        getContentPane().add(FileTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        CodeViewer.setColumns(20);
        CodeViewer.setRows(5);
        jScrollPane1.setViewportView(CodeViewer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 480, 200));

        NumOfLines.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NumOfLines.setText("--");
        getContentPane().add(NumOfLines, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        AnalyzeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AnalyzeButton.setText("Analyze");
        AnalyzeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AnalyzeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AnalyzeButtonMouseExited(evt);
            }
        });
        AnalyzeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalyzeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AnalyzeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, -1, -1));

        svmCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        svmCheckBox.setText("Size , Variables and Method");
        getContentPane().add(svmCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 220, 20));

        InheritanceCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        InheritanceCheckBox.setText("Inheritance");
        getContentPane().add(InheritanceCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, -1, -1));

        CouplingCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CouplingCheckBox.setText("Coupling");
        getContentPane().add(CouplingCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, -1, -1));

        ControlStructureCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ControlStructureCheckBox.setText("Control Structures");
        getContentPane().add(ControlStructureCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, -1, -1));

        FileBrowseButton.setBackground(new java.awt.Color(0, 51, 153));
        FileBrowseButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FileBrowseButton.setForeground(new java.awt.Color(255, 255, 255));
        FileBrowseButton.setText("Browse");
        FileBrowseButton.setBorderPainted(false);
        FileBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileBrowseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FileBrowseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        selectedPathField.setEditable(false);
        selectedPathField.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        selectedPathField.setForeground(new java.awt.Color(102, 102, 102));
        selectedPathField.setText("Selected Fiile Path");
        selectedPathField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedPathFieldActionPerformed(evt);
            }
        });
        getContentPane().add(selectedPathField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 410, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/fb3ccc19-1903-43ef-a3f3-318f6e84d542_200x200.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 0, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("code complexity measuring tool");

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CodemEX");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Select Java file :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("File name :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("File Type :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnalyzeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnalyzeButtonMouseEntered

        AnalyzeButton.setForeground(Color.RED);
    }//GEN-LAST:event_AnalyzeButtonMouseEntered

    private void AnalyzeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnalyzeButtonMouseExited

        AnalyzeButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_AnalyzeButtonMouseExited

    private void AnalyzeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyzeButtonActionPerformed

        //Adding the code to arraylist
        ctrl.setStrArr(CodeViewer.getText().split("\\n"));
        
        String filename = fl.getName();
        CustomFile csFile = new CustomFile(filename);
        csFile.setFileName(filename);
        csFile.setFilePath(filepath);
        fileList.add(csFile);
        
        
        
        try {
            //Passing the code to Analyzeform Text Area
            anzf.getCodeText(filepath);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Calculating the complexity
        anzf.setVisible(true);
        
        //Calculating Code Complexity
        anzf.getDetails(ctrl.CodeAnalyzer(ctrl.getStrArr()));
        
        //Calculating Size Complexity
        try
        {
            anzf.getSizeComplexity(filepath);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        //Calculating Number of Variables
        anzf.getVariableAnalyze(ctrl.KeyWordAnalyzer(ctrl.getStrArr()));
        
        
        //Calculating Inheritance
        anzf.getInheritanceAnalyzer(ctrl.InheritanceAnalyzer(ctrl.getStrArr()));
        
        try {
            anzf.getVariableComplexity(ctrl.getStrArr(),filepath);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            //Calculating Method Complexity
            anzf.getMethodComplexity(filepath);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_AnalyzeButtonActionPerformed

    private void FileBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileBrowseButtonActionPerformed

        //Selecting the file from file explorer
        JFileChooser choose = new JFileChooser();
        File workingDir = new File(System.getProperty("user.dir"));
        choose.setCurrentDirectory((workingDir));
        choose.showOpenDialog(null);

        //Getting the absolute file path and file name to display
        fl = choose.getSelectedFile();
        filepath = fl.getAbsolutePath();
        String flname = fl.getName();
        selectedPathField.setText((filepath));
        filNameField.setText(flname);

        //Deciding whether if it is a Java file or C++ file
        if(filepath.toLowerCase().endsWith(".java"))
        {
            FileTypeLabel.setText("Java");
        }
        else if(filepath.toLowerCase().endsWith(".cpp"))
        {
            FileTypeLabel.setText("C++");
        }

        //Viewing the code in the text area
        try
        {
            read = new FileReader(filepath);
            br = new BufferedReader(read);
            CodeViewer.read(br, null);
            //br.close();
            CodeViewer.requestFocus();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }

        try
        {
            int lineCount;
            lineCount = analit.LineCounter(filepath);
            NumOfLines.setText(Integer.toString(lineCount));

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }

        //Control Structure Complexity
        try
        {
            anzf.getControlStructureConplexity(filepath);
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_FileBrowseButtonActionPerformed

    private void selectedPathFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedPathFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectedPathFieldActionPerformed

    private void filNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filNameFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalyzeButton;
    private javax.swing.JTextArea CodeViewer;
    private javax.swing.JCheckBox ControlStructureCheckBox;
    private javax.swing.JCheckBox CouplingCheckBox;
    private javax.swing.JButton FileBrowseButton;
    private javax.swing.JLabel FileTypeLabel;
    private javax.swing.JCheckBox InheritanceCheckBox;
    private javax.swing.JLabel NumOfLines;
    private javax.swing.JTextField filNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField selectedPathField;
    private javax.swing.JCheckBox svmCheckBox;
    // End of variables declaration//GEN-END:variables
}
