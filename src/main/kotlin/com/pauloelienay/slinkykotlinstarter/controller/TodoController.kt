package com.pauloelienay.slinkykotlinstarter.controller

import com.pauloelienay.slinky.generics.GenericController
import com.pauloelienay.slinkykotlinstarter.business.TodoBusiness
import com.pauloelienay.slinkykotlinstarter.model.Todo
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/todos")
class TodoController(business: TodoBusiness) : GenericController<Todo, Long>(business)