package com.clevertap.android.sdk.inapp.pipsdk;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.h160;
import p149l.ig3;
import p149l.jck0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.pipsdk.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001Bç\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00152\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b3\u0010:R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b1\u0010:R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u0010&R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\bC\u0010&R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b2\u0010D\u001a\u0004\b-\u0010ER\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010F\u001a\u0004\b*\u0010GR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b>\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b4\u0010H\u001a\u0004\bB\u0010JR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b/\u0010H\u001a\u0004\bK\u0010JR\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b,\u0010H\u001a\u0004\bL\u0010JR\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bI\u0010H\u001a\u0004\bM\u0010JR\u0017\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bM\u00106\u001a\u0004\b@\u0010&R\u0017\u0010\u001c\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\b8\u0010JR\u0017\u0010\u001d\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\b5\u0010&R\u0017\u0010\u001e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\b;\u0010&R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b7\u0010N\u001a\u0004\b<\u0010O¨\u0006P"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/pipsdk/a;", "", "", "mediaUrl", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPMediaType;", "mediaType", "fallbackUrl", "mediaContentDescription", "", "widthPercent", "", "aspectRatioNumerator", "aspectRatioDenominator", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", "initialPosition", "horizontalEdgeMarginPercent", "verticalEdgeMarginPercent", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;", "animationConfig", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "action", "", "showCloseButton", "dragEnabled", "showPlayPauseButton", "showMuteButton", "showExpandCollapseButton", "cornerRadiusDp", "borderEnabled", "borderColor", "borderWidthDp", "Ll/h160;", "callbacks", "<init>", "(Ljava/lang/String;Lcom/clevertap/android/sdk/inapp/pipsdk/PIPMediaType;Ljava/lang/String;Ljava/lang/String;IDDLcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;IILcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;Lcom/clevertap/android/sdk/inapp/CTInAppAction;ZZZZZIZIILl/h160;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "p", "b", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPMediaType;", "o", "()Lcom/clevertap/android/sdk/inapp/pipsdk/PIPMediaType;", "c", "k", Constants.INAPP_DATA_TAG, "n", "e", "I", ResourceDirection.f38808v, "f", "D", "()D", "g", "h", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", "m", "()Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", RXScreenCaptureService.KEY_INDEX, BLiveStormDanmakuGiftResourceType.f44444l, "j", "u", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;", "()Lcom/clevertap/android/sdk/inapp/pipsdk/PIPAnimationConfig;", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "()Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "Z", "q", "()Z", Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f44446s, "r", "Ll/h160;", "()Ll/h160;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final /* data */ class C1265a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mediaUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PIPMediaType mediaType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final String fallbackUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String mediaContentDescription;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int widthPercent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final double aspectRatioNumerator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final double aspectRatioDenominator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final PIPPosition initialPosition;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int horizontalEdgeMarginPercent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int verticalEdgeMarginPercent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final PIPAnimationConfig animationConfig;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private final CTInAppAction action;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean showCloseButton;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean dragEnabled;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean showPlayPauseButton;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final boolean showMuteButton;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean showExpandCollapseButton;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int cornerRadiusDp;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final boolean borderEnabled;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int borderColor;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int borderWidthDp;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    private final h160 callbacks;

    public C1265a(@NotNull String str, @NotNull PIPMediaType pIPMediaType, @Nullable String str2, @NotNull String str3, int i, double d, double d2, @NotNull PIPPosition pIPPosition, int i2, int i3, @NotNull PIPAnimationConfig pIPAnimationConfig, @Nullable CTInAppAction cTInAppAction, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i4, boolean z6, int i5, int i6, @Nullable h160 h160Var) {
        str.getClass();
        pIPMediaType.getClass();
        str3.getClass();
        pIPPosition.getClass();
        pIPAnimationConfig.getClass();
        this.mediaUrl = str;
        this.mediaType = pIPMediaType;
        this.fallbackUrl = str2;
        this.mediaContentDescription = str3;
        this.widthPercent = i;
        this.aspectRatioNumerator = d;
        this.aspectRatioDenominator = d2;
        this.initialPosition = pIPPosition;
        this.horizontalEdgeMarginPercent = i2;
        this.verticalEdgeMarginPercent = i3;
        this.animationConfig = pIPAnimationConfig;
        this.action = cTInAppAction;
        this.showCloseButton = z;
        this.dragEnabled = z2;
        this.showPlayPauseButton = z3;
        this.showMuteButton = z4;
        this.showExpandCollapseButton = z5;
        this.cornerRadiusDp = i4;
        this.borderEnabled = z6;
        this.borderColor = i5;
        this.borderWidthDp = i6;
        this.callbacks = h160Var;
        if (StringsKt.m93438e0(str)) {
            ig3.m135964a("mediaUrl must not be blank");
            throw null;
        }
        if (10 > i || i >= 91) {
            jck0.m140980a("widthPercent must be 10–90, got ", i);
            throw null;
        }
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            ig3.m135964a("aspectRatioNumerator must be > 0");
            throw null;
        }
        if (d2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            ig3.m135964a("aspectRatioDenominator must be > 0");
            throw null;
        }
        if (i4 < 0) {
            ig3.m135964a("cornerRadiusDp must be >= 0");
            throw null;
        }
        if (i6 >= 0) {
            return;
        }
        ig3.m135964a("borderWidthDp must be >= 0");
        throw null;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CTInAppAction getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final PIPAnimationConfig getAnimationConfig() {
        return this.animationConfig;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getAspectRatioDenominator() {
        return this.aspectRatioDenominator;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getAspectRatioNumerator() {
        return this.aspectRatioNumerator;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1265a)) {
            return false;
        }
        C1265a c1265a = (C1265a) other;
        return Intrinsics.m87488d(this.mediaUrl, c1265a.mediaUrl) && this.mediaType == c1265a.mediaType && Intrinsics.m87488d(this.fallbackUrl, c1265a.fallbackUrl) && Intrinsics.m87488d(this.mediaContentDescription, c1265a.mediaContentDescription) && this.widthPercent == c1265a.widthPercent && Double.compare(this.aspectRatioNumerator, c1265a.aspectRatioNumerator) == 0 && Double.compare(this.aspectRatioDenominator, c1265a.aspectRatioDenominator) == 0 && this.initialPosition == c1265a.initialPosition && this.horizontalEdgeMarginPercent == c1265a.horizontalEdgeMarginPercent && this.verticalEdgeMarginPercent == c1265a.verticalEdgeMarginPercent && Intrinsics.m87488d(this.animationConfig, c1265a.animationConfig) && Intrinsics.m87488d(this.action, c1265a.action) && this.showCloseButton == c1265a.showCloseButton && this.dragEnabled == c1265a.dragEnabled && this.showPlayPauseButton == c1265a.showPlayPauseButton && this.showMuteButton == c1265a.showMuteButton && this.showExpandCollapseButton == c1265a.showExpandCollapseButton && this.cornerRadiusDp == c1265a.cornerRadiusDp && this.borderEnabled == c1265a.borderEnabled && this.borderColor == c1265a.borderColor && this.borderWidthDp == c1265a.borderWidthDp && Intrinsics.m87488d(this.callbacks, c1265a.callbacks);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getBorderEnabled() {
        return this.borderEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getBorderWidthDp() {
        return this.borderWidthDp;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final h160 getCallbacks() {
        return this.callbacks;
    }

    public int hashCode() {
        int iHashCode = ((this.mediaUrl.hashCode() * 31) + this.mediaType.hashCode()) * 31;
        String str = this.fallbackUrl;
        int iHashCode2 = (((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.mediaContentDescription.hashCode()) * 31) + Integer.hashCode(this.widthPercent)) * 31) + Double.hashCode(this.aspectRatioNumerator)) * 31) + Double.hashCode(this.aspectRatioDenominator)) * 31) + this.initialPosition.hashCode()) * 31) + Integer.hashCode(this.horizontalEdgeMarginPercent)) * 31) + Integer.hashCode(this.verticalEdgeMarginPercent)) * 31) + this.animationConfig.hashCode()) * 31;
        CTInAppAction cTInAppAction = this.action;
        int iHashCode3 = (((((((((((((((((((iHashCode2 + (cTInAppAction == null ? 0 : cTInAppAction.hashCode())) * 31) + Boolean.hashCode(this.showCloseButton)) * 31) + Boolean.hashCode(this.dragEnabled)) * 31) + Boolean.hashCode(this.showPlayPauseButton)) * 31) + Boolean.hashCode(this.showMuteButton)) * 31) + Boolean.hashCode(this.showExpandCollapseButton)) * 31) + Integer.hashCode(this.cornerRadiusDp)) * 31) + Boolean.hashCode(this.borderEnabled)) * 31) + Integer.hashCode(this.borderColor)) * 31) + Integer.hashCode(this.borderWidthDp)) * 31;
        h160 h160Var = this.callbacks;
        return iHashCode3 + (h160Var != null ? h160Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getCornerRadiusDp() {
        return this.cornerRadiusDp;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getDragEnabled() {
        return this.dragEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getHorizontalEdgeMarginPercent() {
        return this.horizontalEdgeMarginPercent;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final PIPPosition getInitialPosition() {
        return this.initialPosition;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getMediaContentDescription() {
        return this.mediaContentDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final PIPMediaType getMediaType() {
        return this.mediaType;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getShowExpandCollapseButton() {
        return this.showExpandCollapseButton;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getShowMuteButton() {
        return this.showMuteButton;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getShowPlayPauseButton() {
        return this.showPlayPauseButton;
    }

    @NotNull
    public String toString() {
        return "PIPConfig(mediaUrl=" + this.mediaUrl + ", mediaType=" + this.mediaType + ", fallbackUrl=" + this.fallbackUrl + ", mediaContentDescription=" + this.mediaContentDescription + ", widthPercent=" + this.widthPercent + ", aspectRatioNumerator=" + this.aspectRatioNumerator + ", aspectRatioDenominator=" + this.aspectRatioDenominator + ", initialPosition=" + this.initialPosition + ", horizontalEdgeMarginPercent=" + this.horizontalEdgeMarginPercent + ", verticalEdgeMarginPercent=" + this.verticalEdgeMarginPercent + ", animationConfig=" + this.animationConfig + ", action=" + this.action + ", showCloseButton=" + this.showCloseButton + ", dragEnabled=" + this.dragEnabled + ", showPlayPauseButton=" + this.showPlayPauseButton + ", showMuteButton=" + this.showMuteButton + ", showExpandCollapseButton=" + this.showExpandCollapseButton + ", cornerRadiusDp=" + this.cornerRadiusDp + ", borderEnabled=" + this.borderEnabled + ", borderColor=" + this.borderColor + ", borderWidthDp=" + this.borderWidthDp + ", callbacks=" + this.callbacks + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getVerticalEdgeMarginPercent() {
        return this.verticalEdgeMarginPercent;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getWidthPercent() {
        return this.widthPercent;
    }
}
