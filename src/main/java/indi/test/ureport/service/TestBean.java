package indi.test.ureport.service;

import indi.test.ureport.entity.TestListPojo;
import indi.test.ureport.entity.TestPojo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Author: xiang.zeng
 * @Description:
 * @Date: 2020-12-08 11:14
 */
@Service
public class TestBean {

    public List<TestListPojo> testListPojos(String dsName,String datasetName,Map<String,Object> parameters){
        TestListPojo testListPojo =  new TestListPojo();
        List<TestPojo> testPojos = new ArrayList<>();
        TestPojo testPojo = new TestPojo();
        testPojo.setId(1L);
        testPojo.setName("test1");
        testPojos.add(testPojo);
        TestPojo testPojo2 = new TestPojo();
        testPojo2.setId(2L);
        testPojo2.setName("test2");
        testPojos.add(testPojo2);
        testListPojo.setTestPojos(testPojos);
        testListPojo.setId(1L);
        testListPojo.setName("testList1");
        return Arrays.asList(testListPojo);
    }

}
