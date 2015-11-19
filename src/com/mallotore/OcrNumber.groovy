package com.mallotore

class OcrNumber {
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