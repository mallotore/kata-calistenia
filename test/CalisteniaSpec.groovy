import spock.lang.Specification
import groovy.mock.interceptor.MockFor

class CalisteniaSpec extends Specification {
  
	def mockFile
	def accountNumber = " _  _  _  _  _  _  _  _  _ \n" +
						"| || || || || || || || || |\n" +
						"|_||_||_||_||_||_||_||_||_|\n" +
						"                             "

	def setup() {
		mockFile = new MockFor(File)
  	}

	def 'can parse' () {
        when:
        def text
        mockFile.demand.getText() {accountNumber}
		mockFile.use {
			text = new File('.').getText()
		}
        then :
        text == accountNumber
    }
}