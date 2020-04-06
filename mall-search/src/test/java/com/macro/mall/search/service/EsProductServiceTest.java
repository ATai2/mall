package com.macro.mall.search.service;

import com.macro.mall.search.domain.EsProduct;
import com.macro.mall.search.repository.EsProductRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EsProductServiceTest {

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    EsProductRepository esProductRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void importAll() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void create() {
        EsProduct esProduct=new EsProduct();
        esProduct.setId(2L);
        esProduct.setBrandId(90L);
        esProduct.setBrandName("dddd");

//        boolean esproduct = elasticsearchTemplate.createIndex("esproduct");
//        elasticsearchTemplate.putMapping(EsProduct.class, esProduct);
//        elasticsearchTemplate.
        esProductRepository.save(esProduct);
        Iterable<EsProduct> all = esProductRepository.findAll();
        int i=9;
    }

    @Test
    public void testDelete() {
    }

    @Test
    public void search() {
    }

    @Test
    public void testSearch() {
    }

    @Test
    public void recommend() {
    }

    @Test
    public void searchRelatedInfo() {
    }
}