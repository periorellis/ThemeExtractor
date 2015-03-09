/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themeextractor;

import themeextractor.stemmers.LovinsStemmer;
/**
 *
 * @author panos
 */
public class ThemeExtractor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LovinsStemmer stemmer = new LovinsStemmer();
        String result = stemmer.stem("actually");
        System.out.println(result);


    }
    
}
