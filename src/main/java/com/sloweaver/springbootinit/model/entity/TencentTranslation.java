package com.sloweaver.springbootinit.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 腾讯翻译记录表
 * @TableName tencent_translation
 */
@TableName(value ="tencent_translation")
@Data
public class TencentTranslation implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 翻译前内容
     */
    private String sourceText;

    /**
     * 翻译后内容
     */
    private String targetText;

    /**
     * 翻译前语言
     */
    private String sourceLanguage;

    /**
     * 翻译后的语言
     */
    private String targetLanguage;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 逻辑删除：1删除，0不删除
     */
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TencentTranslation other = (TencentTranslation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSourceText() == null ? other.getSourceText() == null : this.getSourceText().equals(other.getSourceText()))
            && (this.getTargetText() == null ? other.getTargetText() == null : this.getTargetText().equals(other.getTargetText()))
            && (this.getSourceLanguage() == null ? other.getSourceLanguage() == null : this.getSourceLanguage().equals(other.getSourceLanguage()))
            && (this.getTargetLanguage() == null ? other.getTargetLanguage() == null : this.getTargetLanguage().equals(other.getTargetLanguage()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSourceText() == null) ? 0 : getSourceText().hashCode());
        result = prime * result + ((getTargetText() == null) ? 0 : getTargetText().hashCode());
        result = prime * result + ((getSourceLanguage() == null) ? 0 : getSourceLanguage().hashCode());
        result = prime * result + ((getTargetLanguage() == null) ? 0 : getTargetLanguage().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sourceText=").append(sourceText);
        sb.append(", targetText=").append(targetText);
        sb.append(", sourceLanguage=").append(sourceLanguage);
        sb.append(", targetLanguage=").append(targetLanguage);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}