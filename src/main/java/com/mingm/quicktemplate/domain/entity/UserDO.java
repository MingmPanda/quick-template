package com.mingm.quicktemplate.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author: panmm
 * @date: 2020/6/27 20:58
 * @description: 用户DO实体
 */
@Data
@TableName("user")
public class UserDO implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 2094478345320332013L;

    /*** 用户主信息 ***/
    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 手机号
     */
    private String phone;


    /*** 系统主信息 ***/
    /**
     * 数据库主键
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 数据的创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime created;

    /**
     * 数据修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime modified;

    /**
     * 创建者
     */
    @TableField(fill = FieldFill.INSERT)
    private String creator;

    /**
     * 最后修改者
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String operator;

    /**
     * 逻辑删除字段：0：正常，1：逻辑删除
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer status;

    /**
     * 版本号
     */
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Long version;
}
