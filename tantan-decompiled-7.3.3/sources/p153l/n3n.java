package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.appsflyer.AdRevenueScheme;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.discountentry.IntlDiscountEntryBannerView;
import com.p051p1.mobile.putong.core.p058ui.purchase.intlpage.discountentry.IntlDiscountEntryTheme;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010\u001bJ\u000f\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u000f\u0010#\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010\u001bJ\u000f\u0010$\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010\u001bJ\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\u001fJ\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b+\u0010*J\u001f\u0010.\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u0004\u0018\u0001002\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010C\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010F\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\u0018\u0010H\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010<R\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010<R\u0016\u0010N\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010<R\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010P¨\u0006S"}, m88121d2 = {"Ll/n3n;", "", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Ll/o3n;", AdRevenueScheme.PLACEMENT, "", "nullBannerOnDestroy", "Ll/x20;", "onAffiliatePrefetchTerminal", "<init>", "(Lcom/p1/mobile/putong/app/PutongFrag;Ll/o3n;ZLl/x20;)V", "Landroid/widget/LinearLayout;", "parent", "Landroid/view/View;", "insertBefore", "", RXScreenCaptureService.KEY_INDEX, "(Landroid/widget/LinearLayout;Landroid/view/View;)V", "Landroid/widget/FrameLayout;", "container", "", "topMarginDp", "bottomMarginDp", "g", "(Landroid/widget/FrameLayout;FF)V", "o", "()V", "q", "hidden", BLiveStormDanmakuGiftResourceType.f45294s, "(Z)V", "k", "w", "n", BLiveStormDanmakuGiftResourceType.f45292l, "r", "visible", "e", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "b", "m", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;)V", ResourceDirection.f39656v, "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;", "slot", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)V", "", "j", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)Ljava/lang/CharSequence;", "", "raw", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "p", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "a", "Lcom/p1/mobile/putong/app/PutongFrag;", "Ll/o3n;", "c", "Z", Constants.INAPP_DATA_TAG, "Ll/x20;", "getOnBannerContainerHidden", "()Ll/x20;", Constants.KEY_T, "(Ll/x20;)V", "onBannerContainerHidden", "getOnBannerContainerShown", "u", "onBannerContainerShown", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "banner", "h", "Landroid/widget/FrameLayout;", "frameContainer", "forceHidden", "affiliatePrefetchTerminalNotified", "discountEntryVibrationExposureHeld", "Ll/kcg0;", "Ll/kcg0;", "affiliateCountdownResyncSub", "affiliatePromotionsCacheSub", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class n3n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PutongFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final o3n placement;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean nullBannerOnDestroy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final x20 onAffiliatePrefetchTerminal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public x20 onBannerContainerHidden;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public x20 onBannerContainerShown;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public IntlDiscountEntryBannerView banner;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public FrameLayout frameContainer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean forceHidden;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean affiliatePrefetchTerminalNotified;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean discountEntryVibrationExposureHeld;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public kcg0 affiliateCountdownResyncSub;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public kcg0 affiliatePromotionsCacheSub;

    public n3n(@NotNull PutongFrag putongFrag, @NotNull o3n o3nVar, boolean z, @Nullable x20 x20Var) {
        putongFrag.getClass();
        o3nVar.getClass();
        this.frag = putongFrag;
        this.placement = o3nVar;
        this.nullBannerOnDestroy = z;
        this.onAffiliatePrefetchTerminal = x20Var;
        C4883c c4883c = CoreModule.f18264c;
        if (c4883c != null) {
            this.affiliateCountdownResyncSub = putongFrag.duringCreated(c4883c.f20438x0.m31208p4()).subscribe(psd0.m173596G(new y20() { // from class: l.m3n
                @Override // p153l.y20
                public final void call(Object obj) {
                    n3n.m161327b(this.f134680a, (Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m161326a(n3n n3nVar) {
        if (n3nVar.frag.act() == null) {
            return;
        }
        n3nVar.m161342q();
    }

    /* JADX INFO: renamed from: b */
    public static void m161327b(n3n n3nVar, Boolean bool) {
        n3nVar.m161342q();
    }

    /* JADX INFO: renamed from: c */
    public static void m161328c(n3n n3nVar, IapAffiliatePromotion iapAffiliatePromotion, View view) {
        Act act = n3nVar.frag.act();
        if (act == null) {
            return;
        }
        m6p.m157250j(act, iapAffiliatePromotion, m6p.m157245e(n3nVar.placement.getDiscountEntryTab()));
        kyo.m152057m(act, n3nVar.placement.getPurchaseNavigationFrom(), null, null, null, 28, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m161329d(n3n n3nVar, Boolean bool) {
        n3nVar.m161342q();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m161330h(n3n n3nVar, FrameLayout frameLayout, float f, float f2, int i, Object obj) {
        if ((i & 4) != 0) {
            f2 = 8.0f;
        }
        n3nVar.m161333g(frameLayout, f, f2);
    }

    /* JADX INFO: renamed from: e */
    public final void m161331e(boolean visible) {
        FrameLayout frameLayout;
        if (this.placement.getDiscountEntryTab() == CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MESSAGE_TAB && (frameLayout = this.frameContainer) != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            int i = visible ? -qa00.m175859d(14.0f) : 0;
            if (marginLayoutParams.bottomMargin != i) {
                marginLayoutParams.bottomMargin = i;
                frameLayout.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m161332f(IntlDiscountEntryBannerView b, IapAffiliatePromotionDisplaySlot slot) {
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

    /* JADX INFO: renamed from: g */
    public final void m161333g(@NotNull FrameLayout container, float topMarginDp, float bottomMarginDp) {
        Context context;
        container.getClass();
        m161337l();
        if (this.banner == null && (context = this.frag.getContext()) != null) {
            IntlDiscountEntryBannerView intlDiscountEntryBannerView = new IntlDiscountEntryBannerView(context, null, 0, 6, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(qa00.m175859d(12.0f));
            layoutParams.setMarginEnd(qa00.m175859d(12.0f));
            layoutParams.topMargin = qa00.m175859d(topMarginDp);
            layoutParams.bottomMargin = qa00.m175859d(bottomMarginDp);
            container.addView(intlDiscountEntryBannerView, layoutParams);
            this.frameContainer = container;
            this.banner = intlDiscountEntryBannerView;
            m161348w();
            m161342q();
            m161343r();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m161334i(@NotNull LinearLayout parent, @NotNull View insertBefore) {
        int iIndexOfChild;
        Context context;
        parent.getClass();
        insertBefore.getClass();
        m161337l();
        if (this.banner == null && (iIndexOfChild = parent.indexOfChild(insertBefore)) >= 0 && (context = this.frag.getContext()) != null) {
            IntlDiscountEntryBannerView intlDiscountEntryBannerView = new IntlDiscountEntryBannerView(context, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(qa00.m175859d(12.0f));
            layoutParams.setMarginEnd(qa00.m175859d(12.0f));
            layoutParams.bottomMargin = qa00.m175859d(8.0f);
            intlDiscountEntryBannerView.setLayoutParams(layoutParams);
            parent.addView(intlDiscountEntryBannerView, iIndexOfChild);
            this.banner = intlDiscountEntryBannerView;
            m161348w();
            m161342q();
            m161343r();
        }
    }

    /* JADX INFO: renamed from: j */
    public final CharSequence m161335j(IapAffiliatePromotionDisplaySlot slot) {
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

    /* JADX INFO: renamed from: k */
    public final void m161336k() {
        if (this.discountEntryVibrationExposureHeld) {
            this.discountEntryVibrationExposureHeld = false;
            i3n.INSTANCE.m138328f();
        }
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
        if (this.nullBannerOnDestroy) {
            this.banner = null;
        }
        this.frameContainer = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m161337l() {
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null && intlDiscountEntryBannerView.getParent() == null) {
            intlDiscountEntryBannerView.m55151t();
            this.banner = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m161338m(IntlDiscountEntryBannerView b) {
        if (this.discountEntryVibrationExposureHeld) {
            this.discountEntryVibrationExposureHeld = false;
            i3n.INSTANCE.m138328f();
        }
        m161331e(false);
        bnl0.m105524M(b, false);
        b.m55151t();
        FrameLayout frameLayout = this.frameContainer;
        if (frameLayout != null) {
            bnl0.m105524M(frameLayout, false);
            Object parent = frameLayout.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                view.requestLayout();
            }
        }
        x20 x20Var = this.onBannerContainerHidden;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m161339n() {
        if (this.affiliatePrefetchTerminalNotified || this.onAffiliatePrefetchTerminal == null || !CoreModule.f18264c.f20438x0.m31189W3()) {
            return;
        }
        this.affiliatePrefetchTerminalNotified = true;
        x20 x20Var = this.onAffiliatePrefetchTerminal;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m161340o() {
        m161342q();
    }

    /* JADX INFO: renamed from: p */
    public final IntlDiscountEntryTheme m161341p(String raw) {
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

    /* JADX INFO: renamed from: q */
    public final void m161342q() {
        String string;
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView == null) {
            return;
        }
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f18264c.f20438x0;
        if (this.forceHidden) {
            m161338m(intlDiscountEntryBannerView);
            return;
        }
        m161339n();
        o3n o3nVar = this.placement;
        coreIntlAffiliatePromotions.getClass();
        if (!o3nVar.mo165875a(coreIntlAffiliatePromotions)) {
            m161338m(intlDiscountEntryBannerView);
            return;
        }
        final IapAffiliatePromotion iapAffiliatePromotionMo165877c = this.placement.mo165877c(coreIntlAffiliatePromotions);
        if (iapAffiliatePromotionMo165877c == null) {
            m161338m(intlDiscountEntryBannerView);
            return;
        }
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotMo165878d = this.placement.mo165878d(coreIntlAffiliatePromotions, iapAffiliatePromotionMo165877c);
        if (iapAffiliatePromotionDisplaySlotMo165878d == null) {
            m161338m(intlDiscountEntryBannerView);
            return;
        }
        if (this.frag.act() == null) {
            m161338m(intlDiscountEntryBannerView);
            return;
        }
        long jM31171F3 = CoreModule.f18264c.f20438x0.m31171F3(iapAffiliatePromotionMo165877c);
        if (jM31171F3 <= pzi0.m174454o() && CoreModule.f18264c.f20438x0.m31174G4(iapAffiliatePromotionMo165877c)) {
            CoreModule.f18264c.f20438x0.m31206o4(iapAffiliatePromotionMo165877c.promotionHitId);
            m161338m(intlDiscountEntryBannerView);
            return;
        }
        m161347v(intlDiscountEntryBannerView);
        intlDiscountEntryBannerView.setEntryTheme(m161341p(iapAffiliatePromotionDisplaySlotMo165878d.theme));
        intlDiscountEntryBannerView.setBadgeText(null);
        String str = iapAffiliatePromotionDisplaySlotMo165878d.imgUrl;
        if (str == null || (string = StringsKt.m94324Z0(str).toString()) == null || string.length() <= 0) {
            string = null;
        }
        intlDiscountEntryBannerView.setBadgeImageUrl(string);
        m161332f(intlDiscountEntryBannerView, iapAffiliatePromotionDisplaySlotMo165878d);
        if (jM31171F3 <= pzi0.m174454o()) {
            intlDiscountEntryBannerView.m55151t();
        } else {
            intlDiscountEntryBannerView.m55150r(jM31171F3, CoreModule.f18264c.f20438x0.m31174G4(iapAffiliatePromotionMo165877c) ? iapAffiliatePromotionMo165877c : null);
        }
        intlDiscountEntryBannerView.setOnBannerClickListener(new View.OnClickListener() { // from class: l.k3n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n3n.m161328c(this.f123727a, iapAffiliatePromotionMo165877c, view);
            }
        });
        intlDiscountEntryBannerView.setBannerContentDescription(m161335j(iapAffiliatePromotionDisplaySlotMo165878d));
    }

    /* JADX INFO: renamed from: r */
    public final void m161343r() {
        if (this.frag.act() == null) {
            return;
        }
        l51.m152887G(new Runnable() { // from class: l.l3n
            @Override // java.lang.Runnable
            public final void run() {
                n3n.m161326a(this.f129893a);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m161344s(boolean hidden) {
        if (this.forceHidden == hidden) {
            return;
        }
        this.forceHidden = hidden;
        if (!hidden) {
            m161342q();
            return;
        }
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null) {
            m161338m(intlDiscountEntryBannerView);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m161345t(@Nullable x20 x20Var) {
        this.onBannerContainerHidden = x20Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m161346u(@Nullable x20 x20Var) {
        this.onBannerContainerShown = x20Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m161347v(IntlDiscountEntryBannerView b) {
        m161331e(true);
        FrameLayout frameLayout = this.frameContainer;
        if (frameLayout != null) {
            bnl0.m105524M(frameLayout, true);
        }
        bnl0.m105524M(b, true);
        if (!this.discountEntryVibrationExposureHeld) {
            this.discountEntryVibrationExposureHeld = true;
            i3n.INSTANCE.m138323a();
        }
        x20 x20Var = this.onBannerContainerShown;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m161348w() {
        if (this.affiliatePromotionsCacheSub != null) {
            return;
        }
        this.affiliatePromotionsCacheSub = this.frag.duringCreated(CoreModule.f18264c.f20438x0.m31210q4()).subscribe(psd0.m173596G(new y20() { // from class: l.j3n
            @Override // p153l.y20
            public final void call(Object obj) {
                n3n.m161329d(this.f118197a, (Boolean) obj);
            }
        }));
    }

    public /* synthetic */ n3n(PutongFrag putongFrag, o3n o3nVar, boolean z, x20 x20Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(putongFrag, o3nVar, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : x20Var);
    }
}
