package com.mallotore

class OcrEntryParser{

	static final ACCOUNT_NUMBER_LENGTH = 9
	static final OCR_NUMBER_SIZE = 3

	private final ocrEntry

	OcrEntryParser(ocrEntry){
		this.ocrEntry = ocrEntry
	}

	def parseToOcrAccountNumber(){
		def ocrAccountNumber = []
		
		ACCOUNT_NUMBER_LENGTH.times { numberIndex ->
			ocrAccountNumber[numberIndex] = proccessOcrEntry(numberIndex)
		}

		return ocrAccountNumber
	}

	private proccessOcrEntry(numberIndex){
		def ocrNumber = [][]
		def positionsToNextNumber = 2

		OCR_NUMBER_SIZE.times { row ->
			def fromNumberIndex = numberIndex * OCR_NUMBER_SIZE
			def toNumberIndex = fromNumberIndex + positionsToNextNumber

			ocrNumber[row] = ocrEntry[row][fromNumberIndex..toNumberIndex]
		}

		return ocrNumber
	}
}