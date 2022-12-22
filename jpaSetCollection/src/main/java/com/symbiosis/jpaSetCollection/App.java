package com.symbiosis.jpaSetCollection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory( "custorder" );  
        EntityManager em = emf.createEntityManager( );  
        em.getTransaction( ).begin( );  
        
        Item item1=new Item(101,"Pizza",250);
        Item item2=new Item(102,"Colddrink",250);
        Item item3=new Item(103,"French Fries",120);
       
       
        
        Orders order1=new Orders();
        order1.setOrder_id(1);
        order1.getItems().add(item1);
        order1.getItems().add(item2);
        order1.getItems().add(item3);
        em.persist(order1);
        
        Customer c1=new Customer(1,"Ajay",order1);
        em.persist(c1);
        
        em.getTransaction().commit();
        System.out.println("Saved data");
        
    }
}
