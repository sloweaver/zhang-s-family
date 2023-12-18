-- 创建库
create database if not exists slowapi;

-- 切换库
use slowapi;

-- 用户表
create table if not exists user
(
    id           bigint auto_increment comment 'id' primary key,
    userName     varchar(256)                           null comment '用户昵称',
    userAccount  varchar(256)                           not null comment '账号',
    userAvatar   varchar(1024)                          null comment '用户头像',
    gender       tinyint                                null comment '性别',
    userRole     varchar(256) default 'user'            not null comment '用户角色：user / admin',
    userPassword varchar(512)                           not null comment '密码',
    `accessKey` varchar(512) not null comment 'accessKey',
    `secretKey` varchar(512) not null comment 'secretKey',
    createTime   datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime   datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete     tinyint      default 0                 not null comment '是否删除',
    constraint uni_userAccount
        unique (userAccount)
) comment '用户';


-- auto-generated definition
create table if not exists tencent_translation
(
    id                          bigint auto_increment
        primary key,
    source_text  text                               not null comment '翻译前内容',
    target_text   text                               not null comment '翻译后内容',
    source_language varchar(256)                       not null comment '翻译前语言',
    target_language  varchar(256)                       not null comment '翻译后的语言',
    create_time                 datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time                 datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
    is_delete                   tinyint  default 0                 not null
)
    comment '腾讯翻译记录表';

