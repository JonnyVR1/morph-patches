package com.p000p1.mobile.putong.p004ui.webview;

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
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.WebViewBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.e30;
import l.mbh0;
import l.mkd0;
import l.w9j;
import p009l.fkp0;
import p009l.hlp0;
import p009l.juk;
import p009l.olp0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WebViewAct extends PutongAct implements mbh0 {

    /* JADX INFO: renamed from: c */
    public hlp0 f8364c;

    /* JADX INFO: renamed from: d */
    public olp0 f8365d;

    /* JADX INFO: renamed from: e */
    public boolean f8366e;

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m10496X1(String str, String[] strArr, c cVar) {
        if (cVar == c.i) {
            fkp0.m14497f("PV", null, str, strArr);
        } else if (cVar == c.j) {
            fkp0.m14497f("PD", null, str, strArr);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    private boolean m10497Y1() {
        return juk.m17217a(this.f8365d.f18153l);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m10498Z1(Context context, String str, String str2) {
        return m10499a2(context, str, str2, true);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m10499a2(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) WebViewAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        intent.putExtra("advanceInitJsBridge", z);
        return intent;
    }

    /* JADX INFO: renamed from: D0 */
    public void m10500D0(boolean z, float f, int i) {
    }

    /* JADX INFO: renamed from: E0 */
    public void m10501E0() {
    }

    /* JADX INFO: renamed from: O */
    public void m10502O() {
    }

    /* JADX INFO: renamed from: Z */
    public void m10503Z() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void applyOverrideConfiguration(Configuration configuration) {
        super/*android.view.ContextThemeWrapper*/.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: renamed from: b2 */
    public hlp0 mo10488b2() {
        return new hlp0(this);
    }

    /* JADX INFO: renamed from: c2 */
    public olp0 mo10489c2() {
        return new olp0(this);
    }

    /* JADX INFO: renamed from: d2 */
    public void m10504d2(final String str, final String[] strArr) {
        if (TextUtils.isEmpty(str) || this.f8366e) {
            return;
        }
        lifecycle().filter(new w9j() { // from class: l.lkp0
            public final Object call(Object obj) {
                c cVar = (c) obj;
                return Boolean.valueOf(cVar == c.i || cVar == c.j);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.mkp0
            public final void call(Object obj) {
                WebViewAct.m10496X1(str, strArr, (c) obj);
            }
        }));
        this.f8366e = true;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f8365d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f8364c = mo10488b2();
        olp0 olp0VarMo10489c2 = mo10489c2();
        this.f8365d = olp0VarMo10489c2;
        this.f8364c.C(olp0VarMo10489c2);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f8364c.m15880a0();
    }

    public boolean needBindBillingService() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.a(this.f8365d.f18139C)) {
            this.f8365d.f18139C.onActivityResult(i, i2, intent);
        }
    }

    public void onHomePressed() {
        if (this.f8365d.m19963k()) {
            this.f8365d.m19970w();
        } else {
            super/*com.p1.mobile.android.app.Act*/.onHomePressed();
        }
    }

    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i, keyEvent);
        }
        Runnable runnable = (Runnable) this.f8365d.f18145d.getTag(WebViewBridgeImplementation.f8208a);
        if (runnable != null) {
            runnable.run();
            return true;
        }
        boolean zM19963k = this.f8365d.m19963k();
        olp0 olp0Var = this.f8365d;
        if (zM19963k) {
            olp0Var.m19970w();
        } else {
            if (NullChecker.a(olp0Var) && NullChecker.a(this.f8365d.f18145d)) {
                HashMap<String, String> map = new HashMap<>();
                map.put("step", "onBack");
                olp0 olp0Var2 = this.f8365d;
                olp0Var2.m19955L(olp0Var2.f18145d.getUrl(), map);
            }
            finish();
        }
        return true;
    }

    public String pageId() {
        return "p_intl_android_web_vue";
    }

    public void preCreateView(Bundle bundle) {
        this.f8365d.m19954K(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().m();
        }
        if (!this.f8365d.m19962j()) {
            checkGradientColors();
        } else if (getAppTheme().n(this.f8365d.m19950E())) {
            setTransparentStatusBar();
        } else if (getAppTheme().m()) {
            checkGradientColors();
        }
        if (this.f8365d.m19957N()) {
            setTransparentStatusBar();
        }
        addSwipeBackListener(this);
    }

    public boolean shouldBlockOnCreate(Bundle bundle) {
        return false;
    }

    public boolean shouldBlockOnResume() {
        return m10497Y1() && super.shouldBlockOnResume();
    }

    public boolean shouldBlockOnStart() {
        return m10497Y1() && super.shouldBlockOnResume();
    }
}
