package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p046p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeShowcaseWrapper;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class r1p implements txo {

    /* JADX INFO: renamed from: a */
    public final IntlVipNewUiFrag f157305a;

    /* JADX INFO: renamed from: b */
    public List<Merchandise> f157306b;

    /* JADX INFO: renamed from: c */
    public List<Merchandise> f157307c;

    /* JADX INFO: renamed from: d */
    public final PurchaseType f157308d;

    /* JADX INFO: renamed from: e */
    public ProductCategory f157309e;

    /* JADX INFO: renamed from: f */
    public C22393b<Unit> f157310f = C22393b.m221521b();

    /* JADX INFO: renamed from: g */
    public boolean f157311g;

    /* JADX INFO: renamed from: h */
    public Merchandise f157312h;

    /* JADX INFO: renamed from: i */
    public List<C8765d> f157313i;

    /* JADX INFO: renamed from: j */
    public List<C8765d> f157314j;

    /* JADX INFO: renamed from: k */
    public boolean f157315k;

    /* JADX INFO: renamed from: l */
    public boolean f157316l;

    /* JADX INFO: renamed from: m */
    public c4g0 f157317m;

    public r1p(IntlVipNewUiFrag intlVipNewUiFrag, List<Merchandise> list, List<Merchandise> list2, PurchaseType purchaseType, ProductCategory productCategory) {
        this.f157305a = intlVipNewUiFrag;
        this.f157306b = list;
        this.f157307c = list2;
        this.f157308d = purchaseType;
        this.f157309e = productCategory;
    }

    /* JADX INFO: renamed from: e */
    public void m177537e(final IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper) {
        if (intlPrivilegeShowcaseWrapper.m56521c() instanceof id40) {
            ((id40) intlPrivilegeShowcaseWrapper.m56521c()).m135410X(this.f157313i, new e30() { // from class: l.j1p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f115826a.m177538f(intlPrivilegeShowcaseWrapper, (C8765d) obj);
                }
            }, null, new e30() { // from class: l.l1p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f125675a.m177539g((C8765d) obj);
                }
            }, this.f157314j);
        }
        c4g0 c4g0Var = this.f157317m;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f157317m = this.f157305a.duringCreated(this.f157310f).subscribe(mkd0.m154955G(new e30() { // from class: l.n1p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f136679a.m177540h(intlPrivilegeShowcaseWrapper, (Unit) obj);
                }
            }));
        }
        if (!this.f157315k) {
            intlPrivilegeShowcaseWrapper.setPromotionVisible(false);
            return;
        }
        intlPrivilegeShowcaseWrapper.setPromotionVisible(true);
        intlPrivilegeShowcaseWrapper.setPromotionTheme(this.f157316l);
        intlPrivilegeShowcaseWrapper.setPromotionListener(new d30() { // from class: l.p1p
            @Override // p149l.d30
            public final void call() {
                this.f146752a.m177541i();
            }
        });
        y8p.m213416j();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m177538f(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, C8765d c8765d) {
        if (NullChecker.m81303a(c8765d)) {
            this.f157305a.m56357W4(this.f157308d, c8765d);
        }
        C8765d.a aVarM53522d = c8765d.m53522d() != null ? c8765d.m53522d() : c8765d.m53520b();
        if (aVarM53522d != null) {
            ((id40) intlPrivilegeShowcaseWrapper.m56521c()).m135417g0(CoreModule.f17545c.f19569G2.m105983k3(aVarM53522d.m53579f()));
            CoreModule.f17545c.f19569G2.f80121V.onNext(j760.m140076a(this.f157308d, c8765d));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m177539g(C8765d c8765d) {
        if (NullChecker.m81303a(c8765d)) {
            CoreModule.f17545c.f19569G2.f80121V.onNext(j760.m140076a(this.f157308d, c8765d));
            this.f157305a.m56355U4();
        }
    }

    @Override // p149l.txo
    public int getItemType() {
        return 4;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m177540h(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, Unit unit) {
        m177542j();
        m177537e(intlPrivilegeShowcaseWrapper);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m177541i() {
        y8p.m213414e(this.f157305a.act());
        y8p.m213415i();
    }

    /* JADX INFO: renamed from: j */
    public void m177542j() {
        rwl rwlVarM107330z = cjy.m107330z(this.f157308d.productCategory());
        Act act = this.f157305a.act();
        PurchaseType purchaseType = this.f157308d;
        this.f157313i = rwlVarM107330z.mo107333a(act, purchaseType, purchaseType.productCategory(), this.f157306b);
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.f17545c.f19569G2.f80117R;
        this.f157314j = new ArrayList();
        if (this.f157307c == null || membershipUpgradeInfo == null || !TEnum.equals(CoreModule.f17545c.f19569G2.m105981i3(), this.f157309e)) {
            return;
        }
        List<C8765d> listMo107333a = cjy.m107330z(this.f157309e).mo107333a(this.f157305a.act(), this.f157308d, this.f157309e, this.f157307c);
        for (MembershipUpgradeDurationInfo membershipUpgradeDurationInfo : membershipUpgradeInfo.duration) {
            for (C8765d c8765d : listMo107333a) {
                if ((c8765d.m53522d() != null ? c8765d.m53522d() : c8765d.m53520b()).m53605w() == membershipUpgradeDurationInfo.count) {
                    this.f157314j.add(c8765d);
                }
            }
        }
        if (!vwb.m200296J(this.f157314j)) {
            C8765d.a aVarM53522d = this.f157313i.get(0).m53522d();
            List<C8765d> list = this.f157313i;
            String strM53589k = (aVarM53522d != null ? list.get(0).m53522d() : list.get(0).m53520b()).m53589k();
            for (C8765d c8765d2 : this.f157314j) {
                c8765d2.m53540v(false);
                if (c8765d2.m53522d() == null) {
                    c8765d2.m53520b().m53566V(strM53589k);
                } else {
                    c8765d2.m53522d().m53566V(strM53589k);
                }
            }
        }
        if (vwb.m200296J(this.f157314j) || TEnum.equals(this.f157313i.get(0).m53521c().category, ProductCategory.tttSvipGoogleplayFreeTrial)) {
            return;
        }
        Iterator<C8765d> it = this.f157313i.iterator();
        while (it.hasNext()) {
            it.next().m53540v(false);
        }
        this.f157314j.get(0).m53540v(true);
        this.f157305a.m56357W4(this.f157308d, this.f157314j.get(0));
    }

    /* JADX INFO: renamed from: k */
    public void m177543k(List<Merchandise> list, List<Merchandise> list2) {
        this.f157306b = list;
        this.f157307c = list2;
    }
}
