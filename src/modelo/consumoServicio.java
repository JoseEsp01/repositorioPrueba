/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package modelo;

import sv.FuncionesSOAP;
import sv.FuncionesSOAP_Service;
/**
 *
 * @author jose_
 */
public class consumoServicio {
    public static void main(String[] args) {
        FuncionesSOAP_Service servicio = new FuncionesSOAP_Service();
        FuncionesSOAP cliente = servicio.getFuncionesSOAPPort();
        
        System.out.println(cliente.euroDolar(95));
    }
}
