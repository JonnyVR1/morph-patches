package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.IntlPrivilegeUltraPremiumContent;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeExclusivePrivilegeView;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegePolicyItem;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import l.ah60;
import l.cjy;
import l.e30;
import l.igj;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.sab0;
import l.t100;
import l.vwb;
import l.w9j;
import l.x9j;
import l.y8p;
import p006l.a0p;
import p006l.b90;
import p006l.c3m;
import p006l.cb9;
import p006l.d3n;
import p006l.fxo;
import p006l.h6a;
import p006l.hxo;
import p006l.id40;
import p006l.mp0;
import p006l.r1p;
import p006l.txo;
import p006l.u59;
import p006l.xma;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeUltraPremiumContent extends IntlPrivilegeRecycleView implements hxo {

    /* JADX INFO: renamed from: e */
    public C0386a f6909e;

    /* JADX INFO: renamed from: f */
    public IntlVipNewUiFrag f6910f;

    /* JADX INFO: renamed from: g */
    public c3m f6911g;

    /* JADX INFO: renamed from: h */
    public r1p f6912h;

    /* JADX INFO: renamed from: i */
    public ArrayList<txo> f6913i;

    /* JADX INFO: renamed from: j */
    public a<Unit> f6914j;

    /* JADX INFO: renamed from: k */
    public final b90 f6915k;

    /* JADX INFO: renamed from: l */
    public ProductCategory f6916l;

    public IntlPrivilegeUltraPremiumContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6913i = new ArrayList<>();
        this.f6914j = a.c(Unit.INSTANCE);
        this.f6915k = new b90();
        init();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m9872L(boolean z, boolean z2) {
        if (z2) {
            return;
        }
        lsi0.h(R$string.f2930tc);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ j760 m9876P(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ j760 m9878R(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m9879S(Throwable th) {
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ j760 m9887a0(List list) {
        return new j760(list, (Object) null);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ j760 m9888b0(List list) {
        return new j760(list, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ c m9889d0(Envelope envelope) {
        cb9 cb9Var = CoreModule.f1534c.f3558G2;
        if (cb9Var.f9573R == null || !cb9Var.m13329l3(getPurchaseType())) {
            return CoreModule.f1534c.f3643j0.m2572y5(getPurchaseType().productCategory()).map(new w9j() { // from class: l.o2p
                public final Object call(Object obj) {
                    return IntlPrivilegeUltraPremiumContent.m9887a0((List) obj);
                }
            });
        }
        this.f6916l = CoreModule.f1534c.f3558G2.m13326i3();
        return mkd0.r(CoreModule.f1534c.f3643j0.m2572y5(getPurchaseType().productCategory()), CoreModule.f1534c.f3643j0.m2572y5(this.f6916l), new x9j() { // from class: l.q2p
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeUltraPremiumContent.m9876P((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ c m9890e0(j760 j760Var) {
        return vwb.J((Collection) j760Var.b) ? igj.M(getContext(), (List) j760Var.a).map(new w9j() { // from class: l.s2p
            public final Object call(Object obj) {
                return IntlPrivilegeUltraPremiumContent.m9888b0((List) obj);
            }
        }) : mkd0.r(igj.M(getContext(), (List) j760Var.a), igj.M(getContext(), (List) j760Var.b), new x9j() { // from class: l.u2p
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeUltraPremiumContent.m9878R((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m9891f0(j760 j760Var) {
        Object obj = j760Var.a;
        m9893n0((List) ((j760) obj).a, (List) ((j760) obj).b);
        r1p r1pVar = this.f6912h;
        r1pVar.f20251k = false;
        r1pVar.f20252l = true;
        if (NullChecker.a(j760Var.b) && y8p.d().m() && y8p.d().h("tttUltraPremium")) {
            this.f6912h.f20251k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m9892h0(Boolean bool) {
        m9894o0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    private void m9893n0(List<Merchandise> list, List<Merchandise> list2) {
        PurchaseType purchaseType = PurchaseType.TYPE_ULTRA_PREMIUM;
        if (cjy.z(purchaseType.productCategory()).a(this.f6910f.act(), purchaseType, purchaseType.productCategory(), list).size() == 2) {
            ((id40) this.f6911g).m16609d0(t100.d(47.0f));
            ((id40) this.f6911g).m16611f0(t100.d(47.0f));
        }
        if (NullChecker.a(this.f6912h)) {
            this.f6912h.m22602k(list, list2);
            this.f6912h.m22601j();
            r1p r1pVar = this.f6912h;
            r1pVar.f20247g = false;
            r1pVar.f20248h = null;
            r1pVar.f20246f.onNext(Unit.INSTANCE);
            return;
        }
        r1p r1pVar2 = new r1p(this.f6910f, list, list2, getPurchaseType(), this.f6916l);
        this.f6912h = r1pVar2;
        r1pVar2.m22601j();
        r1p r1pVar3 = this.f6912h;
        r1pVar3.f20247g = false;
        r1pVar3.f20248h = null;
        this.f6913i.add(0, r1pVar3);
        this.f6909e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.k2p
            @Override // java.lang.Runnable
            public final void run() {
                this.f15573a.m9903m0();
            }
        });
        this.f6912h.f20246f.onNext(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: o0 */
    private void m9894o0() {
        this.f6913i.clear();
        if (m9895q0()) {
            this.f6913i.add(this.f6912h);
        }
        if (NullChecker.a(CoreModule.f1534c.f3628e0.m21490p9())) {
            this.f6913i.add(new C0386a.a(getPurchaseType()));
            this.f6913i.add(fxo.m15511c(getPurchaseType()));
            if (!u59.m24988Z()) {
                this.f6913i.add(fxo.m15510b(this.f6910f, getPurchaseType(), null));
            }
            this.f6909e.m9927G(this.f6913i);
        }
    }

    /* JADX INFO: renamed from: q0 */
    private boolean m9895q0() {
        if (u59.m24988Z()) {
            return false;
        }
        return NullChecker.a(this.f6912h);
    }

    /* JADX INFO: renamed from: r0 */
    private void m9896r0(final PurchaseType purchaseType, final PurchaseType purchaseType2) {
        if (this.f6909e == null) {
            return;
        }
        for (int i = 0; i < this.f6913i.size(); i++) {
            if (this.f6913i.get(i) instanceof C0386a.a) {
                RecyclerView.d0 d0VarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i);
                if (d0VarFindViewHolderForAdapterPosition != null) {
                    View view = d0VarFindViewHolderForAdapterPosition.itemView;
                    if (view instanceof IntlPrivilegeExclusivePrivilegeView) {
                        final IntlPrivilegeExclusivePrivilegeView intlPrivilegeExclusivePrivilegeView = (IntlPrivilegeExclusivePrivilegeView) view;
                        intlPrivilegeExclusivePrivilegeView.m9949h(purchaseType, purchaseType2);
                        intlPrivilegeExclusivePrivilegeView.m9945d(purchaseType, purchaseType2, new Runnable() { // from class: l.v2p
                            @Override // java.lang.Runnable
                            public final void run() {
                                intlPrivilegeExclusivePrivilegeView.m9956o(purchaseType, purchaseType2);
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

    @Override // p006l.hxo
    /* JADX INFO: renamed from: b */
    public void mo9825b(int i) {
        id40.f14364E.onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c0 */
    public void m9897c0(d3n d3nVar, final IntlVipNewUiFrag intlVipNewUiFrag) {
        d3nVar.n(intlVipNewUiFrag, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("ultraPremium"))).map(new w9j() { // from class: l.y2p
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m27355L3());
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.e3p
            public final void call(Object obj) {
                this.f10750a.m9892h0((Boolean) obj);
            }
        }));
        intlVipNewUiFrag.duringCreated(CoreModule.f1534c.f3558G2.f9577V).subscribe(mkd0.H(new e30() { // from class: l.g3p
            public final void call(Object obj) {
                this.f13044a.m9901k0(intlVipNewUiFrag, (j760) obj);
            }
        }, new e30() { // from class: l.i3p
            public final void call(Object obj) {
                IntlPrivilegeUltraPremiumContent.m9879S((Throwable) obj);
            }
        }));
        d3nVar.n(intlVipNewUiFrag, ah60.E().filter(new w9j() { // from class: l.k3p
            public final Object call(Object obj) {
                PaymentResultWrapper paymentResultWrapper = (PaymentResultWrapper) obj;
                return Boolean.valueOf(sab0.w(paymentResultWrapper.purchaseType) || sab0.s(paymentResultWrapper.purchaseType) || sab0.q(paymentResultWrapper.purchaseType) || sab0.v(paymentResultWrapper.purchaseType));
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.m3p
            public final void call(Object obj) {
                this.f16786a.m9902l0((PaymentResultWrapper) obj);
            }
        }));
        c cVarObserveOn = ((!h6a.m16049c() || xma.m27379e4()) ? c.just((Object) null) : this.f6914j.flatMap(new w9j() { // from class: l.b2p
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3558G2.m13336s3();
            }
        })).flatMap(new w9j() { // from class: l.e2p
            public final Object call(Object obj) {
                return this.f10740a.m9889d0((Envelope) obj);
            }
        }).filter(new w9j() { // from class: l.g2p
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((Collection) ((j760) obj).a));
            }
        }).flatMap(new w9j() { // from class: l.i2p
            public final Object call(Object obj) {
                return this.f14211a.m9890e0((j760) obj);
            }
        }).observeOn(jo0.a());
        if (u59.m24988Z()) {
            return;
        }
        if (u59.m24985W()) {
            m9798G(d3nVar, intlVipNewUiFrag, c.combineLatest(cVarObserveOn, y8p.d().n().distinctUntilChanged(), new a0p()), new e30() { // from class: l.a3p
                public final void call(Object obj) {
                    this.f8086a.m9891f0((j760) obj);
                }
            });
        } else {
            m9798G(d3nVar, intlVipNewUiFrag, cVarObserveOn, new e30() { // from class: l.c3p
                public final void call(Object obj) {
                    this.f9326a.m9898g0((j760) obj);
                }
            });
        }
    }

    @Override // p006l.hxo
    /* JADX INFO: renamed from: f */
    public void mo9826f(PurchaseType purchaseType, PurchaseType purchaseType2) {
        id40.f14365F.onNext(Unit.INSTANCE);
        m9896r0(purchaseType, purchaseType2);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m9898g0(j760 j760Var) {
        m9893n0((List) j760Var.a, (List) j760Var.b);
    }

    @Override // p006l.hxo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_ULTRA_PREMIUM;
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m9899i0(IntlVipNewUiFrag intlVipNewUiFrag, j760 j760Var, txo txoVar) {
        if (txoVar instanceof IntlPrivilegePolicyItem.C0391a) {
            int iIndexOf = this.f6913i.indexOf(txoVar);
            this.f6913i.remove(txoVar);
            this.f6913i.add(iIndexOf, fxo.m15510b(intlVipNewUiFrag, getPurchaseType(), (d) j760Var.b));
            this.f6909e.notifyItemChanged(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m9900j0(final IntlVipNewUiFrag intlVipNewUiFrag, final j760 j760Var) {
        if (intlVipNewUiFrag.isAdded() && !u59.m24988Z()) {
            vwb.z(this.f6913i, new e30() { // from class: l.w2p
                public final void call(Object obj) {
                    this.f24893a.m9899i0(intlVipNewUiFrag, j760Var, (txo) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m9901k0(final IntlVipNewUiFrag intlVipNewUiFrag, final j760 j760Var) {
        if (NullChecker.a(j760Var) && j760Var.a == getPurchaseType()) {
            post(new Runnable() { // from class: l.m2p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16772a.m9900j0(intlVipNewUiFrag, j760Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m9902l0(PaymentResultWrapper paymentResultWrapper) {
        this.f6914j.onNext(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m9903m0() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public void m9904p0(IntlVipNewUiFrag intlVipNewUiFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        C0386a c0386a = new C0386a(intlVipNewUiFrag, this.f6911g, this);
        this.f6909e = c0386a;
        setAdapter(c0386a);
        m9894o0();
    }

    @Override // p006l.hxo
    /* JADX INFO: renamed from: z */
    public void mo9845z(d3n d3nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f6910f = intlVipNewUiFrag;
        id40 id40Var = new id40(intlVipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f6911g = id40Var;
        int i = t100.i;
        id40Var.m16610e0(i, 0, i, 0);
        this.f6911g.mo13100c(this.f6915k);
        c3m c3mVar = this.f6911g;
        if (c3mVar instanceof id40) {
            ((id40) c3mVar).m19485H(new mp0.InterfaceC1028a() { // from class: l.z1p
                @Override // p006l.mp0.InterfaceC1028a
                /* JADX INFO: renamed from: a */
                public final void mo19497a(boolean z, boolean z2) {
                    IntlPrivilegeUltraPremiumContent.m9872L(z, z2);
                }
            });
        }
        m9904p0(intlVipNewUiFrag);
        m9897c0(d3nVar, intlVipNewUiFrag);
    }

    public IntlPrivilegeUltraPremiumContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlPrivilegeUltraPremiumContent(Context context) {
        this(context, null);
    }
}
