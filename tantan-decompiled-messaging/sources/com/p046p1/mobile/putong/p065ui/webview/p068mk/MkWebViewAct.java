package com.p046p1.mobile.putong.p065ui.webview.p068mk;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.WebViewBridgeImplementation;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import org.json.JSONObject;
import p149l.a500;
import p149l.aow;
import p149l.e30;
import p149l.fkp0;
import p149l.juk;
import p149l.mbh0;
import p149l.mkd0;
import p149l.s300;
import p149l.u400;
import p149l.w9j;

/* JADX INFO: loaded from: classes11.dex */
public class MkWebViewAct extends PutongAct implements mbh0 {

    /* JADX INFO: renamed from: c */
    public ResultReceiver f54799c;

    /* JADX INFO: renamed from: d */
    public u400 f54800d;

    /* JADX INFO: renamed from: e */
    public a500 f54801e;

    /* JADX INFO: renamed from: f */
    public boolean f54802f;

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m80233X1(String str, JSONObject jSONObject, C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            fkp0.m121885e("PV", null, str, jSONObject);
        } else if (c4319c == C4319c.f15549j) {
            fkp0.m121885e("PD", null, str, jSONObject);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    private boolean m80234Y1() {
        return juk.m143319a(this.f54801e.f67608n);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m80235Z1(Context context, String str, ResultReceiver resultReceiver) {
        return m80238c2(context, "", str, true, true, resultReceiver);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m80236a2(Context context, String str, String str2) {
        return m80237b2(context, str, str2, true);
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m80237b2(Context context, String str, String str2, boolean z) {
        return m80239d2(context, str, str2, z, false, true, null);
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m80238c2(Context context, String str, String str2, boolean z, boolean z2, ResultReceiver resultReceiver) {
        return m80239d2(context, str, str2, z, z2, true, resultReceiver);
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m80239d2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, ResultReceiver resultReceiver) {
        return m80240e2(context, str, str2, z, z2, z3, false, resultReceiver);
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m80240e2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, ResultReceiver resultReceiver) {
        Intent intent = new Intent(context, (Class<?>) MkWebViewAct.class);
        intent.putExtra("title", str);
        String strM182089a = s300.m182089a(str2);
        intent.putExtra("url", strM182089a);
        intent.putExtra("advanceInitJsBridge", z);
        intent.putExtra("hideNavigationBar", z2);
        intent.putExtra("ARG_RESULT_RECEIVER", resultReceiver);
        intent.putExtra("swipeBack", z3);
        intent.putExtra("needParseUrl", z4);
        aow.m97995j(intent, strM182089a);
        return intent;
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m80241g2(Context context, boolean z, String str, String str2) {
        return m80240e2(context, str, str2, true, false, true, z, null);
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

    /* JADX INFO: renamed from: h2 */
    public u400 mo80187h2() {
        return new u400(this);
    }

    /* JADX INFO: renamed from: i2 */
    public a500 mo80188i2() {
        return new a500(this);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f54801e.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f54800d = mo80187h2();
        a500 a500VarMo80188i2 = mo80188i2();
        this.f54801e = a500VarMo80188i2;
        this.f54800d.mo51532C(a500VarMo80188i2);
        this.f54799c = (ResultReceiver) getIntent().getParcelableExtra("ARG_RESULT_RECEIVER");
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f54800d.mo39470a0();
    }

    /* JADX INFO: renamed from: k2 */
    public ResultReceiver m80242k2() {
        return this.f54799c;
    }

    /* JADX INFO: renamed from: l2 */
    public void m80243l2(final String str, final JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || this.f54802f) {
            return;
        }
        lifecycle().filter(new w9j() { // from class: l.q400
            @Override // p149l.w9j
            public final Object call(Object obj) {
                C4319c c4319c = (C4319c) obj;
                return Boolean.valueOf(c4319c == C4319c.f15548i || c4319c == C4319c.f15549j);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.r400
            @Override // p149l.e30
            public final void call(Object obj) {
                MkWebViewAct.m80233X1(str, jSONObject, (C4319c) obj);
            }
        }));
        this.f54802f = true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m81303a(this.f54801e.f67587B)) {
            this.f54801e.f67587B.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onHomePressed() {
        if (this.f54801e.m94998v()) {
            this.f54801e.m94976A();
        } else {
            super.onHomePressed();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        Runnable runnable = (Runnable) this.f54801e.f67601g.getTag(WebViewBridgeImplementation.f54602a);
        if (runnable != null) {
            runnable.run();
            return true;
        }
        boolean zM94998v = this.f54801e.m94998v();
        a500 a500Var = this.f54801e;
        if (zM94998v) {
            a500Var.m94976A();
        } else {
            if (NullChecker.m81303a(a500Var) && NullChecker.m81303a(this.f54801e.f67601g)) {
                HashMap<String, String> map = new HashMap<>();
                map.put("step", "onBack");
                a500 a500Var2 = this.f54801e;
                a500Var2.m94991W(a500Var2.f67601g.getUrl(), map);
            }
            m66873d2();
        }
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_intl_android_web_vue";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f54801e.m94989U(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo134126m();
        }
        if (!this.f54801e.m94996s()) {
            checkGradientColors();
        } else if (getAppTheme().mo105498n(this.f54801e.m94983M())) {
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
        return m80234Y1() && super.shouldBlockOnResume();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return m80234Y1() && super.shouldBlockOnResume();
    }
}
