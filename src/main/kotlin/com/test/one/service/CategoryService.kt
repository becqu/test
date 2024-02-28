package com.test.one.service

import com.test.one.model.Category
import com.test.one.repository.CategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryService {
    @Autowired
    lateinit var categoryRepository: CategoryRepository
    fun findAll(): List<Category>{
        return  categoryRepository.findAll()
    }

    fun save(category: Category): Category{
        return  categoryRepository.save(category)
    }
}