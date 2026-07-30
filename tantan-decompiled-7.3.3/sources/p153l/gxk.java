package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.xiaomi.mipush.sdk.EnumC14868d;
import com.xiaomi.mipush.sdk.MiPushClient;

/* JADX INFO: loaded from: classes2.dex */
public class gxk {

    /* JADX INFO: renamed from: a */
    private static boolean f106954a = false;

    /* JADX INFO: renamed from: a */
    public static boolean m132872a() {
        return f106954a;
    }

    /* JADX INFO: renamed from: b */
    public static void m132873b(Context context) {
        InterfaceC19782r7 interfaceC19782r7M113429b = d0r0.m113425c(context).m113429b(EnumC14868d.ASSEMBLE_PUSH_HUAWEI);
        if (interfaceC19782r7M113429b != null) {
            interfaceC19782r7M113429b.register();
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m132874c(Context context) {
        context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).edit().putLong("last_connect_time", System.currentTimeMillis()).commit();
    }

    /* JADX INFO: renamed from: d */
    public static synchronized boolean m132875d(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).getLong("last_connect_time", -1L)) > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
    }
}
