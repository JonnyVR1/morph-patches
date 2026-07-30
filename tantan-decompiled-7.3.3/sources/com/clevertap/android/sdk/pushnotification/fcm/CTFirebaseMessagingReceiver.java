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
import p153l.kx3;

/* JADX INFO: loaded from: classes.dex */
public class CTFirebaseMessagingReceiver extends BroadcastReceiver implements NotificationRenderedListener {
    private static final String TAG = "CTRM";
    private CountDownTimer countDownTimer;
    private boolean isPRFinished;
    private String key = "";
    private BroadcastReceiver.PendingResult pendingResult;
    private long start;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver$a */
    public class CountDownTimerC1331a extends CountDownTimer {
        public CountDownTimerC1331a(long j, long j2) {
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
    public static /* synthetic */ void m6986a(CTFirebaseMessagingReceiver cTFirebaseMessagingReceiver, Context context, Bundle bundle) {
        cTFirebaseMessagingReceiver.getClass();
        try {
            CleverTapAPI globalInstance = CleverTapAPI.getGlobalInstance(context, PushNotificationUtil.getAccountIdFromNotificationBundle(bundle));
            if (globalInstance != null) {
                kx3.m151790k(globalInstance, "CTRM#flushQueueSync", Constants.D_SRC_PI_R, context);
            }
        } catch (Exception e) {
            Logger.m5921d(TAG, "Failed executing CTRM flushQueueSync thread.", e);
        } finally {
            cTFirebaseMessagingReceiver.finishReceiverAndCancelTimer("flush from receiver is done!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishReceiverAndCancelTimer(String str) {
        try {
            Logger.m5928v(TAG, "got a signal to kill receiver and timer because " + str);
            if (!this.key.trim().isEmpty()) {
                CleverTapAPI.m5835q0(this.key);
            }
            long jNanoTime = System.nanoTime();
            if (this.pendingResult == null || this.isPRFinished) {
                Logger.m5928v(TAG, "have already informed OS to kill receiver, can not inform again else OS will get angry :-O");
                return;
            }
            Logger.m5928v(TAG, "informing OS to kill receiver...");
            this.pendingResult.finish();
            this.isPRFinished = true;
            CountDownTimer countDownTimer = this.countDownTimer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            Logger.m5928v(TAG, "informed OS to kill receiver...");
            Logger.m5928v(TAG, "receiver was alive for " + ((jNanoTime - this.start) / 1000000000) + " seconds");
        } catch (Exception e) {
            Logger.m5921d(TAG, "Error finishing receiver and canceling timer", e);
        }
    }

    @Override // com.clevertap.android.sdk.interfaces.NotificationRenderedListener
    @SuppressLint({"RestrictedApi"})
    public void onNotificationRendered(boolean z) {
        Logger.m5928v(TAG, "push impression sent successfully by core, i should inform OS to kill receiver. my callback key is " + this.key);
        finishReceiverAndCancelTimer("push impression sent successfully by core");
    }

    @Override // android.content.BroadcastReceiver
    @SuppressLint({"RestrictedApi"})
    public void onReceive(final Context context, Intent intent) {
        RemoteMessage remoteMessage;
        final Bundle bundleMo6989a;
        this.start = System.nanoTime();
        Logger.m5920d(TAG, "received a message from Firebase");
        if (context == null || intent == null || (bundleMo6989a = new C1333b().mo6989a((remoteMessage = new RemoteMessage(intent.getExtras())))) == null) {
            return;
        }
        if (remoteMessage.getPriority() != 2) {
            Logger.m5920d(TAG, "returning from CTRM because message priority is not normal");
            return;
        }
        long j = Long.parseLong(bundleMo6989a.getString("ctrmt", "4500"));
        this.pendingResult = goAsync();
        if (!CleverTapAPI.getNotificationInfo(bundleMo6989a).fromCleverTap) {
            Logger.m5928v(TAG, "Notification payload is not from CleverTap.");
            finishReceiverAndCancelTimer("push is not from CleverTap.");
            return;
        }
        if (!Utils.isRenderFallback(remoteMessage, context)) {
            Logger.m5928v(TAG, "Notification payload does not have a fallback key.");
            finishReceiverAndCancelTimer("isRenderFallback is false");
            return;
        }
        String strM6983a = PushNotificationUtil.m6983a(PushNotificationUtil.getAccountIdFromNotificationBundle(bundleMo6989a), PushNotificationUtil.m6985c(bundleMo6989a));
        this.key = strM6983a;
        CleverTapAPI.m5832o(strM6983a, this);
        CountDownTimerC1331a countDownTimerC1331a = new CountDownTimerC1331a(j, 1000L);
        this.countDownTimer = countDownTimerC1331a;
        countDownTimerC1331a.start();
        new Thread(new Runnable() { // from class: l.wu3
            @Override // java.lang.Runnable
            public final void run() {
                CTFirebaseMessagingReceiver.m6986a(this.f190829a, context, bundleMo6989a);
            }
        }).start();
    }
}
