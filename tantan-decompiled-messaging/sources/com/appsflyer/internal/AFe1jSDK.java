package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFe1jSDK {
    public boolean AFAdRevenueData;
    private final boolean areAllFieldsValid;
    public int component1;

    @Nullable
    private final byte[] component2;
    private boolean component3;
    private final boolean component4;
    public boolean getCurrencyIso4217Code;

    @NonNull
    final String getMediationNetwork;

    @NonNull
    final Map<String, String> getMonetizationNetwork;

    @NonNull
    public final String getRevenue;

    private AFe1jSDK(@NonNull String str, @Nullable byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z, byte b) {
        this.component3 = true;
        this.AFAdRevenueData = false;
        this.getCurrencyIso4217Code = true;
        this.component1 = -1;
        this.getRevenue = str;
        this.component2 = bArr;
        this.getMediationNetwork = str2;
        this.getMonetizationNetwork = map;
        this.areAllFieldsValid = z;
        this.component4 = true;
    }

    public final boolean AFAdRevenueData() {
        return this.AFAdRevenueData;
    }

    public final boolean component1() {
        return this.getCurrencyIso4217Code;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.areAllFieldsValid;
    }

    @Nullable
    public final byte[] getMediationNetwork() {
        return this.component2;
    }

    public final boolean getMonetizationNetwork() {
        return this.component3;
    }

    public final boolean getRevenue() {
        return this.component4;
    }

    public AFe1jSDK(@NonNull String str, @Nullable byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z) {
        this(str, bArr, str2, map, z, (byte) 0);
    }

    public AFe1jSDK(@NonNull String str, @NonNull String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
