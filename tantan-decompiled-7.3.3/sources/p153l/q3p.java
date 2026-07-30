package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p051p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeShowcaseWrapper;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes12.dex */
public class q3p implements szo {

    /* JADX INFO: renamed from: a */
    public final VipNewUiFrag f155462a;

    /* JADX INFO: renamed from: b */
    public List<Merchandise> f155463b;

    /* JADX INFO: renamed from: c */
    public List<Merchandise> f155464c;

    /* JADX INFO: renamed from: d */
    public final PurchaseType f155465d;

    /* JADX INFO: renamed from: e */
    public ProductCategory f155466e;

    /* JADX INFO: renamed from: f */
    public C22508b<uxj0> f155467f = C22508b.m222767b();

    /* JADX INFO: renamed from: g */
    public boolean f155468g;

    /* JADX INFO: renamed from: h */
    public Merchandise f155469h;

    /* JADX INFO: renamed from: i */
    public List<C8928d> f155470i;

    /* JADX INFO: renamed from: j */
    public List<C8928d> f155471j;

    /* JADX INFO: renamed from: k */
    public boolean f155472k;

    /* JADX INFO: renamed from: l */
    public boolean f155473l;

    /* JADX INFO: renamed from: m */
    public kcg0 f155474m;

    public q3p(VipNewUiFrag vipNewUiFrag, List<Merchandise> list, List<Merchandise> list2, PurchaseType purchaseType, ProductCategory productCategory) {
        this.f155462a = vipNewUiFrag;
        this.f155463b = list;
        this.f155464c = list2;
        this.f155465d = purchaseType;
        this.f155466e = productCategory;
    }

    /* JADX INFO: renamed from: e */
    public void m175153e(final IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper) {
        if (intlPrivilegeShowcaseWrapper.m58854c() instanceof wl40) {
            ((wl40) intlPrivilegeShowcaseWrapper.m58854c()).m206925X(this.f155470i, new y20() { // from class: l.i3p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f112772a.m175154f(intlPrivilegeShowcaseWrapper, (C8928d) obj);
                }
            }, null, new y20() { // from class: l.k3p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f123749a.m175155g((C8928d) obj);
                }
            }, this.f155471j);
        }
        kcg0 kcg0Var = this.f155474m;
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            this.f155474m = this.f155462a.duringCreated(this.f155467f).subscribe(psd0.m173596G(new y20() { // from class: l.m3p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f134683a.m175156h(intlPrivilegeShowcaseWrapper, (uxj0) obj);
                }
            }));
        }
        if (!this.f155472k) {
            intlPrivilegeShowcaseWrapper.setPromotionVisible(false);
            return;
        }
        intlPrivilegeShowcaseWrapper.setPromotionVisible(true);
        intlPrivilegeShowcaseWrapper.setPromotionTheme(this.f155473l);
        intlPrivilegeShowcaseWrapper.setPromotionListener(new x20() { // from class: l.o3p
            @Override // p153l.x20
            public final void call() {
                this.f144847a.m175157i();
            }
        });
        yap.m214905j();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m175154f(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, C8928d c8928d) {
        if (NullChecker.m82486a(c8928d)) {
            this.f155462a.m58685U4(this.f155465d, c8928d);
        }
        C8928d.a aVarM54705d = c8928d.m54705d() != null ? c8928d.m54705d() : c8928d.m54703b();
        if (aVarM54705d != null) {
            ((wl40) intlPrivilegeShowcaseWrapper.m58854c()).m206931g0(CoreModule.f18264c.f20311G2.m153653k3(aVarM54705d.m54762f()));
            CoreModule.f18264c.f20311G2.f131287V.onNext(pf60.m172085a(this.f155465d, c8928d));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m175155g(C8928d c8928d) {
        if (NullChecker.m82486a(c8928d)) {
            CoreModule.f18264c.f20311G2.f131287V.onNext(pf60.m172085a(this.f155465d, c8928d));
            this.f155462a.m58684T4();
        }
    }

    @Override // p153l.szo
    public int getItemType() {
        return 4;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m175156h(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, uxj0 uxj0Var) {
        m175158j();
        m175153e(intlPrivilegeShowcaseWrapper);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m175157i() {
        yap.m214903e(this.f155462a.act());
        yap.m214904i();
    }

    /* JADX INFO: renamed from: j */
    public void m175158j() {
        jzl jzlVarM221275z = zry.m221275z(this.f155465d.productCategory());
        Act act = this.f155462a.act();
        PurchaseType purchaseType = this.f155465d;
        this.f155470i = jzlVarM221275z.mo147671a(act, purchaseType, purchaseType.productCategory(), this.f155463b);
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.f18264c.f20311G2.f131283R;
        this.f155471j = new ArrayList();
        if (this.f155464c == null || membershipUpgradeInfo == null || !TEnum.equals(CoreModule.f18264c.f20311G2.m153651i3(), this.f155466e)) {
            return;
        }
        List<C8928d> listMo147671a = zry.m221275z(this.f155466e).mo147671a(this.f155462a.act(), this.f155465d, this.f155466e, this.f155464c);
        for (MembershipUpgradeDurationInfo membershipUpgradeDurationInfo : membershipUpgradeInfo.duration) {
            for (C8928d c8928d : listMo147671a) {
                if ((c8928d.m54705d() != null ? c8928d.m54705d() : c8928d.m54703b()).m54788w() == membershipUpgradeDurationInfo.count) {
                    this.f155471j.add(c8928d);
                }
            }
        }
        if (!jyb.m147479J(this.f155471j)) {
            C8928d.a aVarM54705d = this.f155470i.get(0).m54705d();
            List<C8928d> list = this.f155470i;
            String strM54772k = (aVarM54705d != null ? list.get(0).m54705d() : list.get(0).m54703b()).m54772k();
            for (C8928d c8928d2 : this.f155471j) {
                c8928d2.m54723v(false);
                if (c8928d2.m54705d() == null) {
                    c8928d2.m54703b().m54749V(strM54772k);
                } else {
                    c8928d2.m54705d().m54749V(strM54772k);
                }
            }
        }
        if (jyb.m147479J(this.f155471j) || TEnum.equals(this.f155470i.get(0).m54704c().category, ProductCategory.tttSvipGoogleplayFreeTrial)) {
            return;
        }
        Iterator<C8928d> it = this.f155470i.iterator();
        while (it.hasNext()) {
            it.next().m54723v(false);
        }
        this.f155471j.get(0).m54723v(true);
        this.f155462a.m58685U4(this.f155465d, this.f155471j.get(0));
    }

    /* JADX INFO: renamed from: k */
    public void m175159k(List<Merchandise> list, List<Merchandise> list2) {
        this.f155463b = list;
        this.f155464c = list2;
    }
}
