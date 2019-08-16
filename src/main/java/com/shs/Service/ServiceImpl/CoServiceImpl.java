package com.shs.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shs.Service.CoService;
import com.shs.Service.SpService;

@Service
public class CoServiceImpl implements CoService{
	@Autowired
	SpService service;
	
	public boolean updateSpByid(String id) {
		return service.updateSpByid(id);
	}

}
