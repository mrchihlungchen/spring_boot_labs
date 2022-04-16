package com.taishinbank.demo1

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class Demo1Controller {
    @GetMapping("/")
    fun url(model: Model): String {

        model.addAttribute(
                "message_from_controller",
                "This message is from controller."
        )

        return "demo1"
    }


}