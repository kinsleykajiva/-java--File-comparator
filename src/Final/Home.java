/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;
import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Kinsley Kajiva
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
//        test();
    }
//    global variables*******************************
     int lock=0;int checkifFolder=0;String pathTOa="";
//  *****************************************************  
    void test(){
    String a="C:\\Users\\Kinsley Kajiva\\Documents\\GitHub\\php-codesC";
    File file = new File(a);
           File [] thefiles=file.listFiles();
            for(File h:thefiles){getfilesDisplay.append(h.getName()+"\n");}
           //getfilesDisplay.setText(a);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        show1 = new javax.swing.JLabel();
        show2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        getfilesDisplay = new javax.swing.JTextArea();
        infomationbar = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kinsley's Comparator for Files");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jButton1.setText("Taget Folder");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Compar To");
        jButton2.setEnabled(false);
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton2MouseMoved(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete Files");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        getfilesDisplay.setColumns(20);
        getfilesDisplay.setRows(5);
        jScrollPane2.setViewportView(getfilesDisplay);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(show1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(show2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(show1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(show2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("", jPanel1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
            .addComponent(infomationbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infomationbar, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(572, 238));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseDragged
        // TODO add your handling code here:
       // infomationbar.setText("Select Folder that you will delet from if siler files are foound ");
    }//GEN-LAST:event_jButton1MouseDragged

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        // TODO add your handling code here:
         infomationbar.setText("Select Folder that you will delet from if similar files are found ");
    }//GEN-LAST:event_jButton1MouseMoved

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
         infomationbar.setText("");
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseMoved
 infomationbar.setText("Select Folder that you will compare too against TagetFolder ");
    }//GEN-LAST:event_jButton2MouseMoved
//*********************************************************************************************
     public void arrCompare(String []arr1,String [] arr2){        
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(arr1));
      //  System.out.println("Folder 1: " + list1);
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(arr2));
       // System.out.println("Folder 2: " + list2);
        list1.retainAll(list2);
       // list1.retainAll(list3);        
      //  for (String str : list1){           
           //  System.out.println("Commons: " + str);
            //getfilesDisplay
            // getfilesDisplay.append(str + System.getProperty("line.separator"));         
       // }
        File folder = new File(pathTOa);
                        for (String str : list1){      
                            // System.out.println("Commons: " + str);  
                            for (File file : folder.listFiles()) {
                             if (file.getName().matches(str)) {
                            file.delete();
                             // System.out.println("Path: " +  file.getPath());
                              }
                            }
                        }
                        JOptionPane.showMessageDialog(this,"Deteleted");
                        
        try {
            getfilesDisplay.setText("Deleted");
            Thread.sleep(2000);
             getfilesDisplay.setText("Deleted");
            Thread.sleep(2000);
            
             getfilesDisplay.setText("");
            show1.setText("");
            show2.setText("");
            
            
            // System.out.print("Do you wish to delete these files \n Yes\nNo:");
            // String choice=JOptionPane.showInputDialog("Type Yes to delet or No to do Nothing");
//        switch(choice){
//                    case "yes": 
//                                File folder = new File(pathTOa);
//                        for (String str : list1){
//                            // System.out.println("Commons: " + str);  
//                            for (File file : folder.listFiles()) {
//                             if (file.getName().matches(str)) {
//                            file.delete();
//                             // System.out.println("Path: " +  file.getPath());
//                              }
//                            }
//                        }
//                        JOptionPane.showMessageDialog(this,"Deteleted");
//                        getfilesDisplay.setText("");
//                break;
//                default:
//                    System.exit(0);
//                    break;                    
//        }
        } catch (InterruptedException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
          
     
    }
    void folderList(String path1,String path2){
    // create a file that is really a directory
    File folder = new File(path1);
     File folder2 = new File(path2);
 
    // get a listing of all files in the directory
    String[] filesInDir = folder.list();
     String[] filesInDir2 = folder2.list();
     
    // sort the list of files (optional)
   // String[] filesInDir_=Arrays.sort(filesInDir);
    //Arrays.sort(filesInDir2);
        arrCompare(filesInDir, filesInDir2);
        
    }
     void folderList_see(String path1,String path2){
    // create a file that is really a directory
    File folder = new File(path1);
     File folder2 = new File(path2);
 
    // get a listing of all files in the directory
    String[] filesInDir = folder.list();
     String[] filesInDir2 = folder2.list();
     
     for(String q:filesInDir){
     if(!q.contains(".")){//JOptionPane.showMessageDialog(this,"nop folder");
         
     checkifFolder=1;
     }
     }
     for(String q:filesInDir2){
     if(!q.contains(".")){//JOptionPane.showMessageDialog(this,"nop folder");
     checkifFolder=1;
     }
     }
    // sort the list of files (optional)
   // String[] filesInDir_=Arrays.sort(filesInDir);
    //Arrays.sort(filesInDir2);
     if(checkifFolder!=1){
        // JOptionPane.showMessageDialog(this,"nop folder");
        arrCompare_see(filesInDir, filesInDir2);
     }//else{
    // JOptionPane.showMessageDialog(this,"chose again folder");
    // }
    }
//    ***************************************************
     public void arrCompare_see(String []arr1,String [] arr2){        
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(arr1));       
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(arr2));
        if(list1.isEmpty()&&list1==null||list2.isEmpty()&&list2==null){
            JOptionPane.showMessageDialog(null,"No File Found Similar");    
        }else{
        
        list1.retainAll(list2); 
       //if(list1.retainAll(list2)){
         //  if(q.equals("")){}
       Object o=list1.retainAll(list2); 
       File foler=new File(pathTOa);
       File [] v=foler.listFiles();
       if(o.equals(v)){
           File[] l=v;
       for(File g:l){
        getfilesDisplay.append(l + System.getProperty("line.separator"));              
       }
       }
        for (String str : list1){  
            
          //  getfilesDisplay.append(str + System.getProperty("line.separator"));              
          getfilesDisplay.setEditable(false);   
        }
        getfilesDisplay.setEditable(false);   
       // fileCounter.setText("These are the replicates in a folder two");
       // JOptionPane.showMessageDialog(null,"Did You See This same files");          
           
      // }else{
        //  JOptionPane.showMessageDialog(null,"No File Found Similar");        
       }
    
   }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JFileChooser folderOpen = new JFileChooser();       
       folderOpen.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
       int response=folderOpen.showOpenDialog(this);      
       if(response==JFileChooser.APPROVE_OPTION){                      
           String FolderPath1=folderOpen.getSelectedFile().toString();
           File file = new File(FolderPath1);
           File [] thefiles=file.listFiles();
           if(file.list().length==0){           
              show1.setText( "Folder empty Choose A Folder with files to target");
             JOptionPane.showMessageDialog(null, "This Folder is Empty Please Choose another Folder "  ,"", JOptionPane.ERROR_MESSAGE);           
               lock=0;
              jButton3.setEnabled(false);
              jButton2.setEnabled(false);
             
            }else{
               
           if(file.list().length==1){
               show1.setText("Folder has one file only Choose A Folder with files to test on");
             JOptionPane.showMessageDialog(null, "This Folder is has one file only Please Choose another Folder "  ,"", JOptionPane.INFORMATION_MESSAGE);
               lock=0;
              jButton3.setEnabled(false);
              jButton2.setEnabled(false);
                      
           }else{
                show1.setText(FolderPath1);
                lock=1;
                this.pathTOa=FolderPath1;            
                jButton2.setEnabled(true);
               // String [] x=file.listFiles();
                //for(String s:file.list()){getfilesDisplay.setText(s);}
              //  for(File h:thefiles){getfilesDisplay.append(h.getName()+"\n");}
           
           }
       
       }
    }
    
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 JFileChooser folderOpen = new JFileChooser(); 
       folderOpen.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
       int response=folderOpen.showOpenDialog(this);      
       if(response==JFileChooser.APPROVE_OPTION){         
           String FolderPath2=folderOpen.getSelectedFile().toString();
           File file = new File(FolderPath2);           
            if(file.list().length==0&&lock==0){
            show1.setText("Folder empety Choose A Folder with files to test on");
             JOptionPane.showMessageDialog(null, "This Folder is Empty Please Choose another Folder "  ,"", JOptionPane.ERROR_MESSAGE);
            
              jButton3.setEnabled(false);
            }else{
                 if(file.list().length==1){
                  show2.setText("Folder has one file only Choose A Folder with files to test on");
             JOptionPane.showMessageDialog(null, "This Folder is has one file only Please Choose another Folder "  ,"", JOptionPane.INFORMATION_MESSAGE);
           
             lock=0;
              jButton3.setEnabled(false);
              //jButton2.setEnabled(false);
                 }else{           
                
                
            show2.setText(FolderPath2); 
             String FolderPath1=show1.getText();
             folderList_see(FolderPath1,FolderPath2);//pass it to folderList method
            jButton3.setEnabled(true);
            }
            }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String FolderPath1=show1.getText();
         String FolderPath2=show2.getText();
        folderList(FolderPath1,FolderPath2);//pass it to folderList method
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea getfilesDisplay;
    private javax.swing.JLabel infomationbar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel show1;
    private javax.swing.JLabel show2;
    // End of variables declaration//GEN-END:variables
}
