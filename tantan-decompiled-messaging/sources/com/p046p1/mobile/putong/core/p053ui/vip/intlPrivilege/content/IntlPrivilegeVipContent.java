package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import p133rx.C22306c;
import p149l.b90;
import p149l.c3m;
import p149l.d3n;
import p149l.e30;
import p149l.fxo;
import p149l.hxo;
import p149l.id40;
import p149l.igj;
import p149l.j760;
import p149l.jo0;
import p149l.r1p;
import p149l.txo;
import p149l.u0p;
import p149l.u59;
import p149l.vwb;
import p149l.w9j;
import p149l.y8p;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeVipContent extends IntlPrivilegeRecycleView implements hxo, IntlPrivilegeDescListItem.C8953b.a {

    /* JADX INFO: renamed from: e */
    public C8950a f37136e;

    /* JADX INFO: renamed from: f */
    public IntlVipNewUiFrag f37137f;

    /* JADX INFO: renamed from: g */
    public c3m f37138g;

    /* JADX INFO: renamed from: h */
    public r1p f37139h;

    /* JADX INFO: renamed from: i */
    public final b90 f37140i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<txo> f37141j;

    /* JADX INFO: renamed from: k */
    public Privilege[] f37142k;

    public IntlPrivilegeVipContent(Context context) {
        super(context);
        this.f37140i = new b90();
        this.f37141j = new ArrayList<>();
        this.f37142k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ C22306c m56473P(List list) {
        return igj.m136009M(getContext(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m56474Q(j760 j760Var) {
        m56475R((List) j760Var.f116564a);
        r1p r1pVar = this.f37139h;
        r1pVar.f157315k = false;
        r1pVar.f157316l = false;
        if (NullChecker.m81303a(j760Var.f116565b) && y8p.m213413d().m213423m() && y8p.m213413d().m213421h("vip")) {
            this.f37139h.f157315k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void m56475R(List<Merchandise> list) {
        if (NullChecker.m81303a(this.f37139h)) {
            return;
        }
        r1p r1pVar = new r1p(this.f37137f, list, null, getPurchaseType(), null);
        this.f37139h = r1pVar;
        r1pVar.m177542j();
        r1p r1pVar2 = this.f37139h;
        r1pVar2.f157311g = false;
        r1pVar2.f157312h = m56479N(list);
        this.f37141j.add(0, this.f37139h);
        this.f37136e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.z3p
            @Override // java.lang.Runnable
            public final void run() {
                this.f201386a.m56481S();
            }
        });
        this.f37139h.f157310f.m132487l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: U */
    private void m56477U() {
        this.f37141j.clear();
        if (m56478W()) {
            this.f37141j.add(this.f37139h);
        }
        this.f37141j.add(new C8950a.a(getPurchaseType()));
        this.f37141j.add(fxo.m123643c(getPurchaseType()));
        if (!u59.m191817Z()) {
            this.f37141j.add(fxo.m123642b(this.f37137f, getPurchaseType(), null));
        }
        this.f37136e.m56486G(this.f37141j);
    }

    /* JADX INFO: renamed from: W */
    private boolean m56478W() {
        if (u59.m191817Z()) {
            return false;
        }
        return NullChecker.m81303a(this.f37139h);
    }

    private void init() {
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: N */
    public final Merchandise m56479N(List<Merchandise> list) {
        return (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.b4p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((rxa0.m181504y(merchandise) && merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) || rxa0.m181495p(merchandise, ProductCategory.get("vip"), MonetizationPromotionsId.lowPrice3Month));
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m56480O(d3n d3nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        if (u59.m191817Z()) {
            return;
        }
        C22306c c22306cObserveOn = CoreModule.f17545c.f19654j0.m30644y5(getPurchaseType().productCategory()).filter(new w9j() { // from class: l.r3p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.t3p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f167650a.m56473P((List) obj);
            }
        }).observeOn(jo0.m142408a());
        if (u59.m191814W()) {
            m56360G(d3nVar, intlVipNewUiFrag, C22306c.combineLatest(c22306cObserveOn, y8p.m213413d().m213424n().distinctUntilChanged(), new u0p()), new e30() { // from class: l.v3p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f179833a.m56474Q((j760) obj);
                }
            });
        } else {
            m56360G(d3nVar, intlVipNewUiFrag, c22306cObserveOn, new e30() { // from class: l.x3p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f190912a.m56475R((List) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m56481S() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m56482V(IntlVipNewUiFrag intlVipNewUiFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        C8950a c8950a = new C8950a(intlVipNewUiFrag, this.f37138g, this);
        this.f37136e = c8950a;
        setAdapter(c8950a);
        m56477U();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem.C8953b.a
    /* JADX INFO: renamed from: a */
    public void mo56483a(View view, Privilege privilege) {
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
        return PurchaseType.TYPE_GET_VIP;
    }

    @Override // p149l.hxo
    /* JADX INFO: renamed from: z */
    public void mo56407z(d3n d3nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f37137f = intlVipNewUiFrag;
        id40 id40Var = new id40(intlVipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f37138g = id40Var;
        id40Var.mo105094c(this.f37140i);
        m56482V(intlVipNewUiFrag);
        m56480O(d3nVar, intlVipNewUiFrag);
    }

    public IntlPrivilegeVipContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37140i = new b90();
        this.f37141j = new ArrayList<>();
        this.f37142k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }

    public IntlPrivilegeVipContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37140i = new b90();
        this.f37141j = new ArrayList<>();
        this.f37142k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }
}
