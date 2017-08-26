package org.wj.dao;

import java.util.List;
import org.wj.model.DemoInfo;

public interface DemoInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(DemoInfo record);

    DemoInfo selectByPrimaryKey(String id);

    List<DemoInfo> selectAll();

    int updateByPrimaryKey(DemoInfo record);
}