package com.ibm.crl.uaqm.system.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository
public interface EventDao {
	Map<String,Object> searchEventById(Map<String,Object> map);
	List<Map<String,Object>> allEvent(Map<String,Object> map);
	List<Map<String,Object>> getSynthesisByEventId(Map<String,Object> map);
}
