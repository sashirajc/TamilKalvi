package com.example.sash.tamilkalvi;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class finaltest extends AppCompatActivity {
    int finalResult;
    TextView displayResult;
    EditText playerName;
    DBAdapter db=new DBAdapter(this);

    public void MainTest(View view){
        Intent mainTestIntent=new Intent(this,MainActivity.class);
        Button button=(Button) findViewById(R.id.testbutton6);
        startActivity(mainTestIntent);
    }

    public void submitButton(View view){
        finalResult=firstTest.result1+secondTest.result2+thirdTest.result3+fourthTest.result4+fifthTest.result5;
        /*Intent answer5Intent=getIntent();
        int answer5final=answer5Intent.getIntExtra("answer5",0);*/
        displayResult=(TextView)findViewById(R.id.textViewResult);
        displayResult.setText("Your final score is   " + finalResult);
        EditText nametxt=(EditText)findViewById(R.id.editText);
/*
        SQLiteDatabase scorecard = SQLiteDatabase.openOrCreateDatabase("scorecard",MODE_PRIVATE,null);

        scorecard = new DBAdapter(Context);

*/
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finaltest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_finaltest, menu);
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
