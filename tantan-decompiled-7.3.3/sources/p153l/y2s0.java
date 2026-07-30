package p153l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes6.dex */
public final class y2s0 {

    /* JADX INFO: renamed from: a */
    public NetworkCapabilities f197280a;

    public y2s0(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new x2s0(this));
            } catch (RuntimeException unused) {
                synchronized (y2s0.class) {
                    this.f197280a = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static y2s0 m214100c(Context context) {
        if (context != null) {
            return new y2s0((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final long m214102a() {
        synchronized (y2s0.class) {
            try {
                NetworkCapabilities networkCapabilities = this.f197280a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.f197280a.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.f197280a.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final NetworkCapabilities m214103b() {
        return this.f197280a;
    }
}
