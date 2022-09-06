package com.mose.todo.notificationtimer.data

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Room

@Database(entities = [Notification::class], version = 1)
abstract class NotificationDatabase : RoomDatabase() {
    abstract val  notificationDAO: NotificationDAO

    companion object {
        @Volatile
        private var INSTANCE: NotificationDatabase? = null
        fun getInstance(context: Context): NotificationDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        NotificationDatabase::class.java,
                        "notification_database"
                    ).build()
                }
                return instance
            }
        }
    }
}