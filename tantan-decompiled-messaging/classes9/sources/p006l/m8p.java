package p006l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p000p1.mobile.putong.core.p004ui.active.IntlRecallMembershipCard;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.AffiliateProducts;
import com.p1.mobile.putong.core.data.IntlInsertCardData;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RecallMembershipData;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.e30;
import l.eyl;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.ogw;
import l.ool0;
import l.t7m;
import l.vwb;
import l.w9j;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0015H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0015H\u0002¢\u0006\u0004\b/\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u00104\u001a\u0004\b5\u00106R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u00108R\u0014\u0010;\u001a\u00020)8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010:R\u0014\u0010<\u001a\u00020)8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010:R\u0014\u0010=\u001a\u00020)8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010:R\u0014\u0010>\u001a\u00020)8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010:R\u0016\u0010A\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Ll/m8p;", "Ll/ool0;", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "data", "<init>", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/IntlInsertCardData;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", "view", "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/data/RecallMembershipData;", "u", "(Lcom/p1/mobile/putong/core/data/RecallMembershipData;)Z", "", "sku", "r", "(Ljava/lang/String;)V", "t", "()V", "s", "a", "Ll/eyl;", "getFrag", "()Ll/eyl;", "Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "getData", "()Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "Lcom/p1/mobile/putong/core/ui/active/IntlRecallMembershipCard;", "Lcom/p1/mobile/putong/core/ui/active/IntlRecallMembershipCard;", "recallMembershipCard", "Ljava/lang/String;", "TAG", "DEALER", "E_INTL_MEMBERSHIP_CALLBACK_BUTTON", "INTL_VAS_SKU", "h", "Z", "purchaseSuc", "card_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class m8p implements ool0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final eyl frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final IntlInsertCardData data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public IntlRecallMembershipCard recallMembershipCard;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String DEALER;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String E_INTL_MEMBERSHIP_CALLBACK_BUTTON;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final String INTL_VAS_SKU;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean purchaseSuc;

    public m8p(@NotNull eyl eylVar, @Nullable IntlInsertCardData intlInsertCardData) {
        eylVar.getClass();
        this.frag = eylVar;
        this.data = intlInsertCardData;
        this.TAG = "IntlRecallMembershipAdapter";
        this.DEALER = "dealer";
        this.E_INTL_MEMBERSHIP_CALLBACK_BUTTON = "e_intl_membership_callback_button";
        this.INTL_VAS_SKU = "intl_vas_sku";
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m19169h(List list) {
        return Boolean.valueOf(!vwb.J(list));
    }

    /* JADX INFO: renamed from: i */
    public static c m19170i(ProductCategory productCategory, ProductCategory productCategory2) {
        return CoreModule.f1534c.f3643j0.m2572y5(productCategory);
    }

    /* JADX INFO: renamed from: k */
    public static void m19172k(m8p m8pVar) {
        String str = m8pVar.TAG;
    }

    /* JADX INFO: renamed from: l */
    public static Boolean m19173l(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static c m19174m(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static void m19175n(m8p m8pVar) {
        String str = m8pVar.TAG;
        m8pVar.purchaseSuc = true;
        m8pVar.frag.b3(SwipeDirection.RIGHT, true);
    }

    /* JADX INFO: renamed from: o */
    public static void m19176o(m8p m8pVar, Throwable th) {
        String str = m8pVar.TAG;
        th.getMessage();
    }

    /* JADX INFO: renamed from: p */
    public static void m19177p(m8p m8pVar, RecallMembershipData recallMembershipData, List list) {
        String productId;
        Object next;
        StockKeepUnit stockKeepUnit;
        AffiliateProducts affiliateProducts;
        list.getClass();
        Iterator it = list.iterator();
        do {
            productId = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!TextUtils.equals(String.valueOf(((Merchandise) next).quantity), recallMembershipData.quantity));
        Merchandise merchandise = (Merchandise) next;
        if (merchandise == null && !vwb.J(list)) {
            merchandise = (Merchandise) CollectionsKt.last(list);
        }
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            productId = affiliateProducts.getProductId();
        }
        m8pVar.m19185r(productId);
    }

    /* JADX INFO: renamed from: q */
    public static final void m19178q(m8p m8pVar, RecallMembershipData recallMembershipData) {
        if (m8pVar.m19188u(recallMembershipData)) {
            return;
        }
        m8pVar.purchaseSuc = true;
        m8pVar.frag.V(SwipeDirection.RIGHT);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public View m19181d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(i6c0.f14251l, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m19182e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
        IntlRecallMembershipCard intlRecallMembershipCard;
        IntlInsertCardData intlInsertCardData;
        final RecallMembershipData recallMembershipData;
        view.getClass();
        cardType.getClass();
        IntlRecallMembershipCard intlRecallMembershipCard2 = this.recallMembershipCard;
        IntlRecallMembershipCard intlRecallMembershipCard3 = null;
        if (intlRecallMembershipCard2 == null) {
            intlRecallMembershipCard = (IntlRecallMembershipCard) view;
            this.recallMembershipCard = intlRecallMembershipCard;
            intlInsertCardData = this.data;
            if (intlInsertCardData != null && (recallMembershipData = intlInsertCardData.recallMembership) != null) {
                if (intlRecallMembershipCard == null) {
                    Intrinsics.r("recallMembershipCard");
                    intlRecallMembershipCard = null;
                }
                intlRecallMembershipCard.m7175j0(this.frag, recallMembershipData, new d30() { // from class: l.d8p
                    public final void call() {
                        m8p.m19178q(this.f10067a, recallMembershipData);
                    }
                });
            }
        } else {
            if (intlRecallMembershipCard2 == null) {
                Intrinsics.r("recallMembershipCard");
                intlRecallMembershipCard2 = null;
            }
            if (!Intrinsics.d(intlRecallMembershipCard2, view)) {
                intlRecallMembershipCard = (IntlRecallMembershipCard) view;
                this.recallMembershipCard = intlRecallMembershipCard;
                intlInsertCardData = this.data;
                if (intlInsertCardData != null) {
                    if (intlRecallMembershipCard == null) {
                        Intrinsics.r("recallMembershipCard");
                        intlRecallMembershipCard = null;
                    }
                    intlRecallMembershipCard.m7175j0(this.frag, recallMembershipData, new d30() { // from class: l.d8p
                        public final void call() {
                            m8p.m19178q(this.f10067a, recallMembershipData);
                        }
                    });
                }
            }
        }
        if (position == 0) {
            m19187t();
            CoreModule.f1534c.f3652m0.f3397e2.m6143F3();
            IntlRecallMembershipCard intlRecallMembershipCard4 = this.recallMembershipCard;
            if (intlRecallMembershipCard4 == null) {
                Intrinsics.r("recallMembershipCard");
            } else {
                intlRecallMembershipCard3 = intlRecallMembershipCard4;
            }
            intlRecallMembershipCard3.setOnSwipe(false);
            boolean zM21v = IntlCountryCodeController.m21v();
            eyl eylVar = this.frag;
            if (zM21v) {
                eylVar.F3();
            } else {
                eylVar.O3();
                this.frag.J0();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m19183f() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m19184g(@NotNull SwipeDirection swipeDirection, @NotNull t7m card) {
        IntlInsertCardData intlInsertCardData;
        RecallMembershipData recallMembershipData;
        swipeDirection.getClass();
        card.getClass();
        if ((swipeDirection.getValue() == SwipeDirection.RIGHT.getValue() || swipeDirection.getValue() == SwipeDirection.UP.getValue()) && (intlInsertCardData = this.data) != null && (recallMembershipData = intlInsertCardData.recallMembership) != null && m19188u(recallMembershipData)) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        this.frag.r2();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: r */
    public final void m19185r(String sku) {
        if (TextUtils.isEmpty(sku)) {
            this.frag.b3(SwipeDirection.RIGHT, true);
        } else {
            CoreModule.m1854P().m11706a().m5249Eo(this.frag.q1(), PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, true, new d30() { // from class: l.k8p
                public final void call() {
                    m8p.m19175n(this.f15658a);
                }
            }, new d30() { // from class: l.l8p
                public final void call() {
                    m8p.m19172k(this.f16269a);
                }
            }, sku);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m19186s() {
        RecallMembershipData recallMembershipData;
        IntlInsertCardData intlInsertCardData = this.data;
        if (intlInsertCardData == null || (recallMembershipData = intlInsertCardData.recallMembership) == null) {
            return;
        }
        zvf0.u(this.E_INTL_MEMBERSHIP_CALLBACK_BUTTON, "p_suggest_users_home_view", new j760[]{vwb.Y(this.INTL_VAS_SKU, recallMembershipData.membershipType + recallMembershipData.quantity + "m")});
    }

    /* JADX INFO: renamed from: t */
    public final void m19187t() {
        RecallMembershipData recallMembershipData;
        IntlInsertCardData intlInsertCardData = this.data;
        if (intlInsertCardData == null || (recallMembershipData = intlInsertCardData.recallMembership) == null) {
            return;
        }
        zvf0.A(this.E_INTL_MEMBERSHIP_CALLBACK_BUTTON, "p_suggest_users_home_view", new j760[]{vwb.Y(this.INTL_VAS_SKU, recallMembershipData.membershipType + recallMembershipData.quantity + "m")});
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX INFO: renamed from: u */
    public final boolean m19188u(final RecallMembershipData data) {
        final ProductCategory productCategory;
        if (this.purchaseSuc) {
            return false;
        }
        m19186s();
        User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        if ((NullChecker.a(userM21483na) && userM21483na.isVIP()) || !xma.m27395m4() || !xma.m27385h4()) {
            Context contextQ1 = this.frag.q1();
            if (contextQ1 != null) {
                contextQ1.startActivity(CoreModule.m1854P().m11706a().m5287K6(contextQ1));
            }
            return false;
        }
        if (TextUtils.equals(data.channel, this.DEALER)) {
            kkp0.m18160a(this.frag.q1(), data.h5URL, data.membershipType, data.quantity, ogw.f(CoreModule.m1850H().userId() + mqi0.o(), true));
            return false;
        }
        String str = data.membershipType;
        int iHashCode = str.hashCode();
        if (iHashCode != 113747) {
            if (iHashCode == 3542730 && str.equals("svip")) {
                productCategory = ProductCategory.get("tttSvipGoogleplay");
            } else {
                productCategory = ProductCategory.get("tttVip");
            }
        } else if (str.equals("see")) {
            productCategory = ProductCategory.get("tttSeeWhoLikedMe");
        } else {
            productCategory = ProductCategory.get("tttVip");
        }
        c cVarJust = c.just(productCategory);
        final Function1 function1 = new Function1() { // from class: l.e8p
            public final Object invoke(Object obj) {
                return m8p.m19170i(productCategory, (ProductCategory) obj);
            }
        };
        c cVarFlatMap = cVarJust.flatMap(new w9j() { // from class: l.f8p
            public final Object call(Object obj) {
                return m8p.m19174m(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.g8p
            public final Object invoke(Object obj) {
                return m8p.m19169h((List) obj);
            }
        };
        cVarFlatMap.filter(new w9j() { // from class: l.h8p
            public final Object call(Object obj) {
                return m8p.m19173l(function2, obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.i8p
            public final void call(Object obj) {
                m8p.m19177p(this.f14312a, data, (List) obj);
            }
        }, new e30() { // from class: l.j8p
            public final void call(Object obj) {
                m8p.m19176o(this.f15064a, (Throwable) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m19179b(@Nullable VSwipeCard card) {
    }

    /* JADX INFO: renamed from: c */
    public void m19180c(@Nullable View view) {
    }
}
