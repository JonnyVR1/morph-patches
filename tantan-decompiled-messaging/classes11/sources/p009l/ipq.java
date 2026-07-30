package p009l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.sdk.app.AuthTask;
import com.p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.JsonAdapter;
import l.j760;
import l.mkd0;
import l.qib0;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ipq {
    /* JADX INFO: renamed from: c */
    public static c<j760<Integer, String>> m16687c(@NonNull Activity activity) {
        return qib0.c0.alipayAuthWithErrorCode(new AuthTask(activity));
    }

    /* JADX INFO: renamed from: d */
    public static String m16688d(String str, String str2) {
        return m16689e(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static String m16689e(String str, String str2) {
        String strValueOf = String.valueOf(qib0.H.guessedCurrentServerTime() * 1000000);
        String strAccessToken = qib0.c0.accessToken();
        return "MAC " + JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(vwb.f0(new String[]{"13", "webview1.0.0", strValueOf, strAccessToken, d3l.m13003d(strValueOf, strAccessToken, str, "PJdrnI7h4-rXKG0V8SUUaR2n4DJEjfieCGQkemQ2EtEQuQspxg", str2)}));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m16690f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("alipays://"));
        return !vwb.J(packageManager.queryIntentActivities(intent, 64));
    }

    /* JADX INFO: renamed from: g */
    public static c<Boolean> m16691g() {
        return qib0.c0.me().skipWhile(new w9j() { // from class: l.gpq
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).settings == null);
            }
        }).map(new w9j() { // from class: l.hpq
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(TextUtils.isEmpty(user.settings.phoneNumber.number) && TEnum.equals(user.source, "wechat"));
            }
        }).compose(mkd0.C()).first();
    }

    /* JADX INFO: renamed from: h */
    public static c<AlipayAuthEnvelop> m16692h(@NonNull String str, @NonNull String str2) {
        return qib0.c0.u4(str, str2);
    }
}
