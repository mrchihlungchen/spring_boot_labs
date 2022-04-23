package com.taishinbank.demo1

import org.hamcrest.core.StringContains.containsString
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content

@SpringBootTest
@AutoConfigureMockMvc /* 透過 mock mvc 不會啟動 spring boot*/
class MockMvcTest {

    @Autowired
    var mockMvc: MockMvc? = null

    @Test
    fun contextLoads() {
        assert(mockMvc != null)
    }

    @Test
    fun testHomePage() {
        mockMvc
                ?.perform(
                        MockMvcRequestBuilders
                                .get("/")
                )
                ?.andExpect(
                        MockMvcResultMatchers.status().isOk
                )
                ?.andExpect(
                        content().string(containsString("Hello Demo1"))
                )
    }


    @Test
    fun test404() {
        mockMvc
                ?.perform(
                        MockMvcRequestBuilders
                                .get("/hello")
                )
                ?.andExpect(
                        MockMvcResultMatchers.status().isNotFound
                )
    }

}