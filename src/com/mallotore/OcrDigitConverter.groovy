package com.mallotore

class OcrDigitConverter {

	static final  OCR_NUMBER_ONE 	= ["   ",
									   "  |",
									   "  |"]
	
	static final  OCR_NUMBER_TWO 	= [" _ ",
									   " _|",
							           "|_ "]

	static final  OCR_NUMBER_THREE 	= [ " _ ",
								    	" _|",
						                " _|"]


	private ocrDigitValuesMap = [1 : OCR_NUMBER_ONE,
					 		 	 2 : OCR_NUMBER_TWO,
					 		 	 3 : OCR_NUMBER_THREE]

	def convert(number){
		def digit = ocrDigitValuesMap.find { key, value -> 
			value == number 
		}

		digit.key
	}
}