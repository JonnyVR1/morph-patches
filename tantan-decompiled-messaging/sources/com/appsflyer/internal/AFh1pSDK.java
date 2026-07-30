package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b!\u0010\u001c"}, m87232d2 = {"Lcom/appsflyer/internal/AFh1pSDK;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getCurrencyIso4217Code", "Ljava/lang/String;", "AFAdRevenueData", "component4", "getRevenue", "getMonetizationNetwork", "Ljava/lang/Boolean;", "getMediationNetwork", "component2", "areAllFieldsValid", "Ljava/util/Map;", "component3"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public final /* data */ class AFh1pSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @Nullable
    public Boolean component2;

    /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    public Map<String, Object> component3;

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    @Nullable
    public Boolean areAllFieldsValid;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    @Nullable
    public String getRevenue;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @Nullable
    public String AFAdRevenueData;

    @Nullable
    public Boolean getMediationNetwork;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @Nullable
    public Boolean getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @Nullable
    public Boolean getMonetizationNetwork;

    public /* synthetic */ AFh1pSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : bool5, (i & 128) != 0 ? new HashMap() : map);
    }

    public final boolean equals(@Nullable Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFh1pSDK)) {
            return false;
        }
        AFh1pSDK aFh1pSDK = (AFh1pSDK) p0;
        return Intrinsics.m87488d(this.AFAdRevenueData, aFh1pSDK.AFAdRevenueData) && Intrinsics.m87488d(this.component2, aFh1pSDK.component2) && Intrinsics.m87488d(this.getCurrencyIso4217Code, aFh1pSDK.getCurrencyIso4217Code) && Intrinsics.m87488d(this.getMediationNetwork, aFh1pSDK.getMediationNetwork) && Intrinsics.m87488d(this.getMonetizationNetwork, aFh1pSDK.getMonetizationNetwork) && Intrinsics.m87488d(this.getRevenue, aFh1pSDK.getRevenue) && Intrinsics.m87488d(this.areAllFieldsValid, aFh1pSDK.areAllFieldsValid) && Intrinsics.m87488d(this.component3, aFh1pSDK.component3);
    }

    public final int hashCode() {
        String str = this.AFAdRevenueData;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.component2;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.getCurrencyIso4217Code;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.getMediationNetwork;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.getMonetizationNetwork;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.getRevenue;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.areAllFieldsValid;
        return ((iHashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + this.component3.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AFh1pSDK(AFAdRevenueData=");
        sb.append(this.AFAdRevenueData);
        sb.append(", component2=");
        sb.append(this.component2);
        sb.append(", getCurrencyIso4217Code=");
        sb.append(this.getCurrencyIso4217Code);
        sb.append(", getMediationNetwork=");
        sb.append(this.getMediationNetwork);
        sb.append(", getMonetizationNetwork=");
        sb.append(this.getMonetizationNetwork);
        sb.append(", getRevenue=");
        sb.append(this.getRevenue);
        sb.append(", areAllFieldsValid=");
        sb.append(this.areAllFieldsValid);
        sb.append(", component3=");
        sb.append(this.component3);
        sb.append(')');
        return sb.toString();
    }

    private AFh1pSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str2, @Nullable Boolean bool5, @NotNull Map<String, Object> map) {
        map.getClass();
        this.AFAdRevenueData = str;
        this.component2 = bool;
        this.getCurrencyIso4217Code = bool2;
        this.getMediationNetwork = bool3;
        this.getMonetizationNetwork = bool4;
        this.getRevenue = str2;
        this.areAllFieldsValid = bool5;
        this.component3 = map;
    }

    public AFh1pSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
