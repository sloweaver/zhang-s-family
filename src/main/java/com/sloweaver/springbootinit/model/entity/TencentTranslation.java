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
 * @TableName tencent_translation_history
 */
@TableName(value ="tencent_translation_history")
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
    private String content_before_translation;

    /**
     * 翻译后内容
     */
    private String content_after_translation;

    /**
     * 翻译前语言
     */
    private String language_before_translation;

    /**
     * 翻译后的语言
     */
    private String language_after_translation;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 
     */
    private Date update_time;

    /**
     * 
     */
    private Integer is_delete;

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
            && (this.getContent_before_translation() == null ? other.getContent_before_translation() == null : this.getContent_before_translation().equals(other.getContent_before_translation()))
            && (this.getContent_after_translation() == null ? other.getContent_after_translation() == null : this.getContent_after_translation().equals(other.getContent_after_translation()))
            && (this.getLanguage_before_translation() == null ? other.getLanguage_before_translation() == null : this.getLanguage_before_translation().equals(other.getLanguage_before_translation()))
            && (this.getLanguage_after_translation() == null ? other.getLanguage_after_translation() == null : this.getLanguage_after_translation().equals(other.getLanguage_after_translation()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContent_before_translation() == null) ? 0 : getContent_before_translation().hashCode());
        result = prime * result + ((getContent_after_translation() == null) ? 0 : getContent_after_translation().hashCode());
        result = prime * result + ((getLanguage_before_translation() == null) ? 0 : getLanguage_before_translation().hashCode());
        result = prime * result + ((getLanguage_after_translation() == null) ? 0 : getLanguage_after_translation().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content_before_translation=").append(content_before_translation);
        sb.append(", content_after_translation=").append(content_after_translation);
        sb.append(", language_before_translation=").append(language_before_translation);
        sb.append(", language_after_translation=").append(language_after_translation);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", is_delete=").append(is_delete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}