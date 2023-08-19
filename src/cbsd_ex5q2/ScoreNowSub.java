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
public class ScoreNowSub implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("(ScoreNow) score is updated : " + evt.getNewValue());
    }
    
}
