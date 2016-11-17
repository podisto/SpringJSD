/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.mas.springjsf.consumer;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import sn.mas.springjsf.service.CarDao;

/**
 *
 * @author podisto
 */
@Service
public class CarImpl implements CarDao{

    @Override
    public List<String> getCarDetails() {
        
        List<String> cars = new ArrayList<String>();
        
        cars.add(0, "Santro");
        cars.add(0, "Zen");
        cars.add(0, "Alto");
        cars.add(0, "Qualis");
        cars.add(0, "Innova");
        
        for (String car : cars) {
            System.out.println(car);
        }
        
        return cars;
    }
    
    
}
