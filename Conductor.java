public class Conductor extends Persona {
    public String placa;
    public boolean licencia;
    public String tipoLicencia;


    public Conductor(String placa, boolean licencia, String tipoLicencia,String nombre, String apellido, String dpi, String pais) {
        super(nombre, apellido, dpi, pais);
        this.placa = placa;
        this.licencia = licencia;
        this.tipoLicencia = tipoLicencia;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isLicencia() {
        return this.licencia;
    }

    public boolean getLicencia() {
        return this.licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }

    public String getTipoLicencia() {
        return this.tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
    public void manejando(){
        System.out.println("Hola soy "+this.nombre+" y estoy manejando");
    }
}
