/************************************************************
 -----BEGIN PGP SIGNED MESSAGE-----
 Hash: SHA256
 
 *                 M O N E Y C H A N G E R
 *
 *   http://wiki.github.com/FellowTraveler/Moneychanger/wiki
 *
 *  Open Transactions:
 *       Financial Cryptography and Digital Cash
 *       Library, Protocol, API, Server, and GUI 
 *    
 *    	 -- Anonymous Numbered Accounts.
 *    	 -- Untraceable Digital Cash.
 *    	 -- Triple-Signed Receipts.
 *    	 -- Cheques, Vouchers, Transfers, Inboxes.
 *    	 -- Basket Currencies, Markets, Payment Plans.
 *    	 -- Signed, XML, Ricardian-style Contracts.
 *    
 *  Copyright (C) 2010-2011 by "Fellow Traveler" (A pseudonym)
 *
 *  EMAIL:
 *  FellowTraveler@rayservers.net --- SEE PGP KEY BELOW.
 *  F3llowTraveler@gmail.com --- (not preferred.)
 *  
 *  FINGERPRINT:
 *  9DD5 90EB 9292 4B48 0484  7910 0308 00ED F951 BB8E
 *
 *  BITCOIN:  1NtTPVVjDsUfDWybS4BwvHpG2pdS9RnYyQ
 *
 *  OFFICIAL PROJECT WIKI:
 *  http://wiki.github.com/FellowTraveler/Open-Transactions/wiki 
 *
 *  WEBSITE:
 *  http://www.OpenTransactions.org/
 *    
 *  Components and licensing:
 *   -- Moneychanger..A Java client GUI.....LICENSE:.....GPLv3
 *   -- OTLib.........A class library.......LICENSE:...LAGPLv3 
 *   -- OT-API........A client API..........LICENSE:...LAGPLv3
 *   -- testwallet....Command-line client...LICENSE:...LAGPLv3
 *   -- OT-Server.....Server Application....LICENSE:....AGPLv3
 *  Github.com/FellowTraveler/Open-Transactions/wiki/Components
 *
 *  All of the above OT components were designed and written by
 *  Fellow Traveler, with the exception of Moneychanger, which
 *  was contracted out to Vicky C (livewire_3001@yahoo.com).
 *
 *  -----------------------------------------------------
 *
 *   LICENSE:
 *   This program is free software: you can redistribute it
 *   and/or modify it under the terms of the GNU General
 *   Public License as published by the Free Software
 *   Foundation, either version 3 of the License, or (at your
 *   option) any later version.
 *
 *   You should have received a copy of the GNU General
 *   Public License along with this program.  If not, see:
 *   http://www.gnu.org/licenses/
 *
 *   If you would like to use this software outside of the free
 *   software license, please contact FellowTraveler.
 *   (Unfortunately many will run anonymously and untraceably,
 *   so who could really stop them?)
 *   
 *   DISCLAIMER:
 *   This program is distributed in the hope that it will be
 *   useful, but WITHOUT ANY WARRANTY; without even the implied
 *   warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 *   PURPOSE.  See the GNU General Public License for more
 *   details.
 
 -----BEGIN PGP SIGNATURE-----
 wsFVAwUBTbFZUwMIAO35UbuOAQjDRBAAmIUJBi5/WC1KpI4TNAWdQNh6g59qYS6w
 SI6mTMbnP0DUVOrmJdNR7/n1sRlnWzyjKLcKkRtXwRWGC+jE16jijxek9Ome5Qid
 bDqjHSuFvqnsD3+0tbENf+kVrbAReU3YvWk+xFvVc6I2NpS+lEIdjHIWm85jSmew
 Ydx+4KpELkO59thkcKgSYsTSyTP3l9GOTtJlq45XiamoEvso4jFUC1y5KMQsz1KH
 DTE32m5FPZqJqUw9loAmrni3dIMpXKC5yLhdqSMXHK0MAPEIexsuaZjrjKJQSjwV
 eDjwJcMn2WZVvcIr9IEoKEU/2j9wHNZv5Xuj78A/78AkjqEUwrY1M9ht0r/QbusW
 ZT7MlxNCq4DFstrjyKi03yZQGR+m8eJFHE7GvF8Vzg/ap0/CUJzeoXg5wACXGfJj
 k6y8ZBriQO08JECki2sy6oTitDoi7FmzgAIxPGB1qA4HMur/LuzrxAj2V7XkZQlk
 VfAda6Ff9bmStNut+zbsQ0pnIeL/URwWifI8Wq81c7DEIvA5SH/bU9Hws1FMO8PU
 BcDmzadU+syJBTxoP/mHZcLfwHDhcZyBeHX7sHfpHweEunzWjcHjqVCutQMO4dii
 yrsc64WTfAqd4s12SfKMgVFLeL/FUYH7MNqpfgjgwX5co817m9VvCntU6njIuYtV
 6+G/TuSViH8=
 =/jIC
 -----END PGP SIGNATURE-----
 **************************************************************/


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainPage.java
 *
 * Created on 13 Mar, 2011, 10:22:07 PM
 */
package com.wrapper.ui;
//Recurring, Deed/Title, Escrow, Ripple, Settings, Credits
import com.wrapper.core.Account;
import com.wrapper.core.Contract;
import com.wrapper.core.NYM;
import com.wrapper.core.OpenTransactionAccount;
import com.wrapper.core.dataobjects.CashPurseDetails;
import com.wrapper.core.dataobjects.OTDetails;
import com.wrapper.core.util.ComboObject;
import com.wrapper.core.util.Configuration;
import com.wrapper.core.util.Utility;
import com.wrapper.ui.dialogs.AccountAdditionDialog;
import com.wrapper.ui.dialogs.AccountEditDialog;
import com.wrapper.ui.dialogs.AssetContractEditDialog;
import com.wrapper.ui.dialogs.ContractAdditionDialog;
import com.wrapper.ui.dialogs.IssueAssetContractDialog;
import com.wrapper.ui.dialogs.NYMAdditionDialog;
import com.wrapper.ui.dialogs.NYMEditDialog;
import com.wrapper.ui.dialogs.NymBoxDetailsDialog;
import com.wrapper.ui.dialogs.SendMessageDialog;
import com.wrapper.ui.dialogs.ServerContractEditDialog;
import com.wrapper.ui.model.AccountTableModel;
import com.wrapper.ui.model.AssetContractTableModel;
import com.wrapper.ui.model.NYMBoxTableModel;
import com.wrapper.ui.model.NYMOutboxTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import com.wrapper.ui.model.NYMTableModel;
import com.wrapper.ui.model.ServerContractTableModel;
import com.wrapper.ui.panels.BitcoinAccountBottomPanel;
import com.wrapper.ui.panels.BitcoinAccountTopPanel;
import com.wrapper.ui.panels.CashPurseAccountBottomPanel;
import com.wrapper.ui.panels.CashPurseAccountTopPanel;
import com.wrapper.ui.panels.OpenTransactionAccountBottomPanel;
import com.wrapper.ui.panels.OpenTransactionAccountTopPanel;
import java.awt.CardLayout;
import java.awt.Cursor;
import java.io.File;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.skin.SubstanceMistAquaLookAndFeel;

