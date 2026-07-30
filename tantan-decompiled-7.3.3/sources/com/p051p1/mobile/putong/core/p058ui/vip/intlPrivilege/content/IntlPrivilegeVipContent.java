package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import p137rx.C22421c;
import p153l.cjj;
import p153l.d5n;
import p153l.d79;
import p153l.fo0;
import p153l.fzo;
import p153l.hzo;
import p153l.jyb;
import p153l.pf60;
import p153l.qcj;
import p153l.r3p;
import p153l.t5m;
import p153l.tzo;
import p153l.u2p;
import p153l.wl40;
import p153l.x80;
import p153l.y20;
import p153l.yap;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeVipContent extends IntlPrivilegeRecycleView implements hzo, IntlPrivilegeDescListItem.C9116b.a {

    /* JADX INFO: renamed from: e */
    public C9113a f37984e;

    /* JADX INFO: renamed from: f */
    public IntlVipNewUiFrag f37985f;

    /* JADX INFO: renamed from: g */
    public t5m f37986g;

    /* JADX INFO: renamed from: h */
    public r3p f37987h;

    /* JADX INFO: renamed from: i */
    public final x80 f37988i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<tzo> f37989j;

    /* JADX INFO: renamed from: k */
    public Privilege[] f37990k;

    public IntlPrivilegeVipContent(Context context) {
        super(context);
        this.f37988i = new x80();
        this.f37989j = new ArrayList<>();
        this.f37990k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ C22421c m57656P(List list) {
        return cjj.m110205M(getContext(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m57657Q(pf60 pf60Var) {
        m57658R((List) pf60Var.f152156a);
        r3p r3pVar = this.f37987h;
        r3pVar.f161072k = false;
        r3pVar.f161073l = false;
        if (NullChecker.m82486a(pf60Var.f152157b) && yap.m214902d().m214912m() && yap.m214902d().m214910h("vip")) {
            this.f37987h.f161072k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void m57658R(List<Merchandise> list) {
        if (NullChecker.m82486a(this.f37987h)) {
            return;
        }
        r3p r3pVar = new r3p(this.f37985f, list, null, getPurchaseType(), null);
        this.f37987h = r3pVar;
        r3pVar.m179666j();
        r3p r3pVar2 = this.f37987h;
        r3pVar2.f161068g = false;
        r3pVar2.f161069h = m57662N(list);
        this.f37989j.add(0, this.f37987h);
        this.f37984e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.z5p
            @Override // java.lang.Runnable
            public final void run() {
                this.f203073a.m57664S();
            }
        });
        this.f37987h.f161067f.m137019l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: U */
    private void m57660U() {
        this.f37989j.clear();
        if (m57661W()) {
            this.f37989j.add(this.f37987h);
        }
        this.f37989j.add(new C9113a.a(getPurchaseType()));
        this.f37989j.add(fzo.m128199c(getPurchaseType()));
        if (!d79.m114668a0()) {
            this.f37989j.add(fzo.m128198b(this.f37985f, getPurchaseType(), null));
        }
        this.f37984e.m57669G(this.f37989j);
    }

    /* JADX INFO: renamed from: W */
    private boolean m57661W() {
        if (d79.m114668a0()) {
            return false;
        }
        return NullChecker.m82486a(this.f37987h);
    }

    private void init() {
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: N */
    public final Merchandise m57662N(List<Merchandise> list) {
        return (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.b6p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((v5b0.m199799y(merchandise) && merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) || v5b0.m199790p(merchandise, ProductCategory.get("vip"), MonetizationPromotionsId.lowPrice3Month));
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public void m57663O(d5n d5nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        if (d79.m114668a0()) {
            return;
        }
        C22421c c22421cObserveOn = CoreModule.f18264c.f20396j0.m31647y5(getPurchaseType().productCategory()).filter(new qcj() { // from class: l.r5p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new qcj() { // from class: l.t5p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f172220a.m57656P((List) obj);
            }
        }).observeOn(fo0.m126432a());
        if (d79.m114665X()) {
            m57543G(d5nVar, intlVipNewUiFrag, C22421c.combineLatest(c22421cObserveOn, yap.m214902d().m214913n().distinctUntilChanged(), new u2p()), new y20() { // from class: l.v5p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f182560a.m57657Q((pf60) obj);
                }
            });
        } else {
            m57543G(d5nVar, intlVipNewUiFrag, c22421cObserveOn, new y20() { // from class: l.x5p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f192509a.m57658R((List) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m57664S() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m57665V(IntlVipNewUiFrag intlVipNewUiFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        C9113a c9113a = new C9113a(intlVipNewUiFrag, this.f37986g, this);
        this.f37984e = c9113a;
        setAdapter(c9113a);
        m57660U();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem.C9116b.a
    /* JADX INFO: renamed from: a */
    public void mo57666a(View view, Privilege privilege) {
    }

    @Override // p153l.hzo
    /* JADX INFO: renamed from: b */
    public void mo57570b(int i) {
        wl40.f189637E.m137019l(Integer.valueOf(i));
    }

    @Override // p153l.hzo
    /* JADX INFO: renamed from: f */
    public void mo57571f(PurchaseType purchaseType, PurchaseType purchaseType2) {
    }

    @Override // p153l.hzo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_VIP;
    }

    @Override // p153l.hzo
    /* JADX INFO: renamed from: z */
    public void mo57590z(d5n d5nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f37985f = intlVipNewUiFrag;
        wl40 wl40Var = new wl40(intlVipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f37986g = wl40Var;
        wl40Var.mo126112c(this.f37988i);
        m57665V(intlVipNewUiFrag);
        m57663O(d5nVar, intlVipNewUiFrag);
    }

    public IntlPrivilegeVipContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37988i = new x80();
        this.f37989j = new ArrayList<>();
        this.f37990k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }

    public IntlPrivilegeVipContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37988i = new x80();
        this.f37989j = new ArrayList<>();
        this.f37990k = new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.vip_undo, Privilege.vip_membership_active_time_gp, Privilege.intl_no_ad, Privilege.vip_membership_remark_gp, Privilege.vip_membership_search_gp, Privilege.vip_location, Privilege.vip_badge, Privilege.vip_message_block_gp};
        init();
    }
}
