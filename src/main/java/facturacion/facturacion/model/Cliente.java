package facturacion.facturacion.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")

public class Cliente {
    @Column(name = "CLIENTEID")
    @Id
    private int clienteId;

    @Column(name = "DNI")
    private int dni;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    //CONSTRUCTORES
    public Cliente() {
    }

    public Cliente(int clienteId, int dni, String nombre, String apellido) {
        this.clienteId = clienteId;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}


