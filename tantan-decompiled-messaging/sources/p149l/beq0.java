package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.main.risk.YoungRiskCheckAct;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.AccessTokenMkWebViewAct;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class beq0 implements s7m<wdq0> {

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f75191a;

    /* JADX INFO: renamed from: b */
    public VText f75192b;

    /* JADX INFO: renamed from: c */
    public VText_Default_Bold f75193c;

    /* JADX INFO: renamed from: d */
    public VText f75194d;

    /* JADX INFO: renamed from: e */
    public YoungRiskCheckAct f75195e;

    public beq0(YoungRiskCheckAct youngRiskCheckAct) {
        this.f75195e = youngRiskCheckAct;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m101364d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    private void m101365i() {
        zbi0.m217856E(act());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f75195e;
    }

    /* JADX INFO: renamed from: e */
    public View m101366e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ceq0.m106346b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m101366e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m101368j() {
        act().duringCreated(CoreModule.f17545c.f19602R1.m151139d3(FirebaseAnalytics.Param.INDEX)).subscribe(mkd0.m154956H(new e30() { // from class: l.zdq0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202702a.m101369k((String) obj);
            }
        }, new e30() { // from class: l.aeq0
            @Override // p149l.e30
            public final void call(Object obj) {
                beq0.m101364d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m101369k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        act().startActivity(AccessTokenMkWebViewAct.m80183s2(act(), "我的客服", str, true, false, false, true, true, null));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m101370l(View view) {
        m101368j();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m101371m(View view) {
        m101365i();
    }

    /* JADX INFO: renamed from: n */
    public void m101372n() {
        qib0.f154691G.m102331L0(this.f75191a, "https://auto.tancdn.com/v1/images/eyJpZCI6IlVDNUhCV042RkNSVkpOV1VRSk1UNjJGSjJKQ0IySjE0IiwidyI6OTMzLCJoIjo2MjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTMyNTkzNjQ5OTY0MjkwfQ.png");
        xdl0.m208329E0(this.f75194d, new View.OnClickListener() { // from class: l.ydq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197594a.m101370l(view);
            }
        });
        this.f75192b.setText(i0g0.m133861b0("经平台检测，您的账号使用者疑似为未成年人，当前已暂停功能使用。通过真人实名认证后可恢复正常使用。", vwb.m200324f0("真人实名认证"), -1728053248, eqh0.m117752c(3)));
    }

    /* JADX INFO: renamed from: p */
    public void m101373p(boolean z) {
        this.f75193c.setBackgroundResource(z ? x2c0.f190538s : x2c0.f190506r);
        this.f75193c.setText(z ? "立即认证" : "审核中");
        xdl0.m208329E0(this.f75193c, new View.OnClickListener() { // from class: l.xdq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192447a.m101371m(view);
            }
        });
        this.f75193c.setClickable(z);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wdq0 wdq0Var) {
    }
}
