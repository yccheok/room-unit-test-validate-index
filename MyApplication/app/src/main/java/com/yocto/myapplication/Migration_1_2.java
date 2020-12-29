package com.yocto.myapplication;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

public class Migration_1_2 extends Migration {
    public Migration_1_2() {
        super(1, 2);
    }

    @Override
    public void migrate(@NonNull SupportSQLiteDatabase database) {
        // We forget to include index creation code for user's first_name. The unit test suppose to
        // fail. But it is not. Why?


        // Uncomment the following line, to confirm Room unit test is checking for table schema.
        //database.execSQL("DROP TABLE user");
    }
}
