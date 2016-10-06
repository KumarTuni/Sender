package com.rohin.sender;



import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
  Button Sender;
  EditText inputS;
  TextView outputS;
  String s ;
 	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
		Sender = (Button) findViewById(R.id.btn_Sender);
		inputS = (EditText) findViewById(R.id.edt_text);
		outputS= (TextView) findViewById(R.id.txt_output);
		
		
		
	    buttonSender();
	}
	private void buttonSender() {
		// TODO Auto-generated method stub
		
		Sender.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View v) {
				Intent inent = new Intent("com.rohin.receiver.AnotherActivity");
				s = inputS.getText().toString();
		        inent.putExtra("showtext", s);
		        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.pdf);
		        inent.putExtra("Bitmap", bitmap);
		        inent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
		        startActivity(inent);
		       
			}
		});
		
	}
}
