package com.taishinbank.demo1

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class Demo1Controller {
    @GetMapping("/")
    fun url(): String = "demo1"
}