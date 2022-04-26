package com.ale.boot.controller;

import com.ale.boot.entity.ReqParam;
import com.ale.boot.entity.ResResult;
import com.ale.boot.service.CalculateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 该controller类用于定义用于数字计算的接口
 *
 * @author 高杨
 * @since 2022年4月24日19:32:34
 */
@Api(value = "CalculateController",tags = "数字计算控制类")
@RestController
@RequestMapping("/cal")
public class CalculateController {
    @Autowired
    private CalculateService service;

    /**
     * 两数求和
     *
     * @param param 入参对象
     * @return 两数之和
     */
    @ApiOperation(value = "两数求和",tags = "sum",response = ResResult.class)
    @PostMapping("/sum")
    public ResResult sum(@RequestBody @ApiParam(value = "param") @Valid ReqParam param) {
        //调用业务层求解并返回
        return service.sum(param);
    }
}
