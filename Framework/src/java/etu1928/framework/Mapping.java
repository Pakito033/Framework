/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1928.framework;

/**
 *
 * @author Tim
 */
public class Mapping {
    String className;
    String Method;

    public Mapping() {
    }

    public Mapping(String className, String Method) {
        this.className = className;
        this.Method = Method;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethod() {
        return Method;
    }

    public void setMethod(String Method) {
        this.Method = Method;
    }
    
    
}
