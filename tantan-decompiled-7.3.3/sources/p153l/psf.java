package p153l;

import android.content.Context;
import com.xiaomi.mipush.sdk.MiPushClient;

/* JADX INFO: loaded from: classes2.dex */
public class psf {
    /* JADX INFO: renamed from: a */
    public static void m173641a(Context context) {
        context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).edit().putBoolean("is_xmsf_sup_decrypt", ((long) l4r0.m152827l(context)) >= 50002000).apply();
    }
}
