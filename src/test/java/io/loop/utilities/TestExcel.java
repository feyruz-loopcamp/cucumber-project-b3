package io.loop.utilities;

public class TestExcel {

    public static void main(String[] args) {


        ExcelUtils excelUtils = new ExcelUtils("/Users/nsh/Documents/Repo2024/cucumber-project-b3/src/test/resources/Sample.xlsx", "Nadir");
        System.out.println("excelUtils.getCellData(1,2) = " + excelUtils.getCellData(1, 1));
    }

}
