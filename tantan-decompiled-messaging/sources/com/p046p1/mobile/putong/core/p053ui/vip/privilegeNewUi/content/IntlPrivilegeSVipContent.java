package com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.IntlPrivilegeSVipContent;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegePolicyItem;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.a0p;
import p149l.ah60;
import p149l.b90;
import p149l.c3m;
import p149l.c3n;
import p149l.cb9;
import p149l.e30;
import p149l.exo;
import p149l.gxo;
import p149l.h6a;
import p149l.id40;
import p149l.igj;
import p149l.ixo;
import p149l.j760;
import p149l.jo0;
import p149l.lsi0;
import p149l.m0p;
import p149l.mkd0;
import p149l.mp0;
import p149l.q1p;
import p149l.roj0;
import p149l.rxa0;
import p149l.sxo;
import p149l.t100;
import p149l.u59;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.xma;
import p149l.y8p;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeSVipContent extends IntlPrivilegeRecycleView implements gxo {

    /* JADX INFO: renamed from: e */
    public ixo f37874e;

    /* JADX INFO: renamed from: f */
    public VipNewUiFrag f37875f;

    /* JADX INFO: renamed from: g */
    public c3m f37876g;

    /* JADX INFO: renamed from: h */
    public q1p f37877h;

    /* JADX INFO: renamed from: i */
    public ArrayList<sxo> f37878i;

    /* JADX INFO: renamed from: j */
    public final b90 f37879j;

    /* JADX INFO: renamed from: k */
    public C22392a<Unit> f37880k;

    /* JADX INFO: renamed from: l */
    public ProductCategory f37881l;

    public IntlPrivilegeSVipContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37878i = new ArrayList<>();
        this.f37879j = new b90();
        this.f37880k = C22392a.m221513c(Unit.INSTANCE);
        init();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ j760 m57523I(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ List m57528N(List list) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.jzo
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPrivilegeSVipContent.m57537W(arrayList, (Merchandise) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ j760 m57533S(List list) {
        return new j760(list, null);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ j760 m57534T(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m57537W(List list, Merchandise merchandise) {
        StockKeepUnit stockKeepUnit;
        if (merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || stockKeepUnit.affiliateProducts == null || CoreModule.f17545c.f19654j0.m30576C4() == null || !CoreModule.f17545c.f19654j0.m30576C4().skuId.equals(merchandise.defaultStockKeepUnit.affiliateProducts.googleplay)) {
            return;
        }
        list.add(merchandise);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m57539Y(Throwable th) {
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ j760 m57543c0(List list) {
        return new j760(list, null);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m57544d0(boolean z, boolean z2) {
        if (z2) {
            return;
        }
        lsi0.m151578h(R$string.f18941tc);
    }

    /* JADX INFO: renamed from: g0 */
    private Merchandise m57547g0(List<Merchandise> list) {
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

    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: renamed from: t0 */
    private void m57548t0(List<Merchandise> list, List<Merchandise> list2) {
        if (NullChecker.m81303a(this.f37877h)) {
            this.f37877h.m172411k(list, list2);
            this.f37877h.m172410j();
            q1p q1pVar = this.f37877h;
            q1pVar.f152148g = false;
            q1pVar.f152149h = m57547g0(list);
            this.f37877h.f152147f.m132487l(roj0.f160388a);
            return;
        }
        q1p q1pVar2 = new q1p(this.f37875f, list, list2, getPurchaseType(), this.f37881l);
        this.f37877h = q1pVar2;
        q1pVar2.m172410j();
        q1p q1pVar3 = this.f37877h;
        q1pVar3.f152148g = false;
        q1pVar3.f152149h = m57547g0(list);
        this.f37878i.add(0, this.f37877h);
        this.f37874e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.hzo
            @Override // java.lang.Runnable
            public final void run() {
                this.f110217a.m57564s0();
            }
        });
        this.f37877h.f152147f.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: u0 */
    private void m57549u0() {
        this.f37878i.clear();
        if (m57550x0()) {
            this.f37878i.add(this.f37877h);
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            Iterator<Privilege> it = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(userM169527p9.gender).iterator();
            while (it.hasNext()) {
                this.f37878i.add(exo.m118682a(it.next(), getPurchaseType()));
            }
            this.f37878i.add(exo.m118685d(getPurchaseType()));
            this.f37878i.add(exo.m118683b(this.f37875f, getPurchaseType(), null));
            this.f37874e.m138877G(this.f37878i);
        }
    }

    /* JADX INFO: renamed from: x0 */
    private boolean m57550x0() {
        return NullChecker.m81303a(this.f37877h);
    }

    @Override // p149l.gxo
    /* JADX INFO: renamed from: b */
    public void mo57551b(int i) {
        id40.f112518E.m132487l(Integer.valueOf(i));
    }

    @Override // p149l.gxo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
    }

    /* JADX INFO: renamed from: h0 */
    public void m57552h0(c3n c3nVar, final VipNewUiFrag vipNewUiFrag) {
        c3nVar.m115452n(vipNewUiFrag, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"))).map(new w9j() { // from class: l.syo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210047L3());
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.l0p
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125555a.m57557l0((Boolean) obj);
            }
        }));
        c3nVar.m115452n(vipNewUiFrag, ah60.m96370E().filter(new w9j() { // from class: l.n0p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                PaymentResultWrapper paymentResultWrapper = (PaymentResultWrapper) obj;
                return Boolean.valueOf(sab0.m182905w(paymentResultWrapper.purchaseType) || sab0.m182901s(paymentResultWrapper.purchaseType) || sab0.m182899q(paymentResultWrapper.purchaseType) || sab0.m182904v(paymentResultWrapper.purchaseType));
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.qyo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156941a.m57560o0((PaymentResultWrapper) obj);
            }
        }));
        vipNewUiFrag.duringCreated(CoreModule.f17545c.f19569G2.f80121V).subscribe(mkd0.m154956H(new e30() { // from class: l.tyo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172613a.m57563r0(vipNewUiFrag, (j760) obj);
            }
        }, new e30() { // from class: l.vyo
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPrivilegeSVipContent.m57539Y((Throwable) obj);
            }
        }));
        C22306c c22306cObserveOn = ((!h6a.m129470c() || (xma.m210087m4() && xma.m210077h4())) ? C22306c.just(null) : this.f37880k.flatMap(new w9j() { // from class: l.xyo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19569G2.m105991s3();
            }
        })).flatMap(new w9j() { // from class: l.zyo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f205703a.m57554i0((Envelope) obj);
            }
        }).filter(new w9j() { // from class: l.bzo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((Collection) ((j760) obj).f116564a));
            }
        }).flatMap(new w9j() { // from class: l.dzo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88498a.m57555j0((j760) obj);
            }
        }).observeOn(jo0.m142408a());
        if (u59.m191814W()) {
            m57521G(c3nVar, vipNewUiFrag, C22306c.combineLatest(c22306cObserveOn, y8p.m213413d().m213424n().distinctUntilChanged(), new a0p()), new e30() { // from class: l.zzo
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f205812a.m57556k0((j760) obj);
                }
            });
        } else {
            m57521G(c3nVar, vipNewUiFrag, C22306c.combineLatest(c22306cObserveOn, CoreModule.f17545c.f19654j0.m30645z4() ? CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get(ProductCategory.tttSvipGoogleplayFreeTrial)).filter(new w9j() { // from class: l.b0p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).map(new w9j() { // from class: l.d0p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlPrivilegeSVipContent.m57528N((List) obj);
                }
            }).flatMap(new w9j() { // from class: l.f0p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f93995a.m57558m0((List) obj);
                }
            }).onErrorResumeNext(new w9j() { // from class: l.h0p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C22306c.just(null);
                }
            }).observeOn(jo0.m142408a()) : C22306c.just(null), new m0p()), new e30() { // from class: l.j0p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f115698a.m57559n0((j760) obj);
                }
            });
        }
    }

    @Override // p149l.gxo
    /* JADX INFO: renamed from: i */
    public void mo57553i() {
        id40.f112519F.m132487l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ C22306c m57554i0(Envelope envelope) {
        cb9 cb9Var = CoreModule.f17545c.f19569G2;
        if (cb9Var.f80117R == null || !cb9Var.m105984l3(getPurchaseType())) {
            return CoreModule.f17545c.f19654j0.m30644y5(getPurchaseType().productCategory()).map(new w9j() { // from class: l.mzo
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlPrivilegeSVipContent.m57533S((List) obj);
                }
            });
        }
        this.f37881l = CoreModule.f17545c.f19569G2.m105981i3();
        return mkd0.m154984r(CoreModule.f17545c.f19654j0.m30644y5(getPurchaseType().productCategory()), CoreModule.f17545c.f19654j0.m30644y5(this.f37881l), new x9j() { // from class: l.ozo
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeSVipContent.m57534T((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ C22306c m57555j0(j760 j760Var) {
        return vwb.m200296J((Collection) j760Var.f116565b) ? igj.m136009M(getContext(), (List) j760Var.f116564a).map(new w9j() { // from class: l.qzo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPrivilegeSVipContent.m57543c0((List) obj);
            }
        }) : mkd0.m154984r(igj.m136009M(getContext(), (List) j760Var.f116564a), igj.m136009M(getContext(), (List) j760Var.f116565b), new x9j() { // from class: l.szo
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeSVipContent.m57523I((List) obj, (List) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m57556k0(j760 j760Var) {
        F f = j760Var.f116564a;
        m57548t0((List) ((j760) f).f116564a, (List) ((j760) f).f116565b);
        q1p q1pVar = this.f37877h;
        q1pVar.f152152k = false;
        q1pVar.f152153l = true;
        if (NullChecker.m81303a(j760Var.f116565b) && y8p.m213413d().m213423m() && y8p.m213413d().m213421h("svip")) {
            this.f37877h.f152152k = true;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m57557l0(Boolean bool) {
        m57549u0();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ C22306c m57558m0(List list) {
        return igj.m136009M(getContext(), list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m57559n0(j760 j760Var) {
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
        m57548t0(list, list2);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m57560o0(PaymentResultWrapper paymentResultWrapper) {
        this.f37880k.m132487l(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m57561p0(VipNewUiFrag vipNewUiFrag, j760 j760Var, sxo sxoVar) {
        if (sxoVar instanceof IntlPrivilegePolicyItem.C9023a) {
            int iIndexOf = this.f37878i.indexOf(sxoVar);
            this.f37878i.remove(sxoVar);
            this.f37878i.add(iIndexOf, exo.m118683b(vipNewUiFrag, getPurchaseType(), (C8765d) j760Var.f116565b));
            this.f37874e.notifyItemChanged(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m57562q0(final VipNewUiFrag vipNewUiFrag, final j760 j760Var) {
        if (vipNewUiFrag.isAdded()) {
            vwb.m200354z(this.f37878i, new e30() { // from class: l.uzo
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f179008a.m57561p0(vipNewUiFrag, j760Var, (sxo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m57563r0(final VipNewUiFrag vipNewUiFrag, final j760 j760Var) {
        if (NullChecker.m81303a(j760Var) && j760Var.f116564a == getPurchaseType()) {
            post(new Runnable() { // from class: l.fzo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f99983a.m57562q0(vipNewUiFrag, j760Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m57564s0() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m57565v0() {
        c3m c3mVar = this.f37876g;
        if (c3mVar != null) {
            c3mVar.release();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m57566w0(PutongFrag putongFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        ixo ixoVar = new ixo(putongFrag, this.f37876g, this);
        this.f37874e = ixoVar;
        setAdapter(ixoVar);
        m57549u0();
    }

    @Override // p149l.gxo
    /* JADX INFO: renamed from: y */
    public void mo57567y(c3n c3nVar, VipNewUiFrag vipNewUiFrag) {
        this.f37875f = vipNewUiFrag;
        id40 id40Var = new id40(vipNewUiFrag.act(), getPurchaseType());
        this.f37876g = id40Var;
        id40Var.mo105094c(this.f37879j);
        c3m c3mVar = this.f37876g;
        if (c3mVar instanceof id40) {
            ((id40) c3mVar).m155738H(new mp0.InterfaceC18522a() { // from class: l.oyo
                @Override // p149l.mp0.InterfaceC18522a
                /* JADX INFO: renamed from: a */
                public final void mo106044a(boolean z, boolean z2) {
                    IntlPrivilegeSVipContent.m57544d0(z, z2);
                }
            });
            ((id40) this.f37876g).m135412c0(t100.m186890d(0.0f));
        }
        m57566w0(vipNewUiFrag);
        m57552h0(c3nVar, vipNewUiFrag);
    }

    public IntlPrivilegeSVipContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlPrivilegeSVipContent(Context context) {
        this(context, null);
    }
}
