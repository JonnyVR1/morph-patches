package p153l;

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
public class ccr0 {
    public /* synthetic */ ccr0(sar0 sar0Var) {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public CookieManager mo109050a(Context context) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public WebResourceResponse mo109051b(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public gjt0 mo109052c(wit0 wit0Var, fcs0 fcs0Var, boolean z, @Nullable qbv0 qbv0Var) {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public boolean mo107475d(Activity activity, Configuration configuration) {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Intent mo109053e(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo109055g(Context context, String str) {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public int mo109056h(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    /* JADX INFO: renamed from: i */
    public int mo109057i(AudioManager audioManager) {
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public int mo109059k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    /* JADX INFO: renamed from: j */
    public void mo109058j(Activity activity) {
    }

    /* JADX INFO: renamed from: f */
    public void mo109054f(Context context, String str, String str2) {
    }
}
