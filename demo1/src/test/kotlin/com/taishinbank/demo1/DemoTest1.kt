package com.taishinbank.demo1

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class DemoTest1 {

    @BeforeEach
    fun prepareBefore() {
        println("prepareBefore")
    }

    @AfterEach
    fun recordAfter() {
        println("recordAfter")
    }

    @Test
    fun test1() {
        println("test1")
    }

    @Test
    fun test2() {
        println("test2")
    }
}