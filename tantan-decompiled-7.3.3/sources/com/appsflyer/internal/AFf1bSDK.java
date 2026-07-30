package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p153l.p7f;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1bSDK extends AFf1gSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char AFInAppEventParameterName = 29149;
    private static int AFInAppEventType = -1758471823;
    private static int AFKeystoreWrapper = 0;

    /* JADX INFO: renamed from: d */
    private static int f4256d = 1;
    private static long valueOf = 696497879513028977L;
    private final AFd1pSDK copydefault;
    private final AFd1kSDK equals;
    private final String hashCode;
    private final AFg1fSDK values;

    public AFf1bSDK(@NonNull String str, @NonNull AFd1fSDK aFd1fSDK) {
        super(new AFg1iSDK(aFd1fSDK.valueOf().getCurrencyIso4217Code), aFd1fSDK, str);
        this.copydefault = aFd1fSDK.getMediationNetwork();
        this.equals = aFd1fSDK.valueOf();
        this.hashCode = str;
        this.values = aFd1fSDK.component3();
    }

    /* JADX INFO: renamed from: a */
    private static void m5241a(char c, String str, int i, String str2, String str3, Object[] objArr) {
        char[] charArray;
        char[] charArray2;
        int i2 = $10 + 83;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray3 = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            charArray = str2.toCharArray();
            $10 = ($11 + 9) % 128;
        } else {
            charArray = str2;
        }
        char[] cArr = charArray;
        if (str != null) {
            int i3 = $10 + 49;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray2 = str.toCharArray();
        } else {
            charArray2 = str;
        }
        char[] cArr2 = charArray2;
        AFj1eSDK aFj1eSDK = new AFj1eSDK();
        int length = charArray3.length;
        char[] cArr3 = new char[length];
        int length2 = cArr.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(charArray3, 0, cArr3, 0, length);
        System.arraycopy(cArr, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        aFj1eSDK.getMediationNetwork = 0;
        while (true) {
            int i4 = aFj1eSDK.getMediationNetwork;
            if (i4 >= length3) {
                objArr[0] = new String(cArr5);
                return;
            }
            $10 = ($11 + 61) % 128;
            int i5 = (i4 + 3) % 4;
            int i6 = cArr3[i4 % 4] * 32718;
            char c2 = cArr4[(i4 + 2) % 4];
            char c3 = (char) ((i6 + c2) % p7f.COLOR_SPACE_UNCALIBRATED);
            aFj1eSDK.getMonetizationNetwork = c3;
            cArr4[i5] = (char) (((cArr3[i5] * 32718) + c2) / p7f.COLOR_SPACE_UNCALIBRATED);
            cArr3[i5] = c3;
            cArr5[i4] = (char) (((((long) (cArr2[i4] ^ c3)) ^ (valueOf ^ 696497879513028977L)) ^ ((long) ((int) (((long) AFInAppEventType) ^ 696497879513028977L)))) ^ ((long) ((char) (((long) AFInAppEventParameterName) ^ 696497879513028977L))));
            aFj1eSDK.getMediationNetwork = i4 + 1;
        }
    }

    private void copydefault() {
        f4256d = (AFKeystoreWrapper + 79) % 128;
        this.toString.AFAdRevenueData("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        f4256d = (AFKeystoreWrapper + 73) % 128;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void AFAdRevenueData(AFa1mSDK aFa1mSDK) {
        int i = AFKeystoreWrapper + 105;
        f4256d = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1gSDK, com.appsflyer.internal.AFf1oSDK
    public final boolean equals() {
        int i = AFKeystoreWrapper;
        int i2 = i + 69;
        f4256d = i2 % 128;
        boolean z = i2 % 2 == 0;
        f4256d = (i + 49) % 128;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final void getCurrencyIso4217Code() {
        AFKeystoreWrapper = (f4256d + 51) % 128;
        super.getCurrencyIso4217Code();
        ResponseNetwork responseNetwork = ((AFf1oSDK) this).component1;
        if (responseNetwork != null) {
            int i = f4256d + 87;
            AFKeystoreWrapper = i % 128;
            if (i % 2 != 0) {
                int i2 = 5 / 0;
                if (responseNetwork.isSuccessful()) {
                    copydefault();
                }
            } else if (responseNetwork.isSuccessful()) {
                copydefault();
            }
        }
        f4256d = (AFKeystoreWrapper + 125) % 128;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void getMediationNetwork(AFa1mSDK aFa1mSDK) {
        AFAdRevenueData(new Object[]{this, aFa1mSDK}, -588633218, 588633218, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void getMonetizationNetwork(AFa1mSDK aFa1mSDK) {
        AFKeystoreWrapper = (f4256d + 5) % 128;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void getRevenue(AFa1mSDK aFa1mSDK) {
        AFKeystoreWrapper = (f4256d + 87) % 128;
        super.getRevenue(aFa1mSDK);
        Context context = this.equals.getCurrencyIso4217Code;
        AFb1tSDK monetizationNetwork = AFb1tSDK.getMonetizationNetwork();
        if (context == null) {
            wtq0.m207906a("Context is not provided, can't send register request");
            return;
        }
        if (monetizationNetwork.AFAdRevenueData()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            wtq0.m207906a("CustomerUserId not set, register is not sent");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            aFa1mSDK.getMonetizationNetwork("app_version_code", Integer.toString(packageInfo.versionCode));
            aFa1mSDK.getMonetizationNetwork("app_version_name", packageInfo.versionName);
            aFa1mSDK.getMonetizationNetwork("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFa1mSDK.getMonetizationNetwork("installDate", AFb1tSDK.getMediationNetwork(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
            f4256d = (AFKeystoreWrapper + 27) % 128;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        this.values.AFAdRevenueData(aFa1mSDK.getRevenue());
        aFa1mSDK.getRevenue().remove("ivc");
        String mediationNetwork = AFb1tSDK.getMediationNetwork();
        if (mediationNetwork != null) {
            int i = f4256d + 51;
            AFKeystoreWrapper = i % 128;
            if (i % 2 != 0) {
                aFa1mSDK.getMonetizationNetwork("appUserId", mediationNetwork);
                throw null;
            }
            aFa1mSDK.getMonetizationNetwork("appUserId", mediationNetwork);
        }
        try {
            aFa1mSDK.getMonetizationNetwork("model", Build.MODEL);
            Object[] objArr = new Object[1];
            m5241a((char) ((KeyEvent.getMaxKeyCode() >> 16) + 48847), "䮩늀\uebe7⑵\ue6f2", 705339418 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0000\u0000\u0000\u0000", "\u1aedઠ켪傾", objArr);
            aFa1mSDK.getMonetizationNetwork(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            aFa1mSDK.getMonetizationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        AFb1ySDK aFb1ySDKM5201b_ = AFb1rSDK.m5201b_(context.getContentResolver());
        if (aFb1ySDKM5201b_ != null) {
            aFa1mSDK.getMonetizationNetwork("amazon_aid", aFb1ySDKM5201b_.AFAdRevenueData);
            aFa1mSDK.getMonetizationNetwork("amazon_aid_limit", String.valueOf(aFb1ySDKM5201b_.getMediationNetwork));
        }
        aFa1mSDK.getMonetizationNetwork("devkey", ((AFf1oSDK) this).areAllFieldsValid.component1);
        aFa1mSDK.getMonetizationNetwork(Oauth2AccessToken.KEY_UID, AFb1lSDK.AFAdRevenueData(this.equals, this.toString));
        aFa1mSDK.getMonetizationNetwork("af_gcm_token", this.hashCode);
        aFa1mSDK.getMonetizationNetwork("launch_counter", Integer.toString(this.toString.getMonetizationNetwork("appsFlyerCount", 0)));
        aFa1mSDK.getMonetizationNetwork("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String strComponent4 = this.copydefault.component4();
        if (strComponent4 != null) {
            aFa1mSDK.getMonetizationNetwork("channel", strComponent4);
            AFKeystoreWrapper = (f4256d + 87) % 128;
        }
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i, int i2, int i3) {
        return getCurrencyIso4217Code(objArr);
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void getCurrencyIso4217Code(AFa1mSDK aFa1mSDK) {
        int i = AFKeystoreWrapper + 59;
        f4256d = i % 128;
        int i2 = i % 2;
        AFd1pSDK aFd1pSDK = this.copydefault;
        if (i2 == 0) {
            aFd1pSDK.getMonetizationNetwork();
            throw null;
        }
        String monetizationNetwork = aFd1pSDK.getMonetizationNetwork();
        if (monetizationNetwork != null) {
            aFa1mSDK.getMonetizationNetwork("advertiserId", monetizationNetwork);
            AFKeystoreWrapper = (f4256d + 43) % 128;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        int i = AFKeystoreWrapper + 67;
        f4256d = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }
}
