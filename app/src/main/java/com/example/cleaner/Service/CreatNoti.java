package com.example.cleaner.Service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.widget.RemoteViews;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.cleaner.R;

public class CreatNoti extends Service {

    public static Notification notification;
    public static String ID = "Service";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        NotiApp(getApplicationContext());

        return null;
    }

    public static void NotiApp(Context context) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            RemoteViews notifictionlyout = new RemoteViews(context.getPackageName(), R.layout.row_noti);

            NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(context);

            NotificationChannel channel = new NotificationChannel(CreatNoti.ID,
                    "Noti", NotificationManager.IMPORTANCE_LOW);

            if (notificationManagerCompat!= null) {
                notificationManagerCompat.createNotificationChannel(channel);
            }

            notification = new NotificationCompat.Builder(context, ID)
                    .setSmallIcon(R.drawable.ic_rocket)
                    .setContentTitle(context.getString(R.string.app_name))
                    .setShowWhen(true)
                    .setOnlyAlertOnce(true)
                    .setCustomContentView(notifictionlyout)
                    .setColorized(true)
                    .setPriority(NotificationCompat.PRIORITY_LOW)
                    .setOngoing(true)
                    .build();

            notificationManagerCompat.notify(1, notification);

        }
    }
}
