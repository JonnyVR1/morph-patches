package p153l;

import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p051p1.mobile.putong.core.p058ui.intl.visitor.IntlVisitorsAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.discountentry.IntlDiscountEntryBannerView;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.discountentry.IntlDiscountEntryTheme;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010+¨\u0006."}, m88121d2 = {"Ll/yop;", "", "Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsAct;", SocialConstants.PARAM_ACT, "Ll/eqp;", "presenter", "<init>", "(Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsAct;Ll/eqp;)V", "Landroid/widget/FrameLayout;", "container", "", "e", "(Landroid/widget/FrameLayout;)V", "j", "()V", "g", "h", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "b", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;", "slot", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)V", "", "f", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)Ljava/lang/CharSequence;", "", "raw", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "a", "Lcom/p1/mobile/putong/core/ui/intl/visitor/IntlVisitorsAct;", "Ll/eqp;", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "c", "Lcom/p1/mobile/putong/core/api/CoreIntlAffiliatePromotions$IntlAffiliateDiscountEntryTab;", "tab", "Ljava/lang/String;", "purchaseFrom", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "banner", "Ll/kcg0;", "Ll/kcg0;", "affiliateCountdownResyncSub", "affiliatePromotionsCacheSub", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class yop {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlVisitorsAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final eqp presenter;

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
    public kcg0 affiliateCountdownResyncSub;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public kcg0 affiliatePromotionsCacheSub;

    public yop(@NotNull IntlVisitorsAct intlVisitorsAct, @NotNull eqp eqpVar) {
        intlVisitorsAct.getClass();
        eqpVar.getClass();
        this.act = intlVisitorsAct;
        this.presenter = eqpVar;
        this.tab = CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.ME_TAB_VISITORS_OLD_VISITOR;
        this.purchaseFrom = "p_intl_visitors_list,e_intl_me_tab_visitors_old_visitor_discount_entry_banner,click";
        this.affiliateCountdownResyncSub = intlVisitorsAct.duringCreated(CoreModule.f18264c.f20438x0.m31208p4()).subscribe(psd0.m173596G(new y20() { // from class: l.wop
            @Override // p153l.y20
            public final void call(Object obj) {
                yop.m216979a(this.f190060a, (Boolean) obj);
            }
        }));
        this.affiliatePromotionsCacheSub = intlVisitorsAct.duringCreated(CoreModule.f18264c.f20438x0.m31210q4()).subscribe(psd0.m173596G(new y20() { // from class: l.xop
            @Override // p153l.y20
            public final void call(Object obj) {
                yop.m216981c(this.f195591a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a */
    public static void m216979a(yop yopVar, Boolean bool) {
        yopVar.m216988j();
    }

    /* JADX INFO: renamed from: b */
    public static void m216980b(yop yopVar, IapAffiliatePromotion iapAffiliatePromotion, View view) {
        s3n.m184288f(yopVar.act, iapAffiliatePromotion, s3n.m184284b(yopVar.tab));
        yopVar.presenter.m122027V0(yopVar.purchaseFrom);
    }

    /* JADX INFO: renamed from: c */
    public static void m216981c(yop yopVar, Boolean bool) {
        yopVar.m216988j();
    }

    /* JADX INFO: renamed from: d */
    public final void m216982d(IntlDiscountEntryBannerView b, IapAffiliatePromotionDisplaySlot slot) {
        String string;
        String str = slot.mainTitle;
        String str2 = null;
        String string2 = str != null ? StringsKt.m94324Z0(str).toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        if (string2.length() <= 0) {
            string2 = null;
        }
        b.setHeadline(string2);
        String str3 = slot.subtitle;
        String string3 = str3 != null ? StringsKt.m94324Z0(str3).toString() : null;
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
        String string4 = str4 != null ? StringsKt.m94324Z0(str4).toString() : null;
        String str5 = string4 != null ? string4 : "";
        if (str5.length() <= 0) {
            str5 = null;
        }
        b.setCtaText(str5);
        String str6 = slot.digitBackground;
        if (str6 != null && (string = StringsKt.m94324Z0(str6).toString()) != null && string.length() > 0) {
            str2 = string;
        }
        b.setCountdownDigitBackgroundArgbHex(str2);
    }

    /* JADX INFO: renamed from: e */
    public final void m216983e(@NotNull FrameLayout container) {
        container.getClass();
        m216986h();
        if (this.banner != null) {
            return;
        }
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = new IntlDiscountEntryBannerView(this.act, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(qa00.m175859d(12.0f));
        layoutParams.setMarginEnd(qa00.m175859d(12.0f));
        layoutParams.topMargin = qa00.m175859d(4.0f);
        layoutParams.bottomMargin = qa00.m175859d(8.0f);
        container.addView(intlDiscountEntryBannerView, layoutParams);
        this.banner = intlDiscountEntryBannerView;
        m216988j();
    }

    /* JADX INFO: renamed from: f */
    public final CharSequence m216984f(IapAffiliatePromotionDisplaySlot slot) {
        String string;
        String string2;
        String string3;
        String str = slot.mainTitle;
        if (str == null || (string = StringsKt.m94324Z0(str).toString()) == null || string.length() <= 0) {
            string = null;
        }
        String str2 = slot.subtitle;
        if (str2 == null || (string2 = StringsKt.m94324Z0(str2).toString()) == null || string2.length() <= 0) {
            string2 = null;
        }
        String str3 = slot.buttonText;
        if (str3 == null || (string3 = StringsKt.m94324Z0(str3).toString()) == null || string3.length() <= 0) {
            string3 = null;
        }
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{string, string2, string3});
        if (listListOfNotNull.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(listListOfNotNull, ", ", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m216985g() {
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
            intlDiscountEntryBannerView.m55151t();
        }
        this.banner = null;
    }

    /* JADX INFO: renamed from: h */
    public final void m216986h() {
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null && intlDiscountEntryBannerView.getParent() == null) {
            intlDiscountEntryBannerView.m55151t();
            this.banner = null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final IntlDiscountEntryTheme m216987i(String raw) {
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

    /* JADX INFO: renamed from: j */
    public final void m216988j() {
        String string;
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView == null) {
            return;
        }
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f18264c.f20438x0;
        if (!coreIntlAffiliatePromotions.m31183M3(this.tab)) {
            bnl0.m105524M(intlDiscountEntryBannerView, false);
            intlDiscountEntryBannerView.m55151t();
            return;
        }
        final IapAffiliatePromotion iapAffiliatePromotionM31168D3 = coreIntlAffiliatePromotions.m31168D3(this.tab);
        if (iapAffiliatePromotionM31168D3 == null) {
            bnl0.m105524M(intlDiscountEntryBannerView, false);
            intlDiscountEntryBannerView.m55151t();
            return;
        }
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM31173G3 = coreIntlAffiliatePromotions.m31173G3(iapAffiliatePromotionM31168D3, this.tab);
        if (iapAffiliatePromotionDisplaySlotM31173G3 == null) {
            bnl0.m105524M(intlDiscountEntryBannerView, false);
            intlDiscountEntryBannerView.m55151t();
            return;
        }
        bnl0.m105524M(intlDiscountEntryBannerView, true);
        intlDiscountEntryBannerView.setEntryTheme(m216987i(iapAffiliatePromotionDisplaySlotM31173G3.theme));
        intlDiscountEntryBannerView.setBadgeText(null);
        String str = iapAffiliatePromotionDisplaySlotM31173G3.imgUrl;
        if (str == null || (string = StringsKt.m94324Z0(str).toString()) == null || string.length() <= 0) {
            string = null;
        }
        intlDiscountEntryBannerView.setBadgeImageUrl(string);
        m216982d(intlDiscountEntryBannerView, iapAffiliatePromotionDisplaySlotM31173G3);
        long jM31171F3 = coreIntlAffiliatePromotions.m31171F3(iapAffiliatePromotionM31168D3);
        if (jM31171F3 <= pzi0.m174454o()) {
            intlDiscountEntryBannerView.m55151t();
        } else {
            intlDiscountEntryBannerView.m55150r(jM31171F3, coreIntlAffiliatePromotions.m31174G4(iapAffiliatePromotionM31168D3) ? iapAffiliatePromotionM31168D3 : null);
        }
        intlDiscountEntryBannerView.setOnBannerClickListener(new View.OnClickListener() { // from class: l.vop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yop.m216980b(this.f185069a, iapAffiliatePromotionM31168D3, view);
            }
        });
        intlDiscountEntryBannerView.setBannerContentDescription(m216984f(iapAffiliatePromotionDisplaySlotM31173G3));
    }
}
