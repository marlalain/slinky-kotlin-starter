package com.pauloelienay.slinkykotlinstarter.business

import com.pauloelienay.slinky.generics.GenericBusiness
import com.pauloelienay.slinkykotlinstarter.model.Todo
import com.pauloelienay.slinkykotlinstarter.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoBusiness(repository: TodoRepository) : GenericBusiness<Todo, Long>(repository)