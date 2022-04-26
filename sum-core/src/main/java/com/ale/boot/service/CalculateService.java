package com.ale.boot.service;

import com.ale.boot.entity.ReqParam;
import com.ale.boot.entity.ResResult;

import java.math.BigDecimal;

/**
 * 该service用于定义用于数字计算的service层接口
 *
 * @author 高杨
 * @since 2022年4月24日19:32:34
 */
public interface CalculateService {
    /**
     * 两数求和
     *
     * @param param 入参对象
     * @return 两数之和
     */
    ResResult sum(ReqParam param);
}
