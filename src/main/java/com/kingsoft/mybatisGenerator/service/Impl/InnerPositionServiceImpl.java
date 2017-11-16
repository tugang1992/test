package com.kingsoft.mybatisGenerator.service.Impl;

import com.kingsoft.mybatisGenerator.dao.InnerPositionMapper;
import com.kingsoft.mybatisGenerator.pojo.InnerPosition;
import com.kingsoft.mybatisGenerator.service.InnerPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * project testGenerator
 * package com.kingsoft.mybatisGenerator.service
 *
 * @author tu.gang
 * @date 2017/10/25 0025
 * @time 16:51
 */
@Service("innerPositionService")
public class InnerPositionServiceImpl implements InnerPositionService {

    @Autowired
    private InnerPositionMapper innerPositionMapper;

    public InnerPositionMapper getInnerPositionMapper() {
        return innerPositionMapper;
    }

    public void setInnerPositionMapper(InnerPositionMapper innerPositionMapper) {
        this.innerPositionMapper = innerPositionMapper;
    }

    @Override
    public InnerPosition getInnerPosition(String EntrustId) {
        return innerPositionMapper.selectByPrimaryKey(EntrustId);
    }
}
