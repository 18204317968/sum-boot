package com.ale.boot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 结果类
 *
 * @author 高杨
 * @since 2022年4月25日17:05:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "返回结果data实体类")
public class ResultData {
    /**
     * 两数之和
     */
    @ApiModelProperty(notes = "两数之和")
    private String sum;
}
