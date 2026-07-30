package p009l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreIntlAffiliatePromotions;
import com.p1.mobile.putong.core.api.c;
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
import l.d30;
import l.e30;
import l.e51;
import l.i1n;
import l.kwo;
import l.m4p;
import l.mkd0;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010\u001bJ\u000f\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u000f\u0010#\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010\u001bJ\u000f\u0010$\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010\u001bJ\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\u001fJ\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b+\u0010*J\u001f\u0010.\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u0004\u0018\u0001002\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010C\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010F\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\u0018\u0010H\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010<R\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010<R\u0016\u0010N\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010<R\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010P¨\u0006S"}, d2 = {"Ll/n1n;", "", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Ll/o1n;", "placement", "", "nullBannerOnDestroy", "Ll/d30;", "onAffiliatePrefetchTerminal", "<init>", "(Lcom/p1/mobile/putong/app/PutongFrag;Ll/o1n;ZLl/d30;)V", "Landroid/widget/LinearLayout;", "parent", "Landroid/view/View;", "insertBefore", "", "i", "(Landroid/widget/LinearLayout;Landroid/view/View;)V", "Landroid/widget/FrameLayout;", "container", "", "topMarginDp", "bottomMarginDp", "g", "(Landroid/widget/FrameLayout;FF)V", "o", "()V", "q", "hidden", "s", "(Z)V", "k", "w", "n", "l", "r", "visible", "e", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "b", "m", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;)V", "v", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;", "slot", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)V", "", "j", "(Lcom/p1/mobile/putong/core/data/IapAffiliatePromotionDisplaySlot;)Ljava/lang/CharSequence;", "", "raw", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "p", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "a", "Lcom/p1/mobile/putong/app/PutongFrag;", "Ll/o1n;", "c", "Z", "d", "Ll/d30;", "getOnBannerContainerHidden", "()Ll/d30;", "t", "(Ll/d30;)V", "onBannerContainerHidden", "getOnBannerContainerShown", "u", "onBannerContainerShown", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "banner", "h", "Landroid/widget/FrameLayout;", "frameContainer", "forceHidden", "affiliatePrefetchTerminalNotified", "discountEntryVibrationExposureHeld", "Ll/c4g0;", "Ll/c4g0;", "affiliateCountdownResyncSub", "affiliatePromotionsCacheSub", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        c cVar = CoreModule.c;
        if (cVar != null) {
            this.affiliateCountdownResyncSub = putongFrag.duringCreated(cVar.x0.p4()).subscribe(mkd0.G(new e30() { // from class: l.m1n
                public final void call(Object obj) {
                    n1n.m18734b(this.f16485a, (Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m18733a(n1n n1nVar) {
        if (n1nVar.frag.act() == null) {
            return;
        }
        n1nVar.m18749q();
    }

    /* JADX INFO: renamed from: b */
    public static void m18734b(n1n n1nVar, Boolean bool) {
        n1nVar.m18749q();
    }

    /* JADX INFO: renamed from: c */
    public static void m18735c(n1n n1nVar, IapAffiliatePromotion iapAffiliatePromotion, View view) {
        Act act = n1nVar.frag.act();
        if (act == null) {
            return;
        }
        m4p.j(act, iapAffiliatePromotion, m4p.e(n1nVar.placement.getDiscountEntryTab()));
        kwo.m(act, n1nVar.placement.getPurchaseNavigationFrom(), (e30) null, (d30) null, (d30) null, 28, (Object) null);
    }

    /* JADX INFO: renamed from: d */
    public static void m18736d(n1n n1nVar, Boolean bool) {
        n1nVar.m18749q();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m18737h(n1n n1nVar, FrameLayout frameLayout, float f, float f2, int i, Object obj) {
        if ((i & 4) != 0) {
            f2 = 8.0f;
        }
        n1nVar.m18740g(frameLayout, f, f2);
    }

    /* JADX INFO: renamed from: e */
    public final void m18738e(boolean visible) {
        FrameLayout frameLayout;
        if (this.placement.getDiscountEntryTab() == CoreIntlAffiliatePromotions.IntlAffiliateDiscountEntryTab.MESSAGE_TAB && (frameLayout = this.frameContainer) != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            int i = visible ? -t100.d(14.0f) : 0;
            if (marginLayoutParams.bottomMargin != i) {
                marginLayoutParams.bottomMargin = i;
                frameLayout.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m18739f(IntlDiscountEntryBannerView b, IapAffiliatePromotionDisplaySlot slot) {
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

    /* JADX INFO: renamed from: g */
    public final void m18740g(@NotNull FrameLayout container, float topMarginDp, float bottomMarginDp) {
        Context context;
        container.getClass();
        m18744l();
        if (this.banner == null && (context = this.frag.getContext()) != null) {
            View intlDiscountEntryBannerView = new IntlDiscountEntryBannerView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(t100.d(12.0f));
            layoutParams.setMarginEnd(t100.d(12.0f));
            layoutParams.topMargin = t100.d(topMarginDp);
            layoutParams.bottomMargin = t100.d(bottomMarginDp);
            container.addView(intlDiscountEntryBannerView, layoutParams);
            this.frameContainer = container;
            this.banner = intlDiscountEntryBannerView;
            m18755w();
            m18749q();
            m18750r();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m18741i(@NotNull LinearLayout parent, @NotNull View insertBefore) {
        int iIndexOfChild;
        Context context;
        parent.getClass();
        insertBefore.getClass();
        m18744l();
        if (this.banner == null && (iIndexOfChild = parent.indexOfChild(insertBefore)) >= 0 && (context = this.frag.getContext()) != null) {
            View intlDiscountEntryBannerView = new IntlDiscountEntryBannerView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(t100.d(12.0f));
            layoutParams.setMarginEnd(t100.d(12.0f));
            layoutParams.bottomMargin = t100.d(8.0f);
            intlDiscountEntryBannerView.setLayoutParams(layoutParams);
            parent.addView(intlDiscountEntryBannerView, iIndexOfChild);
            this.banner = intlDiscountEntryBannerView;
            m18755w();
            m18749q();
            m18750r();
        }
    }

    /* JADX INFO: renamed from: j */
    public final CharSequence m18742j(IapAffiliatePromotionDisplaySlot slot) {
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

    /* JADX INFO: renamed from: k */
    public final void m18743k() {
        if (this.discountEntryVibrationExposureHeld) {
            this.discountEntryVibrationExposureHeld = false;
            i1n.INSTANCE.f();
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
            intlDiscountEntryBannerView.t();
        }
        if (this.nullBannerOnDestroy) {
            this.banner = null;
        }
        this.frameContainer = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m18744l() {
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null && intlDiscountEntryBannerView.getParent() == null) {
            intlDiscountEntryBannerView.t();
            this.banner = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m18745m(IntlDiscountEntryBannerView b) {
        if (this.discountEntryVibrationExposureHeld) {
            this.discountEntryVibrationExposureHeld = false;
            i1n.INSTANCE.f();
        }
        m18738e(false);
        xdl0.M(b, false);
        b.t();
        FrameLayout frameLayout = this.frameContainer;
        if (frameLayout != null) {
            xdl0.M(frameLayout, false);
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
    public final void m18746n() {
        if (this.affiliatePrefetchTerminalNotified || this.onAffiliatePrefetchTerminal == null || !CoreModule.c.x0.W3()) {
            return;
        }
        this.affiliatePrefetchTerminalNotified = true;
        d30 d30Var = this.onAffiliatePrefetchTerminal;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m18747o() {
        m18749q();
    }

    /* JADX INFO: renamed from: p */
    public final IntlDiscountEntryTheme m18748p(String raw) {
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

    /* JADX INFO: renamed from: q */
    public final void m18749q() {
        String string;
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView == null) {
            return;
        }
        CoreIntlAffiliatePromotions coreIntlAffiliatePromotions = CoreModule.c.x0;
        if (this.forceHidden) {
            m18745m(intlDiscountEntryBannerView);
            return;
        }
        m18746n();
        o1n o1nVar = this.placement;
        coreIntlAffiliatePromotions.getClass();
        if (!o1nVar.mo19599a(coreIntlAffiliatePromotions)) {
            m18745m(intlDiscountEntryBannerView);
            return;
        }
        final IapAffiliatePromotion iapAffiliatePromotionMo19601c = this.placement.mo19601c(coreIntlAffiliatePromotions);
        if (iapAffiliatePromotionMo19601c == null) {
            m18745m(intlDiscountEntryBannerView);
            return;
        }
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotMo19602d = this.placement.mo19602d(coreIntlAffiliatePromotions, iapAffiliatePromotionMo19601c);
        if (iapAffiliatePromotionDisplaySlotMo19602d == null) {
            m18745m(intlDiscountEntryBannerView);
            return;
        }
        if (this.frag.act() == null) {
            m18745m(intlDiscountEntryBannerView);
            return;
        }
        long jF3 = CoreModule.c.x0.F3(iapAffiliatePromotionMo19601c);
        if (jF3 <= mqi0.m18550o() && CoreModule.c.x0.G4(iapAffiliatePromotionMo19601c)) {
            CoreModule.c.x0.o4(iapAffiliatePromotionMo19601c.promotionHitId);
            m18745m(intlDiscountEntryBannerView);
            return;
        }
        m18754v(intlDiscountEntryBannerView);
        intlDiscountEntryBannerView.setEntryTheme(m18748p(iapAffiliatePromotionDisplaySlotMo19602d.theme));
        intlDiscountEntryBannerView.setBadgeText((CharSequence) null);
        String str = iapAffiliatePromotionDisplaySlotMo19602d.imgUrl;
        if (str == null || (string = StringsKt.Z0(str).toString()) == null || string.length() <= 0) {
            string = null;
        }
        intlDiscountEntryBannerView.setBadgeImageUrl(string);
        m18739f(intlDiscountEntryBannerView, iapAffiliatePromotionDisplaySlotMo19602d);
        if (jF3 <= mqi0.m18550o()) {
            intlDiscountEntryBannerView.t();
        } else {
            intlDiscountEntryBannerView.r(jF3, CoreModule.c.x0.G4(iapAffiliatePromotionMo19601c) ? iapAffiliatePromotionMo19601c : null);
        }
        intlDiscountEntryBannerView.setOnBannerClickListener(new View.OnClickListener() { // from class: l.k1n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n1n.m18735c(this.f15388a, iapAffiliatePromotionMo19601c, view);
            }
        });
        intlDiscountEntryBannerView.setBannerContentDescription(m18742j(iapAffiliatePromotionDisplaySlotMo19602d));
    }

    /* JADX INFO: renamed from: r */
    public final void m18750r() {
        if (this.frag.act() == null) {
            return;
        }
        e51.G(new Runnable() { // from class: l.l1n
            @Override // java.lang.Runnable
            public final void run() {
                n1n.m18733a(this.f15912a);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m18751s(boolean hidden) {
        if (this.forceHidden == hidden) {
            return;
        }
        this.forceHidden = hidden;
        if (!hidden) {
            m18749q();
            return;
        }
        IntlDiscountEntryBannerView intlDiscountEntryBannerView = this.banner;
        if (intlDiscountEntryBannerView != null) {
            m18745m(intlDiscountEntryBannerView);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m18752t(@Nullable d30 d30Var) {
        this.onBannerContainerHidden = d30Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m18753u(@Nullable d30 d30Var) {
        this.onBannerContainerShown = d30Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m18754v(IntlDiscountEntryBannerView b) {
        m18738e(true);
        FrameLayout frameLayout = this.frameContainer;
        if (frameLayout != null) {
            xdl0.M(frameLayout, true);
        }
        xdl0.M(b, true);
        if (!this.discountEntryVibrationExposureHeld) {
            this.discountEntryVibrationExposureHeld = true;
            i1n.INSTANCE.a();
        }
        d30 d30Var = this.onBannerContainerShown;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m18755w() {
        if (this.affiliatePromotionsCacheSub != null) {
            return;
        }
        this.affiliatePromotionsCacheSub = this.frag.duringCreated(CoreModule.c.x0.q4()).subscribe(mkd0.G(new e30() { // from class: l.j1n
            public final void call(Object obj) {
                n1n.m18736d(this.f14914a, (Boolean) obj);
            }
        }));
    }

    public /* synthetic */ n1n(PutongFrag putongFrag, o1n o1nVar, boolean z, d30 d30Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(putongFrag, o1nVar, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : d30Var);
    }
}
