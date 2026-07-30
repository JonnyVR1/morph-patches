package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p046p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeShowcaseWrapper;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class q1p implements sxo {

    /* JADX INFO: renamed from: a */
    public final VipNewUiFrag f152142a;

    /* JADX INFO: renamed from: b */
    public List<Merchandise> f152143b;

    /* JADX INFO: renamed from: c */
    public List<Merchandise> f152144c;

    /* JADX INFO: renamed from: d */
    public final PurchaseType f152145d;

    /* JADX INFO: renamed from: e */
    public ProductCategory f152146e;

    /* JADX INFO: renamed from: f */
    public C22393b<roj0> f152147f = C22393b.m221521b();

    /* JADX INFO: renamed from: g */
    public boolean f152148g;

    /* JADX INFO: renamed from: h */
    public Merchandise f152149h;

    /* JADX INFO: renamed from: i */
    public List<C8765d> f152150i;

    /* JADX INFO: renamed from: j */
    public List<C8765d> f152151j;

    /* JADX INFO: renamed from: k */
    public boolean f152152k;

    /* JADX INFO: renamed from: l */
    public boolean f152153l;

    /* JADX INFO: renamed from: m */
    public c4g0 f152154m;

    public q1p(VipNewUiFrag vipNewUiFrag, List<Merchandise> list, List<Merchandise> list2, PurchaseType purchaseType, ProductCategory productCategory) {
        this.f152142a = vipNewUiFrag;
        this.f152143b = list;
        this.f152144c = list2;
        this.f152145d = purchaseType;
        this.f152146e = productCategory;
    }

    /* JADX INFO: renamed from: e */
    public void m172405e(final IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper) {
        if (intlPrivilegeShowcaseWrapper.m57671c() instanceof id40) {
            ((id40) intlPrivilegeShowcaseWrapper.m57671c()).m135410X(this.f152150i, new e30() { // from class: l.i1p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f110479a.m172406f(intlPrivilegeShowcaseWrapper, (C8765d) obj);
                }
            }, null, new e30() { // from class: l.k1p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f120636a.m172407g((C8765d) obj);
                }
            }, this.f152151j);
        }
        c4g0 c4g0Var = this.f152154m;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f152154m = this.f152142a.duringCreated(this.f152147f).subscribe(mkd0.m154955G(new e30() { // from class: l.m1p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130844a.m172408h(intlPrivilegeShowcaseWrapper, (roj0) obj);
                }
            }));
        }
        if (!this.f152152k) {
            intlPrivilegeShowcaseWrapper.setPromotionVisible(false);
            return;
        }
        intlPrivilegeShowcaseWrapper.setPromotionVisible(true);
        intlPrivilegeShowcaseWrapper.setPromotionTheme(this.f152153l);
        intlPrivilegeShowcaseWrapper.setPromotionListener(new d30() { // from class: l.o1p
            @Override // p149l.d30
            public final void call() {
                this.f141469a.m172409i();
            }
        });
        y8p.m213416j();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m172406f(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, C8765d c8765d) {
        if (NullChecker.m81303a(c8765d)) {
            this.f152142a.m57502U4(this.f152145d, c8765d);
        }
        C8765d.a aVarM53522d = c8765d.m53522d() != null ? c8765d.m53522d() : c8765d.m53520b();
        if (aVarM53522d != null) {
            ((id40) intlPrivilegeShowcaseWrapper.m57671c()).m135417g0(CoreModule.f17545c.f19569G2.m105983k3(aVarM53522d.m53579f()));
            CoreModule.f17545c.f19569G2.f80121V.onNext(j760.m140076a(this.f152145d, c8765d));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m172407g(C8765d c8765d) {
        if (NullChecker.m81303a(c8765d)) {
            CoreModule.f17545c.f19569G2.f80121V.onNext(j760.m140076a(this.f152145d, c8765d));
            this.f152142a.m57501T4();
        }
    }

    @Override // p149l.sxo
    public int getItemType() {
        return 4;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m172408h(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, roj0 roj0Var) {
        m172410j();
        m172405e(intlPrivilegeShowcaseWrapper);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m172409i() {
        y8p.m213414e(this.f152142a.act());
        y8p.m213415i();
    }

    /* JADX INFO: renamed from: j */
    public void m172410j() {
        rwl rwlVarM107330z = cjy.m107330z(this.f152145d.productCategory());
        Act act = this.f152142a.act();
        PurchaseType purchaseType = this.f152145d;
        this.f152150i = rwlVarM107330z.mo107333a(act, purchaseType, purchaseType.productCategory(), this.f152143b);
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.f17545c.f19569G2.f80117R;
        this.f152151j = new ArrayList();
        if (this.f152144c == null || membershipUpgradeInfo == null || !TEnum.equals(CoreModule.f17545c.f19569G2.m105981i3(), this.f152146e)) {
            return;
        }
        List<C8765d> listMo107333a = cjy.m107330z(this.f152146e).mo107333a(this.f152142a.act(), this.f152145d, this.f152146e, this.f152144c);
        for (MembershipUpgradeDurationInfo membershipUpgradeDurationInfo : membershipUpgradeInfo.duration) {
            for (C8765d c8765d : listMo107333a) {
                if ((c8765d.m53522d() != null ? c8765d.m53522d() : c8765d.m53520b()).m53605w() == membershipUpgradeDurationInfo.count) {
                    this.f152151j.add(c8765d);
                }
            }
        }
        if (!vwb.m200296J(this.f152151j)) {
            C8765d.a aVarM53522d = this.f152150i.get(0).m53522d();
            List<C8765d> list = this.f152150i;
            String strM53589k = (aVarM53522d != null ? list.get(0).m53522d() : list.get(0).m53520b()).m53589k();
            for (C8765d c8765d2 : this.f152151j) {
                c8765d2.m53540v(false);
                if (c8765d2.m53522d() == null) {
                    c8765d2.m53520b().m53566V(strM53589k);
                } else {
                    c8765d2.m53522d().m53566V(strM53589k);
                }
            }
        }
        if (vwb.m200296J(this.f152151j) || TEnum.equals(this.f152150i.get(0).m53521c().category, ProductCategory.tttSvipGoogleplayFreeTrial)) {
            return;
        }
        Iterator<C8765d> it = this.f152150i.iterator();
        while (it.hasNext()) {
            it.next().m53540v(false);
        }
        this.f152151j.get(0).m53540v(true);
        this.f152142a.m57502U4(this.f152145d, this.f152151j.get(0));
    }

    /* JADX INFO: renamed from: k */
    public void m172411k(List<Merchandise> list, List<Merchandise> list2) {
        this.f152143b = list;
        this.f152144c = list2;
    }
}
