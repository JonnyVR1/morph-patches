package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.xiaomi.mipush.sdk.EnumC14720d;
import com.xiaomi.mipush.sdk.MiPushClient;

/* JADX INFO: loaded from: classes2.dex */
public class quk {

    /* JADX INFO: renamed from: a */
    private static boolean f156517a = false;

    /* JADX INFO: renamed from: a */
    public static boolean m176620a() {
        return f156517a;
    }

    /* JADX INFO: renamed from: b */
    public static void m176621b(Context context) {
        InterfaceC20816w7 interfaceC20816w7M210597b = xqq0.m210593c(context).m210597b(EnumC14720d.ASSEMBLE_PUSH_HUAWEI);
        if (interfaceC20816w7M210597b != null) {
            interfaceC20816w7M210597b.register();
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m176622c(Context context) {
        context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).edit().putLong("last_connect_time", System.currentTimeMillis()).commit();
    }

    /* JADX INFO: renamed from: d */
    public static synchronized boolean m176623d(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).getLong("last_connect_time", -1L)) > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
    }
}
