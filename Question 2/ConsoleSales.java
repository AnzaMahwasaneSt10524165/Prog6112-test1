/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class ConsoleSales extends Console { 
       public ConsoleSale(String ingredients,int time, int difficultyLevel){ 
              super(ingredients, time, difficultyLevel); 
        } 
        public void PrintRecipes() { 
        System.out.println("**************************************"); 
        System.out.println("INGREDIENTS: " + getIngredients()); 
        System.out.println("TIME TO MAKE: " + getTime()); 
        System.out.println("DIFFICULTY LEVEL: " + getDifficultyLevel()); 
        System.out.println("**************************************"); 
    } 