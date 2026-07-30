package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p051p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeShowcaseWrapper;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes12.dex */
public class r3p implements tzo {

    /* JADX INFO: renamed from: a */
    public final IntlVipNewUiFrag f161062a;

    /* JADX INFO: renamed from: b */
    public List<Merchandise> f161063b;

    /* JADX INFO: renamed from: c */
    public List<Merchandise> f161064c;

    /* JADX INFO: renamed from: d */
    public final PurchaseType f161065d;

    /* JADX INFO: renamed from: e */
    public ProductCategory f161066e;

    /* JADX INFO: renamed from: f */
    public C22508b<Unit> f161067f = C22508b.m222767b();

    /* JADX INFO: renamed from: g */
    public boolean f161068g;

    /* JADX INFO: renamed from: h */
    public Merchandise f161069h;

    /* JADX INFO: renamed from: i */
    public List<C8928d> f161070i;

    /* JADX INFO: renamed from: j */
    public List<C8928d> f161071j;

    /* JADX INFO: renamed from: k */
    public boolean f161072k;

    /* JADX INFO: renamed from: l */
    public boolean f161073l;

    /* JADX INFO: renamed from: m */
    public kcg0 f161074m;

    public r3p(IntlVipNewUiFrag intlVipNewUiFrag, List<Merchandise> list, List<Merchandise> list2, PurchaseType purchaseType, ProductCategory productCategory) {
        this.f161062a = intlVipNewUiFrag;
        this.f161063b = list;
        this.f161064c = list2;
        this.f161065d = purchaseType;
        this.f161066e = productCategory;
    }

    /* JADX INFO: renamed from: e */
    public void m179661e(final IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper) {
        if (intlPrivilegeShowcaseWrapper.m57704c() instanceof wl40) {
            ((wl40) intlPrivilegeShowcaseWrapper.m57704c()).m206925X(this.f161070i, new y20() { // from class: l.j3p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118204a.m179662f(intlPrivilegeShowcaseWrapper, (C8928d) obj);
                }
            }, null, new y20() { // from class: l.l3p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f129900a.m179663g((C8928d) obj);
                }
            }, this.f161071j);
        }
        kcg0 kcg0Var = this.f161074m;
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            this.f161074m = this.f161062a.duringCreated(this.f161067f).subscribe(psd0.m173596G(new y20() { // from class: l.n3p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140026a.m179664h(intlPrivilegeShowcaseWrapper, (Unit) obj);
                }
            }));
        }
        if (!this.f161072k) {
            intlPrivilegeShowcaseWrapper.setPromotionVisible(false);
            return;
        }
        intlPrivilegeShowcaseWrapper.setPromotionVisible(true);
        intlPrivilegeShowcaseWrapper.setPromotionTheme(this.f161073l);
        intlPrivilegeShowcaseWrapper.setPromotionListener(new x20() { // from class: l.p3p
            @Override // p153l.x20
            public final void call() {
                this.f150457a.m179665i();
            }
        });
        yap.m214905j();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m179662f(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, C8928d c8928d) {
        if (NullChecker.m82486a(c8928d)) {
            this.f161062a.m57540W4(this.f161065d, c8928d);
        }
        C8928d.a aVarM54705d = c8928d.m54705d() != null ? c8928d.m54705d() : c8928d.m54703b();
        if (aVarM54705d != null) {
            ((wl40) intlPrivilegeShowcaseWrapper.m57704c()).m206931g0(CoreModule.f18264c.f20311G2.m153653k3(aVarM54705d.m54762f()));
            CoreModule.f18264c.f20311G2.f131287V.onNext(pf60.m172085a(this.f161065d, c8928d));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m179663g(C8928d c8928d) {
        if (NullChecker.m82486a(c8928d)) {
            CoreModule.f18264c.f20311G2.f131287V.onNext(pf60.m172085a(this.f161065d, c8928d));
            this.f161062a.m57538U4();
        }
    }

    @Override // p153l.tzo
    public int getItemType() {
        return 4;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m179664h(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, Unit unit) {
        m179666j();
        m179661e(intlPrivilegeShowcaseWrapper);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m179665i() {
        yap.m214903e(this.f161062a.act());
        yap.m214904i();
    }

    /* JADX INFO: renamed from: j */
    public void m179666j() {
        jzl jzlVarM221275z = zry.m221275z(this.f161065d.productCategory());
        Act act = this.f161062a.act();
        PurchaseType purchaseType = this.f161065d;
        this.f161070i = jzlVarM221275z.mo147671a(act, purchaseType, purchaseType.productCategory(), this.f161063b);
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.f18264c.f20311G2.f131283R;
        this.f161071j = new ArrayList();
        if (this.f161064c == null || membershipUpgradeInfo == null || !TEnum.equals(CoreModule.f18264c.f20311G2.m153651i3(), this.f161066e)) {
            return;
        }
        List<C8928d> listMo147671a = zry.m221275z(this.f161066e).mo147671a(this.f161062a.act(), this.f161065d, this.f161066e, this.f161064c);
        for (MembershipUpgradeDurationInfo membershipUpgradeDurationInfo : membershipUpgradeInfo.duration) {
            for (C8928d c8928d : listMo147671a) {
                if ((c8928d.m54705d() != null ? c8928d.m54705d() : c8928d.m54703b()).m54788w() == membershipUpgradeDurationInfo.count) {
                    this.f161071j.add(c8928d);
                }
            }
        }
        if (!jyb.m147479J(this.f161071j)) {
            C8928d.a aVarM54705d = this.f161070i.get(0).m54705d();
            List<C8928d> list = this.f161070i;
            String strM54772k = (aVarM54705d != null ? list.get(0).m54705d() : list.get(0).m54703b()).m54772k();
            for (C8928d c8928d2 : this.f161071j) {
                c8928d2.m54723v(false);
                if (c8928d2.m54705d() == null) {
                    c8928d2.m54703b().m54749V(strM54772k);
                } else {
                    c8928d2.m54705d().m54749V(strM54772k);
                }
            }
        }
        if (jyb.m147479J(this.f161071j) || TEnum.equals(this.f161070i.get(0).m54704c().category, ProductCategory.tttSvipGoogleplayFreeTrial)) {
            return;
        }
        Iterator<C8928d> it = this.f161070i.iterator();
        while (it.hasNext()) {
            it.next().m54723v(false);
        }
        this.f161071j.get(0).m54723v(true);
        this.f161062a.m57540W4(this.f161065d, this.f161071j.get(0));
    }

    /* JADX INFO: renamed from: k */
    public void m179667k(List<Merchandise> list, List<Merchandise> list2) {
        this.f161063b = list;
        this.f161064c = list2;
    }
}
