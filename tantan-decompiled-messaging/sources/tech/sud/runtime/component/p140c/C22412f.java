package tech.sud.runtime.component.p140c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.p046p1.mobile.putong.data.Mobile;
import com.tencent.liteav.TXLiteAVCode;
import java.lang.ref.WeakReference;
import p149l.ii5;
import tech.sud.runtime.component.p145h.C22435f;
import tech.sud.runtime.core.C22448g;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.f */
/* JADX INFO: loaded from: classes3.dex */
public class C22412f {

    /* JADX INFO: renamed from: a */
    private static final String[] f207643a = {"none", "wifi", Mobile.TYPE, "ethernet", "unknown"};

    /* JADX INFO: renamed from: b */
    private a f207644b;

    /* JADX INFO: renamed from: c */
    private b f207645c = null;

    /* JADX INFO: renamed from: d */
    private final C22448g f207646d;

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.f$a */
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public WeakReference<b> f207647a;

        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iM221695b = C22412f.m221695b(context);
            C22435f.m221858c("SudNative", "J: Network state changed to " + C22412f.m221696b(iM221695b));
            WeakReference<b> weakReference = this.f207647a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f207647a.get().m221699a(iM221695b);
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.f$b */
    public class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public void m221699a(int i) {
            C22412f.this.f207646d.m221994b(2, i);
        }
    }

    public C22412f(C22448g c22448g, Context context) {
        this.f207646d = c22448g;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        a aVar = new a();
        this.f207644b = aVar;
        ii5.m136342l(context, aVar, intentFilter);
    }

    /* JADX INFO: renamed from: a */
    private static int m221692a(TelephonyManager telephonyManager, ConnectivityManager connectivityManager) {
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
    public static int m221695b(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (SecurityException e) {
            C22435f.m221860e("SudNative", "J: NetworkState: " + e.toString());
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
        switch (m221692a((TelephonyManager) context.getApplicationContext().getSystemService("phone"), connectivityManager)) {
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
                return TXLiteAVCode.EVT_RTMP_PUSH_PUBLISH_START;
            case 16:
            case 17:
            default:
                return 1538;
            case 20:
                return 1282;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221698a(Context context) {
        this.f207645c = null;
        a aVar = this.f207644b;
        if (aVar != null) {
            aVar.f207647a = null;
            try {
                context.unregisterReceiver(aVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f207644b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221697a() {
        this.f207645c = new b();
        this.f207644b.f207647a = new WeakReference<>(this.f207645c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m221696b(int i) {
        int i2;
        int i3 = i & 255;
        if (i3 > 4) {
            i3 = 4;
        }
        String str = f207643a[i3];
        if (i3 != 2 || (i2 = (i >> 8) & 255) == 0) {
            return str;
        }
        return str + "_" + i2 + "g";
    }
}
