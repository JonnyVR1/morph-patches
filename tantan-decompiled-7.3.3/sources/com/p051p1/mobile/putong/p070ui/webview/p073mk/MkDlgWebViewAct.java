package com.p051p1.mobile.putong.p070ui.webview.p073mk;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.WebViewBridgeImplementation;
import com.tantanapp.common.utils.NullChecker;
import p153l.jd00;
import p153l.pc00;
import p153l.pd00;
import p153l.ujh0;
import p153l.zqw;
import p153l.zwk;

/* JADX INFO: loaded from: classes10.dex */
public class MkDlgWebViewAct extends PutongAct implements ujh0 {

    /* JADX INFO: renamed from: c */
    public jd00 f55641c;

    /* JADX INFO: renamed from: d */
    public pd00 f55642d;

    /* JADX INFO: renamed from: X1 */
    private boolean m81410X1() {
        return zwk.m221901a(this.f55642d.f151662n);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m81411Y1(Context context, String str, String str2) {
        return m81412Z1(context, str, str2, true);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m81412Z1(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) MkDlgWebViewAct.class);
        intent.putExtra("title", str);
        String strM171605a = pc00.m171605a(str2);
        intent.putExtra("url", strM171605a);
        intent.putExtra("advanceInitJsBridge", z);
        zqw.m221059k(intent, strM171605a);
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

    /* JADX INFO: renamed from: a2 */
    public jd00 m81413a2() {
        return new jd00(this);
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: renamed from: b2 */
    public pd00 mo59322b2() {
        return new pd00(this);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        overridePendingTransition(0, 0);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f55642d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f55641c = m81413a2();
        pd00 pd00VarMo59322b2 = mo59322b2();
        this.f55642d = pd00VarMo59322b2;
        this.f55641c.mo52715C(pd00VarMo59322b2);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f55641c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m82486a(this.f55642d.f151641B)) {
            this.f55642d.f151641B.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onHomePressed() {
        if (this.f55642d.m171743v()) {
            this.f55642d.m171722A();
        } else {
            super.onHomePressed();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        Runnable runnable = (Runnable) this.f55642d.f151655g.getTag(WebViewBridgeImplementation.f55450a);
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f55642d.m171743v()) {
            this.f55642d.m171722A();
        } else {
            lambda$debugItems$19();
        }
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f55642d.m171735U(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo102186m();
        }
        if (!this.f55642d.m171742s()) {
            checkGradientColors();
        } else if (getAppTheme().mo134834n(this.f55642d.m171729M())) {
            setTransparentStatusBar();
        } else if (getAppTheme().mo134833m()) {
            checkGradientColors();
        }
        addSwipeBackListener(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnResume() {
        return m81410X1() && super.shouldBlockOnResume();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return m81410X1() && super.shouldBlockOnResume();
    }
}
