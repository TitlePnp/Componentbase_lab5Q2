/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cbsd_ex5q2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author tleku
 */
public class FootballScoreSub implements PropertyChangeListener{

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("(FootballScore) score is updated : " + evt.getNewValue());
    }
    
}
