package p009l;

import com.p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u001e"}, d2 = {"Ll/p1n;", "", "<init>", "()V", "Ll/o1n;", "a", "Ll/o1n;", "c", "()Ll/o1n;", "ME_TAB", "b", "MESSAGE_TAB", "d", "WHISPER_TAB", "getMEET_ILIKE_NEW_LIKE", "MEET_ILIKE_NEW_LIKE", "e", "getME_TAB_ILIKE_OLD_LIKE", "ME_TAB_ILIKE_OLD_LIKE", "f", "getMEET_LIKERS_NEW_SEE", "MEET_LIKERS_NEW_SEE", "g", "getSEE_STANDALONE_OLD_SEE", "SEE_STANDALONE_OLD_SEE", "h", "getME_TAB_VISITORS_OLD_VISITOR", "ME_TAB_VISITORS_OLD_VISITOR", "i", "HOME_SWIPE_CARD_PAGE", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p1n {

    @NotNull
    public static final p1n INSTANCE = new p1n();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final o1n ME_TAB = new C1093e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final o1n MESSAGE_TAB = new C1092d();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final o1n WHISPER_TAB = new C1097i();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final o1n MEET_ILIKE_NEW_LIKE = new C1090b();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final o1n ME_TAB_ILIKE_OLD_LIKE = new C1094f();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final o1n MEET_LIKERS_NEW_SEE = new C1091c();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final o1n SEE_STANDALONE_OLD_SEE = new C1096h();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final o1n ME_TAB_VISITORS_OLD_VISITOR = new C1095g();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final o1n HOME_SWIPE_CARD_PAGE = new C1089a();

    /* JADX INFO: renamed from: l.p1n$a */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"l/p1n$a", "Ll/o1n;", "", "a", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "b", "e", "purchaseNavigationFrom", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "c", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "()Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "discountEntryTab", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1089a implements o1n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final String logTag = "IntlHomeSwipeCardPageDiscountEntry";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String purchaseNavigationFrom = "p_suggest_users_home_view,e_intl_home_swipe_discount_entry_banner,click";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab discountEntryTab = CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.HOME_SWIPE_CARD_PAGE;

        @Override // p009l.o1n
        /* JADX INFO: renamed from: a */
        public /* bridge */ boolean mo19599a(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19599a(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: b, reason: from getter */
        public CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab getDiscountEntryTab() {
            return this.discountEntryTab;
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: c */
        public /* bridge */ IapAffiliatePromotion mo19601c(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19601c(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: d */
        public /* bridge */ IapAffiliatePromotionDisplaySlot mo19602d(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions, IapAffiliatePromotion iapAffiliatePromotion) {
            return super.mo19602d(coreIntlAffiliatePromotions, iapAffiliatePromotion);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getPurchaseNavigationFrom() {
            return this.purchaseNavigationFrom;
        }
    }

    /* JADX INFO: renamed from: l.p1n$b */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"l/p1n$b", "Ll/o1n;", "", "a", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "b", "e", "purchaseNavigationFrom", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "c", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "()Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "discountEntryTab", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1090b implements o1n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final String logTag = "IntlMeetILikeNewLikeDiscountEntry";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String purchaseNavigationFrom = "p_meet_view,e_intl_meet_ilike_new_like_discount_entry_banner,click";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab discountEntryTab = CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MEET_ILIKE_NEW_LIKE;

        @Override // p009l.o1n
        /* JADX INFO: renamed from: a */
        public /* bridge */ boolean mo19599a(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19599a(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: b, reason: from getter */
        public CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab getDiscountEntryTab() {
            return this.discountEntryTab;
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: c */
        public /* bridge */ IapAffiliatePromotion mo19601c(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19601c(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: d */
        public /* bridge */ IapAffiliatePromotionDisplaySlot mo19602d(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions, IapAffiliatePromotion iapAffiliatePromotion) {
            return super.mo19602d(coreIntlAffiliatePromotions, iapAffiliatePromotion);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getPurchaseNavigationFrom() {
            return this.purchaseNavigationFrom;
        }
    }

    /* JADX INFO: renamed from: l.p1n$c */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"l/p1n$c", "Ll/o1n;", "", "a", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "b", "e", "purchaseNavigationFrom", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "c", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "()Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "discountEntryTab", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1091c implements o1n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final String logTag = "IntlMeetLikersNewSeeDiscountEntry";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String purchaseNavigationFrom = "p_meet_view,e_intl_meet_see_new_see_discount_entry_banner,click";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab discountEntryTab = CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MEET_LIKERS_NEW_SEE;

        @Override // p009l.o1n
        /* JADX INFO: renamed from: a */
        public /* bridge */ boolean mo19599a(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19599a(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: b, reason: from getter */
        public CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab getDiscountEntryTab() {
            return this.discountEntryTab;
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: c */
        public /* bridge */ IapAffiliatePromotion mo19601c(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19601c(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: d */
        public /* bridge */ IapAffiliatePromotionDisplaySlot mo19602d(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions, IapAffiliatePromotion iapAffiliatePromotion) {
            return super.mo19602d(coreIntlAffiliatePromotions, iapAffiliatePromotion);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getPurchaseNavigationFrom() {
            return this.purchaseNavigationFrom;
        }
    }

    /* JADX INFO: renamed from: l.p1n$d */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"l/p1n$d", "Ll/o1n;", "", "a", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "b", "e", "purchaseNavigationFrom", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "c", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "()Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "discountEntryTab", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1092d implements o1n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final String logTag = "IntlMsgDiscountEntry";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String purchaseNavigationFrom = "p_messages_view,e_intl_message_discount_entry_banner,click";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab discountEntryTab = CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MESSAGE_TAB;

        @Override // p009l.o1n
        /* JADX INFO: renamed from: a */
        public /* bridge */ boolean mo19599a(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19599a(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: b, reason: from getter */
        public CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab getDiscountEntryTab() {
            return this.discountEntryTab;
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: c */
        public /* bridge */ IapAffiliatePromotion mo19601c(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19601c(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: d */
        public /* bridge */ IapAffiliatePromotionDisplaySlot mo19602d(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions, IapAffiliatePromotion iapAffiliatePromotion) {
            return super.mo19602d(coreIntlAffiliatePromotions, iapAffiliatePromotion);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getPurchaseNavigationFrom() {
            return this.purchaseNavigationFrom;
        }
    }

    /* JADX INFO: renamed from: l.p1n$e */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"l/p1n$e", "Ll/o1n;", "", "a", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "b", "e", "purchaseNavigationFrom", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "c", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "()Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "discountEntryTab", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1093e implements o1n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final String logTag = "IntlMeDiscountEntry";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String purchaseNavigationFrom = "p_navigation_view,e_intl_me_discount_entry_banner,click";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab discountEntryTab = CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.ME_TAB;

        @Override // p009l.o1n
        /* JADX INFO: renamed from: a */
        public /* bridge */ boolean mo19599a(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19599a(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: b, reason: from getter */
        public CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab getDiscountEntryTab() {
            return this.discountEntryTab;
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: c */
        public /* bridge */ IapAffiliatePromotion mo19601c(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19601c(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: d */
        public /* bridge */ IapAffiliatePromotionDisplaySlot mo19602d(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions, IapAffiliatePromotion iapAffiliatePromotion) {
            return super.mo19602d(coreIntlAffiliatePromotions, iapAffiliatePromotion);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getPurchaseNavigationFrom() {
            return this.purchaseNavigationFrom;
        }
    }

    /* JADX INFO: renamed from: l.p1n$f */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"l/p1n$f", "Ll/o1n;", "", "a", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "b", "e", "purchaseNavigationFrom", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "c", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "()Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "discountEntryTab", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1094f implements o1n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final String logTag = "IntlMeTabILikeOldLikeDiscountEntry";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String purchaseNavigationFrom = "p_intl_who_i_liked,e_intl_me_tab_ilike_old_like_discount_entry_banner,click";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab discountEntryTab = CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.ME_TAB_ILIKE_OLD_LIKE;

        @Override // p009l.o1n
        /* JADX INFO: renamed from: a */
        public /* bridge */ boolean mo19599a(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19599a(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: b, reason: from getter */
        public CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab getDiscountEntryTab() {
            return this.discountEntryTab;
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: c */
        public /* bridge */ IapAffiliatePromotion mo19601c(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19601c(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: d */
        public /* bridge */ IapAffiliatePromotionDisplaySlot mo19602d(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions, IapAffiliatePromotion iapAffiliatePromotion) {
            return super.mo19602d(coreIntlAffiliatePromotions, iapAffiliatePromotion);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getPurchaseNavigationFrom() {
            return this.purchaseNavigationFrom;
        }
    }

    /* JADX INFO: renamed from: l.p1n$g */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"l/p1n$g", "Ll/o1n;", "", "a", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "b", "e", "purchaseNavigationFrom", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "c", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "()Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "discountEntryTab", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1095g implements o1n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final String logTag = "IntlMeTabVisitorsOldVisitorDiscountEntry";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String purchaseNavigationFrom = "p_intl_visitors_list,e_intl_me_tab_visitors_old_visitor_discount_entry_banner,click";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab discountEntryTab = CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.ME_TAB_VISITORS_OLD_VISITOR;

        @Override // p009l.o1n
        /* JADX INFO: renamed from: a */
        public /* bridge */ boolean mo19599a(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19599a(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: b, reason: from getter */
        public CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab getDiscountEntryTab() {
            return this.discountEntryTab;
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: c */
        public /* bridge */ IapAffiliatePromotion mo19601c(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19601c(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: d */
        public /* bridge */ IapAffiliatePromotionDisplaySlot mo19602d(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions, IapAffiliatePromotion iapAffiliatePromotion) {
            return super.mo19602d(coreIntlAffiliatePromotions, iapAffiliatePromotion);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getPurchaseNavigationFrom() {
            return this.purchaseNavigationFrom;
        }
    }

    /* JADX INFO: renamed from: l.p1n$h */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"l/p1n$h", "Ll/o1n;", "", "a", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "b", "e", "purchaseNavigationFrom", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "c", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "()Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "discountEntryTab", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1096h implements o1n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final String logTag = "IntlSeeStandaloneOldSeeDiscountEntry";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String purchaseNavigationFrom = "p_intl_plm_view,e_intl_see_standalone_old_see_discount_entry_banner,click";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab discountEntryTab = CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.SEE_STANDALONE_OLD_SEE;

        @Override // p009l.o1n
        /* JADX INFO: renamed from: a */
        public /* bridge */ boolean mo19599a(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19599a(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: b, reason: from getter */
        public CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab getDiscountEntryTab() {
            return this.discountEntryTab;
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: c */
        public /* bridge */ IapAffiliatePromotion mo19601c(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19601c(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: d */
        public /* bridge */ IapAffiliatePromotionDisplaySlot mo19602d(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions, IapAffiliatePromotion iapAffiliatePromotion) {
            return super.mo19602d(coreIntlAffiliatePromotions, iapAffiliatePromotion);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getPurchaseNavigationFrom() {
            return this.purchaseNavigationFrom;
        }
    }

    /* JADX INFO: renamed from: l.p1n$i */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"l/p1n$i", "Ll/o1n;", "", "a", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "b", "e", "purchaseNavigationFrom", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "c", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "()Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "discountEntryTab", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1097i implements o1n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final String logTag = "IntlWhisperDiscountEntry";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String purchaseNavigationFrom = "p_messages_view,e_intl_whisper_discount_entry_banner,click";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab discountEntryTab = CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.WHISPER_TAB;

        @Override // p009l.o1n
        /* JADX INFO: renamed from: a */
        public /* bridge */ boolean mo19599a(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19599a(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: b, reason: from getter */
        public CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab getDiscountEntryTab() {
            return this.discountEntryTab;
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: c */
        public /* bridge */ IapAffiliatePromotion mo19601c(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions) {
            return super.mo19601c(coreIntlAffiliatePromotions);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: d */
        public /* bridge */ IapAffiliatePromotionDisplaySlot mo19602d(CoreIntlAffiliatePromotions coreIntlAffiliatePromotions, IapAffiliatePromotion iapAffiliatePromotion) {
            return super.mo19602d(coreIntlAffiliatePromotions, iapAffiliatePromotion);
        }

        @Override // p009l.o1n
        /* JADX INFO: renamed from: e, reason: from getter */
        public String getPurchaseNavigationFrom() {
            return this.purchaseNavigationFrom;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final o1n m20083a() {
        return HOME_SWIPE_CARD_PAGE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final o1n m20084b() {
        return MESSAGE_TAB;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final o1n m20085c() {
        return ME_TAB;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final o1n m20086d() {
        return WHISPER_TAB;
    }
}
