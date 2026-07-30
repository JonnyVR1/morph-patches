package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.lvl.AppsFlyerLVL;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1sSDK {

    public interface AFa1ySDK {
        void AFAdRevenueData(String str, Exception exc);

        void getCurrencyIso4217Code(@NonNull String str, @NonNull String str2);
    }

    public final boolean AFAdRevenueData(long j, @NonNull Context context, @NonNull final AFa1ySDK aFa1ySDK) {
        try {
            AppsFlyerLVL.checkLicense(j, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFg1sSDK.2
                public final void onLvlFailure(Exception exc) {
                    aFa1ySDK.AFAdRevenueData("onLvlFailure with exception", exc);
                }

                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1ySDK.getCurrencyIso4217Code(str, str2);
                        return;
                    }
                    AFa1ySDK aFa1ySDK2 = aFa1ySDK;
                    if (str2 == null) {
                        aFa1ySDK2.AFAdRevenueData("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1ySDK2.AFAdRevenueData("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
