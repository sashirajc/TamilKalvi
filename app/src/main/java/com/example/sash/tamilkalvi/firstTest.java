package com.example.sash.tamilkalvi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class firstTest extends AppCompatActivity {
    public static int result1;
    public void secondTest(View view){
        Intent firstTestIntent=new Intent(this,secondTest.class);
        Button button=(Button) findViewById(R.id.testbutton1);
        startActivity(firstTestIntent);
    }

    public void AnswerTrue(View view){
        result1=1;
        /*
        result=result+1;
        Intent answer1Intent = new Intent(firstTest.this,secondTest.class);
        answer1Intent.putExtra("result",result);
        startActivity(answer1Intent);*/
    }

    public void AnswerFalse(View view){
        Intent answer1Intent = new Intent(firstTest.this,secondTest.class);
        answer1Intent.putExtra("result",0);
        startActivity(answer1Intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_test);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first_test, menu);
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
