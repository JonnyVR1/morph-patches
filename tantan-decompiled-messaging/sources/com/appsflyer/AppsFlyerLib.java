package com.appsflyer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.net.URI;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppsFlyerLib {
    public static AppsFlyerLib getInstance() {
        return AFb1tSDK.getMonetizationNetwork();
    }

    public abstract void addPushNotificationDeepLinkPath(String... strArr);

    public abstract void anonymizeUser(boolean z);

    public abstract void appendParametersToDeepLinkingURL(String str, Map<String, String> map);

    public abstract void enableFacebookDeferredApplinks(boolean z);

    public abstract void enableTCFDataCollection(boolean z);

    @Nullable
    public abstract String getAppsFlyerUID(@NonNull Context context);

    public abstract String getAttributionId(Context context);

    public abstract String getHostName();

    public abstract String getHostPrefix();

    public abstract String getOutOfStore(Context context);

    public abstract String getSdkVersion();

    public abstract AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context);

    public abstract boolean isPreInstalledApp(Context context);

    public abstract boolean isStopped();

    public abstract void logAdRevenue(@NonNull AFAdRevenueData aFAdRevenueData, @Nullable Map<String, Object> map);

    public abstract void logEvent(Context context, String str, Map<String, Object> map);

    public abstract void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener);

    public abstract void logLocation(Context context, double d, double d2);

    public abstract void logSession(Context context);

    public abstract void onPause(Context context);

    @Deprecated
    public abstract void performOnAppAttribution(@NonNull Context context, @NonNull URI uri);

    public abstract void performOnDeepLinking(@NonNull Intent intent, @NonNull Context context);

    public abstract void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener);

    public abstract void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener);

    public abstract void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback);

    public abstract void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback);

    public abstract void sendPushNotificationData(Activity activity);

    public abstract void setAdditionalData(Map<String, Object> map);

    public abstract void setAndroidIdData(String str);

    public abstract void setAppId(String str);

    public abstract void setAppInviteOneLink(String str);

    public abstract void setCollectAndroidID(boolean z);

    public abstract void setCollectIMEI(boolean z);

    @Deprecated
    public abstract void setCollectOaid(boolean z);

    public abstract void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent);

    public abstract void setCurrencyCode(String str);

    public abstract void setCustomerIdAndLogSession(String str, @NonNull Context context);

    public abstract void setCustomerUserId(String str);

    public abstract void setDebugLog(boolean z);

    public abstract void setDisableAdvertisingIdentifiers(boolean z);

    public abstract void setDisableNetworkData(boolean z);

    public abstract void setExtension(String str);

    public abstract void setHost(@Nullable String str, @NonNull String str2);

    public abstract void setImeiData(String str);

    public abstract void setIsUpdate(boolean z);

    public abstract void setLogLevel(AFLogger.LogLevel logLevel);

    public abstract void setMinTimeBetweenSessions(int i);

    public abstract void setOaidData(String str);

    public abstract void setOneLinkCustomDomain(String... strArr);

    public abstract void setOutOfStore(String str);

    public abstract void setPartnerData(@NonNull String str, Map<String, Object> map);

    public abstract void setPhoneNumber(String str);

    public abstract void setPluginInfo(@NonNull PluginInfo pluginInfo);

    public abstract void setPreinstallAttribution(String str, String str2, String str3);

    public abstract void setResolveDeepLinkURLs(String... strArr);

    @Deprecated
    public abstract void setSharingFilter(@NonNull String... strArr);

    @Deprecated
    public abstract void setSharingFilterForAllPartners();

    public abstract void setSharingFilterForPartners(String... strArr);

    public abstract void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr);

    public abstract void setUserEmails(String... strArr);

    public abstract void start(@NonNull Context context);

    public abstract void start(@NonNull Context context, String str);

    public abstract void start(@NonNull Context context, String str, AppsFlyerRequestListener appsFlyerRequestListener);

    public abstract void stop(boolean z, Context context);

    public abstract void subscribeForDeepLink(DeepLinkListener deepLinkListener);

    public abstract void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j);

    public abstract void unregisterConversionListener();

    public abstract void updateServerUninstallToken(Context context, String str);

    public abstract void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map);

    public abstract void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback);

    public abstract void waitForCustomerUserId(boolean z);
}
