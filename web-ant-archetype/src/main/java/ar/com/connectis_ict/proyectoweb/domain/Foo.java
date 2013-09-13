/*
 * Copyright 2013 Connectis ICT Services S.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not 
 * use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an 
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 *
 */
package ar.com.connectis_ict.proyectoweb.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entidad de ejemplo.
 *
 * @author Fernando Martinez
 * @author Franco Morinigo
 * @author Gerardo Matsui
 */
@Entity
public class Foo implements Serializable {

    /**
     * Id de la entidad.
     */
    @Id
    private Long id; //NOPMD
    /**
     * Fecha en la entidad.
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    /**
     * Descripcion en la entidad.
     */
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) { //NOPMD
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
