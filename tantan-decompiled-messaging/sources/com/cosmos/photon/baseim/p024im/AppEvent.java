package com.cosmos.photon.baseim.p024im;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.ii5;

/* JADX INFO: loaded from: classes.dex */
public class AppEvent {
    private static volatile boolean isForeground = true;
    private static List<Long> eventListeners = new CopyOnWriteArrayList();
    private static volatile boolean isScreenListenerInited = false;

    public static void clearAllListeners() {
        eventListeners.clear();
    }

    public static void initScreenListener(Context context) {
        if (isScreenListenerInited || context == null) {
            return;
        }
        isScreenListenerInited = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        ii5.m136342l(context.getApplicationContext(), new BroadcastReceiver() { // from class: com.cosmos.photon.baseim.im.AppEvent.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_ON".equals(action)) {
                    AppEvent.onScreenOn();
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    AppEvent.onScreenOff();
                }
            }
        }, intentFilter);
    }

    private static boolean isForeground() {
        return isForeground;
    }

    private static native void nativeNotifyAppStateChange(long j, boolean z);

    private static native void nativeNotifyScreenStateChange(long j, boolean z);

    public static void onBackground() {
        isForeground = false;
        Iterator<Long> it = eventListeners.iterator();
        while (it.hasNext()) {
            nativeNotifyAppStateChange(it.next().longValue(), false);
        }
    }

    public static void onForeground() {
        isForeground = true;
        for (int size = eventListeners.size() - 1; size >= 0; size--) {
            Long l2 = eventListeners.get(size);
            if (l2 != null && l2.longValue() != 0) {
                nativeNotifyAppStateChange(l2.longValue(), true);
            }
        }
    }

    public static void onScreenOff() {
        Iterator<Long> it = eventListeners.iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (jLongValue != 0) {
                nativeNotifyScreenStateChange(jLongValue, false);
            }
        }
    }

    public static void onScreenOn() {
        Iterator<Long> it = eventListeners.iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (jLongValue != 0) {
                nativeNotifyScreenStateChange(jLongValue, true);
            }
        }
    }

    private static void registerAppEventListener(long j) {
        eventListeners.add(Long.valueOf(j));
    }

    private static void unregisterAppEventListener(long j) {
        if (eventListeners.contains(Long.valueOf(j))) {
            eventListeners.remove(Long.valueOf(j));
        }
    }
}
