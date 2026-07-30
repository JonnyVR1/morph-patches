package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p149l.boq;
import p149l.coq;
import p149l.ef2;
import p149l.j2e0;
import p149l.liq;
import p149l.s4c0;
import p149l.vjf0;

/* JADX INFO: loaded from: classes11.dex */
public class WebViewBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: a */
    public static final int f54602a = -1443655385;

    /* JADX INFO: renamed from: d */
    private void m79866d(@NonNull Intent intent, @NonNull String str) {
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
            CrashHelper.m81296c(e);
        }
    }

    @liq(key = "closeDialogWebview")
    public void closeDialogWebview(@NonNull boq boqVar) {
        if (NullChecker.m81303a(boqVar.mo102959a().getTag(s4c0.f162300I0)) && (boqVar.mo102959a().getTag(s4c0.f162300I0) instanceof Dialog)) {
            Dialog dialog = (Dialog) boqVar.mo102959a().getTag(s4c0.f162300I0);
            boqVar.mo102959a().setTag(s4c0.f162300I0, null);
            dialog.dismiss();
        }
    }

    @liq(key = "closeWebview", uiThread = true)
    public void closeWebview(@NonNull boq boqVar) {
        vjf0.m198623e().m198641t(false);
        m79867e(boqVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m79867e(@NonNull coq coqVar) {
        coqVar.mo102961c().m66873d2();
    }

    /* JADX INFO: renamed from: f */
    public final void m79868f(@NonNull coq coqVar, String str, String str2) {
        if (!str.startsWith("http")) {
            j2e0.m139446m(coqVar.mo102961c(), Uri.parse(str));
            return;
        }
        Intent intentM80164Z1 = WebViewAct.m80164Z1(coqVar.mo102961c(), str2, str);
        m79866d(intentM80164Z1, str);
        coqVar.mo102961c().startActivity(intentM80164Z1);
    }

    /* JADX INFO: renamed from: g */
    public final void m79869g(@NonNull final coq coqVar, final String str) {
        coqVar.mo102959a().setTag(f54602a, TextUtils.isEmpty(str) ? null : new Runnable() { // from class: l.nkp0
            @Override // java.lang.Runnable
            public final void run() {
                coqVar.mo102962d().mo127284a(str);
            }
        });
    }

    @liq(key = "jumpWebview", uiThread = true)
    public void jumpWebview(@NonNull boq boqVar, String str, String str2) {
        closeWebview(boqVar);
        openWebview(boqVar, str, str2);
    }

    @liq(key = "openTokenWebview")
    public void openTokenWebview(@NonNull boq boqVar, String str, String str2) {
        if (!str.startsWith("http")) {
            j2e0.m139446m(boqVar.mo102961c(), Uri.parse(str));
            return;
        }
        Intent intentM80154i2 = AccessTokenWebViewAct.m80154i2(boqVar.mo102961c(), str2, str, false, true, false);
        m79866d(intentM80154i2, str);
        boqVar.mo102961c().startActivity(intentM80154i2);
    }

    @liq(key = "openWebview", uiThread = true)
    public void openWebview(@NonNull boq boqVar, String str, String str2) {
        m79868f(boqVar, str, str2);
    }

    @liq(key = "setOnKeyBack")
    public void setOnKeyBack(@NonNull boq boqVar, String str) {
        m79869g(boqVar, str);
    }
}
