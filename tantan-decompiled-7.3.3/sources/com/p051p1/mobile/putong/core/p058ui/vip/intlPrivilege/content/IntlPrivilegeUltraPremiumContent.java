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
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.IntlPrivilegeUltraPremiumContent;
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
import p153l.wl40;
import p153l.x80;
import p153l.y20;
import p153l.yap;
import p153l.zry;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeUltraPremiumContent extends IntlPrivilegeRecycleView implements hzo {

    /* JADX INFO: renamed from: e */
    public C9113a f37976e;

    /* JADX INFO: renamed from: f */
    public IntlVipNewUiFrag f37977f;

    /* JADX INFO: renamed from: g */
    public t5m f37978g;

    /* JADX INFO: renamed from: h */
    public r3p f37979h;

    /* JADX INFO: renamed from: i */
    public ArrayList<tzo> f37980i;

    /* JADX INFO: renamed from: j */
    public C22507a<Unit> f37981j;

    /* JADX INFO: renamed from: k */
    public final x80 f37982k;

    /* JADX INFO: renamed from: l */
    public ProductCategory f37983l;

    public IntlPrivilegeUltraPremiumContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37980i = new ArrayList<>();
        this.f37981j = C22507a.m222759c(Unit.INSTANCE);
        this.f37982k = new x80();
        init();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m57617L(boolean z, boolean z2) {
        if (z2) {
            return;
        }
        o1j0.m165634h(R$string.f18546Ic);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ pf60 m57621P(List list, List list2) {
        return new pf60(list, list2);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ pf60 m57623R(List list, List list2) {
        return new pf60(list, list2);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m57624S(Throwable th) {
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ pf60 m57632a0(List list) {
        return new pf60(list, null);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ pf60 m57633b0(List list) {
        return new pf60(list, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ C22421c m57634d0(Envelope envelope) {
        lc9 lc9Var = CoreModule.f18264c.f20311G2;
        if (lc9Var.f131283R == null || !lc9Var.m153654l3(getPurchaseType())) {
            return CoreModule.f18264c.f20396j0.m31647y5(getPurchaseType().productCategory()).map(new qcj() { // from class: l.o4p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlPrivilegeUltraPremiumContent.m57632a0((List) obj);
                }
            });
        }
        this.f37983l = CoreModule.f18264c.f20311G2.m153651i3();
        return psd0.m173625r(CoreModule.f18264c.f20396j0.m31647y5(getPurchaseType().productCategory()), CoreModule.f18264c.f20396j0.m31647y5(this.f37983l), new rcj() { // from class: l.q4p
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeUltraPremiumContent.m57621P((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ C22421c m57635e0(pf60 pf60Var) {
        return jyb.m147479J((Collection) pf60Var.f152157b) ? cjj.m110205M(getContext(), (List) pf60Var.f152156a).map(new qcj() { // from class: l.s4p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPrivilegeUltraPremiumContent.m57633b0((List) obj);
            }
        }) : psd0.m173625r(cjj.m110205M(getContext(), (List) pf60Var.f152156a), cjj.m110205M(getContext(), (List) pf60Var.f152157b), new rcj() { // from class: l.u4p
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeUltraPremiumContent.m57623R((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m57636f0(pf60 pf60Var) {
        F f = pf60Var.f152156a;
        m57638n0((List) ((pf60) f).f152156a, (List) ((pf60) f).f152157b);
        r3p r3pVar = this.f37979h;
        r3pVar.f161072k = false;
        r3pVar.f161073l = true;
        if (NullChecker.m82486a(pf60Var.f152157b) && yap.m214902d().m214912m() && yap.m214902d().m214910h(ProductCategory.tttUltraPremium)) {
            this.f37979h.f161072k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m57637h0(Boolean bool) {
        m57639o0();
    }

    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: renamed from: n0 */
    private void m57638n0(List<Merchandise> list, List<Merchandise> list2) {
        PurchaseType purchaseType = PurchaseType.TYPE_ULTRA_PREMIUM;
        if (zry.m221275z(purchaseType.productCategory()).mo147671a(this.f37977f.act(), purchaseType, purchaseType.productCategory(), list).size() == 2) {
            ((wl40) this.f37978g).m206928d0(qa00.m175859d(47.0f));
            ((wl40) this.f37978g).m206930f0(qa00.m175859d(47.0f));
        }
        if (NullChecker.m82486a(this.f37979h)) {
            this.f37979h.m179667k(list, list2);
            this.f37979h.m179666j();
            r3p r3pVar = this.f37979h;
            r3pVar.f161068g = false;
            r3pVar.f161069h = null;
            r3pVar.f161067f.m137019l(Unit.INSTANCE);
            return;
        }
        r3p r3pVar2 = new r3p(this.f37977f, list, list2, getPurchaseType(), this.f37983l);
        this.f37979h = r3pVar2;
        r3pVar2.m179666j();
        r3p r3pVar3 = this.f37979h;
        r3pVar3.f161068g = false;
        r3pVar3.f161069h = null;
        this.f37980i.add(0, r3pVar3);
        this.f37976e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.k4p
            @Override // java.lang.Runnable
            public final void run() {
                this.f123909a.m57648m0();
            }
        });
        this.f37979h.f161067f.m137019l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: o0 */
    private void m57639o0() {
        this.f37980i.clear();
        if (m57640q0()) {
            this.f37980i.add(this.f37979h);
        }
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9())) {
            this.f37980i.add(new C9113a.a(getPurchaseType()));
            this.f37980i.add(fzo.m128199c(getPurchaseType()));
            if (!d79.m114668a0()) {
                this.f37980i.add(fzo.m128198b(this.f37977f, getPurchaseType(), null));
            }
            this.f37976e.m57669G(this.f37980i);
        }
    }

    /* JADX INFO: renamed from: q0 */
    private boolean m57640q0() {
        if (d79.m114668a0()) {
            return false;
        }
        return NullChecker.m82486a(this.f37979h);
    }

    /* JADX INFO: renamed from: r0 */
    private void m57641r0(final PurchaseType purchaseType, final PurchaseType purchaseType2) {
        if (this.f37976e == null) {
            return;
        }
        for (int i = 0; i < this.f37980i.size(); i++) {
            if (this.f37980i.get(i) instanceof C9113a.a) {
                RecyclerView.AbstractC0569e0 abstractC0569e0FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i);
                if (abstractC0569e0FindViewHolderForAdapterPosition != null) {
                    View view = abstractC0569e0FindViewHolderForAdapterPosition.itemView;
                    if (view instanceof IntlPrivilegeExclusivePrivilegeView) {
                        final IntlPrivilegeExclusivePrivilegeView intlPrivilegeExclusivePrivilegeView = (IntlPrivilegeExclusivePrivilegeView) view;
                        intlPrivilegeExclusivePrivilegeView.m57691h(purchaseType, purchaseType2);
                        intlPrivilegeExclusivePrivilegeView.m57687d(purchaseType, purchaseType2, new Runnable() { // from class: l.v4p
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

    @Override // p153l.hzo
    /* JADX INFO: renamed from: b */
    public void mo57570b(int i) {
        wl40.f189637E.m137019l(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c0 */
    public void m57642c0(d5n d5nVar, final IntlVipNewUiFrag intlVipNewUiFrag) {
        d5nVar.m153557n(intlVipNewUiFrag, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium))).map(new qcj() { // from class: l.y4p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146361M3());
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.e5p
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92226a.m57637h0((Boolean) obj);
            }
        }));
        intlVipNewUiFrag.duringCreated(CoreModule.f18264c.f20311G2.f131287V).subscribe(psd0.m173597H(new y20() { // from class: l.g5p
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102342a.m57646k0(intlVipNewUiFrag, (pf60) obj);
            }
        }, new y20() { // from class: l.i5p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPrivilegeUltraPremiumContent.m57624S((Throwable) obj);
            }
        }));
        d5nVar.m153557n(intlVipNewUiFrag, fp60.m126543E().filter(new qcj() { // from class: l.k5p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                PaymentResultWrapper paymentResultWrapper = (PaymentResultWrapper) obj;
                return Boolean.valueOf(wib0.m206579w(paymentResultWrapper.purchaseType) || wib0.m206575s(paymentResultWrapper.purchaseType) || wib0.m206573q(paymentResultWrapper.purchaseType) || wib0.m206578v(paymentResultWrapper.purchaseType));
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.m5p
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134920a.m57647l0((PaymentResultWrapper) obj);
            }
        }));
        C22421c c22421cObserveOn = ((!t7a.m189547c() || joa.m146386f4()) ? C22421c.just(null) : this.f37981j.flatMap(new qcj() { // from class: l.b4p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20311G2.m153661s3();
            }
        })).flatMap(new qcj() { // from class: l.e4p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f92137a.m57634d0((Envelope) obj);
            }
        }).filter(new qcj() { // from class: l.g4p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((Collection) ((pf60) obj).f152156a));
            }
        }).flatMap(new qcj() { // from class: l.i4p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f112930a.m57635e0((pf60) obj);
            }
        }).observeOn(fo0.m126432a());
        if (d79.m114668a0()) {
            return;
        }
        if (d79.m114665X()) {
            m57543G(d5nVar, intlVipNewUiFrag, C22421c.combineLatest(c22421cObserveOn, yap.m214902d().m214913n().distinctUntilChanged(), new a2p()), new y20() { // from class: l.a5p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f68630a.m57636f0((pf60) obj);
                }
            });
        } else {
            m57543G(d5nVar, intlVipNewUiFrag, c22421cObserveOn, new y20() { // from class: l.c5p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f79888a.m57643g0((pf60) obj);
                }
            });
        }
    }

    @Override // p153l.hzo
    /* JADX INFO: renamed from: f */
    public void mo57571f(PurchaseType purchaseType, PurchaseType purchaseType2) {
        wl40.f189638F.m137019l(Unit.INSTANCE);
        m57641r0(purchaseType, purchaseType2);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m57643g0(pf60 pf60Var) {
        m57638n0((List) pf60Var.f152156a, (List) pf60Var.f152157b);
    }

    @Override // p153l.hzo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_ULTRA_PREMIUM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m57644i0(IntlVipNewUiFrag intlVipNewUiFrag, pf60 pf60Var, tzo tzoVar) {
        if (tzoVar instanceof IntlPrivilegePolicyItem.C9118a) {
            int iIndexOf = this.f37980i.indexOf(tzoVar);
            this.f37980i.remove(tzoVar);
            this.f37980i.add(iIndexOf, fzo.m128198b(intlVipNewUiFrag, getPurchaseType(), (C8928d) pf60Var.f152157b));
            this.f37976e.notifyItemChanged(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m57645j0(final IntlVipNewUiFrag intlVipNewUiFrag, final pf60 pf60Var) {
        if (intlVipNewUiFrag.isAdded() && !d79.m114668a0()) {
            jyb.m147537z(this.f37980i, new y20() { // from class: l.w4p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f187425a.m57644i0(intlVipNewUiFrag, pf60Var, (tzo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m57646k0(final IntlVipNewUiFrag intlVipNewUiFrag, final pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var) && pf60Var.f152156a == getPurchaseType()) {
            post(new Runnable() { // from class: l.m4p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f134821a.m57645j0(intlVipNewUiFrag, pf60Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m57647l0(PaymentResultWrapper paymentResultWrapper) {
        this.f37981j.m137019l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m57648m0() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m57649p0(IntlVipNewUiFrag intlVipNewUiFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        C9113a c9113a = new C9113a(intlVipNewUiFrag, this.f37978g, this);
        this.f37976e = c9113a;
        setAdapter(c9113a);
        m57639o0();
    }

    @Override // p153l.hzo
    /* JADX INFO: renamed from: z */
    public void mo57590z(d5n d5nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f37977f = intlVipNewUiFrag;
        wl40 wl40Var = new wl40(intlVipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f37978g = wl40Var;
        int i = qa00.f156322i;
        wl40Var.m206929e0(i, 0, i, 0);
        this.f37978g.mo126112c(this.f37982k);
        t5m t5mVar = this.f37978g;
        if (t5mVar instanceof wl40) {
            ((wl40) t5mVar).m141372H(new ip0.InterfaceC17765a() { // from class: l.z3p
                @Override // p153l.ip0.InterfaceC17765a
                /* JADX INFO: renamed from: a */
                public final void mo108479a(boolean z, boolean z2) {
                    IntlPrivilegeUltraPremiumContent.m57617L(z, z2);
                }
            });
        }
        m57649p0(intlVipNewUiFrag);
        m57642c0(d5nVar, intlVipNewUiFrag);
    }

    public IntlPrivilegeUltraPremiumContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlPrivilegeUltraPremiumContent(Context context) {
        this(context, null);
    }
}
