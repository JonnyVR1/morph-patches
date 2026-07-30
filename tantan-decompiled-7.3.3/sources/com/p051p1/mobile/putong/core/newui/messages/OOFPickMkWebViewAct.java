package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import p153l.zwk;

/* JADX INFO: loaded from: classes11.dex */
public class OOFPickMkWebViewAct extends MkWebViewAct {

    /* JADX INFO: renamed from: g */
    public static final String f26021g;

    static {
        f26021g = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/one-out-of-four/index.html?speed=true&_bid=1003918&hideNavigationBar=1&hideNotch=1");
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m42799n2(Context context) {
        return m42800o2(context, "");
    }

    /* JADX INFO: renamed from: o2 */
    public static Intent m42800o2(Context context, String str) {
        String str2;
        String str3 = f26021g;
        if (TextUtils.isEmpty(str)) {
            str2 = str3 + "#/cards";
        } else {
            str2 = str3 + "&uid=" + str + "#/cards";
        }
        Intent intentM81422e2 = MkWebViewAct.m81422e2(context, "", str2, true, true, true, null);
        intentM81422e2.setClass(context, OOFPickMkWebViewAct.class);
        intentM81422e2.putExtra("hideNotch", true);
        return intentM81422e2;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        CoreModule.f18264c.f20384f0.m33653Fo();
    }
}
