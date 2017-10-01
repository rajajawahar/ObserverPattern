/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import observerpattern.interfaces.Observer;
import observerpattern.interfaces.Subject;

/**
 *
 * @author rajajawahar
 */
public class WeatherData implements Subject{
    

    @Override
    public void registerObservers(Observer o) {
        
    }

    @Override
    public void removeObservers(Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObservers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
