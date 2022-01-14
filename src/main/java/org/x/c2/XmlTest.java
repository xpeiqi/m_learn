package org.x.c2;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.x.c2.mapper.RoleMapper;
import org.x.c2.po.Role;

import java.io.IOException;
import java.io.InputStream;

public class XmlTest {

    public static void main(String[] args) throws IOException {
        String resource = "m-config.xml";
        InputStream stream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = sessionFactory.openSession();
        RoleMapper mapper = session.getMapper(RoleMapper.class);
        Role role = mapper.selectRole(2L);
        System.out.println(role.getRoleName());
    }
}
