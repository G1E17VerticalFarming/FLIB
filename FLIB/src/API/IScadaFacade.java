package API;

import java.util.List;
import shared.ProductionBlock;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public interface IScadaFacade {
    
    /**
     * Method to test connection
     * @param testData string test data to be sent
     * @return true if connection is alive
     */
    public boolean ping(String testData);
    
    /**
     * Method for getting a list of all production blocks available for production
     * Note: ProductionBlock class is only a placeholder, subject to change
     * @return a list of all productionBlocks
     */
    public List<ProductionBlock> getProductionBlocks();
    
    /**
     * Method for setting a specific production on a production block with a specified preset configuration
     * @param productionBlock the chosen productionblock string object
     * @param growthProfile the json string object holding preset information regarding the production
     * @return true if production set correct, false otherwise
     */
    public boolean setProduction(String productionBlock, String growthProfile);
}
