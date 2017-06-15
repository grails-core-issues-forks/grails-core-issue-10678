package demo

import groovy.transform.CompileStatic

@CompileStatic
class PersonService {

    String sayHello(String name) {
        "Mr $name"
    }
}