package com.kingsoft.mybatisGenerator.controller;

import com.kingsoft.mybatisGenerator.pojo.InnerPosition;
import com.kingsoft.mybatisGenerator.service.InnerPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * project testGenerator
 * package com.kingsoft.mybatisGenerator.controller
 *
 * @author tu.gang
 * @date 2017/10/26 0026
 * @time 10:13
 */
//@RestController
@Controller
@RequestMapping("/innerPostionController")
public class InnerPostionController {
    @Autowired
    private InnerPositionService innerPositionService;
    @RequestMapping("/showCreatetime")
    public String showInnerPositonCreatetime(String EntrustId, HttpServletRequest request) {
        InnerPosition innerPosition;
        innerPosition = innerPositionService.getInnerPosition(EntrustId);
        request.setAttribute("innerPositon",innerPosition);
        return "showInnerPositonCreatetime";
    }
}
