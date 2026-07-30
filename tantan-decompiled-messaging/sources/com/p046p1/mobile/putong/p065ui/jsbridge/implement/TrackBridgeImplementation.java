package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.boq;
import p149l.ef2;
import p149l.fkp0;
import p149l.liq;

/* JADX INFO: loaded from: classes11.dex */
public class TrackBridgeImplementation extends ef2 {
    @liq(key = "setWebviewPageID", uiThread = true)
    public void setWebviewPageID(@NonNull boq boqVar, String str, String[] strArr) {
        if (boqVar.mo102961c() instanceof WebViewAct) {
            ((WebViewAct) boqVar.mo102961c()).m80166d2(str, strArr);
        }
    }

    @liq(key = "trackNew", uiThread = true)
    public void trackNew(@NonNull boq boqVar, String str, String str2, String str3, String[] strArr) {
        if (!NullChecker.m81303a(strArr) || strArr.length % 2 == 0) {
            fkp0.m121886f(str, str2, str3, strArr);
        }
    }

    @liq(key = "track")
    public void track(@NonNull boq boqVar, String str, String... strArr) {
    }

    @liq(key = "track")
    public void track(@NonNull boq boqVar, String str) {
    }
}
