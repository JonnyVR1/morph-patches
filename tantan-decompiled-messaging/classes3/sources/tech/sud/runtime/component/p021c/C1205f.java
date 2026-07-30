package tech.sud.runtime.component.p021c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import l.ii5;
import tech.sud.runtime.component.p026h.C1228f;
import tech.sud.runtime.core.C1241g;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.f */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1205f {

    /* JADX INFO: renamed from: a */
    private static final String[] f11268a = {"none", "wifi", "mobile", "ethernet", IjkMediaMeta.IJKM_VAL_TYPE__UNKNOWN};

    /* JADX INFO: renamed from: b */
    private a f11269b;

    /* JADX INFO: renamed from: c */
    private b f11270c = null;

    /* JADX INFO: renamed from: d */
    private final C1241g f11271d;

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.f$a */
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public WeakReference<b> f11272a;

        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iM10166b = C1205f.m10166b(context);
            C1228f.m10329c("SudNative", "J: Network state changed to " + C1205f.m10167b(iM10166b));
            WeakReference<b> weakReference = this.f11272a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f11272a.get().m10170a(iM10166b);
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.f$b */
    public class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public void m10170a(int i) {
            C1205f.this.f11271d.m10465b(2, i);
        }
    }

    public C1205f(C1241g c1241g, Context context) {
        this.f11271d = c1241g;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        a aVar = new a();
        this.f11269b = aVar;
        ii5.l(context, aVar, intentFilter);
    }

    /* JADX INFO: renamed from: a */
    private static int m10163a(TelephonyManager telephonyManager, ConnectivityManager connectivityManager) {
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkType();
            } catch (Exception unused) {
            }
        }
        try {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            if (networkInfo == null) {
                return 0;
            }
            NetworkInfo.State state = networkInfo.getState();
            if (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING) {
                return networkInfo.getSubtype();
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m10166b(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (SecurityException e) {
            C1228f.m10331e("SudNative", "J: NetworkState: " + e.toString());
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                return type != 9 ? 4 : 3;
            }
            return 1;
        }
        switch (m10163a((TelephonyManager) context.getApplicationContext().getSystemService("phone"), connectivityManager)) {
            case 0:
                return 2;
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 514;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 770;
            case 13:
            case 18:
            case 19:
                return 1026;
            case 16:
            case 17:
            default:
                return 1538;
            case 20:
                return 1282;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10169a(Context context) {
        this.f11270c = null;
        a aVar = this.f11269b;
        if (aVar != null) {
            aVar.f11272a = null;
            try {
                context.unregisterReceiver(aVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f11269b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10168a() {
        this.f11270c = new b();
        this.f11269b.f11272a = new WeakReference<>(this.f11270c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m10167b(int i) {
        int i2;
        int i3 = i & 255;
        if (i3 > 4) {
            i3 = 4;
        }
        String str = f11268a[i3];
        if (i3 != 2 || (i2 = (i >> 8) & 255) == 0) {
            return str;
        }
        return str + "_" + i2 + "g";
    }
}
