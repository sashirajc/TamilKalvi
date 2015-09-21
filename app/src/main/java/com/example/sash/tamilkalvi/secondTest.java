package com.example.sash.tamilkalvi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class secondTest extends AppCompatActivity {
    public static int result2;
    public void thirdTest(View view){
        Intent secondTestIntent=new Intent(this,thirdTest.class);
        Button button=(Button) findViewById(R.id.testbutton2);
        startActivity(secondTestIntent);
    }

    public void AnswerTrue(View view){
        result2=1;
        /*Intent answer1Intent=getIntent();
        int result=answer1Intent.getIntExtra("result",0);
        result=result+1;
        Intent answer2Intent = new Intent(secondTest.this,thirdTest.class);
        answer2Intent.putExtra("result",result);
        startActivity(answer2Intent);*/
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_test);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second_test, menu);
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
