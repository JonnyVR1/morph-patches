package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import l.e30;
import l.igj;
import l.j760;
import l.jo0;
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
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeVipContent extends IntlPrivilegeRecycleView implements hxo, IntlPrivilegeDescListItem.C0389b.a {

    /* JADX INFO: renamed from: e */
    public C0386a f6917e;

    /* JADX INFO: renamed from: f */
    public IntlVipNewUiFrag f6918f;

    /* JADX INFO: renamed from: g */
    public c3m f6919g;

    /* JADX INFO: renamed from: h */
    public r1p f6920h;

    /* JADX INFO: renamed from: i */
    public final b90 f6921i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<txo> f6922j;

    /* JADX INFO: renamed from: k */
    public Privilege[] f6923k;

    public IntlPrivilegeVipContent(Context context) {
        super(context);
        this.f6921i = new b90();
        this.f6922j = new ArrayList<>();
        this.f6923k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ c m9911P(List list) {
        return igj.M(getContext(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m9912Q(j760 j760Var) {
        m9913R((List) j760Var.a);
        r1p r1pVar = this.f6920h;
        r1pVar.f20251k = false;
        r1pVar.f20252l = false;
        if (NullChecker.a(j760Var.b) && y8p.d().m() && y8p.d().h("vip")) {
            this.f6920h.f20251k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void m9913R(List<Merchandise> list) {
        if (NullChecker.a(this.f6920h)) {
            return;
        }
        r1p r1pVar = new r1p(this.f6918f, list, null, getPurchaseType(), null);
        this.f6920h = r1pVar;
        r1pVar.m22601j();
        r1p r1pVar2 = this.f6920h;
        r1pVar2.f20247g = false;
        r1pVar2.f20248h = m9917N(list);
        this.f6922j.add(0, this.f6920h);
        this.f6917e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.z3p
            @Override // java.lang.Runnable
            public final void run() {
                this.f28606a.m9919S();
            }
        });
        this.f6920h.f20246f.onNext(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: U */
    private void m9915U() {
        this.f6922j.clear();
        if (m9916W()) {
            this.f6922j.add(this.f6920h);
        }
        this.f6922j.add(new C0386a.a(getPurchaseType()));
        this.f6922j.add(fxo.m15511c(getPurchaseType()));
        if (!u59.m24988Z()) {
            this.f6922j.add(fxo.m15510b(this.f6918f, getPurchaseType(), null));
        }
        this.f6917e.m9927G(this.f6922j);
    }

    /* JADX INFO: renamed from: W */
    private boolean m9916W() {
        if (u59.m24988Z()) {
            return false;
        }
        return NullChecker.a(this.f6920h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: N */
    public final Merchandise m9917N(List<Merchandise> list) {
        return (Merchandise) vwb.r(list, new w9j() { // from class: l.b4p
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((rxa0.y(merchandise) && merchandise.isBelongPromotion("lowPriceCustomerVIP")) || rxa0.p(merchandise, ProductCategory.get("vip"), "lowPrice3Month"));
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m9918O(d3n d3nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        if (u59.m24988Z()) {
            return;
        }
        c cVarObserveOn = CoreModule.f1534c.f3643j0.m2572y5(getPurchaseType().productCategory()).filter(new w9j() { // from class: l.r3p
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.t3p
            public final Object call(Object obj) {
                return this.f21863a.m9911P((List) obj);
            }
        }).observeOn(jo0.a());
        if (u59.m24985W()) {
            m9798G(d3nVar, intlVipNewUiFrag, c.combineLatest(cVarObserveOn, y8p.d().n().distinctUntilChanged(), new u0p()), new e30() { // from class: l.v3p
                public final void call(Object obj) {
                    this.f24114a.m9912Q((j760) obj);
                }
            });
        } else {
            m9798G(d3nVar, intlVipNewUiFrag, cVarObserveOn, new e30() { // from class: l.x3p
                public final void call(Object obj) {
                    this.f27338a.m9913R((List) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m9919S() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public void m9920V(IntlVipNewUiFrag intlVipNewUiFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        C0386a c0386a = new C0386a(intlVipNewUiFrag, this.f6919g, this);
        this.f6917e = c0386a;
        setAdapter(c0386a);
        m9915U();
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem.C0389b.a
    /* JADX INFO: renamed from: a */
    public void mo9921a(View view, Privilege privilege) {
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
        return PurchaseType.TYPE_GET_VIP;
    }

    @Override // p006l.hxo
    /* JADX INFO: renamed from: z */
    public void mo9845z(d3n d3nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f6918f = intlVipNewUiFrag;
        id40 id40Var = new id40(intlVipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f6919g = id40Var;
        id40Var.mo13100c(this.f6921i);
        m9920V(intlVipNewUiFrag);
        m9918O(d3nVar, intlVipNewUiFrag);
    }

    public IntlPrivilegeVipContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6921i = new b90();
        this.f6922j = new ArrayList<>();
        this.f6923k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }

    public IntlPrivilegeVipContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6921i = new b90();
        this.f6922j = new ArrayList<>();
        this.f6923k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }
}
