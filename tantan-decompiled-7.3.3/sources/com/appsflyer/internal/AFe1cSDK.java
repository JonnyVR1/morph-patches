package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015"}, m88121d2 = {"Lcom/appsflyer/internal/AFe1cSDK;", "", "", "p0", "p1", "Lcom/appsflyer/internal/AFe1bSDK;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFe1bSDK;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFe1bSDK;", "getMediationNetwork", "AFAdRevenueData", "Ljava/lang/String;", "getMonetizationNetwork"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
public final /* data */ class AFe1cSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    public final String getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    public final AFe1bSDK getMediationNetwork;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @Nullable
    public final String AFAdRevenueData;

    public AFe1cSDK(@NotNull String str, @Nullable String str2, @NotNull AFe1bSDK aFe1bSDK) {
        str.getClass();
        aFe1bSDK.getClass();
        this.getCurrencyIso4217Code = str;
        this.AFAdRevenueData = str2;
        this.getMediationNetwork = aFe1bSDK;
    }

    public final boolean equals(@Nullable Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFe1cSDK)) {
            return false;
        }
        AFe1cSDK aFe1cSDK = (AFe1cSDK) p0;
        return Intrinsics.m88377d(this.getCurrencyIso4217Code, aFe1cSDK.getCurrencyIso4217Code) && Intrinsics.m88377d(this.AFAdRevenueData, aFe1cSDK.AFAdRevenueData) && this.getMediationNetwork == aFe1cSDK.getMediationNetwork;
    }

    public final int hashCode() {
        int iHashCode = this.getCurrencyIso4217Code.hashCode() * 31;
        String str = this.AFAdRevenueData;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.getMediationNetwork.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AFe1cSDK(getCurrencyIso4217Code=");
        sb.append(this.getCurrencyIso4217Code);
        sb.append(", AFAdRevenueData=");
        sb.append(this.AFAdRevenueData);
        sb.append(", getMediationNetwork=");
        sb.append(this.getMediationNetwork);
        sb.append(')');
        return sb.toString();
    }
}
