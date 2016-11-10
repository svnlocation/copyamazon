package com.emusicstore.controller;

// File Name: Singleton.java
public class SingletonClassTest {

   private static SingletonClassTest singleton = new SingletonClassTest( );

   /* A private Constructor prevents any other
    * class from instantiating.
    */
   private SingletonClassTest() { }

   /* Static 'instance' method */
   public static SingletonClassTest getInstance( ) {
      return singleton;
   }

   /* Other methods protected by singleton-ness */
   protected static void demoMethod( ) {
      System.out.println("demoMethod for singleton");
   }
}