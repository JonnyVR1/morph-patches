package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.IntlPrivilegeSeeContent;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListImageItem;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListSeeItem;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import p133rx.C22306c;
import p149l.b90;
import p149l.c3m;
import p149l.d3n;
import p149l.e30;
import p149l.eqh0;
import p149l.fxo;
import p149l.hxo;
import p149l.i0g0;
import p149l.id40;
import p149l.igj;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;
import p149l.r1p;
import p149l.txo;
import p149l.u0p;
import p149l.u59;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.y8p;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeSeeContent extends IntlPrivilegeRecycleView implements hxo {

    /* JADX INFO: renamed from: e */
    public C8950a f37122e;

    /* JADX INFO: renamed from: f */
    public IntlVipNewUiFrag f37123f;

    /* JADX INFO: renamed from: g */
    public c3m f37124g;

    /* JADX INFO: renamed from: h */
    public r1p f37125h;

    /* JADX INFO: renamed from: i */
    public final b90 f37126i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<txo> f37127j;

    public IntlPrivilegeSeeContent(Context context) {
        super(context);
        this.f37126i = new b90();
        this.f37127j = new ArrayList<>();
        init();
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m56409H(Throwable th) {
    }

    /* JADX INFO: renamed from: Z */
    private void m56418Z() {
        this.f37127j.clear();
        if (m56419b0()) {
            this.f37127j.add(this.f37125h);
        }
        this.f37127j.add(new IntlPrivilegeDescListImageItem.C8951a(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "https://auto.tancdn.com/v1/raw/00a0703d-12dc-4a3c-927c-45fb33c4ae01.webp" : "https://auto.tancdn.com/v1/raw/25f87704-09b4-4dbb-af11-37542f464026.webp"));
        long jLongValue = 0;
        if (NullChecker.m81303a(this.f37123f)) {
            try {
                User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                if (NullChecker.m81303a(userM169527p9) && NullChecker.m81303a(userM169527p9.profile) && NullChecker.m81303a(userM169527p9.profile.receivedLikes)) {
                    jLongValue = userM169527p9.profile.receivedLikes.longValue();
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
        this.f37127j.add(new IntlPrivilegeDescListSeeItem.C8954a(this.f37123f.getString(R$string.f18862qn), i0g0.m133847N(jLongValue + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f37123f.act().getString(R$string.f18430cl), Color.parseColor("#FE7E1D"), eqh0.m117752c(3)), Privilege.see_who_likes_me, getPurchaseType()));
        this.f37127j.add(new IntlPrivilegeUnlockBenefitsView.C8959c(getPurchaseType()));
        this.f37127j.add(fxo.m123643c(getPurchaseType()));
        if (!u59.m191817Z()) {
            this.f37127j.add(fxo.m123642b(this.f37123f, getPurchaseType(), null));
        }
        this.f37122e.m56486G(this.f37127j);
    }

    /* JADX INFO: renamed from: b0 */
    private boolean m56419b0() {
        if (u59.m191817Z()) {
            return false;
        }
        return NullChecker.m81303a(this.f37125h);
    }

    private void init() {
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: Q */
    public final Merchandise m56420Q(List<Merchandise> list) {
        return (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.h1p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((rxa0.m181504y(merchandise) && merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) || rxa0.m181495p(merchandise, ProductCategory.get("vip"), MonetizationPromotionsId.lowPrice3Month));
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m56421R(d3n d3nVar, final IntlVipNewUiFrag intlVipNewUiFrag) {
        if (u59.m191817Z()) {
            return;
        }
        C22306c c22306cObserveOn = CoreModule.f17545c.f19654j0.m30644y5(getPurchaseType().productCategory()).filter(new w9j() { // from class: l.q0p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.s0p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f161793a.m56422S((List) obj);
            }
        }).observeOn(jo0.m142408a());
        if (u59.m191814W()) {
            m56360G(d3nVar, intlVipNewUiFrag, C22306c.combineLatest(c22306cObserveOn, y8p.m213413d().m213424n().distinctUntilChanged(), new u0p()), new e30() { // from class: l.w0p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f183929a.m56423T((j760) obj);
                }
            });
        } else {
            m56360G(d3nVar, intlVipNewUiFrag, c22306cObserveOn, new e30() { // from class: l.y0p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f195318a.m56424U((List) obj);
                }
            });
        }
        d3nVar.m115452n(intlVipNewUiFrag, CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.a1p
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67193a.m56426W(intlVipNewUiFrag, (User) obj);
            }
        }, new e30() { // from class: l.c1p
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPrivilegeSeeContent.m56409H((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ C22306c m56422S(List list) {
        return igj.m136009M(getContext(), list);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m56423T(j760 j760Var) {
        m56424U((List) j760Var.f116564a);
        r1p r1pVar = this.f37125h;
        r1pVar.f157315k = false;
        r1pVar.f157316l = false;
        if (NullChecker.m81303a(j760Var.f116565b) && y8p.m213413d().m213423m() && y8p.m213413d().m213421h("seeWhoLikedMe")) {
            this.f37125h.f157315k = true;
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m56425V(User user, IntlVipNewUiFrag intlVipNewUiFrag, txo txoVar) {
        if (txoVar instanceof IntlPrivilegeDescListSeeItem.C8954a) {
            IntlPrivilegeDescListSeeItem.C8954a c8954a = (IntlPrivilegeDescListSeeItem.C8954a) txoVar;
            if (c8954a.f37170c == Privilege.see_who_likes_me) {
                c8954a.f37172e = i0g0.m133847N((NullChecker.m81303a(user.profile.receivedLikes) ? user.profile.receivedLikes.longValue() : 0L) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + intlVipNewUiFrag.act().getString(R$string.f18430cl), intlVipNewUiFrag.act().color(w0c0.f183892u1), eqh0.m117752c(3));
                this.f37122e.notifyItemChanged(this.f37127j.indexOf(txoVar));
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m56426W(final IntlVipNewUiFrag intlVipNewUiFrag, final User user) {
        if (NullChecker.m81303a(user)) {
            vwb.m200354z(this.f37127j, new e30() { // from class: l.e1p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f88836a.m56425V(user, intlVipNewUiFrag, (txo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m56427X() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void m56424U(List<Merchandise> list) {
        if (NullChecker.m81303a(this.f37125h)) {
            return;
        }
        r1p r1pVar = new r1p(this.f37123f, list, null, getPurchaseType(), null);
        this.f37125h = r1pVar;
        r1pVar.m177542j();
        r1p r1pVar2 = this.f37125h;
        r1pVar2.f157311g = false;
        r1pVar2.f157312h = m56420Q(list);
        this.f37127j.add(0, this.f37125h);
        this.f37122e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.g1p
            @Override // java.lang.Runnable
            public final void run() {
                this.f100191a.m56427X();
            }
        });
        this.f37125h.f157310f.m132487l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: a0 */
    public void m56429a0(IntlVipNewUiFrag intlVipNewUiFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        C8950a c8950a = new C8950a(intlVipNewUiFrag, this.f37124g, this);
        this.f37122e = c8950a;
        setAdapter(c8950a);
        m56418Z();
    }

    @Override // p149l.hxo
    /* JADX INFO: renamed from: b */
    public void mo56387b(int i) {
        id40.f112518E.m132487l(Integer.valueOf(i));
    }

    @Override // p149l.hxo
    /* JADX INFO: renamed from: f */
    public void mo56388f(PurchaseType purchaseType, PurchaseType purchaseType2) {
    }

    @Override // p149l.hxo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_LIKERS;
    }

    @Override // p149l.hxo
    /* JADX INFO: renamed from: z */
    public void mo56407z(d3n d3nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f37123f = intlVipNewUiFrag;
        id40 id40Var = new id40(intlVipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f37124g = id40Var;
        id40Var.mo105094c(this.f37126i);
        m56429a0(intlVipNewUiFrag);
        m56421R(d3nVar, intlVipNewUiFrag);
    }

    public IntlPrivilegeSeeContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37126i = new b90();
        this.f37127j = new ArrayList<>();
        init();
    }

    public IntlPrivilegeSeeContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37126i = new b90();
        this.f37127j = new ArrayList<>();
        init();
    }
}
