package com.taishinbank.demo1.controllers

import com.taishinbank.demo1.Course
import lombok.extern.slf4j.Slf4j
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import javax.validation.Valid

@Controller
@Slf4j
class CourseController : WebMvcConfigurer{

    private val logger: Logger = LoggerFactory.getLogger(CourseController::class.java.simpleName)

    override fun addViewControllers(registry: ViewControllerRegistry) {
        registry.addViewController("/results").setViewName("results")
    }

    @GetMapping("/course")
    fun show(course: Course) = "course"

    @PostMapping("/course")
    fun checkCourseInfo(@Valid course: Course, bindingResult: BindingResult): String {
        println("checkCourseInfo: $course")
        println("bindingResult.errorCount: ${bindingResult.errorCount}")
        if (bindingResult.hasErrors()) {
            logger.warn("Error count:{}", bindingResult.errorCount)
            return "course"
        }
        return "redirect:/results"
    }
}