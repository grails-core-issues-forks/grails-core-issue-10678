package demo

import groovy.transform.CompileStatic

@CompileStatic
class Person {
    PersonService personService
    String name

    static transients = ['personService']

    String hi() {
        personService.sayHello(name)
    }
}