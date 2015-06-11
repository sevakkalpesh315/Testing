package com.calculatorroboelectric;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import com.calculatorroboelectric.MainActivity;
import com.calculatorroboelectric.R;

@RunWith(RobolectricTestRunner.class)
public class MyActivityTest {

	double num1 = 10, num2 = 20, result = 30;

	@Test
	public void addNumber() throws Exception {

		Activity activity = Robolectric.buildActivity(MainActivity.class)
				.create().get();

		Button btnZero = (Button) activity.findViewById(R.id.digit0);
		Button btnOne = (Button) activity.findViewById(R.id.digit1);
		Button btnTwo = (Button) activity.findViewById(R.id.digit2);

		Button add = (Button) activity.findViewById(R.id.plus);
		Button equal = (Button) activity.findViewById(R.id.equalBtn);

		EditText ans = (EditText) activity.findViewById(R.id.numberField);

		btnOne.performClick();
		btnZero.performClick();

		add.performClick();

		btnTwo.performClick();
		btnZero.performClick();

		equal.performClick();

		String resultText = ans.getText().toString();

		assertThat(Double.parseDouble(resultText), equalTo(result));
	}
}