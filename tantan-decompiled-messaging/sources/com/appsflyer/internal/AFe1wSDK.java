package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\u0007H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00178\u0017X\u0097D¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001b"}, m87232d2 = {"Lcom/appsflyer/internal/AFe1wSDK;", "Lcom/appsflyer/internal/AFd1hSDK;", "Lcom/appsflyer/internal/AFd1pSDK;", "p0", "", "p1", "", "", "p2", "", "p3", "<init>", "(Lcom/appsflyer/internal/AFd1pSDK;[BLjava/util/Map;I)V", "getMediationNetwork", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1uSDK;", "component3", "Lcom/appsflyer/internal/AFe1uSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFe1uSDK;", "getCurrencyIso4217Code", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFd1pSDK;", "", "Z", "getRevenue", "()Z", "()Ljava/lang/String;"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public final class AFe1wSDK extends AFd1hSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final boolean getRevenue;

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    @NotNull
    private final AFe1uSDK getCurrencyIso4217Code;

    @NotNull
    public AFd1pSDK getMonetizationNetwork;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AFe1wSDK(@NotNull AFd1pSDK aFd1pSDK, @NotNull byte[] bArr) {
        this(aFd1pSDK, bArr, null, 0, 12, null);
        aFd1pSDK.getClass();
        bArr.getClass();
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @JvmName
    @NotNull
    /* JADX INFO: renamed from: AFAdRevenueData, reason: from getter */
    public final AFe1uSDK getGetCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @JvmName
    @NotNull
    public final String getCurrencyIso4217Code() {
        AFj1mSDK aFj1mSDK = new AFj1mSDK(this.getMonetizationNetwork, null, 2, null);
        String strAFAdRevenueData = aFj1mSDK.getMonetizationNetwork.AFAdRevenueData(AFj1mSDK.component1);
        StringBuilder sb = new StringBuilder();
        sb.append(strAFAdRevenueData);
        sb.append(aFj1mSDK.getRevenue.AFAdRevenueData.getCurrencyIso4217Code.getPackageName());
        return sb.toString();
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @NotNull
    public final String getMediationNetwork(@NotNull String str) {
        str.getClass();
        return "[RD]: ".concat(String.valueOf(str));
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @JvmName
    /* JADX INFO: renamed from: getRevenue, reason: from getter */
    public final boolean getGetRevenue() {
        return this.getRevenue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private AFe1wSDK(@NotNull AFd1pSDK aFd1pSDK, @NotNull byte[] bArr, @Nullable Map<String, String> map, int i) {
        super(bArr, map, i);
        aFd1pSDK.getClass();
        bArr.getClass();
        this.getMonetizationNetwork = aFd1pSDK;
        this.getCurrencyIso4217Code = AFe1uSDK.OCTET_STREAM;
    }

    public /* synthetic */ AFe1wSDK(AFd1pSDK aFd1pSDK, byte[] bArr, Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1pSDK, bArr, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? 2000 : i);
    }
}
