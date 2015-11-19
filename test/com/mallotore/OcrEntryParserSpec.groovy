package com.mallotore

import spock.lang.Specification

class EntryParserSpec extends Specification {


	static final ocrEntry =["    _  _     _  _  _  _  _ ",
						    "  | _| _||_||_ |_   ||_||_|",
						    "  ||_  _|  | _||_|  ||_| _|",
						    "                           "]
	def entryParser

	void setup() {
		entryParser = new OcrEntryParser(ocrEntry)
	}

	def "parses to ocr account number" (){
		given:
			def accountNumber = entryParser.parseToOcrAccountNumber()
		expect:
			accountNumber.size() == OcrEntryParser.ACCOUNT_NUMBER_LENGTH
	}
}