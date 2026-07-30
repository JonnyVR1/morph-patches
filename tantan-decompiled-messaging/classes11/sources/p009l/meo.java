package p009l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p1.mobile.putong.core.ui.purchase.intlpage.discountentry.IntlDiscountEntryBannerView;
import com.p1.mobile.putong.core.ui.purchase.intlpage.discountentry.IntlDiscountEntryTheme;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l.c4g0;
import l.e30;
import l.i1n;
import l.mkd0;
import l.s1n;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00100R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0014\u00106\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Ll/meo;", "", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;)V", "", "hasUsers", "", "p", "(Z)V", "Landroid/widget/FrameLayout;", "container", "g", "(Landroid/widget/FrameLayout;)V", "m", "()V", "o", "i", "j", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "b", "e", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;)V", "stopCountdown", "d", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;Z)V", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;", "slot", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)V", "", "h", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)Ljava/lang/CharSequence;", "", "raw", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "n", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/likers/IntlMeetLikersFrag;", "Z", "seePoolHasUsers", "c", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "banner", "discountEntryVibrationExposureHeld", "Ll/c4g0;", "Ll/c4g0;", "affiliateCountdownResyncSub", "affiliatePromotionsCacheSub", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "k", "()Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "discountTab", "l", "()Ljava/lang/String;", "purchaseFrom", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        this.affiliateCountdownResyncSub = intlMeetLikersFrag.duringCreated(CoreModule.c.x0.p4()).subscribe(mkd0.G(new e30() { // from class: l.keo
            public final void call(Object obj) {
                meo.m18427b(this.f15619a, (Boolean) obj);
            }
        }));
        this.affiliatePromotionsCacheSub = intlMeetLikersFrag.duringCreated(CoreModule.c.x0.q4()).subscribe(mkd0.G(new e30() { // from class: l.leo
            public final void call(Object obj) {
                meo.m18426a(this.f16120a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static void m18426a(meo meoVar, Boolean bool) {
        meoVar.m18440o();
    }

    /* JADX INFO: renamed from: b */
    public static void m18427b(meo meoVar, Boolean bool) {
        meoVar.m18440o();
    }

    /* JADX INFO: renamed from: c */
    public static void m18428c(meo meoVar, IapAffiliatePromotion iapAffiliatePromotion, View view) {
        Act act = meoVar.frag.act();
        if (act == null) {
            return;
        }
        s1n.f(act, iapAffiliatePromotion, s1n.b(meoVar.m18436k()));
        CoreModule.P().g().zr(act, meoVar.m18437l());
    }

    /* JADX INFO: renamed from: d */
    public final void m18429d(IntlDiscountEntryBannerView b, boolean stopCountdown) {
        if (this.discountEntryVibrationExposureHeld) {
            this.discountEntryVibrationExposureHeld = false;
            i1n.INSTANCE.f();
        }
        xdl0.M(b, false);
        if (stopCountdown) {
            b.t();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18430e(IntlDiscountEntryBannerView b) {
        xdl0.M(b, true);
        if (this.discountEntryVibrationExposureHeld) {
            return;
        }
        this.discountEntryVibrationExposureHeld = true;
        i1n.INSTANCE.a();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX INFO: renamed from: f */
    public final void m18431f(IntlDiscountEntryBannerView b, IapAffiliatePromotionDisplaySlot slot) {
        String string;
        String string2;
        String string3;
        String str = null;
        if (this.seePoolHasUsers) {
            String str2 = slot.seePoolHasUserMainTitle;
            string = str2 != null ? StringsKt.Z0(str2).toString() : null;
            if (string == null) {
                string = "";
            }
        } else {
            String str3 = slot.seePoolNoUserMainTitle;
            string = str3 != null ? StringsKt.Z0(str3).toString() : null;
            if (string == null) {
                string = "";
            }
        }
        String str4 = slot.mainTitle;
        String string4 = str4 != null ? StringsKt.Z0(str4).toString() : null;
        if (string4 == null) {
            string4 = "";
        }
        String str5 = slot.titleLine1;
        String string5 = str5 != null ? StringsKt.Z0(str5).toString() : null;
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
            string2 = str6 != null ? StringsKt.Z0(str6).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
        } else {
            String str7 = slot.seePoolNoUserSubtitle;
            string2 = str7 != null ? StringsKt.Z0(str7).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
        }
        String str8 = slot.subtitle;
        String string6 = str8 != null ? StringsKt.Z0(str8).toString() : null;
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
            b.setSubtitle((CharSequence) null);
            b.setSubtitleVisible(false);
        }
        String str9 = slot.buttonText;
        String string7 = str9 != null ? StringsKt.Z0(str9).toString() : null;
        String str10 = string7 != null ? string7 : "";
        if (str10.length() <= 0) {
            str10 = null;
        }
        b.setCtaText(str10);
        String str11 = slot.digitBackground;
        if (str11 != null && (string3 = StringsKt.Z0(str11).toString()) != null && string3.length() > 0) {
            str = string3;
        }
        b.setCountdownDigitBackgroundArgbHex(str);
    }

    /* JADX INFO: renamed from: g */
    public final void m18432g(@NotNull FrameLayout container) {
        Context context;
        container.getClass();
        m18435j();
        if (this.banner == null && (context = this.frag.getContext()) != null) {
            View intlDiscountEntryBannerView = new IntlDiscountEntryBannerView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(t100.d(12.0f));
            layoutParams.setMarginEnd(t100.d(12.0f));
            layoutParams.topMargin = t100.d(4.0f);
            layoutParams.bottomMargin = t100.d(8.0f);
            container.addView(intlDiscountEntryBannerView, layoutParams);
            this.banner = intlDiscountEntryBannerView;
            m18440o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087 A[PHI: r12
      0x0087: PHI (r12v23 java.lang.String) = (r12v7 java.lang.String), (r12v10 java.lang.String) binds: [B:49:0x0085, B:55:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX INFO: renamed from: h */
    public final CharSequence m18433h(IapAffiliatePromotionDisplaySlot slot) {
        String string;
        String string2;
        String str;
        String string3;
        if (this.seePoolHasUsers) {
            String str2 = slot.seePoolHasUserMainTitle;
            string = str2 != null ? StringsKt.Z0(str2).toString() : null;
            if (string == null) {
                string = "";
            }
        } else {
            String str3 = slot.seePoolNoUserMainTitle;
            string = str3 != null ? StringsKt.Z0(str3).toString() : null;
            if (string == null) {
                string = "";
            }
        }
        if (string.length() <= 0) {
            String str4 = slot.mainTitle;
            string = str4 != null ? StringsKt.Z0(str4).toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() <= 0) {
                String str5 = slot.titleLine1;
                string = str5 != null ? StringsKt.Z0(str5).toString() : null;
                if (string == null) {
                    string = "";
                }
            }
        }
        if (this.seePoolHasUsers) {
            String str6 = slot.seePoolHasUserSubtitle;
            string2 = str6 != null ? StringsKt.Z0(str6).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
        } else {
            String str7 = slot.seePoolNoUserSubtitle;
            string2 = str7 != null ? StringsKt.Z0(str7).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
        }
        if (string2.length() <= 0) {
            String str8 = slot.subtitle;
            string2 = str8 != null ? StringsKt.Z0(str8).toString() : null;
            str = string2 != null ? string2 : "";
        }
        if (string.length() <= 0) {
            string = null;
        }
        if (str.length() <= 0) {
            str = null;
        }
        String str9 = slot.buttonText;
        if (str9 == null || (string3 = StringsKt.Z0(str9).toString()) == null || string3.length() <= 0) {
            string3 = null;
        }
        List listListOfNotNull = CollectionsKt.listOfNotNull(new String[]{string, str, string3});
        if (listListOfNotNull.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(listListOfNotNull, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    /* JADX INFO: renamed from: i */
    public final void m18434i() {
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
            m18429d(intlDiscountEntryBannerView, true);
        }
        this.banner = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m18435j() {
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null && intlDiscountEntryBannerView.getParent() == null) {
            m18429d(intlDiscountEntryBannerView, true);
            this.banner = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab m18436k() {
        return this.frag.m3426R4() ? CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MEET_LIKERS_NEW_SEE : CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.SEE_STANDALONE_OLD_SEE;
    }

    /* JADX INFO: renamed from: l */
    public final String m18437l() {
        return this.frag.m3426R4() ? "p_meet_view,e_intl_meet_see_new_see_discount_entry_banner,click" : "p_intl_plm_view,e_intl_see_standalone_old_see_discount_entry_banner,click";
    }

    /* JADX INFO: renamed from: m */
    public final void m18438m() {
        m18440o();
    }

    /* JADX INFO: renamed from: n */
    public final IntlDiscountEntryTheme m18439n(String raw) {
        if (raw == null || StringsKt.e0(raw)) {
            return IntlDiscountEntryTheme.THEME1;
        }
        String lowerCase = StringsKt.Z0(raw).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (Intrinsics.d(lowerCase, "theme2")) {
            return IntlDiscountEntryTheme.THEME2;
        }
        return Intrinsics.d(lowerCase, "theme3") ? IntlDiscountEntryTheme.THEME3 : IntlDiscountEntryTheme.THEME1;
    }

    /* JADX INFO: renamed from: o */
    public final void m18440o() {
        String string;
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView == null) {
            return;
        }
        CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab intlAffiliateDiscountEntryTabM18436k = m18436k();
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.c.x0;
        if (!coreIntlAffiliatePromotions.M3(intlAffiliateDiscountEntryTabM18436k)) {
            m18429d(intlDiscountEntryBannerView, true);
            return;
        }
        final IapAffiliatePromotion iapAffiliatePromotionD3 = coreIntlAffiliatePromotions.D3(intlAffiliateDiscountEntryTabM18436k);
        if (iapAffiliatePromotionD3 == null) {
            m18429d(intlDiscountEntryBannerView, true);
            return;
        }
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotG3 = coreIntlAffiliatePromotions.G3(iapAffiliatePromotionD3, intlAffiliateDiscountEntryTabM18436k);
        if (iapAffiliatePromotionDisplaySlotG3 == null) {
            m18429d(intlDiscountEntryBannerView, true);
            return;
        }
        if (this.frag.act() == null) {
            m18429d(intlDiscountEntryBannerView, false);
            return;
        }
        m18430e(intlDiscountEntryBannerView);
        intlDiscountEntryBannerView.setEntryTheme(m18439n(iapAffiliatePromotionDisplaySlotG3.theme));
        intlDiscountEntryBannerView.setBadgeText((CharSequence) null);
        String str = iapAffiliatePromotionDisplaySlotG3.imgUrl;
        if (str == null || (string = StringsKt.Z0(str).toString()) == null || string.length() <= 0) {
            string = null;
        }
        intlDiscountEntryBannerView.setBadgeImageUrl(string);
        m18431f(intlDiscountEntryBannerView, iapAffiliatePromotionDisplaySlotG3);
        long jF3 = coreIntlAffiliatePromotions.F3(iapAffiliatePromotionD3);
        if (jF3 <= mqi0.m18550o()) {
            intlDiscountEntryBannerView.t();
        } else {
            intlDiscountEntryBannerView.r(jF3, coreIntlAffiliatePromotions.G4(iapAffiliatePromotionD3) ? iapAffiliatePromotionD3 : null);
        }
        intlDiscountEntryBannerView.setOnBannerClickListener(new View.OnClickListener() { // from class: l.jeo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                meo.m18428c(this.f15082a, iapAffiliatePromotionD3, view);
            }
        });
        intlDiscountEntryBannerView.setBannerContentDescription(m18433h(iapAffiliatePromotionDisplaySlotG3));
    }

    /* JADX INFO: renamed from: p */
    public final void m18441p(boolean hasUsers) {
        this.seePoolHasUsers = hasUsers;
    }
}
