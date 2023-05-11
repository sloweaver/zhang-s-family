package com.sloweaver.springbootinit.controller;

import com.sloweaver.springbootinit.common.BaseResponse;
import com.sloweaver.springbootinit.common.ErrorCode;
import com.sloweaver.springbootinit.common.ResultUtils;
import com.sloweaver.springbootinit.exception.BusinessException;
import com.sloweaver.springbootinit.model.dto.tencenttranslation.TencentTranslationRequest;
import com.sloweaver.springbootinit.model.entity.TencentTranslation;
import com.sloweaver.springbootinit.model.vo.TencentTranslationVO;
import com.sloweaver.springbootinit.service.TencentTranslationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
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
public class TencentTranslationController {
    @Resource
    TencentTranslationService tencentTranslationService;

    @PostMapping("/translationAndSave")
    public BaseResponse<TencentTranslationVO> translationAndSave(@RequestBody TencentTranslationRequest tencentTranslationRequest) {

        if (tencentTranslationRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        TencentTranslationVO tencentTranslationVO = new TencentTranslationVO();

        TencentTranslation tencentTranslation = new TencentTranslation();
        BeanUtils.copyProperties(tencentTranslationRequest,tencentTranslation);
        String targetText = tencentTranslationService.translation(tencentTranslationRequest);
        tencentTranslation.setTargetText(targetText);

        // 用于返回的VO对象，只需要翻译结果即可
        tencentTranslationVO.setTargetText(targetText);

        // 向记录表中插入数据
        tencentTranslationService.save(tencentTranslation);

        return ResultUtils.success(tencentTranslationVO);
    }

}
