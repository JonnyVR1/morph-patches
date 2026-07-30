package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeShowcaseWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import l.c4g0;
import l.cjy;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.rwl;
import l.vwb;
import l.y8p;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class r1p implements txo {

    /* JADX INFO: renamed from: a */
    public final IntlVipNewUiFrag f20241a;

    /* JADX INFO: renamed from: b */
    public List<Merchandise> f20242b;

    /* JADX INFO: renamed from: c */
    public List<Merchandise> f20243c;

    /* JADX INFO: renamed from: d */
    public final PurchaseType f20244d;

    /* JADX INFO: renamed from: e */
    public ProductCategory f20245e;

    /* JADX INFO: renamed from: f */
    public b<Unit> f20246f = b.b();

    /* JADX INFO: renamed from: g */
    public boolean f20247g;

    /* JADX INFO: renamed from: h */
    public Merchandise f20248h;

    /* JADX INFO: renamed from: i */
    public List<d> f20249i;

    /* JADX INFO: renamed from: j */
    public List<d> f20250j;

    /* JADX INFO: renamed from: k */
    public boolean f20251k;

    /* JADX INFO: renamed from: l */
    public boolean f20252l;

    /* JADX INFO: renamed from: m */
    public c4g0 f20253m;

    public r1p(IntlVipNewUiFrag intlVipNewUiFrag, List<Merchandise> list, List<Merchandise> list2, PurchaseType purchaseType, ProductCategory productCategory) {
        this.f20241a = intlVipNewUiFrag;
        this.f20242b = list;
        this.f20243c = list2;
        this.f20244d = purchaseType;
        this.f20245e = productCategory;
    }

    /* JADX INFO: renamed from: e */
    public void m22596e(final IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper) {
        if (intlPrivilegeShowcaseWrapper.m9962c() instanceof id40) {
            ((id40) intlPrivilegeShowcaseWrapper.m9962c()).m16605X(this.f20249i, new e30() { // from class: l.j1p
                public final void call(Object obj) {
                    this.f14958a.m22597f(intlPrivilegeShowcaseWrapper, (d) obj);
                }
            }, null, new e30() { // from class: l.l1p
                public final void call(Object obj) {
                    this.f16180a.m22598g((d) obj);
                }
            }, this.f20250j);
        }
        c4g0 c4g0Var = this.f20253m;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f20253m = this.f20241a.duringCreated(this.f20246f).subscribe(mkd0.G(new e30() { // from class: l.n1p
                public final void call(Object obj) {
                    this.f17445a.m22599h(intlPrivilegeShowcaseWrapper, (Unit) obj);
                }
            }));
        }
        if (!this.f20251k) {
            intlPrivilegeShowcaseWrapper.setPromotionVisible(false);
            return;
        }
        intlPrivilegeShowcaseWrapper.setPromotionVisible(true);
        intlPrivilegeShowcaseWrapper.setPromotionTheme(this.f20252l);
        intlPrivilegeShowcaseWrapper.setPromotionListener(new d30() { // from class: l.p1p
            public final void call() {
                this.f18555a.m22600i();
            }
        });
        y8p.j();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m22597f(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, d dVar) {
        if (NullChecker.a(dVar)) {
            this.f20241a.m9794W4(this.f20244d, dVar);
        }
        d.a aVarD = dVar.d() != null ? dVar.d() : dVar.b();
        if (aVarD != null) {
            ((id40) intlPrivilegeShowcaseWrapper.m9962c()).m16612g0(CoreModule.f1534c.f3558G2.m13328k3(aVarD.f()));
            CoreModule.f1534c.f3558G2.f9577V.onNext(j760.a(this.f20244d, dVar));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m22598g(d dVar) {
        if (NullChecker.a(dVar)) {
            CoreModule.f1534c.f3558G2.f9577V.onNext(j760.a(this.f20244d, dVar));
            this.f20241a.m9792U4();
        }
    }

    @Override // p006l.txo
    public int getItemType() {
        return 4;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m22599h(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, Unit unit) {
        m22601j();
        m22596e(intlPrivilegeShowcaseWrapper);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m22600i() {
        y8p.e(this.f20241a.act());
        y8p.i();
    }

    /* JADX INFO: renamed from: j */
    public void m22601j() {
        rwl rwlVarZ = cjy.z(this.f20244d.productCategory());
        Act act = this.f20241a.act();
        PurchaseType purchaseType = this.f20244d;
        this.f20249i = rwlVarZ.a(act, purchaseType, purchaseType.productCategory(), this.f20242b);
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.f1534c.f3558G2.f9573R;
        this.f20250j = new ArrayList();
        if (this.f20243c == null || membershipUpgradeInfo == null || !TEnum.equals(CoreModule.f1534c.f3558G2.m13326i3(), this.f20245e)) {
            return;
        }
        List<d> listA = cjy.z(this.f20245e).a(this.f20241a.act(), this.f20244d, this.f20245e, this.f20243c);
        for (MembershipUpgradeDurationInfo membershipUpgradeDurationInfo : membershipUpgradeInfo.duration) {
            for (d dVar : listA) {
                if ((dVar.d() != null ? dVar.d() : dVar.b()).w() == membershipUpgradeDurationInfo.count) {
                    this.f20250j.add(dVar);
                }
            }
        }
        if (!vwb.J(this.f20250j)) {
            d.a aVarD = this.f20249i.get(0).d();
            List<d> list = this.f20249i;
            String strK = (aVarD != null ? list.get(0).d() : list.get(0).b()).k();
            for (d dVar2 : this.f20250j) {
                dVar2.v(false);
                if (dVar2.d() == null) {
                    dVar2.b().V(strK);
                } else {
                    dVar2.d().V(strK);
                }
            }
        }
        if (vwb.J(this.f20250j) || TEnum.equals(this.f20249i.get(0).c().category, "tttSvipGoogleplayFreeTrial")) {
            return;
        }
        Iterator<d> it = this.f20249i.iterator();
        while (it.hasNext()) {
            it.next().v(false);
        }
        this.f20250j.get(0).v(true);
        this.f20241a.m9794W4(this.f20244d, this.f20250j.get(0));
    }

    /* JADX INFO: renamed from: k */
    public void m22602k(List<Merchandise> list, List<Merchandise> list2) {
        this.f20242b = list;
        this.f20243c = list2;
    }
}
