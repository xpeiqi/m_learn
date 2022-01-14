package org.x.c2.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class SqlSessionFactoryUtil {
    private static SqlSessionFactory sqlSessionFactory = null;

    private static final Class CLASS_LOCK = SqlSessionFactoryUtil.class;

    private SqlSessionFactoryUtil() {

    }

    public static SqlSessionFactory initSqlSessionFactory() {
        String resource = "m-config.xml";
        InputStream stream = null;
        try {
            stream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            log.error("error", e);
        }
        synchronized (CLASS_LOCK) {
            if (sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSqlSession() {
        if (sqlSessionFactory == null) {
            initSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }
}
