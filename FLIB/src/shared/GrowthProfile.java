/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shared;

import java.util.ArrayList;
import javafx.beans.property.*;

/**
 *
 * @author AKT
 */
public class GrowthProfile {
    private SimpleIntegerProperty id = new SimpleIntegerProperty(0);
    private SimpleStringProperty name = new SimpleStringProperty("");
    private int temperature = 0;
    private int nightTemperature = 0;
    private int waterLevel = 0;
    private int moisture = 0;
    private ArrayList<Light> lightSequence = null;
    
    public GrowthProfile() {
        
    }
    
    public void setNightTemperature(int nightTemperature){
        this.nightTemperature = nightTemperature;
    }
    
    public int getNightTemperature(){
        return this.nightTemperature;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public void setMoisture(int moisture) {
        this.moisture = moisture;
    }

    public void setLightSequence(ArrayList<Light> lightSequence) {
        this.lightSequence = lightSequence;
    }

    public int getId() {
        return id.get();
    }

    public String getName() {
        return name.get();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public int getMoisture() {
        return moisture;
    }

    public ArrayList<Light> getLightSequence() {
        return lightSequence;
    }
}
