package org.wj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wj.dao.DemoInfoMapper;
import org.wj.model.DemoInfo;
import org.wj.service.DemoService;

@Service("userService")
public class DemoServiceImpl implements DemoService {

	@Override
	public List<DemoInfo> queryAllDemos() {
		return demoInfoMapper.selectAll();
	}

	@Autowired
	private DemoInfoMapper demoInfoMapper;
}
