package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.IntlPrivilegeSeeContent;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListImageItem;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListSeeItem;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import l.e30;
import l.eqh0;
import l.i0g0;
import l.igj;
import l.j760;
import l.jo0;
import l.mkd0;
import l.rxa0;
import l.vwb;
import l.w9j;
import l.y8p;
import p006l.b90;
import p006l.c3m;
import p006l.d3n;
import p006l.fxo;
import p006l.hxo;
import p006l.id40;
import p006l.r1p;
import p006l.txo;
import p006l.u0p;
import p006l.u59;
import p006l.w0c0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeSeeContent extends IntlPrivilegeRecycleView implements hxo {

    /* JADX INFO: renamed from: e */
    public C0386a f6903e;

    /* JADX INFO: renamed from: f */
    public IntlVipNewUiFrag f6904f;

    /* JADX INFO: renamed from: g */
    public c3m f6905g;

    /* JADX INFO: renamed from: h */
    public r1p f6906h;

    /* JADX INFO: renamed from: i */
    public final b90 f6907i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<txo> f6908j;

    public IntlPrivilegeSeeContent(Context context) {
        super(context);
        this.f6907i = new b90();
        this.f6908j = new ArrayList<>();
        init();
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m9847H(Throwable th) {
    }

    /* JADX INFO: renamed from: Z */
    private void m9856Z() {
        this.f6908j.clear();
        if (m9857b0()) {
            this.f6908j.add(this.f6906h);
        }
        this.f6908j.add(new IntlPrivilegeDescListImageItem.C0387a(CoreModule.f1534c.f3628e0.m21490p9().isFemale() ? "https://auto.tancdn.com/v1/raw/00a0703d-12dc-4a3c-927c-45fb33c4ae01.webp" : "https://auto.tancdn.com/v1/raw/25f87704-09b4-4dbb-af11-37542f464026.webp"));
        long jLongValue = 0;
        if (NullChecker.a(this.f6904f)) {
            try {
                User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
                if (NullChecker.a(userM21490p9) && NullChecker.a(userM21490p9.profile) && NullChecker.a(userM21490p9.profile.receivedLikes)) {
                    jLongValue = userM21490p9.profile.receivedLikes.longValue();
                }
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
        this.f6908j.add(new IntlPrivilegeDescListSeeItem.C0390a(this.f6904f.getString(R$string.f2851qn), i0g0.N(jLongValue + " " + this.f6904f.act().getString(R$string.f2419cl), Color.parseColor("#FE7E1D"), eqh0.c(3)), Privilege.see_who_likes_me, getPurchaseType()));
        this.f6908j.add(new IntlPrivilegeUnlockBenefitsView.C0395c(getPurchaseType()));
        this.f6908j.add(fxo.m15511c(getPurchaseType()));
        if (!u59.m24988Z()) {
            this.f6908j.add(fxo.m15510b(this.f6904f, getPurchaseType(), null));
        }
        this.f6903e.m9927G(this.f6908j);
    }

    /* JADX INFO: renamed from: b0 */
    private boolean m9857b0() {
        if (u59.m24988Z()) {
            return false;
        }
        return NullChecker.a(this.f6906h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: Q */
    public final Merchandise m9858Q(List<Merchandise> list) {
        return (Merchandise) vwb.r(list, new w9j() { // from class: l.h1p
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((rxa0.y(merchandise) && merchandise.isBelongPromotion("lowPriceCustomerVIP")) || rxa0.p(merchandise, ProductCategory.get("vip"), "lowPrice3Month"));
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m9859R(d3n d3nVar, final IntlVipNewUiFrag intlVipNewUiFrag) {
        if (u59.m24988Z()) {
            return;
        }
        c cVarObserveOn = CoreModule.f1534c.f3643j0.m2572y5(getPurchaseType().productCategory()).filter(new w9j() { // from class: l.q0p
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.s0p
            public final Object call(Object obj) {
                return this.f20972a.m9860S((List) obj);
            }
        }).observeOn(jo0.a());
        if (u59.m24985W()) {
            m9798G(d3nVar, intlVipNewUiFrag, c.combineLatest(cVarObserveOn, y8p.d().n().distinctUntilChanged(), new u0p()), new e30() { // from class: l.w0p
                public final void call(Object obj) {
                    this.f24750a.m9861T((j760) obj);
                }
            });
        } else {
            m9798G(d3nVar, intlVipNewUiFrag, cVarObserveOn, new e30() { // from class: l.y0p
                public final void call(Object obj) {
                    this.f27851a.m9862U((List) obj);
                }
            });
        }
        d3nVar.n(intlVipNewUiFrag, CoreModule.f1534c.f3628e0.m21486o9()).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.a1p
            public final void call(Object obj) {
                this.f8056a.m9864W(intlVipNewUiFrag, (User) obj);
            }
        }, new e30() { // from class: l.c1p
            public final void call(Object obj) {
                IntlPrivilegeSeeContent.m9847H((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ c m9860S(List list) {
        return igj.M(getContext(), list);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m9861T(j760 j760Var) {
        m9862U((List) j760Var.a);
        r1p r1pVar = this.f6906h;
        r1pVar.f20251k = false;
        r1pVar.f20252l = false;
        if (NullChecker.a(j760Var.b) && y8p.d().m() && y8p.d().h("seeWhoLikedMe")) {
            this.f6906h.f20251k = true;
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m9863V(User user, IntlVipNewUiFrag intlVipNewUiFrag, txo txoVar) {
        if (txoVar instanceof IntlPrivilegeDescListSeeItem.C0390a) {
            IntlPrivilegeDescListSeeItem.C0390a c0390a = (IntlPrivilegeDescListSeeItem.C0390a) txoVar;
            if (c0390a.f6951c == Privilege.see_who_likes_me) {
                c0390a.f6953e = i0g0.N((NullChecker.a(user.profile.receivedLikes) ? user.profile.receivedLikes.longValue() : 0L) + " " + intlVipNewUiFrag.act().getString(R$string.f2419cl), intlVipNewUiFrag.act().color(w0c0.f24732u1), eqh0.c(3));
                this.f6903e.notifyItemChanged(this.f6908j.indexOf(txoVar));
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m9864W(final IntlVipNewUiFrag intlVipNewUiFrag, final User user) {
        if (NullChecker.a(user)) {
            vwb.z(this.f6908j, new e30() { // from class: l.e1p
                public final void call(Object obj) {
                    this.f10724a.m9863V(user, intlVipNewUiFrag, (txo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m9865X() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void m9862U(List<Merchandise> list) {
        if (NullChecker.a(this.f6906h)) {
            return;
        }
        r1p r1pVar = new r1p(this.f6904f, list, null, getPurchaseType(), null);
        this.f6906h = r1pVar;
        r1pVar.m22601j();
        r1p r1pVar2 = this.f6906h;
        r1pVar2.f20247g = false;
        r1pVar2.f20248h = m9858Q(list);
        this.f6908j.add(0, this.f6906h);
        this.f6903e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.g1p
            @Override // java.lang.Runnable
            public final void run() {
                this.f13026a.m9865X();
            }
        });
        this.f6906h.f20246f.onNext(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public void m9867a0(IntlVipNewUiFrag intlVipNewUiFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        C0386a c0386a = new C0386a(intlVipNewUiFrag, this.f6905g, this);
        this.f6903e = c0386a;
        setAdapter(c0386a);
        m9856Z();
    }

    @Override // p006l.hxo
    /* JADX INFO: renamed from: b */
    public void mo9825b(int i) {
        id40.f14364E.onNext(Integer.valueOf(i));
    }

    @Override // p006l.hxo
    /* JADX INFO: renamed from: f */
    public void mo9826f(PurchaseType purchaseType, PurchaseType purchaseType2) {
    }

    @Override // p006l.hxo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_LIKERS;
    }

    @Override // p006l.hxo
    /* JADX INFO: renamed from: z */
    public void mo9845z(d3n d3nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f6904f = intlVipNewUiFrag;
        id40 id40Var = new id40(intlVipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f6905g = id40Var;
        id40Var.mo13100c(this.f6907i);
        m9867a0(intlVipNewUiFrag);
        m9859R(d3nVar, intlVipNewUiFrag);
    }

    public IntlPrivilegeSeeContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6907i = new b90();
        this.f6908j = new ArrayList<>();
        init();
    }

    public IntlPrivilegeSeeContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6907i = new b90();
        this.f6908j = new ArrayList<>();
        init();
    }
}
