package com.p046p1.mobile.putong.core.newui.profile.understandme;

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
import p149l.juk;
import p149l.mbh0;
import p149l.ol3;
import p149l.sl3;

/* JADX INFO: loaded from: classes11.dex */
public class BusinessWebViewAct extends PutongAct implements mbh0 {

    /* JADX INFO: renamed from: c */
    public ol3 f26770c;

    /* JADX INFO: renamed from: d */
    public sl3 f26771d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m43532X1(Context context, String str, long j, String str2, String str3) {
        return m43533Y1(context, str, j, str2, true, false, str3);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m43533Y1(Context context, String str, long j, String str2, boolean z, boolean z2, String str3) {
        Intent intent = new Intent(context, (Class<?>) BusinessWebViewAct.class);
        intent.putExtra("title", str);
        intent.putExtra("id", j);
        intent.putExtra("url", str2);
        intent.putExtra("advanceInitJsBridge", z);
        intent.putExtra("enableWebOfflineCache", z2);
        intent.putExtra("webview_load_type", str3);
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

    /* JADX INFO: renamed from: V1 */
    public final boolean m43537V1() {
        return juk.m143319a(this.f26771d.f165119n);
    }

    @Override // p149l.mbh0
    /* JADX INFO: renamed from: Z */
    public void mo43538Z() {
    }

    /* JADX INFO: renamed from: Z1 */
    public ol3 m43539Z1() {
        return new ol3(this);
    }

    /* JADX INFO: renamed from: a2 */
    public sl3 m43540a2() {
        return new sl3(this);
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f26771d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f26770c = m43539Z1();
        sl3 sl3VarM43540a2 = m43540a2();
        this.f26771d = sl3VarM43540a2;
        this.f26770c.mo51532C(sl3VarM43540a2);
        this.f26771d.m184751v();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f26770c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m81303a(this.f26771d.f165103A)) {
            this.f26771d.f165103A.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onHomePressed() {
        if (this.f26771d.m184744l()) {
            this.f26771d.m184750u();
        } else {
            super.onHomePressed();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        Runnable runnable = (Runnable) this.f26771d.f165111f.getTag(WebViewBridgeImplementation.f54602a);
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (!this.f26771d.m184755z() && this.f26771d.m184744l()) {
            this.f26771d.m184750u();
        } else {
            lambda$debugItems$19();
        }
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo134126m();
        }
        if (!this.f26771d.m184743k()) {
            checkGradientColors();
        } else if (getAppTheme().mo105498n(this.f26771d.m184735A())) {
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
        return m43537V1() && super.shouldBlockOnResume();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return m43537V1() && super.shouldBlockOnResume();
    }
}
