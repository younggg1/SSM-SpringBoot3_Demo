package com.atguidu.mybatis.mapper;

import com.atguidu.mybatis.bean.TDepartment;

/**
* @author Quagmire
* @description 针对表【t_department(部门)】的数据库操作Mapper
* @createDate 2025-04-30 21:17:05
* @Entity com.atguidu.mybatis.bean.TDepartment
*/
public interface TDepartmentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TDepartment record);

    int insertSelective(TDepartment record);

    TDepartment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TDepartment record);

    int updateByPrimaryKey(TDepartment record);

}
