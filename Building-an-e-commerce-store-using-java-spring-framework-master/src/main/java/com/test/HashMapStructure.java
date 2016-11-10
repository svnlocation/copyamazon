package com.test;
import java.util.HashMap;  
import java.util.Iterator;  
    
public class HashMapStructure {  
    
    /** 
     * @author Arpit Mandliya 
     */  
    public static void main(String[] args) {  
            
        Country india=new Country("India",1000);  
        Country japan=new Country("Japan",10000);  
        Country india1=new Country("India",10000000);  
            
        
        System.out.println(india.hashCode());
        System.out.println(japan.hashCode());
        
        System.out.println(india);
        System.out.println(india1);
        System.out.println(japan);
        
        Country france=new Country("France",2000);  
        Country russia=new Country("Russia",20000);  
            
       HashMap<Country, String> countryCapitalMap=new HashMap<Country,String>();    
        countryCapitalMap.put(india,"Delhi");    
        countryCapitalMap.put(japan,"Tokyo");    
        countryCapitalMap.put(france,"Paris");    
        countryCapitalMap.put(russia,"Moscow");  
        
        countryCapitalMap.put(india1,"mumbai");  
              
        System.out.println(countryCapitalMap.size());
        Iterator<Country> countryCapitalIter=countryCapitalMap.keySet().iterator();//put debug point at this line    
        while(countryCapitalIter.hasNext())    
        {    
            Country countryObj=countryCapitalIter.next();    
            String capital=countryCapitalMap.get(countryObj);    
            System.out.println(countryObj.getName()+"----"+capital);    
         }    
        }    
    
    
}  
