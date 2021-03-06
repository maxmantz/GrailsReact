package com.ociweb

import grails.rest.Resource

@Resource(uri = '/api/todos', formats = ['json'])
class Todo {

    String name

    static belongsTo = [todoList: TodoList]
}
