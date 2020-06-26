package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int [] array = new int[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText g = findViewById(R.id.quizes);
        final EditText v = findViewById(R.id.homework);
        final EditText u = findViewById(R.id.midTerms);
        final EditText k = findViewById(R.id.final1);
        Button c = findViewById(R.id.button);
        final TextView text = findViewById(R.id.grade);
       Button reset =findViewById(R.id.btnReset);
       reset.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               g.setText("");
               v.setText("");
               u.setText("");
               k.setText("");
               for (int i = 0; i <array.length; i++) {
                   array[i] = 0;
               }
           }
       });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String quizesString = g.getText().toString();
                String homeworkString = v.getText().toString();
                String midTermString = u.getText().toString();
                final String final1String = k.getText().toString();


                double quizes = Double.parseDouble(quizesString);
                double homework = Double.parseDouble(homeworkString);
                double midTerm = Double.parseDouble(midTermString);
                double final1 = Double.parseDouble(final1String);

                double ha = (quizes + homework + midTerm + final1);
                if (ha >= 90) {
                    text.setText("a (Congratulation!!)");
                } else if (ha >= 80) {
                    text.setText("b (Excellent!!)");
                } else if (ha >= 70) {
                    text.setText("c (Good!!)");
                } else if (ha >= 60) {
                    text.setText("d (Work more)");
                } else {
                    text.setText("f (You must study more)");
                }
            }
        });
    }

}