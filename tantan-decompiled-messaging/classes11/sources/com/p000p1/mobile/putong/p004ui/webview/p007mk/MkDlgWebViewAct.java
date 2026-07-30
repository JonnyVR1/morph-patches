package com.p000p1.mobile.putong.p004ui.webview.p007mk;

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
import l.aow;
import l.mbh0;
import p009l.a500;
import p009l.juk;
import p009l.s300;
import p009l.u400;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MkDlgWebViewAct extends PutongAct implements mbh0 {

    /* JADX INFO: renamed from: c */
    public u400 f8399c;

    /* JADX INFO: renamed from: d */
    public a500 f8400d;

    /* JADX INFO: renamed from: V1 */
    private boolean m10569V1() {
        return juk.m17217a(this.f8400d.f9236n);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m10570X1(Context context, String str, String str2) {
        return m10571Y1(context, str, str2, true);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m10571Y1(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) MkDlgWebViewAct.class);
        intent.putExtra("title", str);
        String strM21983a = s300.m21983a(str2);
        intent.putExtra("url", strM21983a);
        intent.putExtra("advanceInitJsBridge", z);
        aow.j(intent, strM21983a);
        return intent;
    }

    /* JADX INFO: renamed from: D0 */
    public void m10572D0(boolean z, float f, int i) {
    }

    /* JADX INFO: renamed from: E0 */
    public void m10573E0() {
    }

    /* JADX INFO: renamed from: O */
    public void m10574O() {
    }

    /* JADX INFO: renamed from: Z */
    public void m10575Z() {
    }

    /* JADX INFO: renamed from: Z1 */
    public u400 m10576Z1() {
        return new u400(this);
    }

    /* JADX INFO: renamed from: a2 */
    public a500 m10577a2() {
        return new a500(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void applyOverrideConfiguration(Configuration configuration) {
        super/*android.view.ContextThemeWrapper*/.applyOverrideConfiguration(configuration);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        overridePendingTransition(0, 0);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f8400d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f8399c = m10576Z1();
        a500 a500VarM10577a2 = m10577a2();
        this.f8400d = a500VarM10577a2;
        this.f8399c.C(a500VarM10577a2);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f8399c.m22742a0();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.a(this.f8400d.f9215B)) {
            this.f8400d.f9215B.onActivityResult(i, i2, intent);
        }
    }

    public void onHomePressed() {
        if (this.f8400d.m11233v()) {
            this.f8400d.m11209A();
        } else {
            super/*com.p1.mobile.android.app.Act*/.onHomePressed();
        }
    }

    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i, keyEvent);
        }
        Runnable runnable = (Runnable) this.f8400d.f9229g.getTag(WebViewBridgeImplementation.f8208a);
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f8400d.m11233v()) {
            this.f8400d.m11209A();
        } else {
            finish();
        }
        return true;
    }

    public void preCreateView(Bundle bundle) {
        this.f8400d.m11223U(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().m();
        }
        if (!this.f8400d.m11231s()) {
            checkGradientColors();
        } else if (getAppTheme().n(this.f8400d.m11217M())) {
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
        return m10569V1() && super.shouldBlockOnResume();
    }

    public boolean shouldBlockOnStart() {
        return m10569V1() && super.shouldBlockOnResume();
    }
}
