package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView txt;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    int i = 1;
    int[][] xo = new int[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt = findViewById(R.id.txt);
        btn1 = findViewById(R.id.b1);
        btn1 = findViewById(R.id.b1);
        btn2 = findViewById(R.id.b2);
        btn3 = findViewById(R.id.b3);
        btn4 = findViewById(R.id.b4);
        btn5 = findViewById(R.id.b5);
        btn6 = findViewById(R.id.b6);
        btn7 = findViewById(R.id.b7);
        btn8 = findViewById(R.id.b8);
        btn9 = findViewById(R.id.b9);

        btn1.setOnClickListener(view -> {
            xo[0][0] = i = XO(btn1, i);
            wincheck(xo);
        });
        btn2.setOnClickListener(view -> {
            xo[0][1] = i = XO(btn2, i);
            wincheck(xo);
        });
        btn3.setOnClickListener(view -> {
            xo[0][2] = i = XO(btn3, i);
            wincheck(xo);
        });
        btn4.setOnClickListener(view -> {
            xo[1][0] = i = XO(btn4, i);
            wincheck(xo);
        });
        btn5.setOnClickListener(view -> {
            xo[1][1] = i = XO(btn5, i);
            wincheck(xo);
        });
        btn6.setOnClickListener(view -> {
            xo[1][2] = i = XO(btn6, i);
            wincheck(xo);
        });
        btn7.setOnClickListener(view -> {
            xo[2][0] = i = XO(btn7, i);
            wincheck(xo);
        });
        btn8.setOnClickListener(view -> {
            xo[2][1] = i = XO(btn8, i);
            wincheck(xo);
        });
        btn9.setOnClickListener(view -> {
            xo[2][2] = i = XO(btn9, i);
            wincheck(xo);
        });
       /* btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.b1: XO(btn1, i, xo);  break;
                    case R.id.b2: XO(btn1, i, xo); break;
                    case R.id.b3: XO(btn1, i, xo); break;
                    case R.id.b4: XO(btn1, i, xo); break;
                    case R.id.b5: XO(btn1, i, xo); break;
                    case R.id.b6: XO(btn1, i, xo); break;
                    case R.id.b7: XO(btn1, i, xo); break;
                    case R.id.b8: XO(btn1, i, xo); break;
                    case R.id.b9: XO(btn1, i, xo); break;
                }
            }
        });*/
    }

    protected int XO(Button btn, int i) {
        btn.setEnabled(false);
        if (i == 1) {
            btn.setText("X");
i=2;
        } else {
            btn.setText("O");
i=1;
        }
        return i;
    }



    protected void wincheck(int xo[][]) {
        int f=0;
    if ((xo[0][0]==2 &&xo[0][1]==2 && xo[0][2]==2)||
        (xo[1][0]==2 &&xo[1][1]==2 && xo[1][2]==2)||
        (xo[2][0]==2 &&xo[2][1]==2 && xo[2][2]==2)||
        (xo[0][0]==2 &&xo[1][0]==2 && xo[2][0]==2)||
        (xo[0][1]==2 &&xo[1][1]==2 && xo[2][1]==2)||
        (xo[0][2]==2 &&xo[1][2]==2 && xo[2][2]==2)||
        (xo[0][0]==2 &&xo[1][1]==2 && xo[2][2]==2)||
        (xo[0][2]==2 &&xo[1][1]==2 && xo[2][0]==2))
    { Intent intent = new Intent(MainActivity2.this, MainActivity.class);
     intent.putExtra("Win","Выиграл игрок Х");startActivity(intent);}
    else if ((xo[0][0]==1 &&xo[0][1]==1 && xo[0][2]==1)||
            (xo[1][0]==1 &&xo[1][1]==1 && xo[1][2]==1)||
            (xo[2][0]==1 &&xo[2][1]==1 && xo[2][2]==1)||
            (xo[0][0]==1 &&xo[1][0]==1 && xo[2][0]==1)||
            (xo[0][1]==1 &&xo[1][1]==1 && xo[2][1]==1)||
            (xo[0][2]==1 &&xo[1][2]==1 && xo[2][2]==1)||
            (xo[0][0]==1 &&xo[1][1]==1 && xo[2][2]==1)||
            (xo[0][2]==1 &&xo[1][1]==1 && xo[2][0]==1))
    { Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        intent.putExtra("Win","Выиграл игрок O");startActivity(intent);}

    for (int i=0; i<3;i++)
    for (int y=0;y<3;y++)
    {
        if (xo[i][y]!=0) f++;

    }
    if (f==9){
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        intent.putExtra("Win","Ничья,победила дружба :/" );startActivity(intent);
             }
    }


}
