package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, m87232d2 = {"Lcom/appsflyer/internal/AFc1jSDK;", "", "", "p0", "Lcom/appsflyer/deeplink/DeepLink;", "p1", "<init>", "(ZLcom/appsflyer/deeplink/DeepLink;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AFAdRevenueData", "Lcom/appsflyer/deeplink/DeepLink;", "getRevenue", "Z", "getMonetizationNetwork", "()Z", "getMediationNetwork"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public final /* data */ class AFc1jSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @Nullable
    public final DeepLink getRevenue;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    private final boolean getMediationNetwork;

    public /* synthetic */ AFc1jSDK(boolean z, DeepLink deepLink, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : deepLink);
    }

    public final boolean equals(@Nullable Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFc1jSDK)) {
            return false;
        }
        AFc1jSDK aFc1jSDK = (AFc1jSDK) p0;
        return this.getMediationNetwork == aFc1jSDK.getMediationNetwork && Intrinsics.m87488d(this.getRevenue, aFc1jSDK.getRevenue);
    }

    @JvmName
    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from getter */
    public final boolean getGetMediationNetwork() {
        return this.getMediationNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.getMediationNetwork;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        DeepLink deepLink = this.getRevenue;
        return i + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AFc1jSDK(getMediationNetwork=");
        sb.append(this.getMediationNetwork);
        sb.append(", getRevenue=");
        sb.append(this.getRevenue);
        sb.append(')');
        return sb.toString();
    }

    public AFc1jSDK(boolean z, @Nullable DeepLink deepLink) {
        this.getMediationNetwork = z;
        this.getRevenue = deepLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1jSDK() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
