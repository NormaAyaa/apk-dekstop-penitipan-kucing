/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controller.ControllerHewan;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class FormHewan extends javax.swing.JFrame {

    private JTextField txtId_Kucing;
    private JTextField txtNamaKucing;
    private JTextField txtRas;
    private JTextField txtUmur;
    private JTextField txtJenisKelamin;
    private JTextArea txtKondisiKucing;
    private JTextArea txtPenyakit;
    private JTextField txtPengambilan;
    private JTextField txtPenitipan;
    private JComboBox setJenisKelamin;

    /**
     * Creates new form FormHewan
     */
    public FormHewan() {
        initComponents();
        ctHwn = new ControllerHewan(this);
        ctHwn.isiTable(); 
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
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblData1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        BtnSimpan = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        DataHewan = new javax.swing.JTable();
        BtnUbah = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        btnFormPemilik = new javax.swing.JButton();
        btnNext1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCariNama = new javax.swing.JTextField();
        btnCariNama = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        KondisiKucing = new javax.swing.JTextArea();
        tgl_pengambilan = new javax.swing.JLabel();
        Pengambilan = new javax.swing.JTextField();
        ras = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ID_Kucing = new javax.swing.JLabel();
        Id_Kucing = new javax.swing.JTextField();
        umur = new javax.swing.JLabel();
        jk = new javax.swing.JLabel();
        tgl_penitipan = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Penyakit = new javax.swing.JTextArea();
        kesehatan = new javax.swing.JLabel();
        JenisKelamin = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        Penitipan = new javax.swing.JTextField();
        NamaKucing = new javax.swing.JTextField();
        Ras = new javax.swing.JTextField();
        Umur = new javax.swing.JTextField();
        nama_kucing = new javax.swing.JLabel();
        penyakit = new javax.swing.JLabel();

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblData);

        tblData1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tblData1);

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(224, 145, 50));
        jLabel1.setText("PawStreet");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204), 2));

        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        DataHewan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tgl Penitipan", "Tgl Pengambilan", "Nama Kucing", "Ras", "Umur (Bulan)", "JK", "Kondisi Kesehatan", "Riwayat Penyakit"
            }
        ));
        DataHewan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataHewanMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(DataHewan);
        if (DataHewan.getColumnModel().getColumnCount() > 0) {
            DataHewan.getColumnModel().getColumn(0).setMinWidth(40);
            DataHewan.getColumnModel().getColumn(0).setMaxWidth(40);
            DataHewan.getColumnModel().getColumn(1).setMinWidth(65);
            DataHewan.getColumnModel().getColumn(1).setMaxWidth(65);
            DataHewan.getColumnModel().getColumn(2).setMinWidth(55);
            DataHewan.getColumnModel().getColumn(2).setMaxWidth(55);
            DataHewan.getColumnModel().getColumn(3).setMinWidth(80);
            DataHewan.getColumnModel().getColumn(3).setMaxWidth(80);
            DataHewan.getColumnModel().getColumn(4).setMinWidth(80);
            DataHewan.getColumnModel().getColumn(4).setMaxWidth(80);
            DataHewan.getColumnModel().getColumn(5).setMinWidth(60);
            DataHewan.getColumnModel().getColumn(5).setMaxWidth(60);
            DataHewan.getColumnModel().getColumn(6).setMinWidth(40);
            DataHewan.getColumnModel().getColumn(6).setMaxWidth(40);
        }

        BtnUbah.setText("Ubah");
        BtnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUbahActionPerformed(evt);
            }
        });

        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        BtnReset.setText("Reset");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        btnFormPemilik.setText("Form Pemilik");
        btnFormPemilik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormPemilikActionPerformed(evt);
            }
        });

        btnNext1.setText("Form Paket");
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("PawStreet, 2023.");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Downloads\\pawxs.png")); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 50));

        txtCariNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariNamaActionPerformed(evt);
            }
        });

        btnCariNama.setText("Cari");
        btnCariNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariNamaActionPerformed(evt);
            }
        });

        jLabel7.setText("Cari Nama");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jSeparator1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnReset)
                        .addGap(18, 18, 18)
                        .addComponent(BtnUbah)
                        .addGap(18, 18, 18)
                        .addComponent(BtnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFormPemilik, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtCariNama, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnCariNama)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCariNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCariNama)
                        .addComponent(jLabel7)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUbah)
                    .addComponent(BtnReset)
                    .addComponent(BtnHapus)
                    .addComponent(BtnSimpan)
                    .addComponent(btnNext1)
                    .addComponent(btnFormPemilik))
                .addGap(259, 259, 259)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 228, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204), 2));

        KondisiKucing.setColumns(20);
        KondisiKucing.setRows(5);
        jScrollPane2.setViewportView(KondisiKucing);

        tgl_pengambilan.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        tgl_pengambilan.setText("Tanggal Pengambilan");

        Pengambilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PengambilanActionPerformed(evt);
            }
        });

        ras.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        ras.setText("Ras");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("DATA KUCING");

        ID_Kucing.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        ID_Kucing.setText("Id Kucing");

        umur.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        umur.setText("Umur");

        jk.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jk.setText("Jenis Kelamin");

        tgl_penitipan.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        tgl_penitipan.setText("Tanggal Penitipan");

        Penyakit.setColumns(20);
        Penyakit.setRows(5);
        jScrollPane8.setViewportView(Penyakit);

        kesehatan.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        kesehatan.setText("Kondisi Kesehatan Kucing");

        JenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L", "P" }));

        nama_kucing.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        nama_kucing.setText("Nama Kucing");

        penyakit.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        penyakit.setText("Riwayat Penyakit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_Kucing)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penyakit)
                            .addComponent(kesehatan))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tgl_penitipan)
                            .addComponent(tgl_pengambilan)
                            .addComponent(nama_kucing)
                            .addComponent(ras)
                            .addComponent(umur)
                            .addComponent(jk))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Id_Kucing)
                            .addComponent(Penitipan)
                            .addComponent(Pengambilan)
                            .addComponent(JenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Umur, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(Ras)
                            .addComponent(NamaKucing))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_Kucing)
                    .addComponent(Id_Kucing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Penitipan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgl_penitipan))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pengambilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgl_pengambilan))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaKucing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama_kucing))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ras))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(umur)
                    .addComponent(Umur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jk))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(kesehatan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(penyakit)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        // TODO add your handling code here:
        FormPaket frmPaket = new FormPaket();
        frmPaket.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void btnFormPemilikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormPemilikActionPerformed
        // TODO add your handling code here:
        FormPemilik frmPemilik = new FormPemilik();
        frmPemilik.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFormPemilikActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        // TODO add your handling code here:
        ctHwn.reset();
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        ctHwn.delete();
        ctHwn.isiTable();
        ctHwn.reset();
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUbahActionPerformed
        // TODO add your handling code here:
        ctHwn.update();
        ctHwn.isiTable();
        ctHwn.reset();
    }//GEN-LAST:event_BtnUbahActionPerformed

    private void DataHewanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataHewanMouseClicked
        // TODO add your handling code here:
        int row = DataHewan.getSelectedRow();
        ctHwn.isiField(row);
    }//GEN-LAST:event_DataHewanMouseClicked

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        ctHwn.insert();
        ctHwn.isiTable();
        ctHwn.reset();
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void PengambilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PengambilanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PengambilanActionPerformed

    private void txtCariNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariNamaActionPerformed

    private void btnCariNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariNamaActionPerformed
        // TODO add your handling code here:
        ctHwn.cari();
        ctHwn.reset();
    }//GEN-LAST:event_btnCariNamaActionPerformed

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
            java.util.logging.Logger.getLogger(FormHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHewan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnUbah;
    private javax.swing.JTable DataHewan;
    private javax.swing.JLabel ID_Kucing;
    private javax.swing.JTextField Id_Kucing;
    private javax.swing.JComboBox<String> JenisKelamin;
    private javax.swing.JTextArea KondisiKucing;
    private javax.swing.JTextField NamaKucing;
    private javax.swing.JTextField Pengambilan;
    private javax.swing.JTextField Penitipan;
    private javax.swing.JTextArea Penyakit;
    private javax.swing.JTextField Ras;
    private javax.swing.JTextField Umur;
    private javax.swing.JButton btnCariNama;
    private javax.swing.JButton btnFormPemilik;
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel jk;
    private javax.swing.JLabel kesehatan;
    private javax.swing.JLabel nama_kucing;
    private javax.swing.JLabel penyakit;
    private javax.swing.JLabel ras;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblData1;
    private javax.swing.JLabel tgl_pengambilan;
    private javax.swing.JLabel tgl_penitipan;
    private javax.swing.JTextField txtCariNama;
    private javax.swing.JLabel umur;
    // End of variables declaration//GEN-END:variables
    ControllerHewan ctHwn;

    public JTable getTableData() {
        return DataHewan;
    }
    
    public JTextField getId_kucing()
    {
      return Id_Kucing;
    }
    
    public JTextField getnama_kucing()
    {
      return NamaKucing;
    }
    
    public JTextField getRas()
    {
      return Ras;
    }
    
    public JTextField getUmur()
    {
      return Umur;
    }
    
    public JComboBox getJenis_Kelamin()
    {
      return JenisKelamin;
    }
    
    public JTextArea getKesehatan()
    {
      return KondisiKucing;
    }
    
    public JTextArea getRiw_Peny()
    {
      return Penyakit;
    }
    
    public JTextField gettgl_masuk()
    {
      return Penitipan;
    }
    
    public JTextField gettgl_keluar()
    {
      return Pengambilan;
    }
    
    public JTextField gettxtCariNama()
    {
      return txtCariNama;
    }
}

