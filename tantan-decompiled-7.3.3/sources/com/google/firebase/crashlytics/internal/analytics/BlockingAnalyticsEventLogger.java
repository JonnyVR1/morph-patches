package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class BlockingAnalyticsEventLogger implements AnalyticsEventReceiver, AnalyticsEventLogger {
    static final String APP_EXCEPTION_EVENT_NAME = "_ae";
    private final CrashlyticsOriginAnalyticsEventLogger baseAnalyticsEventLogger;
    private CountDownLatch eventLatch;
    private final TimeUnit timeUnit;
    private final int timeout;
    private final Object latchLock = new Object();
    private boolean callbackReceived = false;

    public BlockingAnalyticsEventLogger(@NonNull CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger, int i, TimeUnit timeUnit) {
        this.baseAnalyticsEventLogger = crashlyticsOriginAnalyticsEventLogger;
        this.timeout = i;
        this.timeUnit = timeUnit;
    }

    public boolean isCallbackReceived() {
        return this.callbackReceived;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(@NonNull String str, @Nullable Bundle bundle) {
        synchronized (this.latchLock) {
            try {
                Logger.getLogger().m16782v("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.eventLatch = new CountDownLatch(1);
                this.callbackReceived = false;
                this.baseAnalyticsEventLogger.logEvent(str, bundle);
                Logger.getLogger().m16782v("Awaiting app exception callback from Analytics...");
                try {
                    if (this.eventLatch.await(this.timeout, this.timeUnit)) {
                        this.callbackReceived = true;
                        Logger.getLogger().m16782v("App exception callback received from Analytics listener.");
                    } else {
                        Logger.getLogger().m16784w("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    Logger.getLogger().m16778e("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.eventLatch = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.eventLatch;
        if (countDownLatch != null && APP_EXCEPTION_EVENT_NAME.equals(str)) {
            countDownLatch.countDown();
        }
    }
}
