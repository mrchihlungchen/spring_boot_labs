package com.taishinbank.demo1

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc

@SpringBootTest
@AutoConfigureMockMvc /* 透過 mock mvc 不會啟動 spring boot*/
class DemoTest2 {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun contextLoads() {
        assert(mockMvc != null)
    }

}