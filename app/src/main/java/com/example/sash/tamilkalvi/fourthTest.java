package com.example.sash.tamilkalvi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class fourthTest extends AppCompatActivity {
    int result=0;
    public void fifthTest(View view){
        Intent fourthTestIntent=new Intent(this,fifthTest.class);
        Button button=(Button) findViewById(R.id.testbutton4);
        startActivity(fourthTestIntent);
    }


    public void AnswerTrue(View view){
        Intent answer3Intent=getIntent();
        int result=answer3Intent.getIntExtra("result",0);
        result=result+1;
        Intent answer4Intent = new Intent(fourthTest.this,fifthTest.class);
        answer4Intent.putExtra("result",result);
        startActivity(answer4Intent);
    }

    public void AnswerFalse(View view){
        Intent answer3Intent=getIntent();
        int result=answer3Intent.getIntExtra("result",0);
        result=result+0;
        Intent answer4Intent = new Intent(fourthTest.this,fifthTest.class);
        answer4Intent.putExtra("result",result);
        startActivity(answer4Intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_test);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fourth_test, menu);
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
