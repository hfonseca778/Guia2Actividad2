 public class Persona
{
    private String Nombre;
    private int Edad;
    private int Dormir;
    private int Comer;
    
    
    public Persona (String Nombre, int Edad, int Comer, int Dormir) {
        this.Nombre = Nombre;        
        this.Edad = Edad;
        this.Comer = Comer;
        this.Dormir = Dormir;
    }
    
    public String getNombre ()
    { 
      return Nombre;  
    }
    public int getEdad ()
    {
        return Edad;
    }
    
    public int getDormir()
    {
        return Dormir;
    }
    
    public int getComer()
    {
        return Comer;
    }
}
