package com.example.zyh.ndktest;

/**
 * Created by zyh on 16-8-16.
 */
public class Ndk {
         static  {

             System.loadLibrary("zyh");

         }
    public  native  String getCLanguageString();
}
