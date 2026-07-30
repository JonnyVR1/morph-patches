package com.cmic.sso.sdk.p022e;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.r */
/* JADX INFO: loaded from: classes.dex */
public class C1378r {

    /* JADX INFO: renamed from: a */
    private static C1378r f5725a;

    /* JADX INFO: renamed from: b */
    private ConnectivityManager f5726b;

    /* JADX INFO: renamed from: c */
    private Network f5727c;

    /* JADX INFO: renamed from: d */
    private ConnectivityManager.NetworkCallback f5728d;

    /* JADX INFO: renamed from: e */
    private boolean f5729e;

    /* JADX INFO: renamed from: com.cmic.sso.sdk.e.r$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7097a(Network network);
    }

    private C1378r(Context context) {
        try {
            this.f5726b = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public synchronized void m7317a(final a aVar) {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = this.f5726b;
        if (connectivityManager == null) {
            C1363c.m7232a("WifiNetworkUtils", "mConnectivityManager 为空");
            aVar.mo7097a(null);
            return;
        }
        Network network = this.f5727c;
        if (network != null && !this.f5729e && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.isAvailable()) {
            C1363c.m7232a("HttpUtils", "reuse network: ");
            aVar.mo7097a(this.f5727c);
            return;
        }
        ConnectivityManager.NetworkCallback networkCallback = this.f5728d;
        if (networkCallback == null) {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
            ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback() { // from class: com.cmic.sso.sdk.e.r.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network2) {
                    try {
                        if (C1378r.this.f5726b.getNetworkCapabilities(network2).hasTransport(0)) {
                            C1378r.this.f5727c = network2;
                            aVar.mo7097a(network2);
                            C1378r.this.f5729e = false;
                        } else {
                            C1363c.m7232a("WifiNetworkUtils", "切换失败，未开启数据网络");
                            C1378r.this.f5727c = null;
                            aVar.mo7097a(null);
                            C1378r.this.f5726b.unregisterNetworkCallback(C1378r.this.f5728d);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        C1378r.this.f5727c = null;
                        aVar.mo7097a(null);
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network2) {
                    C1378r.this.f5729e = true;
                }
            };
            this.f5728d = networkCallback2;
            this.f5726b.requestNetwork(networkRequestBuild, networkCallback2);
            return;
        }
        try {
            this.f5726b.unregisterNetworkCallback(networkCallback);
        } catch (Exception e) {
            e.printStackTrace();
            this.f5728d = null;
        }
        C1363c.m7232a("HttpUtils", "clear: ");
        NetworkRequest networkRequestBuild2 = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
        ConnectivityManager.NetworkCallback networkCallback3 = new ConnectivityManager.NetworkCallback() { // from class: com.cmic.sso.sdk.e.r.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network2) {
                try {
                    if (C1378r.this.f5726b.getNetworkCapabilities(network2).hasTransport(0)) {
                        C1378r.this.f5727c = network2;
                        aVar.mo7097a(network2);
                        C1378r.this.f5729e = false;
                    } else {
                        C1363c.m7232a("WifiNetworkUtils", "切换失败，未开启数据网络");
                        C1378r.this.f5727c = null;
                        aVar.mo7097a(null);
                        C1378r.this.f5726b.unregisterNetworkCallback(C1378r.this.f5728d);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    C1378r.this.f5727c = null;
                    aVar.mo7097a(null);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network2) {
                C1378r.this.f5729e = true;
            }
        };
        this.f5728d = networkCallback3;
        try {
            this.f5726b.requestNetwork(networkRequestBuild2, networkCallback3);
        } catch (Exception e2) {
            e2.printStackTrace();
            aVar.mo7097a(null);
        }
        return;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m7319b() {
        if (this.f5726b == null) {
            return;
        }
        try {
            if (this.f5728d == null) {
                return;
            }
            C1363c.m7234b("WifiNetworkUtils", "unregisterNetwork");
            this.f5726b.unregisterNetworkCallback(this.f5728d);
            this.f5728d = null;
            this.f5727c = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m7318a() {
        return this.f5727c != null;
    }

    /* JADX INFO: renamed from: a */
    public static C1378r m7314a(Context context) {
        if (f5725a == null) {
            synchronized (C1378r.class) {
                try {
                    if (f5725a == null) {
                        f5725a = new C1378r(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5725a;
    }
}
