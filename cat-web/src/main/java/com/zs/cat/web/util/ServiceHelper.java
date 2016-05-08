package com.zs.cat.web.util;

import com.zs.cat.base.service.MenuService;
import com.zs.cat.base.service.RoleService;
import com.zs.cat.base.service.UserService;
import com.zs.cat.commons.util.Const;


/**
 * @author Administrator
 *         获取Spring容器中的service bean
 */
public final class ServiceHelper {

    public static Object getService(String serviceName) {
        return Const.WEB_APP_CONTEXT.getBean(serviceName);
    }

    public static UserService getUserService() {
        return (UserService) getService("userService");
    }

    public static RoleService getRoleService() {
        return (RoleService) getService("roleService");
    }

    public static MenuService getMenuService() {
        return (MenuService) getService("menuService");
    }
}
