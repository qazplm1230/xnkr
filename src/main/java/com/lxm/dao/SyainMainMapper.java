package com.lxm.dao;

import com.lxm.model.SyainMain;
import com.lxm.model.SyainMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyainMainMapper {
    int countByExample(SyainMainExample example);

    int deleteByExample(SyainMainExample example);

    int deleteByPrimaryKey(Integer syainId);

    int insert(SyainMain record);

    int insertSelective(SyainMain record);

    List<SyainMain> selectByExample(SyainMainExample example);

    SyainMain selectByPrimaryKey(Integer syainId);

    int updateByExampleSelective(@Param("record") SyainMain record, @Param("example") SyainMainExample example);

    int updateByExample(@Param("record") SyainMain record, @Param("example") SyainMainExample example);

    int updateByPrimaryKeySelective(SyainMain record);

    int updateByPrimaryKey(SyainMain record);
}