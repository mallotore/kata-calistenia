package com.mallotore

class OcrFileParser {

	private final ocrFile

	OcrFileParser(ocrFile){
		this.ocrFile = ocrFile
	}

	def parseToOcrEntries(){
		def lines = ocrFile.readLines()
		def ocrRawEntries = lines.collate(4)

		ocrRawEntries.collect { ocrEntry ->
			new OcrEntryParser(ocrEntry)
		}
	}
}