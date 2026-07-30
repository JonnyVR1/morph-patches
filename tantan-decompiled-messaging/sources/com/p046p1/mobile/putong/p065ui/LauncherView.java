package com.p046p1.mobile.putong.p065ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.data.ADInfo;
import com.p046p1.mobile.putong.data.LinkAction;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.c4g0;

/* JADX INFO: loaded from: classes11.dex */
public class LauncherView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public c4g0 f54275a;

    /* JADX INFO: renamed from: b */
    public final PointF f54276b;

    /* JADX INFO: renamed from: c */
    public double f54277c;

    public LauncherView(Context context) {
        super(context);
        this.f54276b = new PointF();
        this.f54277c = -1.0d;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79387a(ADInfo aDInfo) {
        if (aDInfo == null) {
            return false;
        }
        if (TextUtils.isEmpty(aDInfo.link.url)) {
            return !(TEnum.equals(aDInfo.link.action, "browser") || TEnum.equals(aDInfo.link.action, "webview") || TEnum.equals(aDInfo.link.action, LinkAction.deeplink) || TEnum.equals(aDInfo.link.action, LinkAction.tantanWebview)) || URLUtil.isValidUrl(aDInfo.link.url);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m79388b(Activity activity, String str, boolean z) {
        Intent intent = new Intent(activity, (Class<?>) WebViewAct.class);
        intent.putExtra("hideNavigationBar", true);
        intent.putExtra("url", str);
        intent.putExtra("AD_WebView", z);
        return intent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c4g0 c4g0Var = this.f54275a;
        if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
            this.f54275a.unsubscribe();
        }
        if (NullChecker.m81303a(null)) {
            throw null;
        }
    }
}
