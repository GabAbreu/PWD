/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pwp;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

/**
 *
 * @author Gabriel
 */
public class face extends javax.swing.JFrame {

    
    public face() {
        initComponents();
        URL url = this.getClass().getResource("icone.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(iconeTitulo);
        
        btnDelete.setBackground(Color.GRAY);
        
        Date data = new Date();
        int semana = data.getDay();
        int dia = data.getDate();
        int mes = data.getMonth();
        int ano = data.getYear();
        
            
        
    
        
        
        try{BufferedReader br = new BufferedReader(new FileReader(new File("SaveDiarias.txt"))); 
        //ler todas linhas 1 por 1.
            String diaria = br.readLine();
            if(diaria.equals(dia+"_"+(mes+1)+"_"+(ano+1900))){
            String d1 = br.readLine();
            String d2 = br.readLine();
            String d3 = br.readLine();
            String d4 = br.readLine();
            String d5 = br.readLine();
            String d6 = br.readLine();
            String d7 = br.readLine();
            String d8 = br.readLine();
            String d9 = br.readLine();
            String d10 = br.readLine();
            String d11 = br.readLine();
            String d12 = br.readLine();
            String d13 = br.readLine();
            String d14 = br.readLine();
            
            if(d1.equals("0")){
            btnDBH.setBackground(Color.RED);
        }else{
                btnDBH.setBackground(Color.GREEN);
            }
            if(d2.equals("0")){
            btnDRio.setBackground(Color.RED);
        }else{
                btnDRio.setBackground(Color.GREEN);
            }
            if(d3.equals("0")){
            btnDCat.setBackground(Color.RED);
        }else{
                btnDCat.setBackground(Color.GREEN);
            }
            if(d4.equals("0")){
            btnDParaiso.setBackground(Color.RED);
        }else{
                btnDParaiso.setBackground(Color.GREEN);
            }
            if(d5.equals("0")){
            btnDAurora.setBackground(Color.RED);
        }else{
                btnDAurora.setBackground(Color.GREEN);
            }
            if(d6.equals("0")){
            btnDLab.setBackground(Color.RED);
        }else{
                btnDLab.setBackground(Color.GREEN);
            }
            if(d7.equals("0")){
            btnDUIA.setBackground(Color.RED);
        }else{
                btnDUIA.setBackground(Color.GREEN);
            }
            if(d8.equals("0")){
            btnDCasa.setBackground(Color.RED);
        }else{
                btnDCasa.setBackground(Color.GREEN);
            }
            if(d9.equals("0")){
            btnDAoRun.setBackground(Color.RED);
        }else{
                btnDAoRun.setBackground(Color.GREEN);
            }
            if(d10.equals("0")){
            btnDMorai.setBackground(Color.RED);
        }else{
                btnDMorai.setBackground(Color.GREEN);
            }
            if(d11.equals("0")){
            btnDPrimal.setBackground(Color.RED);
        }else{
                btnDPrimal.setBackground(Color.GREEN);
            }
            if(d12.equals("0")){
            btnDBase.setBackground(Color.RED);
        }else{
                btnDBase.setBackground(Color.GREEN);
            }
            if(d13.equals("0")){
            btnDVale.setBackground(Color.RED);
        }else{
                btnDVale.setBackground(Color.GREEN);
            }
            if(d14.equals("0")){
            btnDVM.setBackground(Color.RED);
        }else{
                btnDVM.setBackground(Color.GREEN);
            }
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        try{BufferedReader br = new BufferedReader(new FileReader(new File("SaveSemanais.txt")));
            //ler todas linhas 1 por 1.
            String semanas = br.readLine();
            int sems = Integer.parseInt(semanas);
            int s = 0;
            String diad = br.readLine();
            String mesm = br.readLine();
            String anoa = br.readLine();
            String s1 = br.readLine();
            String s2 = br.readLine();
            String s3 = br.readLine();
            String s4 = br.readLine();
            String s5 = br.readLine();
            String s6 = br.readLine();
            String s7 = br.readLine();
            String s8 = br.readLine();
            String s9 = br.readLine();
            String s10 = br.readLine();
            String s11 = br.readLine();
            
            
            
            if(s1.equals("0")){
                btnSPurga.setBackground(Color.RED);
            }else{
                switch(sems){
                    case 1:
                        s = 1;
                        break;
                    case 2:
                        s = 0; //dia que reseta = 0 ( segunda reseta )
                        break;
                    case 3:
                        s = 6;
                        break;
                    case 4:
                        s = 5;
                        break;
                    case 5:
                        s = 4;
                        break;
                    case 6:
                        s = 3;
                        break;
                    case 7:
                        s = 2;
                }
                
                
                int diferenca = dia - Integer.parseInt(diad);
                if(diferenca >= 1){
                if(s - diferenca < 1){
                    btnSPurga.setBackground(Color.RED);
                }else{
                    btnSPurga.setBackground(Color.GREEN);
                }
            }else{
                    btnSPurga.setBackground(Color.GREEN);
                }
            }
            
            if(s2.equals("0")){
                btnSArcadia.setBackground(Color.RED);
            }else{
                switch(sems){
                    case 1:
                        s = 1;
                        break;
                    case 2:
                        s = 0; //dia que reseta = 0 ( segunda reseta )
                        break;
                    case 3:
                        s = 6;
                        break;
                    case 4:
                        s = 5;
                        break;
                    case 5:
                        s = 4;
                        break;
                    case 6:
                        s = 3;
                        break;
                    case 7:
                        s = 2;
                }
                
                
                int diferenca = dia - Integer.parseInt(diad);
                if(diferenca >= 1){
                if(s - diferenca < 1){
                    btnSArcadia.setBackground(Color.RED);
                }else{
                    btnSArcadia.setBackground(Color.GREEN);
                }
            }else{
                    btnSArcadia.setBackground(Color.GREEN);
                }
            }
            
            if(s3.equals("0")){
                btnSMorai.setBackground(Color.RED);
            }else{
                switch(sems){
                    case 1:
                        s = 1;
                        break;
                    case 2:
                        s = 0; //dia que reseta = 0 ( segunda reseta )
                        break;
                    case 3:
                        s = 6;
                        break;
                    case 4:
                        s = 5;
                        break;
                    case 5:
                        s = 4;
                        break;
                    case 6:
                        s = 3;
                        break;
                    case 7:
                        s = 2;
                }
                
                
                int diferenca = dia - Integer.parseInt(diad);
                if(diferenca >= 1){
                if(s - diferenca < 1){
                    btnSMorai.setBackground(Color.RED);
                }else{
                    btnSMorai.setBackground(Color.GREEN);
                }
            }else{
                    btnSMorai.setBackground(Color.GREEN);
                }
            }
            
            if(s4.equals("0")){
                btnSParaiso.setBackground(Color.RED);
            }else{
                switch(sems){
                    case 1:
                        s = 1;
                        break;
                    case 2:
                        s = 0; //dia que reseta = 0 ( segunda reseta )
                        break;
                    case 3:
                        s = 6;
                        break;
                    case 4:
                        s = 5;
                        break;
                    case 5:
                        s = 4;
                        break;
                    case 6:
                        s = 3;
                        break;
                    case 7:
                        s = 2;
                }
                
                
                int diferenca = dia - Integer.parseInt(diad);
                if(diferenca >= 1){
                if(s - diferenca < 1){
                    btnSParaiso.setBackground(Color.RED);
                }else{
                    btnSParaiso.setBackground(Color.GREEN);
                }
            }else{
                    btnSParaiso.setBackground(Color.GREEN);
                }
            }
            
            if(s5.equals("0")){
                btnSAurora.setBackground(Color.RED);
            }else{
                switch(sems){
                    case 1:
                        s = 1;
                        break;
                    case 2:
                        s = 0; //dia que reseta = 0 ( segunda reseta )
                        break;
                    case 3:
                        s = 6;
                        break;
                    case 4:
                        s = 5;
                        break;
                    case 5:
                        s = 4;
                        break;
                    case 6:
                        s = 3;
                        break;
                    case 7:
                        s = 2;
                }
                
                
                int diferenca = dia - Integer.parseInt(diad);
                if(diferenca >= 1){
                if(s - diferenca < 1){
                    btnSAurora.setBackground(Color.RED);
                }else{
                    btnSAurora.setBackground(Color.GREEN);
                }
            }else{
                    btnSAurora.setBackground(Color.GREEN);
                }
            }
            
            if(s6.equals("0")){
                btnSNuema.setBackground(Color.RED);
            }else{
                switch(sems){
                    case 1:
                        s = 6;
                        break;
                    case 2:
                        s = 5;
                        break;
                    case 3:
                        s = 4;
                        break;
                    case 4:
                        s = 3;
                        break;
                    case 5:
                        s = 2;
                        break;
                    case 6:
                        s = 1;
                        break;
                    case 7:
                        s = 0; //dia que reseta = 0 ( sabado reseta )
                }
                
                
                int diferenca = dia - Integer.parseInt(diad);
                if(diferenca >= 1){
                if(s - diferenca < 1){
                    btnSNuema.setBackground(Color.RED);
                }else{
                    btnSNuema.setBackground(Color.GREEN);
                }
            }else{
                    btnSNuema.setBackground(Color.GREEN);
                }
            }
            
            if(s7.equals("0")){
                btnSTorre.setBackground(Color.RED);
            }else{
                switch(sems){
                    case 1:
                        s = 3;
                        break;
                    case 2:
                        s = 2;
                        break;
                    case 3:
                        s = 1;
                        break;
                    case 4:
                        s = 0; //dia que reseta = 0 ( quarta reseta )
                        break;
                    case 5:
                        s = 6;
                        break;
                    case 6:
                        s = 5;
                        break;
                    case 7:
                        s = 4;
                }
                
                
                int diferenca = dia - Integer.parseInt(diad);
                if(diferenca >= 1){
                if(s - diferenca < 1){
                    btnSTorre.setBackground(Color.RED);
                }else{
                    btnSTorre.setBackground(Color.GREEN);
                }
            }else{
                    btnSTorre.setBackground(Color.GREEN);
                }
            }
            
            if(s8.equals("0")){
                btnSArena.setBackground(Color.RED);
            }else{
                switch(sems){
                    case 1:
                        s = 1;
                        break;
                    case 2:
                        s = 0; //dia que reseta = 0 ( segunda reseta )
                        break;
                    case 3:
                        s = 6;
                        break;
                    case 4:
                        s = 5;
                        break;
                    case 5:
                        s = 4;
                        break;
                    case 6:
                        s = 3;
                        break;
                    case 7:
                        s = 2;
                }
                
                
                int diferenca = dia - Integer.parseInt(diad);
                if(diferenca >= 1){
                if(s - diferenca < 1){
                    btnSArena.setBackground(Color.RED);
                }else{
                    btnSArena.setBackground(Color.GREEN);
                }
            }else{
                    btnSArena.setBackground(Color.GREEN);
                }
            }
            
            if(s9.equals("0")){
                btnSAoRun.setBackground(Color.RED);
            }else{
                switch(sems){
                    case 1:
                        s = 4;
                        break;
                    case 2:
                        s = 3;
                        break;
                    case 3:
                        s = 2;
                        break;
                    case 4:
                        s = 1;
                        break;
                    case 5:
                        s = 0; //dia que reseta = 0 ( quinta reseta )
                        break;
                    case 6:
                        s = 6;
                        break;
                    case 7:
                        s = 5;
                }
                
                
                int diferenca = dia - Integer.parseInt(diad);
                if(diferenca >= 1){
                if(s - diferenca < 1){
                    btnSAoRun.setBackground(Color.RED);
                }else{
                    btnSAoRun.setBackground(Color.GREEN);
                }
            }else{
                    btnSAoRun.setBackground(Color.GREEN);
                }
            }
            
            if(s10.equals("0")){
                btnSExtra.setBackground(Color.RED);
            }else{
                switch(sems){
                    case 1:
                        s = 0; //dia que reseta = 0 ( domingo reseta )
                        break;
                    case 2:
                        s = 6;
                        break;
                    case 3:
                        s = 5;
                        break;
                    case 4:
                        s = 4;
                        break;
                    case 5:
                        s = 3;
                        break;
                    case 6:
                        s = 2;
                        break;
                    case 7:
                        s = 1;
                }
                
                
                int diferenca = dia - Integer.parseInt(diad);
                if(diferenca >= 1){
                if(s - diferenca < 1){
                    btnSExtra.setBackground(Color.RED);
                }else{
                    btnSExtra.setBackground(Color.GREEN);
                }
            }else{
                    btnSExtra.setBackground(Color.GREEN);
                }
            }
                
            
            if(s11.equals("0")){
                btnEUIA.setBackground(Color.RED);
            }else{
                switch(sems){
                    case 1:
                        s = 1; 
                        break;
                    case 2:
                        s = 0; //dia que reseta = 0 ( segunda reseta )
                        break;
                    case 3:
                        s = 6;
                        break;
                    case 4:
                        s = 5;
                        break;
                    case 5:
                        s = 4;
                        break;
                    case 6:
                        s = 3;
                        break;
                    case 7:
                        s = 2;
                }
                
                
                int diferenca = dia - Integer.parseInt(diad);
                if(diferenca >= 1){
                    if(s - diferenca < 1){
                        btnEUIA.setBackground(Color.RED);
                    }else{
                        btnEUIA.setBackground(Color.GREEN);
                    }
                    }else{
                        btnEUIA.setBackground(Color.GREEN);
                    }
            }
                
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        try{BufferedReader br = new BufferedReader(new FileReader(new File("SaveEntradas.txt")));
            //ler todas linhas 1 por 1.
            String diaria = br.readLine();
            if(diaria.equals(dia+"_"+(mes+1)+"_"+(ano+1900))){
                String e1 = br.readLine();
                String e2 = br.readLine();
                String e3 = br.readLine();
                String e4 = br.readLine();
                String e5 = br.readLine();
                String e6 = br.readLine();
                
                if(e1.equals("0")){
                    btnELab.setBackground(Color.RED);
                }else{
                    btnELab.setBackground(Color.GREEN);
                }
                if(e2.equals("0")){
                    btnEParaiso.setBackground(Color.RED);
                }else{
                    btnEParaiso.setBackground(Color.GREEN);
                }
                if(e3.equals("0")){
                    btnEAurora.setBackground(Color.RED);
                }else{
                    btnEAurora.setBackground(Color.GREEN);
                }
                if(e4.equals("0")){
                    btnEAsa.setBackground(Color.RED);
                }else{
                    btnEAsa.setBackground(Color.GREEN);
                }
                if(e5.equals("0")){
                    btnENirvana.setBackground(Color.RED);
                }else{
                    btnENirvana.setBackground(Color.GREEN);
                }
                
                
                
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        try{BufferedReader br = new BufferedReader(new FileReader(new File("SaveBlock.txt"))); 
        //ler todas linhas 1 por 1.
            String b1 = br.readLine();
            String b2 = br.readLine();
            String b3 = br.readLine();
            String b4 = br.readLine();
            String b5 = br.readLine();
            String b6 = br.readLine();
            String b7 = br.readLine();
            String b8 = br.readLine();
            String b9 = br.readLine();
            String b10 = br.readLine();
            String b11 = br.readLine();
            String b12 = br.readLine();
            String b13 = br.readLine();
            String b14 = br.readLine();
            String b15 = br.readLine();
            String b16 = br.readLine();
            String b17 = br.readLine();
            String b18 = br.readLine();
            String b19 = br.readLine();
            String b20 = br.readLine();
            String b21 = br.readLine();
            String b22 = br.readLine();
            String b23 = br.readLine();
            String b24 = br.readLine();
            String b25 = br.readLine();
            String b26 = br.readLine();
            String b27 = br.readLine();
            String b28 = br.readLine();
            String b29 = br.readLine();
            String b30 = br.readLine();
            
            if(b1.equals("1")){
                btnDBH.setBackground(Color.GRAY);
                btnDBH.setEnabled(false);
            }
            if(b2.equals("1")){
                btnDRio.setBackground(Color.GRAY);
                btnDRio.setEnabled(false);
            }
            if(b3.equals("1")){
                btnDCat.setBackground(Color.GRAY);
                btnDCat.setEnabled(false);
            }
            if(b4.equals("1")){
                btnDParaiso.setBackground(Color.GRAY);
                btnDParaiso.setEnabled(false);
            }
            if(b5.equals("1")){
                btnDAurora.setBackground(Color.GRAY);
                btnDAurora.setEnabled(false);
            }
            if(b6.equals("1")){
                btnDLab.setBackground(Color.GRAY);
                btnDLab.setEnabled(false);
            }
            if(b7.equals("1")){
                btnDUIA.setBackground(Color.GRAY);
                btnDUIA.setEnabled(false);
            }
            if(b8.equals("1")){
                btnDCasa.setBackground(Color.GRAY);
                btnDCasa.setEnabled(false);
            }
            if(b9.equals("1")){
                btnDAoRun.setBackground(Color.GRAY);
                btnDAoRun.setEnabled(false);
            }
            if(b10.equals("1")){
                btnDMorai.setBackground(Color.GRAY);
                btnDMorai.setEnabled(false);
            }
            if(b11.equals("1")){
                btnDPrimal.setBackground(Color.GRAY);
                btnDPrimal.setEnabled(false);
            }
            if(b12.equals("1")){
                btnDBase.setBackground(Color.GRAY);
                btnDBase.setEnabled(false);
            }
            if(b13.equals("1")){
                btnDVale.setBackground(Color.GRAY);
                btnDVale.setEnabled(false);
            }
            if(b14.equals("1")){
                btnDVM.setBackground(Color.GRAY);
                btnDVM.setEnabled(false);
            }
            if(b15.equals("1")){
                btnSPurga.setBackground(Color.GRAY);
                btnSPurga.setEnabled(false);
            }
            if(b16.equals("1")){
                btnSArcadia.setBackground(Color.GRAY);
                btnSArcadia.setEnabled(false);
            }
            if(b17.equals("1")){
                btnSMorai.setBackground(Color.GRAY);
                btnSMorai.setEnabled(false);
            }
            if(b18.equals("1")){
                btnSParaiso.setBackground(Color.GRAY);
                btnSParaiso.setEnabled(false);
            }
            if(b19.equals("1")){
                btnSAurora.setBackground(Color.GRAY);
                btnSAurora.setEnabled(false);
            }
            if(b20.equals("1")){
                btnSNuema.setBackground(Color.GRAY);
                btnSNuema.setEnabled(false);
            }
            if(b21.equals("1")){
                btnSTorre.setBackground(Color.GRAY);
                btnSTorre.setEnabled(false);
            }
            if(b22.equals("1")){
                btnSArena.setBackground(Color.GRAY);
                btnSArena.setEnabled(false);
            }
            if(b23.equals("1")){
                btnSAoRun.setBackground(Color.GRAY);
                btnSAoRun.setEnabled(false);
            }
            if(b24.equals("1")){
                btnSExtra.setBackground(Color.GRAY);
                btnSExtra.setEnabled(false);
            }
            if(b25.equals("1")){
                btnELab.setBackground(Color.GRAY);
                btnELab.setEnabled(false);
            }
            if(b26.equals("1")){
                btnEParaiso.setBackground(Color.GRAY);
                btnEParaiso.setEnabled(false);
            }
            if(b27.equals("1")){
                btnEAurora.setBackground(Color.GRAY);
                btnEAurora.setEnabled(false);
            }
            if(b28.equals("1")){
                btnEUIA.setBackground(Color.GRAY);
                btnEUIA.setEnabled(false);
            }
            if(b29.equals("1")){
                btnEAsa.setBackground(Color.GRAY);
                btnEAsa.setEnabled(false);
            }
            if(b30.equals("1")){
                btnENirvana.setBackground(Color.GRAY);
                btnENirvana.setEnabled(false);
            }
            
            
        }catch(Exception e){
            System.out.println(e);
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

        btnDBH = new javax.swing.JButton();
        btnDRio = new javax.swing.JButton();
        btnDCat = new javax.swing.JButton();
        btnDCasa = new javax.swing.JButton();
        btnDAoRun = new javax.swing.JButton();
        btnDMorai = new javax.swing.JButton();
        btnDVale = new javax.swing.JButton();
        btnDVM = new javax.swing.JButton();
        btnDParaiso = new javax.swing.JButton();
        btnDAurora = new javax.swing.JButton();
        btnSExtra = new javax.swing.JButton();
        btnSArcadia = new javax.swing.JButton();
        btnSPurga = new javax.swing.JButton();
        btnSMorai = new javax.swing.JButton();
        btnSParaiso = new javax.swing.JButton();
        btnSAurora = new javax.swing.JButton();
        btnSNuema = new javax.swing.JButton();
        btnSTorre = new javax.swing.JButton();
        btnSArena = new javax.swing.JButton();
        btnSAoRun = new javax.swing.JButton();
        btnEAsa = new javax.swing.JButton();
        btnELab = new javax.swing.JButton();
        btnEParaiso = new javax.swing.JButton();
        btnEAurora = new javax.swing.JButton();
        btnEUIA = new javax.swing.JButton();
        btnDLab = new javax.swing.JButton();
        btnDPrimal = new javax.swing.JButton();
        btnDUIA = new javax.swing.JButton();
        btnDBase = new javax.swing.JButton();
        btnENirvana = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnVenus = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnCasa = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PWP");
        setMinimumSize(new java.awt.Dimension(691, 281));
        setPreferredSize(new java.awt.Dimension(615, 281));
        setSize(new java.awt.Dimension(691, 281));
        getContentPane().setLayout(null);

        btnDBH.setBackground(new java.awt.Color(255, 0, 0));
        btnDBH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDBH.setText("BH");
        btnDBH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDBH.setFocusPainted(false);
        btnDBH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDBHMouseClicked(evt);
            }
        });
        btnDBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDBHActionPerformed(evt);
            }
        });
        getContentPane().add(btnDBH);
        btnDBH.setBounds(10, 28, 80, 30);

        btnDRio.setBackground(new java.awt.Color(255, 0, 0));
        btnDRio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDRio.setText("Rio");
        btnDRio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDRio.setFocusPainted(false);
        btnDRio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDRioMouseClicked(evt);
            }
        });
        btnDRio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDRioActionPerformed(evt);
            }
        });
        getContentPane().add(btnDRio);
        btnDRio.setBounds(96, 28, 80, 30);

        btnDCat.setBackground(new java.awt.Color(255, 0, 0));
        btnDCat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDCat.setText("Cat");
        btnDCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDCat.setFocusPainted(false);
        btnDCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDCatMouseClicked(evt);
            }
        });
        btnDCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDCatActionPerformed(evt);
            }
        });
        getContentPane().add(btnDCat);
        btnDCat.setBounds(182, 28, 80, 30);

        btnDCasa.setBackground(new java.awt.Color(255, 0, 0));
        btnDCasa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDCasa.setText("Casa");
        btnDCasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDCasa.setFocusPainted(false);
        btnDCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDCasaMouseClicked(evt);
            }
        });
        btnDCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDCasaActionPerformed(evt);
            }
        });
        getContentPane().add(btnDCasa);
        btnDCasa.setBounds(10, 68, 80, 30);

        btnDAoRun.setBackground(new java.awt.Color(255, 0, 0));
        btnDAoRun.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDAoRun.setText("AoRun");
        btnDAoRun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDAoRun.setFocusPainted(false);
        btnDAoRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDAoRunMouseClicked(evt);
            }
        });
        btnDAoRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDAoRunActionPerformed(evt);
            }
        });
        getContentPane().add(btnDAoRun);
        btnDAoRun.setBounds(96, 68, 80, 30);

        btnDMorai.setBackground(new java.awt.Color(255, 0, 0));
        btnDMorai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDMorai.setText("Morai");
        btnDMorai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDMorai.setFocusPainted(false);
        btnDMorai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDMoraiMouseClicked(evt);
            }
        });
        btnDMorai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDMoraiActionPerformed(evt);
            }
        });
        btnDMorai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDMoraiKeyPressed(evt);
            }
        });
        getContentPane().add(btnDMorai);
        btnDMorai.setBounds(182, 68, 80, 30);

        btnDVale.setBackground(new java.awt.Color(255, 0, 0));
        btnDVale.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDVale.setText("Trivia");
        btnDVale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDVale.setFocusPainted(false);
        btnDVale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDValeMouseClicked(evt);
            }
        });
        btnDVale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDValeActionPerformed(evt);
            }
        });
        getContentPane().add(btnDVale);
        btnDVale.setBounds(440, 68, 80, 30);

        btnDVM.setBackground(new java.awt.Color(255, 0, 0));
        btnDVM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDVM.setText("Logue");
        btnDVM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDVM.setFocusPainted(false);
        btnDVM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDVMMouseClicked(evt);
            }
        });
        btnDVM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDVMActionPerformed(evt);
            }
        });
        getContentPane().add(btnDVM);
        btnDVM.setBounds(526, 68, 80, 30);

        btnDParaiso.setBackground(new java.awt.Color(255, 0, 0));
        btnDParaiso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDParaiso.setText("Paraiso");
        btnDParaiso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDParaiso.setFocusPainted(false);
        btnDParaiso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDParaisoMouseClicked(evt);
            }
        });
        btnDParaiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDParaisoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDParaiso);
        btnDParaiso.setBounds(268, 28, 80, 30);

        btnDAurora.setBackground(new java.awt.Color(255, 0, 0));
        btnDAurora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDAurora.setText("Aurora");
        btnDAurora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDAurora.setFocusPainted(false);
        btnDAurora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDAuroraMouseClicked(evt);
            }
        });
        btnDAurora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDAuroraActionPerformed(evt);
            }
        });
        getContentPane().add(btnDAurora);
        btnDAurora.setBounds(354, 28, 80, 30);

        btnSExtra.setBackground(new java.awt.Color(255, 0, 0));
        btnSExtra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSExtra.setText("Extra");
        btnSExtra.setToolTipText("Reseta Domingo");
        btnSExtra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSExtra.setFocusPainted(false);
        btnSExtra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSExtraMouseClicked(evt);
            }
        });
        btnSExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSExtraActionPerformed(evt);
            }
        });
        getContentPane().add(btnSExtra);
        btnSExtra.setBounds(354, 166, 80, 30);

        btnSArcadia.setBackground(new java.awt.Color(255, 0, 0));
        btnSArcadia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSArcadia.setText("Arcádia");
        btnSArcadia.setToolTipText("Reseta Segunda");
        btnSArcadia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSArcadia.setFocusPainted(false);
        btnSArcadia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSArcadiaMouseClicked(evt);
            }
        });
        btnSArcadia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSArcadiaActionPerformed(evt);
            }
        });
        btnSArcadia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSArcadiaKeyPressed(evt);
            }
        });
        getContentPane().add(btnSArcadia);
        btnSArcadia.setBounds(96, 126, 80, 30);

        btnSPurga.setBackground(new java.awt.Color(255, 0, 0));
        btnSPurga.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSPurga.setText("Purga");
        btnSPurga.setToolTipText("Reseta Segunda");
        btnSPurga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSPurga.setFocusPainted(false);
        btnSPurga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSPurgaMouseClicked(evt);
            }
        });
        btnSPurga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSPurgaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSPurga);
        btnSPurga.setBounds(10, 126, 80, 30);

        btnSMorai.setBackground(new java.awt.Color(255, 0, 0));
        btnSMorai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSMorai.setText("Morai");
        btnSMorai.setToolTipText("Reseta Segunda");
        btnSMorai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSMorai.setFocusPainted(false);
        btnSMorai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSMoraiMouseClicked(evt);
            }
        });
        btnSMorai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMoraiActionPerformed(evt);
            }
        });
        getContentPane().add(btnSMorai);
        btnSMorai.setBounds(182, 126, 80, 30);

        btnSParaiso.setBackground(new java.awt.Color(255, 0, 0));
        btnSParaiso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSParaiso.setText("Paraiso");
        btnSParaiso.setToolTipText("Reseta Segunda");
        btnSParaiso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSParaiso.setFocusPainted(false);
        btnSParaiso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSParaisoMouseClicked(evt);
            }
        });
        btnSParaiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSParaisoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSParaiso);
        btnSParaiso.setBounds(268, 126, 80, 30);

        btnSAurora.setBackground(new java.awt.Color(255, 0, 0));
        btnSAurora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSAurora.setText("Aurora");
        btnSAurora.setToolTipText("Reseta Segunda");
        btnSAurora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSAurora.setFocusPainted(false);
        btnSAurora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSAuroraMouseClicked(evt);
            }
        });
        btnSAurora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAuroraActionPerformed(evt);
            }
        });
        getContentPane().add(btnSAurora);
        btnSAurora.setBounds(354, 126, 80, 30);

        btnSNuema.setBackground(new java.awt.Color(255, 0, 0));
        btnSNuema.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSNuema.setText("Nuema");
        btnSNuema.setToolTipText("Reseta Sábado");
        btnSNuema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSNuema.setFocusPainted(false);
        btnSNuema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSNuemaMouseClicked(evt);
            }
        });
        btnSNuema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSNuemaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSNuema);
        btnSNuema.setBounds(10, 166, 80, 30);

        btnSTorre.setBackground(new java.awt.Color(255, 0, 0));
        btnSTorre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSTorre.setText("Torre");
        btnSTorre.setToolTipText("Reseta Quarta 7h");
        btnSTorre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSTorre.setFocusPainted(false);
        btnSTorre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSTorreMouseClicked(evt);
            }
        });
        btnSTorre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSTorreActionPerformed(evt);
            }
        });
        getContentPane().add(btnSTorre);
        btnSTorre.setBounds(96, 166, 80, 30);

        btnSArena.setBackground(new java.awt.Color(255, 0, 0));
        btnSArena.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSArena.setText("Arena");
        btnSArena.setToolTipText("Reseta Segunda");
        btnSArena.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSArena.setFocusPainted(false);
        btnSArena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSArenaMouseClicked(evt);
            }
        });
        btnSArena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSArenaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSArena);
        btnSArena.setBounds(182, 166, 80, 30);

        btnSAoRun.setBackground(new java.awt.Color(255, 0, 0));
        btnSAoRun.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSAoRun.setText("AoRun");
        btnSAoRun.setToolTipText("Reseta Quinta");
        btnSAoRun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSAoRun.setFocusPainted(false);
        btnSAoRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSAoRunMouseClicked(evt);
            }
        });
        btnSAoRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAoRunActionPerformed(evt);
            }
        });
        getContentPane().add(btnSAoRun);
        btnSAoRun.setBounds(268, 166, 80, 30);

        btnEAsa.setBackground(new java.awt.Color(255, 0, 0));
        btnEAsa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEAsa.setText("Asa");
        btnEAsa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEAsa.setFocusPainted(false);
        btnEAsa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEAsaMouseClicked(evt);
            }
        });
        btnEAsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEAsaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEAsa);
        btnEAsa.setBounds(354, 224, 80, 30);

        btnELab.setBackground(new java.awt.Color(255, 0, 0));
        btnELab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnELab.setText("Lab");
        btnELab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnELab.setFocusPainted(false);
        btnELab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnELabMouseClicked(evt);
            }
        });
        btnELab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnELabActionPerformed(evt);
            }
        });
        getContentPane().add(btnELab);
        btnELab.setBounds(10, 224, 80, 30);

        btnEParaiso.setBackground(new java.awt.Color(255, 0, 0));
        btnEParaiso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEParaiso.setText("Paraiso");
        btnEParaiso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEParaiso.setFocusPainted(false);
        btnEParaiso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEParaisoMouseClicked(evt);
            }
        });
        btnEParaiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEParaisoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEParaiso);
        btnEParaiso.setBounds(96, 224, 80, 30);

        btnEAurora.setBackground(new java.awt.Color(255, 0, 0));
        btnEAurora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEAurora.setText("Aurora");
        btnEAurora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEAurora.setFocusPainted(false);
        btnEAurora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEAuroraMouseClicked(evt);
            }
        });
        btnEAurora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEAuroraActionPerformed(evt);
            }
        });
        getContentPane().add(btnEAurora);
        btnEAurora.setBounds(182, 224, 80, 30);

        btnEUIA.setBackground(new java.awt.Color(255, 0, 0));
        btnEUIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEUIA.setText("UIA");
        btnEUIA.setToolTipText("Reseta Segunda");
        btnEUIA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEUIA.setFocusPainted(false);
        btnEUIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEUIAMouseClicked(evt);
            }
        });
        btnEUIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEUIAActionPerformed(evt);
            }
        });
        getContentPane().add(btnEUIA);
        btnEUIA.setBounds(268, 224, 80, 30);

        btnDLab.setBackground(new java.awt.Color(255, 0, 0));
        btnDLab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDLab.setText("Lab");
        btnDLab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDLab.setFocusPainted(false);
        btnDLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDLabMouseClicked(evt);
            }
        });
        btnDLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDLabActionPerformed(evt);
            }
        });
        getContentPane().add(btnDLab);
        btnDLab.setBounds(440, 28, 80, 30);

        btnDPrimal.setBackground(new java.awt.Color(255, 0, 0));
        btnDPrimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDPrimal.setText("Primal");
        btnDPrimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDPrimal.setFocusPainted(false);
        btnDPrimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDPrimalMouseClicked(evt);
            }
        });
        btnDPrimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDPrimalActionPerformed(evt);
            }
        });
        getContentPane().add(btnDPrimal);
        btnDPrimal.setBounds(268, 68, 80, 30);

        btnDUIA.setBackground(new java.awt.Color(255, 0, 0));
        btnDUIA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDUIA.setText("Asa");
        btnDUIA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDUIA.setFocusPainted(false);
        btnDUIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDUIAMouseClicked(evt);
            }
        });
        btnDUIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDUIAActionPerformed(evt);
            }
        });
        getContentPane().add(btnDUIA);
        btnDUIA.setBounds(526, 28, 80, 30);

        btnDBase.setBackground(new java.awt.Color(255, 0, 0));
        btnDBase.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDBase.setText("Vale");
        btnDBase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDBase.setFocusPainted(false);
        btnDBase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDBaseMouseClicked(evt);
            }
        });
        btnDBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDBaseActionPerformed(evt);
            }
        });
        getContentPane().add(btnDBase);
        btnDBase.setBounds(354, 68, 80, 30);

        btnENirvana.setBackground(new java.awt.Color(255, 0, 0));
        btnENirvana.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnENirvana.setText("Nirvana");
        btnENirvana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnENirvana.setFocusPainted(false);
        btnENirvana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnENirvanaMouseClicked(evt);
            }
        });
        btnENirvana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnENirvanaActionPerformed(evt);
            }
        });
        getContentPane().add(btnENirvana);
        btnENirvana.setBounds(440, 224, 80, 30);

        btnSalvar.setBackground(new java.awt.Color(102, 102, 255));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pwp/btnSalvar.png"))); // NOI18N
        btnSalvar.setBorder(null);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setFocusPainted(false);
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalvarMouseExited(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(618, 185, 66, 23);

        btnVenus.setBackground(new java.awt.Color(153, 255, 255));
        btnVenus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVenus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pwp/btnVenus.png"))); // NOI18N
        btnVenus.setBorder(null);
        btnVenus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenus.setFocusPainted(false);
        btnVenus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVenusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVenusMouseExited(evt);
            }
        });
        btnVenus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenusActionPerformed(evt);
            }
        });
        getContentPane().add(btnVenus);
        btnVenus.setBounds(618, 32, 66, 23);

        btnSair.setBackground(new java.awt.Color(204, 204, 204));
        btnSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pwp/btnSair.png"))); // NOI18N
        btnSair.setBorder(null);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusPainted(false);
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSairMouseExited(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(618, 225, 66, 23);

        btnCasa.setBackground(new java.awt.Color(153, 255, 255));
        btnCasa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pwp/btnCasa.png"))); // NOI18N
        btnCasa.setBorder(null);
        btnCasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCasa.setFocusPainted(false);
        btnCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCasaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCasaMouseExited(evt);
            }
        });
        btnCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCasa);
        btnCasa.setBounds(618, 72, 66, 23);

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("Block");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setFocusPainted(false);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(618, 130, 66, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pwp/Fundo.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 691, 281);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //pega a data
        Date data = new Date();
        int dia = data.getDate();
        int mes = data.getMonth();
        int ano = data.getYear();
        int semana = (1+data.getDay());
        
        //cria o arquivo
        try {
            FileWriter gravacao = new FileWriter("SaveDiarias.txt");
            BufferedWriter bf = new BufferedWriter(gravacao);
            bf.write(dia+"_"+(mes+1)+"_"+(ano+1900));
            bf.newLine();
            if(btnDBH.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDRio.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDCat.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDParaiso.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDAurora.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDLab.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDUIA.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDCasa.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDAoRun.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDMorai.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDPrimal.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDBase.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDVale.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDVM.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.flush();
            bf.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        try {
            FileWriter gravacao = new FileWriter("SaveSemanais.txt");
            BufferedWriter bf = new BufferedWriter(gravacao);
            bf.write(""+semana);
            bf.newLine();
            bf.write(""+dia);
            bf.newLine();
            bf.write(""+(mes+1));
            bf.newLine();
            bf.write(""+(ano+1900));
            bf.newLine();
            if(btnSPurga.getBackground().equals(Color.RED)){
                bf.write("0");
            }else{
                bf.write("1");
            }
            bf.newLine();
            if(btnSArcadia.getBackground().equals(Color.RED)){
                bf.write("0");
            }else{
                bf.write("1");
            }
            bf.newLine();
            if(btnSMorai.getBackground().equals(Color.RED)){
                bf.write("0");
            }else{
                bf.write("1");
            }
            bf.newLine();
            if(btnSParaiso.getBackground().equals(Color.RED)){
                bf.write("0");
            }else{
                bf.write("1");
            }
            bf.newLine();
            if(btnSAurora.getBackground().equals(Color.RED)){
                bf.write("0");
            }else{
                bf.write("1");
            }
            bf.newLine();
            if(btnSNuema.getBackground().equals(Color.RED)){
                bf.write("0");
            }else{
                bf.write("1");
            }
            bf.newLine();
            if(btnSTorre.getBackground().equals(Color.RED)){
                bf.write("0");
            }else{
                bf.write("1");
            }
            bf.newLine();
            if(btnSArena.getBackground().equals(Color.RED)){
                bf.write("0");
            }else{
                bf.write("1");
            }
            bf.newLine();
            if(btnSAoRun.getBackground().equals(Color.RED)){
                bf.write("0");
            }else{
                bf.write("1");
            }
            bf.newLine();
            if(btnSExtra.getBackground().equals(Color.RED)){
                bf.write("0");
            }else{
                bf.write("1");
            }
            bf.newLine();
            if(btnEUIA.getBackground().equals(Color.RED)){
                bf.write("0");
            }else{
                bf.write("1");
            }
            bf.flush();
            bf.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        try {
            FileWriter gravacao = new FileWriter("SaveEntradas.txt");
            BufferedWriter bf = new BufferedWriter(gravacao);
            bf.write(dia+"_"+(mes+1)+"_"+(ano+1900));
            bf.newLine();
            if(btnELab.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnEParaiso.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnEAurora.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnEAsa.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnENirvana.getBackground().equals(Color.green)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.flush();
            bf.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        try {
            FileWriter gravacao = new FileWriter("SaveBlock.txt");
            BufferedWriter bf = new BufferedWriter(gravacao);
            
            if(btnDBH.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDRio.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDCat.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDParaiso.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDAurora.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDLab.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDUIA.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDCasa.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDAoRun.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDMorai.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDPrimal.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDBase.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDVale.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnDVM.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnSPurga.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnSArcadia.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnSMorai.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnSParaiso.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnSAurora.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnSNuema.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnSTorre.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnSArena.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnSAoRun.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnSExtra.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnELab.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnEParaiso.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnEAurora.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnEUIA.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnEAsa.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            bf.newLine();
            if(btnENirvana.getBackground().equals(Color.GRAY)){
                bf.write("1");
            }else{
                bf.write("0");
            }
            
            bf.flush();
            bf.close();
        
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDBHActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnDBH.getBackground().equals(Color.RED)){
            btnDBH.setBackground(Color.GREEN);
        }else{
            if(btnDBH.getBackground().equals(Color.GREEN)){
                btnDBH.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnDBHActionPerformed

    private void btnDRioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDRioActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnDRio.getBackground().equals(Color.RED)){
            btnDRio.setBackground(Color.GREEN);
        }else{
            if(btnDRio.getBackground().equals(Color.GREEN)){
                btnDRio.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnDRioActionPerformed

    private void btnDCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDCatActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnDCat.getBackground().equals(Color.RED)){
            btnDCat.setBackground(Color.GREEN);
        }else{
            if(btnDCat.getBackground().equals(Color.GREEN)){
                btnDCat.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnDCatActionPerformed

    private void btnDParaisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDParaisoActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnDParaiso.getBackground().equals(Color.RED)){
            btnDParaiso.setBackground(Color.GREEN);
        }else{
            if(btnDParaiso.getBackground().equals(Color.GREEN)){
                btnDParaiso.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnDParaisoActionPerformed

    private void btnDAuroraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDAuroraActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnDAurora.getBackground().equals(Color.RED)){
            btnDAurora.setBackground(Color.GREEN);
        }else{
            if(btnDAurora.getBackground().equals(Color.GREEN)){
                btnDAurora.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnDAuroraActionPerformed

    private void btnDLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDLabActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnDLab.getBackground().equals(Color.RED)){
            btnDLab.setBackground(Color.GREEN);
        }else{
            if(btnDLab.getBackground().equals(Color.GREEN)){
                btnDLab.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnDLabActionPerformed

    private void btnDUIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDUIAActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnDUIA.getBackground().equals(Color.RED)){
            btnDUIA.setBackground(Color.GREEN);
        }else{
            if(btnDUIA.getBackground().equals(Color.GREEN)){
                btnDUIA.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnDUIAActionPerformed

    private void btnDCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDCasaActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnDCasa.getBackground().equals(Color.RED)){
            btnDCasa.setBackground(Color.GREEN);
        }else{
            if(btnDCasa.getBackground().equals(Color.GREEN)){
                btnDCasa.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnDCasaActionPerformed

    private void btnDAoRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDAoRunActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnDAoRun.getBackground().equals(Color.RED)){
            btnDAoRun.setBackground(Color.GREEN);
        }else{
            if(btnDAoRun.getBackground().equals(Color.GREEN)){
                btnDAoRun.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnDAoRunActionPerformed

    private void btnDMoraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDMoraiActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnDMorai.getBackground().equals(Color.RED)){
            btnDMorai.setBackground(Color.GREEN);
        }else{
            if(btnDMorai.getBackground().equals(Color.GREEN)){
                btnDMorai.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnDMoraiActionPerformed

    private void btnDPrimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDPrimalActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnDPrimal.getBackground().equals(Color.RED)){
            btnDPrimal.setBackground(Color.GREEN);
        }else{
            if(btnDPrimal.getBackground().equals(Color.GREEN)){
                btnDPrimal.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnDPrimalActionPerformed

    private void btnDBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDBaseActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnDBase.getBackground().equals(Color.RED)){
            btnDBase.setBackground(Color.GREEN);
        }else{
            if(btnDBase.getBackground().equals(Color.GREEN)){
                btnDBase.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnDBaseActionPerformed

    private void btnDValeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDValeActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnDVale.getBackground().equals(Color.RED)){
            btnDVale.setBackground(Color.GREEN);
        }else{
            if(btnDVale.getBackground().equals(Color.GREEN)){
                btnDVale.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnDValeActionPerformed

    private void btnDVMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDVMActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnDVM.getBackground().equals(Color.RED)){
            btnDVM.setBackground(Color.GREEN);
        }else{
            if(btnDVM.getBackground().equals(Color.GREEN)){
                btnDVM.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnDVMActionPerformed

    private void btnSPurgaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSPurgaActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnSPurga.getBackground().equals(Color.RED)){
            btnSPurga.setBackground(Color.GREEN);
        }else{
            if(btnSPurga.getBackground().equals(Color.GREEN)){
                btnSPurga.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnSPurgaActionPerformed

    private void btnSArcadiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSArcadiaActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnSArcadia.getBackground().equals(Color.RED)){
            btnSArcadia.setBackground(Color.GREEN);
        }else{
            if(btnSArcadia.getBackground().equals(Color.GREEN)){
                btnSArcadia.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnSArcadiaActionPerformed

    private void btnSMoraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMoraiActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnSMorai.getBackground().equals(Color.RED)){
            btnSMorai.setBackground(Color.GREEN);
        }else{
            if(btnSMorai.getBackground().equals(Color.GREEN)){
                btnSMorai.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnSMoraiActionPerformed

    private void btnSParaisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSParaisoActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnSParaiso.getBackground().equals(Color.RED)){
            btnSParaiso.setBackground(Color.GREEN);
        }else{
            if(btnSParaiso.getBackground().equals(Color.GREEN)){
                btnSParaiso.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnSParaisoActionPerformed

    private void btnSAuroraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAuroraActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnSAurora.getBackground().equals(Color.RED)){
            btnSAurora.setBackground(Color.GREEN);
        }else{
            if(btnSAurora.getBackground().equals(Color.GREEN)){
                btnSAurora.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnSAuroraActionPerformed

    private void btnSNuemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSNuemaActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnSNuema.getBackground().equals(Color.RED)){
            btnSNuema.setBackground(Color.GREEN);
        }else{
            if(btnSNuema.getBackground().equals(Color.GREEN)){
                btnSNuema.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnSNuemaActionPerformed

    private void btnSTorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSTorreActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnSTorre.getBackground().equals(Color.RED)){
            btnSTorre.setBackground(Color.GREEN);
        }else{
            if(btnSTorre.getBackground().equals(Color.GREEN)){
                btnSTorre.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnSTorreActionPerformed

    private void btnSArenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSArenaActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnSArena.getBackground().equals(Color.RED)){
            btnSArena.setBackground(Color.GREEN);
        }else{
            if(btnSArena.getBackground().equals(Color.GREEN)){
                btnSArena.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnSArenaActionPerformed

    private void btnSAoRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAoRunActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnSAoRun.getBackground().equals(Color.RED)){
            btnSAoRun.setBackground(Color.GREEN);
        }else{
            if(btnSAoRun.getBackground().equals(Color.GREEN)){
                btnSAoRun.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnSAoRunActionPerformed

    private void btnSExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSExtraActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnSExtra.getBackground().equals(Color.RED)){
            btnSExtra.setBackground(Color.GREEN);
        }else{
            if(btnSExtra.getBackground().equals(Color.GREEN)){
                btnSExtra.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnSExtraActionPerformed

    private void btnELabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELabActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnELab.getBackground().equals(Color.RED)){
            btnELab.setBackground(Color.GREEN);
        }else{
            if(btnELab.getBackground().equals(Color.GREEN)){
                btnELab.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnELabActionPerformed

    private void btnEParaisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEParaisoActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnEParaiso.getBackground().equals(Color.RED)){
            btnEParaiso.setBackground(Color.GREEN);
        }else{
            if(btnEParaiso.getBackground().equals(Color.GREEN)){
                btnEParaiso.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnEParaisoActionPerformed

    private void btnEAuroraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEAuroraActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnEAurora.getBackground().equals(Color.RED)){
            btnEAurora.setBackground(Color.GREEN);
        }else{
            if(btnEAurora.getBackground().equals(Color.GREEN)){
                btnEAurora.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnEAuroraActionPerformed

    private void btnEUIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEUIAActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnEUIA.getBackground().equals(Color.RED)){
            btnEUIA.setBackground(Color.GREEN);
        }else{
            if(btnEUIA.getBackground().equals(Color.GREEN)){
                btnEUIA.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnEUIAActionPerformed

    private void btnEAsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEAsaActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnEAsa.getBackground().equals(Color.RED)){
            btnEAsa.setBackground(Color.GREEN);
        }else{
            if(btnEAsa.getBackground().equals(Color.GREEN)){
                btnEAsa.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnEAsaActionPerformed

    private void btnENirvanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnENirvanaActionPerformed
        if(btnDelete.getBackground().equals(Color.GREEN)){
            
        }else{
        if(btnENirvana.getBackground().equals(Color.RED)){
            btnENirvana.setBackground(Color.GREEN);
        }else{
            if(btnENirvana.getBackground().equals(Color.GREEN)){
                btnENirvana.setBackground(Color.RED);
            }
        }
        }
    }//GEN-LAST:event_btnENirvanaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnVenusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenusActionPerformed
        try {
            Runtime.getRuntime().exec("cmd.exe /C start "
                    + "http://deitymessenger.com/Phoenix");
        } catch (IOException ex) {
           System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnVenusActionPerformed

    private void btnCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasaActionPerformed
        try {
            Runtime.getRuntime().exec("cmd.exe /C start "
                    + "http://triviapw.com.br/elysium#phoenix");
        } catch (IOException ex) {
           System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnCasaActionPerformed

    private void btnVenusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenusMouseEntered
        btnVenus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pwp/btnVenusS.png")));
    }//GEN-LAST:event_btnVenusMouseEntered

    private void btnVenusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVenusMouseExited
        btnVenus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pwp/btnVenus.png")));
        
    }//GEN-LAST:event_btnVenusMouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        
    }//GEN-LAST:event_jLabel4MouseEntered

    private void btnCasaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCasaMouseEntered
        btnCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pwp/btnCasaS.png")));
    }//GEN-LAST:event_btnCasaMouseEntered

    private void btnCasaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCasaMouseExited
        btnCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pwp/btnCasa.png")));
    }//GEN-LAST:event_btnCasaMouseExited

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pwp/btnSalvarS.png")));
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pwp/btnSalvar.png")));
    }//GEN-LAST:event_btnSalvarMouseExited

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pwp/btnSairS.png")));
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pwp/btnSair.png")));
    }//GEN-LAST:event_btnSairMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(btnDelete.getBackground().equals(Color.GRAY)){
            btnDelete.setBackground(Color.GREEN);
        }else{
            btnDelete.setBackground(Color.GRAY);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDBHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDBHMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnDBH.getBackground().equals(Color.RED)||btnDBH.getBackground().equals(Color.GREEN)){
            btnDBH.setBackground(Color.GRAY);
            btnDBH.setEnabled(false);
        }
            else{
            btnDBH.setBackground(Color.RED);
            btnDBH.setEnabled(true);
        }
        }
    }//GEN-LAST:event_btnDBHMouseClicked

    private void btnDRioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDRioMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnDRio.getBackground().equals(Color.RED)||btnDRio.getBackground().equals(Color.GREEN)){
                btnDRio.setBackground(Color.GRAY);
                btnDRio.setEnabled(false);
            }
            else{
                btnDRio.setBackground(Color.RED);
                btnDRio.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnDRioMouseClicked

    private void btnDCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDCatMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnDCat.getBackground().equals(Color.RED)||btnDCat.getBackground().equals(Color.GREEN)){
                btnDCat.setBackground(Color.GRAY);
                btnDCat.setEnabled(false);
            }
            else{
                btnDCat.setBackground(Color.RED);
                btnDCat.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnDCatMouseClicked

    private void btnDParaisoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDParaisoMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnDParaiso.getBackground().equals(Color.RED)||btnDParaiso.getBackground().equals(Color.GREEN)){
                btnDParaiso.setBackground(Color.GRAY);
                btnDParaiso.setEnabled(false);
            }
            else{
                btnDParaiso.setBackground(Color.RED);
                btnDParaiso.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnDParaisoMouseClicked

    private void btnDAuroraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDAuroraMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnDAurora.getBackground().equals(Color.RED)||btnDAurora.getBackground().equals(Color.GREEN)){
                btnDAurora.setBackground(Color.GRAY);
                btnDAurora.setEnabled(false);
            }
            else{
                btnDAurora.setBackground(Color.RED);
                btnDAurora.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnDAuroraMouseClicked

    private void btnDLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDLabMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnDLab.getBackground().equals(Color.RED)||btnDLab.getBackground().equals(Color.GREEN)){
                btnDLab.setBackground(Color.GRAY);
                btnDLab.setEnabled(false);
            }
            else{
                btnDLab.setBackground(Color.RED);
                btnDLab.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnDLabMouseClicked

    private void btnDUIAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDUIAMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnDUIA.getBackground().equals(Color.RED)||btnDUIA.getBackground().equals(Color.GREEN)){
                btnDUIA.setBackground(Color.GRAY);
                btnDUIA.setEnabled(false);
            }
            else{
                btnDUIA.setBackground(Color.RED);
                btnDUIA.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnDUIAMouseClicked

    private void btnDCasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDCasaMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnDCasa.getBackground().equals(Color.RED)||btnDCasa.getBackground().equals(Color.GREEN)){
                btnDCasa.setBackground(Color.GRAY);
                btnDCasa.setEnabled(false);
            }
            else{
                btnDCasa.setBackground(Color.RED);
                btnDCasa.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnDCasaMouseClicked

    private void btnDAoRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDAoRunMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnDAoRun.getBackground().equals(Color.RED)||btnDAoRun.getBackground().equals(Color.GREEN)){
                btnDAoRun.setBackground(Color.GRAY);
                btnDAoRun.setEnabled(false);
            }
            else{
                btnDAoRun.setBackground(Color.RED);
                btnDAoRun.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnDAoRunMouseClicked

    private void btnDMoraiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDMoraiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDMoraiKeyPressed

    private void btnDMoraiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDMoraiMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnDMorai.getBackground().equals(Color.RED)||btnDMorai.getBackground().equals(Color.GREEN)){
                btnDMorai.setBackground(Color.GRAY);
                btnDMorai.setEnabled(false);
            }
            else{
                btnDMorai.setBackground(Color.RED);
                btnDMorai.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnDMoraiMouseClicked

    private void btnDPrimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDPrimalMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnDPrimal.getBackground().equals(Color.RED)||btnDPrimal.getBackground().equals(Color.GREEN)){
                btnDPrimal.setBackground(Color.GRAY);
                btnDPrimal.setEnabled(false);
            }
            else{
                btnDPrimal.setBackground(Color.RED);
                btnDPrimal.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnDPrimalMouseClicked

    private void btnDBaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDBaseMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnDBase.getBackground().equals(Color.RED)||btnDBase.getBackground().equals(Color.GREEN)){
                btnDBase.setBackground(Color.GRAY);
                btnDBase.setEnabled(false);
            }
            else{
                btnDBase.setBackground(Color.RED);
                btnDBase.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnDBaseMouseClicked

    private void btnDValeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDValeMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnDVale.getBackground().equals(Color.RED)||btnDVale.getBackground().equals(Color.GREEN)){
                btnDVale.setBackground(Color.GRAY);
                btnDVale.setEnabled(false);
            }
            else{
                btnDVale.setBackground(Color.RED);
                btnDVale.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnDValeMouseClicked

    private void btnDVMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDVMMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnDVM.getBackground().equals(Color.RED)||btnDVM.getBackground().equals(Color.GREEN)){
                btnDVM.setBackground(Color.GRAY);
                btnDVM.setEnabled(false);
            }
            else{
                btnDVM.setBackground(Color.RED);
                btnDVM.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnDVMMouseClicked

    private void btnSPurgaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSPurgaMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnSPurga.getBackground().equals(Color.RED)||btnSPurga.getBackground().equals(Color.GREEN)){
                btnSPurga.setBackground(Color.GRAY);
                btnSPurga.setEnabled(false);
            }
            else{
                btnSPurga.setBackground(Color.RED);
                btnSPurga.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnSPurgaMouseClicked

    private void btnSArcadiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSArcadiaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSArcadiaKeyPressed

    private void btnSArcadiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSArcadiaMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnSArcadia.getBackground().equals(Color.RED)||btnSArcadia.getBackground().equals(Color.GREEN)){
                btnSArcadia.setBackground(Color.GRAY);
                btnSArcadia.setEnabled(false);
            }
            else{
                btnSArcadia.setBackground(Color.RED);
                btnSArcadia.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnSArcadiaMouseClicked

    private void btnSMoraiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSMoraiMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnSMorai.getBackground().equals(Color.RED)||btnSMorai.getBackground().equals(Color.GREEN)){
                btnSMorai.setBackground(Color.GRAY);
                btnSMorai.setEnabled(false);
            }
            else{
                btnSMorai.setBackground(Color.RED);
                btnSMorai.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnSMoraiMouseClicked

    private void btnSParaisoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSParaisoMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnSParaiso.getBackground().equals(Color.RED)||btnSParaiso.getBackground().equals(Color.GREEN)){
                btnSParaiso.setBackground(Color.GRAY);
                btnSParaiso.setEnabled(false);
            }
            else{
                btnSParaiso.setBackground(Color.RED);
                btnSParaiso.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnSParaisoMouseClicked

    private void btnSAuroraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSAuroraMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnSAurora.getBackground().equals(Color.RED)||btnSAurora.getBackground().equals(Color.GREEN)){
                btnSAurora.setBackground(Color.GRAY);
                btnSAurora.setEnabled(false);
            }
            else{
                btnSAurora.setBackground(Color.RED);
                btnSAurora.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnSAuroraMouseClicked

    private void btnSNuemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSNuemaMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnSNuema.getBackground().equals(Color.RED)||btnSNuema.getBackground().equals(Color.GREEN)){
                btnSNuema.setBackground(Color.GRAY);
                btnSNuema.setEnabled(false);
            }
            else{
                btnSNuema.setBackground(Color.RED);
                btnSNuema.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnSNuemaMouseClicked

    private void btnSTorreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSTorreMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnSTorre.getBackground().equals(Color.RED)||btnSTorre.getBackground().equals(Color.GREEN)){
                btnSTorre.setBackground(Color.GRAY);
                btnSTorre.setEnabled(false);
            }
            else{
                btnSTorre.setBackground(Color.RED);
                btnSTorre.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnSTorreMouseClicked

    private void btnSArenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSArenaMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnSArena.getBackground().equals(Color.RED)||btnSArena.getBackground().equals(Color.GREEN)){
                btnSArena.setBackground(Color.GRAY);
                btnSArena.setEnabled(false);
            }
            else{
                btnSArena.setBackground(Color.RED);
                btnSArena.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnSArenaMouseClicked

    private void btnSAoRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSAoRunMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnSAoRun.getBackground().equals(Color.RED)||btnSAoRun.getBackground().equals(Color.GREEN)){
                btnSAoRun.setBackground(Color.GRAY);
                btnSAoRun.setEnabled(false);
            }
            else{
                btnSAoRun.setBackground(Color.RED);
                btnSAoRun.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnSAoRunMouseClicked

    private void btnSExtraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSExtraMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnSExtra.getBackground().equals(Color.RED)||btnSExtra.getBackground().equals(Color.GREEN)){
                btnSExtra.setBackground(Color.GRAY);
                btnSExtra.setEnabled(false);
            }
            else{
                btnSExtra.setBackground(Color.RED);
                btnSExtra.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnSExtraMouseClicked

    private void btnELabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnELabMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnELab.getBackground().equals(Color.RED)||btnELab.getBackground().equals(Color.GREEN)){
                btnELab.setBackground(Color.GRAY);
                btnELab.setEnabled(false);
            }
            else{
                btnELab.setBackground(Color.RED);
                btnELab.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnELabMouseClicked

    private void btnEParaisoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEParaisoMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnEParaiso.getBackground().equals(Color.RED)||btnEParaiso.getBackground().equals(Color.GREEN)){
                btnEParaiso.setBackground(Color.GRAY);
                btnEParaiso.setEnabled(false);
            }
            else{
                btnEParaiso.setBackground(Color.RED);
                btnEParaiso.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnEParaisoMouseClicked

    private void btnEAuroraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEAuroraMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnEAurora.getBackground().equals(Color.RED)||btnEAurora.getBackground().equals(Color.GREEN)){
                btnEAurora.setBackground(Color.GRAY);
                btnEAurora.setEnabled(false);
            }
            else{
                btnEAurora.setBackground(Color.RED);
                btnEAurora.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnEAuroraMouseClicked

    private void btnEUIAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEUIAMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnEUIA.getBackground().equals(Color.RED)||btnEUIA.getBackground().equals(Color.GREEN)){
                btnEUIA.setBackground(Color.GRAY);
                btnEUIA.setEnabled(false);
            }
            else{
                btnEUIA.setBackground(Color.RED);
                btnEUIA.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnEUIAMouseClicked

    private void btnEAsaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEAsaMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnEAsa.getBackground().equals(Color.RED)||btnEAsa.getBackground().equals(Color.GREEN)){
                btnEAsa.setBackground(Color.GRAY);
                btnEAsa.setEnabled(false);
            }
            else{
                btnEAsa.setBackground(Color.RED);
                btnEAsa.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnEAsaMouseClicked

    private void btnENirvanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnENirvanaMouseClicked
        if(btnDelete.getBackground().equals(Color.GREEN)){
            if(btnENirvana.getBackground().equals(Color.RED)||btnENirvana.getBackground().equals(Color.GREEN)){
                btnENirvana.setBackground(Color.GRAY);
                btnENirvana.setEnabled(false);
            }
            else{
                btnENirvana.setBackground(Color.RED);
                btnENirvana.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnENirvanaMouseClicked

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
            java.util.logging.Logger.getLogger(face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new face().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCasa;
    private javax.swing.JButton btnDAoRun;
    private javax.swing.JButton btnDAurora;
    private javax.swing.JButton btnDBH;
    private javax.swing.JButton btnDBase;
    private javax.swing.JButton btnDCasa;
    private javax.swing.JButton btnDCat;
    private javax.swing.JButton btnDLab;
    private javax.swing.JButton btnDMorai;
    private javax.swing.JButton btnDParaiso;
    private javax.swing.JButton btnDPrimal;
    private javax.swing.JButton btnDRio;
    private javax.swing.JButton btnDUIA;
    private javax.swing.JButton btnDVM;
    private javax.swing.JButton btnDVale;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEAsa;
    private javax.swing.JButton btnEAurora;
    private javax.swing.JButton btnELab;
    private javax.swing.JButton btnENirvana;
    private javax.swing.JButton btnEParaiso;
    private javax.swing.JButton btnEUIA;
    private javax.swing.JButton btnSAoRun;
    private javax.swing.JButton btnSArcadia;
    private javax.swing.JButton btnSArena;
    private javax.swing.JButton btnSAurora;
    private javax.swing.JButton btnSExtra;
    private javax.swing.JButton btnSMorai;
    private javax.swing.JButton btnSNuema;
    private javax.swing.JButton btnSParaiso;
    private javax.swing.JButton btnSPurga;
    private javax.swing.JButton btnSTorre;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVenus;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
