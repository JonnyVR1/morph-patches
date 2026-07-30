package com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.IntlPrivilegeSeeContent;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListImageItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListSeeItem;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.eqh0;
import l.i0g0;
import l.igj;
import l.j760;
import l.jo0;
import l.mkd0;
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
import p006l.w0c0;
import p006l.x2c0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeSeeContent extends IntlPrivilegeRecycleView implements gxo {

    /* JADX INFO: renamed from: e */
    public ixo f7663e;

    /* JADX INFO: renamed from: f */
    public VipNewUiFrag f7664f;

    /* JADX INFO: renamed from: g */
    public c3m f7665g;

    /* JADX INFO: renamed from: h */
    public q1p f7666h;

    /* JADX INFO: renamed from: i */
    public final b90 f7667i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<sxo> f7668j;

    public IntlPrivilegeSeeContent(Context context) {
        super(context);
        this.f7667i = new b90();
        this.f7668j = new ArrayList<>();
        init();
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m11062J(Throwable th) {
    }

    /* JADX INFO: renamed from: Q */
    private Merchandise m11069Q(List<Merchandise> list) {
        return (Merchandise) vwb.r(list, new w9j() { // from class: l.f1p
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((rxa0.y(merchandise) && merchandise.isBelongPromotion("lowPriceCustomerVIP")) || rxa0.p(merchandise, ProductCategory.get("tttVip"), "lowPrice3Month"));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ c m11070S(List list) {
        return igj.M(getContext(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m11071T(j760 j760Var) {
        m11072U((List) j760Var.a);
        q1p q1pVar = this.f7666h;
        q1pVar.f19525k = false;
        q1pVar.f19526l = false;
        if (NullChecker.a(j760Var.b) && y8p.d().m() && y8p.d().h("tttSeeWhoLikedMe")) {
            this.f7666h.f19525k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m11073X() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void m11072U(List<Merchandise> list) {
        if (NullChecker.a(this.f7666h)) {
            return;
        }
        q1p q1pVar = new q1p(this.f7664f, list, null, getPurchaseType(), null);
        this.f7666h = q1pVar;
        q1pVar.m21928j();
        q1p q1pVar2 = this.f7666h;
        q1pVar2.f19521g = false;
        q1pVar2.f19522h = m11069Q(list);
        this.f7668j.add(0, this.f7666h);
        this.f7663e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.d1p
            @Override // java.lang.Runnable
            public final void run() {
                this.f9980a.m11073X();
            }
        });
        this.f7666h.f19520f.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: Z */
    private void m11075Z() {
        String string;
        String strValueOf;
        this.f7668j.clear();
        if (m11076b0()) {
            this.f7668j.add(this.f7666h);
        }
        this.f7668j.add(new IntlPrivilegeDescListSeeItem.C0457a(x2c0.f26171Pa, this.f7664f.getString(R$string.f2851qn), i0g0.N("0 " + this.f7664f.act().getString(R$string.f2419cl), this.f7664f.act().color(w0c0.f24732u1), eqh0.c(3)), Privilege.see_who_likes_me, getPurchaseType()));
        if (CoreModule.f1534c.f3661p0.m21963g3()) {
            Integer numM24585F3 = CoreModule.f1534c.f3551E1.m24585F3();
            int iIntValue = numM24585F3.intValue();
            if (iIntValue >= 1000) {
                strValueOf = "999+";
                string = String.format(this.f7664f.act().getString(R$string.f2077Rb), "999+");
            } else if (iIntValue > 0) {
                strValueOf = String.valueOf(iIntValue);
                string = String.format(this.f7664f.act().getString(R$string.f2077Rb), numM24585F3);
            } else {
                string = this.f7664f.act().getString(R$string.f2107Sb);
                strValueOf = "";
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(strValueOf);
            this.f7668j.add(new IntlPrivilegeDescListSeeItem.C0457a(x2c0.f26640eb, this.f7664f.getString(R$string.f1897Lb), i0g0.b0(string, arrayList, this.f7664f.act().color(w0c0.f24732u1), eqh0.c(3)), Privilege.intl_visitor, getPurchaseType()));
        }
        this.f7668j.add(new IntlPrivilegeDescListImageItem.C0455a(CoreModule.f1534c.f3628e0.m21490p9().isFemale() ? "https://auto.tancdn.com/v1/raw/718f9b44-b97e-4790-9852-67d6fa907e5211.webp" : "https://auto.tancdn.com/v1/raw/a0d3565f-f0b2-4f76-a14e-0e734caff55110.webp"));
        this.f7668j.add(exo.m14922d(getPurchaseType()));
        this.f7668j.add(exo.m14920b(this.f7664f, getPurchaseType(), null));
        this.f7663e.m17147G(this.f7668j);
    }

    /* JADX INFO: renamed from: b0 */
    private boolean m11076b0() {
        return NullChecker.a(this.f7666h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: R */
    public void m11077R(c3n c3nVar, final VipNewUiFrag vipNewUiFrag) {
        c cVarObserveOn = CoreModule.f1534c.f3643j0.m2572y5(getPurchaseType().productCategory()).filter(new w9j() { // from class: l.p0p
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.r0p
            public final Object call(Object obj) {
                return this.f20218a.m11070S((List) obj);
            }
        }).observeOn(jo0.a());
        if (u59.m24985W()) {
            m11013G(c3nVar, vipNewUiFrag, c.combineLatest(cVarObserveOn, y8p.d().n().distinctUntilChanged(), new u0p()), new e30() { // from class: l.t0p
                public final void call(Object obj) {
                    this.f21797a.m11071T((j760) obj);
                }
            });
        } else {
            m11013G(c3nVar, vipNewUiFrag, cVarObserveOn, new e30() { // from class: l.v0p
                public final void call(Object obj) {
                    this.f23871a.m11072U((List) obj);
                }
            });
        }
        c3nVar.n(vipNewUiFrag, CoreModule.f1534c.f3628e0.m21486o9()).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.x0p
            public final void call(Object obj) {
                this.f25663a.m11079W(vipNewUiFrag, (User) obj);
            }
        }, new e30() { // from class: l.z0p
            public final void call(Object obj) {
                IntlPrivilegeSeeContent.m11062J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m11078V(User user, VipNewUiFrag vipNewUiFrag, sxo sxoVar) {
        if (sxoVar instanceof IntlPrivilegeDescListSeeItem.C0457a) {
            IntlPrivilegeDescListSeeItem.C0457a c0457a = (IntlPrivilegeDescListSeeItem.C0457a) sxoVar;
            if (c0457a.f7705e == Privilege.see_who_likes_me) {
                c0457a.f7703c = i0g0.N((NullChecker.a(user.profile.receivedLikes) ? user.profile.receivedLikes.longValue() : 0L) + " " + vipNewUiFrag.act().getString(R$string.f2419cl), vipNewUiFrag.act().color(w0c0.f24732u1), eqh0.c(3));
                this.f7663e.notifyItemChanged(this.f7668j.indexOf(sxoVar));
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m11079W(final VipNewUiFrag vipNewUiFrag, final User user) {
        if (NullChecker.a(user)) {
            vwb.z(this.f7668j, new e30() { // from class: l.b1p
                public final void call(Object obj) {
                    this.f8669a.m11078V(user, vipNewUiFrag, (sxo) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public void m11080a0(PutongFrag putongFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        ixo ixoVar = new ixo(putongFrag, this.f7665g, this);
        this.f7663e = ixoVar;
        setAdapter(ixoVar);
        m11075Z();
    }

    @Override // p006l.gxo
    /* JADX INFO: renamed from: b */
    public void mo11043b(int i) {
        id40.f14364E.onNext(Integer.valueOf(i));
    }

    @Override // p006l.gxo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_LIKERS;
    }

    @Override // p006l.gxo
    /* JADX INFO: renamed from: i */
    public void mo11045i() {
    }

    @Override // p006l.gxo
    /* JADX INFO: renamed from: y */
    public void mo11059y(c3n c3nVar, VipNewUiFrag vipNewUiFrag) {
        this.f7664f = vipNewUiFrag;
        id40 id40Var = new id40(vipNewUiFrag.act(), getPurchaseType());
        this.f7665g = id40Var;
        id40Var.mo13100c(this.f7667i);
        m11080a0(vipNewUiFrag);
        m11077R(c3nVar, vipNewUiFrag);
    }

    public IntlPrivilegeSeeContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7667i = new b90();
        this.f7668j = new ArrayList<>();
        init();
    }

    public IntlPrivilegeSeeContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7667i = new b90();
        this.f7668j = new ArrayList<>();
        init();
    }
}
