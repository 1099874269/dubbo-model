package com.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("user")
public class User implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Date createTime;
    @TableId(value = "uuid", type = IdType.ID_WORKER_STR)
    private String uuid;
    @TableField(select = true,exist=false)
    private String info;
}