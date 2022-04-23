package com.taishinbank.demo1

import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class Course(
        @field:NotEmpty
        @field:Size(min = 5, max = 30)
        val courseId: String = "",
        @field:NotEmpty
        val courseName: String = "",
        @field:NotNull
        @field:Min(7)
        val duration: Int = 7
)