package com.zs.cat.blog.service.impl;


import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.zs.cat.blog.api.service.BlogService;
import com.zs.cat.commons.dao.DaoSupport;
import com.zs.cat.commons.dao.Page;
import com.zs.cat.commons.dao.PageData;

/**
 * 类名称：BlogController
 * 创建人：zs
 * 创建时间：2016-02-25
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService {

    @Resource(name = "daoSupport")
    private DaoSupport dao;

    /*
    * 新增
    */
    @Override
    public void save(PageData pd) throws Exception {
        dao.save("BlogMapper.save", pd);

    }

    /*
    * 删除
    */
    @Override
    public void delete(PageData pd) throws Exception {
        dao.delete("BlogMapper.delete", pd);
    }

    /*
    * 修改
    */
    @Override
    public void edit(PageData pd) throws Exception {
        dao.update("BlogMapper.edit", pd);
    }

    /*
    *列表
    */
    @Override
    public List<PageData> list(Page page) throws Exception {
        return (List<PageData>) dao.findForList("BlogMapper.datalistPage", page);
    }

    /*
    *列表(全部)
    */
    @Override
    public List<PageData> listAll(PageData pd) throws Exception {
        return (List<PageData>) dao.findForList("BlogMapper.listAll", pd);
    }

    /*
    * 通过id获取数据
    */
    @Override
    public PageData findById(PageData pd) throws Exception {
        return (PageData) dao.findForObject("BlogMapper.findById", pd);
    }

    /*
    * 批量删除
    */
    @Override
    public void deleteAll(String[] ArrayDATA_IDS) throws Exception {
        dao.delete("BlogMapper.deleteAll", ArrayDATA_IDS);
    }

}

