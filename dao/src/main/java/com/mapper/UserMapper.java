package com.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    @Select("select t.*,t1.desc info from user t left join user_info t1 on t1.id = t.id ${ew.customSqlSegment}")
    List<User> allData(@Param(Constants.WRAPPER) QueryWrapper<User> wrapper);

}
