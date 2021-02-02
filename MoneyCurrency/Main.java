package Proj3b;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;

import java.net.MalformedURLException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.net.URL;


public class Main {

    public static void main(String[] args) throws IOException {
        //Change this path to the correct path if you are downloading this and putting in different directory
        //Otherwise the program won't find the targetCurrency.txt
        File file = new File("C:\\Users\\Hristo\\Desktop\\Semester 4 Fall\\IT 313 JAVA\\Assignment 3B\\Proj3bPapucharov\\src\\Proj3b\\targetCurrency.txt");
        Scanner s = new Scanner(file);
        // Creating the bar file
        DefaultCategoryDataset barChartDataset = new DefaultCategoryDataset();
        // uses while loop to use methods for each value on the line
        while(s.hasNextLine()){
            // Gets the currency and the exchange rate when the json completes
            String targetCurrency = getCurrency(s);
            String urlString = getURLString(targetCurrency);
            //Bar for every currency
            double exchangeRate = getExchangeRate(targetCurrency, urlString);
            //Value for each exchange rate
            barChartDataset.addValue(exchangeRate, "total", targetCurrency);
        }
        // Bar chart of the values taken from the file
        JFreeChart barChartObj = ChartFactory.createBarChart(
                "Exchange Rates", "(X) Value", "(Y) Increasing", barChartDataset,
                PlotOrientation.VERTICAL,
                false,
                false,
                false);
        int imageW = 600;
        int imageH = 500;
        // Creates the currency file in png format
        File barChart = new File("currencyChart.png");
        ChartUtilities.saveChartAsPNG(
                barChart, barChartObj, imageW, imageH);

        s.close();
    }
    // Gets the values of the lines and assignes it as a target currency
    private static String getCurrency(Scanner s) {
        String targetCurrency = s.nextLine();
        return targetCurrency;
    }
    // API KEYS
    private static String getURLString(String targetCurrency) {
        //Creating the json variables
        String prefix = "http://data.fixer.io/api/latest";
        String apiKey = "?access_key=48f5532e9b9215ae397750c3766fb7ca";
        //Api link from fixer.io
        String insert = "&symbols=";
        String urlString = prefix+apiKey+insert+targetCurrency;
        return urlString;
    }

    // Exchange rate from the json request
    private static double getExchangeRate(String targetCurrency, String urlString)
            throws MalformedURLException, IOException {
        URL url = new URL(urlString);
        Scanner scann2 = new Scanner(url.openStream( ));
        String json = scann2.nextLine( );
        System.out.println(json);
        int start = json.indexOf(targetCurrency) + 5;
        int end = json.length( ) - 2;
        double exchangeRate = Double.parseDouble(json.substring(start, end));
        //closing scanner 2 and returning exchange rate
        scann2.close();
        return exchangeRate;
    }

}