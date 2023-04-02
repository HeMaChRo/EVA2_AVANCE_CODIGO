/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_avance_codigo;

/**
 *
 * @author Hector Chavira
 */
public class Empleado extends Persona{
    private String CodigoEmpleado;
    private int Antiguedad;

    public Empleado() {
        super();
        this.CodigoEmpleado = "";
        this.Antiguedad = 0;
    }

    public Empleado(String CodigoEmpleado, int Antiguedad, String Nombre, String Apellido, int edad) {
        super(Nombre, Apellido, edad);
        this.CodigoEmpleado = CodigoEmpleado;
        this.Antiguedad = Antiguedad;
    }

    public String getCodigoEmpleado() {
        return CodigoEmpleado;
    }

    public void setCodigoEmpleado(String CodigoEmpleado) {
        this.CodigoEmpleado = CodigoEmpleado;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    
}
