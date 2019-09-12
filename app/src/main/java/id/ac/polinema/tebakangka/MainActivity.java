package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	private EditText input;
	private int aww;
	Random rand = new Random();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		input = findViewById(R.id.number_input);
	}

	// TODO: generate angka random di sini
	private int initRandomNumber() {
		int n = rand.nextInt(100) + 1;
		aww = n;
		return n;
	}

	public void handleGuess(View view) {
		int angka = Integer.parseInt(input.getText().toString());
		if(angka > aww) {
			Toast.makeText(this, "Tebakan anda terlalu besar !", Toast.LENGTH_SHORT).show();
		} else if(angka < aww) {
			Toast.makeText(this, "Tebakan anda terlalu kecil !", Toast.LENGTH_SHORT).show();
		} else if (angka == aww) {
			Toast.makeText(this, "Tebakan anda benar !", Toast.LENGTH_SHORT).show();
			initRandomNumber();
		}
	}

	public void handleReset(View view) {
		input.getText().clear();
	}
}
