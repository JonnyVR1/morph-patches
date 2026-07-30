package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.C9166a;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNearbyItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListPartnerDressUpItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg.C9171a;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.VipFrag;
import com.p051p1.mobile.putong.data.NavigationCardIntent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import p137rx.subjects.C22507a;
import p153l.a690;
import p153l.dbc0;
import p153l.h390;
import p153l.j690;
import p153l.joa;
import p153l.jz20;
import p153l.m190;
import p153l.o290;
import p153l.oql0;
import p153l.psd0;
import p153l.qcj;
import p153l.rbb0;
import p153l.rj90;
import p153l.u290;
import p153l.ub3;
import p153l.xwa;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeRecyclerSupremePartnerView extends PrivilegeRecycleView implements o290 {

    /* JADX INFO: renamed from: e */
    public VipFrag f38398e;

    /* JADX INFO: renamed from: f */
    public Privilege[] f38399f;

    /* JADX INFO: renamed from: g */
    public ArrayList<h390> f38400g;

    /* JADX INFO: renamed from: h */
    public u290 f38401h;

    /* JADX INFO: renamed from: i */
    public final C22507a<C8928d> f38402i;

    /* JADX INFO: renamed from: j */
    public boolean f38403j;

    public PrivilegeRecyclerSupremePartnerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38399f = new Privilege[]{Privilege.city_topping, Privilege.personal_customization, Privilege.mysterious_mode, Privilege.immediately_match, Privilege.nearby_people, Privilege.exclusive_dressing_up, Privilege.customer_service};
        this.f38400g = new ArrayList<>();
        this.f38402i = C22507a.m222758b();
        this.f38403j = false;
        init();
    }

    /* JADX INFO: renamed from: Y */
    private void m58212Y() {
        this.f38400g.clear();
        this.f38400g.add(new PrivilegeDescListTitle.C9162a("至尊合伙人特权", "查看全部", new PrivilegeDescListTitle.C9162a.a() { // from class: l.zh90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTitle.C9162a.a
            /* JADX INFO: renamed from: a */
            public final void mo58461a(View view) {
                this.f204389a.m58219U(view);
            }
        }, PurchaseType.TYPE_SUPREME_PARTNER));
        for (Privilege privilege : this.f38399f) {
            PrivilegeDescListItem.C9151a c9151aM156630a = m190.m156630a(privilege, PurchaseType.TYPE_SUPREME_PARTNER);
            c9151aM156630a.m58315g(new PrivilegeDescListItem.C9151a.a() { // from class: l.ai90
                @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem.C9151a.a
                /* JADX INFO: renamed from: a */
                public final void mo58110a(View view, Privilege privilege2) {
                    this.f71463a.m58220V(view, privilege2);
                }
            });
            this.f38400g.add(c9151aM156630a);
        }
        if (joa.m146363O3()) {
            this.f38400g.add(new PrivilegeDescListTitle.C9162a("至尊合伙人尊享", "", null, PurchaseType.TYPE_SUPREME_PARTNER));
            this.f38400g.add(getDressUpItem());
            this.f38400g.add(getMysteriousModeItem());
            this.f38400g.add(getServiceItem());
            this.f38400g.add(getNearbyItem());
            this.f38400g.add(getSeeItem());
            this.f38400g.add(getPrivacyItem());
            this.f38400g.add(getAdvancedFiltertem());
        } else {
            ArrayList arrayList = new ArrayList();
            PrivilegeDescListTitle.C9162a c9162a = new PrivilegeDescListTitle.C9162a("至尊合伙人尊享", "", null, PurchaseType.TYPE_SUPREME_PARTNER);
            arrayList.add(getDressUpItem());
            arrayList.add(getMysteriousModeItem());
            arrayList.add(getServiceItem());
            arrayList.add(getNearbyItem());
            arrayList.add(getSeeItem());
            arrayList.add(getPrivacyItem());
            arrayList.add(getAdvancedFiltertem());
            this.f38400g.add(new PrivilegeDescListNoSVipItem.C9154a(c9162a, "解锁更多会员特权", false, arrayList, new PrivilegeDescListNoSVipItem.C9154a.a() { // from class: l.bi90
                @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C9154a.a
                /* JADX INFO: renamed from: a */
                public final void mo58354a(View view) {
                    this.f76848a.m58221W(view);
                }
            }));
        }
        this.f38401h.m194253J(this.f38400g);
    }

    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: renamed from: O */
    public void m58213O(ub3 ub3Var, VipFrag vipFrag) {
        vipFrag.duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.supremePartner))).map(new qcj() { // from class: l.xh90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146363O3());
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.yh90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199913a.m58218T((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m58214P(View view) {
        rj90.m181692b();
        jz20.m147635c(this.f38398e.act(), 1);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m58215Q(View view) {
        HashMap map = new HashMap();
        map.put("navigation_to", "nearby_people");
        this.f38398e.act().startActivity(xwa.m213312g(this.f38398e.act(), NavigationCardIntent.get(NavigationCardIntent.supreme_sartner), map));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m58216R(View view) {
        rj90.m181695e();
        jz20.m147635c(this.f38398e.act(), 2);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m58217S(View view) {
        if (rbb0.m180744q()) {
            return;
        }
        getContext().startActivity(new Intent(getContext(), (Class<?>) LikersAct.class));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m58218T(Boolean bool) {
        m58212Y();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m58219U(View view) {
        m58224a0(null);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m58220V(View view, Privilege privilege) {
        m58224a0(privilege);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m58221W(View view) {
        oql0.m168821e(this.f38398e.act());
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m58222X(PurchaseType purchaseType, Privilege privilege) {
        if (joa.m146363O3()) {
            return;
        }
        oql0.m168821e(this.f38398e.act());
    }

    /* JADX INFO: renamed from: Z */
    public void m58223Z(VipFrag vipFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        u290 u290Var = new u290(vipFrag, null, this, PurchaseType.TYPE_SUPREME_PARTNER);
        this.f38401h = u290Var;
        setAdapter(u290Var);
        m58212Y();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m58224a0(Privilege privilege) {
        C9171a c9171a = new C9171a(this.f38398e);
        c9171a.m58604p(PurchaseType.TYPE_SUPREME_PARTNER, new C9171a.f() { // from class: l.ci90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg.C9171a.f
            /* JADX INFO: renamed from: a */
            public final void mo58605a(PurchaseType purchaseType, Privilege privilege2) {
                this.f81916a.m58222X(purchaseType, privilege2);
            }
        });
        if (NullChecker.m82486a(privilege)) {
            c9171a.m58603o(privilege);
        }
    }

    @Override // p153l.o290
    /* JADX INFO: renamed from: c */
    public void mo58111c() {
        this.f38403j = false;
    }

    public C9166a getAdvancedFiltertem() {
        a690 a690VarM143621m = j690.m143621m(PurchaseType.TYPE_SUPREME_PARTNER, Privilege.advanced_filter);
        C9166a c9166a = new C9166a(dbc0.f86285Jk, a690VarM143621m.m96314t().toString(), a690VarM143621m.m96311q().toString(), "advancing");
        c9166a.m58504f(new C9166a.a() { // from class: l.wh90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.C9166a.a
            /* JADX INFO: renamed from: a */
            public final void mo58505a(View view) {
                this.f189100a.m58214P(view);
            }
        });
        return c9166a;
    }

    public PrivilegeDescListPartnerDressUpItem.C9155a getDressUpItem() {
        PurchaseType purchaseType = PurchaseType.TYPE_SUPREME_PARTNER;
        Privilege privilege = Privilege.exclusive_dressing_up;
        a690 a690VarM143621m = j690.m143621m(purchaseType, privilege);
        return new PrivilegeDescListPartnerDressUpItem.C9155a(a690VarM143621m.m96314t().toString(), a690VarM143621m.m96311q().toString(), privilege);
    }

    public PrivilegeDescListPartnerDressUpItem.C9155a getMysteriousModeItem() {
        PurchaseType purchaseType = PurchaseType.TYPE_SUPREME_PARTNER;
        Privilege privilege = Privilege.mysterious_mode;
        a690 a690VarM143621m = j690.m143621m(purchaseType, privilege);
        return new PrivilegeDescListPartnerDressUpItem.C9155a(a690VarM143621m.m96314t().toString(), a690VarM143621m.m96311q().toString(), privilege);
    }

    public PrivilegeDescListNearbyItem.C9152a getNearbyItem() {
        PrivilegeDescListNearbyItem.C9152a c9152a = new PrivilegeDescListNearbyItem.C9152a();
        c9152a.m58326b(new PrivilegeDescListNearbyItem.C9152a.a() { // from class: l.uh90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNearbyItem.C9152a.a
            /* JADX INFO: renamed from: a */
            public final void mo58327a(View view) {
                this.f179003a.m58215Q(view);
            }
        });
        return c9152a;
    }

    public C9166a getPrivacyItem() {
        a690 a690VarM143621m = j690.m143621m(PurchaseType.TYPE_SUPREME_PARTNER, Privilege.privacy_membership);
        C9166a c9166a = new C9166a(dbc0.f87124jl, a690VarM143621m.m96314t().toString(), a690VarM143621m.m96311q().toString(), "privacy");
        c9166a.m58504f(new C9166a.a() { // from class: l.th90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.C9166a.a
            /* JADX INFO: renamed from: a */
            public final void mo58505a(View view) {
                this.f174284a.m58216R(view);
            }
        });
        return c9166a;
    }

    public PrivilegeDescListSeeItem.C9159a getSeeItem() {
        PrivilegeDescListSeeItem.C9159a c9159a = new PrivilegeDescListSeeItem.C9159a();
        c9159a.m58419b(new PrivilegeDescListSeeItem.C9159a.a() { // from class: l.vh90
            @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C9159a.a
            /* JADX INFO: renamed from: a */
            public final void mo58420a(View view) {
                this.f184084a.m58217S(view);
            }
        });
        return c9159a;
    }

    public PrivilegeDescListDiamondServiceItem.C9149a getServiceItem() {
        PurchaseType purchaseType = PurchaseType.TYPE_SUPREME_PARTNER;
        a690 a690VarM143621m = j690.m143621m(purchaseType, Privilege.customer_service);
        return new PrivilegeDescListDiamondServiceItem.C9149a(a690VarM143621m.m96314t().toString(), a690VarM143621m.m96311q().toString(), purchaseType);
    }

    @Override // p153l.o290
    /* JADX INFO: renamed from: k */
    public void mo58112k(ub3 ub3Var, VipFrag vipFrag) {
        this.f38398e = vipFrag;
        m58223Z(vipFrag);
        m58213O(ub3Var, vipFrag);
    }

    @Override // p153l.o290
    /* JADX INFO: renamed from: q */
    public void mo58113q() {
        this.f38403j = true;
    }

    public PrivilegeRecyclerSupremePartnerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PrivilegeRecyclerSupremePartnerView(Context context) {
        this(context, null);
    }
}
