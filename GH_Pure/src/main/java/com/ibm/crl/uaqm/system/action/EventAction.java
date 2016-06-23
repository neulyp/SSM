package com.ibm.crl.uaqm.system.action;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ibm.crl.uaqm.common.Message;
import com.ibm.crl.uaqm.system.service.EventService;
import net.sf.json.JSONArray;

@Controller
@RequestMapping("/system/event")
public class EventAction {

	private final static Log log = LogFactory.getLog(EventAction.class);
	@Autowired
	private EventService EventService;
	
	@ResponseBody
	@RequestMapping(value = "/searchEventById/", method = RequestMethod.POST)
	public Message searchEventById(HttpServletRequest request,HttpServletResponse response,@RequestBody Map<String,Object> map) {
		Message message = new Message();
		StringBuilder jsonStr = new StringBuilder();
		Map<String,Object> result = EventService.searchEventById(map);
		jsonStr.append("[{\"name\":\""+result.get("NAME")+"\"}]");
		message.setData(jsonStr);
		message.setCode("SUCCESS");
		return message;
	}
	
	@ResponseBody
	@RequestMapping(value = "/allEvent/", method = RequestMethod.POST)
	public Message allEvent(HttpServletRequest request,HttpServletResponse response,@RequestBody Map<String,Object> map) {
		Message message = new Message();
		//StringBuilder jsonStr = new StringBuilder();
		java.util.List<Map<String,Object>> result = EventService.searchAllEvent(map);
		JSONArray array = JSONArray.fromObject(result);
		//System.out.println(result+"111111111111111111\n");
		message.setData(array);
		message.setCode("SUCCESS");
		return message;
	}
		
}
