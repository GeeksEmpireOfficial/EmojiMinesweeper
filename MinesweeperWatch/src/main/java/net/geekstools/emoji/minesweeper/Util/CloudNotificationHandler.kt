package net.geekstools.emoji.minesweeper.Util

import android.util.Log

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

import net.geekstools.emoji.minesweeper.BuildConfig

class CloudNotificationHandler : FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        if (!BuildConfig.DEBUG) {
            Log.d(">>> ", "From: " + remoteMessage!!.from!!)
            Log.d(">>> ", "Notification Message Body: " + remoteMessage.notification!!.body!!)
        }
    }
}
