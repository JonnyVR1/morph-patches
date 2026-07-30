package com.p051p1.mobile.putong.p070ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.data.ADInfo;
import com.p051p1.mobile.putong.data.LinkAction;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.kcg0;

/* JADX INFO: loaded from: classes10.dex */
public class LauncherView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public kcg0 f55123a;

    /* JADX INFO: renamed from: b */
    public final PointF f55124b;

    /* JADX INFO: renamed from: c */
    public double f55125c;

    public LauncherView(Context context) {
        super(context);
        this.f55124b = new PointF();
        this.f55125c = -1.0d;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m80570a(ADInfo aDInfo) {
        if (aDInfo == null) {
            return false;
        }
        if (TextUtils.isEmpty(aDInfo.link.url)) {
            return !(TEnum.equals(aDInfo.link.action, "browser") || TEnum.equals(aDInfo.link.action, "webview") || TEnum.equals(aDInfo.link.action, LinkAction.deeplink) || TEnum.equals(aDInfo.link.action, LinkAction.tantanWebview)) || URLUtil.isValidUrl(aDInfo.link.url);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m80571b(Activity activity, String str, boolean z) {
        Intent intent = new Intent(activity, (Class<?>) WebViewAct.class);
        intent.putExtra("hideNavigationBar", true);
        intent.putExtra("url", str);
        intent.putExtra("AD_WebView", z);
        return intent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kcg0 kcg0Var = this.f55123a;
        if (kcg0Var != null && !kcg0Var.isUnsubscribed()) {
            this.f55123a.unsubscribe();
        }
        if (NullChecker.m82486a(null)) {
            throw null;
        }
    }
}
