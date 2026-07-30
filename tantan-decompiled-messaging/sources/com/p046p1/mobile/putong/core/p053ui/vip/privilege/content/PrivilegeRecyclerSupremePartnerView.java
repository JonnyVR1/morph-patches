package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.C9003a;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNearbyItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListPartnerDressUpItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg.C9008a;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.VipFrag;
import com.p046p1.mobile.putong.data.NavigationCardIntent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import p133rx.subjects.C22392a;
import p149l.dv80;
import p149l.e30;
import p149l.fb3;
import p149l.fy80;
import p149l.it80;
import p149l.khl0;
import p149l.ku80;
import p149l.lva;
import p149l.mkd0;
import p149l.n3b0;
import p149l.nb90;
import p149l.qu80;
import p149l.w9j;
import p149l.wx80;
import p149l.x2c0;
import p149l.xma;
import p149l.zq20;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeRecyclerSupremePartnerView extends PrivilegeRecycleView implements ku80 {

    /* JADX INFO: renamed from: e */
    public VipFrag f37550e;

    /* JADX INFO: renamed from: f */
    public Privilege[] f37551f;

    /* JADX INFO: renamed from: g */
    public ArrayList<dv80> f37552g;

    /* JADX INFO: renamed from: h */
    public qu80 f37553h;

    /* JADX INFO: renamed from: i */
    public final C22392a<C8765d> f37554i;

    /* JADX INFO: renamed from: j */
    public boolean f37555j;

    public PrivilegeRecyclerSupremePartnerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37551f = new Privilege[]{Privilege.city_topping, Privilege.personal_customization, Privilege.mysterious_mode, Privilege.immediately_match, Privilege.nearby_people, Privilege.exclusive_dressing_up, Privilege.customer_service};
        this.f37552g = new ArrayList<>();
        this.f37554i = C22392a.m221512b();
        this.f37555j = false;
        init();
    }

    /* JADX INFO: renamed from: Y */
    private void m57029Y() {
        this.f37552g.clear();
        this.f37552g.add(new PrivilegeDescListTitle.C8999a("至尊合伙人特权", "查看全部", new PrivilegeDescListTitle.C8999a.a() { // from class: l.v990
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTitle.C8999a.a
            /* JADX INFO: renamed from: a */
            public final void mo57278a(View view) {
                this.f180617a.m57036U(view);
            }
        }, PurchaseType.TYPE_SUPREME_PARTNER));
        for (Privilege privilege : this.f37551f) {
            PrivilegeDescListItem.C8988a c8988aM138185a = it80.m138185a(privilege, PurchaseType.TYPE_SUPREME_PARTNER);
            c8988aM138185a.m57132g(new PrivilegeDescListItem.C8988a.a() { // from class: l.w990
                @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem.C8988a.a
                /* JADX INFO: renamed from: a */
                public final void mo56927a(View view, Privilege privilege2) {
                    this.f185319a.m57037V(view, privilege2);
                }
            });
            this.f37552g.add(c8988aM138185a);
        }
        if (xma.m210049N3()) {
            this.f37552g.add(new PrivilegeDescListTitle.C8999a("至尊合伙人尊享", "", null, PurchaseType.TYPE_SUPREME_PARTNER));
            this.f37552g.add(getDressUpItem());
            this.f37552g.add(getMysteriousModeItem());
            this.f37552g.add(getServiceItem());
            this.f37552g.add(getNearbyItem());
            this.f37552g.add(getSeeItem());
            this.f37552g.add(getPrivacyItem());
            this.f37552g.add(getAdvancedFiltertem());
        } else {
            ArrayList arrayList = new ArrayList();
            PrivilegeDescListTitle.C8999a c8999a = new PrivilegeDescListTitle.C8999a("至尊合伙人尊享", "", null, PurchaseType.TYPE_SUPREME_PARTNER);
            arrayList.add(getDressUpItem());
            arrayList.add(getMysteriousModeItem());
            arrayList.add(getServiceItem());
            arrayList.add(getNearbyItem());
            arrayList.add(getSeeItem());
            arrayList.add(getPrivacyItem());
            arrayList.add(getAdvancedFiltertem());
            this.f37552g.add(new PrivilegeDescListNoSVipItem.C8991a(c8999a, "解锁更多会员特权", false, arrayList, new PrivilegeDescListNoSVipItem.C8991a.a() { // from class: l.x990
                @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem.C8991a.a
                /* JADX INFO: renamed from: a */
                public final void mo57171a(View view) {
                    this.f191583a.m57038W(view);
                }
            }));
        }
        this.f37553h.m176580J(this.f37552g);
    }

    private void init() {
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: renamed from: O */
    public void m57030O(fb3 fb3Var, VipFrag vipFrag) {
        vipFrag.duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.supremePartner))).map(new w9j() { // from class: l.t990
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210049N3());
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.u990
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175200a.m57035T((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m57031P(View view) {
        nb90.m158764b();
        zq20.m219838c(this.f37550e.act(), 1);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m57032Q(View view) {
        HashMap map = new HashMap();
        map.put("navigation_to", "nearby_people");
        this.f37550e.act().startActivity(lva.m151851g(this.f37550e.act(), NavigationCardIntent.get(NavigationCardIntent.supreme_sartner), map));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m57033R(View view) {
        nb90.m158767e();
        zq20.m219838c(this.f37550e.act(), 2);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m57034S(View view) {
        if (n3b0.m157742q()) {
            return;
        }
        getContext().startActivity(new Intent(getContext(), (Class<?>) LikersAct.class));
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m57035T(Boolean bool) {
        m57029Y();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m57036U(View view) {
        m57041a0(null);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m57037V(View view, Privilege privilege) {
        m57041a0(privilege);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m57038W(View view) {
        khl0.m145979e(this.f37550e.act());
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m57039X(PurchaseType purchaseType, Privilege privilege) {
        if (xma.m210049N3()) {
            return;
        }
        khl0.m145979e(this.f37550e.act());
    }

    /* JADX INFO: renamed from: Z */
    public void m57040Z(VipFrag vipFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        qu80 qu80Var = new qu80(vipFrag, null, this, PurchaseType.TYPE_SUPREME_PARTNER);
        this.f37553h = qu80Var;
        setAdapter(qu80Var);
        m57029Y();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m57041a0(Privilege privilege) {
        C9008a c9008a = new C9008a(this.f37550e);
        c9008a.m57421p(PurchaseType.TYPE_SUPREME_PARTNER, new C9008a.f() { // from class: l.y990
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg.C9008a.f
            /* JADX INFO: renamed from: a */
            public final void mo57422a(PurchaseType purchaseType, Privilege privilege2) {
                this.f196941a.m57039X(purchaseType, privilege2);
            }
        });
        if (NullChecker.m81303a(privilege)) {
            c9008a.m57420o(privilege);
        }
    }

    @Override // p149l.ku80
    /* JADX INFO: renamed from: c */
    public void mo56928c() {
        this.f37555j = false;
    }

    public C9003a getAdvancedFiltertem() {
        wx80 wx80VarM123717m = fy80.m123717m(PurchaseType.TYPE_SUPREME_PARTNER, Privilege.advanced_filter);
        C9003a c9003a = new C9003a(x2c0.f189830Vj, wx80VarM123717m.m205968t().toString(), wx80VarM123717m.m205965q().toString(), "advancing");
        c9003a.m57321f(new C9003a.a() { // from class: l.s990
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.C9003a.a
            /* JADX INFO: renamed from: a */
            public final void mo57322a(View view) {
                this.f163159a.m57031P(view);
            }
        });
        return c9003a;
    }

    public PrivilegeDescListPartnerDressUpItem.C8992a getDressUpItem() {
        PurchaseType purchaseType = PurchaseType.TYPE_SUPREME_PARTNER;
        Privilege privilege = Privilege.exclusive_dressing_up;
        wx80 wx80VarM123717m = fy80.m123717m(purchaseType, privilege);
        return new PrivilegeDescListPartnerDressUpItem.C8992a(wx80VarM123717m.m205968t().toString(), wx80VarM123717m.m205965q().toString(), privilege);
    }

    public PrivilegeDescListPartnerDressUpItem.C8992a getMysteriousModeItem() {
        PurchaseType purchaseType = PurchaseType.TYPE_SUPREME_PARTNER;
        Privilege privilege = Privilege.mysterious_mode;
        wx80 wx80VarM123717m = fy80.m123717m(purchaseType, privilege);
        return new PrivilegeDescListPartnerDressUpItem.C8992a(wx80VarM123717m.m205968t().toString(), wx80VarM123717m.m205965q().toString(), privilege);
    }

    public PrivilegeDescListNearbyItem.C8989a getNearbyItem() {
        PrivilegeDescListNearbyItem.C8989a c8989a = new PrivilegeDescListNearbyItem.C8989a();
        c8989a.m57143b(new PrivilegeDescListNearbyItem.C8989a.a() { // from class: l.q990
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNearbyItem.C8989a.a
            /* JADX INFO: renamed from: a */
            public final void mo57144a(View view) {
                this.f153384a.m57032Q(view);
            }
        });
        return c8989a;
    }

    public C9003a getPrivacyItem() {
        wx80 wx80VarM123717m = fy80.m123717m(PurchaseType.TYPE_SUPREME_PARTNER, Privilege.privacy_membership);
        C9003a c9003a = new C9003a(x2c0.f190655vk, wx80VarM123717m.m205968t().toString(), wx80VarM123717m.m205965q().toString(), "privacy");
        c9003a.m57321f(new C9003a.a() { // from class: l.p990
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.C9003a.a
            /* JADX INFO: renamed from: a */
            public final void mo57322a(View view) {
                this.f147686a.m57033R(view);
            }
        });
        return c9003a;
    }

    public PrivilegeDescListSeeItem.C8996a getSeeItem() {
        PrivilegeDescListSeeItem.C8996a c8996a = new PrivilegeDescListSeeItem.C8996a();
        c8996a.m57236b(new PrivilegeDescListSeeItem.C8996a.a() { // from class: l.r990
            @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C8996a.a
            /* JADX INFO: renamed from: a */
            public final void mo57237a(View view) {
                this.f158286a.m57034S(view);
            }
        });
        return c8996a;
    }

    public PrivilegeDescListDiamondServiceItem.C8986a getServiceItem() {
        PurchaseType purchaseType = PurchaseType.TYPE_SUPREME_PARTNER;
        wx80 wx80VarM123717m = fy80.m123717m(purchaseType, Privilege.customer_service);
        return new PrivilegeDescListDiamondServiceItem.C8986a(wx80VarM123717m.m205968t().toString(), wx80VarM123717m.m205965q().toString(), purchaseType);
    }

    @Override // p149l.ku80
    /* JADX INFO: renamed from: k */
    public void mo56929k(fb3 fb3Var, VipFrag vipFrag) {
        this.f37550e = vipFrag;
        m57040Z(vipFrag);
        m57030O(fb3Var, vipFrag);
    }

    @Override // p149l.ku80
    /* JADX INFO: renamed from: q */
    public void mo56930q() {
        this.f37555j = true;
    }

    public PrivilegeRecyclerSupremePartnerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PrivilegeRecyclerSupremePartnerView(Context context) {
        this(context, null);
    }
}
