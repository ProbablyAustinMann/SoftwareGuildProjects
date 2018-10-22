/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachinespringmvc.service;

import com.sg.vendingmachinespringmvc.model.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author austinmann
 */
public interface VendingMachineServiceLayer {
       
   public List<Item> getItems();
   
   public Item getId(int input);
    
    
}
