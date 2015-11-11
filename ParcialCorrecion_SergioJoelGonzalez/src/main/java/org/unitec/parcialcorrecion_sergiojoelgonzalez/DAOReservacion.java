/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.parcialcorrecion_sergiojoelgonzalez;


import java.util.ArrayList;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Administrador
 */
public class DAOReservacion {
    
    private static SessionFactory sesionFactory;
    private static Session sesion;
    private static Transaction tranza;
    
    public DAOReservacion(){
        sesionFactory=HibernateUtil.getSessionFactory();
        sesion=sesionFactory.openSession();
        tranza=sesion.beginTransaction();  
    }
    
    public void cerrarTodo(){
        tranza.commit();
        sesion.close();
    }
    /*
    public void abrir(){
        sesionFactory=HibernateUtilidades.getSessionFactory();
        sesion=sesionFactory.openSession();
        tranza=sesion.beginTransaction();  
    }*/
    
    public void guardarReservacion(Cliente c, Tarjeta t, Destino d)throws Exception{
        //abrir();
        sesion.save(c);
        sesion.save(t);
        sesion.save(d);
        cerrarTodo();
  
    }
    
    
   public ArrayList<Cliente> buscarTodos()throws Exception{
        ArrayList<Cliente> clientesuchos=( ArrayList<Cliente>)sesion.createCriteria(Cliente.class).list();
        cerrarTodo();
        return clientesuchos;
    }
    
   
   public Cliente buscarPorId (Integer id)throws Exception{
        Cliente a=(Cliente) sesion.createCriteria(Cliente.class).add(Restrictions.idEq(id)).uniqueResult();
        cerrarTodo();
        return a;
    }
}
