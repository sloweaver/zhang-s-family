package com.sloweaver.springbootinit.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 腾讯翻译记录表
 * @TableName tencent_translation
 */
@TableName(value ="tencent_translation")
@Data
public class AskAi implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;


}