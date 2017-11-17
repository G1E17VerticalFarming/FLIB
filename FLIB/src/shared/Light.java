/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shared;

/**
 *
 * @author chris
 */
public class Light {
    private int id;
    private int type;
    private int runTimeUnix;

    public void setId(int id) {
        this.id = id;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setRunTimeUnix(int runTimeUnix) {
        this.runTimeUnix = runTimeUnix;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public int getRunTimeUnix() {
        return runTimeUnix;
    }

    public int getPowerLevel() {
        return powerLevel;
    }
    private int powerLevel;
}
