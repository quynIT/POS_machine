
import database.DatabaseHelper;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import models.Student;
import models.StudentDAO;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Date;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER
 */

public class JavaPOS extends javax.swing.JFrame {
    StudentDAO dao = new StudentDAO();
    String strFind = "";
    /**
     * Creates new form JavaPOS
     */
    public JavaPOS() {
        initComponents();
        fillTable();
    }    
    public void drwobill(){
        jTextPane1.setText("                       BÁCH        HÓA        XANH                 \n");
        jTextPane1.setText(jTextPane1.getText()+"                               499 Lê Văn Việt                 \n,");
        jTextPane1.setText(jTextPane1.getText()+"                              Quận THỦ ĐỨC                 \n\n");
        jTextPane1.setText(jTextPane1.getText()+"                                  HÓA ĐƠN                 \n");
        jTextPane1.setText(jTextPane1.getText()+"--------------------------------------------------------------------\n");
        jTextPane1.setText(jTextPane1.getText()+"Mã SP \t Tên SP    \t\t     Giá   \t Số Lượng\n");
        jTextPane1.setText(jTextPane1.getText()+"--------------------------------------------------------------------\n");
        DefaultTableModel dt = (DefaultTableModel)jTable1.getModel();
        for(int i = 0;i< jTable1.getRowCount();i++){
          String itm = dt.getValueAt(i,0).toString();  
          String qt = dt.getValueAt(i,1).toString();  
          String prc = dt.getValueAt(i,2).toString();  
          String pc = dt.getValueAt(i,3).toString();  
          jTextPane1.setText(jTextPane1.getText()+itm+ "\t"  +qt+"         "+prc+ "\t      " +pc+ "\n");
        }
        jTextPane1.setText(jTextPane1.getText()+"--------------------------------------------------------------------\n");
        jTextPane1.setText(jTextPane1.getText()+"Tổng tiền: \t\t\t"+jtxtSubTotal.getText()+"\n");
        jTextPane1.setText(jTextPane1.getText()+"Khuyến Mãi: \t\t"+jtxtTax.getText()+"\n");
        jTextPane1.setText(jTextPane1.getText()+"Tổng Thanh Toán: \t\t"+jtxtTotal.getText()+"\n");
        jTextPane1.setText(jTextPane1.getText()+"--------------------------------------------------------------------\n");
        jTextPane1.setText(jTextPane1.getText()+"Tiền nhận:   "+jtxtDisplay.getText()+""); 
        jTextPane1.setText(jTextPane1.getText()+"\tHình Thức:Tiền Mặt\n");
        jTextPane1.setText(jTextPane1.getText()+"Tiền Trả: \t\t"+jtxtChange.getText()+"\n");
        jTextPane1.setText(jTextPane1.getText()+"--------------------------------------------------------------------\n");
        
        Date dd = new Date();
        SimpleDateFormat datef = new SimpleDateFormat("2023-5-25");
        SimpleDateFormat timef = new SimpleDateFormat("  14:30 ");
        String date = datef.format(dd);
        String time = timef.format(dd);
        
        jTextPane1.setText(jTextPane1.getText()+"Date:"+date+"\t\tTime:"+time+"\n");
        jTextPane1.setText(jTextPane1.getText()+"***********************************************\n");
        jTextPane1.setText(jTextPane1.getText()+"\t Thank you for coming to BachHoaXanh \n");
        jTextPane1.setText(jTextPane1.getText()+"***********************************************\n");
        jTextPane1.setText(jTextPane1.getText()+"\t Email: trungquyn@gamil.commmmmm\n");
        jTextPane1.setText(jTextPane1.getText()+"\t Contact: 0329999999\n");
    }
    
