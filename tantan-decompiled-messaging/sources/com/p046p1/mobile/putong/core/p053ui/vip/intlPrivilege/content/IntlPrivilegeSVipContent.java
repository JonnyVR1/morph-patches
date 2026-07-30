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
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.IntlPrivilegeSVipContent;
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
import p149l.m0p;
import p149l.mkd0;
import p149l.mp0;
import p149l.r1p;
import p149l.rxa0;
import p149l.t100;
import p149l.txo;
import p149l.u59;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.xma;
import p149l.y8p;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeSVipContent extends IntlPrivilegeRecycleView implements hxo {

    /* JADX INFO: renamed from: e */
    public C8950a f37114e;

    /* JADX INFO: renamed from: f */
    public IntlVipNewUiFrag f37115f;

    /* JADX INFO: renamed from: g */
    public c3m f37116g;

    /* JADX INFO: renamed from: h */
    public r1p f37117h;

    /* JADX INFO: renamed from: i */
    public ArrayList<txo> f37118i;

    /* JADX INFO: renamed from: j */
    public final b90 f37119j;

    /* JADX INFO: renamed from: k */
    public C22392a<Unit> f37120k;

    /* JADX INFO: renamed from: l */
    public ProductCategory f37121l;

    public IntlPrivilegeSVipContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37118i = new ArrayList<>();
        this.f37119j = new b90();
        this.f37120k = C22392a.m221513c(Unit.INSTANCE);
        init();
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ List m56364K(List list) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.xzo
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPrivilegeSVipContent.m56386g0(arrayList, (Merchandise) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ j760 m56366M(List list) {
        return new j760(list, null);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m56374U(Throwable th) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m56375V(boolean z, boolean z2) {
        if (z2) {
            return;
        }
        lsi0.m151578h(R$string.f18941tc);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ j760 m56376W(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ j760 m56379Z(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ j760 m56385f0(List list) {
        return new j760(list, null);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m56386g0(List list, Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        if (merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || stockKeepUnit.affiliateProducts == null || CoreModule.f17545c.f19654j0.m30576C4() == null || !CoreModule.f17545c.f19654j0.m30576C4().skuId.equals(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay)) {
            return;
        }
        list.add(merchandise);
    }

    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // p149l.hxo
    /* JADX INFO: renamed from: b */
    public void mo56387b(int i) {
        id40.f112518E.m132487l(Integer.valueOf(i));
    }

    @Override // p149l.hxo
    /* JADX INFO: renamed from: f */
    public void mo56388f(PurchaseType purchaseType, PurchaseType purchaseType2) {
        id40.f112519F.m132487l(Unit.INSTANCE);
        m56408z0(purchaseType, purchaseType2);
    }

    @Override // p149l.hxo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
    }

    /* JADX INFO: renamed from: h0 */
    public final Merchandise m56389h0(List<Merchandise> list) {
        Merchandise merchandise = null;
        if (vwb.m200296J(list)) {
            return null;
        }
        int i = -1;
        for (Merchandise merchandise2 : list) {
            if (merchandise2.autoRenewable() && rxa0.m181502w(merchandise2) && (merchandise == null || i != Math.max(i, merchandise2.quantity))) {
                i = merchandise2.quantity;
                merchandise = merchandise2;
            }
        }
        return merchandise;
    }

    /* JADX INFO: renamed from: i0 */
    public void m56390i0(d3n d3nVar, final IntlVipNewUiFrag intlVipNewUiFrag) {
        d3nVar.m115452n(intlVipNewUiFrag, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"))).map(new w9j() { // from class: l.lzo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210047L3());
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ryo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161568a.m56396o0((Boolean) obj);
            }
        }));
        d3nVar.m115452n(intlVipNewUiFrag, ah60.m96370E().filter(new w9j() { // from class: l.uyo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                PaymentResultWrapper paymentResultWrapper = (PaymentResultWrapper) obj;
                return Boolean.valueOf(sab0.m182905w(paymentResultWrapper.purchaseType) || sab0.m182901s(paymentResultWrapper.purchaseType) || sab0.m182899q(paymentResultWrapper.purchaseType) || sab0.m182904v(paymentResultWrapper.purchaseType));
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.wyo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188580a.m56397p0((PaymentResultWrapper) obj);
            }
        }));
        intlVipNewUiFrag.duringCreated(CoreModule.f17545c.f19569G2.f80121V).subscribe(mkd0.m154956H(new e30() { // from class: l.yyo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200790a.m56400s0(intlVipNewUiFrag, (j760) obj);
            }
        }, new e30() { // from class: l.azo
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPrivilegeSVipContent.m56374U((Throwable) obj);
            }
        }));
        C22306c c22306cObserveOn = ((!h6a.m129470c() || (xma.m210087m4() && xma.m210077h4())) ? C22306c.just(null) : this.f37120k.flatMap(new w9j() { // from class: l.czo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19569G2.m105991s3();
            }
        })).flatMap(new w9j() { // from class: l.ezo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93932a.m56391j0((Envelope) obj);
            }
        }).filter(new w9j() { // from class: l.gzo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((Collection) ((j760) obj).f116564a));
            }
        }).flatMap(new w9j() { // from class: l.izo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f115584a.m56392k0((j760) obj);
            }
        }).observeOn(jo0.m142408a());
        if (u59.m191817Z()) {
            return;
        }
        if (u59.m191814W()) {
            m56360G(d3nVar, intlVipNewUiFrag, C22306c.combineLatest(c22306cObserveOn, y8p.m213413d().m213424n().distinctUntilChanged(), new a0p()), new e30() { // from class: l.c0p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f78163a.m56393l0((j760) obj);
                }
            });
        } else {
            m56360G(d3nVar, intlVipNewUiFrag, C22306c.combineLatest(c22306cObserveOn, CoreModule.f17545c.f19654j0.m30645z4() ? CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial)).filter(new w9j() { // from class: l.e0p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).map(new w9j() { // from class: l.g0p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlPrivilegeSVipContent.m56364K((List) obj);
                }
            }).flatMap(new w9j() { // from class: l.i0p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f110369a.m56394m0((List) obj);
                }
            }).onErrorResumeNext(new w9j() { // from class: l.k0p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C22306c.just(null);
                }
            }).observeOn(jo0.m142408a()) : C22306c.just(null), new m0p()), new e30() { // from class: l.o0p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f141355a.m56395n0((j760) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ C22306c m56391j0(Envelope envelope) {
        cb9 cb9Var = CoreModule.f17545c.f19569G2;
        if (cb9Var.f80117R == null || !cb9Var.m105984l3(getPurchaseType())) {
            return CoreModule.f17545c.f19654j0.m30644y5(getPurchaseType().productCategory()).map(new w9j() { // from class: l.rzo
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlPrivilegeSVipContent.m56366M((List) obj);
                }
            });
        }
        this.f37121l = CoreModule.f17545c.f19569G2.m105981i3();
        return mkd0.m154984r(CoreModule.f17545c.f19654j0.m30644y5(getPurchaseType().productCategory()), CoreModule.f17545c.f19654j0.m30644y5(this.f37121l), new x9j() { // from class: l.tzo
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeSVipContent.m56376W((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ C22306c m56392k0(j760 j760Var) {
        return vwb.m200296J((Collection) j760Var.f116565b) ? igj.m136009M(getContext(), (List) j760Var.f116564a).map(new w9j() { // from class: l.nzo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPrivilegeSVipContent.m56385f0((List) obj);
            }
        }) : mkd0.m154984r(igj.m136009M(getContext(), (List) j760Var.f116564a), igj.m136009M(getContext(), (List) j760Var.f116565b), new x9j() { // from class: l.pzo
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeSVipContent.m56379Z((List) obj, (List) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m56393l0(j760 j760Var) {
        F f = j760Var.f116564a;
        m56402u0((List) ((j760) f).f116564a, (List) ((j760) f).f116565b);
        r1p r1pVar = this.f37117h;
        r1pVar.f157315k = false;
        r1pVar.f157316l = true;
        if (NullChecker.m81303a(j760Var.f116565b) && y8p.m213413d().m213423m() && y8p.m213413d().m213421h("svip")) {
            this.f37117h.f157315k = true;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ C22306c m56394m0(List list) {
        return igj.m136009M(getContext(), list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m56395n0(j760 j760Var) {
        F f = j760Var.f116564a;
        List<Merchandise> list = (List) ((j760) f).f116564a;
        List<Merchandise> list2 = (List) ((j760) f).f116565b;
        if (!vwb.m200296J((Collection) j760Var.f116565b)) {
            Merchandise merchandise = (Merchandise) ((List) j760Var.f116565b).get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).quantity == merchandise.quantity) {
                    list.set(i, merchandise);
                    break;
                }
            }
        }
        m56402u0(list, list2);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m56396o0(Boolean bool) {
        m56403v0();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m56397p0(PaymentResultWrapper paymentResultWrapper) {
        this.f37120k.m132487l(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m56398q0(IntlVipNewUiFrag intlVipNewUiFrag, j760 j760Var, txo txoVar) {
        if (txoVar instanceof IntlPrivilegePolicyItem.C8955a) {
            int iIndexOf = this.f37118i.indexOf(txoVar);
            this.f37118i.remove(txoVar);
            this.f37118i.add(iIndexOf, fxo.m123642b(intlVipNewUiFrag, getPurchaseType(), (C8765d) j760Var.f116565b));
            this.f37114e.notifyItemChanged(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m56399r0(final IntlVipNewUiFrag intlVipNewUiFrag, final j760 j760Var) {
        if (intlVipNewUiFrag.isAdded() && !u59.m191817Z()) {
            vwb.m200354z(this.f37118i, new e30() { // from class: l.yzo
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200901a.m56398q0(intlVipNewUiFrag, j760Var, (txo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m56400s0(final IntlVipNewUiFrag intlVipNewUiFrag, final j760 j760Var) {
        if (NullChecker.m81303a(j760Var) && j760Var.f116564a == getPurchaseType()) {
            post(new Runnable() { // from class: l.wzo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f188751a.m56399r0(intlVipNewUiFrag, j760Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m56401t0() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m56402u0(List<Merchandise> list, List<Merchandise> list2) {
        if (NullChecker.m81303a(this.f37117h)) {
            this.f37117h.m177543k(list, list2);
            this.f37117h.m177542j();
            r1p r1pVar = this.f37117h;
            r1pVar.f157311g = false;
            r1pVar.f157312h = m56389h0(list);
            this.f37117h.f157310f.m132487l(Unit.INSTANCE);
            return;
        }
        r1p r1pVar2 = new r1p(this.f37115f, list, list2, getPurchaseType(), this.f37121l);
        this.f37117h = r1pVar2;
        r1pVar2.m177542j();
        r1p r1pVar3 = this.f37117h;
        r1pVar3.f157311g = false;
        r1pVar3.f157312h = m56389h0(list);
        this.f37118i.add(0, this.f37117h);
        this.f37114e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.vzo
            @Override // java.lang.Runnable
            public final void run() {
                this.f183654a.m56401t0();
            }
        });
        this.f37117h.f157310f.m132487l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m56403v0() {
        this.f37118i.clear();
        if (m56406y0()) {
            this.f37118i.add(this.f37117h);
        }
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9())) {
            this.f37118i.add(new C8950a.a(getPurchaseType()));
            this.f37118i.add(fxo.m123643c(getPurchaseType()));
            if (!u59.m191817Z()) {
                this.f37118i.add(fxo.m123642b(this.f37115f, getPurchaseType(), null));
            }
            this.f37114e.m56486G(this.f37118i);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m56404w0() {
        c3m c3mVar = this.f37116g;
        if (c3mVar != null) {
            c3mVar.release();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m56405x0(IntlVipNewUiFrag intlVipNewUiFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        C8950a c8950a = new C8950a(intlVipNewUiFrag, this.f37116g, this);
        this.f37114e = c8950a;
        setAdapter(c8950a);
        m56403v0();
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m56406y0() {
        if (u59.m191817Z()) {
            return false;
        }
        return NullChecker.m81303a(this.f37117h);
    }

    @Override // p149l.hxo
    /* JADX INFO: renamed from: z */
    public void mo56407z(d3n d3nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f37115f = intlVipNewUiFrag;
        id40 id40Var = new id40(intlVipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f37116g = id40Var;
        id40Var.mo105094c(this.f37119j);
        c3m c3mVar = this.f37116g;
        if (c3mVar instanceof id40) {
            ((id40) c3mVar).m155738H(new mp0.InterfaceC18522a() { // from class: l.pyo
                @Override // p149l.mp0.InterfaceC18522a
                /* JADX INFO: renamed from: a */
                public final void mo106044a(boolean z, boolean z2) {
                    IntlPrivilegeSVipContent.m56375V(z, z2);
                }
            });
            ((id40) this.f37116g).m135412c0(t100.m186890d(0.0f));
        }
        m56405x0(intlVipNewUiFrag);
        m56390i0(d3nVar, intlVipNewUiFrag);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m56408z0(final PurchaseType purchaseType, final PurchaseType purchaseType2) {
        if (this.f37114e == null) {
            return;
        }
        for (int i = 0; i < this.f37118i.size(); i++) {
            if (this.f37118i.get(i) instanceof C8950a.a) {
                RecyclerView.AbstractC0566d0 abstractC0566d0FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i);
                if (abstractC0566d0FindViewHolderForAdapterPosition != null) {
                    View view = abstractC0566d0FindViewHolderForAdapterPosition.itemView;
                    if (view instanceof IntlPrivilegeExclusivePrivilegeView) {
                        final IntlPrivilegeExclusivePrivilegeView intlPrivilegeExclusivePrivilegeView = (IntlPrivilegeExclusivePrivilegeView) view;
                        intlPrivilegeExclusivePrivilegeView.m56508h(purchaseType, purchaseType2);
                        intlPrivilegeExclusivePrivilegeView.m56504d(purchaseType, purchaseType2, new Runnable() { // from class: l.kzo
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

    public IntlPrivilegeSVipContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlPrivilegeSVipContent(Context context) {
        this(context, null);
    }
}
