package facturacion.facturacion.model;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "COMPROBANTE")
public class Comprobante {

        //Vars.

        @Column(name = "COMRPOBANTE")
        @Id
        private int comprobanteid;

        @Column(name = "FECHA")
        private Date fecha;

        @Column(name = "CANTIDAD")
        private int cantidad;

        @Column(name = "TOTAL")
        private float total;

        @ManyToOne
        @JoinColumn(name="CLIENTE_ID")
        private Cliente clienteid;


        //CONSTRUCTORES

        public Comprobante() {
        }

        public Comprobante(int comprobanteid, Date fecha, int cantidad, float total, Cliente clienteid) {
                this.comprobanteid = comprobanteid;
                this.fecha = fecha;
                this.cantidad = cantidad;
                this.total = total;
                this.clienteid = clienteid;
        }


        //getters&setters


        public int getComprobanteid() {
                return comprobanteid;
        }

        public void setComprobanteid(int comprobanteid) {
                this.comprobanteid = comprobanteid;
        }

        public Date getFecha() {
                return fecha;
        }

        public void setFecha(Date fecha) {
                this.fecha = fecha;
        }

        public int getCantidad() {
                return cantidad;
        }

        public void setCantidad(int cantidad) {
                this.cantidad = cantidad;
        }

        public float getTotal() {
                return total;
        }

        public void setTotal(float total) {
                this.total = total;
        }

        public Cliente getClienteid() {
                return clienteid;
        }

        public void setClienteid(Cliente clienteid) {
                this.clienteid = clienteid;
        }
}

