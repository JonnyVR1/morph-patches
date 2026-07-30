package com.google.android.exoplayer2.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import p153l.bmk0;
import p153l.jj5;
import p153l.w11;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class NetworkTypeObserver {

    /* JADX INFO: renamed from: e */
    @Nullable
    public static NetworkTypeObserver f9571e;

    /* JADX INFO: renamed from: a */
    public final Handler f9572a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<WeakReference<InterfaceC2077c>> f9573b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    public final Object f9574c = new Object();

    /* JADX INFO: renamed from: d */
    @GuardedBy("networkTypeLock")
    public int f9575d = 0;

    public final class Receiver extends BroadcastReceiver {
        public Receiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iM12197g = NetworkTypeObserver.m12197g(context);
            if (bmk0.f77313a < 31 || iM12197g != 5) {
                NetworkTypeObserver.this.m12201j(iM12197g);
            } else {
                C2076b.m12202a(context, NetworkTypeObserver.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.NetworkTypeObserver$b */
    @RequiresApi(31)
    public static final class C2076b {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.util.NetworkTypeObserver$b$a */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a */
            public final NetworkTypeObserver f9577a;

            public a(NetworkTypeObserver networkTypeObserver) {
                this.f9577a = networkTypeObserver;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f9577a.m12201j(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m12202a(Context context, NetworkTypeObserver networkTypeObserver) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) w11.m204369e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(networkTypeObserver);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                networkTypeObserver.m12201j(5);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.NetworkTypeObserver$c */
    public interface InterfaceC2077c {
        /* JADX INFO: renamed from: a */
        void mo12203a(int i);
    }

    public NetworkTypeObserver(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        jj5.m145018l(context, new Receiver(), intentFilter);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized NetworkTypeObserver m12195d(Context context) {
        try {
            if (f9571e == null) {
                f9571e = new NetworkTypeObserver(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9571e;
    }

    /* JADX INFO: renamed from: e */
    public static int m12196e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return bmk0.f77313a >= 29 ? 9 : 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m12197g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return m12196e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    public int m12198f() {
        int i;
        synchronized (this.f9574c) {
            i = this.f9575d;
        }
        return i;
    }

    /* JADX INFO: renamed from: h */
    public void m12199h(final InterfaceC2077c interfaceC2077c) {
        m12200i();
        this.f9573b.add(new WeakReference<>(interfaceC2077c));
        this.f9572a.post(new Runnable() { // from class: l.ll20
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC2077c.mo12203a(this.f132521a.m12198f());
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m12200i() {
        for (WeakReference<InterfaceC2077c> weakReference : this.f9573b) {
            if (weakReference.get() == null) {
                this.f9573b.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m12201j(int i) {
        synchronized (this.f9574c) {
            try {
                if (this.f9575d == i) {
                    return;
                }
                this.f9575d = i;
                for (WeakReference<InterfaceC2077c> weakReference : this.f9573b) {
                    InterfaceC2077c interfaceC2077c = weakReference.get();
                    if (interfaceC2077c != null) {
                        interfaceC2077c.mo12203a(i);
                    } else {
                        this.f9573b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
