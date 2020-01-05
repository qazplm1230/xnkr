package com.lxm.dao;

import com.lxm.model.SyainKeireki;
import com.lxm.model.SyainKeirekiExample;
import com.lxm.model.SyainKeirekiKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyainKeirekiMapper {
    int countByExample(SyainKeirekiExample example);

    int deleteByExample(SyainKeirekiExample example);

    int deleteByPrimaryKey(SyainKeirekiKey key);

    int insert(SyainKeireki record);

    int insertSelective(SyainKeireki record);

    List<SyainKeireki> selectByExample(SyainKeirekiExample example);

    SyainKeireki selectByPrimaryKey(SyainKeirekiKey key);

    int updateByExampleSelective(@Param("record") SyainKeireki record, @Param("example") SyainKeirekiExample example);

    int updateByExample(@Param("record") SyainKeireki record, @Param("example") SyainKeirekiExample example);

    int updateByPrimaryKeySelective(SyainKeireki record);

    int updateByPrimaryKey(SyainKeireki record);
}