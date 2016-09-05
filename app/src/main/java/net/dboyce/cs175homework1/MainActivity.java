package net.dboyce.cs175homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int lastone=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fortunebuttonclick(View v){
        TextView fort = (TextView)findViewById(R.id.fortText);
        //System.out.println("Got button clicks");

        Random rand = new Random(); //generates random number and checks to make sure its new
        int  n = rand.nextInt(7);
        while(n==lastone){
            n = rand.nextInt(7);
        }
        lastone=n;

        switch(n){
            case 0:
                System.out.println(n);
                fort.setText(R.string.st1);
                break;
            case 1:
                System.out.println(n);
                fort.setText(R.string.st2);
                break;
            case 2:
                System.out.println(n);
                fort.setText(R.string.st3);
                break;
            case 3:
                System.out.println(n);
                fort.setText(R.string.st4);
                break;
            case 4:
                System.out.println(n);
                fort.setText(R.string.st5);
                break;
            case 5:
                System.out.println(n);
                fort.setText(R.string.st6);
                break;
            case 6:
                System.out.println(n);
                fort.setText(R.string.st7);
                break;
            case 7:
                System.out.println(n);
                fort.setText(R.string.st8);
                break;

        }


    }
}
