/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import observerpattern.interfaces.DisplayElement;
import observerpattern.interfaces.Observer;
import observerpattern.interfaces.Subject;

/**
 *
 * @author rajajawahar
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{
    
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
    }
    
    public void update(float temperature,float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
                
    }

    @Override
    public void display() {
        System.out.println("Current condition is"
                + " " + temperature + "F degree and "+humidity + "% humidity");
    }
    
    
    
    
    
}
