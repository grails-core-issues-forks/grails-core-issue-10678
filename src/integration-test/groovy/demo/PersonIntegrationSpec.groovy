package demo

import grails.test.mixin.integration.Integration
import spock.lang.Specification

@Integration
class PersonIntegrationSpec extends Specification {

    def "service is injected"() {
        when:
        def person = new Person(name: 'Sergio')
        def text = person.hi()

        then:
        noExceptionThrown()
        text == 'Mr Sergio'
    }
}
