/**
 * Programa para probar la herencia
 * 
 * @author hfonseca778
 * @version 12-08-2017
 */
import  java.lang.Math;
import java.util.Scanner;
public class TestHerencia1 {
    public static void main (String [ ] Args) {
       Scanner lector = new Scanner(System.in);
       int OpcionMetodoEstudiante;
       int salir = 1;
       String EstudianteNombre;
       int EstudianteEdad;
       String EstudianteCarrera = "Sistemas";
       int Semestre;
       int Dormir = 0;
       int Comer = 0;
       int Estudiar = 0;
       int Examen = 0;

       
       System.out.println("Introduzca el nombre del alumno: "); 
       EstudianteNombre = lector.nextLine();     
       
       System.out.println("\nIntroduzca la edad del alumno: "); 
       EstudianteEdad = lector.nextInt();
              
       System.out.println("\nIntroduzca la carrera que estudia el alumno: "); 
       EstudianteCarrera = lector.nextLine();
       
       System.out.println("\nIntroduzca el semestre académico en el que vá el alumno: "); 
       Semestre = lector.nextInt();
            
       do{
           System.out.println("\nQue quiere que haga el estudiante?:");
           System.out.println("1. Dormir");
           System.out.println("2. Comer");
           System.out.println("3. Estudiar");
           System.out.println("4. Presentar un examen");
           System.out.println("Seleccione su opción: ");
           OpcionMetodoEstudiante = lector.nextInt();
           if(OpcionMetodoEstudiante==1)
           {
               Dormir = 1;
               System.out.println("\nAcabas de decir que el estudiante esta durmiendo");
               break;               
           }
           else if(OpcionMetodoEstudiante==2){
               Comer = 1;
               System.out.println("\nAcabas de decir que el estudiante esta comiendo");
               break;
           }
           else if(OpcionMetodoEstudiante==3){
               Estudiar = 1;
               System.out.println("\nAcabas de decir que el estudiante esta estudiando");
               break;
           }
           else if(OpcionMetodoEstudiante==4){
               Examen = OpcionMetodoEstudiante;
               System.out.println("\nAcabas de decir que el estudiante esta presentando un examen");
               break;
           }
           else
           {
               System.out.println("Opción no valida");
           }
       }
       while(salir==1);
       
       Estudiante mEstudiante = new Estudiante(EstudianteNombre, EstudianteEdad, Dormir, Comer);
       mEstudiante.setCarrera(EstudianteCarrera);
       mEstudiante.setSemestre(Semestre);
       mEstudiante.setEstudiar(Estudiar);
       mEstudiante.setExamen(Examen);
       
       mEstudiante.mostrarEstadoFinalEstudiante();
    }
} //Cierre de la clase
