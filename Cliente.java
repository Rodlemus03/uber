public class Cliente extends Persona {
    public String tipoPago;
    public String origen;
    public String destino;


    public Cliente(String tipoPago, String origen, String destino,String nombre, String apellido, String dpi, String pais) {
        super(nombre, apellido, dpi, pais);
        this.tipoPago = tipoPago;
        this.origen = origen;
        this.destino = destino;
    }

    public String getTipoPago() {
        return this.tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    //ESPACIO PARA METODOS
    public String uber(){
        String mensaje="Hola soy "+this.nombre+" y necesito un uber";
        return mensaje;
        
    }
}
