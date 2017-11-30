package com.example.codetribe.petss;

import android.provider.BaseColumns;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.StaticLayout;

public class MainActivity extends AppCompatActivity {
    public final static String TABLE_NAME="PETS";

    public final static String _ID= BaseColumns._ID;
    public final static String column_pet_name="name";
    public final static String column_pet_gender="gender";
    public final static String column_pet_breed="breed";
    public final static String column_pet_weight="weight";

    public static final int gender_unknown=0;
    public static final int gender_male=1;
    public static final int getGender_female=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
