package kr.hs.emirim.uuuuri.haegbook.Notification;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.Calendar;

import kr.hs.emirim.uuuuri.haegbook.Interface.NotificationTag;
import kr.hs.emirim.uuuuri.haegbook.Manager.SharedPreferenceManager;

public class AlarmReceiver {
    private Context context;
    public AlarmReceiver(Context context) {
        this.context=context;
    }
    public void Alarm() {
        AlarmManager am = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, Broadcast.class);

//        PendingIntent sender = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
//        if (sender != null){
//            am.cancel(sender);
//            sender.cancel();
//        }



        PendingIntent startSender = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);

        Calendar calendar = Calendar.getInstance();
        //알람시간 calendar에 set해주기

        SharedPreferenceManager spm = new SharedPreferenceManager((Activity) context);
        String[] startTime = spm.retrieveString(NotificationTag.START_TIME_TAG).split(":");

        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), Integer.parseInt(startTime[0]), Integer.parseInt(startTime[1]), 0);
        am.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), startSender);



        Log.e("알람이...",startTime[0]+":"+startTime[1]);

        String[] finishTime = spm.retrieveString(NotificationTag.FINISH_TIME_TAG).split(":");

        PendingIntent finishSender = PendingIntent.getBroadcast(context, 1, intent, PendingIntent.FLAG_CANCEL_CURRENT);

        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), Integer.parseInt(finishTime[0]), Integer.parseInt(finishTime[1]), 0);
        Log.e("알람이...",finishTime[0]+":"+finishTime[1]);

        am.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), finishSender);

    }
}
