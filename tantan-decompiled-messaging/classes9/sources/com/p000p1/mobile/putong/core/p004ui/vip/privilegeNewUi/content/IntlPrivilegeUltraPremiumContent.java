package com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.IntlPrivilegeUltraPremiumContent;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegePolicyItem;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import l.roj0;
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
import p006l.mp0;
import p006l.q1p;
import p006l.sxo;
import p006l.u59;
import p006l.x2c0;
import p006l.xma;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeUltraPremiumContent extends IntlPrivilegeRecycleView implements gxo {

    /* JADX INFO: renamed from: e */
    public ixo f7669e;

    /* JADX INFO: renamed from: f */
    public VipNewUiFrag f7670f;

    /* JADX INFO: renamed from: g */
    public c3m f7671g;

    /* JADX INFO: renamed from: h */
    public q1p f7672h;

    /* JADX INFO: renamed from: i */
    public ArrayList<sxo> f7673i;

    /* JADX INFO: renamed from: j */
    public a<Unit> f7674j;

    /* JADX INFO: renamed from: k */
    public final b90 f7675k;

    /* JADX INFO: renamed from: l */
    public ProductCategory f7676l;

    public IntlPrivilegeUltraPremiumContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7673i = new ArrayList<>();
        this.f7674j = a.c(Unit.INSTANCE);
        this.f7675k = new b90();
        init();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m11085L(boolean z, boolean z2) {
        if (z2) {
            return;
        }
        lsi0.h(R$string.f2930tc);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ j760 m11088O(List list) {
        return new j760(list, (Object) null);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ j760 m11089P(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m11090Q(Throwable th) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ j760 m11091R(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ j760 m11097X(List list) {
        return new j760(list, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ c m11101c0(Envelope envelope) {
        cb9 cb9Var = CoreModule.f1534c.f3558G2;
        if (cb9Var.f9573R == null || !cb9Var.m13329l3(getPurchaseType())) {
            return CoreModule.f1534c.f3643j0.m2572y5(getPurchaseType().productCategory()).map(new w9j() { // from class: l.l2p
                public final Object call(Object obj) {
                    return IntlPrivilegeUltraPremiumContent.m11097X((List) obj);
                }
            });
        }
        this.f7676l = CoreModule.f1534c.f3558G2.m13326i3();
        return mkd0.r(CoreModule.f1534c.f3643j0.m2572y5(getPurchaseType().productCategory()), CoreModule.f1534c.f3643j0.m2572y5(this.f7676l), new x9j() { // from class: l.n2p
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeUltraPremiumContent.m11091R((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ c m11102d0(j760 j760Var) {
        return vwb.J((Collection) j760Var.b) ? igj.M(getContext(), (List) j760Var.a).map(new w9j() { // from class: l.p2p
            public final Object call(Object obj) {
                return IntlPrivilegeUltraPremiumContent.m11088O((List) obj);
            }
        }) : mkd0.r(igj.M(getContext(), (List) j760Var.a), igj.M(getContext(), (List) j760Var.b), new x9j() { // from class: l.r2p
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeUltraPremiumContent.m11089P((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m11103e0(j760 j760Var) {
        Object obj = j760Var.a;
        m11106m0((List) ((j760) obj).a, (List) ((j760) obj).b);
        q1p q1pVar = this.f7672h;
        q1pVar.f19525k = false;
        q1pVar.f19526l = true;
        if (NullChecker.a(j760Var.b) && y8p.d().m() && y8p.d().h("tttUltraPremium")) {
            this.f7672h.f19525k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m11104f0(j760 j760Var) {
        m11106m0((List) j760Var.a, (List) j760Var.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m11105g0(Boolean bool) {
        m11107n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    private void m11106m0(List<Merchandise> list, List<Merchandise> list2) {
        PurchaseType purchaseType = PurchaseType.TYPE_ULTRA_PREMIUM;
        if (cjy.z(purchaseType.productCategory()).a(this.f7670f.act(), purchaseType, purchaseType.productCategory(), list).size() == 2) {
            ((id40) this.f7671g).m16609d0(t100.d(47.0f));
            ((id40) this.f7671g).m16611f0(t100.d(47.0f));
        }
        if (NullChecker.a(this.f7672h)) {
            this.f7672h.m21929k(list, list2);
            this.f7672h.m21928j();
            q1p q1pVar = this.f7672h;
            q1pVar.f19521g = false;
            q1pVar.f19522h = null;
            q1pVar.f19520f.onNext(roj0.a);
            return;
        }
        q1p q1pVar2 = new q1p(this.f7670f, list, list2, getPurchaseType(), this.f7676l);
        this.f7672h = q1pVar2;
        q1pVar2.m21928j();
        q1p q1pVar3 = this.f7672h;
        q1pVar3.f19521g = false;
        q1pVar3.f19522h = null;
        this.f7673i.add(0, q1pVar3);
        this.f7669e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.h2p
            @Override // java.lang.Runnable
            public final void run() {
                this.f13655a.m11114l0();
            }
        });
        this.f7672h.f19520f.onNext(roj0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    private void m11107n0() {
        this.f7673i.clear();
        if (m11108p0()) {
            this.f7673i.add(this.f7672h);
        }
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (NullChecker.a(userM21490p9)) {
            Iterator it = PurchaseType.TYPE_ULTRA_PREMIUM.getPrivilegeData(userM21490p9.gender).iterator();
            while (it.hasNext()) {
                this.f7673i.add(exo.m14919a((Privilege) it.next(), getPurchaseType()));
            }
            this.f7673i.add(new IntlPrivilegeDescListItem.C0456a(x2c0.f26830kb, String.format(getContext().getString(R$string.f2874rg), Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP((Gender) null).size())), "", null, PurchaseType.TYPE_ULTRA_PREMIUM));
            this.f7673i.add(exo.m14922d(getPurchaseType()));
            this.f7673i.add(exo.m14920b(this.f7670f, getPurchaseType(), null));
            this.f7669e.m17147G(this.f7673i);
        }
    }

    /* JADX INFO: renamed from: p0 */
    private boolean m11108p0() {
        return NullChecker.a(this.f7672h);
    }

    @Override // p006l.gxo
    /* JADX INFO: renamed from: b */
    public void mo11043b(int i) {
        id40.f14364E.onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b0 */
    public void m11109b0(c3n c3nVar, final VipNewUiFrag vipNewUiFrag) {
        c3nVar.n(vipNewUiFrag, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("ultraPremium"))).map(new w9j() { // from class: l.c2p
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m27355L3());
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.b3p
            public final void call(Object obj) {
                this.f8707a.m11105g0((Boolean) obj);
            }
        }));
        vipNewUiFrag.duringCreated(CoreModule.f1534c.f3558G2.f9577V).subscribe(mkd0.H(new e30() { // from class: l.d3p
            public final void call(Object obj) {
                this.f10004a.m11112j0(vipNewUiFrag, (j760) obj);
            }
        }, new e30() { // from class: l.f3p
            public final void call(Object obj) {
                IntlPrivilegeUltraPremiumContent.m11090Q((Throwable) obj);
            }
        }));
        c3nVar.n(vipNewUiFrag, ah60.E().filter(new w9j() { // from class: l.h3p
            public final Object call(Object obj) {
                PaymentResultWrapper paymentResultWrapper = (PaymentResultWrapper) obj;
                return Boolean.valueOf(sab0.w(paymentResultWrapper.purchaseType) || sab0.s(paymentResultWrapper.purchaseType) || sab0.q(paymentResultWrapper.purchaseType) || sab0.v(paymentResultWrapper.purchaseType));
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.j3p
            public final void call(Object obj) {
                this.f14988a.m11113k0((PaymentResultWrapper) obj);
            }
        }));
        c cVarObserveOn = ((!h6a.m16049c() || xma.m27379e4()) ? c.just((Object) null) : this.f7674j.flatMap(new w9j() { // from class: l.l3p
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3558G2.m13336s3();
            }
        })).flatMap(new w9j() { // from class: l.a2p
            public final Object call(Object obj) {
                return this.f8073a.m11101c0((Envelope) obj);
            }
        }).filter(new w9j() { // from class: l.d2p
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((Collection) ((j760) obj).a));
            }
        }).flatMap(new w9j() { // from class: l.f2p
            public final Object call(Object obj) {
                return this.f11574a.m11102d0((j760) obj);
            }
        }).observeOn(jo0.a());
        if (u59.m24985W()) {
            m11013G(c3nVar, vipNewUiFrag, c.combineLatest(cVarObserveOn, y8p.d().n().distinctUntilChanged(), new a0p()), new e30() { // from class: l.x2p
                public final void call(Object obj) {
                    this.f27331a.m11103e0((j760) obj);
                }
            });
        } else {
            m11013G(c3nVar, vipNewUiFrag, cVarObserveOn, new e30() { // from class: l.z2p
                public final void call(Object obj) {
                    this.f28600a.m11104f0((j760) obj);
                }
            });
        }
    }

    @Override // p006l.gxo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_ULTRA_PREMIUM;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m11110h0(VipNewUiFrag vipNewUiFrag, j760 j760Var, sxo sxoVar) {
        if (sxoVar instanceof IntlPrivilegePolicyItem.C0459a) {
            int iIndexOf = this.f7673i.indexOf(sxoVar);
            this.f7673i.remove(sxoVar);
            this.f7673i.add(iIndexOf, exo.m14920b(vipNewUiFrag, getPurchaseType(), (d) j760Var.b));
            this.f7669e.notifyItemChanged(iIndexOf);
        }
    }

    @Override // p006l.gxo
    /* JADX INFO: renamed from: i */
    public void mo11045i() {
        id40.f14365F.onNext(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m11111i0(final VipNewUiFrag vipNewUiFrag, final j760 j760Var) {
        if (vipNewUiFrag.isAdded()) {
            vwb.z(this.f7673i, new e30() { // from class: l.t2p
                public final void call(Object obj) {
                    this.f21851a.m11110h0(vipNewUiFrag, j760Var, (sxo) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m11112j0(final VipNewUiFrag vipNewUiFrag, final j760 j760Var) {
        if (NullChecker.a(j760Var) && j760Var.a == getPurchaseType()) {
            post(new Runnable() { // from class: l.j2p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14975a.m11111i0(vipNewUiFrag, j760Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m11113k0(PaymentResultWrapper paymentResultWrapper) {
        this.f7674j.onNext(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m11114l0() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public void m11115o0(PutongFrag putongFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        ixo ixoVar = new ixo(putongFrag, this.f7671g, this);
        this.f7669e = ixoVar;
        setAdapter(ixoVar);
        m11107n0();
    }

    @Override // p006l.gxo
    /* JADX INFO: renamed from: y */
    public void mo11059y(c3n c3nVar, VipNewUiFrag vipNewUiFrag) {
        this.f7670f = vipNewUiFrag;
        id40 id40Var = new id40(vipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f7671g = id40Var;
        id40Var.mo13100c(this.f7675k);
        c3m c3mVar = this.f7671g;
        if (c3mVar instanceof id40) {
            ((id40) c3mVar).m19485H(new mp0.InterfaceC1028a() { // from class: l.y1p
                @Override // p006l.mp0.InterfaceC1028a
                /* JADX INFO: renamed from: a */
                public final void mo19497a(boolean z, boolean z2) {
                    IntlPrivilegeUltraPremiumContent.m11085L(z, z2);
                }
            });
        }
        m11115o0(vipNewUiFrag);
        m11109b0(c3nVar, vipNewUiFrag);
    }

    public IntlPrivilegeUltraPremiumContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlPrivilegeUltraPremiumContent(Context context) {
        this(context, null);
    }
}
