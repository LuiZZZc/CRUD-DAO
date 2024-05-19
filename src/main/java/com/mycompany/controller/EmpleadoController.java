package com.mycompany.controller;

import com.mycompany.data.EmpleadoDao;
import com.mycompany.domain.Empleado;
import java.sql.SQLException;
import java.util.List;

public class EmpleadoController {

    private EmpleadoDao empleadoDao;

    public EmpleadoController() {
        empleadoDao = new EmpleadoDao();
    }

    public List<Empleado> getEmpleados() throws SQLException {
        return empleadoDao.getEmpleados();
    }

    public void create(Empleado empleado) throws SQLException {
        empleadoDao.create(empleado);
    }

    public Empleado getEmpleado(int id) throws SQLException {
        return empleadoDao.getEmpleado(id);
    }

    public void updateEmpleado(int id, Empleado empleado) throws SQLException {
        empleadoDao.updateEmpleado(id, empleado);
    }

    public void deleteEmpleado(int id) throws SQLException {
        empleadoDao.deleteEmpleado(id);
    }

}
