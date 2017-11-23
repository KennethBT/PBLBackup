package com.example.hp.soteria; /**
 * Created by HP on 11/24/2017.
 */
import com.example.hp.soteria.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SMSActivity extends Activity{

    Button buttonText;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonText = (Button) findViewById(R.id.buttonText);

        buttonText.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                try {



                    //Sending the SMS
                    SmsManager smsManager = SmsManager.getDefault();
                    //09083935149 is a placeholder at the moment
                    smsManager.sendTextMessage("09083935149", null, "TEST MESSAGE", null, null);
                    Toast.makeText(getApplicationContext(), "SMS Sent!",
                            Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                            "SMS failed. Try again later.",
                            Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
    }
}
