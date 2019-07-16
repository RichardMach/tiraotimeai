package co.nf.axesoft.sempanela1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Times {

     private ArrayList<String> times;
     private Random random;

    public Times(){
         this.times = new ArrayList<>();

         this.times.add("Panelinha");
         this.times.add("Time 1");
        this.times.add("Sem futuro");
        this.times.add("Corinthians");
         this.times.add("Barcelona");
         this.times.add("Real Madrid");
         this.times.add("Íbis");

    }

    public String[] getTime(int quantTimes){


        String  listTimes[] = new String[quantTimes];

        Collections.shuffle(times);
           for(int i=0;i<quantTimes;i++) {

               listTimes[i] = times.get(i);
           }


        return listTimes;
    }


}
