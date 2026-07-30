package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.IntlPrivilegeUltraPremiumContent;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeExclusivePrivilegeView;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegePolicyItem;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.a0p;
import p149l.ah60;
import p149l.b90;
import p149l.c3m;
import p149l.cb9;
import p149l.cjy;
import p149l.d3n;
import p149l.e30;
import p149l.fxo;
import p149l.h6a;
import p149l.hxo;
import p149l.id40;
import p149l.igj;
import p149l.j760;
import p149l.jo0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mp0;
import p149l.r1p;
import p149l.t100;
import p149l.txo;
import p149l.u59;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.xma;
import p149l.y8p;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeUltraPremiumContent extends IntlPrivilegeRecycleView implements hxo {

    /* JADX INFO: renamed from: e */
    public C8950a f37128e;

    /* JADX INFO: renamed from: f */
    public IntlVipNewUiFrag f37129f;

    /* JADX INFO: renamed from: g */
    public c3m f37130g;

    /* JADX INFO: renamed from: h */
    public r1p f37131h;

    /* JADX INFO: renamed from: i */
    public ArrayList<txo> f37132i;

    /* JADX INFO: renamed from: j */
    public C22392a<Unit> f37133j;

    /* JADX INFO: renamed from: k */
    public final b90 f37134k;

    /* JADX INFO: renamed from: l */
    public ProductCategory f37135l;

    public IntlPrivilegeUltraPremiumContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37132i = new ArrayList<>();
        this.f37133j = C22392a.m221513c(Unit.INSTANCE);
        this.f37134k = new b90();
        init();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m56434L(boolean z, boolean z2) {
        if (z2) {
            return;
        }
        lsi0.m151578h(R$string.f18941tc);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ j760 m56438P(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ j760 m56440R(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m56441S(Throwable th) {
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ j760 m56449a0(List list) {
        return new j760(list, null);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ j760 m56450b0(List list) {
        return new j760(list, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ C22306c m56451d0(Envelope envelope) {
        cb9 cb9Var = CoreModule.f17545c.f19569G2;
        if (cb9Var.f80117R == null || !cb9Var.m105984l3(getPurchaseType())) {
            return CoreModule.f17545c.f19654j0.m30644y5(getPurchaseType().productCategory()).map(new w9j() { // from class: l.o2p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlPrivilegeUltraPremiumContent.m56449a0((List) obj);
                }
            });
        }
        this.f37135l = CoreModule.f17545c.f19569G2.m105981i3();
        return mkd0.m154984r(CoreModule.f17545c.f19654j0.m30644y5(getPurchaseType().productCategory()), CoreModule.f17545c.f19654j0.m30644y5(this.f37135l), new x9j() { // from class: l.q2p
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeUltraPremiumContent.m56438P((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ C22306c m56452e0(j760 j760Var) {
        return vwb.m200296J((Collection) j760Var.f116565b) ? igj.m136009M(getContext(), (List) j760Var.f116564a).map(new w9j() { // from class: l.s2p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPrivilegeUltraPremiumContent.m56450b0((List) obj);
            }
        }) : mkd0.m154984r(igj.m136009M(getContext(), (List) j760Var.f116564a), igj.m136009M(getContext(), (List) j760Var.f116565b), new x9j() { // from class: l.u2p
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeUltraPremiumContent.m56440R((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m56453f0(j760 j760Var) {
        F f = j760Var.f116564a;
        m56455n0((List) ((j760) f).f116564a, (List) ((j760) f).f116565b);
        r1p r1pVar = this.f37131h;
        r1pVar.f157315k = false;
        r1pVar.f157316l = true;
        if (NullChecker.m81303a(j760Var.f116565b) && y8p.m213413d().m213423m() && y8p.m213413d().m213421h(ProductCategory.tttUltraPremium)) {
            this.f37131h.f157315k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m56454h0(Boolean bool) {
        m56456o0();
    }

    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: renamed from: n0 */
    private void m56455n0(List<Merchandise> list, List<Merchandise> list2) {
        PurchaseType purchaseType = PurchaseType.TYPE_ULTRA_PREMIUM;
        if (cjy.m107330z(purchaseType.productCategory()).mo107333a(this.f37129f.act(), purchaseType, purchaseType.productCategory(), list).size() == 2) {
            ((id40) this.f37130g).m135414d0(t100.m186890d(47.0f));
            ((id40) this.f37130g).m135416f0(t100.m186890d(47.0f));
        }
        if (NullChecker.m81303a(this.f37131h)) {
            this.f37131h.m177543k(list, list2);
            this.f37131h.m177542j();
            r1p r1pVar = this.f37131h;
            r1pVar.f157311g = false;
            r1pVar.f157312h = null;
            r1pVar.f157310f.m132487l(Unit.INSTANCE);
            return;
        }
        r1p r1pVar2 = new r1p(this.f37129f, list, list2, getPurchaseType(), this.f37135l);
        this.f37131h = r1pVar2;
        r1pVar2.m177542j();
        r1p r1pVar3 = this.f37131h;
        r1pVar3.f157311g = false;
        r1pVar3.f157312h = null;
        this.f37132i.add(0, r1pVar3);
        this.f37128e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.k2p
            @Override // java.lang.Runnable
            public final void run() {
                this.f120755a.m56465m0();
            }
        });
        this.f37131h.f157310f.m132487l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: o0 */
    private void m56456o0() {
        this.f37132i.clear();
        if (m56457q0()) {
            this.f37132i.add(this.f37131h);
        }
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9())) {
            this.f37132i.add(new C8950a.a(getPurchaseType()));
            this.f37132i.add(fxo.m123643c(getPurchaseType()));
            if (!u59.m191817Z()) {
                this.f37132i.add(fxo.m123642b(this.f37129f, getPurchaseType(), null));
            }
            this.f37128e.m56486G(this.f37132i);
        }
    }

    /* JADX INFO: renamed from: q0 */
    private boolean m56457q0() {
        if (u59.m191817Z()) {
            return false;
        }
        return NullChecker.m81303a(this.f37131h);
    }

    /* JADX INFO: renamed from: r0 */
    private void m56458r0(final PurchaseType purchaseType, final PurchaseType purchaseType2) {
        if (this.f37128e == null) {
            return;
        }
        for (int i = 0; i < this.f37132i.size(); i++) {
            if (this.f37132i.get(i) instanceof C8950a.a) {
                RecyclerView.AbstractC0566d0 abstractC0566d0FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i);
                if (abstractC0566d0FindViewHolderForAdapterPosition != null) {
                    View view = abstractC0566d0FindViewHolderForAdapterPosition.itemView;
                    if (view instanceof IntlPrivilegeExclusivePrivilegeView) {
                        final IntlPrivilegeExclusivePrivilegeView intlPrivilegeExclusivePrivilegeView = (IntlPrivilegeExclusivePrivilegeView) view;
                        intlPrivilegeExclusivePrivilegeView.m56508h(purchaseType, purchaseType2);
                        intlPrivilegeExclusivePrivilegeView.m56504d(purchaseType, purchaseType2, new Runnable() { // from class: l.v2p
                            @Override // java.lang.Runnable
                            public final void run() {
                                intlPrivilegeExclusivePrivilegeView.m56515o(purchaseType, purchaseType2);
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

    @Override // p149l.hxo
    /* JADX INFO: renamed from: b */
    public void mo56387b(int i) {
        id40.f112518E.m132487l(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c0 */
    public void m56459c0(d3n d3nVar, final IntlVipNewUiFrag intlVipNewUiFrag) {
        d3nVar.m115452n(intlVipNewUiFrag, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium))).map(new w9j() { // from class: l.y2p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210047L3());
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.e3p
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89203a.m56454h0((Boolean) obj);
            }
        }));
        intlVipNewUiFrag.duringCreated(CoreModule.f17545c.f19569G2.f80121V).subscribe(mkd0.m154956H(new e30() { // from class: l.g3p
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100489a.m56463k0(intlVipNewUiFrag, (j760) obj);
            }
        }, new e30() { // from class: l.i3p
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPrivilegeUltraPremiumContent.m56441S((Throwable) obj);
            }
        }));
        d3nVar.m115452n(intlVipNewUiFrag, ah60.m96370E().filter(new w9j() { // from class: l.k3p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                PaymentResultWrapper paymentResultWrapper = (PaymentResultWrapper) obj;
                return Boolean.valueOf(sab0.m182905w(paymentResultWrapper.purchaseType) || sab0.m182901s(paymentResultWrapper.purchaseType) || sab0.m182899q(paymentResultWrapper.purchaseType) || sab0.m182904v(paymentResultWrapper.purchaseType));
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.m3p
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131112a.m56464l0((PaymentResultWrapper) obj);
            }
        }));
        C22306c c22306cObserveOn = ((!h6a.m129470c() || xma.m210071e4()) ? C22306c.just(null) : this.f37133j.flatMap(new w9j() { // from class: l.b2p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19569G2.m105991s3();
            }
        })).flatMap(new w9j() { // from class: l.e2p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88936a.m56451d0((Envelope) obj);
            }
        }).filter(new w9j() { // from class: l.g2p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((Collection) ((j760) obj).f116564a));
            }
        }).flatMap(new w9j() { // from class: l.i2p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f110572a.m56452e0((j760) obj);
            }
        }).observeOn(jo0.m142408a());
        if (u59.m191817Z()) {
            return;
        }
        if (u59.m191814W()) {
            m56360G(d3nVar, intlVipNewUiFrag, C22306c.combineLatest(c22306cObserveOn, y8p.m213413d().m213424n().distinctUntilChanged(), new a0p()), new e30() { // from class: l.a3p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f67407a.m56453f0((j760) obj);
                }
            });
        } else {
            m56360G(d3nVar, intlVipNewUiFrag, c22306cObserveOn, new e30() { // from class: l.c3p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f79023a.m56460g0((j760) obj);
                }
            });
        }
    }

    @Override // p149l.hxo
    /* JADX INFO: renamed from: f */
    public void mo56388f(PurchaseType purchaseType, PurchaseType purchaseType2) {
        id40.f112519F.m132487l(Unit.INSTANCE);
        m56458r0(purchaseType, purchaseType2);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m56460g0(j760 j760Var) {
        m56455n0((List) j760Var.f116564a, (List) j760Var.f116565b);
    }

    @Override // p149l.hxo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_ULTRA_PREMIUM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m56461i0(IntlVipNewUiFrag intlVipNewUiFrag, j760 j760Var, txo txoVar) {
        if (txoVar instanceof IntlPrivilegePolicyItem.C8955a) {
            int iIndexOf = this.f37132i.indexOf(txoVar);
            this.f37132i.remove(txoVar);
            this.f37132i.add(iIndexOf, fxo.m123642b(intlVipNewUiFrag, getPurchaseType(), (C8765d) j760Var.f116565b));
            this.f37128e.notifyItemChanged(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m56462j0(final IntlVipNewUiFrag intlVipNewUiFrag, final j760 j760Var) {
        if (intlVipNewUiFrag.isAdded() && !u59.m191817Z()) {
            vwb.m200354z(this.f37132i, new e30() { // from class: l.w2p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f184268a.m56461i0(intlVipNewUiFrag, j760Var, (txo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m56463k0(final IntlVipNewUiFrag intlVipNewUiFrag, final j760 j760Var) {
        if (NullChecker.m81303a(j760Var) && j760Var.f116564a == getPurchaseType()) {
            post(new Runnable() { // from class: l.m2p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f130935a.m56462j0(intlVipNewUiFrag, j760Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m56464l0(PaymentResultWrapper paymentResultWrapper) {
        this.f37133j.m132487l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m56465m0() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m56466p0(IntlVipNewUiFrag intlVipNewUiFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        C8950a c8950a = new C8950a(intlVipNewUiFrag, this.f37130g, this);
        this.f37128e = c8950a;
        setAdapter(c8950a);
        m56456o0();
    }

    @Override // p149l.hxo
    /* JADX INFO: renamed from: z */
    public void mo56407z(d3n d3nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f37129f = intlVipNewUiFrag;
        id40 id40Var = new id40(intlVipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f37130g = id40Var;
        int i = t100.f167260i;
        id40Var.m135415e0(i, 0, i, 0);
        this.f37130g.mo105094c(this.f37134k);
        c3m c3mVar = this.f37130g;
        if (c3mVar instanceof id40) {
            ((id40) c3mVar).m155738H(new mp0.InterfaceC18522a() { // from class: l.z1p
                @Override // p149l.mp0.InterfaceC18522a
                /* JADX INFO: renamed from: a */
                public final void mo106044a(boolean z, boolean z2) {
                    IntlPrivilegeUltraPremiumContent.m56434L(z, z2);
                }
            });
        }
        m56466p0(intlVipNewUiFrag);
        m56459c0(d3nVar, intlVipNewUiFrag);
    }

    public IntlPrivilegeUltraPremiumContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlPrivilegeUltraPremiumContent(Context context) {
        this(context, null);
    }
}
