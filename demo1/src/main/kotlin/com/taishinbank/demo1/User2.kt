package com.taishinbank.demo1

import javax.validation.constraints.NotEmpty

data class User2(
       @NotEmpty(message = "Name should NotEmpty.")
       val name:String?
)