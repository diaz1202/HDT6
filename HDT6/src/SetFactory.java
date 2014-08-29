
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejo
 */
class SetFactory<E> {
    public Set<E> getSET(String opcion)
    {
        if(opcion.equals("HS"))
        {
            return new HashSet<E>();
        }
        if (opcion.equals("TS"))
        {
            return new TreeSet<E>();
        }
        else
        {
            return new LinkedHashSet<E>();
        }
    }
    
}
