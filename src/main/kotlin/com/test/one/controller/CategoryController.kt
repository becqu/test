package com.test.one.controller

import com.test.one.model.Category
import com.test.one.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/categories")
class CategoryController {
    @Autowired
    lateinit var categoryService: CategoryService

    @GetMapping
    fun findAll(): List<Category>{
        return  categoryService.findAll()
    }

    @PostMapping
    fun save(@RequestBody category: Category): Category{
        return categoryService.save(category)
    }
}