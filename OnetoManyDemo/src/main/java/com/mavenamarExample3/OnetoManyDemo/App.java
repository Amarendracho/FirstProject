package com.mavenamarExample3.OnetoManyDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Mobile m = new Mobile();
       m.setMobileBrand("APPLE");
       m.setMobileColor("White");
       m.setMobilePrice(65000);
       
       Laptop l = new Laptop();
       l.setLaptopBrand("Asus");
       l.setLaptopColor("Black");
       l.setLaptopPrice(56000);
       
       Watch w = new Watch();
       w.setWatchBrand("Noise");
       w.setWatchColor("Blue");
       w.setWatchPrice(19999);
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Mobile.class).addAnnotatedClass(Laptop.class).addAnnotatedClass(Watch.class);
       SessionFactory sf = con.buildSessionFactory();
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       session.save(m);
       session.save(l);
       session.save(w);
       tx.commit();
       sf.close();
       session.close();
    }
}
