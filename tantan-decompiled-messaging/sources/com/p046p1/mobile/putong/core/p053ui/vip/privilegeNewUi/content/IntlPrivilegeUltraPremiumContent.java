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
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.IntlPrivilegeUltraPremiumContent;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
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
import p149l.cjy;
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
import p149l.mkd0;
import p149l.mp0;
import p149l.q1p;
import p149l.roj0;
import p149l.sxo;
import p149l.t100;
import p149l.u59;
import p149l.vwb;
import p149l.w9j;
import p149l.x2c0;
import p149l.x9j;
import p149l.xma;
import p149l.y8p;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeUltraPremiumContent extends IntlPrivilegeRecycleView implements gxo {

    /* JADX INFO: renamed from: e */
    public ixo f37888e;

    /* JADX INFO: renamed from: f */
    public VipNewUiFrag f37889f;

    /* JADX INFO: renamed from: g */
    public c3m f37890g;

    /* JADX INFO: renamed from: h */
    public q1p f37891h;

    /* JADX INFO: renamed from: i */
    public ArrayList<sxo> f37892i;

    /* JADX INFO: renamed from: j */
    public C22392a<Unit> f37893j;

    /* JADX INFO: renamed from: k */
    public final b90 f37894k;

    /* JADX INFO: renamed from: l */
    public ProductCategory f37895l;

    public IntlPrivilegeUltraPremiumContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37892i = new ArrayList<>();
        this.f37893j = C22392a.m221513c(Unit.INSTANCE);
        this.f37894k = new b90();
        init();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m57593L(boolean z, boolean z2) {
        if (z2) {
            return;
        }
        lsi0.m151578h(R$string.f18941tc);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ j760 m57596O(List list) {
        return new j760(list, null);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ j760 m57597P(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m57598Q(Throwable th) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ j760 m57599R(List list, List list2) {
        return new j760(list, list2);
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ j760 m57605X(List list) {
        return new j760(list, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ C22306c m57609c0(Envelope envelope) {
        cb9 cb9Var = CoreModule.f17545c.f19569G2;
        if (cb9Var.f80117R == null || !cb9Var.m105984l3(getPurchaseType())) {
            return CoreModule.f17545c.f19654j0.m30644y5(getPurchaseType().productCategory()).map(new w9j() { // from class: l.l2p
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IntlPrivilegeUltraPremiumContent.m57605X((List) obj);
                }
            });
        }
        this.f37895l = CoreModule.f17545c.f19569G2.m105981i3();
        return mkd0.m154984r(CoreModule.f17545c.f19654j0.m30644y5(getPurchaseType().productCategory()), CoreModule.f17545c.f19654j0.m30644y5(this.f37895l), new x9j() { // from class: l.n2p
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeUltraPremiumContent.m57599R((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ C22306c m57610d0(j760 j760Var) {
        return vwb.m200296J((Collection) j760Var.f116565b) ? igj.m136009M(getContext(), (List) j760Var.f116564a).map(new w9j() { // from class: l.p2p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlPrivilegeUltraPremiumContent.m57596O((List) obj);
            }
        }) : mkd0.m154984r(igj.m136009M(getContext(), (List) j760Var.f116564a), igj.m136009M(getContext(), (List) j760Var.f116565b), new x9j() { // from class: l.r2p
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeUltraPremiumContent.m57597P((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m57611e0(j760 j760Var) {
        F f = j760Var.f116564a;
        m57614m0((List) ((j760) f).f116564a, (List) ((j760) f).f116565b);
        q1p q1pVar = this.f37891h;
        q1pVar.f152152k = false;
        q1pVar.f152153l = true;
        if (NullChecker.m81303a(j760Var.f116565b) && y8p.m213413d().m213423m() && y8p.m213413d().m213421h(ProductCategory.tttUltraPremium)) {
            this.f37891h.f152152k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m57612f0(j760 j760Var) {
        m57614m0((List) j760Var.f116564a, (List) j760Var.f116565b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m57613g0(Boolean bool) {
        m57615n0();
    }

    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: renamed from: m0 */
    private void m57614m0(List<Merchandise> list, List<Merchandise> list2) {
        PurchaseType purchaseType = PurchaseType.TYPE_ULTRA_PREMIUM;
        if (cjy.m107330z(purchaseType.productCategory()).mo107333a(this.f37889f.act(), purchaseType, purchaseType.productCategory(), list).size() == 2) {
            ((id40) this.f37890g).m135414d0(t100.m186890d(47.0f));
            ((id40) this.f37890g).m135416f0(t100.m186890d(47.0f));
        }
        if (NullChecker.m81303a(this.f37891h)) {
            this.f37891h.m172411k(list, list2);
            this.f37891h.m172410j();
            q1p q1pVar = this.f37891h;
            q1pVar.f152148g = false;
            q1pVar.f152149h = null;
            q1pVar.f152147f.m132487l(roj0.f160388a);
            return;
        }
        q1p q1pVar2 = new q1p(this.f37889f, list, list2, getPurchaseType(), this.f37895l);
        this.f37891h = q1pVar2;
        q1pVar2.m172410j();
        q1p q1pVar3 = this.f37891h;
        q1pVar3.f152148g = false;
        q1pVar3.f152149h = null;
        this.f37892i.add(0, q1pVar3);
        this.f37888e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.h2p
            @Override // java.lang.Runnable
            public final void run() {
                this.f105546a.m57622l0();
            }
        });
        this.f37891h.f152147f.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: n0 */
    private void m57615n0() {
        this.f37892i.clear();
        if (m57616p0()) {
            this.f37892i.add(this.f37891h);
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            Iterator<Privilege> it = PurchaseType.TYPE_ULTRA_PREMIUM.getPrivilegeData(userM169527p9.gender).iterator();
            while (it.hasNext()) {
                this.f37892i.add(exo.m118682a(it.next(), getPurchaseType()));
            }
            this.f37892i.add(new IntlPrivilegeDescListItem.C9020a(x2c0.f190294kb, String.format(getContext().getString(R$string.f18885rg), Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null).size())), "", null, PurchaseType.TYPE_ULTRA_PREMIUM));
            this.f37892i.add(exo.m118685d(getPurchaseType()));
            this.f37892i.add(exo.m118683b(this.f37889f, getPurchaseType(), null));
            this.f37888e.m138877G(this.f37892i);
        }
    }

    /* JADX INFO: renamed from: p0 */
    private boolean m57616p0() {
        return NullChecker.m81303a(this.f37891h);
    }

    @Override // p149l.gxo
    /* JADX INFO: renamed from: b */
    public void mo57551b(int i) {
        id40.f112518E.m132487l(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b0 */
    public void m57617b0(c3n c3nVar, final VipNewUiFrag vipNewUiFrag) {
        c3nVar.m115452n(vipNewUiFrag, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium))).map(new w9j() { // from class: l.c2p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210047L3());
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.b3p
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73247a.m57613g0((Boolean) obj);
            }
        }));
        vipNewUiFrag.duringCreated(CoreModule.f17545c.f19569G2.f80121V).subscribe(mkd0.m154956H(new e30() { // from class: l.d3p
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84244a.m57620j0(vipNewUiFrag, (j760) obj);
            }
        }, new e30() { // from class: l.f3p
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPrivilegeUltraPremiumContent.m57598Q((Throwable) obj);
            }
        }));
        c3nVar.m115452n(vipNewUiFrag, ah60.m96370E().filter(new w9j() { // from class: l.h3p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                PaymentResultWrapper paymentResultWrapper = (PaymentResultWrapper) obj;
                return Boolean.valueOf(sab0.m182905w(paymentResultWrapper.purchaseType) || sab0.m182901s(paymentResultWrapper.purchaseType) || sab0.m182899q(paymentResultWrapper.purchaseType) || sab0.m182904v(paymentResultWrapper.purchaseType));
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.j3p
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116102a.m57621k0((PaymentResultWrapper) obj);
            }
        }));
        C22306c c22306cObserveOn = ((!h6a.m129470c() || xma.m210071e4()) ? C22306c.just(null) : this.f37893j.flatMap(new w9j() { // from class: l.l3p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19569G2.m105991s3();
            }
        })).flatMap(new w9j() { // from class: l.a2p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67275a.m57609c0((Envelope) obj);
            }
        }).filter(new w9j() { // from class: l.d2p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((Collection) ((j760) obj).f116564a));
            }
        }).flatMap(new w9j() { // from class: l.f2p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f94227a.m57610d0((j760) obj);
            }
        }).observeOn(jo0.m142408a());
        if (u59.m191814W()) {
            m57521G(c3nVar, vipNewUiFrag, C22306c.combineLatest(c22306cObserveOn, y8p.m213413d().m213424n().distinctUntilChanged(), new a0p()), new e30() { // from class: l.x2p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f190811a.m57611e0((j760) obj);
                }
            });
        } else {
            m57521G(c3nVar, vipNewUiFrag, c22306cObserveOn, new e30() { // from class: l.z2p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201265a.m57612f0((j760) obj);
                }
            });
        }
    }

    @Override // p149l.gxo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_ULTRA_PREMIUM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m57618h0(VipNewUiFrag vipNewUiFrag, j760 j760Var, sxo sxoVar) {
        if (sxoVar instanceof IntlPrivilegePolicyItem.C9023a) {
            int iIndexOf = this.f37892i.indexOf(sxoVar);
            this.f37892i.remove(sxoVar);
            this.f37892i.add(iIndexOf, exo.m118683b(vipNewUiFrag, getPurchaseType(), (C8765d) j760Var.f116565b));
            this.f37888e.notifyItemChanged(iIndexOf);
        }
    }

    @Override // p149l.gxo
    /* JADX INFO: renamed from: i */
    public void mo57553i() {
        id40.f112519F.m132487l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m57619i0(final VipNewUiFrag vipNewUiFrag, final j760 j760Var) {
        if (vipNewUiFrag.isAdded()) {
            vwb.m200354z(this.f37892i, new e30() { // from class: l.t2p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167540a.m57618h0(vipNewUiFrag, j760Var, (sxo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m57620j0(final VipNewUiFrag vipNewUiFrag, final j760 j760Var) {
        if (NullChecker.m81303a(j760Var) && j760Var.f116564a == getPurchaseType()) {
            post(new Runnable() { // from class: l.j2p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115941a.m57619i0(vipNewUiFrag, j760Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m57621k0(PaymentResultWrapper paymentResultWrapper) {
        this.f37893j.m132487l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m57622l0() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m57623o0(PutongFrag putongFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        ixo ixoVar = new ixo(putongFrag, this.f37890g, this);
        this.f37888e = ixoVar;
        setAdapter(ixoVar);
        m57615n0();
    }

    @Override // p149l.gxo
    /* JADX INFO: renamed from: y */
    public void mo57567y(c3n c3nVar, VipNewUiFrag vipNewUiFrag) {
        this.f37889f = vipNewUiFrag;
        id40 id40Var = new id40(vipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f37890g = id40Var;
        id40Var.mo105094c(this.f37894k);
        c3m c3mVar = this.f37890g;
        if (c3mVar instanceof id40) {
            ((id40) c3mVar).m155738H(new mp0.InterfaceC18522a() { // from class: l.y1p
                @Override // p149l.mp0.InterfaceC18522a
                /* JADX INFO: renamed from: a */
                public final void mo106044a(boolean z, boolean z2) {
                    IntlPrivilegeUltraPremiumContent.m57593L(z, z2);
                }
            });
        }
        m57623o0(vipNewUiFrag);
        m57617b0(c3nVar, vipNewUiFrag);
    }

    public IntlPrivilegeUltraPremiumContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlPrivilegeUltraPremiumContent(Context context) {
        this(context, null);
    }
}
