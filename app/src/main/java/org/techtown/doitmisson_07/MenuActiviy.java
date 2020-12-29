package org.techtown.doitmisson_07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_activiy);

        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //고객관리 버튼
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "고객관리", Toast.LENGTH_LONG).show();

                //이름에서 알 수 있듯이, getApplicationContext()가 application context를 가르키는 것이고,
                //
                //this가 activity context를 가르키는 것입니다.

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //매출관리 버튼
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "매출관리", Toast.LENGTH_LONG).show();

            }
        });
        
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //상품관리 버튼
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "상품관리", Toast.LENGTH_LONG).show();

            }
        });
    }
}