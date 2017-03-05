/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

import java.sql.Date;





/**
 *
 * @author Luis
 */
public class Partidos {
   private int Id_partido,codi_equi1,codi_equi2,marcador,marcador2;
   private String fecha;
   private String lugar;

    public Partidos() {
    }

    public Partidos(int Id_partido, int codi_equi1, int codi_equi2, int marcador, int marcador2, String fecha, String lugar) {
        this.Id_partido = Id_partido;
        this.codi_equi1 = codi_equi1;
        this.codi_equi2 = codi_equi2;
        this.marcador = marcador;
        this.marcador2 = marcador2;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return this.lugar;
    }

    public int getId_partido() {
        return Id_partido;
    }

    public void setId_partido(int Id_partido) {
        this.Id_partido = Id_partido;
    }

    public int getCodi_equi1() {
        return codi_equi1;
    }

    public void setCodi_equi1(int codi_equi1) {
        this.codi_equi1 = codi_equi1;
    }

    public int getCodi_equi2() {
        return codi_equi2;
    }

    public void setCodi_equi2(int codi_equi2) {
        this.codi_equi2 = codi_equi2;
    }

    public int getMarcador() {
        return marcador;
    }

    public void setMarcador(int marcador) {
        this.marcador = marcador;
    }

    public int getMarcador2() {
        return marcador2;
    }

    public void setMarcador2(int marcador2) {
        this.marcador2 = marcador2;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
}
