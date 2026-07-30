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
import p149l.ii5;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class NetworkTypeObserver {

    /* JADX INFO: renamed from: e */
    @Nullable
    public static NetworkTypeObserver f9534e;

    /* JADX INFO: renamed from: a */
    public final Handler f9535a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList<WeakReference<InterfaceC2054c>> f9536b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    public final Object f9537c = new Object();

    /* JADX INFO: renamed from: d */
    @GuardedBy("networkTypeLock")
    public int f9538d = 0;

    public final class Receiver extends BroadcastReceiver {
        public Receiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iM12143g = NetworkTypeObserver.m12143g(context);
            if (vck0.f180948a < 31 || iM12143g != 5) {
                NetworkTypeObserver.this.m12147j(iM12143g);
            } else {
                C2053b.m12148a(context, NetworkTypeObserver.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.NetworkTypeObserver$b */
    @RequiresApi(31)
    public static final class C2053b {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.util.NetworkTypeObserver$b$a */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a */
            public final NetworkTypeObserver f9540a;

            public a(NetworkTypeObserver networkTypeObserver) {
                this.f9540a = networkTypeObserver;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f9540a.m12147j(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m12148a(Context context, NetworkTypeObserver networkTypeObserver) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) p11.m167011e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(networkTypeObserver);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                networkTypeObserver.m12147j(5);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.NetworkTypeObserver$c */
    public interface InterfaceC2054c {
        /* JADX INFO: renamed from: a */
        void mo12149a(int i);
    }

    public NetworkTypeObserver(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        ii5.m136342l(context, new Receiver(), intentFilter);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized NetworkTypeObserver m12141d(Context context) {
        try {
            if (f9534e == null) {
                f9534e = new NetworkTypeObserver(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9534e;
    }

    /* JADX INFO: renamed from: e */
    public static int m12142e(NetworkInfo networkInfo) {
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
                return vck0.f180948a >= 29 ? 9 : 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m12143g(Context context) {
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
                return m12142e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    public int m12144f() {
        int i;
        synchronized (this.f9537c) {
            i = this.f9538d;
        }
        return i;
    }

    /* JADX INFO: renamed from: h */
    public void m12145h(final InterfaceC2054c interfaceC2054c) {
        m12146i();
        this.f9536b.add(new WeakReference<>(interfaceC2054c));
        this.f9535a.post(new Runnable() { // from class: l.bd20
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC2054c.mo12149a(this.f75000a.m12144f());
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m12146i() {
        for (WeakReference<InterfaceC2054c> weakReference : this.f9536b) {
            if (weakReference.get() == null) {
                this.f9536b.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m12147j(int i) {
        synchronized (this.f9537c) {
            try {
                if (this.f9538d == i) {
                    return;
                }
                this.f9538d = i;
                for (WeakReference<InterfaceC2054c> weakReference : this.f9536b) {
                    InterfaceC2054c interfaceC2054c = weakReference.get();
                    if (interfaceC2054c != null) {
                        interfaceC2054c.mo12149a(i);
                    } else {
                        this.f9536b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
