package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7,
            btn8, btn9, btn0, btnAdd, btnMinas, btnMul, btnDiv, btnAC, btnPoint,btnEqual;

    private TextView tvHistory, tvDisplay;

    double a,b,result;

    enum OperationFlag {
        Add, Minas, Mul, Div, NO;
    }

    private OperationFlag flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnEqual=(Button) findViewById(R.id.btnEqual);
        btnAC=(Button) findViewById(R.id.btnAc);
        btnAdd=(Button) findViewById(R.id.btnAdd);
        btnMinas=(Button) findViewById(R.id.btnMinas);
        btnMul=(Button) findViewById(R.id.btnMul);
        btnDiv=(Button) findViewById(R.id.btnDiv);
        btnPoint=(Button) findViewById(R.id.btnPoint);
        tvHistory = (TextView) findViewById(R.id.tvHistory);
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnAdd.setOnClickListener(this);
        btnMinas.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
    }
    int counter= 0;

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn0:
                setText("0");
                break;

                case R.id.btn1:
                setText("1");
                break;

                case R.id.btn2:
                setText("2");
                break;

                case R.id.btn3:
                setText("3");
                break;

                case R.id.btn4:
                setText("4");
                break;

                case R.id.btn5:
                setText("5");
                break;

                case R.id.btn6:
                    setText("6");
                break;
            case R.id.btn7:
                setText("7");
                break;

                case R.id.btn8:
                    setText("8");
                break;
                case R.id.btn9:
                setText("9");
                break;

            case R.id.btnAdd:
                a = Double.parseDouble(tvDisplay.getText().toString());
                setText("+");
                setText();
                flag = OperationFlag.Add;
                break;

            case R.id.btnMinas:
                a= Double.parseDouble(tvDisplay.getText().toString());
                setText("-");
                setText();
                flag=OperationFlag.Minas;
                break;

                case R.id.btnMul:
                a= Double.parseDouble(tvDisplay.getText().toString());
                setText("*");
                setText();
                flag=OperationFlag.Mul;
                break;

                case R.id.btnDiv:
                a= Double.parseDouble(tvDisplay.getText().toString());
                setText("/");
                setText();
                flag=OperationFlag.Div;
                break;
            case R.id.tvDisplay:
                setText("");
                break;

            case R.id.btnEqual:
                if (counter == 0)
                    b = Double.parseDouble(tvDisplay.getText().toString());


            ++counter;
            switch (flag) {

                case Add:
                    result = a + b;
                    break;
                case Minas:
                    result = a - b;
                    break;
                case Mul:
                    result = a * b;
                    break;
                case Div:
                    result = a/b;
                    break;
                default:
                    setText();
                    setText(b);
                    break;
            }
            setText(result);
            a = Double.parseDouble(tvDisplay.getText().toString());
            break;
        }

    }



    private void setText(Double num) {
        tvDisplay.setText(String.valueOf(num));
    }
    private void setText(String num) {
        tvDisplay.setText(tvDisplay.getText() + num);
        tvHistory.setText(tvHistory.getText() + num);
    }

    private void setText() {
        tvDisplay.setText("");
    }
    private void a(){
        a = Double.parseDouble(tvDisplay.getText().toString());
    }
    private void b(){
        a = Double.parseDouble(tvDisplay.getText().toString());
    }
}