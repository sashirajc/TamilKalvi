package com.example.sash.tamilkalvi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
public static final String  TAG="Logtag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");

        Button btn1 = (Button) findViewById(R.id.exitbutton);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
    }

    public void onClick2(View view){
        Intent intent=new Intent(this,aboutTamil.class);
        Button button=(Button) findViewById(R.id.whatbutton);
        startActivity(intent);
    }

    public void onClick1(View view){
        Intent learnintent=new Intent(this,LearnTamil.class);
        Button button=(Button) findViewById(R.id.learnbutton);
        startActivity(learnintent);
    }

    public void onClick3(View view){
        Intent testintent=new Intent(this,TestTamil.class);
        Button button=(Button) findViewById(R.id.testbutton);
        startActivity(testintent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
