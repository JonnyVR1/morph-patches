package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H%¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00128\u0005@\u0004X\u0085\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016"}, m87232d2 = {"Lcom/appsflyer/internal/AFi1wSDK;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "getMediationNetwork", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFi1ySDK;", "getMonetizationNetwork", "()Lcom/appsflyer/internal/AFi1ySDK;", "Landroid/net/NetworkInfo;", "", "w_", "(Landroid/net/NetworkInfo;)Z", "AFAdRevenueData", "()Z", "Landroid/net/ConnectivityManager;", "getCurrencyIso4217Code", "Landroid/net/ConnectivityManager;", "Landroid/telephony/TelephonyManager;", "Landroid/telephony/TelephonyManager;", "getRevenue", "AFa1ySDK"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public abstract class AFi1wSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @Nullable
    private final TelephonyManager getRevenue;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @Nullable
    ConnectivityManager getMonetizationNetwork;

    public AFi1wSDK(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        this.getMonetizationNetwork = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        Object systemService2 = context.getSystemService("phone");
        this.getRevenue = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
    }

    /* JADX INFO: renamed from: w_ */
    public static boolean m5257w_(@Nullable NetworkInfo p0) {
        if (p0 != null) {
            return p0.isConnectedOrConnecting();
        }
        return false;
    }

    public abstract boolean AFAdRevenueData();

    @NotNull
    public abstract String getMediationNetwork();

    @NotNull
    public final AFi1ySDK getMonetizationNetwork() {
        Throwable th;
        String str;
        String simOperatorName;
        String networkOperatorName = null;
        try {
            TelephonyManager telephonyManager = this.getRevenue;
            if (telephonyManager != null) {
                simOperatorName = telephonyManager.getSimOperatorName();
                try {
                    networkOperatorName = telephonyManager.getNetworkOperatorName();
                    if (networkOperatorName == null || networkOperatorName.length() == 0) {
                        if (telephonyManager.getPhoneType() == 2) {
                            networkOperatorName = "CDMA";
                        }
                    }
                } catch (Throwable th2) {
                    str = networkOperatorName;
                    networkOperatorName = simOperatorName;
                    th = th2;
                    AFLogger.afErrorLog("Exception while collecting network info. ", th);
                    simOperatorName = networkOperatorName;
                    networkOperatorName = str;
                }
            } else {
                simOperatorName = null;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
        }
        return new AFi1ySDK(getMediationNetwork(), networkOperatorName, simOperatorName, AFAdRevenueData());
    }
}
