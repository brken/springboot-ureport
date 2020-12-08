package indi.test.ureport.entity;

import lombok.Data;

import java.util.List;

/**
 * @Author: xiang.zeng
 * @Description:
 * @Date: 2020-12-08 11:15
 */
@Data
public class TestListPojo {

    private Long id;

    private String name;

    private List<TestPojo> testPojos;

    private TestPojo testPojo;
}
