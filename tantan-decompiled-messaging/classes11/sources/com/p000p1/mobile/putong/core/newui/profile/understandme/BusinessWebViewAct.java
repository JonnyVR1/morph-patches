package com.p000p1.mobile.putong.core.newui.profile.understandme;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.WebViewBridgeImplementation;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.mbh0;
import p009l.juk;
import p009l.ol3;
import p009l.sl3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BusinessWebViewAct extends PutongAct implements mbh0 {

    /* JADX INFO: renamed from: c */
    public ol3 f5548c;

    /* JADX INFO: renamed from: d */
    public sl3 f5549d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m7778X1(Context context, String str, long j, String str2, String str3) {
        return m7779Y1(context, str, j, str2, true, false, str3);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m7779Y1(Context context, String str, long j, String str2, boolean z, boolean z2, String str3) {
        Intent intent = new Intent(context, (Class<?>) BusinessWebViewAct.class);
        intent.putExtra("title", str);
        intent.putExtra("id", j);
        intent.putExtra("url", str2);
        intent.putExtra("advanceInitJsBridge", z);
        intent.putExtra("enableWebOfflineCache", z2);
        intent.putExtra("webview_load_type", str3);
        return intent;
    }

    /* JADX INFO: renamed from: D0 */
    public void m7780D0(boolean z, float f, int i) {
    }

    /* JADX INFO: renamed from: E0 */
    public void m7781E0() {
    }

    /* JADX INFO: renamed from: O */
    public void m7782O() {
    }

    /* JADX INFO: renamed from: V1 */
    public final boolean m7783V1() {
        return juk.m17217a(this.f5549d.f20338n);
    }

    /* JADX INFO: renamed from: Z */
    public void m7784Z() {
    }

    /* JADX INFO: renamed from: Z1 */
    public ol3 m7785Z1() {
        return new ol3(this);
    }

    /* JADX INFO: renamed from: a2 */
    public sl3 m7786a2() {
        return new sl3(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void applyOverrideConfiguration(Configuration configuration) {
        super/*android.view.ContextThemeWrapper*/.applyOverrideConfiguration(configuration);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f5549d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f5548c = m7785Z1();
        sl3 sl3VarM7786a2 = m7786a2();
        this.f5549d = sl3VarM7786a2;
        this.f5548c.C(sl3VarM7786a2);
        this.f5549d.m22253v();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f5548c.m19925a0();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.a(this.f5549d.f20322A)) {
            this.f5549d.f20322A.onActivityResult(i, i2, intent);
        }
    }

    public void onHomePressed() {
        if (this.f5549d.m22246l()) {
            this.f5549d.m22252u();
        } else {
            super/*com.p1.mobile.android.app.Act*/.onHomePressed();
        }
    }

    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i, keyEvent);
        }
        Runnable runnable = (Runnable) this.f5549d.f20330f.getTag(WebViewBridgeImplementation.f8208a);
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (!this.f5549d.m22257z() && this.f5549d.m22246l()) {
            this.f5549d.m22252u();
        } else {
            finish();
        }
        return true;
    }

    public void preCreateView(Bundle bundle) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().m();
        }
        if (!this.f5549d.m22245k()) {
            checkGradientColors();
        } else if (getAppTheme().n(this.f5549d.m22235A())) {
            setTransparentStatusBar();
        } else if (getAppTheme().m()) {
            checkGradientColors();
        }
        addSwipeBackListener(this);
    }

    public boolean shouldBlockOnCreate(Bundle bundle) {
        return false;
    }

    public boolean shouldBlockOnResume() {
        return m7783V1() && super.shouldBlockOnResume();
    }

    public boolean shouldBlockOnStart() {
        return m7783V1() && super.shouldBlockOnResume();
    }
}
