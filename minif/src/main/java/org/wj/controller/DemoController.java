package org.wj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wj.model.DemoInfo;
import org.wj.service.DemoService;

@Controller
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping("testdemo")
	@ResponseBody
	public Map<String, Object> test2(@RequestBody String body) {
		List<DemoInfo> demoInfos = demoService.queryAllDemos();

		Map<String, Object> map = new HashMap<String, Object>();
		for (DemoInfo demoInfo : demoInfos) {
			map.put(demoInfo.getId(), demoInfo);
		}

		return map;
	}
}
