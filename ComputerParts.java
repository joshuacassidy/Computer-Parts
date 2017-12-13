/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerpart;

import java.io.Serializable;

/**
 *
 * @author Josh
 */
public class ComputerParts implements Serializable {
    private String partType, partDescription;
    private double partPrice;

    public ComputerParts(String partType, String partDescription, double partPrice) {
        this.partType = partType;
        this.partDescription = partDescription;
        this.partPrice = partPrice;
    }

    public String getPartType() {
        return partType;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public double getPartPrice() {
        return partPrice;
    }
    
    
    
}
