package com.appsflyer;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\r\u0010\t"}, m87232d2 = {"Lcom/appsflyer/AppsFlyerConsent;", "", "", "p0", "p1", "p2", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "isUserSubjectToGDPR", "hasConsentForDataUsage", "hasConsentForAdsPersonalization", Constants.COPY_TYPE, "(ZLjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/appsflyer/AppsFlyerConsent;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getHasConsentForAdsPersonalization", "getHasConsentForDataUsage", "Z", "Companion"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public final /* data */ class AppsFlyerConsent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Boolean hasConsentForAdsPersonalization;

    @Nullable
    private final Boolean hasConsentForDataUsage;
    private final boolean isUserSubjectToGDPR;

    private AppsFlyerConsent(boolean z, Boolean bool, Boolean bool2) {
        this.isUserSubjectToGDPR = z;
        this.hasConsentForDataUsage = bool;
        this.hasConsentForAdsPersonalization = bool2;
    }

    public static /* synthetic */ AppsFlyerConsent copy$default(AppsFlyerConsent appsFlyerConsent, boolean z, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = appsFlyerConsent.isUserSubjectToGDPR;
        }
        if ((i & 2) != 0) {
            bool = appsFlyerConsent.hasConsentForDataUsage;
        }
        if ((i & 4) != 0) {
            bool2 = appsFlyerConsent.hasConsentForAdsPersonalization;
        }
        return appsFlyerConsent.copy(z, bool, bool2);
    }

    @JvmStatic
    @NotNull
    public static final AppsFlyerConsent forGDPRUser(boolean z, boolean z2) {
        return INSTANCE.forGDPRUser(z, z2);
    }

    @JvmStatic
    @NotNull
    public static final AppsFlyerConsent forNonGDPRUser() {
        return INSTANCE.forNonGDPRUser();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsUserSubjectToGDPR() {
        return this.isUserSubjectToGDPR;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getHasConsentForDataUsage() {
        return this.hasConsentForDataUsage;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHasConsentForAdsPersonalization() {
        return this.hasConsentForAdsPersonalization;
    }

    @NotNull
    public final AppsFlyerConsent copy(boolean isUserSubjectToGDPR, @Nullable Boolean hasConsentForDataUsage, @Nullable Boolean hasConsentForAdsPersonalization) {
        return new AppsFlyerConsent(isUserSubjectToGDPR, hasConsentForDataUsage, hasConsentForAdsPersonalization);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppsFlyerConsent)) {
            return false;
        }
        AppsFlyerConsent appsFlyerConsent = (AppsFlyerConsent) other;
        return this.isUserSubjectToGDPR == appsFlyerConsent.isUserSubjectToGDPR && Intrinsics.m87488d(this.hasConsentForDataUsage, appsFlyerConsent.hasConsentForDataUsage) && Intrinsics.m87488d(this.hasConsentForAdsPersonalization, appsFlyerConsent.hasConsentForAdsPersonalization);
    }

    @JvmName
    @Nullable
    public final Boolean getHasConsentForAdsPersonalization() {
        return this.hasConsentForAdsPersonalization;
    }

    @JvmName
    @Nullable
    public final Boolean getHasConsentForDataUsage() {
        return this.hasConsentForDataUsage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.isUserSubjectToGDPR;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Boolean bool = this.hasConsentForDataUsage;
        int iHashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasConsentForAdsPersonalization;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @JvmName
    public final boolean isUserSubjectToGDPR() {
        return this.isUserSubjectToGDPR;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsFlyerConsent(isUserSubjectToGDPR=");
        sb.append(this.isUserSubjectToGDPR);
        sb.append(", hasConsentForDataUsage=");
        sb.append(this.hasConsentForDataUsage);
        sb.append(", hasConsentForAdsPersonalization=");
        sb.append(this.hasConsentForAdsPersonalization);
        sb.append(')');
        return sb.toString();
    }

    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, m87232d2 = {"Lcom/appsflyer/AppsFlyerConsent$Companion;", "", "<init>", "()V", "", "hasConsentForDataUsage", "hasConsentForAdsPersonalization", "Lcom/appsflyer/AppsFlyerConsent;", "forGDPRUser", "(ZZ)Lcom/appsflyer/AppsFlyerConsent;", "forNonGDPRUser", "()Lcom/appsflyer/AppsFlyerConsent;"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final AppsFlyerConsent forGDPRUser(boolean hasConsentForDataUsage, boolean hasConsentForAdsPersonalization) {
            return new AppsFlyerConsent(true, Boolean.valueOf(hasConsentForDataUsage), Boolean.valueOf(hasConsentForAdsPersonalization), null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public final AppsFlyerConsent forNonGDPRUser() {
            return new AppsFlyerConsent(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AppsFlyerConsent(boolean z, Boolean bool, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, bool, bool2);
    }
}
