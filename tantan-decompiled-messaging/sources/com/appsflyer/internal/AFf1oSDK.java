package com.appsflyer.internal;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFf1oSDK<Result> extends AFf1wSDK<AFe1kSDK<Result>> {
    public final AFg1rSDK areAllFieldsValid;

    @Nullable
    public AFe1kSDK<Result> component1;
    protected final AFb1bSDK component2;
    private AFb1uSDK component3;
    protected final AFe1sSDK component4;

    @Nullable
    private String copydefault;

    public AFf1oSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, @NonNull AFd1fSDK aFd1fSDK, @Nullable String str, @Nullable String str2) {
        this(aFf1zSDK, aFf1zSDKArr, aFd1fSDK.getMonetizationNetwork(), aFd1fSDK.AFKeystoreWrapper(), aFd1fSDK.copydefault(), aFd1fSDK.AFInAppEventType(), str);
        this.copydefault = str2;
    }

    @VisibleForTesting
    @WorkerThread
    private void AFAdRevenueData(AFe1jSDK aFe1jSDK) {
        String str = this.copydefault;
        this.copydefault = this.component3.getMonetizationNetwork(new AFb1qSDK(aFe1jSDK.getRevenue, aFe1jSDK.getMediationNetwork(), "6.15.0", this.AFAdRevenueData));
        if (str != null) {
            this.component3.AFAdRevenueData(str);
        }
    }

    @Nullable
    @WorkerThread
    public abstract AFe1rSDK<Result> AFAdRevenueData(@NonNull String str);

    /* JADX INFO: renamed from: a_ */
    public boolean mo5232a_() {
        return true;
    }

    @Nullable
    public abstract AppsFlyerRequestListener component1();

    public abstract boolean equals();

    @Override // com.appsflyer.internal.AFf1wSDK
    @CallSuper
    public void getCurrencyIso4217Code() {
        String str;
        if (this.getMediationNetwork == AFe1dSDK.SUCCESS) {
            String str2 = this.copydefault;
            if (str2 != null) {
                this.component3.AFAdRevenueData(str2);
                return;
            }
            return;
        }
        if (AFAdRevenueData() || (str = this.copydefault) == null) {
            return;
        }
        this.component3.AFAdRevenueData(str);
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    @CallSuper
    public final void getMediationNetwork(Throwable th) {
        Throwable th2;
        boolean z = !(th instanceof HttpException);
        if (th instanceof AFf1uSDK) {
            th2 = th;
            AFLogger.INSTANCE.m5243e(AFg1cSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th2, true, false);
        } else {
            th2 = th;
            AFLogger.INSTANCE.m5244e(AFg1cSDK.HTTP_CLIENT, "Error while sending request to server: ".concat(String.valueOf(th2)), th2, true, true, z);
        }
        AppsFlyerRequestListener appsFlyerRequestListenerComponent1 = component1();
        if (appsFlyerRequestListenerComponent1 != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            appsFlyerRequestListenerComponent1.onError(40, message);
        }
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    @NonNull
    @CallSuper
    public AFe1dSDK getMonetizationNetwork() throws Exception {
        if (mo5232a_() && this.areAllFieldsValid.getMonetizationNetwork()) {
            AppsFlyerRequestListener appsFlyerRequestListenerComponent1 = component1();
            if (appsFlyerRequestListenerComponent1 != null) {
                appsFlyerRequestListenerComponent1.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFf1uSDK();
        }
        String str = this.areAllFieldsValid.component1;
        if (str == null || str.trim().isEmpty()) {
            AppsFlyerRequestListener appsFlyerRequestListenerComponent2 = component1();
            if (appsFlyerRequestListenerComponent2 != null) {
                appsFlyerRequestListenerComponent2.onError(41, "No dev key");
            }
            throw new AFf1ySDK();
        }
        AFe1rSDK<Result> aFe1rSDKAFAdRevenueData = AFAdRevenueData(str);
        if (aFe1rSDKAFAdRevenueData == null) {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
            return AFe1dSDK.FAILURE;
        }
        if (equals()) {
            AFAdRevenueData(aFe1rSDKAFAdRevenueData.AFAdRevenueData);
        }
        AFe1kSDK<Result> revenue = aFe1rSDKAFAdRevenueData.getRevenue();
        this.component1 = revenue;
        this.component2.getMonetizationNetwork(aFe1rSDKAFAdRevenueData.AFAdRevenueData.getRevenue, revenue.getStatusCode(), revenue.getBody().toString());
        AppsFlyerRequestListener appsFlyerRequestListenerComponent3 = component1();
        if (appsFlyerRequestListenerComponent3 != null) {
            if (revenue.isSuccessful()) {
                appsFlyerRequestListenerComponent3.onSuccess();
            } else {
                StringBuilder sb = new StringBuilder("Status code failure ");
                sb.append(revenue.getStatusCode());
                appsFlyerRequestListenerComponent3.onError(50, sb.toString());
            }
        }
        return revenue.isSuccessful() ? AFe1dSDK.SUCCESS : AFe1dSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public long getRevenue() {
        return Constants.ONE_MIN_IN_MILLIS;
    }

    public AFf1oSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, @NonNull AFd1fSDK aFd1fSDK, @Nullable String str) {
        this(aFf1zSDK, aFf1zSDKArr, aFd1fSDK.getMonetizationNetwork(), aFd1fSDK.AFKeystoreWrapper(), aFd1fSDK.copydefault(), aFd1fSDK.AFInAppEventType(), str);
    }

    private AFf1oSDK(@NonNull AFf1zSDK aFf1zSDK, @NonNull AFf1zSDK[] aFf1zSDKArr, @NonNull AFe1sSDK aFe1sSDK, @NonNull AFg1rSDK aFg1rSDK, @NonNull AFb1bSDK aFb1bSDK, @NonNull AFb1uSDK aFb1uSDK, @Nullable String str) {
        super(aFf1zSDK, aFf1zSDKArr, str);
        this.component4 = aFe1sSDK;
        this.areAllFieldsValid = aFg1rSDK;
        this.component2 = aFb1bSDK;
        this.component3 = aFb1uSDK;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public boolean AFAdRevenueData() {
        if (component2() instanceof AFf1uSDK) {
            return false;
        }
        if (this.getMediationNetwork == AFe1dSDK.TIMEOUT) {
            return true;
        }
        Throwable thComponent2 = component2();
        return (thComponent2 instanceof IOException) && !(thComponent2 instanceof ParsingException);
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public final void getMediationNetwork() {
        String str;
        super.getMediationNetwork();
        if (!equals() || (str = this.areAllFieldsValid.component1) == null || str.trim().isEmpty()) {
            return;
        }
        AFe1rSDK<Result> aFe1rSDKAFAdRevenueData = AFAdRevenueData(str);
        if (aFe1rSDKAFAdRevenueData != null) {
            AFAdRevenueData(aFe1rSDKAFAdRevenueData.AFAdRevenueData);
        } else {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
        }
    }
}
