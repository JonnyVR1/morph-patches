package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.IntlPrivilegeSeeContent;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListImageItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListSeeItem;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p153l.c5n;
import p153l.c9c0;
import p153l.cjj;
import p153l.d79;
import p153l.dbc0;
import p153l.ezo;
import p153l.fo0;
import p153l.gzo;
import p153l.izo;
import p153l.jyb;
import p153l.lyh0;
import p153l.pf60;
import p153l.psd0;
import p153l.q3p;
import p153l.q8g0;
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
public class IntlPrivilegeSeeContent extends IntlPrivilegeRecycleView implements gzo {

    /* JADX INFO: renamed from: e */
    public izo f38730e;

    /* JADX INFO: renamed from: f */
    public VipNewUiFrag f38731f;

    /* JADX INFO: renamed from: g */
    public t5m f38732g;

    /* JADX INFO: renamed from: h */
    public q3p f38733h;

    /* JADX INFO: renamed from: i */
    public final x80 f38734i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<szo> f38735j;

    public IntlPrivilegeSeeContent(Context context) {
        super(context);
        this.f38734i = new x80();
        this.f38735j = new ArrayList<>();
        init();
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m58753J(Throwable th) {
    }

    /* JADX INFO: renamed from: Q */
    private Merchandise m58760Q(List<Merchandise> list) {
        return (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.f3p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((v5b0.m199799y(merchandise) && merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) || v5b0.m199790p(merchandise, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPrice3Month));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ C22421c m58761S(List list) {
        return cjj.m110205M(getContext(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m58762T(pf60 pf60Var) {
        m58763U((List) pf60Var.f152156a);
        q3p q3pVar = this.f38733h;
        q3pVar.f155472k = false;
        q3pVar.f155473l = false;
        if (NullChecker.m82486a(pf60Var.f152157b) && yap.m214902d().m214912m() && yap.m214902d().m214910h(ProductCategory.tttSeeWhoLikedMe)) {
            this.f38733h.f155472k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m58764X() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void m58763U(List<Merchandise> list) {
        if (NullChecker.m82486a(this.f38733h)) {
            return;
        }
        q3p q3pVar = new q3p(this.f38731f, list, null, getPurchaseType(), null);
        this.f38733h = q3pVar;
        q3pVar.m175158j();
        q3p q3pVar2 = this.f38733h;
        q3pVar2.f155468g = false;
        q3pVar2.f155469h = m58760Q(list);
        this.f38735j.add(0, this.f38733h);
        this.f38730e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.d3p
            @Override // java.lang.Runnable
            public final void run() {
                this.f84930a.m58764X();
            }
        });
        this.f38733h.f155467f.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: Z */
    private void m58766Z() {
        String string;
        String strValueOf;
        this.f38735j.clear();
        if (m58767b0()) {
            this.f38735j.add(this.f38733h);
        }
        this.f38735j.add(new IntlPrivilegeDescListSeeItem.C9184a(dbc0.f86499Qa, this.f38731f.getString(R$string.f18680Mn), q8g0.m175782N("0 " + this.f38731f.act().getString(R$string.f19839yl), this.f38731f.act().color(c9c0.f80465v1), lyh0.m156283c(3)), Privilege.see_who_likes_me, getPurchaseType()));
        if (CoreModule.f18264c.f20414p0.m219062g3()) {
            Integer numM109150F3 = CoreModule.f18264c.f20304E1.m109150F3();
            int iIntValue = numM109150F3.intValue();
            if (iIntValue >= 1000) {
                strValueOf = "999+";
                string = String.format(this.f38731f.act().getString(R$string.f19274gc), "999+");
            } else if (iIntValue > 0) {
                strValueOf = String.valueOf(iIntValue);
                string = String.format(this.f38731f.act().getString(R$string.f19274gc), numM109150F3);
            } else {
                string = this.f38731f.act().getString(R$string.f19305hc);
                strValueOf = "";
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(strValueOf);
            this.f38735j.add(new IntlPrivilegeDescListSeeItem.C9184a(dbc0.f86984fb, this.f38731f.getString(R$string.f19089ac), q8g0.m175796b0(string, arrayList, this.f38731f.act().color(c9c0.f80465v1), lyh0.m156283c(3)), Privilege.intl_visitor, getPurchaseType()));
        }
        this.f38735j.add(new IntlPrivilegeDescListImageItem.C9182a(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "https://auto.tancdn.com/v1/raw/718f9b44-b97e-4790-9852-67d6fa907e5211.webp" : "https://auto.tancdn.com/v1/raw/a0d3565f-f0b2-4f76-a14e-0e734caff55110.webp"));
        this.f38735j.add(ezo.m123392d(getPurchaseType()));
        this.f38735j.add(ezo.m123390b(this.f38731f, getPurchaseType(), null));
        this.f38730e.m142815G(this.f38735j);
    }

    /* JADX INFO: renamed from: b0 */
    private boolean m58767b0() {
        return NullChecker.m82486a(this.f38733h);
    }

    private void init() {
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: R */
    public void m58768R(c5n c5nVar, final VipNewUiFrag vipNewUiFrag) {
        C22421c c22421cObserveOn = CoreModule.f18264c.f20396j0.m31647y5(getPurchaseType().productCategory()).filter(new qcj() { // from class: l.p2p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new qcj() { // from class: l.r2p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f160960a.m58761S((List) obj);
            }
        }).observeOn(fo0.m126432a());
        if (d79.m114665X()) {
            m58704G(c5nVar, vipNewUiFrag, C22421c.combineLatest(c22421cObserveOn, yap.m214902d().m214913n().distinctUntilChanged(), new u2p()), new y20() { // from class: l.t2p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f171777a.m58762T((pf60) obj);
                }
            });
        } else {
            m58704G(c5nVar, vipNewUiFrag, c22421cObserveOn, new y20() { // from class: l.v2p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f182101a.m58763U((List) obj);
                }
            });
        }
        c5nVar.m153557n(vipNewUiFrag, CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.x2p
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192164a.m58770W(vipNewUiFrag, (User) obj);
            }
        }, new y20() { // from class: l.z2p
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlPrivilegeSeeContent.m58753J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m58769V(User user, VipNewUiFrag vipNewUiFrag, szo szoVar) {
        if (szoVar instanceof IntlPrivilegeDescListSeeItem.C9184a) {
            IntlPrivilegeDescListSeeItem.C9184a c9184a = (IntlPrivilegeDescListSeeItem.C9184a) szoVar;
            if (c9184a.f38772e == Privilege.see_who_likes_me) {
                c9184a.f38770c = q8g0.m175782N((NullChecker.m82486a(user.profile.receivedLikes) ? user.profile.receivedLikes.longValue() : 0L) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + vipNewUiFrag.act().getString(R$string.f19839yl), vipNewUiFrag.act().color(c9c0.f80465v1), lyh0.m156283c(3));
                this.f38730e.notifyItemChanged(this.f38735j.indexOf(szoVar));
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m58770W(final VipNewUiFrag vipNewUiFrag, final User user) {
        if (NullChecker.m82486a(user)) {
            jyb.m147537z(this.f38735j, new y20() { // from class: l.b3p
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f74801a.m58769V(user, vipNewUiFrag, (szo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m58771a0(PutongFrag putongFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        izo izoVar = new izo(putongFrag, this.f38732g, this);
        this.f38730e = izoVar;
        setAdapter(izoVar);
        m58766Z();
    }

    @Override // p153l.gzo
    /* JADX INFO: renamed from: b */
    public void mo58734b(int i) {
        wl40.f189637E.m137019l(Integer.valueOf(i));
    }

    @Override // p153l.gzo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_LIKERS;
    }

    @Override // p153l.gzo
    /* JADX INFO: renamed from: i */
    public void mo58736i() {
    }

    @Override // p153l.gzo
    /* JADX INFO: renamed from: y */
    public void mo58750y(c5n c5nVar, VipNewUiFrag vipNewUiFrag) {
        this.f38731f = vipNewUiFrag;
        wl40 wl40Var = new wl40(vipNewUiFrag.act(), getPurchaseType());
        this.f38732g = wl40Var;
        wl40Var.mo126112c(this.f38734i);
        m58771a0(vipNewUiFrag);
        m58768R(c5nVar, vipNewUiFrag);
    }

    public IntlPrivilegeSeeContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38734i = new x80();
        this.f38735j = new ArrayList<>();
        init();
    }

    public IntlPrivilegeSeeContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38734i = new x80();
        this.f38735j = new ArrayList<>();
        init();
    }
}
