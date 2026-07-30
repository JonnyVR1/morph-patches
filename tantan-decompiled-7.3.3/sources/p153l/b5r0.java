package p153l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public class b5r0 {

    /* JADX INFO: renamed from: a */
    private static volatile Handler f75089a;

    /* JADX INFO: renamed from: b */
    private static volatile Handler f75090b;

    /* JADX INFO: renamed from: c */
    private static final Object f75091c = new Object();

    /* JADX INFO: renamed from: a */
    public static Intent m102621a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return m102622b(context, broadcastReceiver, intentFilter, null, i);
    }

    /* JADX INFO: renamed from: b */
    public static Intent m102622b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        return m102624d(context, broadcastReceiver, intentFilter, str, m102626f(), i);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m102623c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        return m102624d(context, broadcastReceiver, intentFilter, str, handler, 2);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m102624d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if (context == null || broadcastReceiver == null || intentFilter == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i) : context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    /* JADX INFO: renamed from: e */
    public static Handler m102625e() {
        if (f75090b == null) {
            synchronized (f75091c) {
                try {
                    if (f75090b == null) {
                        HandlerThread handlerThread = new HandlerThread("receiver_task");
                        handlerThread.start();
                        f75090b = new Handler(handlerThread.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f75090b;
    }

    /* JADX INFO: renamed from: f */
    private static Handler m102626f() {
        if (f75089a == null) {
            synchronized (b5r0.class) {
                try {
                    if (f75089a == null) {
                        HandlerThread handlerThread = new HandlerThread("handle_receiver");
                        handlerThread.start();
                        f75089a = new Handler(handlerThread.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f75089a;
    }
}
