package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class w2r0 {
    public /* synthetic */ w2r0(m1r0 m1r0Var) {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public CookieManager mo112967a(Context context) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public WebResourceResponse mo112968b(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public aat0 mo112969c(q9t0 q9t0Var, z2s0 z2s0Var, boolean z, @Nullable k2v0 k2v0Var) {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public boolean mo201214d(Activity activity, Configuration configuration) {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Intent mo138092e(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo138094g(Context context, String str) {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public int mo138095h(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    /* JADX INFO: renamed from: i */
    public int mo176736i(AudioManager audioManager) {
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public int mo109120k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    /* JADX INFO: renamed from: j */
    public void mo176737j(Activity activity) {
    }

    /* JADX INFO: renamed from: f */
    public void mo138093f(Context context, String str, String str2) {
    }
}
