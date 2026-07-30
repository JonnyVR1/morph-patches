package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.putong.core.CoreModule;
import p009l.juk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class OOFPickMkWebViewAct extends MkWebViewAct {

    /* JADX INFO: renamed from: g */
    public static final String f4057g;

    static {
        f4057g = (juk.m17221e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/one-out-of-four/index.html?speed=true&_bid=1003918&hideNavigationBar=1&hideNotch=1");
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m5912m2(Context context) {
        return m5913n2(context, "");
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m5913n2(Context context, String str) {
        String str2;
        String str3 = f4057g;
        if (TextUtils.isEmpty(str)) {
            str2 = str3 + "#/cards";
        } else {
            str2 = str3 + "&uid=" + str + "#/cards";
        }
        Intent intentM10586d2 = MkWebViewAct.m10586d2(context, "", str2, true, true, true, null);
        intentM10586d2.setClass(context, OOFPickMkWebViewAct.class);
        intentM10586d2.putExtra("hideNotch", true);
        return intentM10586d2;
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        CoreModule.c.f0.Fo();
    }
}
