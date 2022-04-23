package com.taishinbank.demo1

import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class CourseForm(
        @NotEmpty
        @Size(min = 5, max = 30)
        val courseId: String,
        @NotEmpty
        val courseName: String,
        @NotNull
        @Min(7)
        val duration: Int
)