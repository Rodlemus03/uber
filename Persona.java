public class Persona{
    protected String nombre;
    protected String apellido;
    protected String dpi;
    protected String pais;


    public Persona(String nombre, String apellido, String dpi, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi;
        this.pais = pais;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDpi() {
        return this.dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //ESPACIO PARA METODOS
    public void respirar(){
        System.out.println("Hola soy "+this.nombre+" y estoy respirando" );
    }
}