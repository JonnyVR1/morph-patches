package com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.discountentry;

import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.IntlMarketToken;
import com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.discountentry.IntlDiscountEntryBannerView;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.C15167a;
import kotlin.ranges.IntRange;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.AutoVDraweeView;
import p147v.VText_NoTopPadding;
import p149l.d1n;
import p149l.d2c0;
import p149l.eqh0;
import p149l.i1c0;
import p149l.i5c0;
import p149l.k8n;
import p149l.l9r;
import p149l.r9c0;
import p149l.v6c0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u0010J\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u0010J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020'H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u0010J\u0015\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020/¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b<\u00108J\u0017\u0010=\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b=\u00108J\u0015\u0010?\u001a\u00020\f2\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\b?\u0010\u000eJ\u0017\u0010@\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b@\u00108J#\u0010D\u001a\u00020\f2\u0006\u0010A\u001a\u00020'2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010BH\u0007¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\f2\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\f2\b\u0010J\u001a\u0004\u0018\u000105¢\u0006\u0004\bK\u00108J\u0017\u0010M\u001a\u00020\f2\b\u0010L\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bM\u0010;J\r\u0010N\u001a\u00020\f¢\u0006\u0004\bN\u0010\u0010J\u000f\u0010O\u001a\u00020\fH\u0014¢\u0006\u0004\bO\u0010\u0010R\u0016\u0010R\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010T\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010SR\u0018\u0010U\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010SR\u0018\u0010V\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010SR\u0018\u0010W\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010SR\u0016\u0010Y\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010XR\u0016\u0010[\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010ZR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\\R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010^R\u0018\u0010a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010cR\u0018\u0010f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010gR\u0018\u0010j\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010gR\u0018\u0010k\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010gR\u0018\u0010m\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010gR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010s\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010r¨\u0006t"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryBannerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "rebind", "", "g", "(Z)V", "h", "()V", "", "Lv/VText_NoTopPadding;", "j", "()Ljava/util/List;", "m", "()I", "n", Constants.INAPP_DATA_TAG, "argb", "Landroid/graphics/drawable/GradientDrawable;", BLiveStormDanmakuGiftResourceType.f44444l, "(I)Landroid/graphics/drawable/GradientDrawable;", "", "raw", "o", "(Ljava/lang/String;)Ljava/lang/Integer;", "b", "c", "u", "e", "f", "q", "", "millisUntilFinished", "p", "(J)V", ResourceDirection.f38808v, "k", "(J)Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", IntlMarketToken.theme, "setEntryTheme", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;)V", "getEntryTheme", "()Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "", "text", "setBadgeText", "(Ljava/lang/CharSequence;)V", "url", "setBadgeImageUrl", "(Ljava/lang/String;)V", "setHeadline", "setSubtitle", "visible", "setSubtitleVisible", "setCtaText", "endTimeMs", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", "affiliatePromotionForPersistedTicks", "r", "(JLcom/p1/mobile/putong/core/data/IapAffiliatePromotion;)V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnBannerClickListener", "(Landroid/view/View$OnClickListener;)V", "description", "setBannerContentDescription", "hex", "setCountdownDigitBackgroundArgbHex", Constants.KEY_T, "onDetachedFromWindow", "a", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/discountentry/IntlDiscountEntryTheme;", "entryTheme", "Ljava/lang/CharSequence;", "badgeText", "headlineText", "subtitleText", "ctaText", "Z", "subtitleRowVisible", "J", "countdownEndMs", "Lcom/p1/mobile/putong/core/data/IapAffiliatePromotion;", "Ll/d1n;", "Ll/d1n;", "affiliateDiscountCountdownManager", "Ljava/lang/Integer;", "countdownDigitBackgroundColorArgb", "Lv/AutoVDraweeView;", "Lv/AutoVDraweeView;", "badgeView", "Ljava/lang/String;", "badgeImageUrl", "Lv/VText_NoTopPadding;", "headlineView", "subtitleView", "ctaView", "timerH", "timerM", "timerS", BLiveStormDanmakuGiftResourceType.f44446s, "Ljava/util/List;", "countdownColonViews", "Landroid/view/View;", "Landroid/view/View;", "rootClick", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class IntlDiscountEntryBannerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public IntlDiscountEntryTheme entryTheme;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public CharSequence badgeText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public CharSequence headlineText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public CharSequence subtitleText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public CharSequence ctaText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean subtitleRowVisible;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long countdownEndMs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public IapAffiliatePromotion affiliatePromotionForPersistedTicks;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final d1n affiliateDiscountCountdownManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public Integer countdownDigitBackgroundColorArgb;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public AutoVDraweeView badgeView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public String badgeImageUrl;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public VText_NoTopPadding headlineView;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public VText_NoTopPadding subtitleView;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public VText_NoTopPadding ctaView;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public VText_NoTopPadding timerH;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public VText_NoTopPadding timerM;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public VText_NoTopPadding timerS;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public List<? extends VText_NoTopPadding> countdownColonViews;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public View rootClick;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.intlpage.discountentry.IntlDiscountEntryBannerView$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8772a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34775a;

        static {
            int[] iArr = new int[IntlDiscountEntryTheme.values().length];
            try {
                iArr[IntlDiscountEntryTheme.THEME1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IntlDiscountEntryTheme.THEME2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IntlDiscountEntryTheme.THEME3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34775a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlDiscountEntryBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.entryTheme = IntlDiscountEntryTheme.THEME1;
        this.subtitleRowVisible = true;
        this.affiliateDiscountCountdownManager = new d1n();
        this.countdownColonViews = CollectionsKt.emptyList();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.f158341n, i, 0);
            typedArrayObtainStyledAttributes.getClass();
            try {
                int i2 = typedArrayObtainStyledAttributes.getInt(r9c0.f158342o, 0);
                IntlDiscountEntryTheme[] intlDiscountEntryThemeArrValues = IntlDiscountEntryTheme.values();
                this.entryTheme = intlDiscountEntryThemeArrValues[C15167a.m87601g(i2, 0, intlDiscountEntryThemeArrValues.length - 1)];
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        m53956g(false);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m53949a(IntlDiscountEntryBannerView intlDiscountEntryBannerView, long j) {
        intlDiscountEntryBannerView.m53965p(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m53950s(IntlDiscountEntryBannerView intlDiscountEntryBannerView, long j, IapAffiliatePromotion iapAffiliatePromotion, int i, Object obj) {
        if ((i & 2) != 0) {
            iapAffiliatePromotion = null;
        }
        intlDiscountEntryBannerView.m53967r(j, iapAffiliatePromotion);
    }

    /* JADX INFO: renamed from: b */
    public final void m53951b() {
        AutoVDraweeView autoVDraweeView = this.badgeView;
        if (autoVDraweeView != null) {
            autoVDraweeView.setContentDescription(this.badgeText);
        }
        VText_NoTopPadding vText_NoTopPadding = this.headlineView;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(this.headlineText);
        }
        VText_NoTopPadding vText_NoTopPadding2 = this.subtitleView;
        if (vText_NoTopPadding2 != null) {
            vText_NoTopPadding2.setText(this.subtitleText);
        }
        VText_NoTopPadding vText_NoTopPadding3 = this.ctaView;
        if (vText_NoTopPadding3 != null) {
            vText_NoTopPadding3.setText(this.ctaText);
        }
        m53952c();
        m53969u();
    }

    /* JADX INFO: renamed from: c */
    public final void m53952c() {
        String string;
        AutoVDraweeView autoVDraweeView = this.badgeView;
        if (autoVDraweeView == null) {
            return;
        }
        String str = this.badgeImageUrl;
        String str2 = null;
        if (str != null && (string = StringsKt.m93433Z0(str).toString()) != null && string.length() > 0) {
            str2 = string;
        }
        if (str2 == null) {
            autoVDraweeView.setVisibility(8);
        } else {
            autoVDraweeView.setVisibility(0);
            autoVDraweeView.m222887x(str2, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m53953d() {
        Integer num = this.countdownDigitBackgroundColorArgb;
        if (num != null) {
            int iIntValue = num.intValue();
            VText_NoTopPadding vText_NoTopPadding = this.timerH;
            if (vText_NoTopPadding != null) {
                vText_NoTopPadding.setBackground(m53961l(iIntValue));
            }
            VText_NoTopPadding vText_NoTopPadding2 = this.timerM;
            if (vText_NoTopPadding2 != null) {
                vText_NoTopPadding2.setBackground(m53961l(iIntValue));
            }
            VText_NoTopPadding vText_NoTopPadding3 = this.timerS;
            if (vText_NoTopPadding3 != null) {
                vText_NoTopPadding3.setBackground(m53961l(iIntValue));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m53954e() {
        VText_NoTopPadding vText_NoTopPadding;
        IntlDiscountEntryTheme intlDiscountEntryTheme = this.entryTheme;
        IntlDiscountEntryTheme intlDiscountEntryTheme2 = IntlDiscountEntryTheme.THEME2;
        if ((intlDiscountEntryTheme == intlDiscountEntryTheme2 || intlDiscountEntryTheme == IntlDiscountEntryTheme.THEME3) && (vText_NoTopPadding = this.headlineView) != null) {
            vText_NoTopPadding.setTextColor(App.f15369e.getColor(intlDiscountEntryTheme == intlDiscountEntryTheme2 ? i1c0.f110442e : i1c0.f110444g));
            vText_NoTopPadding.setTextSize(2, 13.0f);
            vText_NoTopPadding.setTypeface(eqh0.m117752c(3), 0);
            m53955f();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m53955f() {
        View view;
        CharSequence charSequence;
        IntlDiscountEntryTheme intlDiscountEntryTheme = this.entryTheme;
        if ((intlDiscountEntryTheme == IntlDiscountEntryTheme.THEME2 || intlDiscountEntryTheme == IntlDiscountEntryTheme.THEME3) && (view = this.rootClick) != null) {
            boolean z = (!this.subtitleRowVisible || (charSequence = this.subtitleText) == null || StringsKt.m93438e0(charSequence)) ? false : true;
            int dimensionPixelSize = getResources().getDimensionPixelSize(d2c0.f83350e);
            if (z) {
                view.setMinimumHeight(getResources().getDimensionPixelSize(d2c0.f83347b));
                view.setPadding(dimensionPixelSize, getResources().getDimensionPixelSize(d2c0.f83352g), dimensionPixelSize, getResources().getDimensionPixelSize(d2c0.f83349d));
            } else {
                view.setMinimumHeight(getResources().getDimensionPixelSize(d2c0.f83346a));
                view.setPadding(dimensionPixelSize, getResources().getDimensionPixelSize(d2c0.f83351f), dimensionPixelSize, getResources().getDimensionPixelSize(d2c0.f83348c));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m53956g(boolean rebind) {
        int i;
        m53958i();
        removeAllViews();
        int i2 = C8772a.f34775a[this.entryTheme.ordinal()];
        if (i2 == 1) {
            i = v6c0.f180180c;
        } else if (i2 == 2) {
            i = v6c0.f180181d;
        } else {
            if (i2 != 3) {
                l9r.m149037a();
                return;
            }
            i = v6c0.f180182e;
        }
        LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, true);
        m53957h();
        if (!rebind) {
            m53969u();
        } else {
            m53951b();
            m53966q();
        }
    }

    @NotNull
    public final IntlDiscountEntryTheme getEntryTheme() {
        return this.entryTheme;
    }

    /* JADX INFO: renamed from: h */
    public final void m53957h() {
        this.rootClick = findViewById(i5c0.f111550k);
        this.headlineView = (VText_NoTopPadding) findViewById(i5c0.f111549j);
        this.badgeView = (AutoVDraweeView) findViewById(i5c0.f111547h);
        this.timerH = (VText_NoTopPadding) findViewById(i5c0.f111552m);
        this.timerM = (VText_NoTopPadding) findViewById(i5c0.f111553n);
        this.timerS = (VText_NoTopPadding) findViewById(i5c0.f111554o);
        this.subtitleView = (VText_NoTopPadding) findViewById(i5c0.f111551l);
        this.ctaView = (VText_NoTopPadding) findViewById(i5c0.f111548i);
        this.countdownColonViews = m53959j();
        m53953d();
    }

    /* JADX INFO: renamed from: i */
    public final void m53958i() {
        this.affiliateDiscountCountdownManager.m109644k();
    }

    /* JADX INFO: renamed from: j */
    public final List<VText_NoTopPadding> m53959j() {
        VText_NoTopPadding vText_NoTopPadding = this.timerH;
        ViewParent parent = vText_NoTopPadding != null ? vText_NoTopPadding.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return CollectionsKt.emptyList();
        }
        IntRange intRangeM87605k = C15167a.m87605k(0, viewGroup.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeM87605k.iterator();
        while (it.hasNext()) {
            View childAt = viewGroup.getChildAt(((IntIterator) it).nextInt());
            VText_NoTopPadding vText_NoTopPadding2 = childAt instanceof VText_NoTopPadding ? (VText_NoTopPadding) childAt : null;
            if (vText_NoTopPadding2 != null) {
                arrayList.add(vText_NoTopPadding2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            VText_NoTopPadding vText_NoTopPadding3 = (VText_NoTopPadding) obj;
            if (vText_NoTopPadding3 != this.timerH && vText_NoTopPadding3 != this.timerM && vText_NoTopPadding3 != this.timerS) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: k */
    public final String m53960k(long v2) {
        if (v2 > 99) {
            return String.valueOf(v2);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(v2)}, 1));
    }

    /* JADX INFO: renamed from: l */
    public final GradientDrawable m53961l(int argb) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(argb);
        gradientDrawable.setCornerRadius(getResources().getDimension(d2c0.f83353h));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: m */
    public final int m53962m() {
        return App.f15369e.getColor(i1c0.f110443f);
    }

    /* JADX INFO: renamed from: n */
    public final int m53963n() {
        Application application = App.f15369e;
        int i = C8772a.f34775a[this.entryTheme.ordinal()];
        int i2 = (i == 2 || i != 3) ? i1c0.f110442e : i1c0.f110444g;
        return application.getColor(i2);
    }

    /* JADX INFO: renamed from: o */
    public final Integer m53964o(String raw) {
        if (raw == null || StringsKt.m93438e0(raw)) {
            return null;
        }
        String string = StringsKt.m93433Z0(raw).toString();
        if (C15386d.m93482I(string, "0x", true)) {
            string = string.substring(2);
        } else if (C15386d.m93483J(string, "#", false, 2, null)) {
            string = string.substring(1);
        }
        int length = string.length();
        if (length == 6) {
            string = "FF".concat(string);
        } else if (length != 8) {
            return null;
        }
        try {
            return Integer.valueOf(k8n.m144946a(string, 16));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m53958i();
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: p */
    public final void m53965p(long millisUntilFinished) {
        long jM87597c = C15167a.m87597c(millisUntilFinished / 1000, 0L);
        String strM53960k = m53960k(jM87597c / 3600);
        String strM53960k2 = m53960k((jM87597c % 3600) / 60);
        String strM53960k3 = m53960k(jM87597c % 60);
        int i = C8772a.f34775a[this.entryTheme.ordinal()];
        if (i == 1) {
            int iM53962m = m53962m();
            VText_NoTopPadding vText_NoTopPadding = this.timerH;
            if (vText_NoTopPadding != null) {
                vText_NoTopPadding.setText(strM53960k);
            }
            VText_NoTopPadding vText_NoTopPadding2 = this.timerM;
            if (vText_NoTopPadding2 != null) {
                vText_NoTopPadding2.setText(strM53960k2);
            }
            VText_NoTopPadding vText_NoTopPadding3 = this.timerS;
            if (vText_NoTopPadding3 != null) {
                vText_NoTopPadding3.setText(strM53960k3);
            }
            VText_NoTopPadding vText_NoTopPadding4 = this.timerH;
            if (vText_NoTopPadding4 != null) {
                vText_NoTopPadding4.setTextColor(iM53962m);
            }
            VText_NoTopPadding vText_NoTopPadding5 = this.timerM;
            if (vText_NoTopPadding5 != null) {
                vText_NoTopPadding5.setTextColor(iM53962m);
            }
            VText_NoTopPadding vText_NoTopPadding6 = this.timerS;
            if (vText_NoTopPadding6 != null) {
                vText_NoTopPadding6.setTextColor(iM53962m);
            }
            Iterator<T> it = this.countdownColonViews.iterator();
            while (it.hasNext()) {
                ((VText_NoTopPadding) it.next()).setTextColor(iM53962m);
            }
            return;
        }
        if (i != 2 && i != 3) {
            l9r.m149037a();
            return;
        }
        int iM53963n = m53963n();
        VText_NoTopPadding vText_NoTopPadding7 = this.timerH;
        if (vText_NoTopPadding7 != null) {
            vText_NoTopPadding7.setText(strM53960k);
        }
        VText_NoTopPadding vText_NoTopPadding8 = this.timerM;
        if (vText_NoTopPadding8 != null) {
            vText_NoTopPadding8.setText(strM53960k2);
        }
        VText_NoTopPadding vText_NoTopPadding9 = this.timerS;
        if (vText_NoTopPadding9 != null) {
            vText_NoTopPadding9.setText(strM53960k3);
        }
        VText_NoTopPadding vText_NoTopPadding10 = this.timerH;
        if (vText_NoTopPadding10 != null) {
            vText_NoTopPadding10.setTextColor(iM53963n);
        }
        VText_NoTopPadding vText_NoTopPadding11 = this.timerM;
        if (vText_NoTopPadding11 != null) {
            vText_NoTopPadding11.setTextColor(iM53963n);
        }
        VText_NoTopPadding vText_NoTopPadding12 = this.timerS;
        if (vText_NoTopPadding12 != null) {
            vText_NoTopPadding12.setTextColor(iM53963n);
        }
        Iterator<T> it2 = this.countdownColonViews.iterator();
        while (it2.hasNext()) {
            ((VText_NoTopPadding) it2.next()).setTextColor(iM53963n);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m53966q() {
        long j = this.countdownEndMs;
        d1n d1nVar = this.affiliateDiscountCountdownManager;
        if (j > 0) {
            d1nVar.m109643j(j, new Function1() { // from class: l.l8n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IntlDiscountEntryBannerView.m53949a(this.f126846a, ((Long) obj).longValue());
                }
            }, this.affiliatePromotionForPersistedTicks);
        } else {
            d1nVar.m109644k();
            m53965p(0L);
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: r */
    public final void m53967r(long endTimeMs, @Nullable IapAffiliatePromotion affiliatePromotionForPersistedTicks) {
        this.countdownEndMs = endTimeMs;
        this.affiliatePromotionForPersistedTicks = affiliatePromotionForPersistedTicks;
        m53966q();
    }

    public final void setBadgeImageUrl(@Nullable String url) {
        this.badgeImageUrl = url;
        m53952c();
    }

    public final void setBadgeText(@Nullable CharSequence text) {
        this.badgeText = text;
        AutoVDraweeView autoVDraweeView = this.badgeView;
        if (autoVDraweeView != null) {
            autoVDraweeView.setContentDescription(text);
        }
    }

    public final void setBannerContentDescription(@Nullable CharSequence description) {
        View view = this.rootClick;
        if (view != null) {
            view.setContentDescription(description);
        }
    }

    public final void setCountdownDigitBackgroundArgbHex(@Nullable String hex) {
        Integer numM53964o = m53964o(hex);
        boolean z = this.countdownDigitBackgroundColorArgb != null;
        this.countdownDigitBackgroundColorArgb = numM53964o;
        if (numM53964o != null) {
            m53953d();
        } else if (z) {
            m53956g(true);
        }
    }

    @JvmOverloads
    public final void setCountdownEndTimeMillis(long j) {
        m53950s(this, j, null, 2, null);
    }

    public final void setCtaText(@Nullable CharSequence text) {
        this.ctaText = text;
        VText_NoTopPadding vText_NoTopPadding = this.ctaView;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(text);
        }
    }

    public final void setEntryTheme(@NotNull IntlDiscountEntryTheme theme) {
        theme.getClass();
        if (this.entryTheme == theme) {
            return;
        }
        this.entryTheme = theme;
        m53956g(true);
    }

    public final void setHeadline(@Nullable CharSequence text) {
        this.headlineText = text;
        VText_NoTopPadding vText_NoTopPadding = this.headlineView;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(text);
        }
        IntlDiscountEntryTheme intlDiscountEntryTheme = this.entryTheme;
        if (intlDiscountEntryTheme == IntlDiscountEntryTheme.THEME2 || intlDiscountEntryTheme == IntlDiscountEntryTheme.THEME3) {
            m53954e();
        }
    }

    public final void setOnBannerClickListener(@Nullable View.OnClickListener listener) {
        View view = this.rootClick;
        if (view != null) {
            view.setOnClickListener(listener);
        }
    }

    public final void setSubtitle(@Nullable CharSequence text) {
        this.subtitleText = text;
        VText_NoTopPadding vText_NoTopPadding = this.subtitleView;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setText(text);
        }
        m53969u();
    }

    public final void setSubtitleVisible(boolean visible) {
        this.subtitleRowVisible = visible;
        m53969u();
    }

    /* JADX INFO: renamed from: t */
    public final void m53968t() {
        m53958i();
    }

    /* JADX INFO: renamed from: u */
    public final void m53969u() {
        CharSequence charSequence;
        boolean z = (!this.subtitleRowVisible || (charSequence = this.subtitleText) == null || StringsKt.m93438e0(charSequence)) ? false : true;
        VText_NoTopPadding vText_NoTopPadding = this.subtitleView;
        if (vText_NoTopPadding != null) {
            vText_NoTopPadding.setVisibility(z ? 0 : 8);
        }
        m53954e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlDiscountEntryBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlDiscountEntryBannerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ IntlDiscountEntryBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
