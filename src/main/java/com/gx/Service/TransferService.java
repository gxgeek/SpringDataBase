package com.gx.Service;

import com.gx.dao.AccountMapper;
import com.gx.SpringJDBCImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by gx on 2016/12/15.
 */
@Service
public class TransferService {

    @Resource
    AccountMapper accountMapper;
    @Resource
    SpringJDBCImpl springJDBC;


    @Transactional(rollbackFor =Exception.class)
    public  void  TransferMoney(long sourceid ,long targetid,double count) throws Exception {
        accountMapper.updaTetransfermoneyBySourceId(count,sourceid);
            a();
//        int b=1/0;
        accountMapper.updaTetransfermoneyByTargetId(count,targetid);
    }
    private void  a() throws Exception {

        throw new Exception("bug");
    }
    @Transactional(rollbackFor =Exception.class)
    public  void  TransferMoneytwo(long sourceid ,long targetid,double count) throws Exception {
        springJDBC.updaTetransfermoneyBySourceId(count,sourceid);
        a();
//        int b=1/0;
        springJDBC.updaTetransfermoneyByTargetId(count,targetid);
    }


}
