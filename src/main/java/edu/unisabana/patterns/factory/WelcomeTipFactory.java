/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unisabana.patterns.factory;

import edu.unisabana.patterns.factory.impl.WiseWelcomeTipFactory;

/**
 *
 * @author cesarvefe
 */
public abstract class WelcomeTipFactory {
    
    public static WelcomeTipFactory getFactoryInstance(){
        //leer un archivo de configuración
        return new WiseWelcomeTipFactory();
    }
    
    public abstract WelcomeTip createWelcomeTip();
    
}
