package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.aqq;
import p153l.jtp0;
import p153l.lf2;
import p153l.lkq;

/* JADX INFO: loaded from: classes10.dex */
public class TrackBridgeImplementation extends lf2 {
    @lkq(key = "setWebviewPageID", uiThread = true)
    public void setWebviewPageID(@NonNull aqq aqqVar, String str, String[] strArr) {
        if (aqqVar.mo99543c() instanceof WebViewAct) {
            ((WebViewAct) aqqVar.mo99543c()).m81349e2(str, strArr);
        }
    }

    @lkq(key = "trackNew", uiThread = true)
    public void trackNew(@NonNull aqq aqqVar, String str, String str2, String str3, String[] strArr) {
        if (!NullChecker.m82486a(strArr) || strArr.length % 2 == 0) {
            jtp0.m146916f(str, str2, str3, strArr);
        }
    }

    @lkq(key = "track")
    public void track(@NonNull aqq aqqVar, String str, String... strArr) {
    }

    @lkq(key = "track")
    public void track(@NonNull aqq aqqVar, String str) {
    }
}
