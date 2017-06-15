package demo

import grails.test.hibernate.HibernateSpec

class PersonSpec extends HibernateSpec {

    List<Class> getDomainClasses() { [Person] }

    def "service is injected"() {
        given:
        def domain = new Person()

        when:
        domain.name = 'Sergio'
        def text = domain.hi()

        then:
        noExceptionThrown()
        text == 'Mr Sergio'
    }
}
