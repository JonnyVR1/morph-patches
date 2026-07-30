package com.p051p1.mobile.putong.p070ui.webview.p073mk;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.WebViewBridgeImplementation;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import org.json.JSONObject;
import p153l.jd00;
import p153l.jtp0;
import p153l.pc00;
import p153l.pd00;
import p153l.psd0;
import p153l.qcj;
import p153l.ujh0;
import p153l.y20;
import p153l.zqw;
import p153l.zwk;

/* JADX INFO: loaded from: classes10.dex */
public class MkWebViewAct extends PutongAct implements ujh0 {

    /* JADX INFO: renamed from: c */
    public ResultReceiver f55647c;

    /* JADX INFO: renamed from: d */
    public jd00 f55648d;

    /* JADX INFO: renamed from: e */
    public pd00 f55649e;

    /* JADX INFO: renamed from: f */
    public boolean f55650f;

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m81416Y1(String str, JSONObject jSONObject, C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            jtp0.m146915e("PV", null, str, jSONObject);
        } else if (c4470c == C4470c.f16268j) {
            jtp0.m146915e("PD", null, str, jSONObject);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    private boolean m81417Z1() {
        return zwk.m221901a(this.f55649e.f151662n);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m81418a2(Context context, String str, ResultReceiver resultReceiver) {
        return m81421d2(context, "", str, true, true, resultReceiver);
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m81419b2(Context context, String str, String str2) {
        return m81420c2(context, str, str2, true);
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m81420c2(Context context, String str, String str2, boolean z) {
        return m81422e2(context, str, str2, z, false, true, null);
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m81421d2(Context context, String str, String str2, boolean z, boolean z2, ResultReceiver resultReceiver) {
        return m81422e2(context, str, str2, z, z2, true, resultReceiver);
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m81422e2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, ResultReceiver resultReceiver) {
        return m81423g2(context, str, str2, z, z2, z3, false, resultReceiver);
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m81423g2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, ResultReceiver resultReceiver) {
        Intent intent = new Intent(context, (Class<?>) MkWebViewAct.class);
        intent.putExtra("title", str);
        String strM171605a = pc00.m171605a(str2);
        intent.putExtra("url", strM171605a);
        intent.putExtra("advanceInitJsBridge", z);
        intent.putExtra("hideNavigationBar", z2);
        intent.putExtra("ARG_RESULT_RECEIVER", resultReceiver);
        intent.putExtra("swipeBack", z3);
        intent.putExtra("needParseUrl", z4);
        zqw.m221059k(intent, strM171605a);
        return intent;
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m81424h2(Context context, boolean z, String str, String str2) {
        return m81423g2(context, str, str2, true, false, true, z, null);
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

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: renamed from: i2 */
    public jd00 mo81371i2() {
        return new jd00(this);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f55649e.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f55648d = mo81371i2();
        pd00 pd00VarMo81372k2 = mo81372k2();
        this.f55649e = pd00VarMo81372k2;
        this.f55648d.mo52715C(pd00VarMo81372k2);
        this.f55647c = (ResultReceiver) getIntent().getParcelableExtra("ARG_RESULT_RECEIVER");
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f55648d.mo40473a0();
    }

    /* JADX INFO: renamed from: k2 */
    public pd00 mo81372k2() {
        return new pd00(this);
    }

    /* JADX INFO: renamed from: l2 */
    public ResultReceiver m81425l2() {
        return this.f55647c;
    }

    /* JADX INFO: renamed from: m2 */
    public void m81426m2(final String str, final JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || this.f55650f) {
            return;
        }
        lifecycle().filter(new qcj() { // from class: l.fd00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                C4470c c4470c = (C4470c) obj;
                return Boolean.valueOf(c4470c == C4470c.f16267i || c4470c == C4470c.f16268j);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.gd00
            @Override // p153l.y20
            public final void call(Object obj) {
                MkWebViewAct.m81416Y1(str, jSONObject, (C4470c) obj);
            }
        }));
        this.f55650f = true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m82486a(this.f55649e.f151641B)) {
            this.f55649e.f151641B.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onHomePressed() {
        if (this.f55649e.m171743v()) {
            this.f55649e.m171722A();
        } else {
            super.onHomePressed();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        Runnable runnable = (Runnable) this.f55649e.f151655g.getTag(WebViewBridgeImplementation.f55450a);
        if (runnable != null) {
            runnable.run();
            return true;
        }
        boolean zM171743v = this.f55649e.m171743v();
        pd00 pd00Var = this.f55649e;
        if (zM171743v) {
            pd00Var.m171722A();
        } else {
            if (NullChecker.m82486a(pd00Var) && NullChecker.m82486a(this.f55649e.f151655g)) {
                HashMap<String, String> map = new HashMap<>();
                map.put("step", "onBack");
                pd00 pd00Var2 = this.f55649e;
                pd00Var2.m171737W(pd00Var2.f151655g.getUrl(), map);
            }
            m68056e2();
        }
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_intl_android_web_vue";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f55649e.m171735U(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo102186m();
        }
        if (!this.f55649e.m171742s()) {
            checkGradientColors();
        } else if (getAppTheme().mo134834n(this.f55649e.m171729M())) {
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
        return m81417Z1() && super.shouldBlockOnResume();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return m81417Z1() && super.shouldBlockOnResume();
    }
}
