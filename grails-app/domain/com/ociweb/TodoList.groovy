package com.ociweb

import grails.rest.Resource

@Resource(uri = '/api/todoLists', formats = ['json'])
class TodoList {

    String title

    static hasMany = [todos: Todo]
    static constraints = {
        todos nullable: true
    }
}
