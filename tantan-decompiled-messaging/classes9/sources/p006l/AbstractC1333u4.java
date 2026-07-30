package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import l.n6a;
import l.p3m;

/* JADX INFO: renamed from: l.u4 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class AbstractC1333u4 implements p3m<gi60, hi60> {

    /* JADX INFO: renamed from: a */
    public gi60 f22457a;

    /* JADX INFO: renamed from: c */
    public Act m24943c() {
        return this.f22457a.m15800a();
    }

    /* JADX INFO: renamed from: d */
    public CharSequence m24944d(String str) {
        return String.format(this.f22457a.m15800a().getString(R.string.f), str);
    }

    /* JADX INFO: renamed from: e */
    public String m24945e() {
        return new DecimalFormat("0.0").format(new BigDecimal((m24950l() ? m24955q().getFirstCouponPrice() : m24955q().defaultStockKeepUnit.prices.price) / ((double) n6a.t0(m24955q()))).setScale(1, 0).doubleValue());
    }

    /* JADX INFO: renamed from: f */
    public d.a m24946f() {
        d dVarM15803d = this.f22457a.m15803d();
        return dVarM15803d.m() ? dVarM15803d.b() : dVarM15803d.d();
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final hi60 m24941a(gi60 gi60Var) {
        this.f22457a = gi60Var;
        if (m24959v(gi60Var)) {
            mo11677i(this.f22457a);
        }
        if (m24958t(this.f22457a)) {
            mo24948h(this.f22457a);
        }
        if (m24960x(this.f22457a)) {
            mo11678j(this.f22457a);
        }
        if (m24962z(this.f22457a)) {
            m24949k(this.f22457a);
        }
        return this.f22457a.m15804e();
    }

    /* JADX INFO: renamed from: l */
    public boolean m24950l() {
        return this.f22457a.m15803d().m() ? m24953o() : m24954p();
    }

    /* JADX INFO: renamed from: m */
    public boolean m24951m() {
        return CoreModule.m1854P().m11706a().m5461j3();
    }

    /* JADX INFO: renamed from: n */
    public boolean m24952n() {
        return TEnum.equals(this.f22457a.m15802c(), "alipay");
    }

    /* JADX INFO: renamed from: o */
    public final boolean m24953o() {
        return this.f22457a.m15803d().h();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m24954p() {
        return this.f22457a.m15803d().i();
    }

    /* JADX INFO: renamed from: q */
    public Merchandise m24955q() {
        return m24946f().s();
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final boolean m24942b(gi60 gi60Var) {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo24957s(gi60 gi60Var) {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m24958t(gi60 gi60Var) {
        return mo24957s(gi60Var) && !this.f22457a.m15804e().m16224f();
    }

    /* JADX INFO: renamed from: u */
    public boolean mo11679u(gi60 gi60Var) {
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m24959v(gi60 gi60Var) {
        return mo11679u(gi60Var) && !this.f22457a.m15804e().m16223e();
    }

    /* JADX INFO: renamed from: w */
    public boolean mo11680w(gi60 gi60Var) {
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m24960x(gi60 gi60Var) {
        return mo11680w(gi60Var) && !this.f22457a.m15804e().m16225g();
    }

    /* JADX INFO: renamed from: y */
    public boolean m24961y(gi60 gi60Var) {
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m24962z(gi60 gi60Var) {
        return m24961y(gi60Var) && !this.f22457a.m15804e().m16226h();
    }

    /* JADX INFO: renamed from: h */
    public void mo24948h(gi60 gi60Var) {
    }

    /* JADX INFO: renamed from: i */
    public void mo11677i(gi60 gi60Var) {
    }

    /* JADX INFO: renamed from: j */
    public void mo11678j(gi60 gi60Var) {
    }

    /* JADX INFO: renamed from: k */
    public void m24949k(gi60 gi60Var) {
    }
}
