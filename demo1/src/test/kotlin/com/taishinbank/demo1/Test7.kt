package com.taishinbank.demo1

import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.validation.ConstraintViolation
import javax.validation.Validation
import javax.validation.Validator

class Test7 {
    private  var validator: Validator = Validation.buildDefaultValidatorFactory().validator
    private val logger: Logger = LoggerFactory.getLogger(Test7::class.java.simpleName)


    @Test
    fun test1() {
        val user = User2("John")
        val violations = validator.validate(user)
        for (violation in violations) {
            logger.info(violation.message)
        }
        assert(violations.size == 0)
    }

    @Test
    fun test2() {
        val user = User2("")
        val violations = validator.validate(user)
        for (violation in violations) {
            logger.info(violation.message)
        }
        assert(violations.size == 0)
    }

    @Test
    fun test3() {
        val user = User2(null)
        val violations: Set<ConstraintViolation<User2>> = validator.validate(user)
        for (violation in violations) {
            logger.info(violation.message)
        }
        println(violations.size)
        assert(violations.size == 1)
    }
}