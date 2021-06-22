package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class CensusAnalyserTest {

    private static final String CSV_FILE_PATH = "C:\\Users\\Dell\\IdeaProjects\\CensusAnalyser\\src\\main\\resources\\IndiaStateCensusData.csv";
    //private static final String WRONG_FILE_PATH = "C:\\Users\\Dell\\IdeaProjects\\CensusAnalyser\\src\\main\\resources\\IndiaStateCensusData.csv";
    @Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords() throws IOException, CensusAnalyserException {

        CensusAnalyser censusAnalyser = new CensusAnalyser();
        int numOfRecords = censusAnalyser.loadCSVData(CSV_FILE_PATH);
        Assert.assertEquals(29, numOfRecords);

    }

   /* @Test
    public void givenCSVFile_whenWrongFile_ShouldThrowError() throws IOException {
        CensusAnalyser censusAnalyser = new CensusAnalyser();
        try {
            int numOfRecords = censusAnalyser.loadCSVData(WRONG_FILE_PATH);
        } catch (CensusAnalyserException exception) {
            System.out.println("No such file found");
            Assert.assertEquals(CensusAnalyserException.ExceptionType.INCORRECT_FILE, exception.type);
        }
    }*/
}
