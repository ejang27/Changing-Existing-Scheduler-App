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


        Button buttonDay = (Button) findViewById(R.id.bt_repeat_everyday);
        buttonDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.setEveryday();
                dismiss();
            }
        });

        Button buttonWeek = (Button) findViewById(R.id.bt_repeat_everyweek);
        buttonWeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.setEveryWeek();

                dismiss();
            }
        });

        Button buttonMonth = (Button) findViewById(R.id.bt_repeat_everymonth);
        buttonMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callback.setEveryMonth();

                dismiss();
            }
        });

        Button buttonYear = (Button) findViewById(R.id.bt_repeat_everyyear);
        buttonYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.setEveryYear();

                dismiss();
            }
        });

        Button buttonNoRepeat = (Button) findViewById(R.id.bt_repeat_never);
        buttonNoRepeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.removeRepeat();
                dismiss();
            }
        });
    }


    public interface RepeatCallback {
        void setEveryday();
        void setEveryWeek();
        void setEveryMonth();
        void setEveryYear();
        void removeRepeat();
    }

    public void setCallback(RepeatCallback callback) {
        this.callback = callback;
    }

}
