package com.mallotore

class OcrNumber {

	static final OCR_NUMBER_SIZE = 3
	
	private final number
	private final converter

	OcrNumber(number){
		converter = new OcrDigitConverter()
		this.number = number
	}

	def convertToDigit(){
		converter.convert(number)
	}
}