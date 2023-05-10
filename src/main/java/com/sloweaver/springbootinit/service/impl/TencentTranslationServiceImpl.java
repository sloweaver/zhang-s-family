package com.sloweaver.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sloweaver.springbootinit.model.entity.TencentTranslation;
import com.sloweaver.springbootinit.service.TencentTranslationService;
import com.sloweaver.springbootinit.mapper.TencentTranslationMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【tencent_translation_history(腾讯翻译记录表)】的数据库操作Service实现
* @createDate 2023-05-10 00:09:48
*/
@Service
public class TencentTranslationServiceImpl extends ServiceImpl<TencentTranslationMapper, TencentTranslation>
    implements TencentTranslationService{

}




