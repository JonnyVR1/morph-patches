package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.AffiliateProducts;
import com.p046p1.mobile.putong.core.data.IntlInsertCardData;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RecallMembershipData;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.active.IntlRecallMembershipCard;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0015H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0015H\u0002¢\u0006\u0004\b/\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u00104\u001a\u0004\b5\u00106R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u00108R\u0014\u0010;\u001a\u00020)8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010:R\u0014\u0010<\u001a\u00020)8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010:R\u0014\u0010=\u001a\u00020)8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010:R\u0014\u0010>\u001a\u00020)8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010:R\u0016\u0010A\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, m87232d2 = {"Ll/m8p;", "Ll/ool0;", "Ll/eyl;", "frag", "Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "data", "<init>", "(Ll/eyl;Lcom/p1/mobile/putong/core/data/IntlInsertCardData;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/t7m;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/t7m;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/data/RecallMembershipData;", "u", "(Lcom/p1/mobile/putong/core/data/RecallMembershipData;)Z", "", "sku", "r", "(Ljava/lang/String;)V", Constants.KEY_T, "()V", BLiveStormDanmakuGiftResourceType.f44446s, "a", "Ll/eyl;", "getFrag", "()Ll/eyl;", "Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "getData", "()Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "Lcom/p1/mobile/putong/core/ui/active/IntlRecallMembershipCard;", "Lcom/p1/mobile/putong/core/ui/active/IntlRecallMembershipCard;", "recallMembershipCard", "Ljava/lang/String;", "TAG", "DEALER", "E_INTL_MEMBERSHIP_CALLBACK_BUTTON", "INTL_VAS_SKU", "h", "Z", "purchaseSuc", "card_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static Boolean m153491h(List list) {
        return Boolean.valueOf(!vwb.m200296J(list));
    }

    /* JADX INFO: renamed from: i */
    public static C22306c m153492i(ProductCategory productCategory, ProductCategory productCategory2) {
        return CoreModule.f17545c.f19654j0.m30644y5(productCategory);
    }

    /* JADX INFO: renamed from: k */
    public static void m153494k(m8p m8pVar) {
        String str = m8pVar.TAG;
    }

    /* JADX INFO: renamed from: l */
    public static Boolean m153495l(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static C22306c m153496m(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static void m153497n(m8p m8pVar) {
        String str = m8pVar.TAG;
        m8pVar.purchaseSuc = true;
        m8pVar.frag.mo36752b3(SwipeDirection.RIGHT, true);
    }

    /* JADX INFO: renamed from: o */
    public static void m153498o(m8p m8pVar, Throwable th) {
        String str = m8pVar.TAG;
        th.getMessage();
    }

    /* JADX INFO: renamed from: p */
    public static void m153499p(m8p m8pVar, RecallMembershipData recallMembershipData, List list) {
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
        if (merchandise == null && !vwb.m200296J(list)) {
            merchandise = (Merchandise) CollectionsKt.last(list);
        }
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            productId = affiliateProducts.getProductId();
        }
        m8pVar.m153501r(productId);
    }

    /* JADX INFO: renamed from: q */
    public static final void m153500q(m8p m8pVar, RecallMembershipData recallMembershipData) {
        if (m8pVar.m153504u(recallMembershipData)) {
            return;
        }
        m8pVar.purchaseSuc = true;
        m8pVar.frag.mo36746V(SwipeDirection.RIGHT);
    }

    @Override // p149l.ool0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo30011d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(i6c0.f111717l, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
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
                    Intrinsics.m87502r("recallMembershipCard");
                    intlRecallMembershipCard = null;
                }
                intlRecallMembershipCard.m44227j0(this.frag, recallMembershipData, new d30() { // from class: l.d8p
                    @Override // p149l.d30
                    public final void call() {
                        m8p.m153500q(this.f84883a, recallMembershipData);
                    }
                });
            }
        } else {
            if (intlRecallMembershipCard2 == null) {
                Intrinsics.m87502r("recallMembershipCard");
                intlRecallMembershipCard2 = null;
            }
            if (!Intrinsics.m87488d(intlRecallMembershipCard2, view)) {
                intlRecallMembershipCard = (IntlRecallMembershipCard) view;
                this.recallMembershipCard = intlRecallMembershipCard;
                intlInsertCardData = this.data;
                if (intlInsertCardData != null) {
                    if (intlRecallMembershipCard == null) {
                        Intrinsics.m87502r("recallMembershipCard");
                        intlRecallMembershipCard = null;
                    }
                    intlRecallMembershipCard.m44227j0(this.frag, recallMembershipData, new d30() { // from class: l.d8p
                        @Override // p149l.d30
                        public final void call() {
                            m8p.m153500q(this.f84883a, recallMembershipData);
                        }
                    });
                }
            }
        }
        if (position == 0) {
            m153503t();
            CoreModule.f17545c.f19663m0.f19408e2.m34206F3();
            IntlRecallMembershipCard intlRecallMembershipCard4 = this.recallMembershipCard;
            if (intlRecallMembershipCard4 == null) {
                Intrinsics.m87502r("recallMembershipCard");
            } else {
                intlRecallMembershipCard3 = intlRecallMembershipCard4;
            }
            intlRecallMembershipCard3.setOnSwipe(false);
            boolean zM28126v = IntlCountryCodeController.m28126v();
            eyl eylVar = this.frag;
            if (zM28126v) {
                eylVar.mo36738F3();
            } else {
                eylVar.mo36742O3();
                this.frag.mo36740J0();
            }
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(@NotNull SwipeDirection swipeDirection, @NotNull t7m card) {
        IntlInsertCardData intlInsertCardData;
        RecallMembershipData recallMembershipData;
        swipeDirection.getClass();
        card.getClass();
        if ((swipeDirection.getValue() == SwipeDirection.RIGHT.getValue() || swipeDirection.getValue() == SwipeDirection.UP.getValue()) && (intlInsertCardData = this.data) != null && (recallMembershipData = intlInsertCardData.recallMembership) != null && m153504u(recallMembershipData)) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        this.frag.mo36759r2();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: r */
    public final void m153501r(String sku) {
        if (TextUtils.isEmpty(sku)) {
            this.frag.mo36752b3(SwipeDirection.RIGHT, true);
        } else {
            CoreModule.m29935P().m94651a().mo33312Eo(this.frag.mo36758q1(), PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, true, new d30() { // from class: l.k8p
                @Override // p149l.d30
                public final void call() {
                    m8p.m153497n(this.f121845a);
                }
            }, new d30() { // from class: l.l8p
                @Override // p149l.d30
                public final void call() {
                    m8p.m153494k(this.f126848a);
                }
            }, sku);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m153502s() {
        RecallMembershipData recallMembershipData;
        IntlInsertCardData intlInsertCardData = this.data;
        if (intlInsertCardData == null || (recallMembershipData = intlInsertCardData.recallMembership) == null) {
            return;
        }
        zvf0.m220399u(this.E_INTL_MEMBERSHIP_CALLBACK_BUTTON, "p_suggest_users_home_view", vwb.m200311Y(this.INTL_VAS_SKU, recallMembershipData.membershipType + recallMembershipData.quantity + "m"));
    }

    /* JADX INFO: renamed from: t */
    public final void m153503t() {
        RecallMembershipData recallMembershipData;
        IntlInsertCardData intlInsertCardData = this.data;
        if (intlInsertCardData == null || (recallMembershipData = intlInsertCardData.recallMembership) == null) {
            return;
        }
        zvf0.m220368A(this.E_INTL_MEMBERSHIP_CALLBACK_BUTTON, "p_suggest_users_home_view", vwb.m200311Y(this.INTL_VAS_SKU, recallMembershipData.membershipType + recallMembershipData.quantity + "m"));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX INFO: renamed from: u */
    public final boolean m153504u(final RecallMembershipData data) {
        final ProductCategory productCategory;
        if (this.purchaseSuc) {
            return false;
        }
        m153502s();
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if ((NullChecker.m81303a(userM169520na) && userM169520na.isVIP()) || !xma.m210087m4() || !xma.m210077h4()) {
            Act actMo36758q1 = this.frag.mo36758q1();
            if (actMo36758q1 != null) {
                actMo36758q1.startActivity(CoreModule.m29935P().m94651a().mo33350K6(actMo36758q1));
            }
            return false;
        }
        if (TextUtils.equals(data.channel, this.DEALER)) {
            kkp0.m146348a(this.frag.mo36758q1(), data.h5URL, data.membershipType, data.quantity, ogw.m164285f(CoreModule.m29931H().userId() + mqi0.m155944o(), true));
            return false;
        }
        String str = data.membershipType;
        int iHashCode = str.hashCode();
        if (iHashCode != 113747) {
            if (iHashCode == 3542730 && str.equals("svip")) {
                productCategory = ProductCategory.get(ProductCategory.tttSvipGoogleplay);
            } else {
                productCategory = ProductCategory.get(ProductCategory.tttVip);
            }
        } else if (str.equals("see")) {
            productCategory = ProductCategory.get(ProductCategory.tttSeeWhoLikedMe);
        } else {
            productCategory = ProductCategory.get(ProductCategory.tttVip);
        }
        C22306c c22306cJust = C22306c.just(productCategory);
        final Function1 function1 = new Function1() { // from class: l.e8p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m8p.m153492i(productCategory, (ProductCategory) obj);
            }
        };
        C22306c c22306cFlatMap = c22306cJust.flatMap(new w9j() { // from class: l.f8p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return m8p.m153496m(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.g8p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m8p.m153491h((List) obj);
            }
        };
        c22306cFlatMap.filter(new w9j() { // from class: l.h8p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return m8p.m153495l(function2, obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.i8p
            @Override // p149l.e30
            public final void call(Object obj) {
                m8p.m153499p(this.f112060a, data, (List) obj);
            }
        }, new e30() { // from class: l.j8p
            @Override // p149l.e30
            public final void call(Object obj) {
                m8p.m153498o(this.f116734a, (Throwable) obj);
            }
        }));
        return true;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(@Nullable VSwipeCard card) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(@Nullable View view) {
    }
}
