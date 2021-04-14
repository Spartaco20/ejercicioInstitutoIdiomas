/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.idiomas.controller;

import edu.idiomas.model.Students;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author HP
 */
@ManagedBean
@SessionScoped
public class ProcessInstituto implements Serializable{

    private Students alumno = new Students();
    private ArrayList<Students> listaInscritos = new ArrayList<>();
    
    public ProcessInstituto() {
    }
    
    public void alumnoInscrito(){
        alumno.metodoPago();
        alumno.valorCurso();
        listaInscritos.add(new Students(alumno.getNombre(), alumno.getApellido(), alumno.getTipoIdentificacion(), alumno.getNumeroId(), alumno.getDireccion(), alumno.getTelefono(), alumno.getProfesion(), alumno.getEstadoCivil(), alumno.getCurso(), alumno.getNivel(), alumno.getFormaPago(), alumno.getPlanPago(), alumno.getValor()));
    }

    public Students getAlumno() {
        return alumno;
    }

    public void setAlumno(Students alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Students> getListaInscritos() {
        return listaInscritos;
    }

    public void setListaInscritos(ArrayList<Students> listaInscritos) {
        this.listaInscritos = listaInscritos;
    }
    
}
