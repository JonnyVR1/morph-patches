package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p153l.c5n;
import p153l.cjj;
import p153l.d79;
import p153l.ezo;
import p153l.fo0;
import p153l.gzo;
import p153l.izo;
import p153l.jyb;
import p153l.pf60;
import p153l.q3p;
import p153l.qcj;
import p153l.szo;
import p153l.t5m;
import p153l.u2p;
import p153l.uxj0;
import p153l.wl40;
import p153l.x80;
import p153l.y20;
import p153l.yap;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeVipContent extends IntlPrivilegeRecycleView implements gzo, IntlPrivilegeDescListItem.C9183a.a {

    /* JADX INFO: renamed from: e */
    public izo f38744e;

    /* JADX INFO: renamed from: f */
    public VipNewUiFrag f38745f;

    /* JADX INFO: renamed from: g */
    public t5m f38746g;

    /* JADX INFO: renamed from: h */
    public q3p f38747h;

    /* JADX INFO: renamed from: i */
    public final x80 f38748i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<szo> f38749j;

    /* JADX INFO: renamed from: k */
    public Privilege[] f38750k;

    public IntlPrivilegeVipContent(Context context) {
        super(context);
        this.f38748i = new x80();
        this.f38749j = new ArrayList<>();
        this.f38750k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }

    /* JADX INFO: renamed from: N */
    private Merchandise m58813N(List<Merchandise> list) {
        return (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.a6p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((v5b0.m199799y(merchandise) && merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) || v5b0.m199790p(merchandise, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPrice3Month));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ C22421c m58814P(List list) {
        return cjj.m110205M(getContext(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m58815Q(pf60 pf60Var) {
        m58816R((List) pf60Var.f152156a);
        q3p q3pVar = this.f38747h;
        q3pVar.f155472k = false;
        q3pVar.f155473l = false;
        if (NullChecker.m82486a(pf60Var.f152157b) && yap.m214902d().m214912m() && yap.m214902d().m214910h(ProductCategory.tttVip)) {
            this.f38747h.f155472k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m58817S() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void m58816R(List<Merchandise> list) {
        if (NullChecker.m82486a(this.f38747h)) {
            return;
        }
        q3p q3pVar = new q3p(this.f38745f, list, null, getPurchaseType(), null);
        this.f38747h = q3pVar;
        q3pVar.m175158j();
        q3p q3pVar2 = this.f38747h;
        q3pVar2.f155468g = false;
        q3pVar2.f155469h = m58813N(list);
        this.f38749j.add(0, this.f38747h);
        this.f38744e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.y5p
            @Override // java.lang.Runnable
            public final void run() {
                this.f197576a.m58817S();
            }
        });
        this.f38747h.f155467f.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: U */
    private void m58819U() {
        this.f38749j.clear();
        if (m58820W()) {
            this.f38749j.add(this.f38747h);
        }
        this.f38749j.add(new IntlPrivilegeDescListTitle.C9185a(getResources().getString(R$string.f19444lt), "", false, null));
        for (Privilege privilege : this.f38750k) {
            if ((IntlCountryCodeController.m29118o() || privilege != Privilege.vip_message_block_gp) && privilege != Privilege.vip_super_like) {
                IntlPrivilegeDescListItem.C9183a c9183aM123389a = ezo.m123389a(privilege, getPurchaseType());
                c9183aM123389a.m58836a(this);
                this.f38749j.add(c9183aM123389a);
            }
        }
        this.f38749j.add(ezo.m123392d(getPurchaseType()));
        this.f38749j.add(ezo.m123390b(this.f38745f, getPurchaseType(), null));
        this.f38744e.m142815G(this.f38749j);
    }

    /* JADX INFO: renamed from: W */
    private boolean m58820W() {
        return NullChecker.m82486a(this.f38747h);
    }

    private void init() {
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: O */
    public void m58821O(c5n c5nVar, VipNewUiFrag vipNewUiFrag) {
        C22421c c22421cObserveOn = CoreModule.f18264c.f20396j0.m31647y5(getPurchaseType().productCategory()).filter(new qcj() { // from class: l.q5p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new qcj() { // from class: l.s5p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f166442a.m58814P((List) obj);
            }
        }).observeOn(fo0.m126432a());
        if (d79.m114665X()) {
            m58704G(c5nVar, vipNewUiFrag, C22421c.combineLatest(c22421cObserveOn, yap.m214902d().m214913n().distinctUntilChanged(), new u2p()), new y20() { // from class: l.u5p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f177666a.m58815Q((pf60) obj);
                }
            });
        } else {
            m58704G(c5nVar, vipNewUiFrag, c22421cObserveOn, new y20() { // from class: l.w5p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f187539a.m58816R((List) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V */
    public void m58822V(PutongFrag putongFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        izo izoVar = new izo(putongFrag, this.f38746g, this);
        this.f38744e = izoVar;
        setAdapter(izoVar);
        m58819U();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem.C9183a.a
    /* JADX INFO: renamed from: a */
    public void mo58823a(View view, Privilege privilege) {
    }

    @Override // p153l.gzo
    /* JADX INFO: renamed from: b */
    public void mo58734b(int i) {
        wl40.f189637E.m137019l(Integer.valueOf(i));
    }

    @Override // p153l.gzo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_VIP;
    }

    @Override // p153l.gzo
    /* JADX INFO: renamed from: i */
    public void mo58736i() {
    }

    @Override // p153l.gzo
    /* JADX INFO: renamed from: y */
    public void mo58750y(c5n c5nVar, VipNewUiFrag vipNewUiFrag) {
        this.f38745f = vipNewUiFrag;
        wl40 wl40Var = new wl40(vipNewUiFrag.act(), getPurchaseType());
        this.f38746g = wl40Var;
        wl40Var.mo126112c(this.f38748i);
        m58822V(vipNewUiFrag);
        m58821O(c5nVar, vipNewUiFrag);
    }

    public IntlPrivilegeVipContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38748i = new x80();
        this.f38749j = new ArrayList<>();
        this.f38750k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }

    public IntlPrivilegeVipContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38748i = new x80();
        this.f38749j = new ArrayList<>();
        this.f38750k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }
}
