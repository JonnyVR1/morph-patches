package com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.IntlPrivilegeSeeContent;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListImageItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListSeeItem;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p149l.b90;
import p149l.c3m;
import p149l.c3n;
import p149l.e30;
import p149l.eqh0;
import p149l.exo;
import p149l.gxo;
import p149l.i0g0;
import p149l.id40;
import p149l.igj;
import p149l.ixo;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;
import p149l.q1p;
import p149l.roj0;
import p149l.sxo;
import p149l.u0p;
import p149l.u59;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.x2c0;
import p149l.y8p;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeSeeContent extends IntlPrivilegeRecycleView implements gxo {

    /* JADX INFO: renamed from: e */
    public ixo f37882e;

    /* JADX INFO: renamed from: f */
    public VipNewUiFrag f37883f;

    /* JADX INFO: renamed from: g */
    public c3m f37884g;

    /* JADX INFO: renamed from: h */
    public q1p f37885h;

    /* JADX INFO: renamed from: i */
    public final b90 f37886i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<sxo> f37887j;

    public IntlPrivilegeSeeContent(Context context) {
        super(context);
        this.f37886i = new b90();
        this.f37887j = new ArrayList<>();
        init();
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m57570J(Throwable th) {
    }

    /* JADX INFO: renamed from: Q */
    private Merchandise m57577Q(List<Merchandise> list) {
        return (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.f1p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((rxa0.m181504y(merchandise) && merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) || rxa0.m181495p(merchandise, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPrice3Month));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ C22306c m57578S(List list) {
        return igj.m136009M(getContext(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m57579T(j760 j760Var) {
        m57580U((List) j760Var.f116564a);
        q1p q1pVar = this.f37885h;
        q1pVar.f152152k = false;
        q1pVar.f152153l = false;
        if (NullChecker.m81303a(j760Var.f116565b) && y8p.m213413d().m213423m() && y8p.m213413d().m213421h(ProductCategory.tttSeeWhoLikedMe)) {
            this.f37885h.f152152k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m57581X() {
        if (getScrollState() == 0) {
            scrollToPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void m57580U(List<Merchandise> list) {
        if (NullChecker.m81303a(this.f37885h)) {
            return;
        }
        q1p q1pVar = new q1p(this.f37883f, list, null, getPurchaseType(), null);
        this.f37885h = q1pVar;
        q1pVar.m172410j();
        q1p q1pVar2 = this.f37885h;
        q1pVar2.f152148g = false;
        q1pVar2.f152149h = m57577Q(list);
        this.f37887j.add(0, this.f37885h);
        this.f37882e.notifyItemInserted(0);
        post(new Runnable() { // from class: l.d1p
            @Override // java.lang.Runnable
            public final void run() {
                this.f83285a.m57581X();
            }
        });
        this.f37885h.f152147f.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: Z */
    private void m57583Z() {
        String string;
        String strValueOf;
        this.f37887j.clear();
        if (m57584b0()) {
            this.f37887j.add(this.f37885h);
        }
        this.f37887j.add(new IntlPrivilegeDescListSeeItem.C9021a(x2c0.f189635Pa, this.f37883f.getString(R$string.f18862qn), i0g0.m133847N("0 " + this.f37883f.act().getString(R$string.f18430cl), this.f37883f.act().color(w0c0.f183892u1), eqh0.m117752c(3)), Privilege.see_who_likes_me, getPurchaseType()));
        if (CoreModule.f17545c.f19672p0.m173359g3()) {
            Integer numM187831F3 = CoreModule.f17545c.f19562E1.m187831F3();
            int iIntValue = numM187831F3.intValue();
            if (iIntValue >= 1000) {
                strValueOf = "999+";
                string = String.format(this.f37883f.act().getString(R$string.f18088Rb), "999+");
            } else if (iIntValue > 0) {
                strValueOf = String.valueOf(iIntValue);
                string = String.format(this.f37883f.act().getString(R$string.f18088Rb), numM187831F3);
            } else {
                string = this.f37883f.act().getString(R$string.f18118Sb);
                strValueOf = "";
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(strValueOf);
            this.f37887j.add(new IntlPrivilegeDescListSeeItem.C9021a(x2c0.f190104eb, this.f37883f.getString(R$string.f17908Lb), i0g0.m133861b0(string, arrayList, this.f37883f.act().color(w0c0.f183892u1), eqh0.m117752c(3)), Privilege.intl_visitor, getPurchaseType()));
        }
        this.f37887j.add(new IntlPrivilegeDescListImageItem.C9019a(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "https://auto.tancdn.com/v1/raw/718f9b44-b97e-4790-9852-67d6fa907e5211.webp" : "https://auto.tancdn.com/v1/raw/a0d3565f-f0b2-4f76-a14e-0e734caff55110.webp"));
        this.f37887j.add(exo.m118685d(getPurchaseType()));
        this.f37887j.add(exo.m118683b(this.f37883f, getPurchaseType(), null));
        this.f37882e.m138877G(this.f37887j);
    }

    /* JADX INFO: renamed from: b0 */
    private boolean m57584b0() {
        return NullChecker.m81303a(this.f37885h);
    }

    private void init() {
        setOverScrollMode(2);
    }

    /* JADX INFO: renamed from: R */
    public void m57585R(c3n c3nVar, final VipNewUiFrag vipNewUiFrag) {
        C22306c c22306cObserveOn = CoreModule.f17545c.f19654j0.m30644y5(getPurchaseType().productCategory()).filter(new w9j() { // from class: l.p0p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.r0p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f157185a.m57578S((List) obj);
            }
        }).observeOn(jo0.m142408a());
        if (u59.m191814W()) {
            m57521G(c3nVar, vipNewUiFrag, C22306c.combineLatest(c22306cObserveOn, y8p.m213413d().m213424n().distinctUntilChanged(), new u0p()), new e30() { // from class: l.t0p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167202a.m57579T((j760) obj);
                }
            });
        } else {
            m57521G(c3nVar, vipNewUiFrag, c22306cObserveOn, new e30() { // from class: l.v0p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f179134a.m57580U((List) obj);
                }
            });
        }
        c3nVar.m115452n(vipNewUiFrag, CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.x0p
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188985a.m57587W(vipNewUiFrag, (User) obj);
            }
        }, new e30() { // from class: l.z0p
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlPrivilegeSeeContent.m57570J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m57586V(User user, VipNewUiFrag vipNewUiFrag, sxo sxoVar) {
        if (sxoVar instanceof IntlPrivilegeDescListSeeItem.C9021a) {
            IntlPrivilegeDescListSeeItem.C9021a c9021a = (IntlPrivilegeDescListSeeItem.C9021a) sxoVar;
            if (c9021a.f37924e == Privilege.see_who_likes_me) {
                c9021a.f37922c = i0g0.m133847N((NullChecker.m81303a(user.profile.receivedLikes) ? user.profile.receivedLikes.longValue() : 0L) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + vipNewUiFrag.act().getString(R$string.f18430cl), vipNewUiFrag.act().color(w0c0.f183892u1), eqh0.m117752c(3));
                this.f37882e.notifyItemChanged(this.f37887j.indexOf(sxoVar));
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m57587W(final VipNewUiFrag vipNewUiFrag, final User user) {
        if (NullChecker.m81303a(user)) {
            vwb.m200354z(this.f37887j, new e30() { // from class: l.b1p
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f72615a.m57586V(user, vipNewUiFrag, (sxo) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m57588a0(PutongFrag putongFrag) {
        setLayoutManager(new LinearLayoutManager(getContext()));
        ixo ixoVar = new ixo(putongFrag, this.f37884g, this);
        this.f37882e = ixoVar;
        setAdapter(ixoVar);
        m57583Z();
    }

    @Override // p149l.gxo
    /* JADX INFO: renamed from: b */
    public void mo57551b(int i) {
        id40.f112518E.m132487l(Integer.valueOf(i));
    }

    @Override // p149l.gxo
    public PurchaseType getPurchaseType() {
        return PurchaseType.TYPE_GET_LIKERS;
    }

    @Override // p149l.gxo
    /* JADX INFO: renamed from: i */
    public void mo57553i() {
    }

    @Override // p149l.gxo
    /* JADX INFO: renamed from: y */
    public void mo57567y(c3n c3nVar, VipNewUiFrag vipNewUiFrag) {
        this.f37883f = vipNewUiFrag;
        id40 id40Var = new id40(vipNewUiFrag.act(), getPurchaseType());
        this.f37884g = id40Var;
        id40Var.mo105094c(this.f37886i);
        m57588a0(vipNewUiFrag);
        m57585R(c3nVar, vipNewUiFrag);
    }

    public IntlPrivilegeSeeContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37886i = new b90();
        this.f37887j = new ArrayList<>();
        init();
    }

    public IntlPrivilegeSeeContent(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37886i = new b90();
        this.f37887j = new ArrayList<>();
        init();
    }
}
