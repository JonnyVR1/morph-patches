package p006l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class kkp0 {
    /* JADX INFO: renamed from: a */
    public static void m18160a(Act act, String str, String str2, String str3, String str4) {
        try {
            Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("quantity", str3).appendQueryParameter("issub", "1").appendQueryParameter("name", str2);
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            j2e0.m17248m(act, builderAppendQueryParameter.appendQueryParameter("tracker", str4).build());
        } catch (Exception e) {
            CrashHelper.c(new Exception("please ignore! visit browser error " + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m18161b(Act act, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("redirectType", str3);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("tracker", str2);
        if (z) {
            builderAppendQueryParameter2.appendQueryParameter("hideNavigationBar", "1");
        }
        if (z2) {
            builderAppendQueryParameter2.appendQueryParameter("hardwareAccelerated", "1");
        }
        if (z3) {
            builderAppendQueryParameter2.appendQueryParameter("isUseMkWebView", "1");
        }
        j2e0.m17248m(act, builderAppendQueryParameter2.build());
    }

    /* JADX INFO: renamed from: c */
    public static void m18162c(Act act, String str) {
        try {
            zvf0.r("e_web_purchase", str);
            act.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Network.language().startsWith("ru") ? "https://tantanapp.com/mob/pay/home.html?lang=en" : "https://tantanapp.com/mob/pay/home.html")));
        } catch (Exception e) {
            CrashHelper.c(new Exception("please ignore! visit browser error " + e.getMessage(), e));
        }
    }
}
