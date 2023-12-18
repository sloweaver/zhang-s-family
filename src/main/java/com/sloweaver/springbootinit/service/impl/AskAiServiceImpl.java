package com.sloweaver.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sloweaver.springbootinit.mapper.AskAiMapper;
import com.sloweaver.springbootinit.mapper.TencentTranslationMapper;
import com.sloweaver.springbootinit.model.dto.askAi.AskAiRequest;
import com.sloweaver.springbootinit.model.entity.AskAi;
import com.sloweaver.springbootinit.model.entity.TencentTranslation;
import com.sloweaver.springbootinit.service.AskAiService;

/**
 * @author sloweaver
 * @date 2023/03/25
 */


public class AskAiServiceImpl extends ServiceImpl<AskAiMapper, AskAi>
        implements AskAiService {
    @Override
    public String askSingle(AskAiRequest askAiRequest) {
        return null;
    }
}
