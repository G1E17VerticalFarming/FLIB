/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shared;

import shared.Light;
import java.util.ArrayList;

/**
 *
 * @author AKT
 */
public class GrowthProfile {
    private int id;
    private String name;
    private int temperature;
    private int waterLevel;
    private int moisture;
    private ArrayList<Light> lightSequence;
    
    public GrowthProfile() {
        
    }

    public void setName(String name) {
        this.name = name;
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
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoisture() {
        return moisture;
    }

    public ArrayList<Light> getLightSequence() {
        return lightSequence;
    }
}
