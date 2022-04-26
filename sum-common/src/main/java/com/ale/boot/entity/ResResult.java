package com.ale.boot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 结果类
 *
 * @author 高杨
 * @since 2022年4月25日16:31:47
 */
@Data
@ApiModel(description = "返回结果实体类")
public class ResResult {
    /**
     * data数组
     */
    @ApiModelProperty(notes = "data 数组")
    private List<ResultData> data;
}
