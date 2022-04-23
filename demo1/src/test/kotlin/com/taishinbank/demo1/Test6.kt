package com.taishinbank.demo1

import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.validation.ConstraintViolation
import javax.validation.Validation
import javax.validation.Validator

class Test6 {
    private  var validator: Validator = Validation.buildDefaultValidatorFactory().validator
    private val logger: Logger = LoggerFactory.getLogger(Test6::class.java.simpleName)


    @Test
    fun test1() {
        val u1 = User1("John")
        val violations = validator.validate(u1)
        for (violation in violations) {
            logger.info(violation.message)
        }
        assert(violations.size == 0)
    }

    @Test
    fun test2() {
        val u1 = User1("")
        val violations = validator.validate(u1)
        for (violation in violations) {
            logger.info(violation.message)
        }
        assert(violations.size == 0)
    }

    @Test
    fun test3() {
        val user1 = User1(null)
        val violations: Set<ConstraintViolation<User1>> = validator.validate(user1)
        for (violation in violations) {
            logger.info(violation.message)
        }
        println(violations.size)
        assert(violations.size == 1)
    }
}