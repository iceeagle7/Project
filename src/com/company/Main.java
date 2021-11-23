package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        ArrayList <Contınent> contınents=new <contınent> ArrayList(){
            {
                add(new Contınent("Eurasıa"));
                add(new Contınent("Afrıca"));
            }
        }
        ArrayList <Planet> planets=new <planet> ArrayList(){
            {
                add(new Planet("Earth"));
                add(new Contınent("Mars"));
            }
        }
        System.out.println("Planet name: "+planet.getName());
        System.out.println("Continent name: "+getFirstContinentName(planet.getContinentList())); System.out.println("Count continents:" + planet.getContinentList().size());
    }
    public static String getFirstContinentName(List<Continent> continentList) {
        String result = null;
        for (Continent continent: continentList) {
            result = continent.getName();
        }

        return result;
    }
}
    }
}
