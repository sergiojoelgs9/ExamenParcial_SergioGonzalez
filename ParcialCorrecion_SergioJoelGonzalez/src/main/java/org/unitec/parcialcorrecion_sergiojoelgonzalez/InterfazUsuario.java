/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.parcialcorrecion_sergiojoelgonzalez;

/**
 *
 * @author Administrador
 */
public class InterfazUsuario {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)throws Exception{
     
        

        DAOReservacion dao=new DAOReservacion();
            
            Cliente c = new Cliente();
            Destino d = new Destino();
            Tarjeta t = new Tarjeta();
            
            c.setNombre("Pepe");
            c.setApellidoPaterno("Patea Traceros");
            c.setEmail("kick-Ass@gmail.com");
            d.setCiudad("Tepito");
            d.setHotel("Plaza Garden");
            d.setNumPersonas(2);         
            t.setNombreTarjeta("Azteca");
            t.setSaldo(1234f);
            t.setNumeroTarjeta(0101010101);
            
            dao.guardarReservacion(c,t, d);
            System.out.println("Ya se guardo hijito");



// TODO code application logic here
    }
    
}
