package com.mallotore

import spock.lang.Specification

class OcrNumberSpec extends Specification {


	def "recognizes ocr number 1"() {
		given:
			def ocrNumber = new OcrNumber(OcrDigitConverter.OCR_NUMBER_ONE)
		expect:
			ocrNumber.convertToDigit() == 1
	}

	def "recognizes ocr number 2"() {
		given:
			def ocrNumber = new OcrNumber(OcrDigitConverter.OCR_NUMBER_TWO)
		expect:
			ocrNumber.convertToDigit() == 2
	}

	def "recognizes ocr number 3"() {
		given:
			def ocrNumber = new OcrNumber(OcrDigitConverter.OCR_NUMBER_THREE)
		expect:
			ocrNumber.convertToDigit() == 3
	}
}