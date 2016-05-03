package com.zs.cat.${packageName}.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zs.cat.${packageName}.api.service.${objectName}Service;
import com.zs.cat.commons.dao.DaoSupport;
import com.zs.cat.commons.dao.Page;
import com.zs.cat.commons.dao.PageData;

/**
* 类名称：${objectName}Controller
* 创建人：zs
* 创建时间：${nowDate?string("yyyy-MM-dd")}
*/
@Service("${objectNameLower}Service")
public class ${objectName}ServiceImpl  implements ${objectName}Service {

@Resource(name = "daoSupport")
private DaoSupport dao;

/*
* 新增
*/
@Override
public void save(PageData pd)throws Exception{
dao.save("${objectName}Mapper.save", pd);
}

/*
* 删除
*/
@Override
public void delete(PageData pd)throws Exception{
dao.delete("${objectName}Mapper.delete", pd);
}

/*
* 修改
*/
@Override
public void edit(PageData pd)throws Exception{
dao.update("${objectName}Mapper.edit", pd);
}

/*
*列表
*/
@Override
public List
<PageData> list(Page page)throws Exception{
    return (List
    <PageData>)dao.findForList("${objectName}Mapper.datalistPage", page);
        }

        /*
        *列表(全部)
        */
        @Override
        public List
        <PageData> listAll(PageData pd)throws Exception{
            return (List
            <PageData>)dao.findForList("${objectName}Mapper.listAll", pd);
                }

                /*
                * 通过id获取数据
                */
                @Override
                public PageData findById(PageData pd)throws Exception{
                return (PageData)dao.findForObject("${objectName}Mapper.findById", pd);
                }

                /*
                * 批量删除
                */
                @Override
                public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
                dao.delete("${objectName}Mapper.deleteAll", ArrayDATA_IDS);
                }

                }

