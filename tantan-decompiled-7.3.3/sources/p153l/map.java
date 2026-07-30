package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.AffiliateProducts;
import com.p051p1.mobile.putong.core.data.IntlInsertCardData;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RecallMembershipData;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.active.IntlRecallMembershipCard;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
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
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0015H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0015H\u0002¢\u0006\u0004\b/\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u00104\u001a\u0004\b5\u00106R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u00108R\u0014\u0010;\u001a\u00020)8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010:R\u0014\u0010<\u001a\u00020)8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010:R\u0014\u0010=\u001a\u00020)8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010:R\u0014\u0010>\u001a\u00020)8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010:R\u0016\u0010A\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, m88121d2 = {"Ll/map;", "Ll/sxl0;", "Ll/x0m;", "frag", "Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "data", "<init>", "(Ll/x0m;Lcom/p1/mobile/putong/core/data/IntlInsertCardData;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Lcom/p1/mobile/putong/core/data/VirtualCardType;", "cardType", "Landroid/view/View;", Constants.INAPP_DATA_TAG, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/VirtualCardType;)Landroid/view/View;", OMSTemplateModeType.view, "", "position", "card", "", "e", "(Landroid/view/View;ILcom/p1/mobile/putong/core/data/VirtualCardType;Landroid/view/View;)V", "", "f", "()Z", "Lcom/p1/mobile/putong/core/card/VSwipeCard;", "b", "(Lcom/p1/mobile/putong/core/card/VSwipeCard;)V", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Ll/jam;", "Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "g", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;Ll/jam;)Lcom/p1/mobile/putong/core/card/VSwipeStack$OnCardSwipeResult;", "c", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/data/RecallMembershipData;", "u", "(Lcom/p1/mobile/putong/core/data/RecallMembershipData;)Z", "", "sku", "r", "(Ljava/lang/String;)V", Constants.KEY_T, "()V", BLiveStormDanmakuGiftResourceType.f45294s, "a", "Ll/x0m;", "getFrag", "()Ll/x0m;", "Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "getData", "()Lcom/p1/mobile/putong/core/data/IntlInsertCardData;", "Lcom/p1/mobile/putong/core/ui/active/IntlRecallMembershipCard;", "Lcom/p1/mobile/putong/core/ui/active/IntlRecallMembershipCard;", "recallMembershipCard", "Ljava/lang/String;", "TAG", "DEALER", "E_INTL_MEMBERSHIP_CALLBACK_BUTTON", "INTL_VAS_SKU", "h", "Z", "purchaseSuc", "card_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class map implements sxl0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final x0m frag;

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

    public map(@NotNull x0m x0mVar, @Nullable IntlInsertCardData intlInsertCardData) {
        x0mVar.getClass();
        this.frag = x0mVar;
        this.data = intlInsertCardData;
        this.TAG = "IntlRecallMembershipAdapter";
        this.DEALER = "dealer";
        this.E_INTL_MEMBERSHIP_CALLBACK_BUTTON = "e_intl_membership_callback_button";
        this.INTL_VAS_SKU = "intl_vas_sku";
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m157735h(List list) {
        return Boolean.valueOf(!jyb.m147479J(list));
    }

    /* JADX INFO: renamed from: i */
    public static C22421c m157736i(ProductCategory productCategory, ProductCategory productCategory2) {
        return CoreModule.f18264c.f20396j0.m31647y5(productCategory);
    }

    /* JADX INFO: renamed from: k */
    public static void m157738k(map mapVar) {
        String str = mapVar.TAG;
    }

    /* JADX INFO: renamed from: l */
    public static Boolean m157739l(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static C22421c m157740m(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static void m157741n(map mapVar) {
        String str = mapVar.TAG;
        mapVar.purchaseSuc = true;
        mapVar.frag.mo37755b3(SwipeDirection.RIGHT, true);
    }

    /* JADX INFO: renamed from: o */
    public static void m157742o(map mapVar, Throwable th) {
        String str = mapVar.TAG;
        th.getMessage();
    }

    /* JADX INFO: renamed from: p */
    public static void m157743p(map mapVar, RecallMembershipData recallMembershipData, List list) {
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
        if (merchandise == null && !jyb.m147479J(list)) {
            merchandise = (Merchandise) CollectionsKt.last(list);
        }
        if (merchandise != null && (stockKeepUnit = merchandise.defaultStockKeepUnit) != null && (affiliateProducts = stockKeepUnit.affiliateProducts) != null) {
            productId = affiliateProducts.getProductId();
        }
        mapVar.m157745r(productId);
    }

    /* JADX INFO: renamed from: q */
    public static final void m157744q(map mapVar, RecallMembershipData recallMembershipData) {
        if (mapVar.m157748u(recallMembershipData)) {
            return;
        }
        mapVar.purchaseSuc = true;
        mapVar.frag.mo37749V(SwipeDirection.RIGHT);
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo31009d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable VirtualCardType cardType) {
        inflater.getClass();
        View viewInflate = inflater.inflate(nec0.f141627l, parent, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(@NotNull View view, int position, @NotNull VirtualCardType cardType, @Nullable View card) {
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
                    Intrinsics.m88391r("recallMembershipCard");
                    intlRecallMembershipCard = null;
                }
                intlRecallMembershipCard.m45410j0(this.frag, recallMembershipData, new x20() { // from class: l.dap
                    @Override // p153l.x20
                    public final void call() {
                        map.m157744q(this.f85899a, recallMembershipData);
                    }
                });
            }
        } else {
            if (intlRecallMembershipCard2 == null) {
                Intrinsics.m88391r("recallMembershipCard");
                intlRecallMembershipCard2 = null;
            }
            if (!Intrinsics.m88377d(intlRecallMembershipCard2, view)) {
                intlRecallMembershipCard = (IntlRecallMembershipCard) view;
                this.recallMembershipCard = intlRecallMembershipCard;
                intlInsertCardData = this.data;
                if (intlInsertCardData != null) {
                    if (intlRecallMembershipCard == null) {
                        Intrinsics.m88391r("recallMembershipCard");
                        intlRecallMembershipCard = null;
                    }
                    intlRecallMembershipCard.m45410j0(this.frag, recallMembershipData, new x20() { // from class: l.dap
                        @Override // p153l.x20
                        public final void call() {
                            map.m157744q(this.f85899a, recallMembershipData);
                        }
                    });
                }
            }
        }
        if (position == 0) {
            m157747t();
            CoreModule.f18264c.f20405m0.f20150e2.m35209F3();
            IntlRecallMembershipCard intlRecallMembershipCard4 = this.recallMembershipCard;
            if (intlRecallMembershipCard4 == null) {
                Intrinsics.m88391r("recallMembershipCard");
            } else {
                intlRecallMembershipCard3 = intlRecallMembershipCard4;
            }
            intlRecallMembershipCard3.setOnSwipe(false);
            boolean zM29125v = IntlCountryCodeController.m29125v();
            x0m x0mVar = this.frag;
            if (zM29125v) {
                x0mVar.mo37741F3();
            } else {
                x0mVar.mo37745O3();
                this.frag.mo37743J0();
            }
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    @NotNull
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(@NotNull SwipeDirection swipeDirection, @NotNull jam card) {
        IntlInsertCardData intlInsertCardData;
        RecallMembershipData recallMembershipData;
        swipeDirection.getClass();
        card.getClass();
        if ((swipeDirection.getValue() == SwipeDirection.RIGHT.getValue() || swipeDirection.getValue() == SwipeDirection.UP.getValue()) && (intlInsertCardData = this.data) != null && (recallMembershipData = intlInsertCardData.recallMembership) != null && m157748u(recallMembershipData)) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        this.frag.mo37762r2();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: r */
    public final void m157745r(String sku) {
        if (TextUtils.isEmpty(sku)) {
            this.frag.mo37755b3(SwipeDirection.RIGHT, true);
        } else {
            CoreModule.m30933P().m143405a().mo34315Eo(this.frag.mo37761q1(), PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, true, new x20() { // from class: l.kap
                @Override // p153l.x20
                public final void call() {
                    map.m157741n(this.f124705a);
                }
            }, new x20() { // from class: l.lap
                @Override // p153l.x20
                public final void call() {
                    map.m157738k(this.f130722a);
                }
            }, sku);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m157746s() {
        RecallMembershipData recallMembershipData;
        IntlInsertCardData intlInsertCardData = this.data;
        if (intlInsertCardData == null || (recallMembershipData = intlInsertCardData.recallMembership) == null) {
            return;
        }
        i4g0.m138523u(this.E_INTL_MEMBERSHIP_CALLBACK_BUTTON, "p_suggest_users_home_view", jyb.m147494Y(this.INTL_VAS_SKU, recallMembershipData.membershipType + recallMembershipData.quantity + "m"));
    }

    /* JADX INFO: renamed from: t */
    public final void m157747t() {
        RecallMembershipData recallMembershipData;
        IntlInsertCardData intlInsertCardData = this.data;
        if (intlInsertCardData == null || (recallMembershipData = intlInsertCardData.recallMembership) == null) {
            return;
        }
        i4g0.m138492A(this.E_INTL_MEMBERSHIP_CALLBACK_BUTTON, "p_suggest_users_home_view", jyb.m147494Y(this.INTL_VAS_SKU, recallMembershipData.membershipType + recallMembershipData.quantity + "m"));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX INFO: renamed from: u */
    public final boolean m157748u(final RecallMembershipData data) {
        final ProductCategory productCategory;
        if (this.purchaseSuc) {
            return false;
        }
        m157746s();
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if ((NullChecker.m82486a(userM116593na) && userM116593na.isVIP()) || !joa.m146401n4() || !joa.m146392i4()) {
            Act actMo37761q1 = this.frag.mo37761q1();
            if (actMo37761q1 != null) {
                actMo37761q1.startActivity(CoreModule.m30933P().m143405a().mo34353K6(actMo37761q1));
            }
            return false;
        }
        if (TextUtils.equals(data.channel, this.DEALER)) {
            otp0.m169160a(this.frag.mo37761q1(), data.h5URL, data.membershipType, data.quantity, niw.m163316f(CoreModule.m30929H().userId() + pzi0.m174454o(), true));
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
        C22421c c22421cJust = C22421c.just(productCategory);
        final Function1 function1 = new Function1() { // from class: l.eap
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return map.m157736i(productCategory, (ProductCategory) obj);
            }
        };
        C22421c c22421cFlatMap = c22421cJust.flatMap(new qcj() { // from class: l.fap
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return map.m157740m(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.gap
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return map.m157735h((List) obj);
            }
        };
        c22421cFlatMap.filter(new qcj() { // from class: l.hap
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return map.m157739l(function2, obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.iap
            @Override // p153l.y20
            public final void call(Object obj) {
                map.m157743p(this.f113610a, data, (List) obj);
            }
        }, new y20() { // from class: l.jap
            @Override // p153l.y20
            public final void call(Object obj) {
                map.m157742o(this.f119003a, (Throwable) obj);
            }
        }));
        return true;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(@Nullable VSwipeCard card) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(@Nullable View view) {
    }
}
