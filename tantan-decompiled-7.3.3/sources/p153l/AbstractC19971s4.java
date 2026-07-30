package p153l;

import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: l.s4 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC19971s4 implements g6m<lq60, mq60> {

    /* JADX INFO: renamed from: a */
    public lq60 f166047a;

    /* JADX INFO: renamed from: c */
    public Act m184306c() {
        return this.f166047a.m155318a();
    }

    /* JADX INFO: renamed from: d */
    public CharSequence m184307d(String str) {
        return String.format(this.f166047a.m155318a().getString(R$string.f28284f), str);
    }

    /* JADX INFO: renamed from: e */
    public String m184308e() {
        return new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(new BigDecimal((m184313l() ? m184318q().getFirstCouponPrice() : m184318q().defaultStockKeepUnit.prices.price) / ((double) z7a.m218877t0(m184318q()))).setScale(1, 0).doubleValue());
    }

    /* JADX INFO: renamed from: f */
    public C8928d.a m184309f() {
        C8928d c8928dM155321d = this.f166047a.m155321d();
        return c8928dM155321d.m54714m() ? c8928dM155321d.m54703b() : c8928dM155321d.m54705d();
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final mq60 mo38500a(lq60 lq60Var) {
        this.f166047a = lq60Var;
        if (m184322v(lq60Var)) {
            mo114832i(this.f166047a);
        }
        if (m184321t(this.f166047a)) {
            mo184311h(this.f166047a);
        }
        if (m184323x(this.f166047a)) {
            mo114833j(this.f166047a);
        }
        if (m184325z(this.f166047a)) {
            m184312k(this.f166047a);
        }
        return this.f166047a.m155322e();
    }

    /* JADX INFO: renamed from: l */
    public boolean m184313l() {
        return this.f166047a.m155321d().m54714m() ? m184316o() : m184317p();
    }

    /* JADX INFO: renamed from: m */
    public boolean m184314m() {
        return CoreModule.m30933P().m143405a().mo34527j3();
    }

    /* JADX INFO: renamed from: n */
    public boolean m184315n() {
        return TEnum.equals(this.f166047a.m155320c(), "alipay");
    }

    /* JADX INFO: renamed from: o */
    public final boolean m184316o() {
        return this.f166047a.m155321d().m54709h();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m184317p() {
        return this.f166047a.m155321d().m54710i();
    }

    /* JADX INFO: renamed from: q */
    public Merchandise m184318q() {
        return m184309f().m54784s();
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final boolean mo38501b(lq60 lq60Var) {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo184320s(lq60 lq60Var) {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m184321t(lq60 lq60Var) {
        return mo184320s(lq60Var) && !this.f166047a.m155322e().m159470f();
    }

    /* JADX INFO: renamed from: u */
    public boolean mo114834u(lq60 lq60Var) {
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m184322v(lq60 lq60Var) {
        return mo114834u(lq60Var) && !this.f166047a.m155322e().m159469e();
    }

    /* JADX INFO: renamed from: w */
    public boolean mo114835w(lq60 lq60Var) {
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m184323x(lq60 lq60Var) {
        return mo114835w(lq60Var) && !this.f166047a.m155322e().m159471g();
    }

    /* JADX INFO: renamed from: y */
    public boolean m184324y(lq60 lq60Var) {
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m184325z(lq60 lq60Var) {
        return m184324y(lq60Var) && !this.f166047a.m155322e().m159472h();
    }

    /* JADX INFO: renamed from: h */
    public void mo184311h(lq60 lq60Var) {
    }

    /* JADX INFO: renamed from: i */
    public void mo114832i(lq60 lq60Var) {
    }

    /* JADX INFO: renamed from: j */
    public void mo114833j(lq60 lq60Var) {
    }

    /* JADX INFO: renamed from: k */
    public void m184312k(lq60 lq60Var) {
    }
}
