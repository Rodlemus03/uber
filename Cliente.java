public class Cliente {
    public String tipoPago;
    public String origen;
    public String destino;


    public Cliente(String tipoPago, String origen, String destino) {
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
}
