package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1jSDK implements AFi1fSDK {
    /* JADX INFO: renamed from: B_ */
    private static ProviderInfo m5252B_(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", PackageManager.ComponentInfoFlags.of(0L)) : context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 0);
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, message, th, false, false, false, false, 96, null);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFi1fSDK
    public final boolean getMediationNetwork(@NotNull Context context) {
        context.getClass();
        return m5252B_(context) != null;
    }

    @Override // com.appsflyer.internal.AFi1fSDK
    public final boolean getRevenue(@NotNull Context context) {
        context.getClass();
        ProviderInfo providerInfoM5252B_ = m5252B_(context);
        if (providerInfoM5252B_ == null) {
            return false;
        }
        try {
            return new ServiceVerifyKit.PkgVerifyBuilder(context).setPackageName(((PackageItemInfo) providerInfoM5252B_).packageName).setCertChainKey("com.huawei.appgallery.sign_certchain").setCertSignerKey("com.huawei.appgallery.fingerprint_signature").addLegacyInfo("com.huawei.appmarket", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212").addLegacyInfo("com.huawei.appmarket", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F").isValidPkg();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, message, th, false, false, false, false, 96, null);
            return false;
        }
    }
}
