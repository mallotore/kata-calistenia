package com.mallotore

import spock.lang.Specification
import groovy.mock.interceptor.MockFor

class OcrFileParserSpec extends Specification {


	static final ocrFileContent =   ["    _  _     _  _  _  _  _ ",  
						             "  | _| _||_||_ |_   ||_||_|",
						             "  ||_  _|  | _||_|  ||_| _|",
						             "                           "]
	def fileParser
	def mockFile

	void setup() {
		mockFile = new MockFor(File)
	}

	def "parses to ocr entries" (){
		when:
			def entries
			mockFile.demand.readLines() {ocrFileContent}
			mockFile.use {
				def ocrFile = new File('path_to_ocr_file')
				fileParser = new OcrFileParser(ocrFile)
				entries = fileParser.parseToOcrEntries()
			}
		then:
			entries.size() == 1
	}
}