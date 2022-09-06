package com.mose.todo.notificationtimer.data

import kotlinx.coroutines.flow.Flow

interface NotificationRepository {
    suspend fun insertNotification(notification: Notification)
    suspend fun deleteResult(notification: Notification)
    suspend fun throwToTrashcan(id: Int)
    suspend fun restoreToList(id: Int)
    suspend fun deleteFromTrashcan(id: Int)
    suspend fun deleteAllFromTrashcan()
    fun getAllNotifications(): Flow<List<Notification>>
    fun getCompletedNotifications(): Flow<List<Notification>>
    fun getNotCompletedNotifications(): Flow<List<Notification>>
}