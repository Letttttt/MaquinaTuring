package maquinaturing;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class programa extends javax.swing.JFrame {
    public programa() {
        initComponents();
        ((JPanel)getContentPane()).setOpaque(false);
        JLabel fondo= new JLabel();
        
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
       
    }
    /*Declaracion de variables globales*/
    int[] vecbin = new int[9];
    String[] vecbint = new String[9];
    int gen = 0;
    int estado = 1;
    int respuesta = 0;
    boolean logico = true;
      int aux = 0;
      int aux1 = 0;
    String[][][] valores = new String[4][3][3];
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        binario1 = new javax.swing.JTextField();
        binario2 = new javax.swing.JTextField();
        binario3 = new javax.swing.JTextField();
        binario4 = new javax.swing.JTextField();
        binario5 = new javax.swing.JTextField();
        binario6 = new javax.swing.JTextField();
        binario7 = new javax.swing.JTextField();
        binario8 = new javax.swing.JTextField();
        rul1 = new javax.swing.JTextField();
        rul2 = new javax.swing.JTextField();
        rul3 = new javax.swing.JTextField();
        rul4 = new javax.swing.JTextField();
        rul5 = new javax.swing.JTextField();
        rul6 = new javax.swing.JTextField();
        rul7 = new javax.swing.JTextField();
        rul8 = new javax.swing.JTextField();
        rul9 = new javax.swing.JTextField();
        rul10 = new javax.swing.JTextField();
        rul11 = new javax.swing.JTextField();
        rul12 = new javax.swing.JTextField();
        rul13 = new javax.swing.JTextField();
        rul14 = new javax.swing.JTextField();
        rul15 = new javax.swing.JTextField();
        rul16 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rul17 = new javax.swing.JTextField();
        rul18 = new javax.swing.JTextField();
        rul19 = new javax.swing.JTextField();
        rul20 = new javax.swing.JTextField();
        rul21 = new javax.swing.JTextField();
        rul22 = new javax.swing.JTextField();
        rul23 = new javax.swing.JTextField();
        rul24 = new javax.swing.JTextField();
        rul25 = new javax.swing.JTextField();
        rul26 = new javax.swing.JTextField();
        rul27 = new javax.swing.JTextField();
        rul28 = new javax.swing.JTextField();
        rul29 = new javax.swing.JTextField();
        rul30 = new javax.swing.JTextField();
        rul31 = new javax.swing.JTextField();
        rul32 = new javax.swing.JTextField();
        rul33 = new javax.swing.JTextField();
        rul34 = new javax.swing.JTextField();
        rul35 = new javax.swing.JTextField();
        rul36 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        binario1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        binario1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        binario2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        binario2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        binario3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        binario3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        binario4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        binario4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        binario5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        binario5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        binario6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        binario6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        binario7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        binario7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        binario8.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        binario8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul1.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul2.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul3.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul4.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul5.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul6.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul7.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul8.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul9.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul10.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul11.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul12.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul13.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul14.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul15.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul15.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul16.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARRAY_1");

        rul17.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul17.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul18.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul19.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul20.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul20.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul21.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul22.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul23.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul23.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul24.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul24.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul25.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul25.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul26.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul26.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul27.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul27.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul28.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul28.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul29.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul29.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul30.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul30.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul31.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul31.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul32.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul32.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul33.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul33.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul34.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul34.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul35.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul35.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rul36.setFont(new java.awt.Font("Miriam", 1, 18)); // NOI18N
        rul36.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ARRAY_2");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ARRAY_3");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Khmer UI", 1, 18)); // NOI18N
        jButton1.setText("PREDETERMINADO EN ESTADO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Khmer UI", 1, 18)); // NOI18N
        jButton2.setText("PROCESAR CABEZAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        resultado.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Número obtenido");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Numero Binario");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Máquina de Turing");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Khmer UI", 1, 18)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ARRAY_4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(rul4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(rul5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(123, 123, 123)
                                                        .addComponent(rul14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(rul15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(rul22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(72, 72, 72)
                                                                .addComponent(rul6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(rul13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(rul1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rul2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rul3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(51, 51, 51)
                                                                .addComponent(rul10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(rul16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rul11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rul12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(51, 51, 51)
                                                                .addComponent(rul19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(42, 42, 42)
                                                                .addComponent(rul18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(rul25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(rul26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rul27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(rul34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(rul23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rul24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(rul31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(rul20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rul21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(43, 43, 43)
                                                                .addComponent(rul28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(rul32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rul33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(rul29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rul30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(rul35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rul36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(109, 109, 109)
                                                        .addComponent(jLabel7))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rul7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rul8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rul9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(87, 87, 87)
                                                .addComponent(rul17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(6, 6, 6))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(93, 93, 93)
                                        .addComponent(jLabel2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(binario1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(binario2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(binario3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(binario4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(binario5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(binario6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(binario7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(binario8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 272, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rul1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rul4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rul7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rul35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(binario1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binario2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binario3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binario4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binario5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binario6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binario7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binario8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jButton1)
                .addGap(12, 12, 12)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      aux = 0;      
      aux1 = 0;
      int ale,ale2;
      int ri,rj,rk;
      int ri1,rj1,rk1;
      int ri2,rj2,rk2;
      int ri3,rj3,rk3;
      int ri4,rj4,rk4;
      int p16=9;
      for(int c = 0;c<=7;c++ )
      {
          ale = (int) (Math.random()*2);
          if (ale == 0)
          {
              if(aux <= 3)
              {
                  vecbin[c] = 0;
                  vecbint[c] = "0";
                  aux++;
              }
              else
              {
                  vecbin[c] = 1;
                  vecbint[c] = "1";
              }
          }
          if (ale == 1)
          {
              if(aux1 <= 3)
              {
                  vecbin[c] = 1;
                  vecbint[c] = "1";
                  aux1++;
              }
              else
              {
                  vecbin[c] = 0;
                  vecbint[c] = "0";
              }
          }
      }
      //Llenar vector
      for(int n = 0;n<=7;n++)
      {
          asignacion(n+1,vecbint[n]);
      }
      //Llenar matriz "valores"
      for(int i=0;i<4;i++)
        for(int j=0;j<3;j++)
            for(int k=0;k<3;k++)
            {
                ale2 = ((int)Math.floor(Math.random()*(5)));
                switch (ale2)
                {
                    case 0:
                    {
                        valores[i][j][k]="0";
                        break;
                    }
                    case 1:
                    {
                        valores[i][j][k]="1";
                        break;
                    }
                    case 2:
                    {
                        valores[i][j][k]="R";
                        break;
                    }
                    case 3:
                    {
                        valores[i][j][k]="L";
                        break;
                    }
                    case 4:
                    {
                        valores[i][j][k]="N";
                        break;
                    }
                }
                  
            }
      //El siguiente grupo de instrucciones llena solamente con los valores de estado y f
      ri=((int)Math.floor(Math.random()*(4)));
      rj=((int)Math.floor(Math.random()*(3)));
      rk=((int)Math.floor(Math.random()*(3)));
      valores[ri][rj][rk]="A";
      ri1=((int)Math.floor(Math.random()*(4)));
      rj1=((int)Math.floor(Math.random()*(3)));
      rk1=((int)Math.floor(Math.random()*(3)));
      valores[ri1][rj1][rk1]="B";
      ri2=((int)Math.floor(Math.random()*(4)));
      rj2=((int)Math.floor(Math.random()*(3)));
      rk2=((int)Math.floor(Math.random()*(3)));
      valores[ri2][rj2][rk2]="C";
      ri3=((int)Math.floor(Math.random()*(4)));
      rj3=((int)Math.floor(Math.random()*(3)));
      rk3=((int)Math.floor(Math.random()*(3)));
      valores[ri3][rj3][rk3]="D";
      ri4=((int)Math.floor(Math.random()*(4)));
      rj4=((int)Math.floor(Math.random()*(3)));
      rk4=((int)Math.floor(Math.random()*(3)));
      valores[ri4][rj4][rk4]="F";
      for(int i=0;i<4;i++)
        for(int j=0;j<3;j++)
            for(int k=0;k<3;k++)
            {
                asignacion(p16,valores[i][j][k]);//Llena los textos y usa p16=16
                p16++;//ya que en el proceso pointer inicia en case 16 y aumenta
            }//oruno a uno para recorrer todo el pointerestado
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        logico = true;
        aux = 0;
        aux1 = 0;
        int e1 = 9, ef1 = 0, ec1 = 0;
        int e2 = 18, ef2 = 0, ec2 = 0;
        int e3 = 27, ef3 = 0 , ec3 = 0;
        int e4 = 36, ef4 = 0 , ec4 = 0;
        while(logico)
        {
            switch(estado)
            {
                case 1:
                {
                    if(e1>17)
                    {
                        estado = 2;
                        break;
                    }
                    pointerbinario(gen);
                    pointerestado(e1);
                    examinar(1,valores[0][ef1][ec1]);
                    e1++;
                    ec1++;
                    if(ec1 == 3)
                    {
                        ef1++;
                        ec1 = 0;
                    }
                    break;
                }
                case 2:
                {
                    if(e2>26)
                    {
                        estado = 3;
                        break;
                    }
                    pointerbinario(gen);
                    pointerestado(e2);
                    examinar(1,valores[1][ef2][ec2]);
                    e2++;
                    ec2++;
                    if(ec2 == 3)
                    {
                        ef2++;
                        ec2 = 0;
                    }
                    break;
                }
                case 3:
                {
                    if(e3>35)
                    {
                        estado = 4;
                        break;
                    }
                    pointerbinario(gen);
                    pointerestado(e3);
                    examinar(1,valores[2][ef3][ec3]);
                    e3++;
                    ec3++;
                    if(ec3 == 3)
                    {
                        ef3++;
                        ec3 = 0;
                    }
                    break;
                }
                case 4:
                {
                    if(e4>44)
                    {
                        estado = 1;
                        break;
                    }
                    pointerbinario(gen);
                    pointerestado(e4);
                    examinar(1,valores[3][ef4][ec4]);
                    e4++;
                    ec4++;
                    if(ec4 == 3)
                    {
                        ef4++;
                        ec4 = 0;
                    }
                    break;
                }
            }
            
        }
    respuesta=(vecbin[0]*128)+(vecbin[1]*64)+(vecbin[2]*32)+(vecbin[3]*16)+(vecbin[4]*8)+(vecbin[5]*4)+(vecbin[6]*2)+(vecbin[7]*1);
    resultado.setText(respuesta+"");  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
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
            java.util.logging.Logger.getLogger(programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new programa().setVisible(true);
            }
        });
    }
    int asignacion(int a, String b)
    {
        switch(a)
        {
            case 1:
            {
                binario1.setText(b+"");
                break;
            }
            case 2:
            {
                binario2.setText(b+"");
                break;
            }
            case 3:
            {
                binario3.setText(b+"");
                break;
            }
            case 4:
            {
                binario4.setText(b+"");
                break;
            }
            case 5:
            {
                binario5.setText(b+"");
                break;
            }
            case 6:
            {
                binario6.setText(b+"");
                break;
            }
            case 7:
            {
                binario7.setText(b+"");
                break;
            }
            case 8:
            {
                binario8.setText(b+"");
                break;
            }
            case 9:
            {
                rul1.setText(b+"");
                break;
            }
            case 10:
            {
                rul2.setText(b+"");
                break;
            }
            case 11:
            {
                rul3.setText(b+"");
                break;
            }
            case 12:
            {
                rul4.setText(b+"");
                break;
            }
            case 13:
            {
                rul5.setText(b+"");
                break;
            }
            case 14:
            {
                rul6.setText(b+"");
                break;
            }
            case 15:
            {
                rul7.setText(b+"");
                break;
            }
            case 16:
            {
                rul8.setText(b+"");
                break;
            }
            case 17:
            {
                rul9.setText(b+"");
                break;
            }
            case 18:
            {
                rul10.setText(b+"");
                break;
            }
            case 19:
            {
                rul11.setText(b+"");
                break;
            }
            case 20:
            {
                rul12.setText(b+"");
                break;
            }
            case 21:
            {
                rul13.setText(b+"");
                break;
            }
            case 22:
            {
                rul14.setText(b+"");
                break;
            }
            case 23:
            {
                rul15.setText(b+"");
                break;
            }
            case 24:
            {
                rul16.setText(b+"");
                break;
            }
            case 25:
            {
                rul17.setText(b+"");
                break;
            }
            case 26:
            {
                rul18.setText(b+"");
                break;
            }
            case 27:
            {
                rul19.setText(b+"");
                break;
            }
            case 28:
            {
                rul20.setText(b+"");
                break;
            }
            case 29:
            {
                rul21.setText(b+"");
                break;
            }
            case 30:
            {
                rul22.setText(b+"");
                break;
            }
            case 31:
            {
                rul23.setText(b+"");
                break;
            }
            case 32:
            {
                rul24.setText(b+"");
                break;
            }
            case 33:
            {
                rul25.setText(b+"");
                break;
            }
            case 34:
            {
                rul26.setText(b+"");
                break;
            }
            case 35:
            {
                rul27.setText(b+"");
                break;
            }
            case 36:
            {
                rul28.setText(b+"");
                break;
            }
            case 37:
            {
                rul29.setText(b+"");
                break;
            }
            case 38:
            {
                rul30.setText(b+"");
                break;
            }
            case 39:
            {
                rul31.setText(b+"");
                break;
            }
            case 40:
            {
                rul32.setText(b+"");
                break;
            }
            case 41:
            {
                rul33.setText(b+"");
                break;
            }
            case 42:
            {
                rul34.setText(b+"");
                break;
            }
            case 43:
            {
                rul35.setText(b+"");
                break;
            }
            case 44:
            {
                rul36.setText(b+"");
                break;
            }        
        }
       return a;
    }
    int pointerbinario(int p)
    {
        binario1.setBackground(Color.white);
        binario2.setBackground(Color.white);
        binario3.setBackground(Color.white);
        binario4.setBackground(Color.white);
        binario5.setBackground(Color.white);
        binario6.setBackground(Color.white);
        binario7.setBackground(Color.white);
        binario8.setBackground(Color.white);
        switch(p)
        {
            case 0:
            {
                binario1.setBackground(Color.red);
                break;
            }
            case 1:
            {
                binario2.setBackground(Color.blue);
                break;
            }
            case 2:
            {
                binario3.setBackground(Color.red);
                break;
            }
            case 3:
            {
                binario4.setBackground(Color.blue);
                break;
            }
            case 4:
            {
                binario5.setBackground(Color.red);
                break;
            }
            case 5:
            {
                binario6.setBackground(Color.red);
                break;
            }
            case 6:
            {
                binario7.setBackground(Color.red);
                break;
            }
             case 7:
            {
                binario8.setBackground(Color.red);
                break;
            }
        }
        return p;
    }
    int pointerestado(int p)
    {
        rul1.setBackground(Color.white);
        rul2.setBackground(Color.white);
        rul3.setBackground(Color.white);
        rul4.setBackground(Color.white);
        rul5.setBackground(Color.white);
        rul6.setBackground(Color.white);
        rul7.setBackground(Color.white);
        rul8.setBackground(Color.white);
        rul9.setBackground(Color.white);
        rul10.setBackground(Color.white);
        rul11.setBackground(Color.white);
        rul12.setBackground(Color.white);
        rul13.setBackground(Color.white);
        rul14.setBackground(Color.white);
        rul15.setBackground(Color.white);
        rul16.setBackground(Color.white);
        rul17.setBackground(Color.white);
        rul18.setBackground(Color.white);
        rul19.setBackground(Color.white);
        rul20.setBackground(Color.white);
        rul21.setBackground(Color.white);
        rul22.setBackground(Color.white);
        rul23.setBackground(Color.white);
        rul24.setBackground(Color.white);
        rul25.setBackground(Color.white);
        rul26.setBackground(Color.white);
        rul27.setBackground(Color.white);
        rul28.setBackground(Color.white);
        rul29.setBackground(Color.white);
        rul30.setBackground(Color.white);
        rul31.setBackground(Color.white);
        rul32.setBackground(Color.white);
        rul33.setBackground(Color.white);
        rul34.setBackground(Color.white);
        rul35.setBackground(Color.white);
        rul36.setBackground(Color.white);
        switch(p)
        {
            case 9:
            {
                rul1.setBackground(Color.yellow);
                break;
            }
            case 10:
            {
                rul2.setBackground(Color.yellow);
                break;
            }
            case 11:
            {
                rul3.setBackground(Color.yellow);
                break;
            }
            case 12:
            {
                rul4.setBackground(Color.yellow);
                break;
            }
            case 13:
            {
                rul5.setBackground(Color.yellow);
                break;
            }
            case 14:
            {
                rul6.setBackground(Color.yellow);
                break;
            }
            case 15:
            {
                rul7.setBackground(Color.yellow);
                break;
            }
            case 16:
            {
                rul8.setBackground(Color.yellow);
                break;
            }
            case 17:
            {
                rul9.setBackground(Color.yellow);
                break;
            }
            case 18:
            {
                rul10.setBackground(Color.yellow);
                break;
            }
            case 19:
            {
                rul11.setBackground(Color.yellow);
                break;
            }
            case 20:
            {
                rul12.setBackground(Color.yellow);
                break;
            }
            case 21:
            {
                rul13.setBackground(Color.yellow);
                break;
            }
            case 22:
            {
                rul14.setBackground(Color.yellow);
                break;
            }
            case 23:
            {
                rul15.setBackground(Color.yellow);
                break;
            }
            case 24:
            {
                rul16.setBackground(Color.yellow);
                break;
            }
            case 25:
            {
                rul17.setBackground(Color.yellow);
                break;
            }
            case 26:
            {
                rul18.setBackground(Color.yellow);
                break;
            }
            case 27:
            {
                rul19.setBackground(Color.yellow);
                break;
            }
            case 28:
            {
                rul20.setBackground(Color.yellow);
                break;
            }
            
            case 29:
            {
                rul21.setBackground(Color.yellow);
                break;
            }
            case 30:
            {
                rul22.setBackground(Color.yellow);
                break;
            }
            case 31:
            {
                rul23.setBackground(Color.yellow);
                break;
            }
            case 32:
            {
                rul24.setBackground(Color.yellow);
                break;
            }
            case 33:
            {
                rul25.setBackground(Color.yellow);
                break;
            }
            case 34:
            {
                rul26.setBackground(Color.yellow);
                break;
            }
            case 35:
            {
                rul27.setBackground(Color.yellow);
                break;
            }
            case 36:
            {
                rul28.setBackground(Color.yellow);
                break;
            }
            case 37:
            {
                rul29.setBackground(Color.yellow);
                break;
            }
            case 38:
            {
                rul30.setBackground(Color.yellow);
                break;
            }
            case 39:
            {
                rul31.setBackground(Color.yellow);
                break;
            }
            case 40:
            {
                rul32.setBackground(Color.yellow);
                break;
            }
            case 41:
            {
                rul33.setBackground(Color.yellow);
                break;
            }
            case 42:
            {
                rul34.setBackground(Color.yellow);
                break;
            }
            case 43:
            {
                rul35.setBackground(Color.yellow);
                break;
            }
            case 44:
            {
                rul36.setBackground(Color.yellow);
                break;
            }
        }
        return(p);
    }
    int examinar(int e, String es)
    {
        switch(es)
        {
            case "0":
            {
                JOptionPane.showMessageDialog(null,"Cambiará");
                if(vecbint[gen].equals("0"))
                {
                    vecbint[gen] = "1";
                    vecbin[gen] = 1;                    
                }
                else
                {
                    vecbint[gen] = "0";
                    vecbin[gen] = 0; 
                }
                break;
            }
            case "1":
            {
                JOptionPane.showMessageDialog(null,"Se Mantiene");
                break;
            }
            case "R":
            {
                JOptionPane.showMessageDialog(null,"Se Mueve Hacia La Derecha");
                if(gen==7)//Este decisor evitara que sobrepase la capacidad del Vector
                    gen = 0;
                else
                    gen = gen + 1;
                break;
            }
            case "L":
            {
                JOptionPane.showMessageDialog(null,"Se Mueve Hacia La Izquierda");
                if(gen==0)//Este decisor evitara que sobrepase la capacidad del Vector
                    gen = 7;
                else
                    gen = gen -1;
                break;
            }
            case "N":
            {
                JOptionPane.showMessageDialog(null,"    Se mantiene sin movimiento");
                break;
            }
            case "A":
            {
                JOptionPane.showMessageDialog(null,"Cambia A Array 1");
                estado=1;
                break;
            }
            case"B":
            {
                JOptionPane.showMessageDialog(null,"Cambia A Array 2");
                estado=2;
                break;
            }
            case"C":
            {
                JOptionPane.showMessageDialog(null,"Cambia A Array3");
                estado=3;
                break;
            }
            case"D":
            {
                JOptionPane.showMessageDialog(null,"Cambia a Array4");
                estado=4;
                break;
            }
            case"F":
            {
                JOptionPane.showMessageDialog(null,"PROYECTO lenguajes aplicados I.E.");
                JOptionPane.showMessageDialog(null, "aqui pone tu nombre Javier");
                JOptionPane.showMessageDialog(null, "y aqui no se lo que queras javier xD");
   
                logico = false;
                break;
               
            }//Esto hará que salgan mensajes emergentes
           
        }
        for(int n=0;n<=7;n++)
        {
            asignacion(n+1,vecbint[n]);
        }
        return e;
    }
    
    public void llenar(){
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField binario1;
    private javax.swing.JTextField binario2;
    private javax.swing.JTextField binario3;
    private javax.swing.JTextField binario4;
    private javax.swing.JTextField binario5;
    private javax.swing.JTextField binario6;
    private javax.swing.JTextField binario7;
    private javax.swing.JTextField binario8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField resultado;
    private javax.swing.JTextField rul1;
    private javax.swing.JTextField rul10;
    private javax.swing.JTextField rul11;
    private javax.swing.JTextField rul12;
    private javax.swing.JTextField rul13;
    private javax.swing.JTextField rul14;
    private javax.swing.JTextField rul15;
    private javax.swing.JTextField rul16;
    private javax.swing.JTextField rul17;
    private javax.swing.JTextField rul18;
    private javax.swing.JTextField rul19;
    private javax.swing.JTextField rul2;
    private javax.swing.JTextField rul20;
    private javax.swing.JTextField rul21;
    private javax.swing.JTextField rul22;
    private javax.swing.JTextField rul23;
    private javax.swing.JTextField rul24;
    private javax.swing.JTextField rul25;
    private javax.swing.JTextField rul26;
    private javax.swing.JTextField rul27;
    private javax.swing.JTextField rul28;
    private javax.swing.JTextField rul29;
    private javax.swing.JTextField rul3;
    private javax.swing.JTextField rul30;
    private javax.swing.JTextField rul31;
    private javax.swing.JTextField rul32;
    private javax.swing.JTextField rul33;
    private javax.swing.JTextField rul34;
    private javax.swing.JTextField rul35;
    private javax.swing.JTextField rul36;
    private javax.swing.JTextField rul4;
    private javax.swing.JTextField rul5;
    private javax.swing.JTextField rul6;
    private javax.swing.JTextField rul7;
    private javax.swing.JTextField rul8;
    private javax.swing.JTextField rul9;
    // End of variables declaration//GEN-END:variables
}
