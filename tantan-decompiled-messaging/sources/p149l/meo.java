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
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
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
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00100R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0014\u00106\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, m87232d2 = {"Ll/meo;", "", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;)V", "", "hasUsers", "", "p", "(Z)V", "Landroid/widget/FrameLayout;", "container", "g", "(Landroid/widget/FrameLayout;)V", "m", "()V", "o", RXScreenCaptureService.KEY_INDEX, "j", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "b", "e", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;)V", "stopCountdown", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;Z)V", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;", "slot", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)V", "", "h", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)Ljava/lang/CharSequence;", "", "raw", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "n", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "Z", "seePoolHasUsers", "c", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "banner", "discountEntryVibrationExposureHeld", "Ll/c4g0;", "Ll/c4g0;", "affiliateCountdownResyncSub", "affiliatePromotionsCacheSub", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "k", "()Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "discountTab", BLiveStormDanmakuGiftResourceType.f44444l, "()Ljava/lang/String;", "purchaseFrom", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class meo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlMeetLikersFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean seePoolHasUsers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public IntlDiscountEntryBannerView banner;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean discountEntryVibrationExposureHeld;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public c4g0 affiliateCountdownResyncSub;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public c4g0 affiliatePromotionsCacheSub;

    public meo(@NotNull IntlMeetLikersFrag intlMeetLikersFrag) {
        intlMeetLikersFrag.getClass();
        this.frag = intlMeetLikersFrag;
        this.seePoolHasUsers = true;
        this.affiliateCountdownResyncSub = intlMeetLikersFrag.duringCreated(CoreModule.f17545c.f19696x0.m30210p4()).subscribe(mkd0.m154955G(new e30() { // from class: l.keo
            @Override // p149l.e30
            public final void call(Object obj) {
                meo.m154275b(this.f122735a, (Boolean) obj);
            }
        }));
        this.affiliatePromotionsCacheSub = intlMeetLikersFrag.duringCreated(CoreModule.f17545c.f19696x0.m30212q4()).subscribe(mkd0.m154955G(new e30() { // from class: l.leo
            @Override // p149l.e30
            public final void call(Object obj) {
                meo.m154274a(this.f127729a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static void m154274a(meo meoVar, Boolean bool) {
        meoVar.m154288o();
    }

    /* JADX INFO: renamed from: b */
    public static void m154275b(meo meoVar, Boolean bool) {
        meoVar.m154288o();
    }

    /* JADX INFO: renamed from: c */
    public static void m154276c(meo meoVar, IapAffiliatePromotion iapAffiliatePromotion, View view) {
        Act act = meoVar.frag.act();
        if (act == null) {
            return;
        }
        s1n.m182010f(act, iapAffiliatePromotion, s1n.m182006b(meoVar.m154284k()));
        CoreModule.m29935P().m94656g().mo35089zr(act, meoVar.m154285l());
    }

    /* JADX INFO: renamed from: d */
    public final void m154277d(IntlDiscountEntryBannerView b, boolean stopCountdown) {
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
    public final void m154278e(IntlDiscountEntryBannerView b) {
        xdl0.m208344M(b, true);
        if (this.discountEntryVibrationExposureHeld) {
            return;
        }
        this.discountEntryVibrationExposureHeld = true;
        i1n.INSTANCE.m133997a();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX INFO: renamed from: f */
    public final void m154279f(IntlDiscountEntryBannerView b, IapAffiliatePromotionDisplaySlot slot) {
        String string;
        String string2;
        String string3;
        String str = null;
        if (this.seePoolHasUsers) {
            String str2 = slot.seePoolHasUserMainTitle;
            string = str2 != null ? StringsKt.m93433Z0(str2).toString() : null;
            if (string == null) {
                string = "";
            }
        } else {
            String str3 = slot.seePoolNoUserMainTitle;
            string = str3 != null ? StringsKt.m93433Z0(str3).toString() : null;
            if (string == null) {
                string = "";
            }
        }
        String str4 = slot.mainTitle;
        String string4 = str4 != null ? StringsKt.m93433Z0(str4).toString() : null;
        if (string4 == null) {
            string4 = "";
        }
        String str5 = slot.titleLine1;
        String string5 = str5 != null ? StringsKt.m93433Z0(str5).toString() : null;
        if (string5 == null) {
            string5 = "";
        }
        if (string.length() <= 0) {
            if (string4.length() > 0) {
                string = string4;
            } else {
                string = string5.length() > 0 ? string5 : "";
            }
        }
        if (string.length() <= 0) {
            string = null;
        }
        b.setHeadline(string);
        if (this.seePoolHasUsers) {
            String str6 = slot.seePoolHasUserSubtitle;
            string2 = str6 != null ? StringsKt.m93433Z0(str6).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
        } else {
            String str7 = slot.seePoolNoUserSubtitle;
            string2 = str7 != null ? StringsKt.m93433Z0(str7).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
        }
        String str8 = slot.subtitle;
        String string6 = str8 != null ? StringsKt.m93433Z0(str8).toString() : null;
        if (string6 == null) {
            string6 = "";
        }
        if (string2.length() <= 0) {
            string2 = string6.length() > 0 ? string6 : "";
        }
        if (string2.length() > 0) {
            b.setSubtitle(string2);
            b.setSubtitleVisible(true);
        } else {
            b.setSubtitle(null);
            b.setSubtitleVisible(false);
        }
        String str9 = slot.buttonText;
        String string7 = str9 != null ? StringsKt.m93433Z0(str9).toString() : null;
        String str10 = string7 != null ? string7 : "";
        if (str10.length() <= 0) {
            str10 = null;
        }
        b.setCtaText(str10);
        String str11 = slot.digitBackground;
        if (str11 != null && (string3 = StringsKt.m93433Z0(str11).toString()) != null && string3.length() > 0) {
            str = string3;
        }
        b.setCountdownDigitBackgroundArgbHex(str);
    }

    /* JADX INFO: renamed from: g */
    public final void m154280g(@NotNull FrameLayout container) {
        Context context;
        container.getClass();
        m154283j();
        if (this.banner == null && (context = this.frag.getContext()) != null) {
            IntlDiscountEntryBannerView intlDiscountEntryBannerView = new IntlDiscountEntryBannerView(context, null, 0, 6, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(t100.m186890d(12.0f));
            layoutParams.setMarginEnd(t100.m186890d(12.0f));
            layoutParams.topMargin = t100.m186890d(4.0f);
            layoutParams.bottomMargin = t100.m186890d(8.0f);
            container.addView(intlDiscountEntryBannerView, layoutParams);
            this.banner = intlDiscountEntryBannerView;
            m154288o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087 A[PHI: r12
      0x0087: PHI (r12v23 java.lang.String) = (r12v7 java.lang.String), (r12v10 java.lang.String) binds: [B:49:0x0085, B:55:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX INFO: renamed from: h */
    public final CharSequence m154281h(IapAffiliatePromotionDisplaySlot slot) {
        String string;
        String string2;
        String str;
        String string3;
        if (this.seePoolHasUsers) {
            String str2 = slot.seePoolHasUserMainTitle;
            string = str2 != null ? StringsKt.m93433Z0(str2).toString() : null;
            if (string == null) {
                string = "";
            }
        } else {
            String str3 = slot.seePoolNoUserMainTitle;
            string = str3 != null ? StringsKt.m93433Z0(str3).toString() : null;
            if (string == null) {
                string = "";
            }
        }
        if (string.length() <= 0) {
            String str4 = slot.mainTitle;
            string = str4 != null ? StringsKt.m93433Z0(str4).toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() <= 0) {
                String str5 = slot.titleLine1;
                string = str5 != null ? StringsKt.m93433Z0(str5).toString() : null;
                if (string == null) {
                    string = "";
                }
            }
        }
        if (this.seePoolHasUsers) {
            String str6 = slot.seePoolHasUserSubtitle;
            string2 = str6 != null ? StringsKt.m93433Z0(str6).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
        } else {
            String str7 = slot.seePoolNoUserSubtitle;
            string2 = str7 != null ? StringsKt.m93433Z0(str7).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
        }
        if (string2.length() <= 0) {
            String str8 = slot.subtitle;
            string2 = str8 != null ? StringsKt.m93433Z0(str8).toString() : null;
            str = string2 != null ? string2 : "";
        }
        if (string.length() <= 0) {
            string = null;
        }
        if (str.length() <= 0) {
            str = null;
        }
        String str9 = slot.buttonText;
        if (str9 == null || (string3 = StringsKt.m93433Z0(str9).toString()) == null || string3.length() <= 0) {
            string3 = null;
        }
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{string, str, string3});
        if (listListOfNotNull.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(listListOfNotNull, ", ", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m154282i() {
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
            m154277d(intlDiscountEntryBannerView, true);
        }
        this.banner = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m154283j() {
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null && intlDiscountEntryBannerView.getParent() == null) {
            m154277d(intlDiscountEntryBannerView, true);
            this.banner = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab m154284k() {
        return this.frag.m39381R4() ? CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MEET_LIKERS_NEW_SEE : CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.SEE_STANDALONE_OLD_SEE;
    }

    /* JADX INFO: renamed from: l */
    public final String m154285l() {
        return this.frag.m39381R4() ? "p_meet_view,e_intl_meet_see_new_see_discount_entry_banner,click" : "p_intl_plm_view,e_intl_see_standalone_old_see_discount_entry_banner,click";
    }

    /* JADX INFO: renamed from: m */
    public final void m154286m() {
        m154288o();
    }

    /* JADX INFO: renamed from: n */
    public final IntlDiscountEntryTheme m154287n(String raw) {
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

    /* JADX INFO: renamed from: o */
    public final void m154288o() {
        String string;
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView == null) {
            return;
        }
        CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTabM154284k = m154284k();
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f17545c.f19696x0;
        if (!coreIntlAffiliatePromotions.m30185M3(intlAffiliateDiscountEntryTabM154284k)) {
            m154277d(intlDiscountEntryBannerView, true);
            return;
        }
        final IapAffiliatePromotion iapAffiliatePromotionM30170D3 = coreIntlAffiliatePromotions.m30170D3(intlAffiliateDiscountEntryTabM154284k);
        if (iapAffiliatePromotionM30170D3 == null) {
            m154277d(intlDiscountEntryBannerView, true);
            return;
        }
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM30175G3 = coreIntlAffiliatePromotions.m30175G3(iapAffiliatePromotionM30170D3, intlAffiliateDiscountEntryTabM154284k);
        if (iapAffiliatePromotionDisplaySlotM30175G3 == null) {
            m154277d(intlDiscountEntryBannerView, true);
            return;
        }
        if (this.frag.act() == null) {
            m154277d(intlDiscountEntryBannerView, false);
            return;
        }
        m154278e(intlDiscountEntryBannerView);
        intlDiscountEntryBannerView.setEntryTheme(m154287n(iapAffiliatePromotionDisplaySlotM30175G3.theme));
        intlDiscountEntryBannerView.setBadgeText(null);
        String str = iapAffiliatePromotionDisplaySlotM30175G3.imgUrl;
        if (str == null || (string = StringsKt.m93433Z0(str).toString()) == null || string.length() <= 0) {
            string = null;
        }
        intlDiscountEntryBannerView.setBadgeImageUrl(string);
        m154279f(intlDiscountEntryBannerView, iapAffiliatePromotionDisplaySlotM30175G3);
        long jM30173F3 = coreIntlAffiliatePromotions.m30173F3(iapAffiliatePromotionM30170D3);
        if (jM30173F3 <= mqi0.m155944o()) {
            intlDiscountEntryBannerView.m53968t();
        } else {
            intlDiscountEntryBannerView.m53967r(jM30173F3, coreIntlAffiliatePromotions.m30176G4(iapAffiliatePromotionM30170D3) ? iapAffiliatePromotionM30170D3 : null);
        }
        intlDiscountEntryBannerView.setOnBannerClickListener(new View.OnClickListener() { // from class: l.jeo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                meo.m154276c(this.f117590a, iapAffiliatePromotionM30170D3, view);
            }
        });
        intlDiscountEntryBannerView.setBannerContentDescription(m154281h(iapAffiliatePromotionDisplaySlotM30175G3));
    }

    /* JADX INFO: renamed from: p */
    public final void m154289p(boolean hasUsers) {
        this.seePoolHasUsers = hasUsers;
    }
}
