package org.secuso.privacyfriendlytodolist.view.dialog;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TimePicker;

import org.secuso.privacyfriendlytodolist.R;

//import java.
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;


public class RepeatDialog extends FullScreenDialog {

    private RepeatCallback callback;

    public RepeatDialog(Context context, long reminderTime, long deadline) {
        super(context, R.layout.repeat_dialog);

        Button buttonDate = (Button) findViewById(R.id.bt_repeat_never);
        buttonDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // LinearLayout layoutDate = (LinearLayout)findViewById(R.id.ll_reminder_date);
                //layoutDate.setVisibility(View.VISIBLE);
                //LinearLayout layoutTime = (LinearLayout)findViewById(R.id.ll_reminder_time);
               // layoutTime.setVisibility(View.GONE);
            }
        });

        Button buttonDay = (Button) findViewById(R.id.bt_repeat_everyday);
        buttonDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicker datePicker = (DatePicker) findViewById(R.id.dp_reminder);
                TimePicker timePicker = (TimePicker) findViewById(R.id.tp_reminder);
                Calendar calendar = new GregorianCalendar(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), timePicker.getCurrentHour(), timePicker.getCurrentMinute());

                callback.setRepeat(-1);

                dismiss();
            }
        });

        Button buttonWeek = (Button) findViewById(R.id.bt_repeat_everyweek);
        buttonWeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicker datePicker = (DatePicker) findViewById(R.id.dp_reminder);
                TimePicker timePicker = (TimePicker) findViewById(R.id.tp_reminder);
                Calendar calendar = new GregorianCalendar(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), timePicker.getCurrentHour(), timePicker.getCurrentMinute());

                //callback.setReminder(TimeUnit.MILLISECONDS.toSeconds(calendar.getTimeInMillis()));

                dismiss();
            }
        });

        Button buttonMonth = (Button) findViewById(R.id.bt_repeat_everymonth);
        buttonMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicker datePicker = (DatePicker) findViewById(R.id.dp_reminder);
                TimePicker timePicker = (TimePicker) findViewById(R.id.tp_reminder);
                Calendar calendar = new GregorianCalendar(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), timePicker.getCurrentHour(), timePicker.getCurrentMinute());

                //callback.setReminder(TimeUnit.MILLISECONDS.toSeconds(calendar.getTimeInMillis()));

                dismiss();
            }
        });

        Button buttonYear = (Button) findViewById(R.id.bt_repeat_everyyear);
        buttonYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicker datePicker = (DatePicker) findViewById(R.id.dp_reminder);
                TimePicker timePicker = (TimePicker) findViewById(R.id.tp_reminder);
                Calendar calendar = new GregorianCalendar(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), timePicker.getCurrentHour(), timePicker.getCurrentMinute());

                //callback.setReminder(TimeUnit.MILLISECONDS.toSeconds(calendar.getTimeInMillis()));

                dismiss();
            }
        });

        Button buttonNoReminder = (Button) findViewById(R.id.bt_repeat_never);
        buttonNoReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.removeRepeat();
                dismiss();
            }
        });
    }


    public interface RepeatCallback {
        void setRepeat(long deadline);
        void removeRepeat();
    }

    public void setCallback(RepeatCallback callback) {
        this.callback = callback;
    }

}
