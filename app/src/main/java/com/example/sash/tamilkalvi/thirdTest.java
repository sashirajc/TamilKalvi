package com.example.sash.tamilkalvi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class thirdTest extends AppCompatActivity {
    public static int result3;
    public void fourthTest(View view){
        Intent thirdTestIntent=new Intent(this,fourthTest.class);
        Button button=(Button) findViewById(R.id.testbutton3);
        startActivity(thirdTestIntent);
    }


    public void AnswerTrue(View view){
        result3=1;
        /*Intent answer2Intent=getIntent();
        int result=answer2Intent.getIntExtra("result",0);
        result=result+1;
        Intent answer3Intent = new Intent(thirdTest.this,fourthTest.class);
        answer3Intent.putExtra("result",result);
        startActivity(answer3Intent);*/
    }

    public void AnswerFalse(View view){
        Intent answer2Intent=getIntent();
        int result=answer2Intent.getIntExtra("result",0);
        result=result+0;
        Intent answer3Intent = new Intent(thirdTest.this,fourthTest.class);
        answer3Intent.putExtra("result",result);
        startActivity(answer3Intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_test);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_third_test, menu);
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
