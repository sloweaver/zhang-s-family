package com.sloweaver.springbootinit.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.alibaba.dashscope.aigc.generation.Generation;
import com.alibaba.dashscope.aigc.generation.GenerationResult;
import com.alibaba.dashscope.aigc.generation.models.QwenParam;
import com.alibaba.dashscope.common.Message;
import com.alibaba.dashscope.common.MessageManager;
import com.alibaba.dashscope.common.Role;
import com.alibaba.dashscope.exception.ApiException;
import com.alibaba.dashscope.exception.InputRequiredException;
import com.alibaba.dashscope.exception.NoApiKeyException;
import com.alibaba.dashscope.utils.Constants;
class TestMTest {

    @Test
    void cretaemap() {

    }

    @Test
    void copyMap() {

    }

    @Test
    void main() {
    }

    @Test
    void hello(){



    }
    @Test
    void callWithMessage()
            throws NoApiKeyException, ApiException, InputRequiredException {
        Constants.apiKey="sk-374b84edf17449a28d01bb2a5c10f352";

        Generation gen = new Generation();
        MessageManager msgManager = new MessageManager(10);
        Message systemMsg =
                Message.builder().role(Role.SYSTEM.getValue()).content("You are a helpful assistant.").build();
        Message userMsg = Message.builder().role(Role.USER.getValue()).content("兔子怎么防寒").build();
        msgManager.add(systemMsg);
        msgManager.add(userMsg);
        QwenParam param =
                QwenParam.builder().model(Generation.Models.QWEN_TURBO).messages(msgManager.get())
                        .resultFormat(QwenParam.ResultFormat.MESSAGE)
                        .build();
        GenerationResult result = gen.call(param);
        System.out.println(result);
    }

}