package p149l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p046p1.mobile.putong.core.newui.intlmeet.ilike.IntlILikeFrag;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.discountentry.IntlDiscountEntryBannerView;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.discountentry.IntlDiscountEntryTheme;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0016\u00102\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00101R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00104R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00104¨\u00067"}, m87232d2 = {"Ll/wdo;", "", "Lcom/p1/mobile/putong/core/newui/intlmeet/ilike/IntlILikeFrag;", "frag", "Ll/apn;", "presenter", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/ilike/IntlILikeFrag;Ll/apn;)V", "Landroid/widget/FrameLayout;", "container", "", "g", "(Landroid/widget/FrameLayout;)V", "k", "()V", "m", RXScreenCaptureService.KEY_INDEX, "j", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "b", "e", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;)V", "", "stopCountdown", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;Z)V", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;", "slot", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)V", "", "h", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)Ljava/lang/CharSequence;", "", "raw", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/ilike/IntlILikeFrag;", "Ll/apn;", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "c", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "tab", "Ljava/lang/String;", "purchaseFrom", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "banner", "Z", "discountEntryVibrationExposureHeld", "Ll/c4g0;", "Ll/c4g0;", "affiliateCountdownResyncSub", "affiliatePromotionsCacheSub", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class wdo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlILikeFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final apn presenter;

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
    public boolean discountEntryVibrationExposureHeld;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public c4g0 affiliateCountdownResyncSub;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public c4g0 affiliatePromotionsCacheSub;

    public wdo(@NotNull IntlILikeFrag intlILikeFrag, @NotNull apn apnVar) {
        intlILikeFrag.getClass();
        apnVar.getClass();
        this.frag = intlILikeFrag;
        this.presenter = apnVar;
        this.tab = CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MEET_ILIKE_NEW_LIKE;
        this.purchaseFrom = "p_meet_view,e_intl_meet_ilike_new_like_discount_entry_banner,click";
        this.affiliateCountdownResyncSub = intlILikeFrag.duringCreated(CoreModule.f17545c.f19696x0.m30210p4()).subscribe(mkd0.m154955G(new e30() { // from class: l.udo
            @Override // p149l.e30
            public final void call(Object obj) {
                wdo.m202761b(this.f175937a, (Boolean) obj);
            }
        }));
        this.affiliatePromotionsCacheSub = intlILikeFrag.duringCreated(CoreModule.f17545c.f19696x0.m30212q4()).subscribe(mkd0.m154955G(new e30() { // from class: l.vdo
            @Override // p149l.e30
            public final void call(Object obj) {
                wdo.m202762c(this.f181101a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static void m202760a(wdo wdoVar, IapAffiliatePromotion iapAffiliatePromotion, View view) {
        Act act = wdoVar.frag.act();
        if (act == null) {
            return;
        }
        s1n.m182010f(act, iapAffiliatePromotion, s1n.m182006b(wdoVar.tab));
        CoreModule.m29935P().m94656g().mo35089zr(act, wdoVar.purchaseFrom);
    }

    /* JADX INFO: renamed from: b */
    public static void m202761b(wdo wdoVar, Boolean bool) {
        wdoVar.m202772m();
    }

    /* JADX INFO: renamed from: c */
    public static void m202762c(wdo wdoVar, Boolean bool) {
        wdoVar.m202772m();
    }

    /* JADX INFO: renamed from: d */
    public final void m202763d(IntlDiscountEntryBannerView b, boolean stopCountdown) {
        if (this.discountEntryVibrationExposureHeld) {
            this.discountEntryVibrationExposureHeld = false;
            i1n.INSTANCE.m134002f();
        }
        xdl0.m208344M(b, false);
        if (stopCountdown) {
            b.m53968t();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m202764e(IntlDiscountEntryBannerView b) {
        xdl0.m208344M(b, true);
        if (this.discountEntryVibrationExposureHeld) {
            return;
        }
        this.discountEntryVibrationExposureHeld = true;
        i1n.INSTANCE.m133997a();
    }

    /* JADX INFO: renamed from: f */
    public final void m202765f(IntlDiscountEntryBannerView b, IapAffiliatePromotionDisplaySlot slot) {
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

    /* JADX INFO: renamed from: g */
    public final void m202766g(@NotNull FrameLayout container) {
        Context context;
        container.getClass();
        m202769j();
        if (this.banner == null && (context = this.frag.getContext()) != null) {
            IntlDiscountEntryBannerView intlDiscountEntryBannerView = new IntlDiscountEntryBannerView(context, null, 0, 6, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(t100.m186890d(12.0f));
            layoutParams.setMarginEnd(t100.m186890d(12.0f));
            layoutParams.topMargin = t100.m186890d(4.0f);
            layoutParams.bottomMargin = t100.m186890d(8.0f);
            container.addView(intlDiscountEntryBannerView, layoutParams);
            this.banner = intlDiscountEntryBannerView;
            m202772m();
        }
    }

    /* JADX INFO: renamed from: h */
    public final CharSequence m202767h(IapAffiliatePromotionDisplaySlot slot) {
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

    /* JADX INFO: renamed from: i */
    public final void m202768i() {
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
            m202763d(intlDiscountEntryBannerView, true);
        }
        this.banner = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m202769j() {
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null && intlDiscountEntryBannerView.getParent() == null) {
            m202763d(intlDiscountEntryBannerView, true);
            this.banner = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m202770k() {
        m202772m();
    }

    /* JADX INFO: renamed from: l */
    public final IntlDiscountEntryTheme m202771l(String raw) {
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

    /* JADX INFO: renamed from: m */
    public final void m202772m() {
        String string;
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView == null) {
            return;
        }
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f17545c.f19696x0;
        if (!coreIntlAffiliatePromotions.m30185M3(this.tab)) {
            m202763d(intlDiscountEntryBannerView, true);
            return;
        }
        final IapAffiliatePromotion iapAffiliatePromotionM30170D3 = coreIntlAffiliatePromotions.m30170D3(this.tab);
        if (iapAffiliatePromotionM30170D3 == null) {
            m202763d(intlDiscountEntryBannerView, true);
            return;
        }
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM30175G3 = coreIntlAffiliatePromotions.m30175G3(iapAffiliatePromotionM30170D3, this.tab);
        if (iapAffiliatePromotionDisplaySlotM30175G3 == null) {
            m202763d(intlDiscountEntryBannerView, true);
            return;
        }
        if (this.frag.act() == null) {
            m202763d(intlDiscountEntryBannerView, false);
            return;
        }
        m202764e(intlDiscountEntryBannerView);
        intlDiscountEntryBannerView.setEntryTheme(m202771l(iapAffiliatePromotionDisplaySlotM30175G3.theme));
        intlDiscountEntryBannerView.setBadgeText(null);
        String str = iapAffiliatePromotionDisplaySlotM30175G3.imgUrl;
        if (str == null || (string = StringsKt.m93433Z0(str).toString()) == null || string.length() <= 0) {
            string = null;
        }
        intlDiscountEntryBannerView.setBadgeImageUrl(string);
        m202765f(intlDiscountEntryBannerView, iapAffiliatePromotionDisplaySlotM30175G3);
        long jM30173F3 = coreIntlAffiliatePromotions.m30173F3(iapAffiliatePromotionM30170D3);
        if (jM30173F3 <= mqi0.m155944o()) {
            intlDiscountEntryBannerView.m53968t();
        } else {
            intlDiscountEntryBannerView.m53967r(jM30173F3, coreIntlAffiliatePromotions.m30176G4(iapAffiliatePromotionM30170D3) ? iapAffiliatePromotionM30170D3 : null);
        }
        intlDiscountEntryBannerView.setOnBannerClickListener(new View.OnClickListener() { // from class: l.tdo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wdo.m202760a(this.f169576a, iapAffiliatePromotionM30170D3, view);
            }
        });
        intlDiscountEntryBannerView.setBannerContentDescription(m202767h(iapAffiliatePromotionDisplaySlotM30175G3));
    }
}
