package com.ale.boot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

/**
 * 入参数据类
 *
 * @author 高杨
 * @since 2022年4月25日16:31:47
 */
@Data
@ApiModel(description = "入参data实体类")
public class ParamData {
    /**
     * 数字一
     */
    @NotBlank(message = "number1不能为空")
    @Digits(integer = 100, fraction = 100, message = "请使用数字作为参数")
    @ApiModelProperty(notes = "数字一")
    private String number1;

    /**
     * 数字二
     */
    @NotBlank(message = "number2不能为空")
    @Digits(integer = 100, fraction = 100, message = "请使用数字作为参数")
    @ApiModelProperty(notes = "数字二")
    private String number2;
}
