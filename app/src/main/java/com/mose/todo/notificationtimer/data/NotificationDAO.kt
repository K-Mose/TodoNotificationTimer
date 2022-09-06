package com.mose.todo.notificationtimer.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface NotificationDAO {
    @Insert
    suspend fun insertNotification(notification: Notification)

    @Delete
    suspend fun deleteResult(notification: Notification)

    @Query("UPDATE tb_notification SET is_deleted = 'Y' WHERE id = :id ")
    suspend fun throwToTrashcan(id: Int)

    @Query("UPDATE tb_notification SET is_deleted = 'N' WHERE id = :id ")
    suspend fun restoreToList(id: Int)

    @Query("DELETE FROM tb_notification WHERE is_deleted = 'Y' and id = :id")
    suspend fun deleteFromTrashcan(id: Int)

    @Query("DELETE FROM tb_notification WHERE is_deleted = 'Y'")
    suspend fun deleteAllFromTrashcan()

    @Query("SELECT * FROM tb_notification WHERE is_deleted = 'N'")
    fun getAllNotifications(): Flow<List<Notification>>

    @Query("SELECT * FROM tb_notification WHERE is_deleted = 'N' AND is_completed = 'Y'")
    fun getCompletedNotifications(): Flow<List<Notification>>

    @Query("SELECT * FROM tb_notification WHERE is_deleted = 'N' AND is_completed = 'N'")
    fun getNotCompletedNotifications(): Flow<List<Notification>>

}
