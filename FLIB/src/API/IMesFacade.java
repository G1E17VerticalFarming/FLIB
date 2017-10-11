/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

/**
 *
 * @author chris
 */
public interface IMesFacade {
    
    /**
     * Method to test connection
     * @param testData string test data to be sent
     * @return true if connection is alive
     */
    public boolean ping(String testData);
    
    /**
     * Method to log scada data in mes database
     * @param data the json string object of data to be logged
     * @return true if data logged succesfully
     */
    public boolean logData(String data);
    
    /**
     * Method for getting a certain growth config for a given plant
     * @param id the id for the growth config to get
     * @return json stringified object for growth config
     */
    public String getGrowthProfile(int id);
}
