package com.liuzh.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


/**
 * Created by zhaohong on 2017/10/18.
 */
@Controller
@RequestMapping("/spring")
public class SpringBootTestController {


    /**
     * ajax test
     *
     * @param request
     * @return
     */
    @RequestMapping("/ajaxTest")
    @ResponseBody
    public String ajaxTest(HttpServletRequest request) {
        return "ajax 测试成功~";
    }

    /**
     * 页面测试
     *
     * @param map
     * @return
     */
    @RequestMapping("/welcome")
    public String viewTest(Map<String, String> map) {
        map.put("project", "springboot 1");
        System.out.print("");
        return "welcome";
    }

    /**
     * 页面测试2
     *
     * @return
     */
    @RequestMapping("/welcome2")
    public ModelAndView viewTest2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("project", "springboot 2");
        modelAndView.setViewName("welcome");
        return modelAndView;
    }

    /**
     * 页面测试3
     *
     * @return
     */
    @RequestMapping("/welcome3")
    public ModelAndView viewTest3() {
        ModelMap map = new ModelMap();
        map.put("project", "springboot 3");
        return new ModelAndView("view/welcome", map);
    }

}
