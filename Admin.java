public class Admin {
    public String departamento;
    public double sueldo;
    public String titulo;


    public Admin(String departamento, double sueldo, String titulo) {
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
}
