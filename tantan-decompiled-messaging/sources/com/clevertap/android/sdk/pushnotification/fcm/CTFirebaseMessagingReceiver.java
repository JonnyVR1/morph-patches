package com.clevertap.android.sdk.pushnotification.fcm;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.interfaces.NotificationRenderedListener;
import com.clevertap.android.sdk.pushnotification.PushNotificationUtil;
import com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver;
import com.google.firebase.messaging.RemoteMessage;
import p149l.lw3;

/* JADX INFO: loaded from: classes.dex */
public class CTFirebaseMessagingReceiver extends BroadcastReceiver implements NotificationRenderedListener {
    private static final String TAG = "CTRM";
    private CountDownTimer countDownTimer;
    private boolean isPRFinished;
    private String key = "";
    private BroadcastReceiver.PendingResult pendingResult;
    private long start;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver$a */
    public class CountDownTimerC1308a extends CountDownTimer {
        public CountDownTimerC1308a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CTFirebaseMessagingReceiver.this.finishReceiverAndCancelTimer("receiver life time is expired");
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6932a(CTFirebaseMessagingReceiver cTFirebaseMessagingReceiver, Context context, Bundle bundle) {
        cTFirebaseMessagingReceiver.getClass();
        try {
            CleverTapAPI globalInstance = CleverTapAPI.getGlobalInstance(context, PushNotificationUtil.getAccountIdFromNotificationBundle(bundle));
            if (globalInstance != null) {
                lw3.m151941k(globalInstance, "CTRM#flushQueueSync", Constants.D_SRC_PI_R, context);
            }
        } catch (Exception e) {
            Logger.m5867d(TAG, "Failed executing CTRM flushQueueSync thread.", e);
        } finally {
            cTFirebaseMessagingReceiver.finishReceiverAndCancelTimer("flush from receiver is done!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishReceiverAndCancelTimer(String str) {
        try {
            Logger.m5874v(TAG, "got a signal to kill receiver and timer because " + str);
            if (!this.key.trim().isEmpty()) {
                CleverTapAPI.m5781q0(this.key);
            }
            long jNanoTime = System.nanoTime();
            if (this.pendingResult == null || this.isPRFinished) {
                Logger.m5874v(TAG, "have already informed OS to kill receiver, can not inform again else OS will get angry :-O");
                return;
            }
            Logger.m5874v(TAG, "informing OS to kill receiver...");
            this.pendingResult.finish();
            this.isPRFinished = true;
            CountDownTimer countDownTimer = this.countDownTimer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            Logger.m5874v(TAG, "informed OS to kill receiver...");
            Logger.m5874v(TAG, "receiver was alive for " + ((jNanoTime - this.start) / 1000000000) + " seconds");
        } catch (Exception e) {
            Logger.m5867d(TAG, "Error finishing receiver and canceling timer", e);
        }
    }

    @Override // com.clevertap.android.sdk.interfaces.NotificationRenderedListener
    @SuppressLint({"RestrictedApi"})
    public void onNotificationRendered(boolean z) {
        Logger.m5874v(TAG, "push impression sent successfully by core, i should inform OS to kill receiver. my callback key is " + this.key);
        finishReceiverAndCancelTimer("push impression sent successfully by core");
    }

    @Override // android.content.BroadcastReceiver
    @SuppressLint({"RestrictedApi"})
    public void onReceive(final Context context, Intent intent) {
        RemoteMessage remoteMessage;
        final Bundle bundleMo6935a;
        this.start = System.nanoTime();
        Logger.m5866d(TAG, "received a message from Firebase");
        if (context == null || intent == null || (bundleMo6935a = new C1310b().mo6935a((remoteMessage = new RemoteMessage(intent.getExtras())))) == null) {
            return;
        }
        if (remoteMessage.getPriority() != 2) {
            Logger.m5866d(TAG, "returning from CTRM because message priority is not normal");
            return;
        }
        long j = Long.parseLong(bundleMo6935a.getString("ctrmt", "4500"));
        this.pendingResult = goAsync();
        if (!CleverTapAPI.getNotificationInfo(bundleMo6935a).fromCleverTap) {
            Logger.m5874v(TAG, "Notification payload is not from CleverTap.");
            finishReceiverAndCancelTimer("push is not from CleverTap.");
            return;
        }
        if (!Utils.isRenderFallback(remoteMessage, context)) {
            Logger.m5874v(TAG, "Notification payload does not have a fallback key.");
            finishReceiverAndCancelTimer("isRenderFallback is false");
            return;
        }
        String strM6929a = PushNotificationUtil.m6929a(PushNotificationUtil.getAccountIdFromNotificationBundle(bundleMo6935a), PushNotificationUtil.m6931c(bundleMo6935a));
        this.key = strM6929a;
        CleverTapAPI.m5778o(strM6929a, this);
        CountDownTimerC1308a countDownTimerC1308a = new CountDownTimerC1308a(j, 1000L);
        this.countDownTimer = countDownTimerC1308a;
        countDownTimerC1308a.start();
        new Thread(new Runnable() { // from class: l.xt3
            @Override // java.lang.Runnable
            public final void run() {
                CTFirebaseMessagingReceiver.m6932a(this.f194348a, context, bundleMo6935a);
            }
        }).start();
    }
}
