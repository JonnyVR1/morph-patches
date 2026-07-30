package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.main.risk.YoungRiskCheckAct;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.AccessTokenMkWebViewAct;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class gnq0 implements iam<bnq0> {

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f105131a;

    /* JADX INFO: renamed from: b */
    public VText f105132b;

    /* JADX INFO: renamed from: c */
    public VText_Default_Bold f105133c;

    /* JADX INFO: renamed from: d */
    public VText f105134d;

    /* JADX INFO: renamed from: e */
    public YoungRiskCheckAct f105135e;

    public gnq0(YoungRiskCheckAct youngRiskCheckAct) {
        this.f105135e = youngRiskCheckAct;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m130968d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    private void m130969i() {
        zki0.m220076E(act());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f105135e;
    }

    /* JADX INFO: renamed from: e */
    public View m130970e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hnq0.m136271b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m130970e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m130972j() {
        act().duringCreated(CoreModule.f18264c.f20344R1.m177733d3(FirebaseAnalytics.Param.INDEX)).subscribe(psd0.m173597H(new y20() { // from class: l.enq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94802a.m130973k((String) obj);
            }
        }, new y20() { // from class: l.fnq0
            @Override // p153l.y20
            public final void call(Object obj) {
                gnq0.m130968d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m130973k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        act().startActivity(AccessTokenMkWebViewAct.m81366u2(act(), "我的客服", str, true, false, false, true, true, null));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m130974l(View view) {
        m130972j();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m130975m(View view) {
        m130969i();
    }

    /* JADX INFO: renamed from: n */
    public void m130976n() {
        uqb0.f180374G.m127115L0(this.f105131a, "https://auto.tancdn.com/v1/images/eyJpZCI6IlVDNUhCV042RkNSVkpOV1VRSk1UNjJGSjJKQ0IySjE0IiwidyI6OTMzLCJoIjo2MjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTMyNTkzNjQ5OTY0MjkwfQ.png");
        bnl0.m105509E0(this.f105134d, new View.OnClickListener() { // from class: l.dnq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89822a.m130974l(view);
            }
        });
        this.f105132b.setText(q8g0.m175796b0("经平台检测，您的账号使用者疑似为未成年人，当前已暂停功能使用。通过真人实名认证后可恢复正常使用。", jyb.m147507f0("真人实名认证"), -1728053248, lyh0.m156283c(3)));
    }

    /* JADX INFO: renamed from: p */
    public void m130977p(boolean z) {
        this.f105133c.setBackgroundResource(z ? dbc0.f87432t : dbc0.f87399s);
        this.f105133c.setText(z ? "立即认证" : "审核中");
        bnl0.m105509E0(this.f105133c, new View.OnClickListener() { // from class: l.cnq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82756a.m130975m(view);
            }
        });
        this.f105133c.setClickable(z);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bnq0 bnq0Var) {
    }
}
