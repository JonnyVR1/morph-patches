package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p009l.boq;
import p009l.ef2;
import p009l.fkp0;
import p009l.liq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TrackBridgeImplementation extends ef2 {
    @liq(key = "setWebviewPageID", uiThread = true)
    public void setWebviewPageID(@NonNull boq boqVar, String str, String[] strArr) {
        if (boqVar.mo12184c() instanceof WebViewAct) {
            ((WebViewAct) boqVar.mo12184c()).m10504d2(str, strArr);
        }
    }

    @liq(key = "trackNew", uiThread = true)
    public void trackNew(@NonNull boq boqVar, String str, String str2, String str3, String[] strArr) {
        if (!NullChecker.a(strArr) || strArr.length % 2 == 0) {
            fkp0.m14497f(str, str2, str3, strArr);
        }
    }

    @liq(key = "track")
    public void track(@NonNull boq boqVar, String str, String... strArr) {
    }

    @liq(key = "track")
    public void track(@NonNull boq boqVar, String str) {
    }
}
