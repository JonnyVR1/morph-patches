package com.p000p1.mobile.putong.p004ui.webview.p007mk;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.WebViewBridgeImplementation;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.aow;
import l.e30;
import l.mbh0;
import l.mkd0;
import l.w9j;
import org.json.JSONObject;
import p009l.a500;
import p009l.fkp0;
import p009l.juk;
import p009l.s300;
import p009l.u400;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MkWebViewAct extends PutongAct implements mbh0 {

    /* JADX INFO: renamed from: c */
    public ResultReceiver f8405c;

    /* JADX INFO: renamed from: d */
    public u400 f8406d;

    /* JADX INFO: renamed from: e */
    public a500 f8407e;

    /* JADX INFO: renamed from: f */
    public boolean f8408f;

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m10580X1(String str, JSONObject jSONObject, c cVar) {
        if (cVar == c.i) {
            fkp0.m14496e("PV", null, str, jSONObject);
        } else if (cVar == c.j) {
            fkp0.m14496e("PD", null, str, jSONObject);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    private boolean m10581Y1() {
        return juk.m17217a(this.f8407e.f9236n);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m10582Z1(Context context, String str, ResultReceiver resultReceiver) {
        return m10585c2(context, "", str, true, true, resultReceiver);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m10583a2(Context context, String str, String str2) {
        return m10584b2(context, str, str2, true);
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m10584b2(Context context, String str, String str2, boolean z) {
        return m10586d2(context, str, str2, z, false, true, null);
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m10585c2(Context context, String str, String str2, boolean z, boolean z2, ResultReceiver resultReceiver) {
        return m10586d2(context, str, str2, z, z2, true, resultReceiver);
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m10586d2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, ResultReceiver resultReceiver) {
        return m10587e2(context, str, str2, z, z2, z3, false, resultReceiver);
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m10587e2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, ResultReceiver resultReceiver) {
        Intent intent = new Intent(context, (Class<?>) MkWebViewAct.class);
        intent.putExtra("title", str);
        String strM21983a = s300.m21983a(str2);
        intent.putExtra("url", strM21983a);
        intent.putExtra("advanceInitJsBridge", z);
        intent.putExtra("hideNavigationBar", z2);
        intent.putExtra("ARG_RESULT_RECEIVER", resultReceiver);
        intent.putExtra("swipeBack", z3);
        intent.putExtra("needParseUrl", z4);
        aow.j(intent, strM21983a);
        return intent;
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m10588g2(Context context, boolean z, String str, String str2) {
        return m10587e2(context, str, str2, true, false, true, z, null);
    }

    /* JADX INFO: renamed from: D0 */
    public void m10589D0(boolean z, float f, int i) {
    }

    /* JADX INFO: renamed from: E0 */
    public void m10590E0() {
    }

    /* JADX INFO: renamed from: O */
    public void m10591O() {
    }

    /* JADX INFO: renamed from: Z */
    public void m10592Z() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void applyOverrideConfiguration(Configuration configuration) {
        super/*android.view.ContextThemeWrapper*/.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: renamed from: h2 */
    public u400 mo10525h2() {
        return new u400(this);
    }

    /* JADX INFO: renamed from: i2 */
    public a500 mo10526i2() {
        return new a500(this);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f8407e.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f8406d = mo10525h2();
        a500 a500VarMo10526i2 = mo10526i2();
        this.f8407e = a500VarMo10526i2;
        this.f8406d.C(a500VarMo10526i2);
        this.f8405c = (ResultReceiver) getIntent().getParcelableExtra("ARG_RESULT_RECEIVER");
    }

    public void initSubscription() {
        super.initSubscription();
        this.f8406d.m22742a0();
    }

    /* JADX INFO: renamed from: k2 */
    public ResultReceiver m10593k2() {
        return this.f8405c;
    }

    /* JADX INFO: renamed from: l2 */
    public void m10594l2(final String str, final JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || this.f8408f) {
            return;
        }
        lifecycle().filter(new w9j() { // from class: l.q400
            public final Object call(Object obj) {
                c cVar = (c) obj;
                return Boolean.valueOf(cVar == c.i || cVar == c.j);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.r400
            public final void call(Object obj) {
                MkWebViewAct.m10580X1(str, jSONObject, (c) obj);
            }
        }));
        this.f8408f = true;
    }

    public boolean needBindBillingService() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.a(this.f8407e.f9215B)) {
            this.f8407e.f9215B.onActivityResult(i, i2, intent);
        }
    }

    public void onHomePressed() {
        if (this.f8407e.m11233v()) {
            this.f8407e.m11209A();
        } else {
            super/*com.p1.mobile.android.app.Act*/.onHomePressed();
        }
    }

    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super/*androidx.appcompat.app.AppCompatActivity*/.onKeyDown(i, keyEvent);
        }
        Runnable runnable = (Runnable) this.f8407e.f9229g.getTag(WebViewBridgeImplementation.f8208a);
        if (runnable != null) {
            runnable.run();
            return true;
        }
        boolean zM11233v = this.f8407e.m11233v();
        a500 a500Var = this.f8407e;
        if (zM11233v) {
            a500Var.m11209A();
        } else {
            if (NullChecker.a(a500Var) && NullChecker.a(this.f8407e.f9229g)) {
                HashMap<String, String> map = new HashMap<>();
                map.put("step", "onBack");
                a500 a500Var2 = this.f8407e;
                a500Var2.m11225W(a500Var2.f9229g.getUrl(), map);
            }
            finish();
        }
        return true;
    }

    public String pageId() {
        return "p_intl_android_web_vue";
    }

    public void preCreateView(Bundle bundle) {
        this.f8407e.m11223U(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().m();
        }
        if (!this.f8407e.m11231s()) {
            checkGradientColors();
        } else if (getAppTheme().n(this.f8407e.m11217M())) {
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
        return m10581Y1() && super.shouldBlockOnResume();
    }

    public boolean shouldBlockOnStart() {
        return m10581Y1() && super.shouldBlockOnResume();
    }
}
