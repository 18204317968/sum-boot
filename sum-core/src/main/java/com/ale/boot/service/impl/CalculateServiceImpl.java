package com.ale.boot.service.impl;

import com.ale.boot.entity.ParamData;
import com.ale.boot.entity.ReqParam;
import com.ale.boot.entity.ResResult;
import com.ale.boot.entity.ResultData;
import com.ale.boot.service.CalculateService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


/**
 * service实现类
 *
 * @author 高杨
 * @since 2022年4月24日23:26:45
 */
@Service
public class CalculateServiceImpl implements CalculateService {
    /**
     * 两数求和
     *
     * @param param 入参对象
     * @return 两数之和
     */
    @Override
    public ResResult sum(ReqParam param) {
        List<ParamData> params = Optional.ofNullable(param.getData()).orElse(Collections.emptyList());
        ResResult result = new ResResult();
        List<ResultData> resultDataList = new ArrayList<>();
        //需求中并未指出待计算的数据只有一组，故视为可以传入多组数据
        for (ParamData paramData : params) {
            BigDecimal sum = doSum(paramData);
            ResultData resultData = new ResultData(sum.toString());
            resultDataList.add(resultData);
        }
        result.setData(resultDataList);
        return result;
    }

    /**
     * 两数求和
     *
     * @param paramData 入参data对象
     * @return 两数之和
     */
    private BigDecimal doSum(ParamData paramData) {
        //由于需求中并未明确规定数字长度限制，所以不使用基本数据类型进行计算，防止数字长度过长导致的异常
        BigDecimal num1 = new BigDecimal(paramData.getNumber1());
        BigDecimal num2 = new BigDecimal(paramData.getNumber2());
        return num1.add(num2);
    }
}
