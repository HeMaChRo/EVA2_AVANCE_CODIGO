/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_avance_codigo;

/**
 *
 * @author Hector Chavira
 */
public class Carro extends Vehiculo implements Datos{
    private String Actividad;
    private String codigoId;

    public Carro() {
        super();
        this.Actividad = "";
        this.codigoId = "";
    }

    public Carro(String Actividad, String codigoId, String Marca, String Modelo, int Año, int Kilometraje, String Uso) {
        super(Marca, Modelo, Año, Kilometraje, Uso);
        this.Actividad = Actividad;
        this.codigoId = codigoId;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }

    public String getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(String codigoId) {
        this.codigoId = codigoId;
    }
    
    
    
    
    
    
    @Override
    public void imprimirDatos() {
        System.out.println("\nDatos Camion: ");
        System.out.println("Marca: " + getMarca()+" "+ getModelo());
        System.out.println("Uso " + getUso());
        System.out.println("Kilometraje " + getKilometraje());
        System.out.println("Actividad: "+ Actividad);
        System.out.println("Codigo Identificador: "+codigoId);
    }
    
}
