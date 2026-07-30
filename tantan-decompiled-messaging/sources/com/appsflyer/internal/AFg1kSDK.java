package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1kSDK {

    @NotNull
    private final Map<String, Object> AFAdRevenueData;

    @NotNull
    private final String getMonetizationNetwork;

    @Nullable
    private final PackageManager getRevenue;

    public AFg1kSDK(@NotNull AFd1kSDK aFd1kSDK, @NotNull AFd1pSDK aFd1pSDK) {
        aFd1kSDK.getClass();
        aFd1pSDK.getClass();
        this.AFAdRevenueData = new LinkedHashMap();
        Context context = aFd1kSDK.getCurrencyIso4217Code;
        this.getRevenue = context != null ? context.getPackageManager() : null;
        String packageName = aFd1pSDK.AFAdRevenueData.getCurrencyIso4217Code.getPackageName();
        packageName.getClass();
        this.getMonetizationNetwork = packageName;
    }

    @NotNull
    public final Map<String, Object> getMonetizationNetwork() {
        InstallSourceInfo installSourceInfo;
        String installerPackageName;
        if (this.AFAdRevenueData.isEmpty()) {
            try {
                PackageManager packageManager = this.getRevenue;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.getMonetizationNetwork)) != null) {
                    this.AFAdRevenueData.put("installer_package", installerPackageName);
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", e);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                Map<String, Object> map = this.AFAdRevenueData;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = this.getMonetizationNetwork;
                PackageManager packageManager2 = this.getRevenue;
                if (packageManager2 != null && (installSourceInfo = packageManager2.getInstallSourceInfo(str)) != null) {
                    linkedHashMap = new LinkedHashMap();
                    String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    if (initiatingPackageName != null) {
                        linkedHashMap.put("initiating_package", initiatingPackageName);
                    }
                    String installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (installingPackageName != null) {
                        linkedHashMap.put("installing_package", installingPackageName);
                    }
                    String originatingPackageName = installSourceInfo.getOriginatingPackageName();
                    if (originatingPackageName != null) {
                        linkedHashMap.put("originating_package", originatingPackageName);
                    }
                }
                map.put("install_source_info", linkedHashMap);
            }
        }
        return this.AFAdRevenueData;
    }
}
