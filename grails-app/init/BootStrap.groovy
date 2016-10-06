import com.ociweb.Todo
import com.ociweb.TodoList

class BootStrap {

    def init = { servletContext ->
        if (!Todo.list()) {
            log.info "Creating todos..."
            def todoList = new TodoList(title: "Maxi's Todos").save()

            [[name: "Aufstehen", todoList: todoList], [name: "Zähne putzen", todoList: todoList], [name: "Kaffe trinken", todoList: todoList]].each { props ->
                def todo = new Todo()
                todo.properties = props
                todo.save(flush: true)
            }
        }
    }
    def destroy = {
    }
}
