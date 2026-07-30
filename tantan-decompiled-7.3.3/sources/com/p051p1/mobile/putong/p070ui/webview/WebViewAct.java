package com.p051p1.mobile.putong.p070ui.webview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.WebViewBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p153l.jtp0;
import p153l.lup0;
import p153l.psd0;
import p153l.qcj;
import p153l.sup0;
import p153l.ujh0;
import p153l.y20;
import p153l.zwk;

/* JADX INFO: loaded from: classes10.dex */
public class WebViewAct extends PutongAct implements ujh0 {

    /* JADX INFO: renamed from: c */
    public lup0 f55606c;

    /* JADX INFO: renamed from: d */
    public sup0 f55607d;

    /* JADX INFO: renamed from: e */
    public boolean f55608e;

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m81345Y1(String str, String[] strArr, C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            jtp0.m146916f("PV", null, str, strArr);
        } else if (c4470c == C4470c.f16268j) {
            jtp0.m146916f("PD", null, str, strArr);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    private boolean m81346Z1() {
        return zwk.m221901a(this.f55607d.f170723l);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m81347a2(Context context, String str, String str2) {
        return m81348b2(context, str, str2, true);
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m81348b2(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) WebViewAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        intent.putExtra("advanceInitJsBridge", z);
        return intent;
    }

    @Override // p153l.ujh0
    /* JADX INFO: renamed from: E0 */
    public void mo44720E0(boolean z, float f, int i) {
    }

    @Override // p153l.ujh0
    /* JADX INFO: renamed from: G0 */
    public void mo44721G0() {
    }

    @Override // p153l.ujh0
    /* JADX INFO: renamed from: P */
    public void mo44722P() {
    }

    @Override // p153l.ujh0
    /* JADX INFO: renamed from: a0 */
    public void mo44724a0() {
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: renamed from: c2 */
    public lup0 mo30698c2() {
        return new lup0(this);
    }

    /* JADX INFO: renamed from: d2 */
    public sup0 mo30699d2() {
        return new sup0(this);
    }

    /* JADX INFO: renamed from: e2 */
    public void m81349e2(final String str, final String[] strArr) {
        if (TextUtils.isEmpty(str) || this.f55608e) {
            return;
        }
        lifecycle().filter(new qcj() { // from class: l.ptp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                C4470c c4470c = (C4470c) obj;
                return Boolean.valueOf(c4470c == C4470c.f16267i || c4470c == C4470c.f16268j);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.qtp0
            @Override // p153l.y20
            public final void call(Object obj) {
                WebViewAct.m81345Y1(str, strArr, (C4470c) obj);
            }
        }));
        this.f55608e = true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f55607d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f55606c = mo30698c2();
        sup0 sup0VarMo30699d2 = mo30699d2();
        this.f55607d = sup0VarMo30699d2;
        this.f55606c.mo52715C(sup0VarMo30699d2);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f55606c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m82486a(this.f55607d.f170709C)) {
            this.f55607d.f170709C.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onHomePressed() {
        if (this.f55607d.m188062k()) {
            this.f55607d.m188069w();
        } else {
            super.onHomePressed();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        Runnable runnable = (Runnable) this.f55607d.f170715d.getTag(WebViewBridgeImplementation.f55450a);
        if (runnable != null) {
            runnable.run();
            return true;
        }
        boolean zM188062k = this.f55607d.m188062k();
        sup0 sup0Var = this.f55607d;
        if (zM188062k) {
            sup0Var.m188069w();
        } else {
            if (NullChecker.m82486a(sup0Var) && NullChecker.m82486a(this.f55607d.f170715d)) {
                HashMap<String, String> map = new HashMap<>();
                map.put("step", "onBack");
                sup0 sup0Var2 = this.f55607d;
                sup0Var2.m188055L(sup0Var2.f170715d.getUrl(), map);
            }
            m45660g2();
        }
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_intl_android_web_vue";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f55607d.m188054K(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo102186m();
        }
        if (!this.f55607d.m188061j()) {
            checkGradientColors();
        } else if (getAppTheme().mo134834n(this.f55607d.m188050E())) {
            setTransparentStatusBar();
        } else if (getAppTheme().mo134833m()) {
            checkGradientColors();
        }
        if (this.f55607d.m188057N()) {
            setTransparentStatusBar();
        }
        addSwipeBackListener(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnResume() {
        return m81346Z1() && super.shouldBlockOnResume();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return m81346Z1() && super.shouldBlockOnResume();
    }
}
