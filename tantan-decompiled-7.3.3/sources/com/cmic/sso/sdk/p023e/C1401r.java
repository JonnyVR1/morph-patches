package com.cmic.sso.sdk.p023e;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.r */
/* JADX INFO: loaded from: classes.dex */
public class C1401r {

    /* JADX INFO: renamed from: a */
    private static C1401r f5762a;

    /* JADX INFO: renamed from: b */
    private ConnectivityManager f5763b;

    /* JADX INFO: renamed from: c */
    private Network f5764c;

    /* JADX INFO: renamed from: d */
    private ConnectivityManager.NetworkCallback f5765d;

    /* JADX INFO: renamed from: e */
    private boolean f5766e;

    /* JADX INFO: renamed from: com.cmic.sso.sdk.e.r$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7151a(Network network);
    }

    private C1401r(Context context) {
        try {
            this.f5763b = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public synchronized void m7371a(final a aVar) {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = this.f5763b;
        if (connectivityManager == null) {
            C1386c.m7286a("WifiNetworkUtils", "mConnectivityManager 为空");
            aVar.mo7151a(null);
            return;
        }
        Network network = this.f5764c;
        if (network != null && !this.f5766e && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.isAvailable()) {
            C1386c.m7286a("HttpUtils", "reuse network: ");
            aVar.mo7151a(this.f5764c);
            return;
        }
        ConnectivityManager.NetworkCallback networkCallback = this.f5765d;
        if (networkCallback == null) {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
            ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback() { // from class: com.cmic.sso.sdk.e.r.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network2) {
                    try {
                        if (C1401r.this.f5763b.getNetworkCapabilities(network2).hasTransport(0)) {
                            C1401r.this.f5764c = network2;
                            aVar.mo7151a(network2);
                            C1401r.this.f5766e = false;
                        } else {
                            C1386c.m7286a("WifiNetworkUtils", "切换失败，未开启数据网络");
                            C1401r.this.f5764c = null;
                            aVar.mo7151a(null);
                            C1401r.this.f5763b.unregisterNetworkCallback(C1401r.this.f5765d);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        C1401r.this.f5764c = null;
                        aVar.mo7151a(null);
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network2) {
                    C1401r.this.f5766e = true;
                }
            };
            this.f5765d = networkCallback2;
            this.f5763b.requestNetwork(networkRequestBuild, networkCallback2);
            return;
        }
        try {
            this.f5763b.unregisterNetworkCallback(networkCallback);
        } catch (Exception e) {
            e.printStackTrace();
            this.f5765d = null;
        }
        C1386c.m7286a("HttpUtils", "clear: ");
        NetworkRequest networkRequestBuild2 = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
        ConnectivityManager.NetworkCallback networkCallback3 = new ConnectivityManager.NetworkCallback() { // from class: com.cmic.sso.sdk.e.r.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network2) {
                try {
                    if (C1401r.this.f5763b.getNetworkCapabilities(network2).hasTransport(0)) {
                        C1401r.this.f5764c = network2;
                        aVar.mo7151a(network2);
                        C1401r.this.f5766e = false;
                    } else {
                        C1386c.m7286a("WifiNetworkUtils", "切换失败，未开启数据网络");
                        C1401r.this.f5764c = null;
                        aVar.mo7151a(null);
                        C1401r.this.f5763b.unregisterNetworkCallback(C1401r.this.f5765d);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    C1401r.this.f5764c = null;
                    aVar.mo7151a(null);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network2) {
                C1401r.this.f5766e = true;
            }
        };
        this.f5765d = networkCallback3;
        try {
            this.f5763b.requestNetwork(networkRequestBuild2, networkCallback3);
        } catch (Exception e2) {
            e2.printStackTrace();
            aVar.mo7151a(null);
        }
        return;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m7373b() {
        try {
            if (this.f5763b == null) {
                return;
            }
            try {
                if (this.f5765d == null) {
                    return;
                }
                C1386c.m7288b("WifiNetworkUtils", "unregisterNetwork");
                this.f5763b.unregisterNetworkCallback(this.f5765d);
                this.f5765d = null;
                this.f5764c = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m7372a() {
        return this.f5764c != null;
    }

    /* JADX INFO: renamed from: a */
    public static C1401r m7368a(Context context) {
        if (f5762a == null) {
            synchronized (C1401r.class) {
                try {
                    if (f5762a == null) {
                        f5762a = new C1401r(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5762a;
    }
}
