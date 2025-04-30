package com.atguidu.mybatis.mapper;

import com.atguidu.mybatis.bean.TEmployee;

/**
* @author Quagmire
* @description 针对表【t_employee(员工表)】的数据库操作Mapper
* @createDate 2025-04-30 21:17:05
* @Entity com.atguidu.mybatis.bean.TEmployee
*/
public interface TEmployeeMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TEmployee record);

    int insertSelective(TEmployee record);

    TEmployee selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TEmployee record);

    int updateByPrimaryKey(TEmployee record);

}
