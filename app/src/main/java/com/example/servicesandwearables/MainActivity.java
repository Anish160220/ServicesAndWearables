package com.example.servicesandwearables;

import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnDisplayNotification1, getBtnDisplayNotification2;
    NotificationManagerCompat notificationManagerCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDisplayNotification1 = findViewById(R.id.btnDisplayNotification1);
        getBtnDisplayNotification2 = findViewById(R.id.btnDisplayNotification2);

        notificationManagerCompat = NotificationManagerCompat.from(this);

        btnDisplayNotification1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManager1();
            }
        });

        getBtnDisplayNotification2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManager2();
            }
        });
    }

    private void NotificationManager1() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this,"Channel1")
                .setSmallIcon(R.drawable.ic_message_black_24dp)
                .setContentTitle("First Message")
                .setContentText("This is First Message")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);

        notificationManagerCompat.notify(1,builder.build());

    }

    private void NotificationManager2() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this,"Channel2")
                .setSmallIcon(R.drawable.ic_message_black_24dp)
                .setContentTitle("Second Message")
                .setContentText("This is Second Message")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);

        notificationManagerCompat.notify(2,builder.build());
    }


}