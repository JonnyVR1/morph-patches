package com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftWebView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import p153l.a3k0;
import p153l.dhw;
import p153l.fo0;
import p153l.ntp0;
import p153l.w2k0;
import p153l.y20;
import p153l.zpq;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftWebView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public WebViewX f51106a;

    /* JADX INFO: renamed from: b */
    public zpq f51107b;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f51108c;

    public UpgradeGiftWebView(@NonNull Context context) {
        super(context);
        this.f51108c = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m75545a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public final void m75547c(View view) {
        w2k0.m204579a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m75548d(Act act) {
        return act == null || act.isDestroyed() || act.isFinishing();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m75549e(a3k0 a3k0Var, AuthData authData) {
        if (m75548d((Act) getContext())) {
            return;
        }
        String str = authData.accessToken;
        a3k0Var.f112532a.mo75492a(str);
        m75550f(a3k0Var, str);
    }

    /* JADX INFO: renamed from: f */
    public final void m75550f(a3k0 a3k0Var, String str) {
        if (this.f51107b == null) {
            this.f51107b = new zpq((PutongAct) getContext(), str, this.f51106a);
        }
        this.f51106a.addJavascriptInterface(this.f51107b, "tantan");
        String str2 = a3k0Var.m95805d().entrance;
        if (ntp0.m164746d(str2)) {
            this.f51108c.put("H5-Authorization", str);
        }
        this.f51106a.loadUrl(str2, this.f51108c);
    }

    /* JADX INFO: renamed from: g */
    public void m75551g(final a3k0 a3k0Var) {
        String strMo75494c = a3k0Var.f112532a.mo75494c();
        if (TextUtils.isEmpty(strMo75494c)) {
            zrv.f205799a.m207656a().observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.u2k0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f177224a.m75549e(a3k0Var, (AuthData) obj);
                }
            }, new y20() { // from class: l.v2k0
                @Override // p153l.y20
                public final void call(Object obj) {
                    UpgradeGiftWebView.m75545a((Throwable) obj);
                }
            }));
        } else {
            m75550f(a3k0Var, strMo75494c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (NullChecker.m82486a(this.f51107b)) {
            this.f51107b.m220926k();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75547c(this);
        setBackground(null);
        setBackgroundColor(0);
    }

    public UpgradeGiftWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51108c = new HashMap();
    }
}