/**
 *
 * @author Vicky C
 */
public class MainPage extends javax.swing.JFrame {

    private Map nymBox;
    private static Map nymOutBox;

    /** Creates new form MainPage */
    public MainPage() {
        // this.setExtendedState(MAXIMIZED_BOTH);

        setTitle("Moneychanger");
        initComponents();
        initMainTab();
        initNYMSTab();
        initContractsTab();
        initSettingsTab();
        initCreditsTab();
        setResizable(false);
        setLocation(Utility.getLocation(this.getSize()));
        repaint();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new com.wrapper.ui.custom.SteppedComboBox();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable5 = new com.wrapper.ui.custom.CustomTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new com.wrapper.ui.custom.SteppedComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane14 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jComboBox3 = new com.wrapper.ui.custom.SteppedComboBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new com.wrapper.ui.custom.CustomTable();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable8 = new com.wrapper.ui.custom.CustomTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable10 = new com.wrapper.ui.custom.CustomTable();
        jPanel7 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable7 = new com.wrapper.ui.custom.CustomTable();
        jPanel14 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable11 = new com.wrapper.ui.custom.CustomTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel24 = new javax.swing.JPanel();

        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel12.setName("jPanel12"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(app.ApplicationLauncher.class).getContext().getResourceMap(MainPage.class);
        jTextField6.setText(resourceMap.getString("jTextField6.text")); // NOI18N
        jTextField6.setName("jTextField6"); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jScrollPane9.setName("jScrollPane9"); // NOI18N

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setName("jTextArea5"); // NOI18N
        jScrollPane9.setViewportView(jTextArea5);

        jLabel10.setText("ID");
        jLabel10.setName("jLabel10"); // NOI18N

        jLabel11.setText("Misc");
        jLabel11.setName("jLabel11"); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField6)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        jPanel1.setName("jPanel1"); // NOI18N

        jComboBox1.setSelectedItem("ALL");
        jComboBox1.setName("jComboBox1"); // NOI18N
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jScrollPane12.setName("jScrollPane12"); // NOI18N

        jTable5.setModel(new AccountTableModel());
        jTable5.setName("jTable5"); // NOI18N
        jTable5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(jTable5);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setName("jSeparator3"); // NOI18N

        jLabel4.setText("NYMS");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText("Server Contracts");
        jLabel5.setName("jLabel5"); // NOI18N

        jComboBox2.setSelectedItem("ALL");
        jComboBox2.setName("jComboBox2"); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jSeparator2.setName("jSeparator2"); // NOI18N

        jScrollPane14.setName("jScrollPane14"); // NOI18N

        jPanel8.setName("jPanel8"); // NOI18N
        jPanel8.setVisible(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        jScrollPane14.setViewportView(jPanel8);

        jScrollPane13.setName("jScrollPane13"); // NOI18N

        jPanel15.setName("jPanel15"); // NOI18N
        jPanel15.setVisible(false);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jScrollPane13.setViewportView(jPanel15);

        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.setName("jPanel16"); // NOI18N

        jButton10.setText(resourceMap.getString("jButton10.text")); // NOI18N
        jButton10.setName("jButton10"); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText(resourceMap.getString("jButton11.text")); // NOI18N
        jButton11.setToolTipText("Add");
        jButton11.setName("jButton11"); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText(resourceMap.getString("jButton12.text")); // NOI18N
        jButton12.setName("jButton12"); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton10)
                    .addComponent(jButton12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setText("Asset Contracts");
        jLabel16.setName("jLabel16"); // NOI18N

        jComboBox3.setSelectedItem("ALL");
        jComboBox3.setName("jComboBox3"); // NOI18N
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(37, 37, 37))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel16))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, 0, 69, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

        jPanel3.setName("jPanel3"); // NOI18N

        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel9.setName("jPanel9"); // NOI18N

        jTextField4.setEditable(false);
        jTextField4.setText(resourceMap.getString("jTextField4.text")); // NOI18N
        jTextField4.setName("jTextField4"); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jScrollPane7.setName("jScrollPane7"); // NOI18N

        jTextArea3.setColumns(20);
        jTextArea3.setEditable(false);
        jTextArea3.setRows(5);
        jTextArea3.setName("jTextArea3"); // NOI18N
        jScrollPane7.setViewportView(jTextArea3);

        jLabel6.setText("ID");
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel7.setText("Misc");
        jLabel7.setName("jLabel7"); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setName("jPanel10"); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wrapper/ui/images/pencil.jpg"))); // NOI18N
        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText(resourceMap.getString("jButton5.text")); // NOI18N
        jButton5.setToolTipText("Add");
        jButton5.setName("jButton5"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(resourceMap.getString("jButton6.text")); // NOI18N
        jButton6.setName("jButton6"); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTable2.setModel(new NYMTableModel());
        jTable2.setName("jTable2"); // NOI18N
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jSeparator4.setName("jSeparator4"); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setName("jPanel2"); // NOI18N

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setName("jSeparator5"); // NOI18N

        jTabbedPane2.setName("jTabbedPane2"); // NOI18N
        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        jScrollPane15.setName("jScrollPane15"); // NOI18N

        jTable8.setModel(new NYMBoxTableModel());
        jTable8.setToolTipText(resourceMap.getString("jTable8.toolTipText")); // NOI18N
        jTable8.setName("jTable8"); // NOI18N
        jTable8.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable8MouseEntered(evt);
            }
        });
        jScrollPane15.setViewportView(jTable8);

        jTabbedPane2.addTab(resourceMap.getString("jScrollPane15.TabConstraints.tabTitle"), jScrollPane15); // NOI18N

        jScrollPane16.setName("jScrollPane16"); // NOI18N

        jTable10.setModel(new NYMOutboxTableModel());
        jTable10.setToolTipText(resourceMap.getString("jTable10.toolTipText")); // NOI18N
        jTable10.setName("jTable10"); // NOI18N
        jTable10.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable10MouseEntered(evt);
            }
        });
        jScrollPane16.setViewportView(jTable10);

        jTabbedPane2.addTab(resourceMap.getString("jScrollPane16.TabConstraints.tabTitle"), jScrollPane16); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setName("jPanel7"); // NOI18N

        jButton16.setText(resourceMap.getString("jButton16.text")); // NOI18N
        jButton16.setName("jButton16"); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(254, 254, 254)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(245, 245, 245)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(776, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(322, 322, 322)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(390, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel3.TabConstraints.tabTitle"), jPanel3); // NOI18N

        jPanel4.setName("jPanel4"); // NOI18N

        jScrollPane11.setName("jScrollPane11"); // NOI18N

        jTable9.setModel(new ServerContractTableModel());
        jTable9.setName("jTable9"); // NOI18N
        jTable9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable9MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jTable9);

        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel11.setName("jPanel11"); // NOI18N

        jTextField7.setEditable(false);
        jTextField7.setName("jTextField7"); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jScrollPane8.setName("jScrollPane8"); // NOI18N

        jTextArea6.setColumns(20);
        jTextArea6.setEditable(false);
        jTextArea6.setRows(5);
        jTextArea6.setName("jTextArea6"); // NOI18N
        jScrollPane8.setViewportView(jTextArea6);

        jLabel8.setText("ID");
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setText("Misc");
        jLabel9.setName("jLabel9"); // NOI18N

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setName("jPanel13"); // NOI18N

        jButton7.setText(resourceMap.getString("jButton7.text")); // NOI18N
        jButton7.setName("jButton7"); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText(resourceMap.getString("jButton8.text")); // NOI18N
        jButton8.setToolTipText("Add");
        jButton8.setName("jButton8"); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText(resourceMap.getString("jButton9.text")); // NOI18N
        jButton9.setName("jButton9"); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(jButton9)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton7))
                .addContainerGap())
        );

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        jTable7.setModel(new AssetContractTableModel());
        jTable7.setName("jTable7"); // NOI18N
        jTable7.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable7);

        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel14.setName("jPanel14"); // NOI18N

        jTextField8.setEditable(false);
        jTextField8.setName("jTextField8"); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jScrollPane10.setName("jScrollPane10"); // NOI18N

        jTextArea7.setColumns(20);
        jTextArea7.setEditable(false);
        jTextArea7.setRows(5);
        jTextArea7.setName("jTextArea7"); // NOI18N
        jScrollPane10.setViewportView(jTextArea7);

        jLabel12.setText("ID");
        jLabel12.setName("jLabel12"); // NOI18N

        jLabel13.setText("Misc");
        jLabel13.setName("jLabel13"); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel17.setName("jPanel17"); // NOI18N

        jButton13.setText(resourceMap.getString("jButton13.text")); // NOI18N
        jButton13.setName("jButton13"); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText(resourceMap.getString("jButton14.text")); // NOI18N
        jButton14.setToolTipText("Add");
        jButton14.setName("jButton14"); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText(resourceMap.getString("jButton15.text")); // NOI18N
        jButton15.setName("jButton15"); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton15)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jButton14)
                    .addComponent(jButton13))
                .addContainerGap())
        );

        jSeparator1.setName("jSeparator1"); // NOI18N

        jScrollPane6.setName("jScrollPane6"); // NOI18N

        jTable11.setModel(new ServerContractTableModel());
        jTable11.setName("jTable11"); // NOI18N
        jTable11.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable11MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable11);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(426, 426, 426)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(428, 428, 428))))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel4.TabConstraints.tabTitle"), jPanel4); // NOI18N

        jPanel5.setName("jPanel5"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addContainerGap(679, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel5.TabConstraints.tabTitle"), jPanel5); // NOI18N

        jPanel6.setName("jPanel6"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel30.setText(resourceMap.getString("jLabel30.text")); // NOI18N
        jLabel30.setName("jLabel30"); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addContainerGap(650, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel6.TabConstraints.tabTitle"), jPanel6); // NOI18N

        jPanel18.setName("jPanel18"); // NOI18N

        jLabel17.setText(resourceMap.getString("jLabel17.text")); // NOI18N
        jLabel17.setName("jLabel17"); // NOI18N

        jLabel18.setText(resourceMap.getString("jLabel18.text")); // NOI18N
        jLabel18.setName("jLabel18"); // NOI18N

        jLabel31.setText(resourceMap.getString("jLabel31.text")); // NOI18N
        jLabel31.setName("jLabel31"); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(623, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel18.TabConstraints.tabTitle"), jPanel18); // NOI18N

        jPanel19.setName("jPanel19"); // NOI18N

        jLabel19.setText(resourceMap.getString("jLabel19.text")); // NOI18N
        jLabel19.setName("jLabel19"); // NOI18N

        jLabel20.setText(resourceMap.getString("jLabel20.text")); // NOI18N
        jLabel20.setName("jLabel20"); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap(647, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel19.TabConstraints.tabTitle"), jPanel19); // NOI18N

        jPanel20.setName("jPanel20"); // NOI18N

        jLabel21.setText(resourceMap.getString("jLabel21.text")); // NOI18N
        jLabel21.setName("jLabel21"); // NOI18N

        jLabel22.setText(resourceMap.getString("jLabel22.text")); // NOI18N
        jLabel22.setName("jLabel22"); // NOI18N

        jLabel28.setText(resourceMap.getString("jLabel28.text")); // NOI18N
        jLabel28.setName("jLabel28"); // NOI18N

        jLabel29.setText(resourceMap.getString("jLabel29.text")); // NOI18N
        jLabel29.setName("jLabel29"); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 1013, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel21)
                .addGap(4, 4, 4)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addContainerGap(608, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel20.TabConstraints.tabTitle"), jPanel20); // NOI18N

        jPanel21.setName("jPanel21"); // NOI18N

        jLabel23.setText(resourceMap.getString("jLabel23.text")); // NOI18N
        jLabel23.setName("jLabel23"); // NOI18N

        jLabel24.setText(resourceMap.getString("jLabel24.text")); // NOI18N
        jLabel24.setName("jLabel24"); // NOI18N

        jLabel25.setText(resourceMap.getString("jLabel25.text")); // NOI18N
        jLabel25.setName("jLabel25"); // NOI18N

        jLabel26.setText(resourceMap.getString("jLabel26.text")); // NOI18N
        jLabel26.setName("jLabel26"); // NOI18N

        jLabel27.setText(resourceMap.getString("jLabel27.text")); // NOI18N
        jLabel27.setName("jLabel27"); // NOI18N

        jLabel32.setText(resourceMap.getString("jLabel32.text")); // NOI18N
        jLabel32.setName("jLabel32"); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(4, 4, 4)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addContainerGap(582, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel21.TabConstraints.tabTitle"), jPanel21); // NOI18N

        jPanel22.setName("jPanel22"); // NOI18N

        jLabel14.setText(resourceMap.getString("jLabel14.text")); // NOI18N
        jLabel14.setName("jLabel14"); // NOI18N

        jTextField5.setName("jTextField5"); // NOI18N

        jLabel15.setText(resourceMap.getString("jLabel15.text")); // NOI18N
        jLabel15.setName("jLabel15"); // NOI18N

        jButton18.setText(resourceMap.getString("jButton18.text")); // NOI18N
        jButton18.setName("jButton18"); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jButton18)
                        .addContainerGap())
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addGap(717, 717, 717))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(26, 26, 26)
                .addComponent(jButton18)
                .addContainerGap(622, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel22.TabConstraints.tabTitle"), jPanel22); // NOI18N

        jPanel23.setName("jPanel23"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel24.setName("jPanel24"); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel23.TabConstraints.tabTitle"), jPanel23); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       
}//GEN-LAST:event_jTable2MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        if (jTable2.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Please select NYM to delete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int userSelection = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete NYM", "NYM Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        System.out.println("userSelection:" + userSelection);
        NYM nym = new NYM();
        if (userSelection == 0) {
            boolean status = nym.deleteNym((String) jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 1));
            if (status) {
                JOptionPane.showMessageDialog(this, "NYM deleted successfully", "NYM deletion", JOptionPane.INFORMATION_MESSAGE);
                refreshNYMSList();
            } else {
                JOptionPane.showMessageDialog(this, "NYM cannot be deleted", "NYM deletion", JOptionPane.ERROR_MESSAGE);
            }
        }
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new NYMAdditionDialog(this, true).setVisible(true);
        refreshNYMSList();
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jTable2.getSelectedRow() > -1) {
            new NYMEditDialog(this, true, (String) jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 1)).setVisible(true);
            refreshNYMSList();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a NYM to edit.", "NYM Edit Error", JOptionPane.ERROR_MESSAGE);
        }
}//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        System.out.println("In Action for Asset Combo main tab");
        /*String nymID = Utility.getKey(nymMap, (String) jComboBox1.getSelectedItem());
        String assetID = Utility.getKey(assetMap, (String) jComboBox3.getSelectedItem());
        String serverID = Utility.getKey(serverMap, (String) jComboBox2.getSelectedItem());*/
        String nymID = "ALL";
        String assetID = "ALL";
        String serverID = "ALL";

        if (nymMap != null && nymMap.size() > 0 && jComboBox1.getSelectedIndex() > 0) {
            nymID = ((String[]) nymMap.get((Integer) jComboBox1.getSelectedIndex() - 1))[1];
        }

        if (assetMap != null && assetMap.size() > 0 && jComboBox3.getSelectedIndex() > 0) {
            assetID = ((String[]) assetMap.get((Integer) jComboBox3.getSelectedIndex() - 1))[1];
        }

        if (serverMap != null && serverMap.size() > 0 && jComboBox2.getSelectedIndex() > 0) {
            serverID = ((String[]) serverMap.get((Integer) jComboBox2.getSelectedIndex() - 1))[1];
        }

        System.out.print("nymiiidL:" + nymID);
        loadAccount(assetID, serverID, nymID);
        clearDetailPage();
}//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (jTable5.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Please select account to delete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int userSelection = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete account", "Delete Account", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        System.out.println("userSelection:" + userSelection);
        OpenTransactionAccount openTransaction = new OpenTransactionAccount();
        if (userSelection == 0) {
            boolean status = openTransaction.deleteAccount((String) jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 3));
            if (status) {
                JOptionPane.showMessageDialog(this, "Account deleted successfully", "Account deletion", JOptionPane.INFORMATION_MESSAGE);
                //bbb
                String nymID = "ALL";
                String assetID = "ALL";
                String serverID = "ALL";

                if (nymMap != null && nymMap.size() > 0 && jComboBox1.getSelectedIndex() > 0) {
                    nymID = ((String[]) nymMap.get((Integer) jComboBox1.getSelectedIndex() - 1))[1];
                }

                if (assetMap != null && assetMap.size() > 0 && jComboBox3.getSelectedIndex() > 0) {
                    assetID = ((String[]) assetMap.get((Integer) jComboBox3.getSelectedIndex() - 1))[1];
                }

                if (serverMap != null && serverMap.size() > 0 && jComboBox2.getSelectedIndex() > 0) {
                    serverID = ((String[]) serverMap.get((Integer) jComboBox2.getSelectedIndex() - 1))[1];
                }

                loadAccount(assetID, serverID, nymID);
            } else {
                JOptionPane.showMessageDialog(this, "Account cannot be deleted", "Account deletion", JOptionPane.ERROR_MESSAGE);
            }
        }
}//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        String nymID = "ALL";
        String assetID = "ALL";
        String serverID = "ALL";

        if (nymMap != null && nymMap.size() > 0 && jComboBox1.getSelectedIndex() > 0) {
            nymID = ((String[]) nymMap.get((Integer) jComboBox1.getSelectedIndex() - 1))[1];
        }

        if (assetMap != null && assetMap.size() > 0 && jComboBox3.getSelectedIndex() > 0) {
            assetID = ((String[]) assetMap.get((Integer) jComboBox3.getSelectedIndex() - 1))[1];
        }

        if (serverMap != null && serverMap.size() > 0 && jComboBox2.getSelectedIndex() > 0) {
            serverID = ((String[]) serverMap.get((Integer) jComboBox2.getSelectedIndex() - 1))[1];
        }

        new AccountAdditionDialog(this, true, nymID, assetID, serverID).setVisible(true);
        System.out.print("assetID:" + assetID);
        System.out.print("serverID:" + serverID);
        System.out.print("nymiiidL:" + nymID);
        clearDetailPage();
}//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (jTable5.getSelectedRow() > -1) {
            new AccountEditDialog(this, true, (String) jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 3), (String) jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 2)).setVisible(true);
            System.out.println("ggggggggjTable5.getSelectedRow():" + jTable5.getSelectedRow());
            String nymID = "ALL";
            String assetID = "ALL";
            String serverID = "ALL";

            if (nymMap != null && nymMap.size() > 0 && jComboBox1.getSelectedIndex() > 0) {
                nymID = ((String[]) nymMap.get((Integer) jComboBox1.getSelectedIndex() - 1))[1];
            }

            if (assetMap != null && assetMap.size() > 0 && jComboBox3.getSelectedIndex() > 0) {
                assetID = ((String[]) assetMap.get((Integer) jComboBox3.getSelectedIndex() - 1))[1];
            }

            if (serverMap != null && serverMap.size() > 0 && jComboBox2.getSelectedIndex() > 0) {
                serverID = ((String[]) serverMap.get((Integer) jComboBox2.getSelectedIndex() - 1))[1];
            }
            loadAccount(assetID, serverID, nymID);
            //jTable5.setValueAt("", jTable5.getSelectedRow(), 0);
        } else {
            JOptionPane.showMessageDialog(this, "Please select an account to edit.", "NYM Edit Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        System.out.println("In Action for Server Combo main tab");
        /*String nymID = Utility.getKey(nymMap, (String) jComboBox1.getSelectedItem());
        String assetID = Utility.getKey(assetMap, (String) jComboBox3.getSelectedItem());
        String serverID = Utility.getKey(serverMap, (String) jComboBox2.getSelectedItem());*/
        String nymID = "ALL";
        String assetID = "ALL";
        String serverID = "ALL";

        if (nymMap != null && nymMap.size() > 0 && jComboBox1.getSelectedIndex() > 0) {
            nymID = ((String[]) nymMap.get((Integer) jComboBox1.getSelectedIndex() - 1))[1];
        }

        if (assetMap != null && assetMap.size() > 0 && jComboBox3.getSelectedIndex() > 0) {
            assetID = ((String[]) assetMap.get((Integer) jComboBox3.getSelectedIndex() - 1))[1];
        }

        if (serverMap != null && serverMap.size() > 0 && jComboBox2.getSelectedIndex() > 0) {
            serverID = ((String[]) serverMap.get((Integer) jComboBox2.getSelectedIndex() - 1))[1];
        }

        System.out.print("serverID----------------------------:" + serverID);
        loadAccount(assetID, serverID, nymID);
        clearDetailPage();
}//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
}//GEN-LAST:event_jTable5MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        System.out.println("In Action for NYM Combo Main tab");
        /*String nymID = Utility.getKey(nymMap, (String) jComboBox1.getSelectedItem());
        String assetID = Utility.getKey(assetMap, (String) jComboBox3.getSelectedItem());
        String serverID = Utility.getKey(serverMap, (String) jComboBox2.getSelectedItem());*/
        String nymID = "ALL";
        String assetID = "ALL";
        String serverID = "ALL";

        if (nymMap != null && nymMap.size() > 0 && jComboBox1.getSelectedIndex() > 0) {
            nymID = ((String[]) nymMap.get((Integer) jComboBox1.getSelectedIndex() - 1))[1];
        }

        if (assetMap != null && assetMap.size() > 0 && jComboBox3.getSelectedIndex() > 0) {
            assetID = ((String[]) assetMap.get((Integer) jComboBox3.getSelectedIndex() - 1))[1];
        }

        if (serverMap != null && serverMap.size() > 0 && jComboBox2.getSelectedIndex() > 0) {
            serverID = ((String[]) serverMap.get((Integer) jComboBox2.getSelectedIndex() - 1))[1];
        }

        System.out.print(":" + nymID);
        System.out.print("serverID:" + serverID);
        System.out.print("assetID:" + assetID);
        loadAccount(assetID, serverID, nymID);
        clearDetailPage();
}//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable9MouseClicked

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jTable7.getSelectedRow() > -1) {
            new AssetContractEditDialog(this, true, (String) jTable7.getModel().getValueAt(jTable7.getSelectedRow(), 1)).setVisible(true);
            refreshAssetContractList();
        } else {
            JOptionPane.showMessageDialog(this, "Please select an Asset Contract to edit.", "Asset Contract Edit Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new ContractAdditionDialog(this, true, "Asset").setVisible(true);
        refreshAssetContractList();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        if (jTable7.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Please select Asset Contract to delete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int userSelection = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete Asset Contract", "Asset Contract Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        System.out.println("userSelection:" + userSelection);
        Contract contract = new Contract();
        if (userSelection == 0) {
            boolean status = contract.deleteAssetContract((String) jTable7.getModel().getValueAt(jTable7.getSelectedRow(), 1));
            if (status) {
                JOptionPane.showMessageDialog(this, "Asset Contract deleted successfully", "Asset Contract Deletion", JOptionPane.INFORMATION_MESSAGE);
                refreshAssetContractList();
            } else {
                JOptionPane.showMessageDialog(this, "Asset Contract cannot be deleted", "Asset Contract Deletion", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable7MouseClicked

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (jTable11.getSelectedRow() > -1) {
            new ServerContractEditDialog(this, true, (String) jTable11.getModel().getValueAt(jTable11.getSelectedRow(), 1)).setVisible(true);
            refreshServerContractList();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a Server Contract to edit.", "Server Contract Edit Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        new ContractAdditionDialog(this, true, "Server").setVisible(true);
        refreshServerContractList();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if (jTable11.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Please select Server Contract to delete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int userSelection = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete Server Contract", "Server Contract Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        System.out.println("userSelection:" + userSelection);
        Contract contract = new Contract();
        if (userSelection == 0) {
            boolean status = contract.deleteServerContract((String) jTable11.getModel().getValueAt(jTable11.getSelectedRow(), 1));
            if (status) {
                JOptionPane.showMessageDialog(this, "Server Contract deleted successfully", "Server Contract Deletion", JOptionPane.INFORMATION_MESSAGE);
                refreshServerContractList();
            } else {
                JOptionPane.showMessageDialog(this, "Server Contract cannot be deleted", "Server Contract Deletion", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTable11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable11MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ("".equalsIgnoreCase(jTextArea6.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Please select Asset Contract", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        new IssueAssetContractDialog(this, true, jTextArea6.getText()).setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if ("".equalsIgnoreCase(jTextField4.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Please select NYM", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        new SendMessageDialog(this, true, jTextField4.getText(),jTable10).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTextField4.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Please select NYM", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        NYM nym = new NYM();
        nymBox = nym.downloadNymBox(jTextField4.getText());
        ((NYMBoxTableModel) jTable8.getModel()).setValue(nymBox, jTable8);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (jTable8.getSelectedRow() < 0 && jTable10.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Please select mail to delete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            NYM nym = new NYM();
            if (jTabbedPane2.getSelectedIndex() == 0) {
                boolean success = nym.deleteMail(jTextField4.getText(), Integer.parseInt((String) jTable8.getModel().getValueAt(jTable8.getSelectedRow(), 3)));
                int previousSelection = jTable8.getSelectedRow();
                if (success) {
                    //JOptionPane.showMessageDialog(this, "Mail deleted successfully", "Mail Deletion Success", JOptionPane.INFORMATION_MESSAGE);
                    ((NYMBoxTableModel) jTable8.getModel()).setValue(nym.loadNymBox(jTextField4.getText()), jTable8);
                    int newCount = jTable8.getModel().getRowCount();
                    if (newCount > 0) {
                        if (newCount > previousSelection) {
                            jTable8.setRowSelectionInterval(previousSelection, previousSelection);
                        } else {
                            jTable8.setRowSelectionInterval(previousSelection - 1, previousSelection - 1);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Mail deletion failed", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {

                boolean success = nym.deleteOutboxMail(jTextField4.getText(), Integer.parseInt((String) jTable10.getModel().getValueAt(jTable10.getSelectedRow(), 3)));
                int previousSelection = jTable10.getSelectedRow();
                if (success) {
                    //JOptionPane.showMessageDialog(this, "Mail deleted successfully", "Mail Deletion Success", JOptionPane.INFORMATION_MESSAGE);
                    ((NYMOutboxTableModel) jTable10.getModel()).setValue(nym.loadNymOutBox(jTextField4.getText()), jTable10);
                    int newCount = jTable10.getModel().getRowCount();
                    if (newCount > 0) {
                        if (newCount > previousSelection) {
                            jTable10.setRowSelectionInterval(previousSelection, previousSelection);
                        } else {
                            jTable10.setRowSelectionInterval(previousSelection - 1, previousSelection - 1);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Mail deletion failed", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        System.out.println("Item stt--");
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTable8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable8MouseEntered

}//GEN-LAST:event_jTable8MouseEntered

    private void jTable8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable8MouseClicked
        System.out.println("Count:" + evt.getClickCount());
        if (evt.getClickCount() == 2) {
            String key = (String) jTable8.getModel().getValueAt(jTable8.getSelectedRow(), 3);
            String subject = (String) jTable8.getModel().getValueAt(jTable8.getSelectedRow(), 0);
            System.out.println("In NYMBOX double clcik, key:" + key);
            String[] row = (String[]) nymBox.get(key);
            if (row != null) {
                NymBoxDetailsDialog nymDialog = new NymBoxDetailsDialog(this, true, row[7] == "true" ? "Verified" : "Not Verified", row[6], subject);
                nymDialog.setVisible(true);
            }
        }
}//GEN-LAST:event_jTable8MouseClicked

    private void jTable10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseClicked
       System.out.println("Count:" + evt.getClickCount());
        if (evt.getClickCount() == 2) {
            String key = (String) jTable10.getModel().getValueAt(jTable10.getSelectedRow(), 3);
            String subject = (String) jTable10.getModel().getValueAt(jTable10.getSelectedRow(), 0);
            System.out.println("In NYM out BOX double clcik, key:" + key);
            String[] row = (String[]) nymOutBox.get(key);
            System.out.println("nymOutBox:"+nymOutBox.entrySet());
            System.out.println("row:"+row);
            if (row != null) {
                NymBoxDetailsDialog nymDialog = new NymBoxDetailsDialog(this, true, row[7] == "true" ? "Verified" : "Not Verified", row[6], subject);
                nymDialog.setVisible(true);
            }
        }
    }//GEN-LAST:event_jTable10MouseClicked

    private void jTable10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseEntered
        
    }//GEN-LAST:event_jTable10MouseEntered

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        JTabbedPane pane = (JTabbedPane) evt.getSource();
        int sel = pane.getSelectedIndex();
        System.out.println("State changed:" + sel);
        if (sel == 0) {
            jPanel2.setVisible(true);
            repaint();
        } else {
            jPanel2.setVisible(false);
            repaint();
        }
    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
       long waitTime = Configuration.getWaitTime();
        try{
         waitTime = Long.parseLong(jTextField5.getText());
            }catch(NumberFormatException nfe){
              JOptionPane.showMessageDialog(this, "Please enter valid timeout","Timeout Setting Error",JOptionPane.ERROR_MESSAGE);
               return;
            }

        if(waitTime<1){
           JOptionPane.showMessageDialog(this, "Timeout should be >0","Timeout Setting Error",JOptionPane.ERROR_MESSAGE);
           return;
       }
       Configuration.setWaitTime(waitTime);
       JOptionPane.showMessageDialog(this, "Timeout applied successfully","Timeout change",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton18ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                try {
                    //UIManager.setLookAndFeel(new SubstanceMistAquaLookAndFeel());
                    new MainPage().setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private static javax.swing.JComboBox jComboBox1;
    private static javax.swing.JComboBox jComboBox2;
    private static javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable2;
    private static javax.swing.JTable jTable5;
    private javax.swing.JTable jTable7;
    private static javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
    private static Map nymMap;
    private static Map assetMap;
    private static Map serverMap;

    public static void setNymOutbox(Map nymOutboxData){
        nymOutBox = nymOutboxData;
    }

    private void initMainTab() {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {

                    /**
                     * Comment below 2 lines to restore the default
                     * look and feel.
                     */
                    SubstanceLookAndFeel laf = new SubstanceMistAquaLookAndFeel();
                    //UIManager.setLookAndFeel(laf);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });


        jPanel8.setLayout(new CardLayout());
        jPanel15.setLayout(new CardLayout());

        jTable5.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    return;
                }
                System.out.println("valueChanged Action Listener :" + jTable5.getSelectedRow() + "e:" + e.getSource());
                if (jTable5.getSelectedRow() >= 0) {
                    try {
                        jPanel8.setVisible(true);
                        jPanel15.setVisible(true);

                        jSeparator2.setVisible(true);

                        CardLayout topLayout = (CardLayout) (jPanel8.getLayout());
                        CardLayout bottomlayout = (CardLayout) (jPanel15.getLayout());

                        jScrollPane13.setVisible(true);
                        String type = null;
                        String accountID = null;

                        type = (String) jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 2);
                        accountID = (String) jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 3);

                        System.out.println("Type:" + type);

                        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

                        for (int i = 0; i < Account.allAccounts.length; i++) {

                            if (Account.allAccounts[i].equalsIgnoreCase(type)) {
                                try {
                                    topLayout.show(jPanel8, type + "TopPanel");
                                    bottomlayout.show(jPanel15, type + "BottomPanel");
                                    Class obj = Class.forName("com.wrapper.core." + type);
                                    Account account = (Account) obj.newInstance();
                                    Object details = account.getAccountDetails(accountID);
                                    if (details == null) {
                                        JOptionPane.showMessageDialog(null, "Error loading details", "Details Error", JOptionPane.ERROR_MESSAGE);
                                        break;
                                    }
                                    if ("OpenTransactionAccount".equalsIgnoreCase(type)) {
                                        OTDetails otDetails = (OTDetails) details;
                                        Utility.populateOTDetails(otDetails);
                                        ((AccountTableModel)jTable5.getModel()).setValueAt(otDetails.getBalance(), jTable5.getSelectedRow(), 1);
                                    } else if ("CashPurseAccount".equalsIgnoreCase(type)) {
                                        CashPurseDetails cashDetails = (CashPurseDetails) details;
                                        populateCashPurseDetails(cashDetails,cashDetails.getBalance());
                                    } else if ("BitcoinAccount".equalsIgnoreCase(type)) {
                                        populateBitcoinDetails(details);
                                    }

                                    break;
                                } catch (InstantiationException ex) {
                                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (IllegalAccessException ex) {
                                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                repaint();
                            }

                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    } finally {
                        setCursor(Cursor.getDefaultCursor());
                    }
                }
            }
        });

        /*JPanel bitcoinAccount = new BitcoinAccountTopPanel();
        jPanel8.add(bitcoinAccount,"BitcoinTop");

        JPanel openTransactionAccount = new OpenTransactionAccountTopPanel();
        jPanel8.add(openTransactionAccount,"OpenTransactionTop");

        JPanel cashPurseAccount = new CashPurseAccountTopPanel();
        jPanel8.add(cashPurseAccount,"CashPurseTop");

        JPanel bitcoinGrid = new BitcoinAccountBottomPanel();
        jPanel15.add(bitcoinGrid,"BitcoinBottom");

        JPanel otGrid = new OpenTransactionAccountBottomPanel();
        jPanel15.add(otGrid,"OpenTransactionBottom");

        JPanel cashPurseGrid = new CashPurseAccountBottomPanel();
        jPanel15.add(cashPurseGrid,"CashPurseBottom");
         */
        nymMap = new NYM().loadNYM();

        jComboBox1.addItem(new ComboObject("ALL"));
        jComboBox2.addItem(new ComboObject("ALL"));
        jComboBox3.addItem(new ComboObject("ALL"));

        Utility.populateCombo(nymMap, jComboBox1);

        Contract contract = new Contract();

        serverMap = contract.loadServerContract();
        Utility.populateCombo(serverMap, jComboBox2);

        assetMap = contract.loadAssetContract();
        Utility.populateCombo(assetMap, jComboBox3);

        loadAccount("ALL", "ALL", "ALL");

        Account account = null;
        for (int i = 0; i < Account.allAccounts.length; i++) {
            try {

                Class obj = Class.forName("com.wrapper.core." + Account.allAccounts[i]);
                account = (Account) obj.newInstance();
                account.loadAccount("ALL", "ALL", "ALL");

                Class obj1 = Class.forName("com.wrapper.ui.panels." + Account.allAccounts[i] + "TopPanel");
                JPanel topPanel = (JPanel) obj1.newInstance();
                jPanel8.add(topPanel, Account.allAccounts[i] + "TopPanel");

                Class obj2 = Class.forName("com.wrapper.ui.panels." + Account.allAccounts[i] + "BottomPanel");
                JPanel bottomPanel = (JPanel) obj2.newInstance();
                // Setting the account account to retrieve in bottom panel

                jPanel15.add(bottomPanel, Account.allAccounts[i] + "BottomPanel");


            } catch (InstantiationException ex) {
                //Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                ///Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                //Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void populateCashPurseDetails(CashPurseDetails cashDetails, String balance) {
        if (cashDetails == null) {
            return;
        }
        ((AccountTableModel)jTable5.getModel()).setValueAt(balance, jTable5.getSelectedRow(), 1);
        CashPurseAccountTopPanel.populateCashPurseDetails(cashDetails,balance);
        CashPurseAccountBottomPanel.populateCashPurseDetails(cashDetails);

    }

    private void populateBitcoinDetails(Object details) {
        BitcoinAccountTopPanel.populateBitcoinDetails(details);
    }

    public static void reLoadAccount(){
        
        String nymID = "ALL";
        String assetID = "ALL";
        String serverID = "ALL";
        String selectedAccount = (String)jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 3);
        if (nymMap != null && nymMap.size() > 0 && jComboBox1.getSelectedIndex() > 0) {
            nymID = ((String[]) nymMap.get((Integer) jComboBox1.getSelectedIndex() - 1))[1];
        }

        if (assetMap != null && assetMap.size() > 0 && jComboBox3.getSelectedIndex() > 0) {
            assetID = ((String[]) assetMap.get((Integer) jComboBox3.getSelectedIndex() - 1))[1];
        }

        if (serverMap != null && serverMap.size() > 0 && jComboBox2.getSelectedIndex() > 0) {
            serverID = ((String[]) serverMap.get((Integer) jComboBox2.getSelectedIndex() - 1))[1];
        }

        System.out.print("reLoadAccount , nymID :" + nymID+" assetID:"+assetID+" serverID:"+serverID);

        loadAccount(assetID, serverID, nymID);
        boolean isAccountPresent = false;
        for(int i=0;i<jTable5.getRowCount();i++){
            String accountID = (String)jTable5.getModel().getValueAt(i, 3);
            if(selectedAccount.equalsIgnoreCase(accountID)){
                isAccountPresent = true;
                jTable5.setRowSelectionInterval(i, i);
            }
        }

        if(!isAccountPresent)
            clearDetailPage();
    }

    public static void loadAccount(String assetID, String serverID, String nymID) {
        Account account = null;
        for (int i = 0; i < Account.allAccounts.length; i++) {
            try {

                Class obj = Class.forName("com.wrapper.core." + Account.allAccounts[i]);
                account = (Account) obj.newInstance();
                if (i == 0) {
                    account.clearAccountList();

                }
                account.loadAccount(assetID, serverID, nymID);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        ((AccountTableModel) jTable5.getModel()).setValue(account.getAccountList(), jTable5);

    }

    private static void clearDetailPage() {

        CashPurseAccountTopPanel.clearPanel();
        OpenTransactionAccountTopPanel.clearPanel();
        BitcoinAccountTopPanel.clearPanel();

        CashPurseAccountBottomPanel.clearPanel();
        OpenTransactionAccountBottomPanel.clearPanel();
        BitcoinAccountBottomPanel.clearPanel();
    }

    private void initNYMSTab() {

        jTable2.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    return;
                }
                System.out.println("selectedRow:" + jTable2.getSelectedRow());
                if (jTable2.getSelectedRow() >= 0) {
                    String nymID = (String) jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 1);
                    System.out.println("selected nymID:" + nymID);
                    NYM nym = new NYM();
                    nymBox = nym.loadNymBox(nymID);
                    nymOutBox = nym.loadNymOutBox(nymID);
                    System.out.println("loadNymBox loadNymOutBox data loaded");
                    populateNYMDetails(nymID, nym.getRawFileData(nymID), nymBox,nymOutBox);
               }
            }
        });
        ((NYMTableModel) jTable2.getModel()).setValue(new NYM().loadNYM(), jTable2);
    }

    private void initContractsTab() {
        Contract contract = new Contract();
        jTable7.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    return;
                }
                System.out.println("valueChanged:" + jTable7.getSelectedRow() + "e:" + e.getSource());
                if (jTable7.getSelectedRow() >= 0) {
                    String assetID = (String) jTable7.getModel().getValueAt(jTable7.getSelectedRow(), 1);
                    populateAssetContractDetails(assetID, new Contract().getRawAssetFileData(assetID));
                }
            }
        });
        jTable11.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    return;
                }
                System.out.println("valueChanged:" + jTable11.getSelectedRow() + "e:" + e.getSource());
                if (jTable11.getSelectedRow() >= 0) {
                    String serverID = (String) jTable11.getModel().getValueAt(jTable11.getSelectedRow(), 1);
                    populateServerContractDetails(serverID, new Contract().getRawServerFileData(serverID));
                }
            }
        });
        ((AssetContractTableModel) jTable7.getModel()).setValue(contract.loadAssetContract(), jTable7);
        ((ServerContractTableModel) jTable11.getModel()).setValue(contract.loadServerContract(), jTable11);
    }

    private void populateNYMDetails(String id, String rawData, Map nymBox, Map nymOutBox) {
        System.out.println("populateNYMDetails nymID:"+id+" rawData:"+rawData);
        jTextField4.setText(id);
        jTextArea3.setText(rawData);
        jTextArea3.setCaretPosition(0);
        System.out.println("populateNYMDetails before setting grids,nymBox:"+nymBox.entrySet()+"----nymOutBox:"+nymOutBox.entrySet());
        ((NYMBoxTableModel) jTable8.getModel()).setValue(nymBox, jTable8);
        ((NYMOutboxTableModel) jTable10.getModel()).setValue(nymOutBox, jTable10);
        System.out.println("populateNYMDetails Ends");
    }

    private void populateAssetContractDetails(String id, String rawData) {
        jTextField7.setText(id);
        jTextArea6.setText(rawData);
        jTextArea6.setCaretPosition(0);
    }

    private void populateServerContractDetails(String id, String rawData) {
        jTextField8.setText(id);
        jTextArea7.setText(rawData);
        jTextArea7.setCaretPosition(0);
    }

    private void refreshNYMSList() {

        System.out.println("IN refreshNYMSList");

        ((NYMTableModel) jTable2.getModel()).setValue(new NYM().loadNYM(), jTable2);
        nymMap = new NYM().loadNYM();

        Utility.populateCombo(nymMap, jComboBox1);
    }

    private void refreshAssetContractList() {

        Contract contract = new Contract();
        ((AssetContractTableModel) jTable7.getModel()).setValue(contract.loadAssetContract(), jTable7);
        assetMap.clear();
        assetMap = contract.loadAssetContract();
        Utility.populateCombo(assetMap, jComboBox3);
    }

    private void refreshServerContractList() {
        Contract contract = new Contract();
        ((ServerContractTableModel) jTable11.getModel()).setValue(contract.loadServerContract(), jTable11);
        serverMap.clear();
        serverMap = contract.loadServerContract();
        System.out.println("serverv" + serverMap.entrySet());
        Utility.populateCombo(serverMap, jComboBox2);

    }

    public static JTable getAccountTable() {
        return jTable5;
    }

    private void initSettingsTab() {
        jTextField5.setText(String.valueOf(Configuration.getWaitTime()));
    }

    private void initCreditsTab() {
        final String fileName ="LICENSE-AND-CREDITS.txt";
        System.out.println("PAth:"+Utility.getDataFolder()+File.separator+fileName);
        jTextArea1.setText(Utility.fileToString(new File(Utility.getDataFolder()+File.separator+fileName)));
        jTextArea1.setCaretPosition(0);
    }
}