
package eva2_avance_codigo;

import java.util.Scanner;


public class EVA2_AVANCE_CODIGO {

   
    public static void main(String[] args) {
        Camionero camionero1 = new Camionero(1000, 250, "01123581321", 6, "Pedro", "Martinez", 50);
        camionero1.imprimirDatos();
        camionero1.calcularVacaciones();
        camionero1.calcularSalario();
        
        Ejecutivo ejecutivo1 = new Ejecutivo("Gerente", "B", "26574.2", 15, "Alejandro", "Estrada", 62);
        ejecutivo1.imprimirDatos();
        ejecutivo1.calcularVacaciones();
        
        
        System.out.print("\n¿Cuantos Empleados Tienes? ");
        Scanner leer = new Scanner(System.in);
        int cant = leer.nextInt();
        
        Empleado[] empleados = new Empleado[cant];
        
        for (int i = 0; i < empleados.length ; i++) {
            System.out.print("¿Que tipo de empleado es? 1.- Camionero  2.- Ejecutivo: ");
            int tipo = leer.nextInt();
            
            if(tipo == 1){
                
                Camionero camionero = new Camionero(); 
                leer.skip("\n");
                System.out.print("Introduce el Nombre: ");   
                camionero.setNombre(leer.nextLine()); 
                System.out.print("Introduce el Apellido: ");
                camionero.setApellido(leer.nextLine());
                System.out.print("Introduce el Codigo de empleado: ");
                camionero.setCodigoEmpleado(leer.nextLine());
                System.out.print("Introduce la Edad: ");
                camionero.setEdad(leer.nextInt());
                System.out.print("Introduce la Antiguedad: ");
                camionero.setAntiguedad(leer.nextInt());
                System.out.print("Introduce la Experiencia Previa: ");
                camionero.setExpPrevia(leer.nextInt());
                System.out.print("Introduce la Experiencia Adquirida: ");
                camionero.setExpAdquirida(leer.nextInt());
                
                empleados[i] = camionero;
                
            }else{
                
                Ejecutivo ejecutivo = new Ejecutivo();
                leer.skip("\n");
                System.out.print("Introduce el Nombre: ");
                ejecutivo.setNombre(leer.nextLine());
                System.out.print("Introduce el Apellido: ");
                ejecutivo.setApellido(leer.nextLine());
                System.out.print("Introduce el Codigo de empleado: ");
                ejecutivo.setCodigoEmpleado(leer.nextLine());
                System.out.print("Introduce la Edad: ");
                ejecutivo.setEdad(leer.nextInt());
                System.out.print("Introduce la Antiguedad: ");
                ejecutivo.setAntiguedad(leer.nextInt());
                leer.skip("\n");
                System.out.print("Introduce la Seccion: ");
                ejecutivo.setSeccion(leer.nextLine());
                System.out.print("Introduce el Puesto: ");
                ejecutivo.setPuesto(leer.nextLine());
                
                empleados[i] = ejecutivo;
            }
            
        }
            int ca = 0, ej = 0;
            
            for (int i = 0; i < empleados.length ; i++) {
                System.out.println("\nEmpleado "+(i+1)+": ");
            if(empleados[i] instanceof Camionero){
                
                System.out.println("Camionero: " + (ca+1));
                                 
                Camionero camione = (Camionero)empleados[i];
                camione.imprimirDatos();
                ca++;
                
            }else{
                System.out.println("Ejecutivo: " + (ej+1));
                Ejecutivo ejec = (Ejecutivo)empleados[i];
                ejec.imprimirDatos();
                ej++;
            }
           
        }
            
        }
        
        
       
        
}
    

