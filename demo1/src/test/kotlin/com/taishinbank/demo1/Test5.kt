package com.taishinbank.demo1

import com.taishinbank.demo1.controllers.Demo1Controller
import org.hamcrest.core.StringContains
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

/* 測試 Controller + Services */
@WebMvcTest(controllers = [Demo1Controller::class])
class Test5 {

    @Autowired
    lateinit var mockMvc: MockMvc

    /* 加入 Services 的 MockBean */
    @MockBean
    lateinit var greetingService: GreetingService

    @Test
    fun testServiceAndController() {

        `when`(greetingService.greet()).thenReturn("HIHIHI")

        mockMvc
                .perform(
                        MockMvcRequestBuilders
                                .get("/greeting")
                )
                .andExpect(
                        MockMvcResultMatchers.status().isOk
                )
                .andDo{
                    println(it.response.contentAsString)
                }
                .andExpect(
                        MockMvcResultMatchers.content().string(StringContains.containsString("HIHIHI"))
                )
    }

}