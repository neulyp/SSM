package com.ibm.crl.uaqm.system.service;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.crl.uaqm.system.dao.EventDao;
@Service
public class EventService {
	private final static Log log = LogFactory.getLog(EventService.class);
	@Autowired
	private EventDao EventDao;
	
	public Map<String,Object> searchEventById(Map<String,Object> map){
		return EventDao.searchEventById(map);
	}

	public List<Map<String, Object>> searchAllEvent(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return EventDao.allEvent(map);
	}
}
