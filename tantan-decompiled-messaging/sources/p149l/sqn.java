package p149l;

import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p046p1.mobile.putong.core.p053ui.intllikedusers.IntlLikedUsersAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.discountentry.IntlDiscountEntryBannerView;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.discountentry.IntlDiscountEntryTheme;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010,¨\u0006/"}, m87232d2 = {"Ll/sqn;", "", "Lcom/p1/mobile/putong/core/ui/intllikedusers/IntlLikedUsersAct;", SocialConstants.PARAM_ACT, "Ll/zqn;", "presenter", "<init>", "(Lcom/p1/mobile/putong/core/ui/intllikedusers/IntlLikedUsersAct;Ll/zqn;)V", "Landroid/widget/FrameLayout;", "container", "", "e", "(Landroid/widget/FrameLayout;)V", RXScreenCaptureService.KEY_INDEX, "()V", "k", "g", "h", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "b", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;", "slot", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)V", "", "f", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)Ljava/lang/CharSequence;", "", "raw", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "j", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "a", "Lcom/p1/mobile/putong/core/ui/intllikedusers/IntlLikedUsersAct;", "Ll/zqn;", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "c", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "tab", "Ljava/lang/String;", "purchaseFrom", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "banner", "Ll/c4g0;", "Ll/c4g0;", "affiliateCountdownResyncSub", "affiliatePromotionsCacheSub", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class sqn {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlLikedUsersAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final zqn presenter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab tab;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String purchaseFrom;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public IntlDiscountEntryBannerView banner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public c4g0 affiliateCountdownResyncSub;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public c4g0 affiliatePromotionsCacheSub;

    public sqn(@NotNull IntlLikedUsersAct intlLikedUsersAct, @NotNull zqn zqnVar) {
        intlLikedUsersAct.getClass();
        zqnVar.getClass();
        this.act = intlLikedUsersAct;
        this.presenter = zqnVar;
        this.tab = CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.ME_TAB_ILIKE_OLD_LIKE;
        this.purchaseFrom = "p_intl_who_i_liked,e_intl_me_tab_ilike_old_like_discount_entry_banner,click";
        this.affiliateCountdownResyncSub = intlLikedUsersAct.duringCreated(CoreModule.f17545c.f19696x0.m30210p4()).subscribe(mkd0.m154955G(new e30() { // from class: l.pqn
            @Override // p149l.e30
            public final void call(Object obj) {
                sqn.m185599c(this.f150804a, (Boolean) obj);
            }
        }));
        this.affiliatePromotionsCacheSub = intlLikedUsersAct.duringCreated(CoreModule.f17545c.f19696x0.m30212q4()).subscribe(mkd0.m154955G(new e30() { // from class: l.qqn
            @Override // p149l.e30
            public final void call(Object obj) {
                sqn.m185597a(this.f155918a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static void m185597a(sqn sqnVar, Boolean bool) {
        sqnVar.m185607k();
    }

    /* JADX INFO: renamed from: b */
    public static void m185598b(sqn sqnVar, IapAffiliatePromotion iapAffiliatePromotion, View view) {
        s1n.m182010f(sqnVar.act, iapAffiliatePromotion, s1n.m182006b(sqnVar.tab));
        sqnVar.presenter.m219870g1(sqnVar.purchaseFrom);
    }

    /* JADX INFO: renamed from: c */
    public static void m185599c(sqn sqnVar, Boolean bool) {
        sqnVar.m185607k();
    }

    /* JADX INFO: renamed from: d */
    public final void m185600d(IntlDiscountEntryBannerView b, IapAffiliatePromotionDisplaySlot slot) {
        String string;
        String str = slot.mainTitle;
        String str2 = null;
        String string2 = str != null ? StringsKt.m93433Z0(str).toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        if (string2.length() <= 0) {
            string2 = null;
        }
        b.setHeadline(string2);
        String str3 = slot.subtitle;
        String string3 = str3 != null ? StringsKt.m93433Z0(str3).toString() : null;
        if (string3 == null) {
            string3 = "";
        }
        if (string3.length() > 0) {
            b.setSubtitle(string3);
            b.setSubtitleVisible(true);
        } else {
            b.setSubtitle(null);
            b.setSubtitleVisible(false);
        }
        String str4 = slot.buttonText;
        String string4 = str4 != null ? StringsKt.m93433Z0(str4).toString() : null;
        String str5 = string4 != null ? string4 : "";
        if (str5.length() <= 0) {
            str5 = null;
        }
        b.setCtaText(str5);
        String str6 = slot.digitBackground;
        if (str6 != null && (string = StringsKt.m93433Z0(str6).toString()) != null && string.length() > 0) {
            str2 = string;
        }
        b.setCountdownDigitBackgroundArgbHex(str2);
    }

    /* JADX INFO: renamed from: e */
    public final void m185601e(@NotNull FrameLayout container) {
        container.getClass();
        m185604h();
        if (this.banner != null) {
            return;
        }
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = new IntlDiscountEntryBannerView(this.act, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(t100.m186890d(12.0f));
        layoutParams.setMarginEnd(t100.m186890d(12.0f));
        layoutParams.topMargin = t100.m186890d(4.0f);
        layoutParams.bottomMargin = t100.m186890d(8.0f);
        container.addView(intlDiscountEntryBannerView, layoutParams);
        this.banner = intlDiscountEntryBannerView;
        m185607k();
    }

    /* JADX INFO: renamed from: f */
    public final CharSequence m185602f(IapAffiliatePromotionDisplaySlot slot) {
        String string;
        String string2;
        String string3;
        String str = slot.mainTitle;
        if (str == null || (string = StringsKt.m93433Z0(str).toString()) == null || string.length() <= 0) {
            string = null;
        }
        String str2 = slot.subtitle;
        if (str2 == null || (string2 = StringsKt.m93433Z0(str2).toString()) == null || string2.length() <= 0) {
            string2 = null;
        }
        String str3 = slot.buttonText;
        if (str3 == null || (string3 = StringsKt.m93433Z0(str3).toString()) == null || string3.length() <= 0) {
            string3 = null;
        }
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{string, string2, string3});
        if (listListOfNotNull.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(listListOfNotNull, ", ", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m185603g() {
        c4g0 c4g0Var = this.affiliateCountdownResyncSub;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
        }
        this.affiliateCountdownResyncSub = null;
        c4g0 c4g0Var2 = this.affiliatePromotionsCacheSub;
        if (c4g0Var2 != null) {
            c4g0Var2.unsubscribe();
        }
        this.affiliatePromotionsCacheSub = null;
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null) {
            intlDiscountEntryBannerView.m53968t();
        }
        this.banner = null;
    }

    /* JADX INFO: renamed from: h */
    public final void m185604h() {
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null && intlDiscountEntryBannerView.getParent() == null) {
            intlDiscountEntryBannerView.m53968t();
            this.banner = null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m185605i() {
        m185607k();
    }

    /* JADX INFO: renamed from: j */
    public final IntlDiscountEntryTheme m185606j(String raw) {
        if (raw == null || StringsKt.m93438e0(raw)) {
            return IntlDiscountEntryTheme.THEME1;
        }
        String lowerCase = StringsKt.m93433Z0(raw).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (Intrinsics.m87488d(lowerCase, "theme2")) {
            return IntlDiscountEntryTheme.THEME2;
        }
        return Intrinsics.m87488d(lowerCase, "theme3") ? IntlDiscountEntryTheme.THEME3 : IntlDiscountEntryTheme.THEME1;
    }

    /* JADX INFO: renamed from: k */
    public final void m185607k() {
        String string;
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView == null) {
            return;
        }
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f17545c.f19696x0;
        if (!coreIntlAffiliatePromotions.m30185M3(this.tab)) {
            xdl0.m208344M(intlDiscountEntryBannerView, false);
            intlDiscountEntryBannerView.m53968t();
            return;
        }
        final IapAffiliatePromotion iapAffiliatePromotionM30170D3 = coreIntlAffiliatePromotions.m30170D3(this.tab);
        if (iapAffiliatePromotionM30170D3 == null) {
            xdl0.m208344M(intlDiscountEntryBannerView, false);
            intlDiscountEntryBannerView.m53968t();
            return;
        }
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM30175G3 = coreIntlAffiliatePromotions.m30175G3(iapAffiliatePromotionM30170D3, this.tab);
        if (iapAffiliatePromotionDisplaySlotM30175G3 == null) {
            xdl0.m208344M(intlDiscountEntryBannerView, false);
            intlDiscountEntryBannerView.m53968t();
            return;
        }
        xdl0.m208344M(intlDiscountEntryBannerView, true);
        intlDiscountEntryBannerView.setEntryTheme(m185606j(iapAffiliatePromotionDisplaySlotM30175G3.theme));
        intlDiscountEntryBannerView.setBadgeText(null);
        String str = iapAffiliatePromotionDisplaySlotM30175G3.imgUrl;
        if (str == null || (string = StringsKt.m93433Z0(str).toString()) == null || string.length() <= 0) {
            string = null;
        }
        intlDiscountEntryBannerView.setBadgeImageUrl(string);
        m185600d(intlDiscountEntryBannerView, iapAffiliatePromotionDisplaySlotM30175G3);
        long jM30173F3 = coreIntlAffiliatePromotions.m30173F3(iapAffiliatePromotionM30170D3);
        if (jM30173F3 <= mqi0.m155944o()) {
            intlDiscountEntryBannerView.m53968t();
        } else {
            intlDiscountEntryBannerView.m53967r(jM30173F3, coreIntlAffiliatePromotions.m30176G4(iapAffiliatePromotionM30170D3) ? iapAffiliatePromotionM30170D3 : null);
        }
        intlDiscountEntryBannerView.setOnBannerClickListener(new View.OnClickListener() { // from class: l.rqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sqn.m185598b(this.f160670a, iapAffiliatePromotionM30170D3, view);
            }
        });
        intlDiscountEntryBannerView.setBannerContentDescription(m185602f(iapAffiliatePromotionDisplaySlotM30175G3));
    }
}
