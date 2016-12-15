import com.gx.Service.TransferService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by gx on 2016/12/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring.xml"})
public class MyTest {
    @Resource
    TransferService transferService;



    @Test
    public void test1(){
        long a = 1;
        long b = 2;
        double count = 100;
        try {
            transferService.TransferMoney(a,b,count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public  void test2(){
        long a = 1;
        long b = 2;
        double count = 100;
        try {
            transferService.TransferMoneytwo(a,b,count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
