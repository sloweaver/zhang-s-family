package com.sloweaver.springbootinit.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author sloweaver
 * @date 2023/05/10
 */

@Data
public class AskAiVO implements Serializable {

    /**
     * 回答内容
     */
    private String targetText;
}
