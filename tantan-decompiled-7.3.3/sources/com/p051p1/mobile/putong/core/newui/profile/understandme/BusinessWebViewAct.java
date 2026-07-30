package com.p051p1.mobile.putong.core.newui.profile.understandme;

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
import p153l.om3;
import p153l.sm3;
import p153l.ujh0;
import p153l.zwk;

/* JADX INFO: loaded from: classes11.dex */
public class BusinessWebViewAct extends PutongAct implements ujh0 {

    /* JADX INFO: renamed from: c */
    public om3 f27618c;

    /* JADX INFO: renamed from: d */
    public sm3 f27619d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m44718Y1(Context context, String str, long j, String str2, String str3) {
        return m44719Z1(context, str, j, str2, true, false, str3);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m44719Z1(Context context, String str, long j, String str2, boolean z, boolean z2, String str3) {
        Intent intent = new Intent(context, (Class<?>) BusinessWebViewAct.class);
        intent.putExtra("title", str);
        intent.putExtra("id", j);
        intent.putExtra("url", str2);
        intent.putExtra("advanceInitJsBridge", z);
        intent.putExtra("enableWebOfflineCache", z2);
        intent.putExtra("webview_load_type", str3);
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

    /* JADX INFO: renamed from: X1 */
    public final boolean m44723X1() {
        return zwk.m221901a(this.f27619d.f169505n);
    }

    @Override // p153l.ujh0
    /* JADX INFO: renamed from: a0 */
    public void mo44724a0() {
    }

    /* JADX INFO: renamed from: a2 */
    public om3 m44725a2() {
        return new om3(this);
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: renamed from: b2 */
    public sm3 m44726b2() {
        return new sm3(this);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f27619d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f27618c = m44725a2();
        sm3 sm3VarM44726b2 = m44726b2();
        this.f27619d = sm3VarM44726b2;
        this.f27618c.mo52715C(sm3VarM44726b2);
        this.f27619d.m186755v();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f27618c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m82486a(this.f27619d.f169489A)) {
            this.f27619d.f169489A.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onHomePressed() {
        if (this.f27619d.m186748l()) {
            this.f27619d.m186754u();
        } else {
            super.onHomePressed();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        Runnable runnable = (Runnable) this.f27619d.f169497f.getTag(WebViewBridgeImplementation.f55450a);
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (!this.f27619d.m186759z() && this.f27619d.m186748l()) {
            this.f27619d.m186754u();
        } else {
            lambda$debugItems$19();
        }
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo102186m();
        }
        if (!this.f27619d.m186747k()) {
            checkGradientColors();
        } else if (getAppTheme().mo134834n(this.f27619d.m186739A())) {
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
        return m44723X1() && super.shouldBlockOnResume();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return m44723X1() && super.shouldBlockOnResume();
    }
}
