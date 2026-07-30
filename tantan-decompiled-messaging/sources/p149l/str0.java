package p149l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes6.dex */
public final class str0 {

    /* JADX INFO: renamed from: a */
    public NetworkCapabilities f166384a;

    public str0(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new rtr0(this));
            } catch (RuntimeException unused) {
                synchronized (str0.class) {
                    this.f166384a = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static str0 m185968c(Context context) {
        if (context != null) {
            return new str0((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final long m185970a() {
        synchronized (str0.class) {
            try {
                NetworkCapabilities networkCapabilities = this.f166384a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.f166384a.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.f166384a.hasTransport(0)) {
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
    public final NetworkCapabilities m185971b() {
        return this.f166384a;
    }
}
