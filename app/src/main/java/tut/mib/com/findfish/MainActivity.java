 package tut.mib.com.findfish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

 public class MainActivity extends AppCompatActivity {

     Button btn;
     TextView tv1;
     Spinner sp1;
     private  FishExpert fe = new FishExpert();

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         btn = (Button) findViewById(R.id.getfish);
         tv1 = (TextView) findViewById(R.id.fishes);
         sp1 = (Spinner) findViewById(R.id.fishtype);
     }

     public void findMyFish(View view) {

         String selected = String.valueOf(sp1.getSelectedItem());
         Log.d("findmy fish", selected);
         fe = new FishExpert();
         List<String> fish = fe.getFishTypes(selected);
         StringBuilder formattedfish = new StringBuilder();
         for (String st : fish)
         {
             formattedfish.append(st).append("\n");

         }
         //display the fish
         tv1.setText(formattedfish);
     }

 }
