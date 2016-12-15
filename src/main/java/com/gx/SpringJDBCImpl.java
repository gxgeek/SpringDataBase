package com.gx;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by gx on 2016/12/15.
 */


@Repository
public class SpringJDBCImpl  implements  SpringJDBC {
    @Resource
    JdbcTemplate jdbcTemplate;

    public int updaTetransfermoneyBySourceId(double count, long id) {
        jdbcTemplate.update("UPDATE transfermoney  set balance = balance - ? where userId=?",count,id);
        return 0;
    }

    public int updaTetransfermoneyByTargetId(double count, long id) {
        jdbcTemplate.update("UPDATE transfermoney  set balance = balance + ? where userId=?",count,id);
        return 0;
    }
}
