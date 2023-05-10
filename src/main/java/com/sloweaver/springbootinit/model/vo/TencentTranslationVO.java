package com.sloweaver.springbootinit.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author sloweaver
 * @date 2023/05/10
 */

@Data
public class TencentTranslationVO implements Serializable {

    /**
     * 翻译后内容
     */
    private String targetText;
}
