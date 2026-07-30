package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.IntlPrivilegeSVipContent;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeExclusivePrivilegeView;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegePolicyItem;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.a2p;
import p153l.cjj;
import p153l.d5n;
import p153l.d79;
import p153l.fo0;
import p153l.fp60;
import p153l.fzo;
import p153l.hzo;
import p153l.ip0;
import p153l.joa;
import p153l.jyb;
import p153l.lc9;
import p153l.m2p;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.r3p;
import p153l.rcj;
import p153l.t5m;
import p153l.t7a;
import p153l.tzo;
import p153l.v5b0;
import p153l.wl40;
import p153l.x80;
import p153l.y20;
import p153l.yap;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeSVipContent extends IntlPrivilegeRecycleView implements hzo {

    /* JADX INFO: renamed from: e */
    public C9113a f37962e;

    /* JADX INFO: renamed from: f */
    public IntlVipNewUiFrag f37963f;

    /* JADX INFO: renamed from: g */
    public t5m f37964g;

    /* JADX INFO: renamed from: h */
    public r3p f37965h;

    /* JADX INFO: renamed from: i */
    public ArrayList<tzo> f37966i;

    /* JADX INFO: renamed from: j */
    public final x80 f37967j;

    /* JADX INFO: renamed from: k */
    public C22507a<Unit> f37968k;

    /* JADX INFO: renamed from: l */
    public ProductCategory f37969l;

    public IntlPrivilegeSVipContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37966i = new ArrayList<>();
        this.f37967j = new x80();
        this.f37968k = C22507a.m222759c(Unit.INSTANCE);
        init();
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ List m57547K(List list) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.x1p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPrivilegeSVipContent.m57569g0(arrayList, (Merchandise) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ pf60 m57549M(List list) {
        return new pf60(list, null);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m57557U(Throwable th) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m57558V(boolean z, boolean z2) {
        if (z2) {
            return;
        }
        o1j0.m165634h(R$string.f18546Ic);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ pf60 m57559W(List list, List list2) {
        return new pf60(list, list2);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ pf60 m57562Z(List list, List list2) {
        return new pf60(list, list2);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ pf60 m57568f0(List list) {
        return new pf60(list, null);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m57569g0(List list, Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        if (merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || stockKeepUnit.affiliateProducts == null || CoreModule.f18264c.f20396j0.m31579C4() == null || !CoreModule.f18264c.f20396j0.m31579C4().skuId.equals(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay)) {
            return;
        }
        list.add(merchandise);
    }

    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // p153l.hzo
    /* JADX INFO: renamed from: b */
    public void mo57570b(int i) {
        wl40.f189637E.m137019l(Integer.valueOf(i));
    }

    @Override // p153l.hzo
    /* JADX INFO: renamed from: f */
    public void mo57571f(PurchaseType purchaseType, PurchaseType purchaseType2) {
        wl40.f189638F.m137019l(Unit.INSTANCE);
        m57591z0(purchaseType, purchaseType2);
    }

    @Override // p153l.hzo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
    }

    /* JADX INFO: renamed from: h0 */
    public final Merchandise m57572h0(List<Merchandise> list) {
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

    /* JADX INFO: renamed from: i0 */
    public void m57573i0(d5n d5nVar, final IntlVipNewUiFrag intlVipNewUiFrag) {
        d5nVar.m153557n(intlVipNewUiFrag, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"))).map(new qcj() { // from class: l.l1p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146361M3());
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.r0p
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160661a.m57579o0((Boolean) obj);
            }
        }));
        d5nVar.m153557n(intlVipNewUiFrag, fp60.m126543E().filter(new qcj() { // from class: l.u0p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                PaymentResultWrapper paymentResultWrapper = (PaymentResultWrapper) obj;
                return Boolean.valueOf(wib0.m206579w(paymentResultWrapper.purchaseType) || wib0.m206575s(paymentResultWrapper.purchaseType) || wib0.m206573q(paymentResultWrapper.purchaseType) || wib0.m206578v(paymentResultWrapper.purchaseType));
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.w0p
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186623a.m57580p0((PaymentResultWrapper) obj);
            }
        }));
        intlVipNewUiFrag.duringCreated(CoreModule.f18264c.f20311G2.f131287V).subscribe(psd0.m173597H(new y20() { // from class: l.y0p
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197028a.m57583s0(intlVipNewUiFrag, (pf60) obj);
            }
        }, new y20() { // from class: l.a1p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPrivilegeSVipContent.m57557U((Throwable) obj);
            }
        }));
        C22421c c22421cObserveOn = ((!t7a.m189547c() || (joa.m146401n4() && joa.m146392i4())) ? C22421c.just(null) : this.f37968k.flatMap(new qcj() { // from class: l.c1p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20311G2.m153661s3();
            }
        })).flatMap(new qcj() { // from class: l.e1p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f91656a.m57574j0((Envelope) obj);
            }
        }).filter(new qcj() { // from class: l.g1p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((Collection) ((pf60) obj).f152156a));
            }
        }).flatMap(new qcj() { // from class: l.i1p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f112541a.m57575k0((pf60) obj);
            }
        }).observeOn(fo0.m126432a());
        if (d79.m114668a0()) {
            return;
        }
        if (d79.m114665X()) {
            m57543G(d5nVar, intlVipNewUiFrag, C22421c.combineLatest(c22421cObserveOn, yap.m214902d().m214913n().distinctUntilChanged(), new a2p()), new y20() { // from class: l.c2p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f79507a.m57576l0((pf60) obj);
                }
            });
        } else {
            m57543G(d5nVar, intlVipNewUiFrag, C22421c.combineLatest(c22421cObserveOn, CoreModule.f18264c.f20396j0.m31648z4() ? CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial)).filter(new qcj() { // from class: l.e2p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).map(new qcj() { // from class: l.g2p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlPrivilegeSVipContent.m57547K((List) obj);
                }
            }).flatMap(new qcj() { // from class: l.i2p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f112661a.m57577m0((List) obj);
                }
            }).onErrorResumeNext(new qcj() { // from class: l.k2p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C22421c.just(null);
                }
            }).observeOn(fo0.m126432a()) : C22421c.just(null), new m2p()), new y20() { // from class: l.o2p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f144760a.m57578n0((pf60) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ C22421c m57574j0(Envelope envelope) {
        lc9 lc9Var = CoreModule.f18264c.f20311G2;
        if (lc9Var.f131283R == null || !lc9Var.m153654l3(getPurchaseType())) {
            return CoreModule.f18264c.f20396j0.m31647y5(getPurchaseType().productCategory()).map(new qcj() { // from class: l.r1p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlPrivilegeSVipContent.m57549M((List) obj);
                }
            });
        }
        this.f37969l = CoreModule.f18264c.f20311G2.m153651i3();
        return psd0.m173625r(CoreModule.f18264c.f20396j0.m31647y5(getPurchaseType().productCategory()), CoreModule.f18264c.f20396j0.m31647y5(this.f37969l), new rcj() { // from class: l.t1p
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeSVipContent.m57559W((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ C22421c m57575k0(pf60 pf60Var) {
        return jyb.m147479J((Collection) pf60Var.f152157b) ? cjj.m110205M(getContext(), (List) pf60Var.f152156a).map(new qcj() { // from class: l.n1p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPrivilegeSVipContent.m57568f0((List) obj);
            }
        }) : psd0.m173625r(cjj.m110205M(getContext(), (List) pf60Var.f152156a), cjj.m110205M(getContext(), (List) pf60Var.f152157b), new rcj() { // from class: l.p1p
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeSVipContent.m57562Z((List) obj, (List) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m57576l0(pf60 pf60Var) {
        F f = pf60Var.f152156a;
        m57585u0((List) ((pf60) f).f152156a, (List) ((pf60) f).f152157b);
        r3p r3pVar = this.f37965h;
        r3pVar.f161072k = false;
        r3pVar.f161073l = true;
        if (NullChecker.m82486a(pf60Var.f152157b) && yap.m214902d().m214912m() && yap.m214902d().m214910h("svip")) {
            this.f37965h.f161072k = true;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ C22421c m57577m0(List list) {
        return cjj.m110205M(getContext(), list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m57578n0(pf60 pf60Var) {
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
        m57585u0(list, list2);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m57579o0(Boolean bool) {
        m57586v0();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m57580p0(PaymentResultWrapper paymentResultWrapper) {
        this.f37968k.m137019l(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m57581q0(IntlVipNewUiFrag intlVipNewUiFrag, pf60 pf60Var, tzo tzoVar) {
        if (tzoVar instanceof IntlPrivilegePolicyItem.C9118a) {
            int iIndexOf = this.f37966i.indexOf(tzoVar);
            this.f37966i.remove(tzoVar);
            this.f37966i.add(iIndexOf, fzo.m128198b(intlVipNewUiFrag, getPurchaseType(), (C8928d) pf60Var.f152157b));
            this.f37962e.notifyItemChanged(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m57582r0(final IntlVipNewUiFrag intlVipNewUiFrag, final pf60 pf60Var) {
        if (intlVipNewUiFrag.isAdded() && !d79.m114668a0()) {
            jyb.m147537z(this.f37966i, new y20() { // from class: l.y1p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197119a.m57581q0(intlVipNewUiFrag, pf60Var, (tzo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m57583s0(final IntlVipNewUiFrag intlVipNewUiFrag, final pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var) && pf60Var.f152156a == getPurchaseType()) {
            post(new Runnable() { // from class: l.w1p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f186829a.m57582r0(intlVipNewUiFrag, pf60Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m57584t0() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m57585u0(List<Merchandise> list, List<Merchandise> list2) {
        if (NullChecker.m82486a(this.f37965h)) {
            this.f37965h.m179667k(list, list2);
            this.f37965h.m179666j();
            r3p r3pVar = this.f37965h;
            r3pVar.f161068g = false;
            r3pVar.f161069h = m57572h0(list);
            this.f37965h.f161067f.m137019l(Unit.INSTANCE);
            return;
        }
        r3p r3pVar2 = new r3p(this.f37963f, list, list2, getPurchaseType(), this.f37969l);
        this.f37965h = r3pVar2;
        r3pVar2.m179666j();
        r3p r3pVar3 = this.f37965h;
        r3pVar3.f161068g = false;
        r3pVar3.f161069h = m57572h0(list);
        this.f37966i.add(0, this.f37965h);
        this.f37962e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.v1p
            @Override // java.lang.Runnable
            public final void run() {
                this.f181990a.m57584t0();
            }
        });
        this.f37965h.f161067f.m137019l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m57586v0() {
        this.f37966i.clear();
        if (m57589y0()) {
            this.f37966i.add(this.f37965h);
        }
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9())) {
            this.f37966i.add(new C9113a.a(getPurchaseType()));
            this.f37966i.add(fzo.m128199c(getPurchaseType()));
            if (!d79.m114668a0()) {
                this.f37966i.add(fzo.m128198b(this.f37963f, getPurchaseType(), null));
            }
            this.f37962e.m57669G(this.f37966i);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m57587w0() {
        t5m t5mVar = this.f37964g;
        if (t5mVar != null) {
            t5mVar.release();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m57588x0(IntlVipNewUiFrag intlVipNewUiFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        C9113a c9113a = new C9113a(intlVipNewUiFrag, this.f37964g, this);
        this.f37962e = c9113a;
        setAdapter(c9113a);
        m57586v0();
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m57589y0() {
        if (d79.m114668a0()) {
            return false;
        }
        return NullChecker.m82486a(this.f37965h);
    }

    @Override // p153l.hzo
    /* JADX INFO: renamed from: z */
    public void mo57590z(d5n d5nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f37963f = intlVipNewUiFrag;
        wl40 wl40Var = new wl40(intlVipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f37964g = wl40Var;
        wl40Var.mo126112c(this.f37967j);
        t5m t5mVar = this.f37964g;
        if (t5mVar instanceof wl40) {
            ((wl40) t5mVar).m141372H(new ip0.InterfaceC17765a() { // from class: l.p0p
                @Override // p153l.ip0.InterfaceC17765a
                /* JADX INFO: renamed from: a */
                public final void mo108479a(boolean z, boolean z2) {
                    IntlPrivilegeSVipContent.m57558V(z, z2);
                }
            });
            ((wl40) this.f37964g).m206927c0(qa00.m175859d(0.0f));
        }
        m57588x0(intlVipNewUiFrag);
        m57573i0(d5nVar, intlVipNewUiFrag);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m57591z0(final PurchaseType purchaseType, final PurchaseType purchaseType2) {
        if (this.f37962e == null) {
            return;
        }
        for (int i = 0; i < this.f37966i.size(); i++) {
            if (this.f37966i.get(i) instanceof C9113a.a) {
                RecyclerView.AbstractC0569e0 abstractC0569e0FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i);
                if (abstractC0569e0FindViewHolderForAdapterPosition != null) {
                    View view = abstractC0569e0FindViewHolderForAdapterPosition.itemView;
                    if (view instanceof IntlPrivilegeExclusivePrivilegeView) {
                        final IntlPrivilegeExclusivePrivilegeView intlPrivilegeExclusivePrivilegeView = (IntlPrivilegeExclusivePrivilegeView) view;
                        intlPrivilegeExclusivePrivilegeView.m57691h(purchaseType, purchaseType2);
                        intlPrivilegeExclusivePrivilegeView.m57687d(purchaseType, purchaseType2, new Runnable() { // from class: l.k1p
                            @Override // java.lang.Runnable
                            public final void run() {
                                intlPrivilegeExclusivePrivilegeView.m57698o(purchaseType, purchaseType2);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public IntlPrivilegeSVipContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlPrivilegeSVipContent(Context context) {
        this(context, null);
    }
}
