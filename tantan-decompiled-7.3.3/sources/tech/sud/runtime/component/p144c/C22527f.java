package tech.sud.runtime.component.p144c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.p051p1.mobile.putong.data.Mobile;
import com.tencent.liteav.TXLiteAVCode;
import java.lang.ref.WeakReference;
import p153l.jj5;
import tech.sud.runtime.component.p149h.C22550f;
import tech.sud.runtime.core.C22563g;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.f */
/* JADX INFO: loaded from: classes3.dex */
public class C22527f {

    /* JADX INFO: renamed from: a */
    private static final String[] f208565a = {"none", "wifi", Mobile.TYPE, "ethernet", "unknown"};

    /* JADX INFO: renamed from: b */
    private a f208566b;

    /* JADX INFO: renamed from: c */
    private b f208567c = null;

    /* JADX INFO: renamed from: d */
    private final C22563g f208568d;

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.f$a */
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public WeakReference<b> f208569a;

        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iM222941b = C22527f.m222941b(context);
            C22550f.m223104c("SudNative", "J: Network state changed to " + C22527f.m222942b(iM222941b));
            WeakReference<b> weakReference = this.f208569a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f208569a.get().m222945a(iM222941b);
        }
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.f$b */
    public class b {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public void m222945a(int i) {
            C22527f.this.f208568d.m223240b(2, i);
        }
    }

    public C22527f(C22563g c22563g, Context context) {
        this.f208568d = c22563g;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        a aVar = new a();
        this.f208566b = aVar;
        jj5.m145018l(context, aVar, intentFilter);
    }

    /* JADX INFO: renamed from: a */
    private static int m222938a(TelephonyManager telephonyManager, ConnectivityManager connectivityManager) {
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
    public static int m222941b(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (SecurityException e) {
            C22550f.m223106e("SudNative", "J: NetworkState: " + e.toString());
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
        switch (m222938a((TelephonyManager) context.getApplicationContext().getSystemService("phone"), connectivityManager)) {
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
    public void m222944a(Context context) {
        this.f208567c = null;
        a aVar = this.f208566b;
        if (aVar != null) {
            aVar.f208569a = null;
            try {
                context.unregisterReceiver(aVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f208566b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m222943a() {
        this.f208567c = new b();
        this.f208566b.f208569a = new WeakReference<>(this.f208567c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m222942b(int i) {
        int i2;
        int i3 = i & 255;
        if (i3 > 4) {
            i3 = 4;
        }
        String str = f208565a[i3];
        if (i3 != 2 || (i2 = (i >> 8) & 255) == 0) {
            return str;
        }
        return str + "_" + i2 + "g";
    }
}
