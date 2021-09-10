package cn.eid;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.eid.entity.SysDept;
import cn.eid.mapper.SysDeptMapper;

public class Application {

    public static void main(String[] args) {
        try (InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml")) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            try (SqlSession sqlSession = sqlSessionFactory.openSession();) {
                SysDeptMapper sysDeptMapper = sqlSession.getMapper(SysDeptMapper.class);
                SysDept user = sysDeptMapper.getById(1297780912181121026L);
                System.out.println(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
