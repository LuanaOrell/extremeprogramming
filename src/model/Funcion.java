/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import databasemanager.QueryBuilded;
import java.util.List;

/**
 *
 * @author LuLu
 */
public class Funcion {
    private final String name;
    private final boolean enabled;

    public Funcion(String name) {
        this.name = name;
        List<String> funciones = QueryBuilded.getInstance().getFunctionsUser();
        enabled = funciones.contains(name);
    }

    public boolean getEnabled() {
        return enabled;
    }
    
}
