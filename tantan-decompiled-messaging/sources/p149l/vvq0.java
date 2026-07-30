package p149l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public class vvq0 {

    /* JADX INFO: renamed from: a */
    private static volatile Handler f183249a;

    /* JADX INFO: renamed from: b */
    private static volatile Handler f183250b;

    /* JADX INFO: renamed from: c */
    private static final Object f183251c = new Object();

    /* JADX INFO: renamed from: a */
    public static Intent m200199a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return m200200b(context, broadcastReceiver, intentFilter, null, i);
    }

    /* JADX INFO: renamed from: b */
    public static Intent m200200b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        return m200202d(context, broadcastReceiver, intentFilter, str, m200204f(), i);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m200201c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        return m200202d(context, broadcastReceiver, intentFilter, str, handler, 2);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m200202d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if (context == null || broadcastReceiver == null || intentFilter == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i) : context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    /* JADX INFO: renamed from: e */
    public static Handler m200203e() {
        if (f183250b == null) {
            synchronized (f183251c) {
                try {
                    if (f183250b == null) {
                        HandlerThread handlerThread = new HandlerThread("receiver_task");
                        handlerThread.start();
                        f183250b = new Handler(handlerThread.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f183250b;
    }

    /* JADX INFO: renamed from: f */
    private static Handler m200204f() {
        if (f183249a == null) {
            synchronized (vvq0.class) {
                try {
                    if (f183249a == null) {
                        HandlerThread handlerThread = new HandlerThread("handle_receiver");
                        handlerThread.start();
                        f183249a = new Handler(handlerThread.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f183249a;
    }
}
