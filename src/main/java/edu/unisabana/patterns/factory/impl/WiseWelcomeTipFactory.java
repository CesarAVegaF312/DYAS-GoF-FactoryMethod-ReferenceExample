/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unisabana.patterns.factory.impl;

import edu.unisabana.patterns.factory.WelcomeTip;
import edu.unisabana.patterns.factory.WelcomeTipFactory;

/**
 *
 * @author cesarvefe
 */
public class WiseWelcomeTipFactory extends WelcomeTipFactory{

    @Override
    public WelcomeTip createWelcomeTip() {
        return new WiseWelcomeTip();
    }
    
}
