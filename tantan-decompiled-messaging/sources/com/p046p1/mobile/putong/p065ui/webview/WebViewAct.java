package com.p046p1.mobile.putong.p065ui.webview;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.WebViewBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p149l.e30;
import p149l.fkp0;
import p149l.hlp0;
import p149l.juk;
import p149l.mbh0;
import p149l.mkd0;
import p149l.olp0;
import p149l.w9j;

/* JADX INFO: loaded from: classes11.dex */
public class WebViewAct extends PutongAct implements mbh0 {

    /* JADX INFO: renamed from: c */
    public hlp0 f54758c;

    /* JADX INFO: renamed from: d */
    public olp0 f54759d;

    /* JADX INFO: renamed from: e */
    public boolean f54760e;

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m80162X1(String str, String[] strArr, C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            fkp0.m121886f("PV", null, str, strArr);
        } else if (c4319c == C4319c.f15549j) {
            fkp0.m121886f("PD", null, str, strArr);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    private boolean m80163Y1() {
        return juk.m143319a(this.f54759d.f144538l);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m80164Z1(Context context, String str, String str2) {
        return m80165a2(context, str, str2, true);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m80165a2(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) WebViewAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        intent.putExtra("advanceInitJsBridge", z);
        return intent;
    }

    @Override // p149l.mbh0
    /* JADX INFO: renamed from: D0 */
    public void mo43534D0(boolean z, float f, int i) {
    }

    @Override // p149l.mbh0
    /* JADX INFO: renamed from: E0 */
    public void mo43535E0() {
    }

    @Override // p149l.mbh0
    /* JADX INFO: renamed from: O */
    public void mo43536O() {
    }

    @Override // p149l.mbh0
    /* JADX INFO: renamed from: Z */
    public void mo43538Z() {
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: renamed from: b2 */
    public hlp0 mo29700b2() {
        return new hlp0(this);
    }

    /* JADX INFO: renamed from: c2 */
    public olp0 mo29701c2() {
        return new olp0(this);
    }

    /* JADX INFO: renamed from: d2 */
    public void m80166d2(final String str, final String[] strArr) {
        if (TextUtils.isEmpty(str) || this.f54760e) {
            return;
        }
        lifecycle().filter(new w9j() { // from class: l.lkp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                C4319c c4319c = (C4319c) obj;
                return Boolean.valueOf(c4319c == C4319c.f15548i || c4319c == C4319c.f15549j);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.mkp0
            @Override // p149l.e30
            public final void call(Object obj) {
                WebViewAct.m80162X1(str, strArr, (C4319c) obj);
            }
        }));
        this.f54760e = true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f54759d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f54758c = mo29700b2();
        olp0 olp0VarMo29701c2 = mo29701c2();
        this.f54759d = olp0VarMo29701c2;
        this.f54758c.mo51532C(olp0VarMo29701c2);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f54758c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m81303a(this.f54759d.f144524C)) {
            this.f54759d.f144524C.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onHomePressed() {
        if (this.f54759d.m164975k()) {
            this.f54759d.m164982w();
        } else {
            super.onHomePressed();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        Runnable runnable = (Runnable) this.f54759d.f144530d.getTag(WebViewBridgeImplementation.f54602a);
        if (runnable != null) {
            runnable.run();
            return true;
        }
        boolean zM164975k = this.f54759d.m164975k();
        olp0 olp0Var = this.f54759d;
        if (zM164975k) {
            olp0Var.m164982w();
        } else {
            if (NullChecker.m81303a(olp0Var) && NullChecker.m81303a(this.f54759d.f144530d)) {
                HashMap<String, String> map = new HashMap<>();
                map.put("step", "onBack");
                olp0 olp0Var2 = this.f54759d;
                olp0Var2.m164968L(olp0Var2.f144530d.getUrl(), map);
            }
            m44477e2();
        }
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_intl_android_web_vue";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f54759d.m164967K(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo134126m();
        }
        if (!this.f54759d.m164974j()) {
            checkGradientColors();
        } else if (getAppTheme().mo105498n(this.f54759d.m164963E())) {
            setTransparentStatusBar();
        } else if (getAppTheme().mo105497m()) {
            checkGradientColors();
        }
        if (this.f54759d.m164970N()) {
            setTransparentStatusBar();
        }
        addSwipeBackListener(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnResume() {
        return m80163Y1() && super.shouldBlockOnResume();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return m80163Y1() && super.shouldBlockOnResume();
    }
}
