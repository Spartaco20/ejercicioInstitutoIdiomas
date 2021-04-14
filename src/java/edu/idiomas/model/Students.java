/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.idiomas.model;

/**
 *
 * @author HP
 */
public class Students {

    private String nombre = "";
    private String apellido = "";
    private String tipoIdentificacion = "";
    private int numeroId = 0;
    private String direccion = "";
    private String telefono = "";
    private String profesion = "";
    private String estadoCivil = "";
    private String curso = "";
    private String nivel = "";
    private String formaPago = "";
    private int planPago = 0;
    private int valor = 0;

    private String msn1 = "";
    private String msn2 = "";
    private String msn3 = "";

    public Students() {
    }

    public Students(String nombre, String apellido, String tipoIdentificacion, int numeroId, String direccion, String telefono, String profesion, String estadoCivil, String curso, String nivel, String formaPago, int planPago, int valor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroId = numeroId;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
        this.estadoCivil = estadoCivil;
        this.curso = curso;
        this.nivel = nivel;
        this.formaPago = formaPago;
        this.planPago = planPago;
        this.valor = valor;
    }

    public void metodoPago() {
        if (formaPago.equals("Bank Check")) {
            this.msn1 = "Don't forget! Date shouldn't be more than 30 days";
        }
    }

    public void valorCurso() {
        if (curso.equals("English")) {
            if (nivel.equals("A1")) {
                this.valor = 85000;
            } else if (nivel.equals("A2")) {
                this.valor = 110000;
            } else if (nivel.equals("B1")) {
                this.valor = 145000;
            } else if (nivel.equals("B2")) {
                this.valor = 192000;
            }
        } else {
            if (curso.equals("French")) {
                if (nivel.equals("A1")) {
                    this.valor = 78000;
                } else if (nivel.equals("A2")) {
                    this.valor = 105000;
                } else if (nivel.equals("B1")) {
                    this.valor = 140000;
                } else if (nivel.equals("B2")) {
                    this.valor = 183000;
                }
            } else {
                if (curso.equals("Portuguese")) {
                    if (nivel.equals("A1")) {
                        this.valor = 74000;
                    } else if (nivel.equals("A2")) {
                        this.valor = 100000;
                    } else if (nivel.equals("B1")) {
                        this.valor = 137000;
                    } else if (nivel.equals("B2")) {
                        this.valor = 169000;
                    }
                }
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getPlanPago() {
        return planPago;
    }

    public void setPlanPago(int planPago) {
        this.planPago = planPago;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getMsn1() {
        return msn1;
    }

    public void setMsn1(String msn1) {
        this.msn1 = msn1;
    }

    public String getMsn2() {
        return msn2;
    }

    public void setMsn2(String msn2) {
        this.msn2 = msn2;
    }

    public String getMsn3() {
        return msn3;
    }

    public void setMsn3(String msn3) {
        this.msn3 = msn3;
    }

}
