package com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftWebView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import p149l.aoq;
import p149l.e30;
import p149l.ffw;
import p149l.jkp0;
import p149l.jo0;
import p149l.ttj0;
import p149l.xtj0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftWebView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public WebViewX f50258a;

    /* JADX INFO: renamed from: b */
    public aoq f50259b;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f50260c;

    public UpgradeGiftWebView(@NonNull Context context) {
        super(context);
        this.f50260c = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m74362a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public final void m74364c(View view) {
        ttj0.m190606a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m74365d(Act act) {
        return act == null || act.isDestroyed() || act.isFinishing();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m74366e(xtj0 xtj0Var, AuthData authData) {
        if (m74365d((Act) getContext())) {
            return;
        }
        String str = authData.accessToken;
        xtj0Var.f99083a.mo74309a(str);
        m74367f(xtj0Var, str);
    }

    /* JADX INFO: renamed from: f */
    public final void m74367f(xtj0 xtj0Var, String str) {
        if (this.f50259b == null) {
            this.f50259b = new aoq((PutongAct) getContext(), str, this.f50258a);
        }
        this.f50258a.addJavascriptInterface(this.f50259b, "tantan");
        String str2 = xtj0Var.m210972d().entrance;
        if (jkp0.m141904d(str2)) {
            this.f50260c.put("H5-Authorization", str);
        }
        this.f50258a.loadUrl(str2, this.f50260c);
    }

    /* JADX INFO: renamed from: g */
    public void m74368g(final xtj0 xtj0Var) {
        String strMo74311c = xtj0Var.f99083a.mo74311c();
        if (TextUtils.isEmpty(strMo74311c)) {
            ypv.f199493a.m199334a().observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.rtj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f160968a.m74366e(xtj0Var, (AuthData) obj);
                }
            }, new e30() { // from class: l.stj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    UpgradeGiftWebView.m74362a((Throwable) obj);
                }
            }));
        } else {
            m74367f(xtj0Var, strMo74311c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (NullChecker.m81303a(this.f50259b)) {
            this.f50259b.m97931k();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74364c(this);
        setBackground(null);
        setBackgroundColor(0);
    }

    public UpgradeGiftWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50260c = new HashMap();
    }
}
