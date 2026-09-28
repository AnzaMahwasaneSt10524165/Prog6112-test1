package com.mycompany.gamingconsolereport;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

public class GamingConsoleReport {
    
    //Arrays to declare city sales
    public static void main(String[] args) {
        int[][] sales = {
            {1000, 2000, 3000}, 
            {2000, 129, 4000}, 
            {1500, 1100, 1200}  
        };
        String[] months = {"JAN", "FEB", "MAR"};
        String[] years = {"Cape Town", "Port Elizabeth", "Pretoria"};
        
        
        System.out.println("---------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
           System.out.println("---------------------------------------");
      
        System.out.printf("%-20s%-12s%-12s%-12s%n", "", months[0], months[1], months[2]);

        
        for (int row = 0; row < sales.length; row++) {
            System.out.printf("%-20s", years[row]);
            for (int col = 0; col < sales[row].length; col++) {
                System.out.printf("%-12d", sales[row][col]);
            }
            System.out.println(); // New line per year
        }

    
        int totalsales = 0;
        int maxsales = sales[0][0]; 
        int minsales = sales[0][0]; 
        int totalCount = 0;

        
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                int current = sales[row][col];
                
              
                totalsales += current;
                totalCount++;

                // Track maximum delivery
                if (current > maxsales) {
                    maxsales = current;
                }

                
                if (current < minsales) {
                    minsales = current;
                }
            }
        }
        
        double averagesales = (double) totalsales / totalCount;

        System.out.println("---------------------------------------");
        System.out.println("CONSOLE SALES TOTAL FOR EACH CITY");
        System.out.println("---------------------------------------");
        System.out.printf("%-22s%d%n", "Cape Town:", totalsales);
        System.out.printf("%-22s%d%n", "Port Elizabeth:", maxsales);
        System.out.printf("%-22s%d%n", "PRETORIA:", minsales);
        
    }
}