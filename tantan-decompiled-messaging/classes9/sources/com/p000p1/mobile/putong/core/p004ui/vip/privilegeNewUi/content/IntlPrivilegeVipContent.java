package com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.igj;
import l.j760;
import l.jo0;
import l.roj0;
import l.rxa0;
import l.vwb;
import l.w9j;
import l.y8p;
import p006l.b90;
import p006l.c3m;
import p006l.c3n;
import p006l.exo;
import p006l.gxo;
import p006l.id40;
import p006l.ixo;
import p006l.q1p;
import p006l.sxo;
import p006l.u0p;
import p006l.u59;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeVipContent extends IntlPrivilegeRecycleView implements gxo, IntlPrivilegeDescListItem.C0456a.a {

    /* JADX INFO: renamed from: e */
    public ixo f7677e;

    /* JADX INFO: renamed from: f */
    public VipNewUiFrag f7678f;

    /* JADX INFO: renamed from: g */
    public c3m f7679g;

    /* JADX INFO: renamed from: h */
    public q1p f7680h;

    /* JADX INFO: renamed from: i */
    public final b90 f7681i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<sxo> f7682j;

    /* JADX INFO: renamed from: k */
    public Privilege[] f7683k;

    public IntlPrivilegeVipContent(Context context) {
        super(context);
        this.f7681i = new b90();
        this.f7682j = new ArrayList<>();
        this.f7683k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }

    /* JADX INFO: renamed from: N */
    private Merchandise m11122N(List<Merchandise> list) {
        return (Merchandise) vwb.r(list, new w9j() { // from class: l.a4p
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((rxa0.y(merchandise) && merchandise.isBelongPromotion("lowPriceCustomerVIP")) || rxa0.p(merchandise, ProductCategory.get("tttVip"), "lowPrice3Month"));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ c m11123P(List list) {
        return igj.M(getContext(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m11124Q(j760 j760Var) {
        m11125R((List) j760Var.a);
        q1p q1pVar = this.f7680h;
        q1pVar.f19525k = false;
        q1pVar.f19526l = false;
        if (NullChecker.a(j760Var.b) && y8p.d().m() && y8p.d().h("tttVip")) {
            this.f7680h.f19525k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m11126S() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void m11125R(List<Merchandise> list) {
        if (NullChecker.a(this.f7680h)) {
            return;
        }
        q1p q1pVar = new q1p(this.f7678f, list, null, getPurchaseType(), null);
        this.f7680h = q1pVar;
        q1pVar.m21928j();
        q1p q1pVar2 = this.f7680h;
        q1pVar2.f19521g = false;
        q1pVar2.f19522h = m11122N(list);
        this.f7682j.add(0, this.f7680h);
        this.f7677e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.y3p
            @Override // java.lang.Runnable
            public final void run() {
                this.f27999a.m11126S();
            }
        });
        this.f7680h.f19520f.onNext(roj0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    private void m11128U() {
        this.f7682j.clear();
        if (m11129W()) {
            this.f7682j.add(this.f7680h);
        }
        this.f7682j.add(new IntlPrivilegeDescListTitle.C0458a(getResources().getString(R$string.f2004Os), "", false, null));
        for (Privilege privilege : this.f7683k) {
            if ((IntlCountryCodeController.m14o() || privilege != Privilege.vip_message_block_gp) && privilege != Privilege.vip_super_like) {
                IntlPrivilegeDescListItem.C0456a c0456aM14919a = exo.m14919a(privilege, getPurchaseType());
                c0456aM14919a.m11145a(this);
                this.f7682j.add(c0456aM14919a);
            }
        }
        this.f7682j.add(exo.m14922d(getPurchaseType()));
        this.f7682j.add(exo.m14920b(this.f7678f, getPurchaseType(), null));
        this.f7677e.m17147G(this.f7682j);
    }

    /* JADX INFO: renamed from: W */
    private boolean m11129W() {
        return NullChecker.a(this.f7680h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: O */
    public void m11130O(c3n c3nVar, VipNewUiFrag vipNewUiFrag) {
        c cVarObserveOn = CoreModule.f1534c.f3643j0.m2572y5(getPurchaseType().productCategory()).filter(new w9j() { // from class: l.q3p
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.s3p
            public final Object call(Object obj) {
                return this.f21004a.m11123P((List) obj);
            }
        }).observeOn(jo0.a());
        if (u59.m24985W()) {
            m11013G(c3nVar, vipNewUiFrag, c.combineLatest(cVarObserveOn, y8p.d().n().distinctUntilChanged(), new u0p()), new e30() { // from class: l.u3p
                public final void call(Object obj) {
                    this.f22455a.m11124Q((j760) obj);
                }
            });
        } else {
            m11013G(c3nVar, vipNewUiFrag, cVarObserveOn, new e30() { // from class: l.w3p
                public final void call(Object obj) {
                    this.f24912a.m11125R((List) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public void m11131V(PutongFrag putongFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        ixo ixoVar = new ixo(putongFrag, this.f7679g, this);
        this.f7677e = ixoVar;
        setAdapter(ixoVar);
        m11128U();
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem.C0456a.a
    /* JADX INFO: renamed from: a */
    public void mo11132a(View view, Privilege privilege) {
    }

    @Override // p006l.gxo
    /* JADX INFO: renamed from: b */
    public void mo11043b(int i) {
        id40.f14364E.onNext(Integer.valueOf(i));
    }

    @Override // p006l.gxo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_VIP;
    }

    @Override // p006l.gxo
    /* JADX INFO: renamed from: i */
    public void mo11045i() {
    }

    @Override // p006l.gxo
    /* JADX INFO: renamed from: y */
    public void mo11059y(c3n c3nVar, VipNewUiFrag vipNewUiFrag) {
        this.f7678f = vipNewUiFrag;
        id40 id40Var = new id40(vipNewUiFrag.act(), getPurchaseType());
        this.f7679g = id40Var;
        id40Var.mo13100c(this.f7681i);
        m11131V(vipNewUiFrag);
        m11130O(c3nVar, vipNewUiFrag);
    }

    public IntlPrivilegeVipContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7681i = new b90();
        this.f7682j = new ArrayList<>();
        this.f7683k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }

    public IntlPrivilegeVipContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7681i = new b90();
        this.f7682j = new ArrayList<>();
        this.f7683k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }
}
