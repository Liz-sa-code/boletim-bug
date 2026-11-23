import spock.lang.Specification

class BoletimSpec extends Specification {

    def "calcularMedia inclui a primeira nota na média"() {
        given:
        def boletim = new GroovyShell().parse(new File('src/main/groovy/Boletim.groovy'))

        when:
        def media = boletim.calcularMedia([8.0, 7.5, 9.0])

        then:
        Math.abs(media - 8.166666666666666) < 0.000001
    }

    def "situacao classifica média 6.0 como Recuperação"() {
        given:
        def boletim = new GroovyShell().parse(new File('src/main/groovy/Boletim.groovy'))

        expect:
        boletim.situacao(6.0, 7.0, 5.0) == "Recuperação"
    }

    def "situacao classifica média exatamente 7.0 como Aprovado"() {
        given:
        def boletim = new GroovyShell().parse(new File('src/main/groovy/Boletim.groovy'))

        expect:
        boletim.situacao(7.0, 7.0, 5.0) == "Aprovado"
    }
}
