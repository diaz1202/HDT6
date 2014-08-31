
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import  java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
<<<<<<< HEAD
        SetFactory implemt = new SetFactory();
        Scanner scan = new Scanner(System.in);
        String nombre;
        int grupo,entrada;
        boolean subconjunto;
        entrada=Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de implementación de Stack desea?"
                + "\n1)HashSet"
                + "\n2)TreeSet"
                + "\n3) LinkedHashSet"));
        while (entrada!=1 && entrada !=2 && entrada!=3)
        {
           JOptionPane.showMessageDialog(null, "Usted no ha ingresado una opcion valida");
            entrada=Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de implementación de Stack desea?"
                + "\n1)HashSet"
                + "\n2)TreeSet"
                + "\n3) LinkedHashSet"));         
=======
        boolean cont = true;
        
        while(cont){
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de implementacion desea usar:"
                    + "1. HashSet"
                    + "2. TreeSet"
                    + "3. LinkedHashSet"));
            if(opc==1){
                
                HashSet<Desarrolladores> personas = new HashSet<Desarrolladores>();
            }
            if(opc==2){
                TreeSet<Desarrolladores> personas = new TreeSet<Desarrolladores>();
            }
            if(opc==3){
                LinkedHashSet<Desarrolladores> personas = new LinkedHashSet<Desarrolladores>();
            }
>>>>>>> origin/master
        }
            
          Set <String> java = implemt.getSET (entrada);
          Set <String> celular = implemt.getSET (entrada);
          Set <String> web = implemt.getSET (entrada);
        
          Set <String> resultado1 = implemt.getSET(entrada);
          Set <String> resultado2 = implemt.getSET(entrada);
          Set <String> resultado3 = implemt.getSET(entrada);
          Set <String> resultado4 = implemt.getSET(entrada);
          Set <String> resultado6 = implemt.getSET(entrada);
         
          
          
       
          int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Nombres desea ingresar?"));
          for (int i=0;i<cantidad;i++)
          {
              System.out.println("Ingrese el nombre de la persona");
              nombre = scan.next();
              System.out.println("Ingrese 1 Si tiene experiencia en Java, Ingreso 2 si no la tiene");
              grupo = scan.nextInt();
              if(grupo==1)
              {
                  java.add(nombre);
              }
               System.out.println("Ingrese 1 Si tiene experiencia en WEB, Ingreso 2 si no la tiene");
               grupo=scan.nextInt();
               if (grupo==1)
               {
                   web.add(nombre);
               }
               System.out.println("Ingrese 1 Si tiene experiencia en CELULAR, Ingreso 2 si no la tiene");
               grupo=scan.nextInt();
               if (grupo==1)
               {
                   celular.add(nombre);
               }
              
              
          }
          
          resultado1.addAll(web);
          resultado1.retainAll(java);
          resultado1.retainAll(celular);
          System.out.println("Interseccion de los tres conjuntos"+resultado1);
          
          
          resultado2.addAll(java);
          resultado2.removeAll(web);
          System.out.println("Trabajadores con experiencia en Java pero no en web:"+resultado2);
          
          
          
          resultado3.addAll(celular);
          resultado3.retainAll(web);
          resultado3.removeAll(java);
          System.out.println("Expereincie en Web y celulares pero no en java:"+ resultado3);
          
          resultado4.addAll(celular);
          resultado4.addAll(celular);
          resultado4.removeAll(web);
          System.out.println("Experiencia en Web o celulares pero no en java:"+resultado4);
          
          subconjunto=java.containsAll(web);
          if(subconjunto==true)
          {
              System.out.println("El conjunto de java no es subconjunto del conjunto web");
          }
          if(subconjunto==false)
          {
              System.out.println("El conjunto de java es subconjunto del conjunto web");
          }
          
          
          if(web.size()>java.size() && web.size()>celular.size())
          {
              System.out.println("El conjunto con mas desarrolladores es el web");
              System.out.println("Sus nombres son:" + web);
              resultado6=web;
          }
        
          if (java.size()>web.size()&& java.size()>celular.size())
          {
              System.out.println("El conjunto con mas desarrolladores es el de Java");
              System.out.println("Sus nombres son:" + java);
              resultado6=java;
          }
          
          if (celular.size()>web.size()&& celular.size()>java.size())
          {
              System.out.println("El conjunto con mas desarrolladores es el de Java");
              System.out.println("Sus nombres son:" + celular);
              resultado6=celular;
          }
    }
    
}
