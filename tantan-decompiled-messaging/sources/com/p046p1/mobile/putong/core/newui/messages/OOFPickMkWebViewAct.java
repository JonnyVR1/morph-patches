package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import p149l.juk;

/* JADX INFO: loaded from: classes11.dex */
public class OOFPickMkWebViewAct extends MkWebViewAct {

    /* JADX INFO: renamed from: g */
    public static final String f25279g;

    static {
        f25279g = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/one-out-of-four/index.html?speed=true&_bid=1003918&hideNavigationBar=1&hideNotch=1");
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m41788m2(Context context) {
        return m41789n2(context, "");
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m41789n2(Context context, String str) {
        String str2;
        String str3 = f25279g;
        if (TextUtils.isEmpty(str)) {
            str2 = str3 + "#/cards";
        } else {
            str2 = str3 + "&uid=" + str + "#/cards";
        }
        Intent intentM80239d2 = MkWebViewAct.m80239d2(context, "", str2, true, true, true, null);
        intentM80239d2.setClass(context, OOFPickMkWebViewAct.class);
        intentM80239d2.putExtra("hideNotch", true);
        return intentM80239d2;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        CoreModule.f17545c.f19642f0.m32650Fo();
    }
}
