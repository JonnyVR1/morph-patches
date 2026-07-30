package p153l;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.discountentry.IntlDiscountEntryBannerView;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.discountentry.IntlDiscountEntryTheme;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00100R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0014\u00106\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, m88121d2 = {"Ll/mgo;", "", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;)V", "", "hasUsers", "", "p", "(Z)V", "Landroid/widget/FrameLayout;", "container", "g", "(Landroid/widget/FrameLayout;)V", "m", "()V", "o", RXScreenCaptureService.KEY_INDEX, "j", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "b", "e", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;)V", "stopCountdown", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;Z)V", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;", "slot", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)V", "", "h", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)Ljava/lang/CharSequence;", "", "raw", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "n", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "Z", "seePoolHasUsers", "c", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "banner", "discountEntryVibrationExposureHeld", "Ll/kcg0;", "Ll/kcg0;", "affiliateCountdownResyncSub", "affiliatePromotionsCacheSub", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "k", "()Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "discountTab", BLiveStormDanmakuGiftResourceType.f45292l, "()Ljava/lang/String;", "purchaseFrom", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class mgo {

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
    public kcg0 affiliateCountdownResyncSub;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public kcg0 affiliatePromotionsCacheSub;

    public mgo(@NotNull IntlMeetLikersFrag intlMeetLikersFrag) {
        intlMeetLikersFrag.getClass();
        this.frag = intlMeetLikersFrag;
        this.seePoolHasUsers = true;
        this.affiliateCountdownResyncSub = intlMeetLikersFrag.duringCreated(CoreModule.f18264c.f20438x0.m31208p4()).subscribe(psd0.m173596G(new y20() { // from class: l.kgo
            @Override // p153l.y20
            public final void call(Object obj) {
                mgo.m158359b(this.f126636a, (Boolean) obj);
            }
        }));
        this.affiliatePromotionsCacheSub = intlMeetLikersFrag.duringCreated(CoreModule.f18264c.f20438x0.m31210q4()).subscribe(psd0.m173596G(new y20() { // from class: l.lgo
            @Override // p153l.y20
            public final void call(Object obj) {
                mgo.m158358a(this.f131991a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static void m158358a(mgo mgoVar, Boolean bool) {
        mgoVar.m158372o();
    }

    /* JADX INFO: renamed from: b */
    public static void m158359b(mgo mgoVar, Boolean bool) {
        mgoVar.m158372o();
    }

    /* JADX INFO: renamed from: c */
    public static void m158360c(mgo mgoVar, IapAffiliatePromotion iapAffiliatePromotion, View view) {
        Act act = mgoVar.frag.act();
        if (act == null) {
            return;
        }
        s3n.m184288f(act, iapAffiliatePromotion, s3n.m184284b(mgoVar.m158368k()));
        CoreModule.m30933P().m143410g().mo36092zr(act, mgoVar.m158369l());
    }

    /* JADX INFO: renamed from: d */
    public final void m158361d(IntlDiscountEntryBannerView b, boolean stopCountdown) {
        if (this.discountEntryVibrationExposureHeld) {
            this.discountEntryVibrationExposureHeld = false;
            i3n.INSTANCE.m138328f();
        }
        bnl0.m105524M(b, false);
        if (stopCountdown) {
            b.m55151t();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m158362e(IntlDiscountEntryBannerView b) {
        bnl0.m105524M(b, true);
        if (this.discountEntryVibrationExposureHeld) {
            return;
        }
        this.discountEntryVibrationExposureHeld = true;
        i3n.INSTANCE.m138323a();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX INFO: renamed from: f */
    public final void m158363f(IntlDiscountEntryBannerView b, IapAffiliatePromotionDisplaySlot slot) {
        String string;
        String string2;
        String string3;
        String str = null;
        if (this.seePoolHasUsers) {
            String str2 = slot.seePoolHasUserMainTitle;
            string = str2 != null ? StringsKt.m94324Z0(str2).toString() : null;
            if (string == null) {
                string = "";
            }
        } else {
            String str3 = slot.seePoolNoUserMainTitle;
            string = str3 != null ? StringsKt.m94324Z0(str3).toString() : null;
            if (string == null) {
                string = "";
            }
        }
        String str4 = slot.mainTitle;
        String string4 = str4 != null ? StringsKt.m94324Z0(str4).toString() : null;
        if (string4 == null) {
            string4 = "";
        }
        String str5 = slot.titleLine1;
        String string5 = str5 != null ? StringsKt.m94324Z0(str5).toString() : null;
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
            string2 = str6 != null ? StringsKt.m94324Z0(str6).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
        } else {
            String str7 = slot.seePoolNoUserSubtitle;
            string2 = str7 != null ? StringsKt.m94324Z0(str7).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
        }
        String str8 = slot.subtitle;
        String string6 = str8 != null ? StringsKt.m94324Z0(str8).toString() : null;
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
        String string7 = str9 != null ? StringsKt.m94324Z0(str9).toString() : null;
        String str10 = string7 != null ? string7 : "";
        if (str10.length() <= 0) {
            str10 = null;
        }
        b.setCtaText(str10);
        String str11 = slot.digitBackground;
        if (str11 != null && (string3 = StringsKt.m94324Z0(str11).toString()) != null && string3.length() > 0) {
            str = string3;
        }
        b.setCountdownDigitBackgroundArgbHex(str);
    }

    /* JADX INFO: renamed from: g */
    public final void m158364g(@NotNull FrameLayout container) {
        Context context;
        container.getClass();
        m158367j();
        if (this.banner == null && (context = this.frag.getContext()) != null) {
            IntlDiscountEntryBannerView intlDiscountEntryBannerView = new IntlDiscountEntryBannerView(context, null, 0, 6, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(qa00.m175859d(12.0f));
            layoutParams.setMarginEnd(qa00.m175859d(12.0f));
            layoutParams.topMargin = qa00.m175859d(4.0f);
            layoutParams.bottomMargin = qa00.m175859d(8.0f);
            container.addView(intlDiscountEntryBannerView, layoutParams);
            this.banner = intlDiscountEntryBannerView;
            m158372o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087 A[PHI: r12
      0x0087: PHI (r12v23 java.lang.String) = (r12v7 java.lang.String), (r12v10 java.lang.String) binds: [B:49:0x0085, B:55:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX INFO: renamed from: h */
    public final CharSequence m158365h(IapAffiliatePromotionDisplaySlot slot) {
        String string;
        String string2;
        String str;
        String string3;
        if (this.seePoolHasUsers) {
            String str2 = slot.seePoolHasUserMainTitle;
            string = str2 != null ? StringsKt.m94324Z0(str2).toString() : null;
            if (string == null) {
                string = "";
            }
        } else {
            String str3 = slot.seePoolNoUserMainTitle;
            string = str3 != null ? StringsKt.m94324Z0(str3).toString() : null;
            if (string == null) {
                string = "";
            }
        }
        if (string.length() <= 0) {
            String str4 = slot.mainTitle;
            string = str4 != null ? StringsKt.m94324Z0(str4).toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() <= 0) {
                String str5 = slot.titleLine1;
                string = str5 != null ? StringsKt.m94324Z0(str5).toString() : null;
                if (string == null) {
                    string = "";
                }
            }
        }
        if (this.seePoolHasUsers) {
            String str6 = slot.seePoolHasUserSubtitle;
            string2 = str6 != null ? StringsKt.m94324Z0(str6).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
        } else {
            String str7 = slot.seePoolNoUserSubtitle;
            string2 = str7 != null ? StringsKt.m94324Z0(str7).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
        }
        if (string2.length() <= 0) {
            String str8 = slot.subtitle;
            string2 = str8 != null ? StringsKt.m94324Z0(str8).toString() : null;
            str = string2 != null ? string2 : "";
        }
        if (string.length() <= 0) {
            string = null;
        }
        if (str.length() <= 0) {
            str = null;
        }
        String str9 = slot.buttonText;
        if (str9 == null || (string3 = StringsKt.m94324Z0(str9).toString()) == null || string3.length() <= 0) {
            string3 = null;
        }
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{string, str, string3});
        if (listListOfNotNull.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(listListOfNotNull, ", ", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m158366i() {
        kcg0 kcg0Var = this.affiliateCountdownResyncSub;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
        }
        this.affiliateCountdownResyncSub = null;
        kcg0 kcg0Var2 = this.affiliatePromotionsCacheSub;
        if (kcg0Var2 != null) {
            kcg0Var2.unsubscribe();
        }
        this.affiliatePromotionsCacheSub = null;
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null) {
            m158361d(intlDiscountEntryBannerView, true);
        }
        this.banner = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m158367j() {
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null && intlDiscountEntryBannerView.getParent() == null) {
            m158361d(intlDiscountEntryBannerView, true);
            this.banner = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab m158368k() {
        return this.frag.m40384R4() ? CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MEET_LIKERS_NEW_SEE : CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.SEE_STANDALONE_OLD_SEE;
    }

    /* JADX INFO: renamed from: l */
    public final String m158369l() {
        return this.frag.m40384R4() ? "p_meet_view,e_intl_meet_see_new_see_discount_entry_banner,click" : "p_intl_plm_view,e_intl_see_standalone_old_see_discount_entry_banner,click";
    }

    /* JADX INFO: renamed from: m */
    public final void m158370m() {
        m158372o();
    }

    /* JADX INFO: renamed from: n */
    public final IntlDiscountEntryTheme m158371n(String raw) {
        if (raw == null || StringsKt.m94329e0(raw)) {
            return IntlDiscountEntryTheme.THEME1;
        }
        String lowerCase = StringsKt.m94324Z0(raw).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (Intrinsics.m88377d(lowerCase, "theme2")) {
            return IntlDiscountEntryTheme.THEME2;
        }
        return Intrinsics.m88377d(lowerCase, "theme3") ? IntlDiscountEntryTheme.THEME3 : IntlDiscountEntryTheme.THEME1;
    }

    /* JADX INFO: renamed from: o */
    public final void m158372o() {
        String string;
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView == null) {
            return;
        }
        CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTabM158368k = m158368k();
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f18264c.f20438x0;
        if (!coreIntlAffiliatePromotions.m31183M3(intlAffiliateDiscountEntryTabM158368k)) {
            m158361d(intlDiscountEntryBannerView, true);
            return;
        }
        final IapAffiliatePromotion iapAffiliatePromotionM31168D3 = coreIntlAffiliatePromotions.m31168D3(intlAffiliateDiscountEntryTabM158368k);
        if (iapAffiliatePromotionM31168D3 == null) {
            m158361d(intlDiscountEntryBannerView, true);
            return;
        }
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM31173G3 = coreIntlAffiliatePromotions.m31173G3(iapAffiliatePromotionM31168D3, intlAffiliateDiscountEntryTabM158368k);
        if (iapAffiliatePromotionDisplaySlotM31173G3 == null) {
            m158361d(intlDiscountEntryBannerView, true);
            return;
        }
        if (this.frag.act() == null) {
            m158361d(intlDiscountEntryBannerView, false);
            return;
        }
        m158362e(intlDiscountEntryBannerView);
        intlDiscountEntryBannerView.setEntryTheme(m158371n(iapAffiliatePromotionDisplaySlotM31173G3.theme));
        intlDiscountEntryBannerView.setBadgeText(null);
        String str = iapAffiliatePromotionDisplaySlotM31173G3.imgUrl;
        if (str == null || (string = StringsKt.m94324Z0(str).toString()) == null || string.length() <= 0) {
            string = null;
        }
        intlDiscountEntryBannerView.setBadgeImageUrl(string);
        m158363f(intlDiscountEntryBannerView, iapAffiliatePromotionDisplaySlotM31173G3);
        long jM31171F3 = coreIntlAffiliatePromotions.m31171F3(iapAffiliatePromotionM31168D3);
        if (jM31171F3 <= pzi0.m174454o()) {
            intlDiscountEntryBannerView.m55151t();
        } else {
            intlDiscountEntryBannerView.m55150r(jM31171F3, coreIntlAffiliatePromotions.m31174G4(iapAffiliatePromotionM31168D3) ? iapAffiliatePromotionM31168D3 : null);
        }
        intlDiscountEntryBannerView.setOnBannerClickListener(new View.OnClickListener() { // from class: l.jgo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mgo.m158360c(this.f120750a, iapAffiliatePromotionM31168D3, view);
            }
        });
        intlDiscountEntryBannerView.setBannerContentDescription(m158365h(iapAffiliatePromotionDisplaySlotM31173G3));
    }

    /* JADX INFO: renamed from: p */
    public final void m158373p(boolean hasUsers) {
        this.seePoolHasUsers = hasUsers;
    }
}
