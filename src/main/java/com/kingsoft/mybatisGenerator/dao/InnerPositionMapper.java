package com.kingsoft.mybatisGenerator.dao;

import com.kingsoft.mybatisGenerator.pojo.InnerPosition;

public interface InnerPositionMapper {
    int deleteByPrimaryKey(String entrustid);

    int insert(InnerPosition record);

    int insertSelective(InnerPosition record);

    InnerPosition selectByPrimaryKey(String entrustid);

    int updateByPrimaryKeySelective(InnerPosition record);

    int updateByPrimaryKey(InnerPosition record);
}