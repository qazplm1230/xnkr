package com.lxm.service;

import com.lxm.model.SyainMain;

import java.util.List;

public interface SyainMainService {
    void delete(int id) throws Exception;
    void insert(SyainMain syainMain) throws Exception;
    SyainMain  selectById(int id) throws Exception;
    List<SyainMain> selectAll(int page,int pageSize) throws Exception;
    void update(SyainMain syainMain) throws Exception;
    List<SyainMain> selectPart(SyainMain syainMain) throws Exception;
}
