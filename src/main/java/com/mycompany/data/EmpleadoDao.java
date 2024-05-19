package com.mycompany.data;

import com.mycompany.domain.Empleado;
import com.mycompany.util.ConnectionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDao {

    public static final String GET_EMPLEADOS = "SELECT * FROM empleado;";

    public static final String CREATE_EMPLEADO = "INSERT into  empleado(tipoDoc, noDoc, nombres, apellidos, estadoCiv, sexo, direccion, telefono, fechaNac, universidad, nivelEstudio, tituloEstudio)"
            + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

    public static final String GET_EMPLEADO_BY_ID = "SELECT * from empleado where id = ?;";

    public static final String UPDATE_EMPLEADO = "UPDATE empleado set tipoDoc = ?, noDoc = ?, nombres = ?, apellidos = ?, estadoCiv = ?, sexo = ?, direccion = ?, telefono = ?, fechaNac = ?, universidad = ?, nivelEstudio = ?, tituloEstudio = ? where EmpleadoID = ?;";

    public static final String DELETE_EMPLEADO = "DELETE from empleado where EmpleadoID = ?;";

    public List<Empleado> getEmpleados() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Empleado> empleados = new ArrayList<>();

        try {
            connection = ConnectionMySQL.getConnection();
            preparedStatement = connection.prepareStatement(GET_EMPLEADOS);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                Empleado empleado = new Empleado();
                empleado.setEmpleadoId(resultSet.getInt("empleadoId"));
                empleado.setTipoDoc(resultSet.getString("tipoDoc"));
                empleado.setNoDoc(resultSet.getString("noDoc"));
                empleado.setNombres(resultSet.getString("nombres"));
                empleado.setApellidos(resultSet.getString("apellidos"));
                empleado.setEstadoCiv(resultSet.getString("estadoCiv"));
                empleado.setSexo(resultSet.getString("sexo"));
                empleado.setDireccion(resultSet.getString("direccion"));
                empleado.setTelefono(resultSet.getString("telefono"));
                empleado.setFechaNac(resultSet.getString("fechaNac"));
                empleado.setUniversidad("univesidad");
                empleado.setNivelEstudio("nivelEstudio");
                empleado.setTituloEstudio("tituloEstudio");
                empleados.add(empleado);
            }

            return empleados;

        } finally {

            if (connection != null) {
                connection.close();

            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }

        }

    }

    public void create(Empleado empleado) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionMySQL.getConnection();
            preparedStatement = connection.prepareStatement(CREATE_EMPLEADO);
            preparedStatement.setString(1, empleado.getTipoDoc());
            preparedStatement.setString(2, empleado.getNoDoc());
            preparedStatement.setString(3, empleado.getNombres());
            preparedStatement.setString(4, empleado.getApellidos());
            preparedStatement.setString(5, empleado.getEstadoCiv());
            preparedStatement.setString(6, empleado.getSexo());
            preparedStatement.setString(7, empleado.getDireccion());
            preparedStatement.setString(8, empleado.getTelefono());
            preparedStatement.setString(9, empleado.getFechaNac());
            preparedStatement.setString(10, empleado.getUniversidad());
            preparedStatement.setString(11, empleado.getNivelEstudio());
            preparedStatement.setString(12, empleado.getTituloEstudio());
            preparedStatement.executeUpdate();

        } finally {

            if (connection != null) {
                connection.close();

            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    public Empleado getEmpleado(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Empleado empleado = null;

        try {
            connection = ConnectionMySQL.getConnection();
            preparedStatement = connection.prepareStatement(GET_EMPLEADO_BY_ID);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                Empleado emp = new Empleado();
                emp.setEmpleadoId(resultSet.getInt("empleadoId"));
                emp.setTipoDoc(resultSet.getString("tipoDoc"));
                emp.setNoDoc(resultSet.getString("noDoc"));
                emp.setNombres(resultSet.getString("nombres"));
                emp.setApellidos(resultSet.getString("apellidos"));
                emp.setEstadoCiv(resultSet.getString("estadoCiv"));
                emp.setSexo(resultSet.getString("sexo"));
                emp.setDireccion(resultSet.getString("direccion"));
                emp.setTelefono(resultSet.getString("telefono"));
                emp.setFechaNac(resultSet.getString("fechaNAc"));
                emp.setUniversidad("univesidad");
                emp.setNivelEstudio("nivelEstudio");
                emp.setTituloEstudio("tituloEstudio");
            }
            return empleado;

        } finally {

            if (resultSet != null) {
                resultSet.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }
        }
    }

    public void updateEmpleado(int id, Empleado empleado) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionMySQL.getConnection();
            preparedStatement = connection.prepareStatement(UPDATE_EMPLEADO);
            preparedStatement.setString(1, empleado.getTipoDoc());
            System.out.println(empleado.getNoDoc());
            preparedStatement.setString(2, empleado.getNoDoc());
            preparedStatement.setString(3, empleado.getNombres());
            preparedStatement.setString(4, empleado.getApellidos());
            preparedStatement.setString(5, empleado.getEstadoCiv());
            preparedStatement.setString(6, empleado.getSexo());
            preparedStatement.setString(7, empleado.getDireccion());
            preparedStatement.setString(8, empleado.getTelefono());
            preparedStatement.setString(9, empleado.getFechaNac());
            preparedStatement.setString(10, empleado.getUniversidad());
            preparedStatement.setString(11, empleado.getNivelEstudio());
            preparedStatement.setString(12, empleado.getTituloEstudio());
            preparedStatement.setInt(13, empleado.getEmpleadoId());
            preparedStatement.executeUpdate();
            connection.setAutoCommit(false);
            connection.commit();
            System.out.println("holaa");
        } finally {

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                preparedStatement.close();
            }
        }
    }

    public void deleteEmpleado(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionMySQL.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_EMPLEADO);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }
        }
    }
}
