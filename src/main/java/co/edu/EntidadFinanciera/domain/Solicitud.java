package co.edu.EntidadFinanciera.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "solicitud")
public class Solicitud {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int solicitud_id;
    @Column
    private String solicitud_nombre;
    @Column
    private String solicitud_estado;

    public int getSolicitud_id() {
        return solicitud_id;
    }

    public void setSolicitud_id(int solicitud_id) {
        this.solicitud_id = solicitud_id;
    }

    public String getSolicitud_nombre() {
        return solicitud_nombre;
    }

    public void setSolicitud_nombre(String solicitud_nombre) {
        this.solicitud_nombre = solicitud_nombre;
    }

    public String getSolicitud_estado() {
        return solicitud_estado;
    }

    public void setSolicitud_estado(String solicitud_estado) {
        this.solicitud_estado = solicitud_estado;
    }
}
