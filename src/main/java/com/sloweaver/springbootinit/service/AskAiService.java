package com.sloweaver.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sloweaver.springbootinit.model.dto.askAi.AskAiRequest;
import com.sloweaver.springbootinit.model.dto.tencenttranslation.TencentTranslationRequest;
import com.sloweaver.springbootinit.model.entity.AskAi;
import com.sloweaver.springbootinit.model.entity.TencentTranslation;
import org.springframework.stereotype.Component;

/**
* @author Administrator
* @description 针对表【tencent_translation(腾讯翻译记录表)】的数据库操作Service
* @createDate 2023-05-10 22:15:43
*/
@Component
public interface AskAiService extends IService<AskAi> {

    /**
     * 询问单句
     * @param askAiRequest
     * @return
     */
    String askSingle(AskAiRequest askAiRequest);


}
