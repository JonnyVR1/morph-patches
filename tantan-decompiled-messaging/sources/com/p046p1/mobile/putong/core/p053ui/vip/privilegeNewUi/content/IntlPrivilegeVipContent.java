package com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p149l.b90;
import p149l.c3m;
import p149l.c3n;
import p149l.e30;
import p149l.exo;
import p149l.gxo;
import p149l.id40;
import p149l.igj;
import p149l.ixo;
import p149l.j760;
import p149l.jo0;
import p149l.q1p;
import p149l.roj0;
import p149l.sxo;
import p149l.u0p;
import p149l.u59;
import p149l.vwb;
import p149l.w9j;
import p149l.y8p;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeVipContent extends IntlPrivilegeRecycleView implements gxo, IntlPrivilegeDescListItem.C9020a.a {

    /* JADX INFO: renamed from: e */
    public ixo f37896e;

    /* JADX INFO: renamed from: f */
    public VipNewUiFrag f37897f;

    /* JADX INFO: renamed from: g */
    public c3m f37898g;

    /* JADX INFO: renamed from: h */
    public q1p f37899h;

    /* JADX INFO: renamed from: i */
    public final b90 f37900i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<sxo> f37901j;

    /* JADX INFO: renamed from: k */
    public Privilege[] f37902k;

    public IntlPrivilegeVipContent(Context context) {
        super(context);
        this.f37900i = new b90();
        this.f37901j = new ArrayList<>();
        this.f37902k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }

    /* JADX INFO: renamed from: N */
    private Merchandise m57630N(List<Merchandise> list) {
        return (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.a4p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((rxa0.m181504y(merchandise) && merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) || rxa0.m181495p(merchandise, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPrice3Month));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ C22306c m57631P(List list) {
        return igj.m136009M(getContext(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m57632Q(j760 j760Var) {
        m57633R((List) j760Var.f116564a);
        q1p q1pVar = this.f37899h;
        q1pVar.f152152k = false;
        q1pVar.f152153l = false;
        if (NullChecker.m81303a(j760Var.f116565b) && y8p.m213413d().m213423m() && y8p.m213413d().m213421h(ProductCategory.tttVip)) {
            this.f37899h.f152152k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m57634S() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void m57633R(List<Merchandise> list) {
        if (NullChecker.m81303a(this.f37899h)) {
            return;
        }
        q1p q1pVar = new q1p(this.f37897f, list, null, getPurchaseType(), null);
        this.f37899h = q1pVar;
        q1pVar.m172410j();
        q1p q1pVar2 = this.f37899h;
        q1pVar2.f152148g = false;
        q1pVar2.f152149h = m57630N(list);
        this.f37901j.add(0, this.f37899h);
        this.f37896e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.y3p
            @Override // java.lang.Runnable
            public final void run() {
                this.f195839a.m57634S();
            }
        });
        this.f37899h.f152147f.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: U */
    private void m57636U() {
        this.f37901j.clear();
        if (m57637W()) {
            this.f37901j.add(this.f37899h);
        }
        this.f37901j.add(new IntlPrivilegeDescListTitle.C9022a(getResources().getString(R$string.f18015Os), "", false, null));
        for (Privilege privilege : this.f37902k) {
            if ((IntlCountryCodeController.m28119o() || privilege != Privilege.vip_message_block_gp) && privilege != Privilege.vip_super_like) {
                IntlPrivilegeDescListItem.C9020a c9020aM118682a = exo.m118682a(privilege, getPurchaseType());
                c9020aM118682a.m57653a(this);
                this.f37901j.add(c9020aM118682a);
            }
        }
        this.f37901j.add(exo.m118685d(getPurchaseType()));
        this.f37901j.add(exo.m118683b(this.f37897f, getPurchaseType(), null));
        this.f37896e.m138877G(this.f37901j);
    }

    /* JADX INFO: renamed from: W */
    private boolean m57637W() {
        return NullChecker.m81303a(this.f37899h);
    }

    private void init() {
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: O */
    public void m57638O(c3n c3nVar, VipNewUiFrag vipNewUiFrag) {
        C22306c c22306cObserveOn = CoreModule.f17545c.f19654j0.m30644y5(getPurchaseType().productCategory()).filter(new w9j() { // from class: l.q3p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.s3p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f162183a.m57631P((List) obj);
            }
        }).observeOn(jo0.m142408a());
        if (u59.m191814W()) {
            m57521G(c3nVar, vipNewUiFrag, C22306c.combineLatest(c22306cObserveOn, y8p.m213413d().m213424n().distinctUntilChanged(), new u0p()), new e30() { // from class: l.u3p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f173642a.m57632Q((j760) obj);
                }
            });
        } else {
            m57521G(c3nVar, vipNewUiFrag, c22306cObserveOn, new e30() { // from class: l.w3p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f184420a.m57633R((List) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V */
    public void m57639V(PutongFrag putongFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        ixo ixoVar = new ixo(putongFrag, this.f37898g, this);
        this.f37896e = ixoVar;
        setAdapter(ixoVar);
        m57636U();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem.C9020a.a
    /* JADX INFO: renamed from: a */
    public void mo57640a(View view, Privilege privilege) {
    }

    @Override // p149l.gxo
    /* JADX INFO: renamed from: b */
    public void mo57551b(int i) {
        id40.f112518E.m132487l(Integer.valueOf(i));
    }

    @Override // p149l.gxo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_VIP;
    }

    @Override // p149l.gxo
    /* JADX INFO: renamed from: i */
    public void mo57553i() {
    }

    @Override // p149l.gxo
    /* JADX INFO: renamed from: y */
    public void mo57567y(c3n c3nVar, VipNewUiFrag vipNewUiFrag) {
        this.f37897f = vipNewUiFrag;
        id40 id40Var = new id40(vipNewUiFrag.act(), getPurchaseType());
        this.f37898g = id40Var;
        id40Var.mo105094c(this.f37900i);
        m57639V(vipNewUiFrag);
        m57638O(c3nVar, vipNewUiFrag);
    }

    public IntlPrivilegeVipContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37900i = new b90();
        this.f37901j = new ArrayList<>();
        this.f37902k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }

    public IntlPrivilegeVipContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37900i = new b90();
        this.f37901j = new ArrayList<>();
        this.f37902k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }
}
