package com.mose.todo.notificationtimer.compose.item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mose.todo.notificationtimer.data.Notification
import com.mose.todo.notificationtimer.ui.theme.TodoNotificationTimerTheme

@Composable
fun NotificationItem(notification: Notification, modifier: Modifier = Modifier) {
    Card(
        modifier
            .padding(10.dp)
            .fillMaxWidth()
            .background(color = Color.Blue),
        elevation = 10.dp,
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Row(modifier.fillMaxSize()) {
            Column(
                modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6f)) {
                Text(text = notification.title)
            }
            Column(
                modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.4f)) {
                Text(text = notification.startDate)
                Text(text = notification.endDate)

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    val notificationData = Notification(
        id = 0,
        title = "noti-test",
        startDate = "2022-02-12",
        endDate = "2022-04-13",
        insertDate = "2022-09-05",
    )
    TodoNotificationTimerTheme {
        NotificationItem(notificationData)
    }
}