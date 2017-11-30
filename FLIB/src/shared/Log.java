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
    private int cmd;
    private int type;
    private int value;
    private int prodId;
    
    public Log() {
        
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setUnixTimestamp(int unixTimestamp) {
        this.unixTimestamp = unixTimestamp;
    }

    public void setCmd(int cmd) {
        this.cmd = cmd;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getBlock() {
        return block;
    }

    public int getType() {
        return type;
    }

    public int getUnixTimestamp() {
        return unixTimestamp;
    }

    public int getCmd() {
        return cmd;
    }

    public int getValue() {
        return value;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public int getProdId() {
        return prodId;
    }
}
