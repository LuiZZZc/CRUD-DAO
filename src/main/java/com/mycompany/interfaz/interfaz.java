package com.mycompany.interfaz;

import com.mycompany.controller.EmpleadoController;
import com.mycompany.data.EmpleadoDao;
import com.mycompany.domain.Empleado;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class interfaz extends javax.swing.JFrame {

    private final EmpleadoController empleadoController;
    private static final String[] COLUMNS = {"EmpleadoID", "TipoDoc", "NoDoc", "Nombres",
        "Apellidos", "EstadoCiv", "Sexo", "Dirección", "Telefono", "FechaNacimieto", "Universidad",
        "NivelEstudio", "TituloEstudio"};
    private Empleado selectedEmpleado;
        
    public interfaz() {
        initComponents();
        empleadoController = new EmpleadoController();
        listEmpleados();
        addListener();
    }

    public void listEmpleados() {
        tblEmpleados.removeAll();
        DefaultTableModel defalDefaultTableModel = new DefaultTableModel();
        for (String COLUMN : COLUMNS) {
            defalDefaultTableModel.addColumn(COLUMN);
        }

        tblEmpleados.setModel(defalDefaultTableModel);

        try {
            List<Empleado> empleados = empleadoController.getEmpleados();

            if (empleados.isEmpty())
                return;
            
            defalDefaultTableModel.setRowCount(empleados.size());
            int row = 0;
            for (Empleado empleado : empleados) {
                defalDefaultTableModel.setValueAt(empleado.getEmpleadoId(), row, 0);
                defalDefaultTableModel.setValueAt(empleado.getTipoDoc(), row, 1);
                defalDefaultTableModel.setValueAt(empleado.getNoDoc(), row, 2);
                defalDefaultTableModel.setValueAt(empleado.getNombres(), row, 3);
                defalDefaultTableModel.setValueAt(empleado.getApellidos(), row, 4);
                defalDefaultTableModel.setValueAt(empleado.getEstadoCiv(), row, 5);
                defalDefaultTableModel.setValueAt(empleado.getSexo(), row, 6);
                defalDefaultTableModel.setValueAt(empleado.getDireccion(), row, 7);
                defalDefaultTableModel.setValueAt(empleado.getTelefono(), row, 8);
                defalDefaultTableModel.setValueAt(empleado.getFechaNac(), row, 9);
                defalDefaultTableModel.setValueAt(empleado.getUniversidad(), row, 10);
                defalDefaultTableModel.setValueAt(empleado.getNivelEstudio(), row, 11);
                defalDefaultTableModel.setValueAt(empleado.getTituloEstudio(), row, 12);

                row++;

                cbxEmpleadoId.addItem(empleado);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private void addListener() {
        cbxEmpleadoId.addItemListener(event -> {
            selectedEmpleado = (Empleado) event.getItem();
            System.out.println(selectedEmpleado);
            if (selectedEmpleado.equals(null)) {
                cbxTipoDoc.setAction(null);
                txtNoDoc.setText("");
                txtNombres.setText("");
                txtApellidos.setText("");
                cbxEstadoCiv.setAction(null);
                cbxSexo.setAction(null);
                txtDireccion.setText("");
                txtTelefono.setText("");
                txtFechaNacimiento.cleanup();
                txtUniversidad.setText("");
                cbxNivelEstudio.setAction(null);
                txtTituloEstudio.setText("");
            } else {
                txtEditTipoDoc.setText(selectedEmpleado.getTipoDoc());
                txtEditNoDoc.setText(selectedEmpleado.getNoDoc());
                txtEditNombres.setText(selectedEmpleado.getNombres());
                txtEditApellidos.setText(selectedEmpleado.getApellidos());
                txtEditEstadoCiv.setText(selectedEmpleado.getEstadoCiv());
                txtEditSexo.setText(selectedEmpleado.getSexo());
                txtEditDireccion.setText(selectedEmpleado.getDireccion());
                txtEditTelefono.setText(selectedEmpleado.getTelefono());
                txtEditFechaNacimiento.setText(selectedEmpleado.getFechaNac());
                txtEditUniversidad.setText(selectedEmpleado.getUniversidad());
                txtEditNivelEstudio.setText(selectedEmpleado.getNivelEstudio());
                txtEditTituloEstudio.setText(selectedEmpleado.getTituloEstudio());

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textField7 = new java.awt.TextField();
        jLabel16 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtApellidos = new java.awt.TextField();
        cbxTipoDoc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNoDoc = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombres = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxEstadoCiv = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtDireccion = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new java.awt.TextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUniversidad = new java.awt.TextField();
        jLabel14 = new javax.swing.JLabel();
        cbxNivelEstudio = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtTituloEstudio = new java.awt.TextField();
        jGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        txtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        asdasd = new javax.swing.JPanel();
        jLabel162 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cbxEmpleadoId = new javax.swing.JComboBox<>();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        txtEditTipoDoc = new javax.swing.JTextField();
        txtEditNoDoc = new javax.swing.JTextField();
        txtEditNombres = new javax.swing.JTextField();
        txtEditApellidos = new javax.swing.JTextField();
        txtEditEstadoCiv = new javax.swing.JTextField();
        txtEditSexo = new javax.swing.JTextField();
        txtEditDireccion = new javax.swing.JTextField();
        txtEditTelefono = new javax.swing.JTextField();
        txtEditFechaNacimiento = new javax.swing.JTextField();
        txtEditUniversidad = new javax.swing.JTextField();
        txtEditTituloEstudio = new javax.swing.JTextField();
        txtEditNivelEstudio = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jLabel10.setText("Fehca de nacimiento");

        jLabel11.setText("Fehca de nacimiento");

        jLabel12.setText("Fehca de nacimiento");

        textField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField7ActionPerformed(evt);
            }
        });

        jLabel16.setText("jLabel16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        txtApellidos.setBackground(new java.awt.Color(102, 102, 102));
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        cbxTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula de ciudadania", "Pasaporte" }));
        cbxTipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoDocActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de documento");

        jLabel2.setText("Numero de documento");

        txtNoDoc.setBackground(new java.awt.Color(102, 102, 102));
        txtNoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoDocActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombres");

        txtNombres.setBackground(new java.awt.Color(102, 102, 102));
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellidos");

        jLabel5.setText("Estado civil");

        cbxEstadoCiv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Separado", "Divorciado" }));
        cbxEstadoCiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoCivActionPerformed(evt);
            }
        });

        jLabel6.setText("Sexo");

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cbxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexoActionPerformed(evt);
            }
        });

        jLabel7.setText("Dirección");

        txtDireccion.setBackground(new java.awt.Color(102, 102, 102));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel8.setText("Telefono");

        txtTelefono.setBackground(new java.awt.Color(102, 102, 102));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel9.setText("Fecha de nacimiento");

        jLabel13.setText("Universidad");

        txtUniversidad.setBackground(new java.awt.Color(102, 102, 102));
        txtUniversidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversidadActionPerformed(evt);
            }
        });

        jLabel14.setText("Nivel de estudio");

        cbxNivelEstudio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profesional", "Tecnológo", "Técnico" }));
        cbxNivelEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNivelEstudioActionPerformed(evt);
            }
        });

        jLabel15.setText("Título de estudio");

        txtTituloEstudio.setBackground(new java.awt.Color(102, 102, 102));
        txtTituloEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloEstudioActionPerformed(evt);
            }
        });

        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblEmpleados);

        txtFechaNacimiento.setDateFormatString("dd/MM/yyyy");
        txtFechaNacimiento.setMaxSelectableDate(new java.util.Date(253370786473000L));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxEstadoCiv, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxNivelEstudio, 0, 116, Short.MAX_VALUE)
                        .addComponent(txtTituloEstudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(205, 205, 205))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbxTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(cbxEstadoCiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13))
                                    .addComponent(txtUniversidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel8)
                                                .addGap(4, 4, 4))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cbxNivelEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTituloEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(16, 16, 16)))
                .addComponent(jGuardar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Guardar/Listar", jPanel2);

        jLabel162.setText("Tipo de Documento");

        jLabel17.setText("Seleccione la ID del Empleado");

        cbxEmpleadoId.setToolTipText("");
        cbxEmpleadoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEmpleadoIdActionPerformed(evt);
            }
        });

        jLabel163.setText("Sexo");

        jLabel164.setText("Numero de Documento");

        jLabel165.setText("Estado Civil");

        jLabel166.setText("Telefono");

        jLabel167.setText("Direccion");

        jLabel168.setText("Fecha de Nacimiento");

        jLabel169.setText("Nivel de Estudio");

        jLabel170.setText("Nombres");

        jLabel171.setText("Apellidos");

        jLabel172.setText("Universidad");

        jLabel173.setText("Titulo de Estudio");

        txtEditTipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditTipoDocActionPerformed(evt);
            }
        });

        txtEditNoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditNoDocActionPerformed(evt);
            }
        });

        txtEditNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditNombresActionPerformed(evt);
            }
        });

        txtEditApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditApellidosActionPerformed(evt);
            }
        });

        txtEditEstadoCiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditEstadoCivActionPerformed(evt);
            }
        });

        txtEditSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditSexoActionPerformed(evt);
            }
        });

        txtEditDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditDireccionActionPerformed(evt);
            }
        });

        txtEditTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditTelefonoActionPerformed(evt);
            }
        });

        txtEditFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditFechaNacimientoActionPerformed(evt);
            }
        });

        txtEditUniversidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditUniversidadActionPerformed(evt);
            }
        });

        txtEditTituloEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditTituloEstudioActionPerformed(evt);
            }
        });

        txtEditNivelEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditNivelEstudioActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout asdasdLayout = new javax.swing.GroupLayout(asdasd);
        asdasd.setLayout(asdasdLayout);
        asdasdLayout.setHorizontalGroup(
            asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asdasdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(asdasdLayout.createSequentialGroup()
                        .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel162)
                            .addComponent(jLabel171))
                        .addGap(235, 235, 235)
                        .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel163)
                            .addComponent(jLabel167)
                            .addComponent(jLabel166))
                        .addGap(82, 82, 82)
                        .addComponent(txtEditSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(asdasdLayout.createSequentialGroup()
                        .addComponent(jLabel164)
                        .addGap(346, 346, 346)
                        .addComponent(txtEditDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel170)
                    .addGroup(asdasdLayout.createSequentialGroup()
                        .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEditTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, asdasdLayout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEditNoDoc)
                                    .addComponent(txtEditNombres)
                                    .addComponent(txtEditApellidos)
                                    .addComponent(txtEditEstadoCiv, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, asdasdLayout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(txtEditTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(asdasdLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel168)
                                    .addComponent(jLabel172))
                                .addGap(21, 21, 21)
                                .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEditFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(txtEditUniversidad)))))
                    .addGroup(asdasdLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxEmpleadoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, asdasdLayout.createSequentialGroup()
                            .addComponent(jLabel169)
                            .addGap(18, 18, 18)
                            .addComponent(txtEditNivelEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18))
                        .addGroup(asdasdLayout.createSequentialGroup()
                            .addComponent(jLabel173)
                            .addGap(18, 18, 18)
                            .addComponent(txtEditTituloEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, asdasdLayout.createSequentialGroup()
                        .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))))
        );
        asdasdLayout.setVerticalGroup(
            asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, asdasdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cbxEmpleadoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel162)
                    .addComponent(txtEditTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel163)
                    .addComponent(txtEditSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel169)
                    .addComponent(txtEditNivelEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel167)
                    .addComponent(txtEditDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditNoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel164)
                    .addComponent(jLabel173)
                    .addComponent(txtEditTituloEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel170)
                    .addComponent(txtEditNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel166)
                    .addComponent(txtEditTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel171)
                    .addComponent(txtEditApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel168)
                    .addComponent(txtEditFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(asdasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel165)
                    .addComponent(txtEditEstadoCiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel172)
                    .addComponent(txtEditUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(asdasd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(asdasd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Editar/Eliminar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed

        if (txtNoDoc.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el numero de documento");
            txtNoDoc.requestFocus();
            return;
        }
        if (txtNombres.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite los nombres");
            txtNombres.requestFocus();
            return;
        }
        if (txtApellidos.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite los apellidos");
            txtApellidos.requestFocus();
            return;
        }
        if (txtDireccion.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la direccion");
            txtDireccion.requestFocus();
            return;
        }
        if (txtTelefono.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el telefono");
            txtTelefono.requestFocus();
            return;
        }
       
        if (txtUniversidad.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite la universidad");
            txtUniversidad.requestFocus();
            return;
        }
        if (txtTituloEstudio.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el titulo de estudio");
            txtTituloEstudio.requestFocus();
            return;
        }
        
        
            Empleado empleado = new Empleado();
        
        empleado.setTipoDoc(String.valueOf(cbxTipoDoc.getSelectedItem()));
        empleado.setNoDoc(txtNoDoc.getText().trim());
        empleado.setNombres(txtNombres.getText().trim());
        empleado.setApellidos(txtApellidos.getText().trim());
        empleado.setEstadoCiv(String.valueOf(cbxEstadoCiv.getSelectedItem()));
        empleado.setSexo(String.valueOf(cbxSexo.getSelectedItem()));
        empleado.setDireccion(txtDireccion.getText().trim());
        empleado.setTelefono(txtTelefono.getText().trim());
        empleado.setFechaNac(txtFechaNacimiento.getDate().toString());
        empleado.setUniversidad(txtUniversidad.getText().trim());
        empleado.setNivelEstudio(String.valueOf(cbxNivelEstudio.getSelectedItem()));
        empleado.setTituloEstudio(txtTituloEstudio.getText().trim());

        try{
            empleadoController.create(empleado);
            txtNoDoc.setText("");
            txtNombres.setText("");
            txtApellidos.setText("");
            txtDireccion.setText("");
            txtTelefono.setText("");
            txtUniversidad.setText("");
            txtTituloEstudio.setText("");
            listEmpleados();
            JOptionPane.showMessageDialog(null, "Los datos de empleado han sido almacenados con exito");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "El empleado no se ha podido registrar");
        }

    }//GEN-LAST:event_jGuardarActionPerformed

    private void cbxTipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoDocActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbxTipoDocActionPerformed

    private void txtNoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoDocActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void cbxEstadoCivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoCivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoCivActionPerformed

    private void cbxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtUniversidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadActionPerformed

    private void textField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField7ActionPerformed

    private void cbxNivelEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNivelEstudioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNivelEstudioActionPerformed

    private void txtTituloEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloEstudioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloEstudioActionPerformed

    private void txtEditTituloEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditTituloEstudioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditTituloEstudioActionPerformed

    private void txtEditUniversidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditUniversidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditUniversidadActionPerformed

    private void txtEditFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditFechaNacimientoActionPerformed

    private void txtEditTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditTelefonoActionPerformed

    private void txtEditDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditDireccionActionPerformed

    private void txtEditSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditSexoActionPerformed

    private void txtEditEstadoCivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditEstadoCivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditEstadoCivActionPerformed

    private void txtEditApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditApellidosActionPerformed

    private void txtEditNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditNombresActionPerformed

    private void txtEditNoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditNoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditNoDocActionPerformed

    private void txtEditTipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditTipoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditTipoDocActionPerformed

    private void cbxEmpleadoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEmpleadoIdActionPerformed

    }//GEN-LAST:event_cbxEmpleadoIdActionPerformed

    private void txtEditNivelEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditNivelEstudioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditNivelEstudioActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int option =JOptionPane.showConfirmDialog(null,"desea borrar al empleado?", "confirmar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        System.out.println(option);
        if(option == 0)
            try {
            empleadoController.deleteEmpleado(selectedEmpleado.getEmpleadoId());
            cbxEmpleadoId.removeItem(selectedEmpleado);
            JOptionPane.showMessageDialog(null, "El empleado ha sido eliminado con exito");
            listEmpleados();
        } catch (SQLException e) {

        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        selectedEmpleado.setTipoDoc(txtEditTipoDoc.getText().trim());
        selectedEmpleado.setNoDoc(txtEditNoDoc.getText().trim());
        selectedEmpleado.setNombres(txtEditNombres.getText().trim());
        selectedEmpleado.setApellidos(txtEditApellidos.getText().trim());
        selectedEmpleado.setEstadoCiv(txtEditEstadoCiv.getText().trim());
        selectedEmpleado.setSexo(txtEditSexo.getText().trim());
        selectedEmpleado.setDireccion(txtEditDireccion.getText().trim());
        selectedEmpleado.setTelefono(txtEditTelefono.getText().trim());
        selectedEmpleado.setFechaNac(txtEditFechaNacimiento.getText().trim());
        selectedEmpleado.setUniversidad(txtEditUniversidad.getText().trim());
        selectedEmpleado.setNivelEstudio(txtEditNivelEstudio.getText().trim());
        selectedEmpleado.setTituloEstudio(txtEditTituloEstudio.getText().trim());
        
        
 
        int option = JOptionPane.showConfirmDialog(null, "desea actualizar la información del empleado?", "confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (option == 0) {
            try {
                empleadoController.updateEmpleado(Integer.parseInt(selectedEmpleado.toString()), selectedEmpleado);

                txtEditTipoDoc.setText("");
                txtEditNoDoc.setText("");
                txtEditNombres.setText("");
                txtEditApellidos.setText("");
                txtEditEstadoCiv.setText("");
                txtEditSexo.setText("");
                txtEditDireccion.setText("");
                txtEditTelefono.setText("");
                txtEditFechaNacimiento.setText("");
                txtEditUniversidad.setText("");
                txtEditNivelEstudio.setText("");
                txtEditTituloEstudio.setText("");
                
                
                JOptionPane.showMessageDialog(null, "El empleado ha sido actualizado con exito");
                 
            } catch (SQLException ex) {
                Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel asdasd;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JComboBox<Empleado> cbxEmpleadoId;
    private javax.swing.JComboBox<String> cbxEstadoCiv;
    private javax.swing.JComboBox<String> cbxNivelEstudio;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JComboBox<String> cbxTipoDoc;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblEmpleados;
    private java.awt.TextField textField7;
    private java.awt.TextField txtApellidos;
    private java.awt.TextField txtDireccion;
    private javax.swing.JTextField txtEditApellidos;
    private javax.swing.JTextField txtEditDireccion;
    private javax.swing.JTextField txtEditEstadoCiv;
    private javax.swing.JTextField txtEditFechaNacimiento;
    private javax.swing.JTextField txtEditNivelEstudio;
    private javax.swing.JTextField txtEditNoDoc;
    private javax.swing.JTextField txtEditNombres;
    private javax.swing.JTextField txtEditSexo;
    private javax.swing.JTextField txtEditTelefono;
    private javax.swing.JTextField txtEditTipoDoc;
    private javax.swing.JTextField txtEditTituloEstudio;
    private javax.swing.JTextField txtEditUniversidad;
    private com.toedter.calendar.JDateChooser txtFechaNacimiento;
    private java.awt.TextField txtNoDoc;
    private java.awt.TextField txtNombres;
    private java.awt.TextField txtTelefono;
    private java.awt.TextField txtTituloEstudio;
    private java.awt.TextField txtUniversidad;
    // End of variables declaration//GEN-END:variables
}
