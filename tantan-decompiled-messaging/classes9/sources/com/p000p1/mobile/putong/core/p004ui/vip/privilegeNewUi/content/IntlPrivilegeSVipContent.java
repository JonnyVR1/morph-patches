package com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.IntlPrivilegeSVipContent;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegePolicyItem;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import l.ah60;
import l.e30;
import l.igj;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.roj0;
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
import p006l.c3n;
import p006l.cb9;
import p006l.exo;
import p006l.gxo;
import p006l.h6a;
import p006l.id40;
import p006l.ixo;
import p006l.m0p;
import p006l.mp0;
import p006l.q1p;
import p006l.sxo;
import p006l.u59;
import p006l.xma;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeSVipContent extends IntlPrivilegeRecycleView implements gxo {

    /* JADX INFO: renamed from: e */
    public ixo f7655e;

    /* JADX INFO: renamed from: f */
    public VipNewUiFrag f7656f;

    /* JADX INFO: renamed from: g */
    public c3m f7657g;

    /* JADX INFO: renamed from: h */
    public q1p f7658h;

    /* JADX INFO: renamed from: i */
    public ArrayList<sxo> f7659i;

    /* JADX INFO: renamed from: j */
    public final b90 f7660j;

    /* JADX INFO: renamed from: k */
    public a<Unit> f7661k;

    /* JADX INFO: renamed from: l */
    public ProductCategory f7662l;

    public IntlPrivilegeSVipContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7659i = new ArrayList<>();
        this.f7660j = new b90();
        this.f7661k = a.c(Unit.INSTANCE);
        init();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ j760 m11015I(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ List m11020N(List list) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.jzo
            public final void call(Object obj) {
                IntlPrivilegeSVipContent.m11029W(arrayList, (Merchandise) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ j760 m11025S(List list) {
        return new j760(list, (Object) null);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ j760 m11026T(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m11029W(List list, Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        if (merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || stockKeepUnit.affiliateProducts == null || CoreModule.f1534c.f3643j0.m2504C4() == null || !CoreModule.f1534c.f3643j0.m2504C4().skuId.equals(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay)) {
            return;
        }
        list.add(merchandise);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m11031Y(Throwable th) {
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ j760 m11035c0(List list) {
        return new j760(list, (Object) null);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m11036d0(boolean z, boolean z2) {
        if (z2) {
            return;
        }
        lsi0.h(R$string.f2930tc);
    }

    /* JADX INFO: renamed from: g0 */
    private Merchandise m11039g0(List<Merchandise> list) {
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

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    private void m11040t0(List<Merchandise> list, List<Merchandise> list2) {
        if (NullChecker.a(this.f7658h)) {
            this.f7658h.m21929k(list, list2);
            this.f7658h.m21928j();
            q1p q1pVar = this.f7658h;
            q1pVar.f19521g = false;
            q1pVar.f19522h = m11039g0(list);
            this.f7658h.f19520f.onNext(roj0.a);
            return;
        }
        q1p q1pVar2 = new q1p(this.f7656f, list, list2, getPurchaseType(), this.f7662l);
        this.f7658h = q1pVar2;
        q1pVar2.m21928j();
        q1p q1pVar3 = this.f7658h;
        q1pVar3.f19521g = false;
        q1pVar3.f19522h = m11039g0(list);
        this.f7659i.add(0, this.f7658h);
        this.f7655e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.hzo
            @Override // java.lang.Runnable
            public final void run() {
                this.f14152a.m11056s0();
            }
        });
        this.f7658h.f19520f.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: u0 */
    private void m11041u0() {
        this.f7659i.clear();
        if (m11042x0()) {
            this.f7659i.add(this.f7658h);
        }
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (NullChecker.a(userM21490p9)) {
            Iterator it = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(userM21490p9.gender).iterator();
            while (it.hasNext()) {
                this.f7659i.add(exo.m14919a((Privilege) it.next(), getPurchaseType()));
            }
            this.f7659i.add(exo.m14922d(getPurchaseType()));
            this.f7659i.add(exo.m14920b(this.f7656f, getPurchaseType(), null));
            this.f7655e.m17147G(this.f7659i);
        }
    }

    /* JADX INFO: renamed from: x0 */
    private boolean m11042x0() {
        return NullChecker.a(this.f7658h);
    }

    @Override // p006l.gxo
    /* JADX INFO: renamed from: b */
    public void mo11043b(int i) {
        id40.f14364E.onNext(Integer.valueOf(i));
    }

    @Override // p006l.gxo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
    }

    /* JADX INFO: renamed from: h0 */
    public void m11044h0(c3n c3nVar, final VipNewUiFrag vipNewUiFrag) {
        c3nVar.n(vipNewUiFrag, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("svip"))).map(new w9j() { // from class: l.syo
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m27355L3());
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.l0p
            public final void call(Object obj) {
                this.f16171a.m11049l0((Boolean) obj);
            }
        }));
        c3nVar.n(vipNewUiFrag, ah60.E().filter(new w9j() { // from class: l.n0p
            public final Object call(Object obj) {
                PaymentResultWrapper paymentResultWrapper = (PaymentResultWrapper) obj;
                return Boolean.valueOf(sab0.w(paymentResultWrapper.purchaseType) || sab0.s(paymentResultWrapper.purchaseType) || sab0.q(paymentResultWrapper.purchaseType) || sab0.v(paymentResultWrapper.purchaseType));
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.qyo
            public final void call(Object obj) {
                this.f20164a.m11052o0((PaymentResultWrapper) obj);
            }
        }));
        vipNewUiFrag.duringCreated(CoreModule.f1534c.f3558G2.f9577V).subscribe(mkd0.H(new e30() { // from class: l.tyo
            public final void call(Object obj) {
                this.f22350a.m11055r0(vipNewUiFrag, (j760) obj);
            }
        }, new e30() { // from class: l.vyo
            public final void call(Object obj) {
                IntlPrivilegeSVipContent.m11031Y((Throwable) obj);
            }
        }));
        c cVarObserveOn = ((!h6a.m16049c() || (xma.m27395m4() && xma.m27385h4())) ? c.just((Object) null) : this.f7661k.flatMap(new w9j() { // from class: l.xyo
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3558G2.m13336s3();
            }
        })).flatMap(new w9j() { // from class: l.zyo
            public final Object call(Object obj) {
                return this.f29043a.m11046i0((Envelope) obj);
            }
        }).filter(new w9j() { // from class: l.bzo
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((Collection) ((j760) obj).a));
            }
        }).flatMap(new w9j() { // from class: l.dzo
            public final Object call(Object obj) {
                return this.f10672a.m11047j0((j760) obj);
            }
        }).observeOn(jo0.a());
        if (u59.m24985W()) {
            m11013G(c3nVar, vipNewUiFrag, c.combineLatest(cVarObserveOn, y8p.d().n().distinctUntilChanged(), new a0p()), new e30() { // from class: l.zzo
                public final void call(Object obj) {
                    this.f29054a.m11048k0((j760) obj);
                }
            });
        } else {
            m11013G(c3nVar, vipNewUiFrag, c.combineLatest(cVarObserveOn, CoreModule.f1534c.f3643j0.m2573z4() ? CoreModule.f1534c.f3643j0.m2572y5(ProductCategory.get("tttSvipGoogleplayFreeTrial")).filter(new w9j() { // from class: l.b0p
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).map(new w9j() { // from class: l.d0p
                public final Object call(Object obj) {
                    return IntlPrivilegeSVipContent.m11020N((List) obj);
                }
            }).flatMap(new w9j() { // from class: l.f0p
                public final Object call(Object obj) {
                    return this.f11554a.m11050m0((List) obj);
                }
            }).onErrorResumeNext(new w9j() { // from class: l.h0p
                public final Object call(Object obj) {
                    return c.just((Object) null);
                }
            }).observeOn(jo0.a()) : c.just((Object) null), new m0p()), new e30() { // from class: l.j0p
                public final void call(Object obj) {
                    this.f14918a.m11051n0((j760) obj);
                }
            });
        }
    }

    @Override // p006l.gxo
    /* JADX INFO: renamed from: i */
    public void mo11045i() {
        id40.f14365F.onNext(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ c m11046i0(Envelope envelope) {
        cb9 cb9Var = CoreModule.f1534c.f3558G2;
        if (cb9Var.f9573R == null || !cb9Var.m13329l3(getPurchaseType())) {
            return CoreModule.f1534c.f3643j0.m2572y5(getPurchaseType().productCategory()).map(new w9j() { // from class: l.mzo
                public final Object call(Object obj) {
                    return IntlPrivilegeSVipContent.m11025S((List) obj);
                }
            });
        }
        this.f7662l = CoreModule.f1534c.f3558G2.m13326i3();
        return mkd0.r(CoreModule.f1534c.f3643j0.m2572y5(getPurchaseType().productCategory()), CoreModule.f1534c.f3643j0.m2572y5(this.f7662l), new x9j() { // from class: l.ozo
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeSVipContent.m11026T((List) obj, (List) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ c m11047j0(j760 j760Var) {
        return vwb.J((Collection) j760Var.b) ? igj.M(getContext(), (List) j760Var.a).map(new w9j() { // from class: l.qzo
            public final Object call(Object obj) {
                return IntlPrivilegeSVipContent.m11035c0((List) obj);
            }
        }) : mkd0.r(igj.M(getContext(), (List) j760Var.a), igj.M(getContext(), (List) j760Var.b), new x9j() { // from class: l.szo
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeSVipContent.m11015I((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m11048k0(j760 j760Var) {
        Object obj = j760Var.a;
        m11040t0((List) ((j760) obj).a, (List) ((j760) obj).b);
        q1p q1pVar = this.f7658h;
        q1pVar.f19525k = false;
        q1pVar.f19526l = true;
        if (NullChecker.a(j760Var.b) && y8p.d().m() && y8p.d().h("svip")) {
            this.f7658h.f19525k = true;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m11049l0(Boolean bool) {
        m11041u0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ c m11050m0(List list) {
        return igj.M(getContext(), list);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m11051n0(j760 j760Var) {
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
        m11040t0(list, list2);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m11052o0(PaymentResultWrapper paymentResultWrapper) {
        this.f7661k.onNext(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m11053p0(VipNewUiFrag vipNewUiFrag, j760 j760Var, sxo sxoVar) {
        if (sxoVar instanceof IntlPrivilegePolicyItem.C0459a) {
            int iIndexOf = this.f7659i.indexOf(sxoVar);
            this.f7659i.remove(sxoVar);
            this.f7659i.add(iIndexOf, exo.m14920b(vipNewUiFrag, getPurchaseType(), (d) j760Var.b));
            this.f7655e.notifyItemChanged(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m11054q0(final VipNewUiFrag vipNewUiFrag, final j760 j760Var) {
        if (vipNewUiFrag.isAdded()) {
            vwb.z(this.f7659i, new e30() { // from class: l.uzo
                public final void call(Object obj) {
                    this.f23830a.m11053p0(vipNewUiFrag, j760Var, (sxo) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m11055r0(final VipNewUiFrag vipNewUiFrag, final j760 j760Var) {
        if (NullChecker.a(j760Var) && j760Var.a == getPurchaseType()) {
            post(new Runnable() { // from class: l.fzo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13007a.m11054q0(vipNewUiFrag, j760Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m11056s0() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m11057v0() {
        c3m c3mVar = this.f7657g;
        if (c3mVar != null) {
            c3mVar.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    public void m11058w0(PutongFrag putongFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        ixo ixoVar = new ixo(putongFrag, this.f7657g, this);
        this.f7655e = ixoVar;
        setAdapter(ixoVar);
        m11041u0();
    }

    @Override // p006l.gxo
    /* JADX INFO: renamed from: y */
    public void mo11059y(c3n c3nVar, VipNewUiFrag vipNewUiFrag) {
        this.f7656f = vipNewUiFrag;
        id40 id40Var = new id40(vipNewUiFrag.act(), getPurchaseType());
        this.f7657g = id40Var;
        id40Var.mo13100c(this.f7660j);
        c3m c3mVar = this.f7657g;
        if (c3mVar instanceof id40) {
            ((id40) c3mVar).m19485H(new mp0.InterfaceC1028a() { // from class: l.oyo
                @Override // p006l.mp0.InterfaceC1028a
                /* JADX INFO: renamed from: a */
                public final void mo19497a(boolean z, boolean z2) {
                    IntlPrivilegeSVipContent.m11036d0(z, z2);
                }
            });
            ((id40) this.f7657g).m16607c0(t100.d(0.0f));
        }
        m11058w0(vipNewUiFrag);
        m11044h0(c3nVar, vipNewUiFrag);
    }

    public IntlPrivilegeSVipContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlPrivilegeSVipContent(Context context) {
        this(context, null);
    }
}
