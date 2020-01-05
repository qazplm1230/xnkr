package com.lxm.dao;

import com.lxm.model.SyainRireki;
import com.lxm.model.SyainRirekiExample;
import com.lxm.model.SyainRirekiKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyainRirekiMapper {
    int countByExample(SyainRirekiExample example);

    int deleteByExample(SyainRirekiExample example);

    int deleteByPrimaryKey(SyainRirekiKey key);

    int insert(SyainRireki record);

    int insertSelective(SyainRireki record);

    List<SyainRireki> selectByExample(SyainRirekiExample example);

    SyainRireki selectByPrimaryKey(SyainRirekiKey key);

    int updateByExampleSelective(@Param("record") SyainRireki record, @Param("example") SyainRirekiExample example);

    int updateByExample(@Param("record") SyainRireki record, @Param("example") SyainRirekiExample example);

    int updateByPrimaryKeySelective(SyainRireki record);

    int updateByPrimaryKey(SyainRireki record);
}