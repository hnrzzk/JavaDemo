package priv.frame.orm.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by zhangkai on 2017/9/27.
 */
public class TestMyBatis {
    public static void main(String[] argvs)
    {
        String resource = "mybatis/mybatis_conf.xml";


            InputStream is = TestMyBatis.class.getClassLoader().getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession session = sqlSessionFactory.openSession();

            String statement = "priv.frame.orm.mybatis.userMapper.getUser";

            User user = session.selectOne(statement, 1);
            System.out.println(user);

    }
}
