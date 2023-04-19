package com.sloweaver.springbootinit.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author sloweaver
 * @date 2023/03/25
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}