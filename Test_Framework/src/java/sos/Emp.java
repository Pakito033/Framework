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
        
public class Emp {
    int id = 1;
    
    @AnnotationUrl(url = "temp1")
    public int getId(){
        return id;
    }
}
