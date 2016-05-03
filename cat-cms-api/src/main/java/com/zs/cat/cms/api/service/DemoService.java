package com.zs.cat.cms.api.service;


import java.util.List;

import com.zs.cat.commons.dao.Page;
import com.zs.cat.commons.dao.PageData;


public interface DemoService {

    /*
    * 新增
    */
    public void save(PageData pd) throws Exception;

    /*
    * 删除
    */
    public void delete(PageData pd) throws Exception;

    /*
    * 修改
    */
    public void edit(PageData pd) throws Exception;

    /*
    *列表
    */
    public List<PageData> list(Page page) throws Exception;

    /*
    *列表(全部)
    */
    public List<PageData> listAll(PageData pd) throws Exception;

    /*
    * 通过id获取数据
    */
    public PageData findById(PageData pd) throws Exception;

    /*
    * 批量删除
    */
    public void deleteAll(String[] ArrayDATA_IDS) throws Exception;

}

