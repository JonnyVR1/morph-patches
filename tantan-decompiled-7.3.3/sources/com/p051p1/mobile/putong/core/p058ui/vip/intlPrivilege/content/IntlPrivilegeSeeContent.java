package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.IntlPrivilegeSeeContent;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListImageItem;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListSeeItem;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import p137rx.C22421c;
import p153l.c9c0;
import p153l.cjj;
import p153l.d5n;
import p153l.d79;
import p153l.fo0;
import p153l.fzo;
import p153l.hzo;
import p153l.jyb;
import p153l.lyh0;
import p153l.pf60;
import p153l.psd0;
import p153l.q8g0;
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
public class IntlPrivilegeSeeContent extends IntlPrivilegeRecycleView implements hzo {

    /* JADX INFO: renamed from: e */
    public C9113a f37970e;

    /* JADX INFO: renamed from: f */
    public IntlVipNewUiFrag f37971f;

    /* JADX INFO: renamed from: g */
    public t5m f37972g;

    /* JADX INFO: renamed from: h */
    public r3p f37973h;

    /* JADX INFO: renamed from: i */
    public final x80 f37974i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<tzo> f37975j;

    public IntlPrivilegeSeeContent(Context context) {
        super(context);
        this.f37974i = new x80();
        this.f37975j = new ArrayList<>();
        init();
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m57592H(Throwable th) {
    }

    /* JADX INFO: renamed from: Z */
    private void m57601Z() {
        this.f37975j.clear();
        if (m57602b0()) {
            this.f37975j.add(this.f37973h);
        }
        this.f37975j.add(new IntlPrivilegeDescListImageItem.C9114a(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "https://auto.tancdn.com/v1/raw/00a0703d-12dc-4a3c-927c-45fb33c4ae01.webp" : "https://auto.tancdn.com/v1/raw/25f87704-09b4-4dbb-af11-37542f464026.webp"));
        long jLongValue = 0;
        if (NullChecker.m82486a(this.f37971f)) {
            try {
                User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                if (NullChecker.m82486a(userM116600p9) && NullChecker.m82486a(userM116600p9.profile) && NullChecker.m82486a(userM116600p9.profile.receivedLikes)) {
                    jLongValue = userM116600p9.profile.receivedLikes.longValue();
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
        this.f37975j.add(new IntlPrivilegeDescListSeeItem.C9117a(this.f37971f.getString(R$string.f18680Mn), q8g0.m175782N(jLongValue + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f37971f.act().getString(R$string.f19839yl), Color.parseColor("#FE7E1D"), lyh0.m156283c(3)), Privilege.see_who_likes_me, getPurchaseType()));
        this.f37975j.add(new IntlPrivilegeUnlockBenefitsView.C9122c(getPurchaseType()));
        this.f37975j.add(fzo.m128199c(getPurchaseType()));
        if (!d79.m114668a0()) {
            this.f37975j.add(fzo.m128198b(this.f37971f, getPurchaseType(), null));
        }
        this.f37970e.m57669G(this.f37975j);
    }

    /* JADX INFO: renamed from: b0 */
    private boolean m57602b0() {
        if (d79.m114668a0()) {
            return false;
        }
        return NullChecker.m82486a(this.f37973h);
    }

    private void init() {
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: Q */
    public final Merchandise m57603Q(List<Merchandise> list) {
        return (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.h3p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((v5b0.m199799y(merchandise) && merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) || v5b0.m199790p(merchandise, ProductCategory.get("vip"), MonetizationPromotionsId.lowPrice3Month));
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m57604R(d5n d5nVar, final IntlVipNewUiFrag intlVipNewUiFrag) {
        if (d79.m114668a0()) {
            return;
        }
        C22421c c22421cObserveOn = CoreModule.f18264c.f20396j0.m31647y5(getPurchaseType().productCategory()).filter(new qcj() { // from class: l.q2p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new qcj() { // from class: l.s2p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f165905a.m57605S((List) obj);
            }
        }).observeOn(fo0.m126432a());
        if (d79.m114665X()) {
            m57543G(d5nVar, intlVipNewUiFrag, C22421c.combineLatest(c22421cObserveOn, yap.m214902d().m214913n().distinctUntilChanged(), new u2p()), new y20() { // from class: l.w2p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f186921a.m57606T((pf60) obj);
                }
            });
        } else {
            m57543G(d5nVar, intlVipNewUiFrag, c22421cObserveOn, new y20() { // from class: l.y2p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197271a.m57607U((List) obj);
                }
            });
        }
        d5nVar.m153557n(intlVipNewUiFrag, CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.a3p
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68309a.m57609W(intlVipNewUiFrag, (User) obj);
            }
        }, new y20() { // from class: l.c3p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPrivilegeSeeContent.m57592H((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ C22421c m57605S(List list) {
        return cjj.m110205M(getContext(), list);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m57606T(pf60 pf60Var) {
        m57607U((List) pf60Var.f152156a);
        r3p r3pVar = this.f37973h;
        r3pVar.f161072k = false;
        r3pVar.f161073l = false;
        if (NullChecker.m82486a(pf60Var.f152157b) && yap.m214902d().m214912m() && yap.m214902d().m214910h("seeWhoLikedMe")) {
            this.f37973h.f161072k = true;
        }
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m57608V(User user, IntlVipNewUiFrag intlVipNewUiFrag, tzo tzoVar) {
        if (tzoVar instanceof IntlPrivilegeDescListSeeItem.C9117a) {
            IntlPrivilegeDescListSeeItem.C9117a c9117a = (IntlPrivilegeDescListSeeItem.C9117a) tzoVar;
            if (c9117a.f38018c == Privilege.see_who_likes_me) {
                c9117a.f38020e = q8g0.m175782N((NullChecker.m82486a(user.profile.receivedLikes) ? user.profile.receivedLikes.longValue() : 0L) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + intlVipNewUiFrag.act().getString(R$string.f19839yl), intlVipNewUiFrag.act().color(c9c0.f80465v1), lyh0.m156283c(3));
                this.f37970e.notifyItemChanged(this.f37975j.indexOf(tzoVar));
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m57609W(final IntlVipNewUiFrag intlVipNewUiFrag, final User user) {
        if (NullChecker.m82486a(user)) {
            jyb.m147537z(this.f37975j, new y20() { // from class: l.e3p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f91985a.m57608V(user, intlVipNewUiFrag, (tzo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m57610X() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void m57607U(List<Merchandise> list) {
        if (NullChecker.m82486a(this.f37973h)) {
            return;
        }
        r3p r3pVar = new r3p(this.f37971f, list, null, getPurchaseType(), null);
        this.f37973h = r3pVar;
        r3pVar.m179666j();
        r3p r3pVar2 = this.f37973h;
        r3pVar2.f161068g = false;
        r3pVar2.f161069h = m57603Q(list);
        this.f37975j.add(0, this.f37973h);
        this.f37970e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.g3p
            @Override // java.lang.Runnable
            public final void run() {
                this.f102014a.m57610X();
            }
        });
        this.f37973h.f161067f.m137019l(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: a0 */
    public void m57612a0(IntlVipNewUiFrag intlVipNewUiFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        C9113a c9113a = new C9113a(intlVipNewUiFrag, this.f37972g, this);
        this.f37970e = c9113a;
        setAdapter(c9113a);
        m57601Z();
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
        return PurchaseType.TYPE_GET_LIKERS;
    }

    @Override // p153l.hzo
    /* JADX INFO: renamed from: z */
    public void mo57590z(d5n d5nVar, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f37971f = intlVipNewUiFrag;
        wl40 wl40Var = new wl40(intlVipNewUiFrag.act(), getPurchaseType(), "form_sub");
        this.f37972g = wl40Var;
        wl40Var.mo126112c(this.f37974i);
        m57612a0(intlVipNewUiFrag);
        m57604R(d5nVar, intlVipNewUiFrag);
    }

    public IntlPrivilegeSeeContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37974i = new x80();
        this.f37975j = new ArrayList<>();
        init();
    }

    public IntlPrivilegeSeeContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37974i = new x80();
        this.f37975j = new ArrayList<>();
        init();
    }
}
