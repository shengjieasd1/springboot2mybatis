package cn.sj.springboot2mybatis.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
public class TestJdbc {
    @Resource
    private DataSource dataSource;
    @Test
    public void test1() throws SQLException {
        System.out.println(this.dataSource.getConnection());
    }
}
