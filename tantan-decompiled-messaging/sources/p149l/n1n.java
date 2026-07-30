package p149l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.appsflyer.AdRevenueScheme;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.discountentry.IntlDiscountEntryBannerView;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.discountentry.IntlDiscountEntryTheme;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010\u001bJ\u000f\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u000f\u0010#\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010\u001bJ\u000f\u0010$\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010\u001bJ\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\u001fJ\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b+\u0010*J\u001f\u0010.\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u0004\u0018\u0001002\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010C\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010F\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\u0018\u0010H\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010<R\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010<R\u0016\u0010N\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010<R\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010P¨\u0006S"}, m87232d2 = {"Ll/n1n;", "", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Ll/o1n;", AdRevenueScheme.PLACEMENT, "", "nullBannerOnDestroy", "Ll/d30;", "onAffiliatePrefetchTerminal", "<init>", "(Lcom/p1/mobile/putong/app/PutongFrag;Ll/o1n;ZLl/d30;)V", "Landroid/widget/LinearLayout;", "parent", "Landroid/view/View;", "insertBefore", "", RXScreenCaptureService.KEY_INDEX, "(Landroid/widget/LinearLayout;Landroid/view/View;)V", "Landroid/widget/FrameLayout;", "container", "", "topMarginDp", "bottomMarginDp", "g", "(Landroid/widget/FrameLayout;FF)V", "o", "()V", "q", "hidden", BLiveStormDanmakuGiftResourceType.f44446s, "(Z)V", "k", "w", "n", BLiveStormDanmakuGiftResourceType.f44444l, "r", "visible", "e", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "b", "m", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;)V", ResourceDirection.f38808v, "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;", "slot", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)V", "", "j", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)Ljava/lang/CharSequence;", "", "raw", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "p", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "a", "Lcom/p1/mobile/putong/app/PutongFrag;", "Ll/o1n;", "c", "Z", Constants.INAPP_DATA_TAG, "Ll/d30;", "getOnBannerContainerHidden", "()Ll/d30;", Constants.KEY_T, "(Ll/d30;)V", "onBannerContainerHidden", "getOnBannerContainerShown", "u", "onBannerContainerShown", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "banner", "h", "Landroid/widget/FrameLayout;", "frameContainer", "forceHidden", "affiliatePrefetchTerminalNotified", "discountEntryVibrationExposureHeld", "Ll/c4g0;", "Ll/c4g0;", "affiliateCountdownResyncSub", "affiliatePromotionsCacheSub", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class n1n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PutongFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final o1n placement;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean nullBannerOnDestroy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final d30 onAffiliatePrefetchTerminal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public d30 onBannerContainerHidden;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public d30 onBannerContainerShown;

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
    public c4g0 affiliateCountdownResyncSub;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public c4g0 affiliatePromotionsCacheSub;

    public n1n(@NotNull PutongFrag putongFrag, @NotNull o1n o1nVar, boolean z, @Nullable d30 d30Var) {
        putongFrag.getClass();
        o1nVar.getClass();
        this.frag = putongFrag;
        this.placement = o1nVar;
        this.nullBannerOnDestroy = z;
        this.onAffiliatePrefetchTerminal = d30Var;
        C4732c c4732c = CoreModule.f17545c;
        if (c4732c != null) {
            this.affiliateCountdownResyncSub = putongFrag.duringCreated(c4732c.f19696x0.m30210p4()).subscribe(mkd0.m154955G(new e30() { // from class: l.m1n
                @Override // p149l.e30
                public final void call(Object obj) {
                    n1n.m157436b(this.f130838a, (Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m157435a(n1n n1nVar) {
        if (n1nVar.frag.act() == null) {
            return;
        }
        n1nVar.m157451q();
    }

    /* JADX INFO: renamed from: b */
    public static void m157436b(n1n n1nVar, Boolean bool) {
        n1nVar.m157451q();
    }

    /* JADX INFO: renamed from: c */
    public static void m157437c(n1n n1nVar, IapAffiliatePromotion iapAffiliatePromotion, View view) {
        Act act = n1nVar.frag.act();
        if (act == null) {
            return;
        }
        m4p.m153084j(act, iapAffiliatePromotion, m4p.m153079e(n1nVar.placement.getDiscountEntryTab()));
        kwo.m147618m(act, n1nVar.placement.getPurchaseNavigationFrom(), null, null, null, 28, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m157438d(n1n n1nVar, Boolean bool) {
        n1nVar.m157451q();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m157439h(n1n n1nVar, FrameLayout frameLayout, float f, float f2, int i, Object obj) {
        if ((i & 4) != 0) {
            f2 = 8.0f;
        }
        n1nVar.m157442g(frameLayout, f, f2);
    }

    /* JADX INFO: renamed from: e */
    public final void m157440e(boolean visible) {
        FrameLayout frameLayout;
        if (this.placement.getDiscountEntryTab() == CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MESSAGE_TAB && (frameLayout = this.frameContainer) != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            int i = visible ? -t100.m186890d(14.0f) : 0;
            if (marginLayoutParams.bottomMargin != i) {
                marginLayoutParams.bottomMargin = i;
                frameLayout.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m157441f(IntlDiscountEntryBannerView b, IapAffiliatePromotionDisplaySlot slot) {
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
    public final void m157442g(@NotNull FrameLayout container, float topMarginDp, float bottomMarginDp) {
        Context context;
        container.getClass();
        m157446l();
        if (this.banner == null && (context = this.frag.getContext()) != null) {
            IntlDiscountEntryBannerView intlDiscountEntryBannerView = new IntlDiscountEntryBannerView(context, null, 0, 6, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(t100.m186890d(12.0f));
            layoutParams.setMarginEnd(t100.m186890d(12.0f));
            layoutParams.topMargin = t100.m186890d(topMarginDp);
            layoutParams.bottomMargin = t100.m186890d(bottomMarginDp);
            container.addView(intlDiscountEntryBannerView, layoutParams);
            this.frameContainer = container;
            this.banner = intlDiscountEntryBannerView;
            m157457w();
            m157451q();
            m157452r();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m157443i(@NotNull LinearLayout parent, @NotNull View insertBefore) {
        int iIndexOfChild;
        Context context;
        parent.getClass();
        insertBefore.getClass();
        m157446l();
        if (this.banner == null && (iIndexOfChild = parent.indexOfChild(insertBefore)) >= 0 && (context = this.frag.getContext()) != null) {
            IntlDiscountEntryBannerView intlDiscountEntryBannerView = new IntlDiscountEntryBannerView(context, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(t100.m186890d(12.0f));
            layoutParams.setMarginEnd(t100.m186890d(12.0f));
            layoutParams.bottomMargin = t100.m186890d(8.0f);
            intlDiscountEntryBannerView.setLayoutParams(layoutParams);
            parent.addView(intlDiscountEntryBannerView, iIndexOfChild);
            this.banner = intlDiscountEntryBannerView;
            m157457w();
            m157451q();
            m157452r();
        }
    }

    /* JADX INFO: renamed from: j */
    public final CharSequence m157444j(IapAffiliatePromotionDisplaySlot slot) {
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

    /* JADX INFO: renamed from: k */
    public final void m157445k() {
        if (this.discountEntryVibrationExposureHeld) {
            this.discountEntryVibrationExposureHeld = false;
            i1n.INSTANCE.m134002f();
        }
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
        if (this.nullBannerOnDestroy) {
            this.banner = null;
        }
        this.frameContainer = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m157446l() {
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null && intlDiscountEntryBannerView.getParent() == null) {
            intlDiscountEntryBannerView.m53968t();
            this.banner = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m157447m(IntlDiscountEntryBannerView b) {
        if (this.discountEntryVibrationExposureHeld) {
            this.discountEntryVibrationExposureHeld = false;
            i1n.INSTANCE.m134002f();
        }
        m157440e(false);
        xdl0.m208344M(b, false);
        b.m53968t();
        FrameLayout frameLayout = this.frameContainer;
        if (frameLayout != null) {
            xdl0.m208344M(frameLayout, false);
            Object parent = frameLayout.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                view.requestLayout();
            }
        }
        d30 d30Var = this.onBannerContainerHidden;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m157448n() {
        if (this.affiliatePrefetchTerminalNotified || this.onAffiliatePrefetchTerminal == null || !CoreModule.f17545c.f19696x0.m30191W3()) {
            return;
        }
        this.affiliatePrefetchTerminalNotified = true;
        d30 d30Var = this.onAffiliatePrefetchTerminal;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m157449o() {
        m157451q();
    }

    /* JADX INFO: renamed from: p */
    public final IntlDiscountEntryTheme m157450p(String raw) {
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

    /* JADX INFO: renamed from: q */
    public final void m157451q() {
        String string;
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView == null) {
            return;
        }
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.f17545c.f19696x0;
        if (this.forceHidden) {
            m157447m(intlDiscountEntryBannerView);
            return;
        }
        m157448n();
        o1n o1nVar = this.placement;
        coreIntlAffiliatePromotions.getClass();
        if (!o1nVar.mo162263a(coreIntlAffiliatePromotions)) {
            m157447m(intlDiscountEntryBannerView);
            return;
        }
        final IapAffiliatePromotion iapAffiliatePromotionMo162265c = this.placement.mo162265c(coreIntlAffiliatePromotions);
        if (iapAffiliatePromotionMo162265c == null) {
            m157447m(intlDiscountEntryBannerView);
            return;
        }
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotMo162266d = this.placement.mo162266d(coreIntlAffiliatePromotions, iapAffiliatePromotionMo162265c);
        if (iapAffiliatePromotionDisplaySlotMo162266d == null) {
            m157447m(intlDiscountEntryBannerView);
            return;
        }
        if (this.frag.act() == null) {
            m157447m(intlDiscountEntryBannerView);
            return;
        }
        long jM30173F3 = CoreModule.f17545c.f19696x0.m30173F3(iapAffiliatePromotionMo162265c);
        if (jM30173F3 <= mqi0.m155944o() && CoreModule.f17545c.f19696x0.m30176G4(iapAffiliatePromotionMo162265c)) {
            CoreModule.f17545c.f19696x0.m30208o4(iapAffiliatePromotionMo162265c.promotionHitId);
            m157447m(intlDiscountEntryBannerView);
            return;
        }
        m157456v(intlDiscountEntryBannerView);
        intlDiscountEntryBannerView.setEntryTheme(m157450p(iapAffiliatePromotionDisplaySlotMo162266d.theme));
        intlDiscountEntryBannerView.setBadgeText(null);
        String str = iapAffiliatePromotionDisplaySlotMo162266d.imgUrl;
        if (str == null || (string = StringsKt.m93433Z0(str).toString()) == null || string.length() <= 0) {
            string = null;
        }
        intlDiscountEntryBannerView.setBadgeImageUrl(string);
        m157441f(intlDiscountEntryBannerView, iapAffiliatePromotionDisplaySlotMo162266d);
        if (jM30173F3 <= mqi0.m155944o()) {
            intlDiscountEntryBannerView.m53968t();
        } else {
            intlDiscountEntryBannerView.m53967r(jM30173F3, CoreModule.f17545c.f19696x0.m30176G4(iapAffiliatePromotionMo162265c) ? iapAffiliatePromotionMo162265c : null);
        }
        intlDiscountEntryBannerView.setOnBannerClickListener(new View.OnClickListener() { // from class: l.k1n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n1n.m157437c(this.f120633a, iapAffiliatePromotionMo162265c, view);
            }
        });
        intlDiscountEntryBannerView.setBannerContentDescription(m157444j(iapAffiliatePromotionDisplaySlotMo162266d));
    }

    /* JADX INFO: renamed from: r */
    public final void m157452r() {
        if (this.frag.act() == null) {
            return;
        }
        e51.m114742G(new Runnable() { // from class: l.l1n
            @Override // java.lang.Runnable
            public final void run() {
                n1n.m157435a(this.f125671a);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m157453s(boolean hidden) {
        if (this.forceHidden == hidden) {
            return;
        }
        this.forceHidden = hidden;
        if (!hidden) {
            m157451q();
            return;
        }
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null) {
            m157447m(intlDiscountEntryBannerView);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m157454t(@Nullable d30 d30Var) {
        this.onBannerContainerHidden = d30Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m157455u(@Nullable d30 d30Var) {
        this.onBannerContainerShown = d30Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m157456v(IntlDiscountEntryBannerView b) {
        m157440e(true);
        FrameLayout frameLayout = this.frameContainer;
        if (frameLayout != null) {
            xdl0.m208344M(frameLayout, true);
        }
        xdl0.m208344M(b, true);
        if (!this.discountEntryVibrationExposureHeld) {
            this.discountEntryVibrationExposureHeld = true;
            i1n.INSTANCE.m133997a();
        }
        d30 d30Var = this.onBannerContainerShown;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m157457w() {
        if (this.affiliatePromotionsCacheSub != null) {
            return;
        }
        this.affiliatePromotionsCacheSub = this.frag.duringCreated(CoreModule.f17545c.f19696x0.m30212q4()).subscribe(mkd0.m154955G(new e30() { // from class: l.j1n
            @Override // p149l.e30
            public final void call(Object obj) {
                n1n.m157438d(this.f115823a, (Boolean) obj);
            }
        }));
    }

    public /* synthetic */ n1n(PutongFrag putongFrag, o1n o1nVar, boolean z, d30 d30Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(putongFrag, o1nVar, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : d30Var);
    }
}