    public void fillTable(){
    DefaultTableModel tbModel = (DefaultTableModel) tbStudent.getModel();
    tbModel.setRowCount(0);
    for (Student st : dao.findStudentByID(strFind)){
        Object dataRow[] = new Object[3];
        dataRow[0] = st.getMASP();
        dataRow[1] = st.getTenSP();
        dataRow[2] = st.getDongia();
        tbModel.addRow(dataRow);
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

        jPanel199 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbStudent = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel70 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel103 = new javax.swing.JPanel();
        jPanel104 = new javax.swing.JPanel();
        jPanel105 = new javax.swing.JPanel();
        jPanel106 = new javax.swing.JPanel();
        jPanel107 = new javax.swing.JPanel();
        jPanel108 = new javax.swing.JPanel();
        jPanel109 = new javax.swing.JPanel();
        jPanel110 = new javax.swing.JPanel();
        jPanel111 = new javax.swing.JPanel();
        jPanel112 = new javax.swing.JPanel();
        jPanel113 = new javax.swing.JPanel();
        jPanel114 = new javax.swing.JPanel();
        jPanel115 = new javax.swing.JPanel();
        jPanel116 = new javax.swing.JPanel();
        jPanel117 = new javax.swing.JPanel();
        jPanel118 = new javax.swing.JPanel();
        jPanel119 = new javax.swing.JPanel();
        jPanel120 = new javax.swing.JPanel();
        jPanel121 = new javax.swing.JPanel();
        jPanel122 = new javax.swing.JPanel();
        jPanel123 = new javax.swing.JPanel();
        jPanel124 = new javax.swing.JPanel();
        jPanel125 = new javax.swing.JPanel();
        jPanel126 = new javax.swing.JPanel();
        jPanel127 = new javax.swing.JPanel();
        jPanel128 = new javax.swing.JPanel();
        jPanel129 = new javax.swing.JPanel();
        jPanel130 = new javax.swing.JPanel();
        jPanel131 = new javax.swing.JPanel();
        jPanel132 = new javax.swing.JPanel();
        jPanel133 = new javax.swing.JPanel();
        jPanel134 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnPay = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnRemove = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jPanel79 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jPanel95 = new javax.swing.JPanel();
        jPanel96 = new javax.swing.JPanel();
        jPanel97 = new javax.swing.JPanel();
        jPanel98 = new javax.swing.JPanel();
        jPanel99 = new javax.swing.JPanel();
        jPanel100 = new javax.swing.JPanel();
        jPanel101 = new javax.swing.JPanel();
        jPanel102 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtTotal = new javax.swing.JTextField();
        jtxtSubTotal = new javax.swing.JTextField();
        jtxtTax = new javax.swing.JTextField();
        jPanel135 = new javax.swing.JPanel();
        jPanel136 = new javax.swing.JPanel();
        jPanel137 = new javax.swing.JPanel();
        jPanel138 = new javax.swing.JPanel();
        jPanel139 = new javax.swing.JPanel();
        jPanel140 = new javax.swing.JPanel();
        jPanel141 = new javax.swing.JPanel();
        jPanel142 = new javax.swing.JPanel();
        jPanel143 = new javax.swing.JPanel();
        jPanel144 = new javax.swing.JPanel();
        jPanel145 = new javax.swing.JPanel();
        jPanel146 = new javax.swing.JPanel();
        jPanel147 = new javax.swing.JPanel();
        jPanel148 = new javax.swing.JPanel();
        jPanel149 = new javax.swing.JPanel();
        jPanel150 = new javax.swing.JPanel();
        jPanel151 = new javax.swing.JPanel();
        jPanel152 = new javax.swing.JPanel();
        jPanel153 = new javax.swing.JPanel();
        jPanel154 = new javax.swing.JPanel();
        jPanel155 = new javax.swing.JPanel();
        jPanel156 = new javax.swing.JPanel();
        jPanel157 = new javax.swing.JPanel();
        jPanel158 = new javax.swing.JPanel();
        jPanel159 = new javax.swing.JPanel();
        jPanel160 = new javax.swing.JPanel();
        jPanel161 = new javax.swing.JPanel();
        jPanel162 = new javax.swing.JPanel();
        jPanel163 = new javax.swing.JPanel();
        jPanel164 = new javax.swing.JPanel();
        jPanel165 = new javax.swing.JPanel();
        jPanel166 = new javax.swing.JPanel();
        jPanel167 = new javax.swing.JPanel();
        jPanel168 = new javax.swing.JPanel();
        jPanel169 = new javax.swing.JPanel();
        jPanel170 = new javax.swing.JPanel();
        jPanel171 = new javax.swing.JPanel();
        jPanel172 = new javax.swing.JPanel();
        jPanel173 = new javax.swing.JPanel();
        jPanel174 = new javax.swing.JPanel();
        jPanel175 = new javax.swing.JPanel();
        jPanel176 = new javax.swing.JPanel();
        jPanel177 = new javax.swing.JPanel();
        jPanel178 = new javax.swing.JPanel();
        jPanel179 = new javax.swing.JPanel();
        jPanel180 = new javax.swing.JPanel();
        jPanel181 = new javax.swing.JPanel();
        jPanel182 = new javax.swing.JPanel();
        jPanel183 = new javax.swing.JPanel();
        jPanel184 = new javax.swing.JPanel();
        jPanel185 = new javax.swing.JPanel();
        jPanel186 = new javax.swing.JPanel();
        jPanel187 = new javax.swing.JPanel();
        jPanel188 = new javax.swing.JPanel();
        jPanel189 = new javax.swing.JPanel();
        jPanel190 = new javax.swing.JPanel();
        jPanel191 = new javax.swing.JPanel();
        jPanel192 = new javax.swing.JPanel();
        jPanel193 = new javax.swing.JPanel();
        jPanel194 = new javax.swing.JPanel();
        jPanel195 = new javax.swing.JPanel();
        jPanel196 = new javax.swing.JPanel();
        jPanel197 = new javax.swing.JPanel();
        jPanel198 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtDisplay = new javax.swing.JTextField();
        jtxtChange = new javax.swing.JTextField();
        jcboPayment = new javax.swing.JComboBox<>();
        jtxtBarCode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel199Layout = new javax.swing.GroupLayout(jPanel199);
        jPanel199.setLayout(jPanel199Layout);
        jPanel199Layout.setHorizontalGroup(
            jPanel199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel199Layout.setVerticalGroup(
            jPanel199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nhập mã sản phẩm cần thanh toán ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 50));

        txtFind.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFind.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFindCaretUpdate(evt);
            }
        });
        txtFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindActionPerformed(evt);
            }
        });
        jPanel2.add(txtFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 40));

        btnFind.setBackground(new java.awt.Color(51, 153, 255));
        btnFind.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFind.setText(" Search");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel2.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 100, 40));

        tbStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Đơn Giá"
            }
        ));
        tbStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbStudentMouseClicked(evt);
            }
        });
        tbStudent.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tbStudentComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(tbStudent);
        if (tbStudent.getColumnModel().getColumnCount() > 0) {
            tbStudent.getColumnModel().getColumn(1).setResizable(false);
            tbStudent.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, 340));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 470));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jTextPane1);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 410, 440));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 450, 460));

        jPanel70.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel70.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel18.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel14.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel24.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel22.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel26.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel28.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel26.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel22.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel30.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel32.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel30.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel34.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel36.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel34.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel30.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel22.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel1.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel103.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel104.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel104.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel103.add(jPanel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel105.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel105.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel106.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel106.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel105.add(jPanel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel103.add(jPanel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel107.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel107.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel108.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel108.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel107.add(jPanel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel109.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel109.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel110.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel110.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel109.add(jPanel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel107.add(jPanel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel103.add(jPanel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel111.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel111.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel112.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel112.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel111.add(jPanel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel113.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel113.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel114.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel114.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel113.add(jPanel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel111.add(jPanel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel115.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel115.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel116.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel116.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel115.add(jPanel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel117.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel117.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel118.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel118.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel117.add(jPanel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel115.add(jPanel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel111.add(jPanel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel103.add(jPanel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel119.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel119.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel120.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel120.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel119.add(jPanel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel121.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel121.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel122.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel122.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel121.add(jPanel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel119.add(jPanel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel123.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel123.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel124.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel124.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel123.add(jPanel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel125.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel125.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel126.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel126.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel125.add(jPanel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel123.add(jPanel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel119.add(jPanel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel127.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel127.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel128.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel128.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel127.add(jPanel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel129.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel129.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel130.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel130.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel129.add(jPanel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel127.add(jPanel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel131.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel131.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel132.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel132.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel131.add(jPanel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel133.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel133.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel134.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel134.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel133.add(jPanel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel131.add(jPanel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel127.add(jPanel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel119.add(jPanel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel103.add(jPanel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel1.add(jPanel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 390, 270));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnExit.setText("Thoát");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 400, 50));

        jbtnPay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPay.setText("Pay");
        jbtnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPayActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 50));

        jbtnPrint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 50));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 180, 50));

        jbtnRemove.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnRemove.setText("Remove");
        jbtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 180, 50));

        jPanel70.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 440, 200));

        jPanel38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel38.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel40.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel38.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel42.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel44.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel42.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel38.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel46.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel48.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel46.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel50.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel52.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel50.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel46.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel38.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel54.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel54.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel56.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel57.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel56.add(jPanel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel54.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel58.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel59.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel58.add(jPanel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel60.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel61.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel60.add(jPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel58.add(jPanel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel54.add(jPanel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel62.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel63.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel62.add(jPanel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel64.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel65.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel65.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel64.add(jPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel62.add(jPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel66.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel66.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel67.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel67.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel66.add(jPanel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel68.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel68.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel69.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel69.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel68.add(jPanel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel66.add(jPanel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel62.add(jPanel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel54.add(jPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel38.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel71.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel71.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel72.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel72.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel71.add(jPanel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel73.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel73.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel74.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel74.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel73.add(jPanel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel71.add(jPanel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel75.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel75.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel76.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel76.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel75.add(jPanel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel77.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel77.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel78.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel78.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel77.add(jPanel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel75.add(jPanel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel71.add(jPanel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel79.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel79.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel80.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel79.add(jPanel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel81.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel81.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel82.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel82.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel81.add(jPanel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel79.add(jPanel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel83.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel83.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel84.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel84.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel83.add(jPanel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel85.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel85.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel86.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel86.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel85.add(jPanel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel83.add(jPanel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel79.add(jPanel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel71.add(jPanel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel87.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel87.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel88.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel88.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel87.add(jPanel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel89.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel89.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel90.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel90.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel89.add(jPanel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel87.add(jPanel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel91.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel91.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel92.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel92.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel91.add(jPanel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel93.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel93.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel94.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel94.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel93.add(jPanel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel91.add(jPanel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel87.add(jPanel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel95.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel95.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel96.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel96.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel95.add(jPanel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel97.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel97.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel98.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel98.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel97.add(jPanel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel95.add(jPanel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel99.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel99.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel100.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel100.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel99.add(jPanel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel101.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel102.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel102.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel101.add(jPanel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel99.add(jPanel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel95.add(jPanel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel87.add(jPanel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel71.add(jPanel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel38.add(jPanel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 440, 270));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("T.Thanh Toán");
        jPanel38.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Tổng giá");
        jPanel38.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Khuyến Mãi");
        jPanel38.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jtxtTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel38.add(jtxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 210, -1));

        jtxtSubTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtSubTotal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtxtSubTotalCaretUpdate(evt);
            }
        });
        jtxtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSubTotalActionPerformed(evt);
            }
        });
        jPanel38.add(jtxtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 210, -1));

        jtxtTax.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTaxActionPerformed(evt);
            }
        });
        jPanel38.add(jtxtTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 210, -1));

        jPanel70.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 410, 200));

        jPanel135.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel135.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel136.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel136.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel135.add(jPanel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel137.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel137.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel138.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel138.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel137.add(jPanel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel135.add(jPanel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel139.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel139.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel140.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel140.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel139.add(jPanel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel141.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel141.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel142.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel142.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel141.add(jPanel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel139.add(jPanel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel135.add(jPanel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel143.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel143.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel144.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel144.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel143.add(jPanel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel145.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel145.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel146.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel146.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel145.add(jPanel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel143.add(jPanel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel147.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel147.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel148.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel148.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel147.add(jPanel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel149.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel149.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel150.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel150.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel149.add(jPanel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel147.add(jPanel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel143.add(jPanel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel135.add(jPanel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel151.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel151.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel152.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel152.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel151.add(jPanel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel153.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel153.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel154.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel154.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel153.add(jPanel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel151.add(jPanel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel155.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel155.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel156.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel156.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel155.add(jPanel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel157.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel157.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel158.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel158.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel157.add(jPanel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel155.add(jPanel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel151.add(jPanel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel159.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel159.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel160.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel160.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel159.add(jPanel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel161.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel161.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel162.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel162.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel161.add(jPanel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel159.add(jPanel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel163.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel163.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel164.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel164.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel163.add(jPanel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel165.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel165.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel166.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel166.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel165.add(jPanel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel163.add(jPanel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel159.add(jPanel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel151.add(jPanel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel135.add(jPanel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel167.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel167.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel168.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel168.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel167.add(jPanel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel169.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel169.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel170.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel170.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel169.add(jPanel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel167.add(jPanel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel171.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel171.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel172.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel172.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel171.add(jPanel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel173.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel173.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel174.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel174.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel173.add(jPanel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel171.add(jPanel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel167.add(jPanel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel175.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel175.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel176.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel176.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel175.add(jPanel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel177.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel177.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel178.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel178.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel177.add(jPanel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel175.add(jPanel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel179.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel179.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel180.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel180.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel179.add(jPanel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel181.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel181.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel182.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel182.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel181.add(jPanel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel179.add(jPanel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel175.add(jPanel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel167.add(jPanel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel183.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel183.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel184.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel184.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel183.add(jPanel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel185.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel185.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel186.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel186.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel185.add(jPanel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel183.add(jPanel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel187.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel187.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel188.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel188.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel187.add(jPanel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel189.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel189.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel190.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel190.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel189.add(jPanel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel187.add(jPanel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel183.add(jPanel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel191.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel191.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel192.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel192.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel191.add(jPanel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel193.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel193.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel194.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel194.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel193.add(jPanel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel191.add(jPanel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel195.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel195.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel196.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel196.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel195.add(jPanel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel197.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel197.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel198.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel198.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel197.add(jPanel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel195.add(jPanel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel191.add(jPanel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel183.add(jPanel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel167.add(jPanel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 1380, 310));

        jPanel135.add(jPanel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 390, 270));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Tiền trả");
        jPanel135.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Tiền Nhận");
        jPanel135.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Hình thức");
        jPanel135.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 40));

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });
        jPanel135.add(jtxtDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 210, -1));

        jtxtChange.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtChangeActionPerformed(evt);
            }
        });
        jPanel135.add(jtxtChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 210, -1));

        jcboPayment.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcboPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền Mặt", "Momo", "Thẻ Ngân Hàng", " " }));
        jcboPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboPaymentActionPerformed(evt);
            }
        });
        jPanel135.add(jcboPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 210, 40));

        jPanel70.add(jPanel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 470, 200));

        getContentPane().add(jPanel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 1380, 250));

        jtxtBarCode.setFont(new java.awt.Font("IDAutomationHC39M", 0, 18)); // NOI18N
        getContentPane().add(jtxtBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 400, 70));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Giá (Nghìn)", "Số Lượng "
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 400, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void ItemCost()
    {
        double sum = 0;
        for (int i=0 ; i< jTable1.getRowCount(); i++){
            sum = sum + Double.parseDouble(jTable1.getValueAt(i,2).toString())*Double.parseDouble(jTable1.getValueAt(i,3).toString());
        }
        jtxtSubTotal.setText(Double.toString(sum));
        double cTotal1 = Double.parseDouble(jtxtSubTotal.getText());
        
        double cTax = (cTotal1 * 3.9)/100;
        
        String iTaxTotal = String.format(" %.3f đ",cTax);
        jtxtTax.setText(iTaxTotal);
        
        String iSubTotal = String.format(" %.3f đ",cTotal1);
        jtxtSubTotal.setText(iSubTotal);
        
        String iTotal = String.format(" %.3f đ", cTotal1 - cTax);
        jtxtTotal.setText(iTotal);
        
        String BarCode = String.format("Total is %.3f",cTotal1 - cTax);
        jtxtBarCode .setText(BarCode);
        drwobill();
    }
    
    
     public void Change()
    {
        double sum = 0;
//        double tax = 3.9;
        double cash = Double.parseDouble(jtxtDisplay.getText());
        
        for (int i=0 ; i< jTable1.getRowCount(); i++){
            sum = Double.parseDouble(jTable1.getValueAt(i,2).toString())*Double.parseDouble(jTable1.getValueAt(i,3).toString()) + sum;
        }
        double cTax = (sum * 3.9)/100;
        double cChange = (cash - (sum - cTax));
        
        String ChangeGiven = String.format(" %.3f đ",cChange);
        jtxtChange.setText(ChangeGiven);
        drwobill();
    }
    private void jcboPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcboPaymentActionPerformed

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDisplayActionPerformed

    private void jtxtChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtChangeActionPerformed
private JFrame frame;

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Xác nhận nếu bạn muốn thoát ","Điểm bán hàng",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
        System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPayActionPerformed
        if (jcboPayment.getSelectedItem().equals("Tiền Mặt"))
        {
            Change();
        }
        else{
            jtxtChange.setText("");
            jtxtDisplay.setText(" ");
        }
    }//GEN-LAST:event_jbtnPayActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jtxtChange.setText("");
        jtxtTax.setText("");
        jtxtTotal.setText("");
        jtxtSubTotal.setText("");
        jtxtDisplay.setText("");
        jtxtBarCode.setText("");
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
//        MessageFormat header = new MessageFormat ("Danh sách đơn hàng ");
//        MessageFormat footer = new MessageFormat ("Page {0, number , integer}");
//        try 
//        {
//            jTable1.print( JTable.PrintMode.NORMAL, header,footer);
//        }
//        catch (java.awt.print.PrinterException e)
//        {
//            System.err.format("No printer found",e.getMessage());
//        }   
//         
        try{
            boolean complete = jTextPane1.print();
            if(complete){
            JOptionPane.showMessageDialog(null,"Done printing","Information",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Printing","Printer",JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(PrinterException e){
        JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jbtnPrintActionPerformed

    private void jbtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        int RemoveItem = jTable1.getSelectedRow();
        if (RemoveItem >= 0)
        {
            model.removeRow(RemoveItem);
        }
        ItemCost();
        
        if(jcboPayment.getSelectedItem().equals("Tiền Mặt"))
        {
            Change();
        }
        else
        {
            jtxtChange.setText("");
            jtxtDisplay.setText("");
        }
    }//GEN-LAST:event_jbtnRemoveActionPerformed

    private void txtFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        strFind = txtFind.getText();
        fillTable();
    }//GEN-LAST:event_btnFindActionPerformed

    private void tbStudentComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tbStudentComponentShown
//        showDuLieu();
    }//GEN-LAST:event_tbStudentComponentShown
    public static String SoLuongMua;
    public static String Qty;;
    private void tbStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStudentMouseClicked
        TableModel model1 = tbStudent.getModel();
        int indexs[] = tbStudent.getSelectedRows();
        Object [] row = new Object[4];
        DefaultTableModel model2 = (DefaultTableModel)jTable1.getModel();
        
        for (int i = 0; i< indexs.length; i++){
            row [0] = model1.getValueAt(indexs[i], 0);
            row [1] = model1.getValueAt(indexs[i], 1);
            row [2] = model1.getValueAt(indexs[i], 2);
            
        Qty = JOptionPane.showInputDialog(null,"VUI LÒNG NHẬP SỐ LƯỢNG","1");
        System.out.println(Qty);
            row[3]= Qty;
            model2.addRow(row);
        }
//        jTable1.setVisible(true);
//        if(evt.getClickCount() >= 2){
//            add jd = new add(this,true);
//            jd.setVisible(true);
//        System.out.println("SL:"+SoLuongMua+ "-Ghi Chú" +GhiChu);
//        jTable1(model2.addRow(row));
        ItemCost();
        
//        new add().setVisible(true);
    }//GEN-LAST:event_tbStudentMouseClicked

    private void jtxtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSubTotalActionPerformed

    private void jtxtTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTaxActionPerformed

    private void txtFindCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFindCaretUpdate
         strFind = txtFind.getText();
        fillTable();
    }//GEN-LAST:event_txtFindCaretUpdate

    private void jtxtSubTotalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtxtSubTotalCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSubTotalCaretUpdate
    
//    private void showDuLieu(){
//     try{
//     tableMain.removeAll();
//     String[] arr = {"Mã SP", "Tên sản phẩm", "Đơn giá"};
//     DefaultTableModel model = new DefaultTableModel(arr,0);
//     Connection connection = JavaPOS1.getConnection(); 
//     String query = "SELECT *FROM dbo.HangHoa";
//     PreparedStatement ps = connection.prepareStatement(query);
//     ResultSet rs = ps.executeQuery();
//     while(rs.next()){
//         Vector vector = new Vector();
//         vector.add(rs.getString("MASP"));
//         vector.add(rs.getString("TenSP"));
//         vector.add(rs.getString("Dongia"));
//         model.addRow(vector);
//     }
//         } catch (SQLException ex) {
//             Logger.getLogger(JavaPOS.class.getName()).log(Level.SEVERE, null, ex);
//         }
//          
//}
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
            java.util.logging.Logger.getLogger(JavaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaPOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel129;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel134;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel140;
    private javax.swing.JPanel jPanel141;
    private javax.swing.JPanel jPanel142;
    private javax.swing.JPanel jPanel143;
    private javax.swing.JPanel jPanel144;
    private javax.swing.JPanel jPanel145;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel147;
    private javax.swing.JPanel jPanel148;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel160;
    private javax.swing.JPanel jPanel161;
    private javax.swing.JPanel jPanel162;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
    private javax.swing.JPanel jPanel167;
    private javax.swing.JPanel jPanel168;
    private javax.swing.JPanel jPanel169;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel170;
    private javax.swing.JPanel jPanel171;
    private javax.swing.JPanel jPanel172;
    private javax.swing.JPanel jPanel173;
    private javax.swing.JPanel jPanel174;
    private javax.swing.JPanel jPanel175;
    private javax.swing.JPanel jPanel176;
    private javax.swing.JPanel jPanel177;
    private javax.swing.JPanel jPanel178;
    private javax.swing.JPanel jPanel179;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel180;
    private javax.swing.JPanel jPanel181;
    private javax.swing.JPanel jPanel182;
    private javax.swing.JPanel jPanel183;
    private javax.swing.JPanel jPanel184;
    private javax.swing.JPanel jPanel185;
    private javax.swing.JPanel jPanel186;
    private javax.swing.JPanel jPanel187;
    private javax.swing.JPanel jPanel188;
    private javax.swing.JPanel jPanel189;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel190;
    private javax.swing.JPanel jPanel191;
    private javax.swing.JPanel jPanel192;
    private javax.swing.JPanel jPanel193;
    private javax.swing.JPanel jPanel194;
    private javax.swing.JPanel jPanel195;
    private javax.swing.JPanel jPanel196;
    private javax.swing.JPanel jPanel197;
    private javax.swing.JPanel jPanel198;
    private javax.swing.JPanel jPanel199;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPay;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnRemove;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JComboBox<String> jcboPayment;
    private javax.swing.JTextField jtxtBarCode;
    private javax.swing.JTextField jtxtChange;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtTax;
    private javax.swing.JTextField jtxtTotal;
    private javax.swing.JTable tbStudent;
    private javax.swing.JTextField txtFind;
    // End of variables declaration//GEN-END:variables
}
