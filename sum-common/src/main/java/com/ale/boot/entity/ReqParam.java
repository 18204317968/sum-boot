package com.ale.boot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 入参类
 *
 * @author 高杨
 * @since 2022年4月25日16:31:47
 */
@Data
@ApiModel(description = "入参实体类")
public class ReqParam {
    /**
     * data数组
     */
    @Valid
    @NotEmpty(message = "data不能为空")
    @ApiModelProperty(notes = "data 数组")
    private List<ParamData> data;
}
