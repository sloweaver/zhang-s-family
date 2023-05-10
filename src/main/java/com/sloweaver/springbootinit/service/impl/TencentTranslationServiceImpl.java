package com.sloweaver.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sloweaver.springbootinit.model.dto.tencenttranslation.TencentTranslationRequest;
import com.sloweaver.springbootinit.model.entity.TencentTranslation;
import com.sloweaver.springbootinit.service.TencentTranslationService;
import com.sloweaver.springbootinit.mapper.TencentTranslationMapper;
import com.sloweaver.springbootinit.utils.TextTranslate;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【tencent_translation(腾讯翻译记录表)】的数据库操作Service实现
* @createDate 2023-05-10 22:15:43
*/
@Service
public class TencentTranslationServiceImpl extends ServiceImpl<TencentTranslationMapper, TencentTranslation>
    implements TencentTranslationService{

    /**
     * translation sourceText
     * @param tencentTranslationRequest
     * @return
     */
    @Override
    public String translation(TencentTranslationRequest tencentTranslationRequest) {
        String sourceText = tencentTranslationRequest.getSourceText();
        String sourceLanguage = tencentTranslationRequest.getSourceLanguage();
        String targetLanguage = tencentTranslationRequest.getTargetLanguage();
        String translateResp = TextTranslate.translate(sourceText,sourceLanguage,targetLanguage);


        return translateResp;
    }
}




