/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shared;

/**
 *
 * @author AKT
 */
public class Log {
    private int block;
    private int unixTimestamp;
    private String cmd;
    private String type;
    private String value;
    
    public Log() {
        
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUnixTimestamp(int unixTimestamp) {
        this.unixTimestamp = unixTimestamp;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getBlock() {
        return block;
    }

    public String getType() {
        return type;
    }

    public int getUnixTimestamp() {
        return unixTimestamp;
    }

    public String getCmd() {
        return cmd;
    }

    public String getValue() {
        return value;
    }
}
