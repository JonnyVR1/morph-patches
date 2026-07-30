package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.LikersAct;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.C0439a;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNearbyItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListPartnerDressUpItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg.C0444a;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.VipFrag;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.NavigationCardIntent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import l.e30;
import l.fy80;
import l.mkd0;
import l.n3b0;
import l.w9j;
import p006l.dv80;
import p006l.fb3;
import p006l.it80;
import p006l.khl0;
import p006l.ku80;
import p006l.lva;
import p006l.nb90;
import p006l.qu80;
import p006l.wx80;
import p006l.x2c0;
import p006l.xma;
import p006l.zq20;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeRecyclerSupremePartnerView extends PrivilegeRecycleView implements ku80 {

    /* JADX INFO: renamed from: e */
    public VipFrag f7331e;

    /* JADX INFO: renamed from: f */
    public Privilege[] f7332f;

    /* JADX INFO: renamed from: g */
    public ArrayList<dv80> f7333g;

    /* JADX INFO: renamed from: h */
    public qu80 f7334h;

    /* JADX INFO: renamed from: i */
    public final a<d> f7335i;

    /* JADX INFO: renamed from: j */
    public boolean f7336j;

    public PrivilegeRecyclerSupremePartnerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7332f = new Privilege[]{Privilege.city_topping, Privilege.personal_customization, Privilege.mysterious_mode, Privilege.immediately_match, Privilege.nearby_people, Privilege.exclusive_dressing_up, Privilege.customer_service};
        this.f7333g = new ArrayList<>();
        this.f7335i = a.b();
        this.f7336j = false;
        init();
    }

    /* JADX INFO: renamed from: Y */
    private void m10500Y() {
        this.f7333g.clear();
        this.f7333g.add(new PrivilegeDescListTitle.C0435a("至尊合伙人特权", "查看全部", new PrivilegeDescListTitle.C0435a.a() { // from class: l.v990
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListTitle.C0435a.a
            /* JADX INFO: renamed from: a */
            public final void mo10758a(View view) {
                this.f24223a.m10507U(view);
            }
        }, PurchaseType.TYPE_SUPREME_PARTNER));
        for (Privilege privilege : this.f7332f) {
            PrivilegeDescListItem.C0424a c0424aM17027a = it80.m17027a(privilege, PurchaseType.TYPE_SUPREME_PARTNER);
            c0424aM17027a.m10603g(new PrivilegeDescListItem.C0424a.a() { // from class: l.w990
                @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem.C0424a.a
                /* JADX INFO: renamed from: a */
                public final void mo10398a(View view, Privilege privilege2) {
                    this.f25039a.m10508V(view, privilege2);
                }
            });
            this.f7333g.add(c0424aM17027a);
        }
        if (xma.m27357N3()) {
            this.f7333g.add(new PrivilegeDescListTitle.C0435a("至尊合伙人尊享", "", null, PurchaseType.TYPE_SUPREME_PARTNER));
            this.f7333g.add(getDressUpItem());
            this.f7333g.add(getMysteriousModeItem());
            this.f7333g.add(getServiceItem());
            this.f7333g.add(getNearbyItem());
            this.f7333g.add(getSeeItem());
            this.f7333g.add(getPrivacyItem());
            this.f7333g.add(getAdvancedFiltertem());
        } else {
            ArrayList arrayList = new ArrayList();
            PrivilegeDescListTitle.C0435a c0435a = new PrivilegeDescListTitle.C0435a("至尊合伙人尊享", "", null, PurchaseType.TYPE_SUPREME_PARTNER);
            arrayList.add(getDressUpItem());
            arrayList.add(getMysteriousModeItem());
            arrayList.add(getServiceItem());
            arrayList.add(getNearbyItem());
            arrayList.add(getSeeItem());
            arrayList.add(getPrivacyItem());
            arrayList.add(getAdvancedFiltertem());
            this.f7333g.add(new PrivilegeDescListNoSVipItem.C0427a(c0435a, "解锁更多会员特权", false, arrayList, new PrivilegeDescListNoSVipItem.C0427a.a() { // from class: l.x990
                @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C0427a.a
                /* JADX INFO: renamed from: a */
                public final void mo10645a(View view) {
                    this.f27396a.m10509W(view);
                }
            }));
        }
        this.f7334h.m22424J(this.f7333g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: renamed from: O */
    public void m10501O(fb3 fb3Var, VipFrag vipFrag) {
        vipFrag.duringCreated(CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("supremePartner"))).map(new w9j() { // from class: l.t990
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m27357N3());
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.u990
            public final void call(Object obj) {
                this.f23435a.m10506T((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m10502P(View view) {
        nb90.m19998b();
        zq20.m28789c(this.f7331e.act(), 1);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m10503Q(View view) {
        HashMap map = new HashMap();
        map.put("navigation_to", "nearby_people");
        this.f7331e.act().startActivity(lva.m19028g(this.f7331e.act(), NavigationCardIntent.get("supreme_sartner"), map));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m10504R(View view) {
        nb90.m20001e();
        zq20.m28789c(this.f7331e.act(), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m10505S(View view) {
        if (n3b0.q()) {
            return;
        }
        getContext().startActivity(new Intent(getContext(), (Class<?>) LikersAct.class));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m10506T(Boolean bool) {
        m10500Y();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m10507U(View view) {
        m10512a0(null);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m10508V(View view, Privilege privilege) {
        m10512a0(privilege);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m10509W(View view) {
        khl0.m18127e(this.f7331e.act());
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m10510X(PurchaseType purchaseType, Privilege privilege) {
        if (xma.m27357N3()) {
            return;
        }
        khl0.m18127e(this.f7331e.act());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public void m10511Z(VipFrag vipFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        qu80 qu80Var = new qu80(vipFrag, null, this, PurchaseType.TYPE_SUPREME_PARTNER);
        this.f7334h = qu80Var;
        setAdapter(qu80Var);
        m10500Y();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m10512a0(Privilege privilege) {
        C0444a c0444a = new C0444a(this.f7331e);
        c0444a.m10904p(PurchaseType.TYPE_SUPREME_PARTNER, new C0444a.f() { // from class: l.y990
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg.C0444a.f
            /* JADX INFO: renamed from: a */
            public final void mo10908a(PurchaseType purchaseType, Privilege privilege2) {
                this.f28080a.m10510X(purchaseType, privilege2);
            }
        });
        if (NullChecker.a(privilege)) {
            c0444a.m10903o(privilege);
        }
    }

    @Override // p006l.ku80
    /* JADX INFO: renamed from: c */
    public void mo10399c() {
        this.f7336j = false;
    }

    public C0439a getAdvancedFiltertem() {
        wx80 wx80VarM = fy80.m(PurchaseType.TYPE_SUPREME_PARTNER, Privilege.advanced_filter);
        C0439a c0439a = new C0439a(x2c0.f26366Vj, wx80VarM.m26849t().toString(), wx80VarM.m26846q().toString(), "advancing");
        c0439a.m10804f(new C0439a.a() { // from class: l.s990
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.C0439a.a
            /* JADX INFO: renamed from: a */
            public final void mo10805a(View view) {
                this.f21152a.m10502P(view);
            }
        });
        return c0439a;
    }

    public PrivilegeDescListPartnerDressUpItem.C0428a getDressUpItem() {
        PurchaseType purchaseType = PurchaseType.TYPE_SUPREME_PARTNER;
        Privilege privilege = Privilege.exclusive_dressing_up;
        wx80 wx80VarM = fy80.m(purchaseType, privilege);
        return new PrivilegeDescListPartnerDressUpItem.C0428a(wx80VarM.m26849t().toString(), wx80VarM.m26846q().toString(), privilege);
    }

    public PrivilegeDescListPartnerDressUpItem.C0428a getMysteriousModeItem() {
        PurchaseType purchaseType = PurchaseType.TYPE_SUPREME_PARTNER;
        Privilege privilege = Privilege.mysterious_mode;
        wx80 wx80VarM = fy80.m(purchaseType, privilege);
        return new PrivilegeDescListPartnerDressUpItem.C0428a(wx80VarM.m26849t().toString(), wx80VarM.m26846q().toString(), privilege);
    }

    public PrivilegeDescListNearbyItem.C0425a getNearbyItem() {
        PrivilegeDescListNearbyItem.C0425a c0425a = new PrivilegeDescListNearbyItem.C0425a();
        c0425a.m10614b(new PrivilegeDescListNearbyItem.C0425a.a() { // from class: l.q990
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNearbyItem.C0425a.a
            /* JADX INFO: renamed from: a */
            public final void mo10615a(View view) {
                this.f19678a.m10503Q(view);
            }
        });
        return c0425a;
    }

    public C0439a getPrivacyItem() {
        wx80 wx80VarM = fy80.m(PurchaseType.TYPE_SUPREME_PARTNER, Privilege.privacy_membership);
        C0439a c0439a = new C0439a(x2c0.f27191vk, wx80VarM.m26849t().toString(), wx80VarM.m26846q().toString(), "privacy");
        c0439a.m10804f(new C0439a.a() { // from class: l.p990
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.C0439a.a
            /* JADX INFO: renamed from: a */
            public final void mo10805a(View view) {
                this.f18637a.m10504R(view);
            }
        });
        return c0439a;
    }

    public PrivilegeDescListSeeItem.C0432a getSeeItem() {
        PrivilegeDescListSeeItem.C0432a c0432a = new PrivilegeDescListSeeItem.C0432a();
        c0432a.m10713b(new PrivilegeDescListSeeItem.C0432a.a() { // from class: l.r990
            @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C0432a.a
            /* JADX INFO: renamed from: a */
            public final void mo10714a(View view) {
                this.f20417a.m10505S(view);
            }
        });
        return c0432a;
    }

    public PrivilegeDescListDiamondServiceItem.C0422a getServiceItem() {
        PurchaseType purchaseType = PurchaseType.TYPE_SUPREME_PARTNER;
        wx80 wx80VarM = fy80.m(purchaseType, Privilege.customer_service);
        return new PrivilegeDescListDiamondServiceItem.C0422a(wx80VarM.m26849t().toString(), wx80VarM.m26846q().toString(), purchaseType);
    }

    @Override // p006l.ku80
    /* JADX INFO: renamed from: k */
    public void mo10400k(fb3 fb3Var, VipFrag vipFrag) {
        this.f7331e = vipFrag;
        m10511Z(vipFrag);
        m10501O(fb3Var, vipFrag);
    }

    @Override // p006l.ku80
    /* JADX INFO: renamed from: q */
    public void mo10401q() {
        this.f7336j = true;
    }

    public PrivilegeRecyclerSupremePartnerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PrivilegeRecyclerSupremePartnerView(Context context) {
        this(context, null);
    }
}
