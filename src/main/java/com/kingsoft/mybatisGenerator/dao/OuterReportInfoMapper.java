package com.kingsoft.mybatisGenerator.dao;

import com.kingsoft.mybatisGenerator.pojo.OuterReportInfo;

public interface OuterReportInfoMapper {
    int insert(OuterReportInfo record);

    int insertSelective(OuterReportInfo record);
}