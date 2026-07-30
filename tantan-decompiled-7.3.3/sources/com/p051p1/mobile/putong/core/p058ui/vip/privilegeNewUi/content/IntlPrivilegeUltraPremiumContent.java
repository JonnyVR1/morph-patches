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
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.IntlPrivilegeUltraPremiumContent;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
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
import p153l.dbc0;
import p153l.ezo;
import p153l.fo0;
import p153l.fp60;
import p153l.gzo;
import p153l.ip0;
import p153l.izo;
import p153l.joa;
import p153l.jyb;
import p153l.lc9;
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
import p153l.wl40;
import p153l.x80;
import p153l.y20;
import p153l.yap;
import p153l.zry;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeUltraPremiumContent extends IntlPrivilegeRecycleView implements gzo {

    /* JADX INFO: renamed from: e */
    public izo f38736e;

    /* JADX INFO: renamed from: f */
    public VipNewUiFrag f38737f;

    /* JADX INFO: renamed from: g */
    public t5m f38738g;

    /* JADX INFO: renamed from: h */
    public q3p f38739h;

    /* JADX INFO: renamed from: i */
    public ArrayList<szo> f38740i;

    /* JADX INFO: renamed from: j */
    public C22507a<Unit> f38741j;

    /* JADX INFO: renamed from: k */
    public final x80 f38742k;

    /* JADX INFO: renamed from: l */
    public ProductCategory f38743l;

    public IntlPrivilegeUltraPremiumContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38740i = new ArrayList<>();
        this.f38741j = C22507a.m222759c(Unit.INSTANCE);
        this.f38742k = new x80();
        init();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m58776L(boolean z, boolean z2) {
        if (z2) {
            return;
        }
        o1j0.m165634h(R$string.f18546Ic);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ pf60 m58779O(List list) {
        return new pf60(list, null);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ pf60 m58780P(List list, List list2) {
        return new pf60(list, list2);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m58781Q(Throwable th) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ pf60 m58782R(List list, List list2) {
        return new pf60(list, list2);
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ pf60 m58788X(List list) {
        return new pf60(list, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ C22421c m58792c0(Envelope envelope) {
        lc9 lc9Var = CoreModule.f18264c.f20311G2;
        if (lc9Var.f131283R == null || !lc9Var.m153654l3(getPurchaseType())) {
            return CoreModule.f18264c.f20396j0.m31647y5(getPurchaseType().productCategory()).map(new qcj() { // from class: l.l4p
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IntlPrivilegeUltraPremiumContent.m58788X((List) obj);
                }
            });
        }
        this.f38743l = CoreModule.f18264c.f20311G2.m153651i3();
        return psd0.m173625r(CoreModule.f18264c.f20396j0.m31647y5(getPurchaseType().productCategory()), CoreModule.f18264c.f20396j0.m31647y5(this.f38743l), new rcj() { // from class: l.n4p
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeUltraPremiumContent.m58782R((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ C22421c m58793d0(pf60 pf60Var) {
        return jyb.m147479J((Collection) pf60Var.f152157b) ? cjj.m110205M(getContext(), (List) pf60Var.f152156a).map(new qcj() { // from class: l.p4p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlPrivilegeUltraPremiumContent.m58779O((List) obj);
            }
        }) : psd0.m173625r(cjj.m110205M(getContext(), (List) pf60Var.f152156a), cjj.m110205M(getContext(), (List) pf60Var.f152157b), new rcj() { // from class: l.r4p
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeUltraPremiumContent.m58780P((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m58794e0(pf60 pf60Var) {
        F f = pf60Var.f152156a;
        m58797m0((List) ((pf60) f).f152156a, (List) ((pf60) f).f152157b);
        q3p q3pVar = this.f38739h;
        q3pVar.f155472k = false;
        q3pVar.f155473l = true;
        if (NullChecker.m82486a(pf60Var.f152157b) && yap.m214902d().m214912m() && yap.m214902d().m214910h(ProductCategory.tttUltraPremium)) {
            this.f38739h.f155472k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m58795f0(pf60 pf60Var) {
        m58797m0((List) pf60Var.f152156a, (List) pf60Var.f152157b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m58796g0(Boolean bool) {
        m58798n0();
    }

    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: renamed from: m0 */
    private void m58797m0(List<Merchandise> list, List<Merchandise> list2) {
        PurchaseType purchaseType = PurchaseType.TYPE_ULTRA_PREMIUM;
        if (zry.m221275z(purchaseType.productCategory()).mo147671a(this.f38737f.act(), purchaseType, purchaseType.productCategory(), list).size() == 2) {
            ((wl40) this.f38738g).m206928d0(qa00.m175859d(47.0f));
            ((wl40) this.f38738g).m206930f0(qa00.m175859d(47.0f));
        }
        if (NullChecker.m82486a(this.f38739h)) {
            this.f38739h.m175159k(list, list2);
            this.f38739h.m175158j();
            q3p q3pVar = this.f38739h;
            q3pVar.f155468g = false;
            q3pVar.f155469h = null;
            q3pVar.f155467f.m137019l(uxj0.f181467a);
            return;
        }
        q3p q3pVar2 = new q3p(this.f38737f, list, list2, getPurchaseType(), this.f38743l);
        this.f38739h = q3pVar2;
        q3pVar2.m175158j();
        q3p q3pVar3 = this.f38739h;
        q3pVar3.f155468g = false;
        q3pVar3.f155469h = null;
        this.f38740i.add(0, q3pVar3);
        this.f38736e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.h4p
            @Override // java.lang.Runnable
            public final void run() {
                this.f107821a.m58805l0();
            }
        });
        this.f38739h.f155467f.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: n0 */
    private void m58798n0() {
        this.f38740i.clear();
        if (m58799p0()) {
            this.f38740i.add(this.f38739h);
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            Iterator<Privilege> it = PurchaseType.TYPE_ULTRA_PREMIUM.getPrivilegeData(userM116600p9.gender).iterator();
            while (it.hasNext()) {
                this.f38740i.add(ezo.m123389a(it.next(), getPurchaseType()));
            }
            this.f38740i.add(new IntlPrivilegeDescListItem.C9183a(dbc0.f87180lb, String.format(getContext().getString(R$string.f18612Kg), Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null).size())), "", null, PurchaseType.TYPE_ULTRA_PREMIUM));
            this.f38740i.add(ezo.m123392d(getPurchaseType()));
            this.f38740i.add(ezo.m123390b(this.f38737f, getPurchaseType(), null));
            this.f38736e.m142815G(this.f38740i);
        }
    }

    /* JADX INFO: renamed from: p0 */
    private boolean m58799p0() {
        return NullChecker.m82486a(this.f38739h);
    }

    @Override // p153l.gzo
    /* JADX INFO: renamed from: b */
    public void mo58734b(int i) {
        wl40.f189637E.m137019l(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b0 */
    public void m58800b0(c5n c5nVar, final VipNewUiFrag vipNewUiFrag) {
        c5nVar.m153557n(vipNewUiFrag, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium))).map(new qcj() { // from class: l.c4p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146361M3());
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.b5p
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75079a.m58796g0((Boolean) obj);
            }
        }));
        vipNewUiFrag.duringCreated(CoreModule.f18264c.f20311G2.f131287V).subscribe(psd0.m173597H(new y20() { // from class: l.d5p
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85179a.m58803j0(vipNewUiFrag, (pf60) obj);
            }
        }, new y20() { // from class: l.f5p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPrivilegeUltraPremiumContent.m58781Q((Throwable) obj);
            }
        }));
        c5nVar.m153557n(vipNewUiFrag, fp60.m126543E().filter(new qcj() { // from class: l.h5p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                PaymentResultWrapper paymentResultWrapper = (PaymentResultWrapper) obj;
                return Boolean.valueOf(wib0.m206579w(paymentResultWrapper.purchaseType) || wib0.m206575s(paymentResultWrapper.purchaseType) || wib0.m206573q(paymentResultWrapper.purchaseType) || wib0.m206578v(paymentResultWrapper.purchaseType));
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.j5p
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118486a.m58804k0((PaymentResultWrapper) obj);
            }
        }));
        C22421c c22421cObserveOn = ((!t7a.m189547c() || joa.m146386f4()) ? C22421c.just(null) : this.f38741j.flatMap(new qcj() { // from class: l.l5p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20311G2.m153661s3();
            }
        })).flatMap(new qcj() { // from class: l.a4p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f68436a.m58792c0((Envelope) obj);
            }
        }).filter(new qcj() { // from class: l.d4p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((Collection) ((pf60) obj).f152156a));
            }
        }).flatMap(new qcj() { // from class: l.f4p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97126a.m58793d0((pf60) obj);
            }
        }).observeOn(fo0.m126432a());
        if (d79.m114665X()) {
            m58704G(c5nVar, vipNewUiFrag, C22421c.combineLatest(c22421cObserveOn, yap.m214902d().m214913n().distinctUntilChanged(), new a2p()), new y20() { // from class: l.x4p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f192426a.m58794e0((pf60) obj);
                }
            });
        } else {
            m58704G(c5nVar, vipNewUiFrag, c22421cObserveOn, new y20() { // from class: l.z4p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202970a.m58795f0((pf60) obj);
                }
            });
        }
    }

    @Override // p153l.gzo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_ULTRA_PREMIUM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m58801h0(VipNewUiFrag vipNewUiFrag, pf60 pf60Var, szo szoVar) {
        if (szoVar instanceof IntlPrivilegePolicyItem.C9186a) {
            int iIndexOf = this.f38740i.indexOf(szoVar);
            this.f38740i.remove(szoVar);
            this.f38740i.add(iIndexOf, ezo.m123390b(vipNewUiFrag, getPurchaseType(), (C8928d) pf60Var.f152157b));
            this.f38736e.notifyItemChanged(iIndexOf);
        }
    }

    @Override // p153l.gzo
    /* JADX INFO: renamed from: i */
    public void mo58736i() {
        wl40.f189638F.m137019l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m58802i0(final VipNewUiFrag vipNewUiFrag, final pf60 pf60Var) {
        if (vipNewUiFrag.isAdded()) {
            jyb.m147537z(this.f38740i, new y20() { // from class: l.t4p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172094a.m58801h0(vipNewUiFrag, pf60Var, (szo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m58803j0(final VipNewUiFrag vipNewUiFrag, final pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var) && pf60Var.f152156a == getPurchaseType()) {
            post(new Runnable() { // from class: l.j4p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f118313a.m58802i0(vipNewUiFrag, pf60Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m58804k0(PaymentResultWrapper paymentResultWrapper) {
        this.f38741j.m137019l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m58805l0() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m58806o0(PutongFrag putongFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        izo izoVar = new izo(putongFrag, this.f38738g, this);
        this.f38736e = izoVar;
        setAdapter(izoVar);
        m58798n0();
    }

    @Override // p153l.gzo
    /* JADX INFO: renamed from: y */
    public void mo58750y(c5n c5nVar, VipNewUiFrag vipNewUiFrag) {
        this.f38737f = vipNewUiFrag;
        wl40 wl40Var = new wl40(vipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f38738g = wl40Var;
        wl40Var.mo126112c(this.f38742k);
        t5m t5mVar = this.f38738g;
        if (t5mVar instanceof wl40) {
            ((wl40) t5mVar).m141372H(new ip0.InterfaceC17765a() { // from class: l.y3p
                @Override // p153l.ip0.InterfaceC17765a
                /* JADX INFO: renamed from: a */
                public final void mo108479a(boolean z, boolean z2) {
                    IntlPrivilegeUltraPremiumContent.m58776L(z, z2);
                }
            });
        }
        m58806o0(vipNewUiFrag);
        m58800b0(c5nVar, vipNewUiFrag);
    }

    public IntlPrivilegeUltraPremiumContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlPrivilegeUltraPremiumContent(Context context) {
        this(context, null);
    }
}
