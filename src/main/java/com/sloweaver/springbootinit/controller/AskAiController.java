package com.sloweaver.springbootinit.controller;

import com.sloweaver.springbootinit.common.BaseResponse;
import com.sloweaver.springbootinit.common.ErrorCode;
import com.sloweaver.springbootinit.common.ResultUtils;
import com.sloweaver.springbootinit.exception.BusinessException;
import com.sloweaver.springbootinit.model.dto.askAi.AskAiRequest;
import com.sloweaver.springbootinit.model.dto.tencenttranslation.TencentTranslationRequest;
import com.sloweaver.springbootinit.model.entity.AskAi;
import com.sloweaver.springbootinit.model.entity.TencentTranslation;
import com.sloweaver.springbootinit.model.vo.AskAiVO;
import com.sloweaver.springbootinit.model.vo.TencentTranslationVO;
import com.sloweaver.springbootinit.service.TencentTranslationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sloweaver
 * @date 2023/05/09
 */

@RestController
@RequestMapping("/translation")
@Slf4j
public class AskAiController {
    @Resource
    TencentTranslationService tencentTranslationService;

    @PostMapping("/translationAndSave")
    public BaseResponse<AskAiVO> askAiSingle(@RequestBody AskAiRequest askAiRequest) {

        if (askAiRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        AskAiVO askAiVO = new AskAiVO();

        AskAi askAi = new AskAi();

        return ResultUtils.success(askAiVO);
    }

}
