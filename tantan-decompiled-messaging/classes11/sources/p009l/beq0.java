package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.newui.main.risk.YoungRiskCheckAct;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.AccessTokenMkWebViewAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import l.ceq0;
import l.e30;
import l.eqh0;
import l.mkd0;
import l.qib0;
import l.s7m;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zbi0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class beq0 implements s7m<wdq0> {

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f10039a;

    /* JADX INFO: renamed from: b */
    public VText f10040b;

    /* JADX INFO: renamed from: c */
    public VText_Default_Bold f10041c;

    /* JADX INFO: renamed from: d */
    public VText f10042d;

    /* JADX INFO: renamed from: e */
    public YoungRiskCheckAct f10043e;

    public beq0(YoungRiskCheckAct youngRiskCheckAct) {
        this.f10043e = youngRiskCheckAct;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m11972d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    private void m11973i() {
        zbi0.E(act());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11974C0() {
        return this.f10043e;
    }

    /* JADX INFO: renamed from: e */
    public View m11975e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ceq0.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m11975e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m11978j() {
        act().duringCreated(CoreModule.c.R1.d3("index")).subscribe(mkd0.H(new e30() { // from class: l.zdq0
            public final void call(Object obj) {
                this.f23601a.m11979k((String) obj);
            }
        }, new e30() { // from class: l.aeq0
            public final void call(Object obj) {
                beq0.m11972d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m11979k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        act().startActivity(AccessTokenMkWebViewAct.m10521s2(act(), "我的客服", str, true, false, false, true, true, null));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m11980l(View view) {
        m11978j();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m11981m(View view) {
        m11973i();
    }

    /* JADX INFO: renamed from: n */
    public void m11982n() {
        qib0.G.L0(this.f10039a, "https://auto.tancdn.com/v1/images/eyJpZCI6IlVDNUhCV042RkNSVkpOV1VRSk1UNjJGSjJKQ0IySjE0IiwidyI6OTMzLCJoIjo2MjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTMyNTkzNjQ5OTY0MjkwfQ.png");
        xdl0.E0(this.f10042d, new View.OnClickListener() { // from class: l.ydq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23006a.m11980l(view);
            }
        });
        this.f10040b.setText(i0g0.m16129b0("经平台检测，您的账号使用者疑似为未成年人，当前已暂停功能使用。通过真人实名认证后可恢复正常使用。", vwb.f0(new String[]{"真人实名认证"}), -1728053248, eqh0.c(3)));
    }

    /* JADX INFO: renamed from: p */
    public void m11983p(boolean z) {
        this.f10041c.setBackgroundResource(z ? x2c0.s : x2c0.r);
        this.f10041c.setText(z ? "立即认证" : "审核中");
        xdl0.E0(this.f10041c, new View.OnClickListener() { // from class: l.xdq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22525a.m11981m(view);
            }
        });
        this.f10041c.setClickable(z);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m11977i1(wdq0 wdq0Var) {
    }
}
