package org.x.c3.main;

import org.apache.ibatis.session.SqlSession;
import org.x.c2.util.SqlSessionFactoryUtil;
import org.x.c3.mapper.UserMapper;
import org.x.c3.po.User;

public class C3_4 {
    public static void main(String[] args) {
        SqlSession session = SqlSessionFactoryUtil.openSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUser(1L);
        System.out.println(user);
    }
}
