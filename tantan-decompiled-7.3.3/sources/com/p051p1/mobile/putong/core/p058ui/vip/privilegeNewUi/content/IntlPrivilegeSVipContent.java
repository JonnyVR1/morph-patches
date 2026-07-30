package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.IntlPrivilegeSVipContent;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegePolicyItem;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.a2p;
import p153l.c5n;
import p153l.cjj;
import p153l.d79;
import p153l.ezo;
import p153l.fo0;
import p153l.fp60;
import p153l.gzo;
import p153l.ip0;
import p153l.izo;
import p153l.joa;
import p153l.jyb;
import p153l.lc9;
import p153l.m2p;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.q3p;
import p153l.qa00;
import p153l.qcj;
import p153l.rcj;
import p153l.szo;
import p153l.t5m;
import p153l.t7a;
import p153l.uxj0;
import p153l.v5b0;
import p153l.wl40;
import p153l.x80;
import p153l.y20;
import p153l.yap;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeSVipContent extends IntlPrivilegeRecycleView implements gzo {

    /* JADX INFO: renamed from: e */
    public izo f38722e;

    /* JADX INFO: renamed from: f */
    public VipNewUiFrag f38723f;

    /* JADX INFO: renamed from: g */
    public t5m f38724g;

    /* JADX INFO: renamed from: h */
    public q3p f38725h;

    /* JADX INFO: renamed from: i */
    public ArrayList<szo> f38726i;

    /* JADX INFO: renamed from: j */
    public final x80 f38727j;

    /* JADX INFO: renamed from: k */
    public C22507a<Unit> f38728k;

    /* JADX INFO: renamed from: l */
    public ProductCategory f38729l;

    public IntlPrivilegeSVipContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38726i = new ArrayList<>();
        this.f38727j = new x80();
        this.f38728k = C22507a.m222759c(Unit.INSTANCE);
        init();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ pf60 m58706I(List list, List list2) {
        return new pf60(list, list2);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ List m58711N(List list) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.j1p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPrivilegeSVipContent.m58720W(arrayList, (Merchandise) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ pf60 m58716S(List list) {
        return new pf60(list, null);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ pf60 m58717T(List list, List list2) {
        return new pf60(list, list2);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m58720W(List list, Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        if (merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || stockKeepUnit.affiliateProducts == null || CoreModule.f18264c.f20396j0.m31579C4() == null || !CoreModule.f18264c.f20396j0.m31579C4().skuId.equals(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay)) {
            return;
        }
        list.add(merchandise);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m58722Y(Throwable th) {
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ pf60 m58726c0(List list) {
        return new pf60(list, null);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m58727d0(boolean z, boolean z2) {
        if (z2) {
            return;
        }
        o1j0.m165634h(R$string.f18546Ic);
    }

    /* JADX INFO: renamed from: g0 */
    private Merchandise m58730g0(List<Merchandise> list) {
        Merchandise merchandise = null;
        if (jyb.m147479J(list)) {
            return null;
        }
        int i = -1;
        for (Merchandise merchandise2 : list) {
            if (merchandise2.autoRenewable() && v5b0.m199797w(merchandise2) && (merchandise == null || i != Math.max(i, merchandise2.quantity))) {
                i = merchandise2.quantity;
                merchandise = merchandise2;
            }
        }
        return merchandise;
    }

    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: renamed from: t0 */
    private void m58731t0(List<Merchandise> list, List<Merchandise> list2) {
        if (NullChecker.m82486a(this.f38725h)) {
            this.f38725h.m175159k(list, list2);
            this.f38725h.m175158j();
            q3p q3pVar = this.f38725h;
            q3pVar.f155468g = false;
            q3pVar.f155469h = m58730g0(list);
            this.f38725h.f155467f.m137019l(uxj0.f181467a);
            return;
        }
        q3p q3pVar2 = new q3p(this.f38723f, list, list2, getPurchaseType(), this.f38729l);
        this.f38725h = q3pVar2;
        q3pVar2.m175158j();
        q3p q3pVar3 = this.f38725h;
        q3pVar3.f155468g = false;
        q3pVar3.f155469h = m58730g0(list);
        this.f38726i.add(0, this.f38725h);
        this.f38722e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.h1p
            @Override // java.lang.Runnable
            public final void run() {
                this.f107472a.m58747s0();
            }
        });
        this.f38725h.f155467f.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: u0 */
    private void m58732u0() {
        this.f38726i.clear();
        if (m58733x0()) {
            this.f38726i.add(this.f38725h);
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            Iterator<Privilege> it = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(userM116600p9.gender).iterator();
            while (it.hasNext()) {
                this.f38726i.add(ezo.m123389a(it.next(), getPurchaseType()));
            }
            this.f38726i.add(ezo.m123392d(getPurchaseType()));
            this.f38726i.add(ezo.m123390b(this.f38723f, getPurchaseType(), null));
            this.f38722e.m142815G(this.f38726i);
        }
    }

    /* JADX INFO: renamed from: x0 */
    private boolean m58733x0() {
        return NullChecker.m82486a(this.f38725h);
    }

    @Override // p153l.gzo
    /* JADX INFO: renamed from: b */
    public void mo58734b(int i) {
        wl40.f189637E.m137019l(Integer.valueOf(i));
    }

    @Override // p153l.gzo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
    }

    /* JADX INFO: renamed from: h0 */
    public void m58735h0(c5n c5nVar, final VipNewUiFrag vipNewUiFrag) {
        c5nVar.m153557n(vipNewUiFrag, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"))).map(new qcj() { // from class: l.s0p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146361M3());
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.l2p
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129791a.m58740l0((Boolean) obj);
            }
        }));
        c5nVar.m153557n(vipNewUiFrag, fp60.m126543E().filter(new qcj() { // from class: l.n2p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                PaymentResultWrapper paymentResultWrapper = (PaymentResultWrapper) obj;
                return Boolean.valueOf(wib0.m206579w(paymentResultWrapper.purchaseType) || wib0.m206575s(paymentResultWrapper.purchaseType) || wib0.m206573q(paymentResultWrapper.purchaseType) || wib0.m206578v(paymentResultWrapper.purchaseType));
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.q0p
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155074a.m58743o0((PaymentResultWrapper) obj);
            }
        }));
        vipNewUiFrag.duringCreated(CoreModule.f18264c.f20311G2.f131287V).subscribe(psd0.m173597H(new y20() { // from class: l.t0p
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171546a.m58746r0(vipNewUiFrag, (pf60) obj);
            }
        }, new y20() { // from class: l.v0p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPrivilegeSVipContent.m58722Y((Throwable) obj);
            }
        }));
        C22421c c22421cObserveOn = ((!t7a.m189547c() || (joa.m146401n4() && joa.m146392i4())) ? C22421c.just(null) : this.f38728k.flatMap(new qcj() { // from class: l.x0p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20311G2.m153661s3();
            }
        })).flatMap(new qcj() { // from class: l.z0p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f202363a.m58737i0((Envelope) obj);
            }
        }).filter(new qcj() { // from class: l.b1p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((Collection) ((pf60) obj).f152156a));
            }
        }).flatMap(new qcj() { // from class: l.d1p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f84706a.m58738j0((pf60) obj);
            }
        }).observeOn(fo0.m126432a());
        if (d79.m114665X()) {
            m58704G(c5nVar, vipNewUiFrag, C22421c.combineLatest(c22421cObserveOn, yap.m214902d().m214913n().distinctUntilChanged(), new a2p()), new y20() { // from class: l.z1p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202587a.m58739k0((pf60) obj);
                }
            });
        } else {
            m58704G(c5nVar, vipNewUiFrag, C22421c.combineLatest(c22421cObserveOn, CoreModule.f18264c.f20396j0.m31648z4() ? CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial)).filter(new qcj() { // from class: l.b2p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).map(new qcj() { // from class: l.d2p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlPrivilegeSVipContent.m58711N((List) obj);
                }
            }).flatMap(new qcj() { // from class: l.f2p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f96896a.m58741m0((List) obj);
                }
            }).onErrorResumeNext(new qcj() { // from class: l.h2p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C22421c.just(null);
                }
            }).observeOn(fo0.m126432a()) : C22421c.just(null), new m2p()), new y20() { // from class: l.j2p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118076a.m58742n0((pf60) obj);
                }
            });
        }
    }

    @Override // p153l.gzo
    /* JADX INFO: renamed from: i */
    public void mo58736i() {
        wl40.f189638F.m137019l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ C22421c m58737i0(Envelope envelope) {
        lc9 lc9Var = CoreModule.f18264c.f20311G2;
        if (lc9Var.f131283R == null || !lc9Var.m153654l3(getPurchaseType())) {
            return CoreModule.f18264c.f20396j0.m31647y5(getPurchaseType().productCategory()).map(new qcj() { // from class: l.m1p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlPrivilegeSVipContent.m58716S((List) obj);
                }
            });
        }
        this.f38729l = CoreModule.f18264c.f20311G2.m153651i3();
        return psd0.m173625r(CoreModule.f18264c.f20396j0.m31647y5(getPurchaseType().productCategory()), CoreModule.f18264c.f20396j0.m31647y5(this.f38729l), new rcj() { // from class: l.o1p
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeSVipContent.m58717T((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ C22421c m58738j0(pf60 pf60Var) {
        return jyb.m147479J((Collection) pf60Var.f152157b) ? cjj.m110205M(getContext(), (List) pf60Var.f152156a).map(new qcj() { // from class: l.q1p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPrivilegeSVipContent.m58726c0((List) obj);
            }
        }) : psd0.m173625r(cjj.m110205M(getContext(), (List) pf60Var.f152156a), cjj.m110205M(getContext(), (List) pf60Var.f152157b), new rcj() { // from class: l.s1p
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeSVipContent.m58706I((List) obj, (List) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m58739k0(pf60 pf60Var) {
        F f = pf60Var.f152156a;
        m58731t0((List) ((pf60) f).f152156a, (List) ((pf60) f).f152157b);
        q3p q3pVar = this.f38725h;
        q3pVar.f155472k = false;
        q3pVar.f155473l = true;
        if (NullChecker.m82486a(pf60Var.f152157b) && yap.m214902d().m214912m() && yap.m214902d().m214910h("svip")) {
            this.f38725h.f155472k = true;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m58740l0(Boolean bool) {
        m58732u0();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ C22421c m58741m0(List list) {
        return cjj.m110205M(getContext(), list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m58742n0(pf60 pf60Var) {
        F f = pf60Var.f152156a;
        List<Merchandise> list = (List) ((pf60) f).f152156a;
        List<Merchandise> list2 = (List) ((pf60) f).f152157b;
        if (!jyb.m147479J((Collection) pf60Var.f152157b)) {
            Merchandise merchandise = (Merchandise) ((List) pf60Var.f152157b).get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).quantity == merchandise.quantity) {
                    list.set(i, merchandise);
                    break;
                }
            }
        }
        m58731t0(list, list2);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m58743o0(PaymentResultWrapper paymentResultWrapper) {
        this.f38728k.m137019l(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m58744p0(VipNewUiFrag vipNewUiFrag, pf60 pf60Var, szo szoVar) {
        if (szoVar instanceof IntlPrivilegePolicyItem.C9186a) {
            int iIndexOf = this.f38726i.indexOf(szoVar);
            this.f38726i.remove(szoVar);
            this.f38726i.add(iIndexOf, ezo.m123390b(vipNewUiFrag, getPurchaseType(), (C8928d) pf60Var.f152157b));
            this.f38722e.notifyItemChanged(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m58745q0(final VipNewUiFrag vipNewUiFrag, final pf60 pf60Var) {
        if (vipNewUiFrag.isAdded()) {
            jyb.m147537z(this.f38726i, new y20() { // from class: l.u1p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f177104a.m58744p0(vipNewUiFrag, pf60Var, (szo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m58746r0(final VipNewUiFrag vipNewUiFrag, final pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var) && pf60Var.f152156a == getPurchaseType()) {
            post(new Runnable() { // from class: l.f1p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f96811a.m58745q0(vipNewUiFrag, pf60Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m58747s0() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m58748v0() {
        t5m t5mVar = this.f38724g;
        if (t5mVar != null) {
            t5mVar.release();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m58749w0(PutongFrag putongFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        izo izoVar = new izo(putongFrag, this.f38724g, this);
        this.f38722e = izoVar;
        setAdapter(izoVar);
        m58732u0();
    }

    @Override // p153l.gzo
    /* JADX INFO: renamed from: y */
    public void mo58750y(c5n c5nVar, VipNewUiFrag vipNewUiFrag) {
        this.f38723f = vipNewUiFrag;
        wl40 wl40Var = new wl40(vipNewUiFrag.act(), getPurchaseType());
        this.f38724g = wl40Var;
        wl40Var.mo126112c(this.f38727j);
        t5m t5mVar = this.f38724g;
        if (t5mVar instanceof wl40) {
            ((wl40) t5mVar).m141372H(new ip0.InterfaceC17765a() { // from class: l.o0p
                @Override // p153l.ip0.InterfaceC17765a
                /* JADX INFO: renamed from: a */
                public final void mo108479a(boolean z, boolean z2) {
                    IntlPrivilegeSVipContent.m58727d0(z, z2);
                }
            });
            ((wl40) this.f38724g).m206927c0(qa00.m175859d(0.0f));
        }
        m58749w0(vipNewUiFrag);
        m58735h0(c5nVar, vipNewUiFrag);
    }

    public IntlPrivilegeSVipContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlPrivilegeSVipContent(Context context) {
        this(context, null);
    }
}
