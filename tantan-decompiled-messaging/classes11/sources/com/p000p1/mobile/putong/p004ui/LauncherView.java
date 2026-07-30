package com.p000p1.mobile.putong.p004ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.p1.mobile.putong.data.ADInfo;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LauncherView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public c4g0 f7881a;

    /* JADX INFO: renamed from: b */
    public final PointF f7882b;

    /* JADX INFO: renamed from: c */
    public double f7883c;

    public LauncherView(Context context) {
        super(context);
        this.f7882b = new PointF();
        this.f7883c = -1.0d;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9708a(ADInfo aDInfo) {
        if (aDInfo == null) {
            return false;
        }
        if (TextUtils.isEmpty(aDInfo.link.url)) {
            return !(TEnum.equals(aDInfo.link.action, "browser") || TEnum.equals(aDInfo.link.action, "webview") || TEnum.equals(aDInfo.link.action, "deeplink") || TEnum.equals(aDInfo.link.action, "tantanWebview")) || URLUtil.isValidUrl(aDInfo.link.url);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m9709b(Activity activity, String str, boolean z) {
        Intent intent = new Intent(activity, (Class<?>) WebViewAct.class);
        intent.putExtra("hideNavigationBar", true);
        intent.putExtra("url", str);
        intent.putExtra("AD_WebView", z);
        return intent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c4g0 c4g0Var = this.f7881a;
        if (c4g0Var != null && !c4g0Var.isUnsubscribed()) {
            this.f7881a.unsubscribe();
        }
        if (NullChecker.a((Object) null)) {
            throw null;
        }
    }
}
