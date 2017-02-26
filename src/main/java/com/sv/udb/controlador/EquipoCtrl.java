/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.Equipos;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Luis
 */
public class EquipoCtrl {
    public boolean guar(Equipos obj)
    {
    boolean resp = false;
    Connection con = new Conexion().getConn();
        try 
        {
            PreparedStatement cmd = con.prepareStatement("Insert into equipos values(Null,?,?)");
            cmd.setString(1,obj.getNombEqui());
            cmd.setString(2,obj.getDescEqui());
            cmd.executeUpdate();
            resp = true;
            
        }
        catch (Exception e) 
        {
            System.out.println("Error: "+e.getMessage());
        }
        finally
        {
        try
        {
        if(con != null)
        {
        if(!con.isClosed())
        {
        con.close();
        }
        }
        }
        catch(SQLException err)
            {
                err.printStackTrace();
            }
        }
    return resp;
    }
    
}
