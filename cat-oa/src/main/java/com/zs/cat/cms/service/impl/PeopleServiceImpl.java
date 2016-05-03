package com.zs.cat.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zs.cat.cms.api.service.PeopleService;
import com.zs.cat.commons.dao.DaoSupport;
import com.zs.cat.commons.dao.Page;
import com.zs.cat.commons.dao.PageData;


@Service("peopleService")
public class PeopleServiceImpl implements PeopleService {

    @Resource(name = "daoSupport")
    private DaoSupport dao;

    /*
    * 新增
    */
    @Override
    public void save(PageData pd) throws Exception {
        dao.save("PeopleMapper.save", pd);
    }

    /*
    * 删除
    */
    @Override
    public void delete(PageData pd) throws Exception {
        dao.delete("PeopleMapper.delete", pd);
    }

    /*
    * 修改
    */
    @Override
    public void edit(PageData pd) throws Exception {
        dao.update("PeopleMapper.edit", pd);
    }

    /*
    *列表
    */
    @Override
    public List<PageData> list(Page page) throws Exception {
        return (List<PageData>) dao.findForList("PeopleMapper.datalistPage", page);
    }

    /*
    *列表(全部)
    */
    @Override
    public List<PageData> listAll(PageData pd) throws Exception {
        return (List<PageData>) dao.findForList("PeopleMapper.listAll", pd);
    }

    /*
    * 通过id获取数据
    */
    @Override
    public PageData findById(PageData pd) throws Exception {
        return (PageData) dao.findForObject("PeopleMapper.findById", pd);
    }

    /*
    * 批量删除
    */
    @Override
    public void deleteAll(String[] ArrayDATA_IDS) throws Exception {
        dao.delete("PeopleMapper.deleteAll", ArrayDATA_IDS);
    }

}

