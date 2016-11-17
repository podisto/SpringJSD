/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.mas.springjsf.consumer;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sn.mas.springjsf.service.CarDao;

/**
 *
 * @author podisto
 */

@Component
@ManagedBean
@SessionScoped
public class CarBean {
    
    @Autowired
    CarDao carDao;

    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }
    
    public List<String> fetchCarDetails() {
        return carDao.getCarDetails();
    }
}
