package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ii5;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
public final class AFi1rSDK extends AFi1wSDK {

    @NotNull
    private String getMonetizationNetwork;

    @Nullable
    private Network getRevenue;

    public static final class AFa1zSDK extends ConnectivityManager.NetworkCallback {
        public AFa1zSDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NotNull Network network) {
            network.getClass();
            AFi1rSDK.this.getRevenue = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NotNull Network network) {
            network.getClass();
            AFi1rSDK.this.getRevenue = network;
            AFi1rSDK.this.getMonetizationNetwork = "NetworkLost";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1rSDK(@NotNull Context context) {
        super(context);
        context.getClass();
        this.getMonetizationNetwork = "unknown";
        AFa1zSDK aFa1zSDK = new AFa1zSDK();
        try {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            if (connectivityManager != null) {
                ii5.m136340j(connectivityManager, new NetworkRequest.Builder().build(), aFa1zSDK);
            }
        } catch (Throwable th) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th, true, false, false, false, 96, null);
        }
    }

    /* JADX INFO: renamed from: z_ */
    private static boolean m5254z_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1wSDK
    public final boolean AFAdRevenueData() {
        Network network = this.getRevenue;
        if (network == null) {
            return false;
        }
        if (Intrinsics.m87488d(this.getMonetizationNetwork, "NetworkLost")) {
            network = null;
        }
        if (network == null) {
            return false;
        }
        ConnectivityManager connectivityManager = this.getMonetizationNetwork;
        NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
        if (networkCapabilities != null) {
            return m5254z_(networkCapabilities);
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFi1wSDK
    @NotNull
    public final String getMediationNetwork() {
        Network network = this.getRevenue;
        if (network != null) {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "WIFI";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "MOBILE";
                }
            }
        }
        return "unknown";
    }
}
