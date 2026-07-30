package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.sdk.app.AuthTask;
import com.p046p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.JsonAdapter;
import com.tencent.connect.common.Constants;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class ipq {
    /* JADX INFO: renamed from: c */
    public static C22306c<j760<Integer, String>> m137567c(@NonNull Activity activity) {
        return qib0.f154714c0.alipayAuthWithErrorCode(new AuthTask(activity));
    }

    /* JADX INFO: renamed from: d */
    public static String m137568d(String str, String str2) {
        return m137569e(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static String m137569e(String str, String str2) {
        String strValueOf = String.valueOf(qib0.f154693H.guessedCurrentServerTime() * 1000000);
        String strAccessToken = qib0.f154714c0.accessToken();
        return "MAC " + JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(vwb.m200324f0(Constants.VIA_REPORT_TYPE_JOININ_GROUP, "webview1.0.0", strValueOf, strAccessToken, d3l.m109934d(strValueOf, strAccessToken, str, "PJdrnI7h4-rXKG0V8SUUaR2n4DJEjfieCGQkemQ2EtEQuQspxg", str2)));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m137570f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("alipays://"));
        return !vwb.m200296J(packageManager.queryIntentActivities(intent, 64));
    }

    /* JADX INFO: renamed from: g */
    public static C22306c<Boolean> m137571g() {
        return qib0.f154714c0.mo97522me().skipWhile(new w9j() { // from class: l.gpq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).settings == null);
            }
        }).map(new w9j() { // from class: l.hpq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(TextUtils.isEmpty(user.settings.phoneNumber.number) && TEnum.equals(user.source, "wechat"));
            }
        }).compose(mkd0.m154951C()).first();
    }

    /* JADX INFO: renamed from: h */
    public static C22306c<AlipayAuthEnvelop> m137572h(@NonNull String str, @NonNull String str2) {
        return qib0.f154714c0.mo97526u4(str, str2);
    }
}
