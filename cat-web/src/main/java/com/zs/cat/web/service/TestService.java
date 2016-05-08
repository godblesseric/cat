package com.zs.cat.web.service;

import com.zs.cat.commons.dao.DaoSupport;
import com.zs.cat.commons.dao.Page;
import com.zs.cat.commons.dao.PageData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("testService")
public class TestService {

    @Resource(name = "daoSupport")
    private DaoSupport dao;

    /*
    * 新增
    */
    public void save(PageData pd) throws Exception {
        dao.save("TestMapper.save", pd);
    }

    /*
    * 删除
    */
    public void delete(PageData pd) throws Exception {
        dao.delete("TestMapper.delete", pd);
    }

    /*
    * 修改
    */
    public void edit(PageData pd) throws Exception {
        dao.update("TestMapper.edit", pd);
    }

    /*
    *列表
    */
    public List<PageData> list(Page page) throws Exception {
        return (List<PageData>) dao.findForList("TestMapper.datalistPage", page);
    }

    /*
    *列表(全部)
    */
    public List<PageData> listAll(PageData pd) throws Exception {
        return (List<PageData>) dao.findForList("TestMapper.listAll", pd);
    }

    /*
    * 通过id获取数据
    */
    public PageData findById(PageData pd) throws Exception {
        return (PageData) dao.findForObject("TestMapper.findById", pd);
    }

    /*
    * 批量删除
    */
    public void deleteAll(String[] ArrayDATA_IDS) throws Exception {
        dao.delete("TestMapper.deleteAll", ArrayDATA_IDS);
    }

}

