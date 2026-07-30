package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p149l.bz00;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\f\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u0012*\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, m87232d2 = {"Lcom/appsflyer/internal/AFj1mSDK;", "", "Lcom/appsflyer/internal/AFd1pSDK;", "p0", "Lcom/appsflyer/internal/AFj1lSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1pSDK;Lcom/appsflyer/internal/AFj1lSDK;)V", "", "getCurrencyIso4217Code", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFh1hSDK;", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFh1hSDK;)Ljava/lang/String;", "", "(Ljava/lang/String;Z)Ljava/lang/String;", "getMediationNetwork", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri$Builder;", "L_", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "Lcom/appsflyer/internal/AFd1pSDK;", "getRevenue", "Lcom/appsflyer/internal/AFj1lSDK;", "AFa1uSDK"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public final class AFj1mSDK {

    @JvmField
    @NotNull
    public static final String AFAdRevenueData;

    @JvmField
    @NotNull
    public static final String areAllFieldsValid;

    @JvmField
    @NotNull
    public static final String component1;

    @JvmField
    @NotNull
    public static String component2;

    @NotNull
    private static final String component3;

    @JvmField
    @NotNull
    public static final String component4;

    @JvmField
    @NotNull
    public static final String getCurrencyIso4217Code;

    @JvmField
    @NotNull
    public static final String getMonetizationNetwork;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    public final AFd1pSDK getRevenue;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    public final AFj1lSDK getMonetizationNetwork;

    static {
        StringBuilder sb = new StringBuilder();
        String str = AFb1tSDK.getRevenue;
        sb.append(str);
        sb.append("/androidevent?app_id=");
        String string = sb.toString();
        component3 = string;
        StringBuilder sb2 = new StringBuilder("https://%sattr.%s/api/v");
        sb2.append(string);
        getMonetizationNetwork = sb2.toString();
        AFAdRevenueData = "https://%sadrevenue.%s/api/v2/generic/v6.15.0/android?app_id=";
        StringBuilder sb3 = new StringBuilder("https://%sconversions.%s/api/v");
        sb3.append(string);
        getCurrencyIso4217Code = sb3.toString();
        StringBuilder sb4 = new StringBuilder("https://%slaunches.%s/api/v");
        sb4.append(string);
        component4 = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%sinapps.%s/api/v");
        sb5.append(string);
        areAllFieldsValid = sb5.toString();
        component1 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
        StringBuilder sb6 = new StringBuilder("https://%svalidate.%s/api/v");
        sb6.append(str);
        sb6.append("/androidevent?buildnumber=6.15.0&app_id=");
        component2 = sb6.toString();
    }

    @JvmOverloads
    private AFj1mSDK(@NotNull AFd1pSDK aFd1pSDK, @NotNull AFj1lSDK aFj1lSDK) {
        aFd1pSDK.getClass();
        aFj1lSDK.getClass();
        this.getRevenue = aFd1pSDK;
        this.getMonetizationNetwork = aFj1lSDK;
    }

    /* JADX INFO: renamed from: L_ */
    public static Uri.Builder m5258L_(Uri.Builder builder, String str, String str2) {
        if (str != null && str2 != null) {
            builder.appendQueryParameter("af_sig", AFb1iSDK.getMediationNetwork(str2.concat(str), str));
            return builder;
        }
        String str3 = str == null ? "devKey" : "timestamp";
        AFLogger.afErrorLog(str3.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str3.concat(" is null")));
        return builder;
    }

    public static String getCurrencyIso4217Code() {
        return "https://aps-webhandler.appsflyer.com/api/trigger";
    }

    public final String getMediationNetwork(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String strComponent4 = this.getRevenue.component4();
        String strConcat = strComponent4 != null ? "&channel=".concat(strComponent4) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        sb.append(strConcat);
        return sb.toString();
    }

    @NotNull
    public final String getMonetizationNetwork(@NotNull AFh1hSDK p0) {
        p0.getClass();
        if (p0 instanceof AFh1gSDK) {
            return this.getMonetizationNetwork.AFAdRevenueData("https://%ssdk-services.%s/validate-android-signature");
        }
        if (!(p0 instanceof AFh1iSDK)) {
            bz00.m104536a();
            return null;
        }
        String strAFAdRevenueData = this.getMonetizationNetwork.AFAdRevenueData(component2);
        StringBuilder sb = new StringBuilder();
        sb.append(strAFAdRevenueData);
        sb.append(this.getRevenue.AFAdRevenueData.getCurrencyIso4217Code.getPackageName());
        return sb.toString();
    }

    public /* synthetic */ AFj1mSDK(AFd1pSDK aFd1pSDK, AFj1lSDK aFj1lSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1pSDK, (i & 2) != 0 ? new AFj1nSDK() : aFj1lSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AFj1mSDK(@NotNull AFd1pSDK aFd1pSDK) {
        this(aFd1pSDK, null, 2, 0 == true ? 1 : 0);
        aFd1pSDK.getClass();
    }

    public static String getMonetizationNetwork(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(!z ? "&buildnumber=6.15.0" : "");
        return sb.toString();
    }
}
