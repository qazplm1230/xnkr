package com.lxm.service.Impl;

import com.github.pagehelper.PageHelper;
import com.lxm.dao.SyainMainMapper;
import com.lxm.model.SyainMain;
import com.lxm.model.SyainMainExample;
import com.lxm.service.SyainMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SyainMainServiceImpl implements SyainMainService {
    @Autowired
    private SyainMainMapper syainMainMapper;

    @Override
    public void delete(int id) throws Exception {
        syainMainMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insert(SyainMain syainMain) throws Exception {
        syainMainMapper.insertSelective(syainMain);

    }

    @Override
    public SyainMain selectById(int id) throws Exception {
       SyainMain syainMain=syainMainMapper.selectByPrimaryKey(id);
        return syainMain;
    }

    @Override
    public List<SyainMain> selectAll(int page,int pageSize) throws Exception {
        SyainMainExample syainMainExample=new SyainMainExample();
        SyainMainExample.Criteria criteria=syainMainExample.createCriteria();
        criteria.andSyainIdIsNotNull();
        PageHelper.startPage(page,pageSize);
        List<SyainMain> list=syainMainMapper.selectByExample(syainMainExample);
        return list;
    }

    @Override
    public void update(SyainMain syainMain) throws Exception {
        syainMainMapper.updateByPrimaryKeySelective(syainMain);

    }

    @Override
    public List<SyainMain> selectPart(SyainMain syainMain) throws Exception {
        SyainMainExample syainMainExample=new SyainMainExample();
        SyainMainExample.Criteria criteria=syainMainExample.createCriteria();
        criteria.andFirstNameKanjiLike("%"+syainMain.getFirstNameKanji()+"%");
        //criteria.andFirstNameKanjiLike("name", "%"+syainMain.getFirstNameKanji()+"%");
        //criteria.andLastNameKanjiLike("name","%"+syainMain.getLastNameKanji()+"%");
       // criteria.andFirstNameKanaLike("name1","%"+name1+"%");
       // criteria.andLastNameKanaLike("name2","%"+name2+"%");
       // criteria.andFirstNameEigoLike("name3","%"+name3+"%");
       // criteria.andLastNameEigoLike("name4","%"+name4+"%");
        List<SyainMain> list=syainMainMapper.selectByExample(syainMainExample);
        return list;
    }
}
