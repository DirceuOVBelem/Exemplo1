package dirceubelem.exemplo1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnC;
    private Button btnMaisMenos;
    private Button btnPercentual;
    private Button btnDivisao;
    private Button btnMultiplicacao;
    private Button btnSoma;
    private Button btnSubtracao;
    private Button btnPonto;
    private Button btnIgual;
    private TextView txtResultado;

    private boolean ponto = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnC = (Button) findViewById(R.id.btnC);
        btnMaisMenos = (Button) findViewById(R.id.btnMaisMenos);
        btnPercentual = (Button) findViewById(R.id.btnPercentual);
        btnDivisao = (Button) findViewById(R.id.btnDivisao);
        btnMultiplicacao = (Button) findViewById(R.id.btnMultiplicacao);
        btnSoma = (Button) findViewById(R.id.btnSoma);
        btnSubtracao = (Button) findViewById(R.id.btnSubtracao);
        btnPonto = (Button) findViewById(R.id.btnPonto);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnMaisMenos.setOnClickListener(this);
        btnPercentual.setOnClickListener(this);
        btnDivisao.setOnClickListener(this);
        btnMultiplicacao.setOnClickListener(this);
        btnSoma.setOnClickListener(this);
        btnSubtracao.setOnClickListener(this);
        btnPonto.setOnClickListener(this);
        btnIgual.setOnClickListener(this);
        txtResultado.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        String valor = txtResultado.getText().toString();

        switch (v.getId()) {
            case R.id.btn1:
            case R.id.btn2:
            case R.id.btn3:
            case R.id.btn4:
            case R.id.btn5:
            case R.id.btn6:
            case R.id.btn7:
            case R.id.btn8:
            case R.id.btn9:
            case R.id.btn0:
                Button b = (Button) v;
                valor += b.getText().toString();
                break;
        }

        if (!ponto) {
            valor = valor.replaceAll(".0", "");
        }

        Double vd = Double.parseDouble(valor);

        if (!ponto) {
            valor = vd.toString().replaceAll(".0", "");
        }else{
            valor = vd.toString();
        }

        txtResultado.setText(valor);

    }
}
