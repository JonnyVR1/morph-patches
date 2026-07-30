package com.immomo.mmdns;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p149l.ig3;

/* JADX INFO: loaded from: classes7.dex */
public class MomoMainThreadExecutor {
    private static Handler handler;

    public static void cancelAllRunnables(Object obj) {
        if (obj == null) {
            ig3.m135964a("tag is null");
            return;
        }
        if ((obj instanceof Number) || (obj instanceof CharSequence)) {
            obj = obj.toString().intern();
        }
        getHandler().removeCallbacksAndMessages(obj);
    }

    private static Handler getHandler() {
        if (handler == null) {
            synchronized (MomoMainThreadExecutor.class) {
                try {
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return handler;
    }

    public static void post(Runnable runnable) {
        if (runnable != null) {
            getHandler().post(runnable);
        } else {
            ig3.m135964a("runnable is null");
        }
    }

    public static void postDelayed(Object obj, Runnable runnable, long j) {
        if (obj == null) {
            ig3.m135964a("tag is null");
            return;
        }
        if (runnable == null) {
            ig3.m135964a("runnable is null");
            return;
        }
        if (j <= 0) {
            ig3.m135964a("delayMill <= 0");
            return;
        }
        if ((obj instanceof Number) || (obj instanceof CharSequence)) {
            obj = obj.toString().intern();
        }
        Message messageObtain = Message.obtain(getHandler(), runnable);
        messageObtain.obj = obj;
        getHandler().sendMessageDelayed(messageObtain, j);
    }
}
