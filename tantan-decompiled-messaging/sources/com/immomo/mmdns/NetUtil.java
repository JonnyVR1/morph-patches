package com.immomo.mmdns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.ii5;

/* JADX INFO: loaded from: classes7.dex */
public class NetUtil {
    private static final String TAG = "NetUtil";
    public static Context context;
    private static long lastTime;
    private static List<Long> receiverList = Collections.synchronizedList(new ArrayList());
    private static BroadcastReceiver netChangeBroadcastReceiver = new BroadcastReceiver() { // from class: com.immomo.mmdns.NetUtil.1
        /* JADX INFO: Access modifiers changed from: private */
        public void onNetworkChange() {
            try {
                for (int size = NetUtil.receiverList.size() - 1; size >= 0; size--) {
                    MDLog.m7391e(LogTag.DNS, "onNetworkChange");
                    NetUtil.nativeNotifyNetChanged(((Long) NetUtil.receiverList.get(size)).longValue());
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context2, Intent intent) {
            if (context2 == null || intent == null || System.currentTimeMillis() - NetUtil.lastTime < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                return;
            }
            MomoMainThreadExecutor.cancelAllRunnables("dnsNetChanged");
            MomoMainThreadExecutor.postDelayed("dnsNetChanged", new Runnable() { // from class: com.immomo.mmdns.NetUtil.1.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        onNetworkChange();
                    } catch (Exception unused) {
                    }
                }
            }, 3000L);
        }
    };

    public static void clearAllReceivers() {
        receiverList.clear();
    }

    public static int getNetType() {
        Context context2 = context;
        if (context2 != null) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.getType() == 1) {
                        return 1;
                    }
                    int subtype = activeNetworkInfo.getSubtype();
                    if (subtype == 20) {
                        return 5;
                    }
                    switch (subtype) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return 2;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return 3;
                        case 13:
                            return 4;
                        default:
                            return 0;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return 0;
    }

    public static void init(Context context2) {
        lastTime = System.currentTimeMillis();
        if (context2 == null || context != null) {
            return;
        }
        context = context2.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        ii5.m136342l(context2, netChangeBroadcastReceiver, intentFilter);
    }

    public static boolean isNetworkAvailable() {
        Context context2 = context;
        if (context2 == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        } catch (Exception e) {
            MDLog.printErrStackTrace(LogTag.DNS, e);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeNotifyNetChanged(long j);

    public static void registerNetChangeReceiver(long j) {
        receiverList.add(Long.valueOf(j));
        MDLog.m7395i(LogTag.DNS, "registerNetChangeReceiver");
    }

    public static void unregisterNetChangeReceiver(long j) {
        if (receiverList.contains(Long.valueOf(j))) {
            receiverList.remove(Long.valueOf(j));
        }
        MDLog.m7395i(LogTag.DNS, "unregisterNetChangeReceiver");
    }
}
