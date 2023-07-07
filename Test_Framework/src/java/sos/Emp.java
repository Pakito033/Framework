/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sos;

/**
 *
 * @author Tim
 */
import annotation.AnnotationUrl;
import etu1928.framework.ModelView;
        
public class Emp {
    int id = 1;
    
    @AnnotationUrl(url = "emp-all")
    public ModelView findAll(){
        ModelView m = new ModelView("emp.jsp");
        return m;
    }
}