public class Admin extends Persona{
    public String departamento;
    public double sueldo;
    public String titulo;


    public Admin(String departamento, double sueldo, String titulo, String nombre, String apellido, String dpi, String pais) {
        super(nombre, apellido, dpi, pais);
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.titulo = titulo;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //ESPACIO PARA METODOS
    public void administrar(){
        System.out.println("Hola soy "+this.nombre+" y estoy administrando");
    }
}
