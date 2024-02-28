package com.test.one.controller

import com.test.one.model.Expense
import com.test.one.service.ExpenseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/expenses")
class ExpenseController
{
    @Autowired
    lateinit var expenseService: ExpenseService

    @GetMapping
    fun findAll(): List<Expense>{
        return expenseService.findAll()
    }

    @GetMapping("/categories/{id}")
    fun findAllByCategoryId(@PathVariable("id") id: Long): List<Expense>{
        return  expenseService.findAll().filter { expense -> expense.categoryId == id }
    }
    @PostMapping
    fun save(@RequestBody expense: Expense): Expense{
        return  expenseService.save(expense)
    }
}