package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.IntlPrivilegeSVipContent;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeExclusivePrivilegeView;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegePolicyItem;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import l.ah60;
import l.e30;
import l.igj;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.rxa0;
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
import p006l.m0p;
import p006l.mp0;
import p006l.r1p;
import p006l.txo;
import p006l.u59;
import p006l.xma;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeSVipContent extends IntlPrivilegeRecycleView implements hxo {

    /* JADX INFO: renamed from: e */
    public C0386a f6895e;

    /* JADX INFO: renamed from: f */
    public IntlVipNewUiFrag f6896f;

    /* JADX INFO: renamed from: g */
    public c3m f6897g;

    /* JADX INFO: renamed from: h */
    public r1p f6898h;

    /* JADX INFO: renamed from: i */
    public ArrayList<txo> f6899i;

    /* JADX INFO: renamed from: j */
    public final b90 f6900j;

    /* JADX INFO: renamed from: k */
    public a<Unit> f6901k;

    /* JADX INFO: renamed from: l */
    public ProductCategory f6902l;

    public IntlPrivilegeSVipContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6899i = new ArrayList<>();
        this.f6900j = new b90();
        this.f6901k = a.c(Unit.INSTANCE);
        init();
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ List m9802K(List list) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.xzo
            public final void call(Object obj) {
                IntlPrivilegeSVipContent.m9824g0(arrayList, (Merchandise) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ j760 m9804M(List list) {
        return new j760(list, (Object) null);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m9812U(Throwable th) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m9813V(boolean z, boolean z2) {
        if (z2) {
            return;
        }
        lsi0.h(R$string.f2930tc);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ j760 m9814W(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ j760 m9817Z(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ j760 m9823f0(List list) {
        return new j760(list, (Object) null);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m9824g0(List list, Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        if (merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || stockKeepUnit.affiliateProducts == null || CoreModule.f1534c.f3643j0.m2504C4() == null || !CoreModule.f1534c.f3643j0.m2504C4().skuId.equals(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay)) {
            return;
        }
        list.add(merchandise);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // p006l.hxo
    /* JADX INFO: renamed from: b */
    public void mo9825b(int i) {
        id40.f14364E.onNext(Integer.valueOf(i));
    }

    @Override // p006l.hxo
    /* JADX INFO: renamed from: f */
    public void mo9826f(PurchaseType purchaseType, PurchaseType purchaseType2) {
        id40.f14365F.onNext(Unit.INSTANCE);
        m9846z0(purchaseType, purchaseType2);
    }

    @Override // p006l.hxo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
    }

    /* JADX INFO: renamed from: h0 */
    public final Merchandise m9827h0(List<Merchandise> list) {
        Merchandise merchandise = null;
        if (vwb.J(list)) {
            return null;
        }
        int i = -1;
        for (Merchandise merchandise2 : list) {
            if (merchandise2.autoRenewable() && rxa0.w(merchandise2) && (merchandise == null || i != Math.max(i, merchandise2.quantity))) {
                i = merchandise2.quantity;
                merchandise = merchandise2;
            }
        }
        return merchandise;
    }

    /* JADX INFO: renamed from: i0 */
    public void m9828i0(d3n d3nVar, final IntlVipNewUiFrag intlVipNewUiFrag) {
        d3nVar.n(intlVipNewUiFrag, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("svip"))).map(new w9j() { // from class: l.lzo
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m27355L3());
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ryo
            public final void call(Object obj) {
                this.f20920a.m9834o0((Boolean) obj);
            }
        }));
        d3nVar.n(intlVipNewUiFrag, ah60.E().filter(new w9j() { // from class: l.uyo
            public final Object call(Object obj) {
                PaymentResultWrapper paymentResultWrapper = (PaymentResultWrapper) obj;
                return Boolean.valueOf(sab0.w(paymentResultWrapper.purchaseType) || sab0.s(paymentResultWrapper.purchaseType) || sab0.q(paymentResultWrapper.purchaseType) || sab0.v(paymentResultWrapper.purchaseType));
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.wyo
            public final void call(Object obj) {
                this.f25502a.m9835p0((PaymentResultWrapper) obj);
            }
        }));
        intlVipNewUiFrag.duringCreated(CoreModule.f1534c.f3558G2.f9577V).subscribe(mkd0.H(new e30() { // from class: l.yyo
            public final void call(Object obj) {
                this.f28504a.m9838s0(intlVipNewUiFrag, (j760) obj);
            }
        }, new e30() { // from class: l.azo
            public final void call(Object obj) {
                IntlPrivilegeSVipContent.m9812U((Throwable) obj);
            }
        }));
        c cVarObserveOn = ((!h6a.m16049c() || (xma.m27395m4() && xma.m27385h4())) ? c.just((Object) null) : this.f6901k.flatMap(new w9j() { // from class: l.czo
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3558G2.m13336s3();
            }
        })).flatMap(new w9j() { // from class: l.ezo
            public final Object call(Object obj) {
                return this.f11542a.m9829j0((Envelope) obj);
            }
        }).filter(new w9j() { // from class: l.gzo
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((Collection) ((j760) obj).a));
            }
        }).flatMap(new w9j() { // from class: l.izo
            public final Object call(Object obj) {
                return this.f14908a.m9830k0((j760) obj);
            }
        }).observeOn(jo0.a());
        if (u59.m24988Z()) {
            return;
        }
        if (u59.m24985W()) {
            m9798G(d3nVar, intlVipNewUiFrag, c.combineLatest(cVarObserveOn, y8p.d().n().distinctUntilChanged(), new a0p()), new e30() { // from class: l.c0p
                public final void call(Object obj) {
                    this.f9268a.m9831l0((j760) obj);
                }
            });
        } else {
            m9798G(d3nVar, intlVipNewUiFrag, c.combineLatest(cVarObserveOn, CoreModule.f1534c.f3643j0.m2573z4() ? CoreModule.f1534c.f3643j0.m2572y5(ProductCategory.get("tttSvipGoogleplayFreeTrial")).filter(new w9j() { // from class: l.e0p
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).map(new w9j() { // from class: l.g0p
                public final Object call(Object obj) {
                    return IntlPrivilegeSVipContent.m9802K((List) obj);
                }
            }).flatMap(new w9j() { // from class: l.i0p
                public final Object call(Object obj) {
                    return this.f14185a.m9832m0((List) obj);
                }
            }).onErrorResumeNext(new w9j() { // from class: l.k0p
                public final Object call(Object obj) {
                    return c.just((Object) null);
                }
            }).observeOn(jo0.a()) : c.just((Object) null), new m0p()), new e30() { // from class: l.o0p
                public final void call(Object obj) {
                    this.f17971a.m9833n0((j760) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ c m9829j0(Envelope envelope) {
        cb9 cb9Var = CoreModule.f1534c.f3558G2;
        if (cb9Var.f9573R == null || !cb9Var.m13329l3(getPurchaseType())) {
            return CoreModule.f1534c.f3643j0.m2572y5(getPurchaseType().productCategory()).map(new w9j() { // from class: l.rzo
                public final Object call(Object obj) {
                    return IntlPrivilegeSVipContent.m9804M((List) obj);
                }
            });
        }
        this.f6902l = CoreModule.f1534c.f3558G2.m13326i3();
        return mkd0.r(CoreModule.f1534c.f3643j0.m2572y5(getPurchaseType().productCategory()), CoreModule.f1534c.f3643j0.m2572y5(this.f6902l), new x9j() { // from class: l.tzo
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeSVipContent.m9814W((List) obj, (List) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ c m9830k0(j760 j760Var) {
        return vwb.J((Collection) j760Var.b) ? igj.M(getContext(), (List) j760Var.a).map(new w9j() { // from class: l.nzo
            public final Object call(Object obj) {
                return IntlPrivilegeSVipContent.m9823f0((List) obj);
            }
        }) : mkd0.r(igj.M(getContext(), (List) j760Var.a), igj.M(getContext(), (List) j760Var.b), new x9j() { // from class: l.pzo
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeSVipContent.m9817Z((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m9831l0(j760 j760Var) {
        Object obj = j760Var.a;
        m9840u0((List) ((j760) obj).a, (List) ((j760) obj).b);
        r1p r1pVar = this.f6898h;
        r1pVar.f20251k = false;
        r1pVar.f20252l = true;
        if (NullChecker.a(j760Var.b) && y8p.d().m() && y8p.d().h("svip")) {
            this.f6898h.f20251k = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ c m9832m0(List list) {
        return igj.M(getContext(), list);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m9833n0(j760 j760Var) {
        Object obj = j760Var.a;
        List<Merchandise> list = (List) ((j760) obj).a;
        List<Merchandise> list2 = (List) ((j760) obj).b;
        if (!vwb.J((Collection) j760Var.b)) {
            Merchandise merchandise = (Merchandise) ((List) j760Var.b).get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).quantity == merchandise.quantity) {
                    list.set(i, merchandise);
                    break;
                }
            }
        }
        m9840u0(list, list2);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m9834o0(Boolean bool) {
        m9841v0();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m9835p0(PaymentResultWrapper paymentResultWrapper) {
        this.f6901k.onNext(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m9836q0(IntlVipNewUiFrag intlVipNewUiFrag, j760 j760Var, txo txoVar) {
        if (txoVar instanceof IntlPrivilegePolicyItem.C0391a) {
            int iIndexOf = this.f6899i.indexOf(txoVar);
            this.f6899i.remove(txoVar);
            this.f6899i.add(iIndexOf, fxo.m15510b(intlVipNewUiFrag, getPurchaseType(), (d) j760Var.b));
            this.f6895e.notifyItemChanged(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m9837r0(final IntlVipNewUiFrag intlVipNewUiFrag, final j760 j760Var) {
        if (intlVipNewUiFrag.isAdded() && !u59.m24988Z()) {
            vwb.z(this.f6899i, new e30() { // from class: l.yzo
                public final void call(Object obj) {
                    this.f28527a.m9836q0(intlVipNewUiFrag, j760Var, (txo) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m9838s0(final IntlVipNewUiFrag intlVipNewUiFrag, final j760 j760Var) {
        if (NullChecker.a(j760Var) && j760Var.a == getPurchaseType()) {
            post(new Runnable() { // from class: l.wzo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25510a.m9837r0(intlVipNewUiFrag, j760Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m9839t0() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final void m9840u0(List<Merchandise> list, List<Merchandise> list2) {
        if (NullChecker.a(this.f6898h)) {
            this.f6898h.m22602k(list, list2);
            this.f6898h.m22601j();
            r1p r1pVar = this.f6898h;
            r1pVar.f20247g = false;
            r1pVar.f20248h = m9827h0(list);
            this.f6898h.f20246f.onNext(Unit.INSTANCE);
            return;
        }
        r1p r1pVar2 = new r1p(this.f6896f, list, list2, getPurchaseType(), this.f6902l);
        this.f6898h = r1pVar2;
        r1pVar2.m22601j();
        r1p r1pVar3 = this.f6898h;
        r1pVar3.f20247g = false;
        r1pVar3.f20248h = m9827h0(list);
        this.f6899i.add(0, this.f6898h);
        this.f6895e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.vzo
            @Override // java.lang.Runnable
            public final void run() {
                this.f24567a.m9839t0();
            }
        });
        this.f6898h.f20246f.onNext(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m9841v0() {
        this.f6899i.clear();
        if (m9844y0()) {
            this.f6899i.add(this.f6898h);
        }
        if (NullChecker.a(CoreModule.f1534c.f3628e0.m21490p9())) {
            this.f6899i.add(new C0386a.a(getPurchaseType()));
            this.f6899i.add(fxo.m15511c(getPurchaseType()));
            if (!u59.m24988Z()) {
                this.f6899i.add(fxo.m15510b(this.f6896f, getPurchaseType(), null));
            }
            this.f6895e.m9927G(this.f6899i);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m9842w0() {
        c3m c3mVar = this.f6897g;
        if (c3mVar != null) {
            c3mVar.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x0 */
    public void m9843x0(IntlVipNewUiFrag intlVipNewUiFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        C0386a c0386a = new C0386a(intlVipNewUiFrag, this.f6897g, this);
        this.f6895e = c0386a;
        setAdapter(c0386a);
        m9841v0();
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m9844y0() {
        if (u59.m24988Z()) {
            return false;
        }
        return NullChecker.a(this.f6898h);
    }

    @Override // p006l.hxo
    /* JADX INFO: renamed from: z */
    public void mo9845z(d3n d3nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f6896f = intlVipNewUiFrag;
        id40 id40Var = new id40(intlVipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f6897g = id40Var;
        id40Var.mo13100c(this.f6900j);
        c3m c3mVar = this.f6897g;
        if (c3mVar instanceof id40) {
            ((id40) c3mVar).m19485H(new mp0.InterfaceC1028a() { // from class: l.pyo
                @Override // p006l.mp0.InterfaceC1028a
                /* JADX INFO: renamed from: a */
                public final void mo19497a(boolean z, boolean z2) {
                    IntlPrivilegeSVipContent.m9813V(z, z2);
                }
            });
            ((id40) this.f6897g).m16607c0(t100.d(0.0f));
        }
        m9843x0(intlVipNewUiFrag);
        m9828i0(d3nVar, intlVipNewUiFrag);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m9846z0(final PurchaseType purchaseType, final PurchaseType purchaseType2) {
        if (this.f6895e == null) {
            return;
        }
        for (int i = 0; i < this.f6899i.size(); i++) {
            if (this.f6899i.get(i) instanceof C0386a.a) {
                RecyclerView.d0 d0VarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i);
                if (d0VarFindViewHolderForAdapterPosition != null) {
                    View view = d0VarFindViewHolderForAdapterPosition.itemView;
                    if (view instanceof IntlPrivilegeExclusivePrivilegeView) {
                        final IntlPrivilegeExclusivePrivilegeView intlPrivilegeExclusivePrivilegeView = (IntlPrivilegeExclusivePrivilegeView) view;
                        intlPrivilegeExclusivePrivilegeView.m9949h(purchaseType, purchaseType2);
                        intlPrivilegeExclusivePrivilegeView.m9945d(purchaseType, purchaseType2, new Runnable() { // from class: l.kzo
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

    public IntlPrivilegeSVipContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlPrivilegeSVipContent(Context context) {
        this(context, null);
    }
}
