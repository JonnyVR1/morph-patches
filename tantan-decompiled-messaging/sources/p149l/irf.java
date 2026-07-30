package p149l;

import android.content.Context;
import com.xiaomi.mipush.sdk.MiPushClient;

/* JADX INFO: loaded from: classes2.dex */
public class irf {
    /* JADX INFO: renamed from: a */
    public static void m137873a(Context context) {
        context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).edit().putBoolean("is_xmsf_sup_decrypt", ((long) fvq0.m123358l(context)) >= 50002000).apply();
    }
}
