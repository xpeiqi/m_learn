package org.x.c3.main;

import org.apache.ibatis.session.SqlSession;
import org.x.c2.mapper.RoleMapper;
import org.x.c2.po.Role;
import org.x.c2.util.SqlSessionFactoryUtil;

import java.util.List;

public class C3Main {
    public static void main(String[] args) {
        SqlSession session = SqlSessionFactoryUtil.openSqlSession();
        RoleMapper mapper = session.getMapper(RoleMapper.class);
        List<Role> list = mapper.findRole("t");
        System.out.println(list);
    }
}
