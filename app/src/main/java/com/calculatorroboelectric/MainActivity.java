package com.calculatorroboelectric;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	Button btnDot, btnEqual;
	Button btnPlus, btnMinus, btnDivide, btnMultiply;
	Button btnReset;
	EditText numberFieldTxt = null;
	char currentOperator = '+';

	double tempValue = 0, result = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initialize();

		setNumbersEvent();
		setOperatorsEvent();

	}

	private void initialize() {
		btn0 = (Button) this.findViewById(R.id.digit0);
		btn1 = (Button) this.findViewById(R.id.digit1);
		btn2 = (Button) this.findViewById(R.id.digit2);
		btn3 = (Button) this.findViewById(R.id.digit3);
		btn4 = (Button) this.findViewById(R.id.digit4);
		btn5 = (Button) this.findViewById(R.id.digit5);
		btn6 = (Button) this.findViewById(R.id.digit6);
		btn7 = (Button) this.findViewById(R.id.digit7);
		btn8 = (Button) this.findViewById(R.id.digit8);
		btn9 = (Button) this.findViewById(R.id.digit9);

		btnDot = (Button) this.findViewById(R.id.dot);
		btnEqual = (Button) this.findViewById(R.id.equalBtn);
		btnReset = (Button) this.findViewById(R.id.reset);

		btnPlus = (Button) this.findViewById(R.id.plus);
		btnMinus = (Button) this.findViewById(R.id.minus);
		btnDivide = (Button) this.findViewById(R.id.divide);
		btnMultiply = (Button) this.findViewById(R.id.multiply);

		numberFieldTxt = (EditText) this.findViewById(R.id.numberField);
		numberFieldTxt.setEnabled(false);

	}

	private void setNumbersEvent() {
		btn0.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() <= 9)
					numberFieldTxt.setText(numberFieldTxt.getText().toString()
							+ "0");
			}
		});
		btn1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() <= 9)
					numberFieldTxt.setText(numberFieldTxt.getText().toString()
							+ "1");
			}
		});
		btn2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() <= 9)
					numberFieldTxt.setText(numberFieldTxt.getText().toString()
							+ "2");
			}
		});
		btn3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() <= 9)
					numberFieldTxt.setText(numberFieldTxt.getText().toString()
							+ "3");
			}
		});
		btn4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() <= 9)
					numberFieldTxt.setText(numberFieldTxt.getText().toString()
							+ "4");
			}
		});
		btn5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() <= 9)
					numberFieldTxt.setText(numberFieldTxt.getText().toString()
							+ "5");
			}
		});
		btn6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() <= 9)
					numberFieldTxt.setText(numberFieldTxt.getText().toString()
							+ "6");
			}
		});
		btn7.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() <= 9)
					numberFieldTxt.setText(numberFieldTxt.getText().toString()
							+ "7");
			}
		});
		btn8.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() <= 9)
					numberFieldTxt.setText(numberFieldTxt.getText().toString()
							+ "8");
			}
		});
		btn9.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() <= 9)
					numberFieldTxt.setText(numberFieldTxt.getText().toString()
							+ "9");
			}
		});
		btnDot.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() <= 9)
					numberFieldTxt.setText(numberFieldTxt.getText().toString()
							+ ".");
			}
		});
		btnReset.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				numberFieldTxt.setText("");
				tempValue = 0;
				result = 0;
			}
		});
	}

	private void setOperatorsEvent() {

		btnEqual.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() != 0) {
					if (currentOperator == '+') {
						result = tempValue
								+ Double.parseDouble(numberFieldTxt.getText()
										.toString());
						numberFieldTxt.setText(result + "");
						tempValue = 0;
					} else if (currentOperator == '-') {
						result = tempValue
								- Double.parseDouble(numberFieldTxt.getText()
										.toString());
						numberFieldTxt.setText(result + "");
						tempValue = 0;
					} else if (currentOperator == '/') {
						result = tempValue
								/ Double.parseDouble(numberFieldTxt.getText()
										.toString());
						numberFieldTxt.setText(result + "");
						tempValue = 0;
					} else if (currentOperator == '*') {
						result = tempValue
								* Double.parseDouble(numberFieldTxt.getText()
										.toString());
						numberFieldTxt.setText(result + "");
						tempValue = 0;
					}
				}
			}
		});

		btnPlus.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() != 0) {
					tempValue = Double.parseDouble(numberFieldTxt.getText()
							.toString());
					numberFieldTxt.setText("");
					currentOperator = '+';
				}
			}
		});

		btnMinus.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() != 0) {
					tempValue = Double.parseDouble(numberFieldTxt.getText()
							.toString());
					numberFieldTxt.setText("");
					currentOperator = '-';
				}
			}
		});

		btnDivide.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() != 0) {
					tempValue = Double.parseDouble(numberFieldTxt.getText()
							.toString());
					numberFieldTxt.setText("");
					currentOperator = '/';
				}
			}
		});

		btnMultiply.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (numberFieldTxt.getText().length() != 0) {
					tempValue = Double.parseDouble(numberFieldTxt.getText()
							.toString());
					numberFieldTxt.setText("");
					currentOperator = '*';
				}
			}
		});
	}
}
