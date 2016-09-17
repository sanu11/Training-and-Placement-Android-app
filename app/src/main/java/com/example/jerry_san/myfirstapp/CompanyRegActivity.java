package com.example.jerry_san.myfirstapp;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class CompanyRegActivity extends AppCompatActivity {


    int hour, min;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_reg);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private static String pad(int c) {
        if (c >= 10)
            return String.valueOf(c);
        else
            return "0" + String.valueOf(c);
    }

    public void onClickDate(View view)
    {
        final View vv = view;
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            // when dialog box is closed, below method will be called.
            public void onDateSet(DatePicker v, int selectedYear, int selectedMonth, int selectedDay) {
                String year1 = String.valueOf(selectedYear);
                String month1 = String.valueOf(selectedMonth + 1);
                String day1 = String.valueOf(selectedDay);

                TextView tv;

                if (vv.getId() == R.id.start_date) {
                    tv = (TextView) findViewById(R.id.start_date);
                    tv.setText(day1 + "/" + month1 + "/" + year1);
                }

                else if (vv.getId() == R.id.end_date) {
                    tv = (TextView) findViewById(R.id.end_date);
                    tv.setText(day1 + "/" + month1 + "/" + year1);
                }

                else if(vv.getId()==R.id.ppt_date) {
                    tv = (TextView) findViewById(R. id.ppt_date);
                    tv.setText(day1 + "/" + month1 + "/" + year1);
                }

                else if(vv.getId()==R.id.apti_date)  {
                    tv = (TextView) findViewById(R.id.apti_date);
                    tv.setText(day1 + "/" + month1 + "/" + year1);
                }

                else if(vv.getId()==R.id.interview_date) {
                    tv = (TextView) findViewById(R.id.interview_date);
                    tv.setText(day1 + "/" + month1 + "/" + year1);
                }

            }

        },2016,9,10);

            datePickerDialog.show();

    }

    public void onClickTime(View view) {

        final View vv = view;
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
        TextView tv;

            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                hour = hourOfDay;
                min = minute;

                if (vv.getId() == R.id.start_time) {
                    tv = (TextView) findViewById(R.id.start_time);
                    tv.setText(new StringBuilder()
                            .append(pad(hour)).append(":")
                            .append(pad(min)));
                }
                else if (vv.getId() == R.id.end_time) {
                    tv = (TextView) findViewById(R.id.end_time);
                    tv.setText(new StringBuilder()
                            .append(pad(hour)).append(":")
                            .append(pad(min)));
                }

                else if (vv.getId() == R.id.ppt_time) {
                    tv = (TextView) findViewById(R.id.ppt_time);
                    tv.setText(new StringBuilder()
                            .append(pad(hour)).append(":")
                            .append(pad(min)));
                }

                else if (vv.getId() == R.id.apti_time) {
                    tv = (TextView) findViewById(R.id.apti_time);
                    tv.setText(new StringBuilder()
                            .append(pad(hour)).append(":")
                            .append(pad(min)));
                }

                else if (vv.getId() == R.id.interview_time) {
                    tv = (TextView) findViewById(R.id.interview_time);
                    tv.setText(new StringBuilder()
                            .append(pad(hour)).append(":")
                            .append(pad(min)));
                }

            }
        }, 10, 00, false);

    timePickerDialog.show();

    }

    public void Reg_company(View v) {

        EditText e1 = (EditText) findViewById(R.id.name);
        EditText e2 = (EditText) findViewById(R.id.criteria);
        EditText e3 = (EditText) findViewById(R.id.salary);

        String name = e1.getText().toString();
        float critera = Float.parseFloat(e2.getText().toString());
        float salary = Float.parseFloat(e3.getText().toString());

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Company Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.jerry_san.myfirstapp/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Company Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.jerry_san.myfirstapp/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
