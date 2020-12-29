package com.yocto.myapplication;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(
        entities = {
                User.class
        },
        version = 2
)
public abstract class WeNoteRoomDatabase extends RoomDatabase {
    private volatile static WeNoteRoomDatabase INSTANCE;

    private static final String NAME = "wenote";

    public static WeNoteRoomDatabase instance(Context context) {
        if (INSTANCE == null) {
            synchronized (WeNoteRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                            context,
                            WeNoteRoomDatabase.class,
                            NAME
                    )
                            .addMigrations(new Migration_1_2())
                            .build();
                }
            }
        }

        return INSTANCE;
    }
}
