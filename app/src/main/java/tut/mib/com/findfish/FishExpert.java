package tut.mib.com.findfish;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mibihi on 9/25/17.
 */

public class FishExpert {

  public List<String> getFishTypes(String env){
    List<String> fishes = new ArrayList<String>();
         if (env.startsWith("Fresh")){
             fishes.add("tilapia");
             fishes.add("gobies");
             fishes.add("puffer");
      }else {
             fishes.add("moray");
             fishes.add("nano");
             fishes.add("needle");
         }
         return  fishes;
  }
}
