package com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftWebView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.web.WebViewX;
import com.p1.mobile.putong.data.AuthData;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.aoq;
import l.e30;
import l.ffw;
import l.jkp0;
import l.jo0;
import l.ypv;
import p002l.ttj0;
import p002l.xtj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UpgradeGiftWebView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public WebViewX f6300a;

    /* JADX INFO: renamed from: b */
    public aoq f6301b;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f6302c;

    public UpgradeGiftWebView(@NonNull Context context) {
        super(context);
        this.f6302c = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7943a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public final void m7945c(View view) {
        ttj0.m23170a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7946d(Act act) {
        return act == null || act.isDestroyed() || act.isFinishing();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m7947e(xtj0 xtj0Var, AuthData authData) {
        if (m7946d((Act) getContext())) {
            return;
        }
        String str = authData.accessToken;
        xtj0Var.f10626a.mo7890a(str);
        m7948f(xtj0Var, str);
    }

    /* JADX INFO: renamed from: f */
    public final void m7948f(xtj0 xtj0Var, String str) {
        if (this.f6301b == null) {
            this.f6301b = new aoq(getContext(), str, this.f6300a);
        }
        this.f6300a.addJavascriptInterface(this.f6301b, "tantan");
        String str2 = xtj0Var.m26110d().entrance;
        if (jkp0.d(str2)) {
            this.f6302c.put("H5-Authorization", str);
        }
        this.f6300a.loadUrl(str2, this.f6302c);
    }

    /* JADX INFO: renamed from: g */
    public void m7949g(final xtj0 xtj0Var) {
        String strMo7892c = xtj0Var.f10626a.mo7892c();
        if (TextUtils.isEmpty(strMo7892c)) {
            ypv.a.a().observeOn(jo0.a()).subscribe(ffw.e(new e30() { // from class: l.rtj0
                public final void call(Object obj) {
                    this.f18676a.m7947e(xtj0Var, (AuthData) obj);
                }
            }, new e30() { // from class: l.stj0
                public final void call(Object obj) {
                    UpgradeGiftWebView.m7943a((Throwable) obj);
                }
            }));
        } else {
            m7948f(xtj0Var, strMo7892c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (NullChecker.a(this.f6301b)) {
            this.f6301b.k();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7945c(this);
        setBackground(null);
        setBackgroundColor(0);
    }

    public UpgradeGiftWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6302c = new HashMap();
    }
}
