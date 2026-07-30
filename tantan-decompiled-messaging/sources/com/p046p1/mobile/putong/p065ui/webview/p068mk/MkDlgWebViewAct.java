package com.p046p1.mobile.putong.p065ui.webview.p068mk;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.WebViewBridgeImplementation;
import com.tantanapp.common.utils.NullChecker;
import p149l.a500;
import p149l.aow;
import p149l.juk;
import p149l.mbh0;
import p149l.s300;
import p149l.u400;

/* JADX INFO: loaded from: classes11.dex */
public class MkDlgWebViewAct extends PutongAct implements mbh0 {

    /* JADX INFO: renamed from: c */
    public u400 f54793c;

    /* JADX INFO: renamed from: d */
    public a500 f54794d;

    /* JADX INFO: renamed from: V1 */
    private boolean m80227V1() {
        return juk.m143319a(this.f54794d.f67608n);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m80228X1(Context context, String str, String str2) {
        return m80229Y1(context, str, str2, true);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m80229Y1(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) MkDlgWebViewAct.class);
        intent.putExtra("title", str);
        String strM182089a = s300.m182089a(str2);
        intent.putExtra("url", strM182089a);
        intent.putExtra("advanceInitJsBridge", z);
        aow.m97995j(intent, strM182089a);
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

    /* JADX INFO: renamed from: Z1 */
    public u400 m80230Z1() {
        return new u400(this);
    }

    /* JADX INFO: renamed from: a2 */
    public a500 mo58139a2() {
        return new a500(this);
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        overridePendingTransition(0, 0);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f54794d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f54793c = m80230Z1();
        a500 a500VarMo58139a2 = mo58139a2();
        this.f54794d = a500VarMo58139a2;
        this.f54793c.mo51532C(a500VarMo58139a2);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f54793c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m81303a(this.f54794d.f67587B)) {
            this.f54794d.f67587B.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onHomePressed() {
        if (this.f54794d.m94998v()) {
            this.f54794d.m94976A();
        } else {
            super.onHomePressed();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        Runnable runnable = (Runnable) this.f54794d.f67601g.getTag(WebViewBridgeImplementation.f54602a);
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f54794d.m94998v()) {
            this.f54794d.m94976A();
        } else {
            lambda$debugItems$19();
        }
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f54794d.m94989U(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo134126m();
        }
        if (!this.f54794d.m94996s()) {
            checkGradientColors();
        } else if (getAppTheme().mo105498n(this.f54794d.m94983M())) {
            setTransparentStatusBar();
        } else if (getAppTheme().mo105497m()) {
            checkGradientColors();
        }
        addSwipeBackListener(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnResume() {
        return m80227V1() && super.shouldBlockOnResume();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return m80227V1() && super.shouldBlockOnResume();
    }
}
