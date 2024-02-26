/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unisabana.patterns.factory.impl;

import edu.unisabana.patterns.factory.WelcomeTip;
import java.util.Random;

/**
 *
 * @author cesarvefe
 */
public class WeatherWelcomeTip implements WelcomeTip{

    private Random rand=new Random(System.currentTimeMillis());
    
    @Override
    public String getWelcomeMessage() {
        return "Welcome!. Today's weater in BOG: Rain %: "+rand.nextInt(100);
    }
    
}
