package com.taishinbank.demo1

import javax.validation.constraints.NotBlank

data class User3(
       @NotBlank(message = "Name should NotBlank.")
       val name:String?
)