package com.mose.todo.notificationtimer.data

import kotlinx.coroutines.flow.Flow

class NotificationRepositoryImpl(private val dao: NotificationDAO) : NotificationRepository {
    override suspend fun insertNotification(notification: Notification) {
        dao.insertNotification(notification)
    }

    override suspend fun deleteResult(notification: Notification) {
        TODO("Not yet implemented")
    }

    override suspend fun throwToTrashcan(id: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun restoreToList(id: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteFromTrashcan(id: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllFromTrashcan() {
        TODO("Not yet implemented")
    }

    override fun getAllNotifications(): Flow<List<Notification>> {
        TODO("Not yet implemented")
    }

    override fun getCompletedNotifications(): Flow<List<Notification>> {
        TODO("Not yet implemented")
    }

    override fun getNotCompletedNotifications(): Flow<List<Notification>> {
        TODO("Not yet implemented")
    }
}