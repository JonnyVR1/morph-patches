package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p153l.aqq;
import p153l.bqq;
import p153l.esf0;
import p153l.lf2;
import p153l.lkq;
import p153l.nae0;
import p153l.ycc0;

/* JADX INFO: loaded from: classes10.dex */
public class WebViewBridgeImplementation extends lf2 {

    /* JADX INFO: renamed from: a */
    public static final int f55450a = -1443655385;

    /* JADX INFO: renamed from: d */
    private void m81049d(@NonNull Intent intent, @NonNull String str) {
        try {
            Uri uri = Uri.parse(str);
            boolean zEquals = "1".equals(uri.getQueryParameter("hideNavigationBar"));
            boolean zEquals2 = "1".equals(uri.getQueryParameter("skipLoading"));
            String queryParameter = uri.getQueryParameter("webviewColor");
            String queryParameter2 = uri.getQueryParameter("notchColor");
            boolean zEquals3 = "1".equals(uri.getQueryParameter("hideNotch"));
            intent.putExtra("hideNavigationBar", zEquals);
            intent.putExtra("skipLoading", zEquals2);
            intent.putExtra("webviewColor", queryParameter);
            intent.putExtra("notchColor", queryParameter2);
            intent.putExtra("hideNotch", zEquals3);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    @lkq(key = "closeDialogWebview")
    public void closeDialogWebview(@NonNull aqq aqqVar) {
        if (NullChecker.m82486a(aqqVar.mo99541a().getTag(ycc0.f198421I0)) && (aqqVar.mo99541a().getTag(ycc0.f198421I0) instanceof Dialog)) {
            Dialog dialog = (Dialog) aqqVar.mo99541a().getTag(ycc0.f198421I0);
            aqqVar.mo99541a().setTag(ycc0.f198421I0, null);
            dialog.dismiss();
        }
    }

    @lkq(key = "closeWebview", uiThread = true)
    public void closeWebview(@NonNull aqq aqqVar) {
        esf0.m122324e().m122342t(false);
        m81050e(aqqVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m81050e(@NonNull bqq bqqVar) {
        bqqVar.mo99543c().m68056e2();
    }

    /* JADX INFO: renamed from: f */
    public final void m81051f(@NonNull bqq bqqVar, String str, String str2) {
        if (!str.startsWith("http")) {
            nae0.m162083m(bqqVar.mo99543c(), Uri.parse(str));
            return;
        }
        Intent intentM81347a2 = WebViewAct.m81347a2(bqqVar.mo99543c(), str2, str);
        m81049d(intentM81347a2, str);
        bqqVar.mo99543c().startActivity(intentM81347a2);
    }

    /* JADX INFO: renamed from: g */
    public final void m81052g(@NonNull final bqq bqqVar, final String str) {
        bqqVar.mo99541a().setTag(f55450a, TextUtils.isEmpty(str) ? null : new Runnable() { // from class: l.rtp0
            @Override // java.lang.Runnable
            public final void run() {
                bqqVar.mo99544d().mo97003a(str);
            }
        });
    }

    @lkq(key = "jumpWebview", uiThread = true)
    public void jumpWebview(@NonNull aqq aqqVar, String str, String str2) {
        closeWebview(aqqVar);
        openWebview(aqqVar, str, str2);
    }

    @lkq(key = "openTokenWebview")
    public void openTokenWebview(@NonNull aqq aqqVar, String str, String str2) {
        if (!str.startsWith("http")) {
            nae0.m162083m(aqqVar.mo99543c(), Uri.parse(str));
            return;
        }
        Intent intentM81337k2 = AccessTokenWebViewAct.m81337k2(aqqVar.mo99543c(), str2, str, false, true, false);
        m81049d(intentM81337k2, str);
        aqqVar.mo99543c().startActivity(intentM81337k2);
    }

    @lkq(key = "openWebview", uiThread = true)
    public void openWebview(@NonNull aqq aqqVar, String str, String str2) {
        m81051f(aqqVar, str, str2);
    }

    @lkq(key = "setOnKeyBack")
    public void setOnKeyBack(@NonNull aqq aqqVar, String str) {
        m81052g(aqqVar, str);
    }
}
