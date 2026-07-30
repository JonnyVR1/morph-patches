package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeShowcaseWrapper;
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
import l.c4g0;
import l.cjy;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.roj0;
import l.rwl;
import l.vwb;
import l.y8p;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class q1p implements sxo {

    /* JADX INFO: renamed from: a */
    public final VipNewUiFrag f19515a;

    /* JADX INFO: renamed from: b */
    public List<Merchandise> f19516b;

    /* JADX INFO: renamed from: c */
    public List<Merchandise> f19517c;

    /* JADX INFO: renamed from: d */
    public final PurchaseType f19518d;

    /* JADX INFO: renamed from: e */
    public ProductCategory f19519e;

    /* JADX INFO: renamed from: f */
    public b<roj0> f19520f = b.b();

    /* JADX INFO: renamed from: g */
    public boolean f19521g;

    /* JADX INFO: renamed from: h */
    public Merchandise f19522h;

    /* JADX INFO: renamed from: i */
    public List<d> f19523i;

    /* JADX INFO: renamed from: j */
    public List<d> f19524j;

    /* JADX INFO: renamed from: k */
    public boolean f19525k;

    /* JADX INFO: renamed from: l */
    public boolean f19526l;

    /* JADX INFO: renamed from: m */
    public c4g0 f19527m;

    public q1p(VipNewUiFrag vipNewUiFrag, List<Merchandise> list, List<Merchandise> list2, PurchaseType purchaseType, ProductCategory productCategory) {
        this.f19515a = vipNewUiFrag;
        this.f19516b = list;
        this.f19517c = list2;
        this.f19518d = purchaseType;
        this.f19519e = productCategory;
    }

    /* JADX INFO: renamed from: e */
    public void m21923e(final IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper) {
        if (intlPrivilegeShowcaseWrapper.m11163c() instanceof id40) {
            ((id40) intlPrivilegeShowcaseWrapper.m11163c()).m16605X(this.f19523i, new e30() { // from class: l.i1p
                public final void call(Object obj) {
                    this.f14194a.m21924f(intlPrivilegeShowcaseWrapper, (d) obj);
                }
            }, null, new e30() { // from class: l.k1p
                public final void call(Object obj) {
                    this.f15547a.m21925g((d) obj);
                }
            }, this.f19524j);
        }
        c4g0 c4g0Var = this.f19527m;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f19527m = this.f19515a.duringCreated(this.f19520f).subscribe(mkd0.G(new e30() { // from class: l.m1p
                public final void call(Object obj) {
                    this.f16750a.m21926h(intlPrivilegeShowcaseWrapper, (roj0) obj);
                }
            }));
        }
        if (!this.f19525k) {
            intlPrivilegeShowcaseWrapper.setPromotionVisible(false);
            return;
        }
        intlPrivilegeShowcaseWrapper.setPromotionVisible(true);
        intlPrivilegeShowcaseWrapper.setPromotionTheme(this.f19526l);
        intlPrivilegeShowcaseWrapper.setPromotionListener(new d30() { // from class: l.o1p
            public final void call() {
                this.f17980a.m21927i();
            }
        });
        y8p.j();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m21924f(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, d dVar) {
        if (NullChecker.a(dVar)) {
            this.f19515a.m10993U4(this.f19518d, dVar);
        }
        d.a aVarD = dVar.d() != null ? dVar.d() : dVar.b();
        if (aVarD != null) {
            ((id40) intlPrivilegeShowcaseWrapper.m11163c()).m16612g0(CoreModule.f1534c.f3558G2.m13328k3(aVarD.f()));
            CoreModule.f1534c.f3558G2.f9577V.onNext(j760.a(this.f19518d, dVar));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m21925g(d dVar) {
        if (NullChecker.a(dVar)) {
            CoreModule.f1534c.f3558G2.f9577V.onNext(j760.a(this.f19518d, dVar));
            this.f19515a.m10992T4();
        }
    }

    @Override // p006l.sxo
    public int getItemType() {
        return 4;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m21926h(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, roj0 roj0Var) {
        m21928j();
        m21923e(intlPrivilegeShowcaseWrapper);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m21927i() {
        y8p.e(this.f19515a.act());
        y8p.i();
    }

    /* JADX INFO: renamed from: j */
    public void m21928j() {
        rwl rwlVarZ = cjy.z(this.f19518d.productCategory());
        Act act = this.f19515a.act();
        PurchaseType purchaseType = this.f19518d;
        this.f19523i = rwlVarZ.a(act, purchaseType, purchaseType.productCategory(), this.f19516b);
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.f1534c.f3558G2.f9573R;
        this.f19524j = new ArrayList();
        if (this.f19517c == null || membershipUpgradeInfo == null || !TEnum.equals(CoreModule.f1534c.f3558G2.m13326i3(), this.f19519e)) {
            return;
        }
        List<d> listA = cjy.z(this.f19519e).a(this.f19515a.act(), this.f19518d, this.f19519e, this.f19517c);
        for (MembershipUpgradeDurationInfo membershipUpgradeDurationInfo : membershipUpgradeInfo.duration) {
            for (d dVar : listA) {
                if ((dVar.d() != null ? dVar.d() : dVar.b()).w() == membershipUpgradeDurationInfo.count) {
                    this.f19524j.add(dVar);
                }
            }
        }
        if (!vwb.J(this.f19524j)) {
            d.a aVarD = this.f19523i.get(0).d();
            List<d> list = this.f19523i;
            String strK = (aVarD != null ? list.get(0).d() : list.get(0).b()).k();
            for (d dVar2 : this.f19524j) {
                dVar2.v(false);
                if (dVar2.d() == null) {
                    dVar2.b().V(strK);
                } else {
                    dVar2.d().V(strK);
                }
            }
        }
        if (vwb.J(this.f19524j) || TEnum.equals(this.f19523i.get(0).c().category, "tttSvipGoogleplayFreeTrial")) {
            return;
        }
        Iterator<d> it = this.f19523i.iterator();
        while (it.hasNext()) {
            it.next().v(false);
        }
        this.f19524j.get(0).v(true);
        this.f19515a.m10993U4(this.f19518d, this.f19524j.get(0));
    }

    /* JADX INFO: renamed from: k */
    public void m21929k(List<Merchandise> list, List<Merchandise> list2) {
        this.f19516b = list;
        this.f19517c = list2;
    }
}
