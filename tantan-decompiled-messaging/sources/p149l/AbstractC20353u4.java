package p149l;

import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: l.u4 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC20353u4 implements p3m<gi60, hi60> {

    /* JADX INFO: renamed from: a */
    public gi60 f173676a;

    /* JADX INFO: renamed from: c */
    public Act m191645c() {
        return this.f173676a.m126256a();
    }

    /* JADX INFO: renamed from: d */
    public CharSequence m191646d(String str) {
        return String.format(this.f173676a.m126256a().getString(R$string.f27436f), str);
    }

    /* JADX INFO: renamed from: e */
    public String m191647e() {
        return new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(new BigDecimal((m191652l() ? m191657q().getFirstCouponPrice() : m191657q().defaultStockKeepUnit.prices.price) / ((double) n6a.m158032t0(m191657q()))).setScale(1, 0).doubleValue());
    }

    /* JADX INFO: renamed from: f */
    public C8765d.a m191648f() {
        C8765d c8765dM126259d = this.f173676a.m126259d();
        return c8765dM126259d.m53531m() ? c8765dM126259d.m53520b() : c8765dM126259d.m53522d();
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final hi60 mo37497a(gi60 gi60Var) {
        this.f173676a = gi60Var;
        if (m191661v(gi60Var)) {
            mo94417i(this.f173676a);
        }
        if (m191660t(this.f173676a)) {
            mo191650h(this.f173676a);
        }
        if (m191662x(this.f173676a)) {
            mo94418j(this.f173676a);
        }
        if (m191664z(this.f173676a)) {
            m191651k(this.f173676a);
        }
        return this.f173676a.m126260e();
    }

    /* JADX INFO: renamed from: l */
    public boolean m191652l() {
        return this.f173676a.m126259d().m53531m() ? m191655o() : m191656p();
    }

    /* JADX INFO: renamed from: m */
    public boolean m191653m() {
        return CoreModule.m29935P().m94651a().mo33524j3();
    }

    /* JADX INFO: renamed from: n */
    public boolean m191654n() {
        return TEnum.equals(this.f173676a.m126258c(), "alipay");
    }

    /* JADX INFO: renamed from: o */
    public final boolean m191655o() {
        return this.f173676a.m126259d().m53526h();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m191656p() {
        return this.f173676a.m126259d().m53527i();
    }

    /* JADX INFO: renamed from: q */
    public Merchandise m191657q() {
        return m191648f().m53601s();
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final boolean mo37498b(gi60 gi60Var) {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo191659s(gi60 gi60Var) {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m191660t(gi60 gi60Var) {
        return mo191659s(gi60Var) && !this.f173676a.m126260e().m131218f();
    }

    /* JADX INFO: renamed from: u */
    public boolean mo94419u(gi60 gi60Var) {
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m191661v(gi60 gi60Var) {
        return mo94419u(gi60Var) && !this.f173676a.m126260e().m131217e();
    }

    /* JADX INFO: renamed from: w */
    public boolean mo94420w(gi60 gi60Var) {
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m191662x(gi60 gi60Var) {
        return mo94420w(gi60Var) && !this.f173676a.m126260e().m131219g();
    }

    /* JADX INFO: renamed from: y */
    public boolean m191663y(gi60 gi60Var) {
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m191664z(gi60 gi60Var) {
        return m191663y(gi60Var) && !this.f173676a.m126260e().m131220h();
    }

    /* JADX INFO: renamed from: h */
    public void mo191650h(gi60 gi60Var) {
    }

    /* JADX INFO: renamed from: i */
    public void mo94417i(gi60 gi60Var) {
    }

    /* JADX INFO: renamed from: j */
    public void mo94418j(gi60 gi60Var) {
    }

    /* JADX INFO: renamed from: k */
    public void m191651k(gi60 gi60Var) {
    }
}
