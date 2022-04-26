package com.ale.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 该controller类实现程序入口index.html的跳转
 *
 * @author 高杨
 * @since 2022年4月24日23:29:54
 */
@Controller
@ApiIgnore
public class IndexController {
    /**
     * index页面跳转
     *
     * @return index页面
     */
    @RequestMapping("/index")
    public String sum() {
        return "index";
    }
}
