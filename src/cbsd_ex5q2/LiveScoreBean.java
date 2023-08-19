/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package cbsd_ex5q2;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author tleku
 */
public class LiveScoreBean implements Serializable {
    
    public static final String SCORELINE_PROPERTY = "scoreLine";
    
    private String scoreLine;
    
    private PropertyChangeSupport propertySupport;
    
    public LiveScoreBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScoreLineProperty() {
        return scoreLine;
    }
    
    public void setScoreLineProperty(String value) {
        String oldValue = scoreLine;
        scoreLine = value;
        propertySupport.firePropertyChange(SCORELINE_PROPERTY, oldValue, scoreLine);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
