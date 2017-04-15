package com.example.gain.scientificcalculator;


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    Button btnSin,btnCos,btnTan,btnFactorial,btnPow;
    Button btnClear,btnBackSpace,btnBracketsOpen,btnBracketsClose,btnSquare;
    Button btnSeven,btnNine,btnEight,btnDiv,btnEng;
    Button btnFour,btnFive,btnSix,btnMulti,btnInverse;
    Button btnOne,btnTwo,btnThree,btnMinus,btnAdd,btnResult;
    Button btnZero,btnDot,btnPi;
    Button btnShift,btnAlpha,btnMode,btnOn;
    Button btnCalc,btnnPr,btnQub,btnLog,btnLn,btnSquire;
    Button btnRcl,btnSd,btnMod,btnPlusMinus,btnComma,btnHyp,btnMplus;

    TextView screenAns, screenMath;

    StringBuilder textMath = new StringBuilder("");
    StringBuilder textAns = new StringBuilder("");
    StringBuilder screenTextMath=new StringBuilder("");


    int checkSubmit = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);




        screenAns = (TextView) findViewById(R.id.textResult);
        screenMath = (TextView) findViewById(R.id.textCal);

        btnZero = (Button)findViewById(R.id.btn0);
        btnZero.setOnClickListener(this);

        btnOne = (Button)findViewById(R.id.btn1);
        btnOne.setOnClickListener(this);

        btnTwo = (Button)findViewById(R.id.btn2);
        btnTwo.setOnClickListener(this);

        btnThree = (Button)findViewById(R.id.btn3);
        btnThree.setOnClickListener(this);

        btnFour = (Button)findViewById(R.id.btn4);
        btnFour.setOnClickListener(this);

        btnFive = (Button)findViewById(R.id.btn5);
        btnFive.setOnClickListener(this);


        btnSix = (Button)findViewById(R.id.btn6);
        btnSix.setOnClickListener(this);

        btnSeven = (Button)findViewById(R.id.btn7);
        btnSeven.setOnClickListener(this);

        btnEight = (Button)findViewById(R.id.btn8);
        btnEight.setOnClickListener(this);

        btnNine = (Button)findViewById(R.id.btn9);
        btnNine.setOnClickListener(this);

        btnSin = (Button)findViewById(R.id.btnSin);
        btnSin.setOnClickListener(this);

        btnCos = (Button)findViewById(R.id.btnCos);
        btnCos.setOnClickListener(this);


        btnTan = (Button)findViewById(R.id.btnTan);
        btnTan.setOnClickListener(this);

        btnFactorial  = (Button)findViewById(R.id.btnFactorial);
        btnFactorial.setOnClickListener(this);

        btnPow = (Button)findViewById(R.id.btnPow);
        btnPow.setOnClickListener(this);


        btnClear = (Button)findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);


        btnBackSpace = (Button)findViewById(R.id.btnBackSpace);
        btnBackSpace.setOnClickListener(this);

        btnBracketsClose = (Button)findViewById(R.id.btnBrackketsClose);
        btnBracketsClose.setOnClickListener(this);

        btnBracketsOpen  = (Button)findViewById(R.id.btnBracketsOpen);
        btnBracketsOpen.setOnClickListener(this);

        btnSquare  = (Button)findViewById(R.id.btnSquared);
        btnSquare.setOnClickListener(this);

        btnDot = (Button)findViewById(R.id.btnDot);
        btnDot.setOnClickListener(this);

        btnPi = (Button)findViewById(R.id.btnPi);
        btnPi.setOnClickListener(this);


        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(this);


        btnMod = (Button)findViewById(R.id.btnMod);
        btnMod.setOnClickListener(this);


        btnMulti = (Button)findViewById(R.id.btnMulti);
        btnMulti.setOnClickListener(this);


        btnInverse = (Button)findViewById(R.id.btnInverse);
        btnInverse.setOnClickListener(this);

        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(this);


        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);


        btnResult = (Button)findViewById(R.id.btnResult);
        btnResult.setOnClickListener(this);

        btnShift = (Button)findViewById(R.id.btnShift);
        btnShift.setOnClickListener(this);

        btnAlpha = (Button)findViewById(R.id.btnAlpha);
        btnAlpha.setOnClickListener(this);

        btnMode = (Button)findViewById(R.id.btnMode);
        btnMode.setOnClickListener(this);

        btnOn = (Button)findViewById(R.id.btnOn);
        btnOn.setOnClickListener(this);

        btnCalc = (Button)findViewById(R.id.btnCalculation);
        btnCalc.setOnClickListener(this);

        btnnPr = (Button)findViewById(R.id.btnnPr);
        btnnPr.setOnClickListener(this);

        btnQub = (Button)findViewById(R.id.btnQub);
        btnQub.setOnClickListener(this);

        btnSquire = (Button)findViewById(R.id.btnSquire);
        btnSquire.setOnClickListener(this);

        btnLog = (Button)findViewById(R.id.btnLog);
        btnLog.setOnClickListener(this);

        btnLn = (Button)findViewById(R.id.btnLn);
        btnLn.setOnClickListener(this);

        btnRcl = (Button)findViewById(R.id.btnRcl);
        btnRcl.setOnClickListener(this);

        btnEng = (Button)findViewById(R.id.btnMod);
        btnEng.setOnClickListener(this);

        btnSd = (Button)findViewById(R.id.btnSd);
        btnSd.setOnClickListener(this);

        btnPlusMinus = (Button)findViewById(R.id.btnPlusMinus);
        btnPlusMinus.setOnClickListener(this);

        btnShift = (Button)findViewById(R.id.btnShift);
        btnShift.setOnClickListener(this);

        btnAlpha = (Button)findViewById(R.id.btnAlpha);
        btnAlpha.setOnClickListener(this);

        btnComma = (Button)findViewById(R.id.btnComma);
        btnComma.setOnClickListener(this);

        btnHyp = (Button)findViewById(R.id.btnHyp);
        btnHyp.setOnClickListener(this);

        btnMplus = (Button)findViewById(R.id.btnMplus);
        btnMplus.setOnClickListener(this);
    }


    public void error(){
        screenAns.setText("Math Error !");
        textAns = textMath = screenTextMath = new StringBuilder();
    }

    public void submit(String[] elementMath){
        InfixToPostfix  ITP = new InfixToPostfix();
        if (textMath.length()>0){
            try{
                if (!ITP.check_error) elementMath = ITP.processString(textMath.toString());		//	split expression to element
                if (!ITP.check_error) elementMath = ITP.postfix(elementMath);		// 	format elements to postfix
                if (!ITP.check_error) textAns = new StringBuilder(ITP.valueMath(elementMath));		// get result
                screenAns.setText(textAns);

                screenTextMath = new StringBuilder();
                textMath = new StringBuilder();
                checkSubmit = 1;

            }catch(Exception e){
                error();
            }
            if (ITP.check_error) error();
        }
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        String elementMath[] = null;


        if (id == R.id.btn0){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("0");
                screenTextMath.append("0");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btn1){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("1");
                screenTextMath.append("1");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btn2){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("2");
                screenTextMath.append("2");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }



        else if (id == R.id.btn3){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("3");
                screenTextMath.append("3");
            }

            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }



        else if (id == R.id.btn4){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("4");
                screenTextMath.append("4");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btn5){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("5");
                screenTextMath.append("5");
            }
            screenMath.setText(screenTextMath.toString());
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btn6){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("6");
                screenTextMath.append("6");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btn7){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("7");
                screenTextMath.append("7");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btn8){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("8");
                screenTextMath.append("8");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btn9){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("9");
                screenTextMath.append("9");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btnDot){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append(".");
                screenTextMath.append(".");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btnPi){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("π");
                screenTextMath.append("π");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }


        else if (id == R.id.btnAdd){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("+");
                screenTextMath.append("+");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else  if (id == R.id.btnMinus){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("-");
                screenTextMath.append("-");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btnPlusMinus){
           if(btnPlusMinus.getText()=="(-)")
           {
               if (screenTextMath.length()<48) {
                   if (checkSubmit == 1)
                   {
                       screenTextMath = new StringBuilder("");
                       textMath = new StringBuilder("");
                       checkSubmit = 0;
                   }
                   textMath.append("~");
                   screenTextMath.append("-");
               }
           }
            else if (btnPlusMinus.getText()=="A")
           {
               if (screenTextMath.length()<48) {
                   if (checkSubmit == 1)
                   {
                       screenTextMath = new StringBuilder("");
                       textMath = new StringBuilder("");
                       checkSubmit = 0;
                   }
                   textMath.append("A");
                   screenTextMath.append("A");
               }
           }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btnComma){
            if(btnComma.getText()=="\"") {
                if (screenTextMath.length() < 48) {
                    if (checkSubmit == 1) {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append(",");
                    screenTextMath.append(",");
                }
            }
                else if(btnComma.getText()=="B") {
                if (screenTextMath.length() < 48) {
                    if (checkSubmit == 1) {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("B");
                    screenTextMath.append("B");
                }
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btnHyp){
            if(btnHyp.getText()=="hyp")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("");
                    screenTextMath.append("");
                }
            }
            else if(btnHyp.getText()=="C")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("C");
                    screenTextMath.append("C");
                }
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btnSd){
           if(btnSd.getText()=="S-D")
           {
               if (screenTextMath.length()<48) {
                   if (checkSubmit == 1)
                   {
                       screenTextMath = new StringBuilder("");
                       textMath = new StringBuilder("");
                       checkSubmit = 0;
                   }
                   textMath.append("");
                   screenTextMath.append("");
               }
           }
            else if(btnSd.getText()=="Y")
           {
               if (screenTextMath.length()<48) {
                   if (checkSubmit == 1)
                   {
                       screenTextMath = new StringBuilder("");
                       textMath = new StringBuilder("");
                       checkSubmit = 0;
                   }
                   textMath.append("Y");
                   screenTextMath.append("Y");
               }
           }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btnMplus){
           if(btnMplus.getText()=="M+")
           {
               if (screenTextMath.length()<48) {
                   if (checkSubmit == 1)
                   {
                       screenTextMath = new StringBuilder("");
                       textMath = new StringBuilder("");
                       checkSubmit = 0;
                   }
                   textMath.append("");
                   screenTextMath.append("");
               }
           }
            else if(btnMplus.getText()=="M")
           {
               if (screenTextMath.length()<48) {
                   if (checkSubmit == 1)
                   {
                       screenTextMath = new StringBuilder("");
                       textMath = new StringBuilder("");
                       checkSubmit = 0;
                   }
                   textMath.append("M");
                   screenTextMath.append("M");
               }
           }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else  if (id == R.id.btnMulti){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("*");
                screenTextMath.append("*");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }



        else if (id == R.id.btnDiv){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("/");
                screenTextMath.append("/");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");

        }

        else  if (id == R.id.btnPow){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("^(");
                screenTextMath.append("^(");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else   if (id == R.id.btnSquared){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("@");
                screenTextMath.append("√");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else   if (id == R.id.btnSquire){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("#");
                screenTextMath.append("^2");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else   if (id == R.id.btnQub){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("$");
                screenTextMath.append("^3");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else   if (id == R.id.btnShift){
            if (btnnPr.getText()=="nPr") {
                btnnPr.setText("nCr");
                btnnPr.setBackground(this.getResources().getDrawable(R.drawable.blue));
                btnShift.setBackground(this.getResources().getDrawable(R.drawable.red));

            }
            else {
                btnnPr.setText("nPr");
                btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
                btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            }

            if (btnSin.getText()=="sin") {
                btnSin.setText("sin-1");
                btnSin.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
           else if (btnSin.getText()=="D") {
                btnSin.setText("sin-1");
                btnSin.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else {
                btnSin.setText("sin");
                btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            }

            if (btnCos.getText()=="cos") {
                btnCos.setText("cos-1");
                btnCos.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else if (btnCos.getText()=="E") {
                btnCos.setText("cos-1");
                btnCos.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else {
                btnCos.setText("cos");
                btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            }

            if (btnTan.getText()=="tan") {
                btnTan.setText("tan-1");
                btnTan.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else if (btnTan.getText()=="F") {
                btnTan.setText("tan-1");
                btnTan.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else {
                btnTan.setText("tan");
                btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            }

            if (btnRcl.getText()=="RCL") {
                btnRcl.setText("STO");
                btnRcl.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else {
                btnRcl.setText("RCL");
                btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            }

            if (btnClear.getText()=="AC") {
                btnClear.setText("OFF");
                btnClear.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else {
                btnClear.setText("AC");
                btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            }

            if (btnLog.getText()=="log") {
                btnLog.setText("10^");
                btnLog.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else {
                btnLog.setText("log");
                btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            }

            if (btnLn.getText()=="ln") {
                btnLn.setText("e^");
                btnLn.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else {
                btnLn.setText("ln");
                btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            }

            btnPlusMinus.setText("(-)");
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setText("\"");
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setText("hyp");
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setText(")");
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setText("S-D");
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setText("M+");
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));

        }

        else   if (id == R.id.btnAlpha){
            if (btnPlusMinus.getText()=="(-)") {
                btnPlusMinus.setText("A");
                btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.blue));
                btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.red));
            }
            else {
                btnPlusMinus.setText("(-)");
                btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
                btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            }

            if (btnComma.getText()=="\"") {
                btnComma.setText("B");
                btnComma.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else {
                btnComma.setText("\"");
                btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            }

            if (btnHyp.getText()=="hyp") {
                btnHyp.setText("C");
                btnHyp.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else {
                btnHyp.setText("hyp");
                btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            }

            if (btnSin.getText()=="sin") {
                btnSin.setText("D");
                btnSin.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else if(btnSin.getText()=="sin-1") {
                btnSin.setText("D");
                btnSin.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else {
                btnSin.setText("sin");
                btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            }

            if (btnCos.getText()=="cos") {
                btnCos.setText("E");
                btnCos.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else if(btnCos.getText()=="cos-1") {
                btnCos.setText("E");
                btnCos.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }

            else {
                btnCos.setText("cos");
                btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            }

            if (btnTan.getText()=="tan") {
                btnTan.setText("F");
                btnTan.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else if(btnTan.getText()=="tan-1") {
                btnTan.setText("F");
                btnTan.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else {
                btnTan.setText("tan");
                btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            }

            if (btnBracketsClose.getText()==")") {
                btnBracketsClose.setText("X");
                btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else {
                btnBracketsClose.setText(")");
                btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            }

            if (btnSd.getText()=="S-D") {
                btnSd.setText("Y");
                btnSd.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else
            {
                btnSd.setText("S-D");
                btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
                }

            if (btnMplus.getText()=="M+") {
                btnMplus.setText("M");
                btnMplus.setBackground(this.getResources().getDrawable(R.drawable.blue));
            }
            else {
                btnMplus.setText("M+");
                btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            }

            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setText("log");
            btnLn.setText("ln");

        }

        else  if (id == R.id.btnSin){
            if(btnSin.getText()=="sin")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("s(");
                    screenTextMath.append("sin(");
                }
                screenMath.setText(screenTextMath);
            }
            else if(btnSin.getText()=="sin-1")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("x(");
                    screenTextMath.append("sin-1(");
                }
                screenMath.setText(screenTextMath);
            }
            else if(btnSin.getText()=="D")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("D");
                    screenTextMath.append("D");
                }
                screenMath.setText(screenTextMath);
            }
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }


        else   if (id == R.id.btnCos){
            if(btnCos.getText()=="cos")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("c(");
                    screenTextMath.append("cos(");
                }
                screenMath.setText(screenTextMath);
            }

            else if(btnCos.getText()=="cos-1")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("y(");
                    screenTextMath.append("cos-1(");
                }
                screenMath.setText(screenTextMath);
            }
            else if(btnCos.getText()=="E")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("E");
                    screenTextMath.append("E");
                }
                screenMath.setText(screenTextMath);
            }
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else  if (id == R.id.btnTan){
            if(btnTan.getText()=="tan")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("t(");
                    screenTextMath.append("tan(");
                }
                screenMath.setText(screenTextMath);
            }

            else if(btnTan.getText()=="tan-1")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("z(");
                    screenTextMath.append("tan-1(");
                }
                screenMath.setText(screenTextMath);
            }

            else if(btnTan.getText()=="F")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("F");
                    screenTextMath.append("F");
                }
                screenMath.setText(screenTextMath);
            }
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else  if (id == R.id.btnLn){
            if(btnLn.getText()=="ln")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("L(");
                    screenTextMath.append("ln(");
                }
            }
            else if(btnLn.getText()=="e^")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("n(");
                    screenTextMath.append("e^(");
                }
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else  if (id == R.id.btnLog){
            if(btnLog.getText()=="log")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("l(");
                    screenTextMath.append("log(");
                }
            }
            else if(btnLog.getText()=="10^")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("m(");
                    screenTextMath.append("10^(");
                }
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else  if (id == R.id.btnFactorial){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("!");
                screenTextMath.append("!");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else  if (id == R.id.btnnPr){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }

                if(btnnPr.getText()=="nPr") {
                    textMath.append("p");
                    screenTextMath.append("P");

                }
               else if(btnnPr.getText()=="nCr") {
                    textMath.append("a");
                    screenTextMath.append("C");

                }
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btnBracketsOpen){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("");
                    checkSubmit = 0;
                }
                textMath.append("(");
                screenTextMath.append("(");
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else  if (id == R.id.btnBrackketsClose){
            if(btnBracketsClose.getText()==(")"))
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append(")");
                    screenTextMath.append(")");
                }
            }
            else if(btnBracketsClose.getText()=="X")
            {
                if (screenTextMath.length()<48) {
                    if (checkSubmit == 1)
                    {
                        screenTextMath = new StringBuilder("");
                        textMath = new StringBuilder("");
                        checkSubmit = 0;
                    }
                    textMath.append("X");
                    screenTextMath.append("X");
                }
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }


        else  if (id == R.id.btnMod){
            if (screenTextMath.length() == 0) screenTextMath = new StringBuilder("0");
            screenTextMath = new StringBuilder("(" + screenTextMath + ")%");
            screenMath.setText(screenTextMath.toString());
            if (checkSubmit == 0) submit(elementMath);
            textMath = new StringBuilder(textAns + "/100");
            submit(elementMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else    if (id == R.id.btnInverse){
            if (screenTextMath.length() == 0) screenTextMath = new StringBuilder("0");
            screenTextMath = new StringBuilder("1/(" + screenTextMath + ")");
            screenMath.setText(screenTextMath);
            if (checkSubmit == 0) submit(elementMath);
            textMath = new StringBuilder( "1/" + textAns);
            submit(elementMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btnResult){
            submit(elementMath);
            btnClear.setText("AC");
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btnCalculation){
            submit(elementMath);
            btnClear.setText("AC");
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if(id == R.id.btnClear){

               if(btnClear.getText()=="AC")
               {
                   textMath = new StringBuilder("");
                   screenTextMath = new StringBuilder("");
                   textAns = new StringBuilder("");
                   screenAns.setText(textAns);
                   screenMath.setText("");

               }
            else if(btnClear.getText()=="OFF")
               {
                   android.os.Process.killProcess(android.os.Process.myPid());
                   System.exit(1);
               }
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");


        }

        else if(id == R.id.btnOn){
            textMath = new StringBuilder("");
            screenTextMath = new StringBuilder("");
            textAns = new StringBuilder("");
            screenAns.setText(textAns);
            screenMath.setText("");
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

        else if (id == R.id.btnRcl){

            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.red));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.blue));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.blue));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.blue));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.blue));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.blue));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.blue));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.blue));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.blue));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.blue));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("A");
            btnComma.setText("B");
            btnHyp.setText("C");
            btnSin.setText("D");
            btnCos.setText("E");
            btnTan.setText("X");
            btnBracketsClose.setText("X");
            btnSd.setText("Y");
            btnMplus.setText("M");
            btnLog.setText("log");
            btnLn.setText("ln");
        }


        else if(id == R.id.btnBackSpace){
            if (screenMath.length()>0){
                char c = textMath.charAt(textMath.length()-1);
                if (textMath.length() > 1 && c == '(' && textMath.charAt(textMath.length()-2) == '^'){
                    screenTextMath = new StringBuilder(screenTextMath.substring(0,screenTextMath.length()-2));
                    textMath = new StringBuilder(textMath.substring(0,textMath.length()-2));
                }
                else if (textMath.length() > 1 && c == '(' && (textMath.charAt(textMath.length()-2) == 's' || textMath.charAt(textMath.length()-2) == 'c' || textMath.charAt(textMath.length()-2) == 't') ){
                    textMath = new StringBuilder(textMath.substring(0,textMath.length()-2));
                    screenTextMath = new StringBuilder(screenTextMath.substring(0,screenTextMath.length()-4));
                }
                else {
                    textMath = new StringBuilder(textMath.substring(0,textMath.length()-1));
                    screenTextMath = new StringBuilder(screenTextMath.substring(0,screenTextMath.length()-1));
                }
            }
            screenMath.setText(screenTextMath);
            btnShift.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnAlpha.setBackground(this.getResources().getDrawable(R.drawable.button4));
            btnnPr.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnRcl.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnClear.setBackground(this.getResources().getDrawable(R.drawable.button11));
            btnPlusMinus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnComma.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnHyp.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSin.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnCos.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnTan.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnBracketsClose.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnSd.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnMplus.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLog.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnLn.setBackground(this.getResources().getDrawable(R.drawable.button5));
            btnnPr.setText("nPr");
            btnRcl.setText("RCL");
            btnClear.setText("AC");
            btnPlusMinus.setText("(-)");
            btnComma.setText("\"");
            btnHyp.setText("hyp");
            btnSin.setText("sin");
            btnCos.setText("cos");
            btnTan.setText("tan");
            btnBracketsClose.setText(")");
            btnSd.setText("S-D");
            btnMplus.setText("M+");
            btnLog.setText("log");
            btnLn.setText("ln");
        }

    }
}

