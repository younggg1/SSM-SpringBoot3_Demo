package com.atguidu.mybatis.mapper;

import com.atguidu.mybatis.bean.TMenu;

/**
* @author Quagmire
* @description 针对表【t_menu(菜单表)】的数据库操作Mapper
* @createDate 2025-04-30 21:17:05
* @Entity com.atguidu.mybatis.bean.TMenu
*/
public interface TMenuMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TMenu record);

    int insertSelective(TMenu record);

    TMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TMenu record);

    int updateByPrimaryKey(TMenu record);

}
