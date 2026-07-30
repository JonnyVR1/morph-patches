package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.sdk.app.AuthTask;
import com.p051p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.JsonAdapter;
import com.tencent.connect.common.Constants;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class irq {
    /* JADX INFO: renamed from: c */
    public static C22421c<pf60<Integer, String>> m141842c(@NonNull Activity activity) {
        return uqb0.f180397c0.alipayAuthWithErrorCode(new AuthTask(activity));
    }

    /* JADX INFO: renamed from: d */
    public static String m141843d(String str, String str2) {
        return m141844e(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static String m141844e(String str, String str2) {
        String strValueOf = String.valueOf(uqb0.f180376H.guessedCurrentServerTime() * 1000000);
        String strAccessToken = uqb0.f180397c0.accessToken();
        return "MAC " + JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER().serialize(jyb.m147507f0(Constants.VIA_REPORT_TYPE_JOININ_GROUP, "webview1.0.0", strValueOf, strAccessToken, t5l.m189406d(strValueOf, strAccessToken, str, "PJdrnI7h4-rXKG0V8SUUaR2n4DJEjfieCGQkemQ2EtEQuQspxg", str2)));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m141845f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("alipays://"));
        return !jyb.m147479J(packageManager.queryIntentActivities(intent, 64));
    }

    /* JADX INFO: renamed from: g */
    public static C22421c<Boolean> m141846g() {
        return uqb0.f180397c0.mo105311me().skipWhile(new qcj() { // from class: l.grq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).settings == null);
            }
        }).map(new qcj() { // from class: l.hrq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(TextUtils.isEmpty(user.settings.phoneNumber.number) && TEnum.equals(user.source, "wechat"));
            }
        }).compose(psd0.m173592C()).first();
    }

    /* JADX INFO: renamed from: h */
    public static C22421c<AlipayAuthEnvelop> m141847h(@NonNull String str, @NonNull String str2) {
        return uqb0.f180397c0.mo105315u4(str, str2);
    }
}
