package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0005H\u0017¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, m88121d2 = {"Lcom/appsflyer/internal/AFd1cSDK;", "Lcom/appsflyer/internal/AFd1hSDK;", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "getMediationNetwork", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1uSDK;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFe1uSDK;", "()Lcom/appsflyer/internal/AFe1uSDK;", "getRevenue", "getCurrencyIso4217Code", "()Ljava/lang/String;", "AFa1zSDK"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
public final class AFd1cSDK extends AFd1hSDK {

    @NotNull
    public static String getMonetizationNetwork = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    private final AFe1uSDK getRevenue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1cSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i) {
        super(bArr, map, i);
        bArr.getClass();
        this.getRevenue = AFe1uSDK.JSON;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @JvmName
    @NotNull
    /* JADX INFO: renamed from: AFAdRevenueData, reason: from getter */
    public final AFe1uSDK getGetRevenue() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @JvmName
    @NotNull
    public final String getCurrencyIso4217Code() {
        return String.format(getMonetizationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getMonetizationNetwork().getHostName());
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @NotNull
    public final String getMediationNetwork(@NotNull String str) {
        str.getClass();
        str.getClass();
        return "[Exception Manager]: ".concat(String.valueOf(str));
    }
}
