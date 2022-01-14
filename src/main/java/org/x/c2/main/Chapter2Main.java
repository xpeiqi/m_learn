package org.x.c2.main;

import org.apache.ibatis.session.SqlSession;
import org.x.c2.mapper.RoleMapper;
import org.x.c2.po.Role;
import org.x.c2.util.SqlSessionFactoryUtil;

public class Chapter2Main {
    public static void main(String[] args) {
        SqlSession session = SqlSessionFactoryUtil.openSqlSession();
        RoleMapper mapper = session.getMapper(RoleMapper.class);
        Role role = new Role();
        role.setRoleName("testName");
        role.setNote("testNote");
        mapper.insertRole(role);
        mapper.deleteRole(1L);
        session.commit();
    }

}
