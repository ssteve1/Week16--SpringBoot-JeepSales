/**
 * 
 */
package com.promineotech.jeep.service;

import java.util.List;

import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

/**
 * @author 19294
 *
 */
public interface JeepSalesService {
	
	List<Jeep> fetchJeeps(JeepModel model, String trim );

}
