package p009l;

import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p002ui.intllikedusers.IntlLikedUsersAct;
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
import l.mkd0;
import l.s1n;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010,¨\u0006/"}, d2 = {"Ll/sqn;", "", "Lcom/p1/mobile/putong/core/ui/intllikedusers/IntlLikedUsersAct;", "act", "Ll/zqn;", "presenter", "<init>", "(Lcom/p1/mobile/putong/core/ui/intllikedusers/IntlLikedUsersAct;Ll/zqn;)V", "Landroid/widget/FrameLayout;", "container", "", "e", "(Landroid/widget/FrameLayout;)V", "i", "()V", "k", "g", "h", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "b", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;", "slot", "d", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)V", "", "f", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)Ljava/lang/CharSequence;", "", "raw", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "j", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "a", "Lcom/p1/mobile/putong/core/ui/intllikedusers/IntlLikedUsersAct;", "Ll/zqn;", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "c", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "tab", "Ljava/lang/String;", "purchaseFrom", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "banner", "Ll/c4g0;", "Ll/c4g0;", "affiliateCountdownResyncSub", "affiliatePromotionsCacheSub", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        this.affiliateCountdownResyncSub = intlLikedUsersAct.duringCreated(CoreModule.c.x0.p4()).subscribe(mkd0.G(new e30() { // from class: l.pqn
            public final void call(Object obj) {
                sqn.m22349c(this.f18843a, (Boolean) obj);
            }
        }));
        this.affiliatePromotionsCacheSub = intlLikedUsersAct.duringCreated(CoreModule.c.x0.q4()).subscribe(mkd0.G(new e30() { // from class: l.qqn
            public final void call(Object obj) {
                sqn.m22347a(this.f19463a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static void m22347a(sqn sqnVar, Boolean bool) {
        sqnVar.m22357k();
    }

    /* JADX INFO: renamed from: b */
    public static void m22348b(sqn sqnVar, IapAffiliatePromotion iapAffiliatePromotion, View view) {
        s1n.f(sqnVar.act, iapAffiliatePromotion, s1n.b(sqnVar.tab));
        sqnVar.presenter.m25933g1(sqnVar.purchaseFrom);
    }

    /* JADX INFO: renamed from: c */
    public static void m22349c(sqn sqnVar, Boolean bool) {
        sqnVar.m22357k();
    }

    /* JADX INFO: renamed from: d */
    public final void m22350d(IntlDiscountEntryBannerView b, IapAffiliatePromotionDisplaySlot slot) {
        String string;
        String str = slot.mainTitle;
        String str2 = null;
        String string2 = str != null ? StringsKt.Z0(str).toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        if (string2.length() <= 0) {
            string2 = null;
        }
        b.setHeadline(string2);
        String str3 = slot.subtitle;
        String string3 = str3 != null ? StringsKt.Z0(str3).toString() : null;
        if (string3 == null) {
            string3 = "";
        }
        if (string3.length() > 0) {
            b.setSubtitle(string3);
            b.setSubtitleVisible(true);
        } else {
            b.setSubtitle((CharSequence) null);
            b.setSubtitleVisible(false);
        }
        String str4 = slot.buttonText;
        String string4 = str4 != null ? StringsKt.Z0(str4).toString() : null;
        String str5 = string4 != null ? string4 : "";
        if (str5.length() <= 0) {
            str5 = null;
        }
        b.setCtaText(str5);
        String str6 = slot.digitBackground;
        if (str6 != null && (string = StringsKt.Z0(str6).toString()) != null && string.length() > 0) {
            str2 = string;
        }
        b.setCountdownDigitBackgroundArgbHex(str2);
    }

    /* JADX INFO: renamed from: e */
    public final void m22351e(@NotNull FrameLayout container) {
        container.getClass();
        m22354h();
        if (this.banner != null) {
            return;
        }
        View intlDiscountEntryBannerView = new IntlDiscountEntryBannerView(this.act, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(t100.d(12.0f));
        layoutParams.setMarginEnd(t100.d(12.0f));
        layoutParams.topMargin = t100.d(4.0f);
        layoutParams.bottomMargin = t100.d(8.0f);
        container.addView(intlDiscountEntryBannerView, layoutParams);
        this.banner = intlDiscountEntryBannerView;
        m22357k();
    }

    /* JADX INFO: renamed from: f */
    public final CharSequence m22352f(IapAffiliatePromotionDisplaySlot slot) {
        String string;
        String string2;
        String string3;
        String str = slot.mainTitle;
        if (str == null || (string = StringsKt.Z0(str).toString()) == null || string.length() <= 0) {
            string = null;
        }
        String str2 = slot.subtitle;
        if (str2 == null || (string2 = StringsKt.Z0(str2).toString()) == null || string2.length() <= 0) {
            string2 = null;
        }
        String str3 = slot.buttonText;
        if (str3 == null || (string3 = StringsKt.Z0(str3).toString()) == null || string3.length() <= 0) {
            string3 = null;
        }
        List listListOfNotNull = CollectionsKt.listOfNotNull(new String[]{string, string2, string3});
        if (listListOfNotNull.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(listListOfNotNull, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    /* JADX INFO: renamed from: g */
    public final void m22353g() {
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
            intlDiscountEntryBannerView.t();
        }
        this.banner = null;
    }

    /* JADX INFO: renamed from: h */
    public final void m22354h() {
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null && intlDiscountEntryBannerView.getParent() == null) {
            intlDiscountEntryBannerView.t();
            this.banner = null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m22355i() {
        m22357k();
    }

    /* JADX INFO: renamed from: j */
    public final IntlDiscountEntryTheme m22356j(String raw) {
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

    /* JADX INFO: renamed from: k */
    public final void m22357k() {
        String string;
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView == null) {
            return;
        }
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.c.x0;
        if (!coreIntlAffiliatePromotions.M3(this.tab)) {
            xdl0.M(intlDiscountEntryBannerView, false);
            intlDiscountEntryBannerView.t();
            return;
        }
        final IapAffiliatePromotion iapAffiliatePromotionD3 = coreIntlAffiliatePromotions.D3(this.tab);
        if (iapAffiliatePromotionD3 == null) {
            xdl0.M(intlDiscountEntryBannerView, false);
            intlDiscountEntryBannerView.t();
            return;
        }
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotG3 = coreIntlAffiliatePromotions.G3(iapAffiliatePromotionD3, this.tab);
        if (iapAffiliatePromotionDisplaySlotG3 == null) {
            xdl0.M(intlDiscountEntryBannerView, false);
            intlDiscountEntryBannerView.t();
            return;
        }
        xdl0.M(intlDiscountEntryBannerView, true);
        intlDiscountEntryBannerView.setEntryTheme(m22356j(iapAffiliatePromotionDisplaySlotG3.theme));
        intlDiscountEntryBannerView.setBadgeText((CharSequence) null);
        String str = iapAffiliatePromotionDisplaySlotG3.imgUrl;
        if (str == null || (string = StringsKt.Z0(str).toString()) == null || string.length() <= 0) {
            string = null;
        }
        intlDiscountEntryBannerView.setBadgeImageUrl(string);
        m22350d(intlDiscountEntryBannerView, iapAffiliatePromotionDisplaySlotG3);
        long jF3 = coreIntlAffiliatePromotions.F3(iapAffiliatePromotionD3);
        if (jF3 <= mqi0.m18550o()) {
            intlDiscountEntryBannerView.t();
        } else {
            intlDiscountEntryBannerView.r(jF3, coreIntlAffiliatePromotions.G4(iapAffiliatePromotionD3) ? iapAffiliatePromotionD3 : null);
        }
        intlDiscountEntryBannerView.setOnBannerClickListener(new View.OnClickListener() { // from class: l.rqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sqn.m22348b(this.f19950a, iapAffiliatePromotionD3, view);
            }
        });
        intlDiscountEntryBannerView.setBannerContentDescription(m22352f(iapAffiliatePromotionDisplaySlotG3));
    }
}
