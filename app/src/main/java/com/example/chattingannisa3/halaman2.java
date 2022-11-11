package com.example.chattingannisa3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class halaman2 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "MESSAGE";
    public static final int TEXT_REQUEST = 1;
    private EditText editText;
    private TextView textViewMessage, penerima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        editText = findViewById(R.id.editText);
        textViewMessage = findViewById(R.id.text_message);

        penerima = findViewById(R.id.penerima);
        Intent intent = getIntent();
        String kontak = intent.getStringExtra(MainActivity.KONTAK);
        penerima.setText(kontak);
    }

    public void openSecondActivity(View view) {
        Intent intent = new Intent(halaman2.this, halaman3.class);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);


    }

    protected void onActivityResult(int requestCode, int resultCode,
                                    @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST && resultCode == RESULT_OK) {
            String reply = data.getStringExtra(halaman3.EXTRA_REPLY);
            textViewMessage.setText(reply);
        }
    }
}

