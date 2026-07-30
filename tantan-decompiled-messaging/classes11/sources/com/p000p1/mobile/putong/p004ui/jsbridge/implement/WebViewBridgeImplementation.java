package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.webview.AccessTokenWebViewAct;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.j2e0;
import l.s4c0;
import p009l.boq;
import p009l.coq;
import p009l.ef2;
import p009l.liq;
import p009l.vjf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WebViewBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: a */
    public static final int f8208a = -1443655385;

    /* JADX INFO: renamed from: d */
    private void m10191d(@NonNull Intent intent, @NonNull String str) {
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
            CrashHelper.c(e);
        }
    }

    @liq(key = "closeDialogWebview")
    public void closeDialogWebview(@NonNull boq boqVar) {
        if (NullChecker.a(boqVar.mo12182a().getTag(s4c0.I0)) && (boqVar.mo12182a().getTag(s4c0.I0) instanceof Dialog)) {
            Dialog dialog = (Dialog) boqVar.mo12182a().getTag(s4c0.I0);
            boqVar.mo12182a().setTag(s4c0.I0, null);
            dialog.dismiss();
        }
    }

    @liq(key = "closeWebview", uiThread = true)
    public void closeWebview(@NonNull boq boqVar) {
        vjf0.m23406e().m23424t(false);
        m10192e(boqVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m10192e(@NonNull coq coqVar) {
        coqVar.mo12184c().finish();
    }

    /* JADX INFO: renamed from: f */
    public final void m10193f(@NonNull coq coqVar, String str, String str2) {
        if (!str.startsWith("http")) {
            j2e0.m(coqVar.mo12184c(), Uri.parse(str));
            return;
        }
        Intent intentM10498Z1 = WebViewAct.m10498Z1(coqVar.mo12184c(), str2, str);
        m10191d(intentM10498Z1, str);
        coqVar.mo12184c().startActivity(intentM10498Z1);
    }

    /* JADX INFO: renamed from: g */
    public final void m10194g(@NonNull final coq coqVar, final String str) {
        coqVar.mo12182a().setTag(f8208a, TextUtils.isEmpty(str) ? null : new Runnable() { // from class: l.nkp0
            @Override // java.lang.Runnable
            public final void run() {
                coqVar.mo12185d().mo15129a(str);
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
            j2e0.m(boqVar.mo12184c(), Uri.parse(str));
            return;
        }
        Intent intentM10486i2 = AccessTokenWebViewAct.m10486i2(boqVar.mo12184c(), str2, str, false, true, false);
        m10191d(intentM10486i2, str);
        boqVar.mo12184c().startActivity(intentM10486i2);
    }

    @liq(key = "openWebview", uiThread = true)
    public void openWebview(@NonNull boq boqVar, String str, String str2) {
        m10193f(boqVar, str, str2);
    }

    @liq(key = "setOnKeyBack")
    public void setOnKeyBack(@NonNull boq boqVar, String str) {
        m10194g(boqVar, str);
    }
}
