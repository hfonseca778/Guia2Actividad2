public class Estudiante extends Persona {
    //Campos específicos de la subclase.
    private String Carrera;
    private int Semestre;
    private int Estudiar;
    private int Examen;
    private String ActividadEstudiante;
    

    public Estudiante (String Nombre, int Edad, int Comer, int Dormir) {
        super(Nombre, Edad, Comer, Dormir);        
    } //Cierre del constructor
    
    public void setCarrera (String Carrera) 
    { 
        this.Carrera = Carrera;               
    }
    
    public void setSemestre (int Semestre) 
    { 
        this.Semestre = Semestre;        
    }
    
    public void setEstudiar (int Estudiar) 
    { 
        this.Estudiar = Estudiar;        
    }
    
    public void setExamen (int Examen) 
    { 
        this.Examen = Examen;        
    }
    
    public String getCarrera() 
    { 
        return Carrera;   
    }
    
    public int getSemestre() 
    { 
        return Semestre;   
    }
    
    public int getEstudiar()
    {
        return Estudiar;
    }
    
    public int getExamen()
    {
        return Examen;
    }
    
    public String getActividadEstudiante(){
               
        if (getDormir() ==1){
            ActividadEstudiante = "Durmiendo";
        }
        else if(getComer()==1){
            ActividadEstudiante = "Comiendo";
        }
        else if(Estudiar==1){
            ActividadEstudiante = "Estudiando";
        }
        else if(Examen==1){
            ActividadEstudiante = "Ocupado";
        }
        return ActividadEstudiante;
    }
    
    public void mostrarEstadoFinalEstudiante()
    {
        System.out.println ("\n\nEstudiante de nombre: " + getNombre() + " que tiene " + getEdad() + " años, esta estudiando la carrera de " + getCarrera() + " y va en el " + getSemestre() + " semestre académico y en este momento esta " + getActividadEstudiante());
    }
} //Cierre de la clase
    