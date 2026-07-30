package com.p051p1.mobile.putong.core.newui.profile.newme.revamp.common;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VText_NoTopPadding;
import p153l.d79;
import p153l.dbc0;
import p153l.joa;
import p153l.nbr;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0016\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampSubscriptionStyle;", "", "<init>", "()V", "Lcom/p1/mobile/putong/data/User;", "user", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampSubscriptionStyle$Tier;", "b", "(Lcom/p1/mobile/putong/data/User;)Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampSubscriptionStyle$Tier;", "tier", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampSubscriptionStyle$a;", "c", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampSubscriptionStyle$Tier;)Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampSubscriptionStyle$a;", "Landroid/view/View;", "container", "Lv/VImage;", "iconView", "Lv/VText_NoTopPadding;", "textView", "", "a", "(Landroid/view/View;Lv/VImage;Lv/VText_NoTopPadding;Lcom/p1/mobile/putong/data/User;)V", "Tier", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MeTabRevampSubscriptionStyle {

    @NotNull
    public static final MeTabRevampSubscriptionStyle INSTANCE = new MeTabRevampSubscriptionStyle();

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampSubscriptionStyle$Tier;", "", "<init>", "(Ljava/lang/String;I)V", "NON_MEMBER", "VIP", "PREMIUM", "ULTRA", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum Tier {
        NON_MEMBER,
        VIP,
        PREMIUM,
        ULTRA;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<Tier> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.revamp.common.MeTabRevampSubscriptionStyle$a */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001f"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampSubscriptionStyle$a;", "", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampSubscriptionStyle$Tier;", "tier", "", "backgroundRes", "iconRes", "iconSizeDp", "textColor", "fontWeight", "<init>", "(Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampSubscriptionStyle$Tier;IIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampSubscriptionStyle$Tier;", "getTier", "()Lcom/p1/mobile/putong/core/newui/profile/newme/revamp/common/MeTabRevampSubscriptionStyle$Tier;", "b", "I", "c", Constants.INAPP_DATA_TAG, "e", "f", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* data */ class C8378a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Tier tier;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int backgroundRes;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final int iconRes;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final int iconSizeDp;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final int textColor;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final int fontWeight;

        public C8378a(@NotNull Tier tier, int i, int i2, int i3, int i4, int i5) {
            tier.getClass();
            this.tier = tier;
            this.backgroundRes = i;
            this.iconRes = i2;
            this.iconSizeDp = i3;
            this.textColor = i4;
            this.fontWeight = i5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getBackgroundRes() {
            return this.backgroundRes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFontWeight() {
            return this.fontWeight;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIconRes() {
            return this.iconRes;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getIconSizeDp() {
            return this.iconSizeDp;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getTextColor() {
            return this.textColor;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C8378a)) {
                return false;
            }
            C8378a c8378a = (C8378a) other;
            return this.tier == c8378a.tier && this.backgroundRes == c8378a.backgroundRes && this.iconRes == c8378a.iconRes && this.iconSizeDp == c8378a.iconSizeDp && this.textColor == c8378a.textColor && this.fontWeight == c8378a.fontWeight;
        }

        public int hashCode() {
            return (((((((((this.tier.hashCode() * 31) + Integer.hashCode(this.backgroundRes)) * 31) + Integer.hashCode(this.iconRes)) * 31) + Integer.hashCode(this.iconSizeDp)) * 31) + Integer.hashCode(this.textColor)) * 31) + Integer.hashCode(this.fontWeight);
        }

        @NotNull
        public String toString() {
            return "Style(tier=" + this.tier + ", backgroundRes=" + this.backgroundRes + ", iconRes=" + this.iconRes + ", iconSizeDp=" + this.iconSizeDp + ", textColor=" + this.textColor + ", fontWeight=" + this.fontWeight + ")";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.revamp.common.MeTabRevampSubscriptionStyle$b */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C8379b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27369a;

        static {
            int[] iArr = new int[Tier.values().length];
            try {
                iArr[Tier.NON_MEMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tier.VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Tier.PREMIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Tier.ULTRA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27369a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m44322a(@NotNull View container, @NotNull VImage iconView, @NotNull VText_NoTopPadding textView, @NotNull User user) {
        container.getClass();
        iconView.getClass();
        textView.getClass();
        user.getClass();
        C8378a c8378aM44324c = m44324c(m44323b(user));
        container.setBackgroundResource(c8378aM44324c.getBackgroundRes());
        iconView.setVisibility(0);
        iconView.setImageResource(c8378aM44324c.getIconRes());
        iconView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int iM175859d = qa00.m175859d(20.0f);
        int iM88486b = C15274a.m88486b((iM175859d - qa00.m175859d(c8378aM44324c.getIconSizeDp())) / 2, 0);
        ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
        layoutParams.width = iM175859d;
        layoutParams.height = iM175859d;
        iconView.setLayoutParams(layoutParams);
        iconView.setPadding(iM88486b, iM88486b, iM88486b, iM88486b);
        textView.setText(App.f16088e.getString(R$string.f19057Za));
        textView.setTextColor(c8378aM44324c.getTextColor());
        textView.setTextSize(11.0f);
        textView.setTypeface(c8378aM44324c.getFontWeight() >= 4 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Tier m44323b(@NotNull User user) {
        user.getClass();
        if (d79.m114664W(user) && !joa.m146396k4()) {
            return Tier.ULTRA;
        }
        CoreBusinessService coreBusinessServiceM143405a = CoreModule.m30933P().m143405a();
        if ((coreBusinessServiceM143405a.mo34510h5() || coreBusinessServiceM143405a.mo34445Xi()) && user.isSVIP() && !joa.m146386f4()) {
            return Tier.PREMIUM;
        }
        return (joa.m146401n4() || user.gpHideVip()) ? Tier.NON_MEMBER : Tier.VIP;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C8378a m44324c(@NotNull Tier tier) {
        tier.getClass();
        int i = C8379b.f27369a[tier.ordinal()];
        if (i == 1) {
            return new C8378a(tier, dbc0.f86119Ee, dbc0.f85991Ae, 20, Color.parseColor("#F1BF00"), 4);
        }
        if (i == 2) {
            return new C8378a(tier, dbc0.f86215He, dbc0.f86087De, 20, Color.parseColor("#9E5701"), 3);
        }
        if (i == 3) {
            return new C8378a(tier, dbc0.f86151Fe, dbc0.f86023Be, 20, Color.parseColor("#FFE59D"), 3);
        }
        if (i == 4) {
            return new C8378a(tier, dbc0.f86183Ge, dbc0.f86055Ce, 20, Color.parseColor("#FFE7F7"), 3);
        }
        nbr.m162172a();
        return null;
    }
}
