/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern.interfaces;


/**
 *
 * @author rajajawahar
 */
public interface Subject {
    
    void registerObservers(Observer o);
    
    void removeObservers(Observer o);
    
    void notifyObservers();
    
}
