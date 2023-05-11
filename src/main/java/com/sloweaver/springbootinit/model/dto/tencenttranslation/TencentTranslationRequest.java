package com.sloweaver.springbootinit.model.dto.tencenttranslation;

import lombok.Data;

import java.io.Serializable;

/**
 * @author sloweaver
 * @date 2023/05/10
 */

@Data
public class TencentTranslationRequest implements Serializable {

    /**
     * 翻译前内容
     */
    private String sourceText;


    /**
     * 翻译前语言
     */
    private String sourceLanguage;

    /**
     * 翻译后的语言
     */
    private String targetLanguage;

    private static final long serialVersionUID = 1L;
}
