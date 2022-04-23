package com.taishinbank.demo1

import com.taishinbank.demo1.controllers.Demo1Controller
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest /* 會啟動整個 spring boot */
class Demo1ApplicationTests {


	@Autowired
    var demo1Controller: Demo1Controller? = null

    @Test
    fun contextLoads() {
        assert(demo1Controller != null)
    }

}
