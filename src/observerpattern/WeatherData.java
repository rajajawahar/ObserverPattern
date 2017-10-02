/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;
import observerpattern.interfaces.Observer;
import observerpattern.interfaces.Subject;

/**
 *
 * @author rajajawahar
 */
public class WeatherData implements Subject{
    
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }
    
    
    

    @Override
    public void registerObservers(Observer o) {
        observers.add(o);

        
    }

    @Override
    public void removeObservers(Observer o) {

        
        
        
    }

    @Override
    public void notifyObservers() {
    }
    
    public void onMeasurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
     this.temperature = temperature;
     this.humidity = humidity;
     this.pressure = pressure;
    }
    
}
