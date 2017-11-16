package com.kingsoft.mybatisGenerator.service.Impl;

import com.kingsoft.mybatisGenerator.pojo.InnerPosition;
import com.kingsoft.mybatisGenerator.service.InnerPositionService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * project testGenerator
 * package com.kingsoft.mybatisGenerator.service
 *
 * @author tu.gang
 * @date 2017/10/25 0025
 * @time 17:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class InnerPositionIImplTest {
//    private  ApplicationContext ac;
    @Autowired
    private InnerPositionService innerPositionService;

    private static final Logger logger = Logger.getLogger(InnerPositionIImplTest.class);

    @Test
    public void getInnerPositionMapper() throws Exception {
    }

    @Test
    public void setInnerPositionMapper() throws Exception {
    }

    @Test
    public void getInnerPosition() throws Exception {
        InnerPosition innerPosition = innerPositionService.getInnerPosition("0");
        System.out.println(innerPosition.getCreatetime());
        logger.info(innerPosition);
    }
}