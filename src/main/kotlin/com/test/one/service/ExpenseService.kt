package com.test.one.service

import com.test.one.model.Expense
import com.test.one.repository.ExpenseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ExpenseService {
    @Autowired
    lateinit var expenseRepository: ExpenseRepository

    fun findAll(): List<Expense>{
        return  expenseRepository.findAll()
    }

    fun save(expense: Expense): Expense{
        return  expenseRepository.save(expense)
    }
}