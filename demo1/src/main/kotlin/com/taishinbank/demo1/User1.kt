package com.taishinbank.demo1


import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import javax.validation.constraints.NotNull


@Data
@AllArgsConstructor
@NoArgsConstructor
data class User1(
        @NotNull(message = "name should not be null")
        val name: String? = null
)