package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1aSDK.RunnableC09595;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.GoogleApiAvailability;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.tencent.open.SocialOperation;
import java.net.URI;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1tSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    static final String AFAdRevenueData;
    private static int[] AFInAppEventParameterName = null;
    private static int AFKeystoreWrapper = 0;

    @VisibleForTesting
    private static AFb1tSDK areAllFieldsValid = null;
    static AppsFlyerInAppPurchaseValidatorListener getCurrencyIso4217Code = null;
    public static final String getMonetizationNetwork;
    public static final String getRevenue;
    private static int values = 1;
    private AFg1ySDK AFInAppEventType;
    private Map<Long, String> component3;
    private Application copy;

    @NonNull
    private final AFd1nSDK copydefault;
    private boolean hashCode;
    private SharedPreferences toString;
    public volatile AppsFlyerConversionListener getMediationNetwork = null;
    private long component1 = -1;
    private long component2 = -1;
    private long component4 = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
    private boolean equals = false;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1tSDK$4 */
    public static /* synthetic */ class C09454 {
        static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getMonetizationNetwork = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getMonetizationNetwork[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        getRevenue();
        AFAdRevenueData = "295";
        getRevenue = "6.15";
        StringBuilder sb = new StringBuilder();
        sb.append("6.15");
        sb.append("/androidevent?buildnumber=6.15.0&app_id=");
        getMonetizationNetwork = sb.toString();
        getCurrencyIso4217Code = null;
        areAllFieldsValid = new AFb1tSDK();
        int i = AFKeystoreWrapper + 45;
        values = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @VisibleForTesting
    public AFb1tSDK() {
        AFVersionDeclaration.init();
        this.copydefault = new AFd1nSDK();
        getCurrencyIso4217Code().mo5231v().getMonetizationNetwork();
        getCurrencyIso4217Code().mo5231v().getMediationNetwork();
        AFe1aSDK aFe1aSDKCopy = getCurrencyIso4217Code().copy();
        aFe1aSDKCopy.getCurrencyIso4217Code.add(new AFa1vSDK(this, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0143 A[PHI: r8
      0x0143: PHI (r8v15 com.appsflyer.PurchaseHandler) = (r8v14 com.appsflyer.PurchaseHandler), (r8v18 com.appsflyer.PurchaseHandler) binds: [B:40:0x0141, B:37:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i, int i2, int i3) {
        boolean z;
        PurchaseHandler purchaseHandlerAreAllFieldsValid;
        int i4 = ~((~i) | i2);
        int i5 = ~i2;
        int i6 = ~(i5 | i);
        int i7 = (i * 399) + (i2 * 399) + ((i4 | i6 | (~(i5 | i3))) * 398) + ((i | i2) * (-1194)) + (((~((~i3) | i5)) | i4 | i6) * 398);
        byte b = 0;
        switch (i7) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                return getCurrencyIso4217Code(objArr);
            case 3:
                return getRevenue(objArr);
            case 4:
                AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
                String str = (String) objArr[1];
                AFKeystoreWrapper = (values + 85) % 128;
                aFb1tSDK.getCurrencyIso4217Code().copydefault().getMediationNetwork("setImeiData", str);
                aFb1tSDK.getCurrencyIso4217Code().AFKeystoreWrapper().areAllFieldsValid = str;
                AFKeystoreWrapper = (values + 1) % 128;
                return null;
            case 5:
                AFb1tSDK aFb1tSDK2 = (AFb1tSDK) objArr[0];
                AFa1mSDK aFa1mSDK = (AFa1mSDK) objArr[1];
                if (aFa1mSDK.component4 == null) {
                    int i8 = (values + 21) % 128;
                    AFKeystoreWrapper = i8;
                    values = (i8 + 43) % 128;
                    z = true;
                } else {
                    z = false;
                }
                if (aFb1tSDK2.AFAdRevenueData()) {
                    AFKeystoreWrapper = (values + 51) % 128;
                    AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                    return null;
                }
                if (z) {
                    if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                        AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                    } else if (aFb1tSDK2.component1()) {
                        values = (AFKeystoreWrapper + 53) % 128;
                        AppsFlyerRequestListener appsFlyerRequestListener = aFa1mSDK.getRevenue;
                        if (appsFlyerRequestListener != null) {
                            appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        }
                        return null;
                    }
                    aFb1tSDK2.component1 = System.currentTimeMillis();
                }
                AFj1oSDK.getRevenue(aFb1tSDK2.getCurrencyIso4217Code().getCurrencyIso4217Code(), new AFa1uSDK(aFb1tSDK2, aFa1mSDK, b), 0L, TimeUnit.MILLISECONDS);
                return null;
            case 6:
                String str2 = (String) objArr[0];
                int i9 = AFKeystoreWrapper + 39;
                values = i9 % 128;
                int i10 = i9 % 2;
                boolean z2 = AppsFlyerProperties.getInstance().getBoolean(str2, false);
                values = (AFKeystoreWrapper + 117) % 128;
                return Boolean.valueOf(z2);
            case 7:
                return getMediationNetwork(objArr);
            case 8:
                return areAllFieldsValid(objArr);
            case 9:
                return component1(objArr);
            case 10:
                AFb1tSDK aFb1tSDK3 = (AFb1tSDK) objArr[0];
                Context context = (Context) objArr[1];
                Map<String, Object> map = (Map) objArr[2];
                PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback = (PurchaseHandler.PurchaseValidationCallback) objArr[3];
                int i11 = values + 87;
                AFKeystoreWrapper = i11 % 128;
                if (i11 % 2 != 0) {
                    aFb1tSDK3.getCurrencyIso4217Code(context);
                    purchaseHandlerAreAllFieldsValid = aFb1tSDK3.getCurrencyIso4217Code().areAllFieldsValid();
                    String[] strArr = new String[0];
                    strArr[0] = SchemeKey.subscriptions;
                    if (purchaseHandlerAreAllFieldsValid.getMonetizationNetwork(map, purchaseValidationCallback, strArr)) {
                        AFf1vSDK aFf1vSDK = new AFf1vSDK(map, purchaseValidationCallback, purchaseHandlerAreAllFieldsValid.getMonetizationNetwork);
                        AFe1aSDK aFe1aSDK = purchaseHandlerAreAllFieldsValid.AFAdRevenueData;
                        aFe1aSDK.AFAdRevenueData.execute(aFe1aSDK.new RunnableC09595(aFf1vSDK));
                        AFKeystoreWrapper = (values + 31) % 128;
                    }
                } else {
                    aFb1tSDK3.getCurrencyIso4217Code(context);
                    purchaseHandlerAreAllFieldsValid = aFb1tSDK3.getCurrencyIso4217Code().areAllFieldsValid();
                    if (purchaseHandlerAreAllFieldsValid.getMonetizationNetwork(map, purchaseValidationCallback, SchemeKey.subscriptions)) {
                        AFf1vSDK aFf1vSDK2 = new AFf1vSDK(map, purchaseValidationCallback, purchaseHandlerAreAllFieldsValid.getMonetizationNetwork);
                        AFe1aSDK aFe1aSDK2 = purchaseHandlerAreAllFieldsValid.AFAdRevenueData;
                        aFe1aSDK2.AFAdRevenueData.execute(aFe1aSDK2.new RunnableC09595(aFf1vSDK2));
                        AFKeystoreWrapper = (values + 31) % 128;
                    }
                }
                return null;
            case 11:
                ((AFb1tSDK) objArr[0]).getRevenue(new AFh1oSDK());
                AFKeystoreWrapper = (values + 95) % 128;
                return null;
            case 12:
                return component3(objArr);
            case 13:
                return component2(objArr);
            case 14:
                return component4(objArr);
            case 15:
                return copydefault(objArr);
            case 16:
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                AFKeystoreWrapper = (values + 111) % 128;
                AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(zBooleanValue)));
                getCurrencyIso4217Code(AppsFlyerProperties.DISABLE_NETWORK_DATA, zBooleanValue);
                AFKeystoreWrapper = (values + 21) % 128;
                return null;
            case 17:
                AFb1tSDK aFb1tSDK4 = (AFb1tSDK) objArr[0];
                values = (AFKeystoreWrapper + 39) % 128;
                AFj1zSDK[] aFj1zSDKArrAFAdRevenueData = aFb1tSDK4.getCurrencyIso4217Code().equals().AFAdRevenueData();
                values = (AFKeystoreWrapper + 63) % 128;
                return aFj1zSDKArrAFAdRevenueData;
            case 18:
                return copy(objArr);
            case 19:
                return hashCode(objArr);
            case 20:
                return toString(objArr);
            case 21:
                return equals(objArr);
            case 22:
                return AFInAppEventParameterName(objArr);
            case 23:
                AFb1tSDK aFb1tSDK5 = (AFb1tSDK) objArr[0];
                Context context2 = (Context) objArr[1];
                String str3 = (String) objArr[2];
                AFh1mSDK aFh1mSDK = new AFh1mSDK();
                aFb1tSDK5.getCurrencyIso4217Code(context2);
                aFh1mSDK.component4 = null;
                aFh1mSDK.getMonetizationNetwork = null;
                aFh1mSDK.component2 = str3;
                aFh1mSDK.getCurrencyIso4217Code = null;
                AFAdRevenueData(new Object[]{aFb1tSDK5, aFh1mSDK}, 155939583, -155939578, System.identityHashCode(aFb1tSDK5));
                AFKeystoreWrapper = (values + 43) % 128;
                return null;
            case 24:
                return values(objArr);
            default:
                return getMonetizationNetwork(objArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r6.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", r6.getPackageName()) != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object AFInAppEventParameterName(Object[] objArr) {
        Context context = (Context) objArr[0];
        AFKeystoreWrapper = (values + 57) % 128;
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (Build.VERSION.SDK_INT >= 31) {
                    int i = AFKeystoreWrapper + 35;
                    values = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 60 / 0;
                        if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) != 0) {
                            int i3 = values + 123;
                            AFKeystoreWrapper = i3 % 128;
                            if (i3 % 2 != 0) {
                                AFLogger.INSTANCE.mo5194i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", false);
                                return null;
                            }
                            AFLogger.INSTANCE.mo5194i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                            return null;
                        }
                        AFLogger.INSTANCE.mo5196w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                        return null;
                    }
                } else {
                    if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                        AFLogger.INSTANCE.mo5194i(AFg1cSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return null;
                    }
                    AFLogger.INSTANCE.mo5196w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                }
            }
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.m5251e(AFg1cSDK.GENERAL, "Exception while checking BackupRules: ", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5203a(int[] iArr, int i, Object[] objArr) {
        int i2;
        AFk1wSDK aFk1wSDK = new AFk1wSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AFInAppEventParameterName;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                $10 = ($11 + 11) % 128;
                iArr3[i3] = (int) (((long) iArr2[i3]) ^ 8342409727593535167L);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AFInAppEventParameterName;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                iArr6[i4] = (int) (((long) iArr5[i4]) ^ 8342409727593535167L);
            }
            $10 = ($11 + 35) % 128;
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1wSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i5 = aFk1wSDK.getCurrencyIso4217Code;
            if (i5 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            $10 = ($11 + 105) % 128;
            int i6 = iArr[i5];
            char c = (char) (i6 >> 16);
            cArr[0] = c;
            char c2 = (char) i6;
            cArr[1] = c2;
            char c3 = (char) (iArr[i5 + 1] >> 16);
            cArr[2] = c3;
            char c4 = (char) iArr[i5 + 1];
            cArr[3] = c4;
            aFk1wSDK.getMediationNetwork = (c << 16) + c2;
            aFk1wSDK.getMonetizationNetwork = (c3 << 16) + c4;
            AFk1wSDK.getMonetizationNetwork(iArr4);
            int i7 = 0;
            while (true) {
                i2 = aFk1wSDK.getMediationNetwork;
                if (i7 < 16) {
                    int i8 = i2 ^ iArr4[i7];
                    aFk1wSDK.getMediationNetwork = i8;
                    int mediationNetwork = AFk1wSDK.getMediationNetwork(i8) ^ aFk1wSDK.getMonetizationNetwork;
                    int i9 = aFk1wSDK.getMediationNetwork;
                    aFk1wSDK.getMediationNetwork = mediationNetwork;
                    aFk1wSDK.getMonetizationNetwork = i9;
                    i7++;
                }
            }
            int i10 = aFk1wSDK.getMonetizationNetwork;
            aFk1wSDK.getMediationNetwork = i10;
            aFk1wSDK.getMonetizationNetwork = i2;
            int i11 = i2 ^ iArr4[16];
            aFk1wSDK.getMonetizationNetwork = i11;
            int i12 = i10 ^ iArr4[17];
            aFk1wSDK.getMediationNetwork = i12;
            cArr[0] = (char) (i12 >>> 16);
            cArr[1] = (char) i12;
            cArr[2] = (char) (i11 >>> 16);
            cArr[3] = (char) i11;
            AFk1wSDK.getMonetizationNetwork(iArr4);
            int i13 = aFk1wSDK.getCurrencyIso4217Code;
            cArr2[i13 * 2] = cArr[0];
            cArr2[(i13 * 2) + 1] = cArr[1];
            cArr2[(i13 * 2) + 2] = cArr[2];
            cArr2[(i13 * 2) + 3] = cArr[3];
            aFk1wSDK.getCurrencyIso4217Code = i13 + 2;
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        AFj1sSDK aFj1sSDK = new AFj1sSDK((Intent) objArr[2]);
        if (aFj1sSDK.getMonetizationNetwork("appsflyer_preinstall") != null) {
            component2(aFj1sSDK.getMonetizationNetwork("appsflyer_preinstall"));
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String monetizationNetwork = aFj1sSDK.getMonetizationNetwork("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(monetizationNetwork)));
        if (monetizationNetwork != null) {
            AFKeystoreWrapper = (values + 45) % 128;
            aFb1tSDK.getRevenue(context).getRevenue("referrer", monetizationNetwork);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", monetizationNetwork);
            appsFlyerProperties.AFAdRevenueData = monetizationNetwork;
            if (AppsFlyerProperties.getInstance().getRevenue()) {
                int i = AFKeystoreWrapper + 73;
                values = i % 128;
                if (i % 2 == 0) {
                    AFLogger.afInfoLog("onReceive: isLaunchCalled");
                    aFb1tSDK.AFAdRevenueData(context, AFh1xSDK.onReceive);
                    aFb1tSDK.getMediationNetwork(monetizationNetwork);
                    throw null;
                }
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                aFb1tSDK.AFAdRevenueData(context, AFh1xSDK.onReceive);
                aFb1tSDK.getMediationNetwork(monetizationNetwork);
                values = (AFKeystoreWrapper + 107) % 128;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0062  */
    /* JADX WARN: Code duplicated, block: B:14:0x0071  */
    /* JADX WARN: Code duplicated, block: B:9:0x0056  */
    private static /* synthetic */ Object component1(Object[] objArr) {
        int i;
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        String str = (String) objArr[1];
        int i2 = AFKeystoreWrapper + 55;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            aFb1tSDK.getCurrencyIso4217Code().copydefault().getMediationNetwork("setAppInviteOneLink", str);
            AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
            if (str != null) {
                i = values + 43;
                AFKeystoreWrapper = i % 128;
                if (i % 2 == 0) {
                    str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID));
                    throw null;
                }
                if (!str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
                }
            }
            getRevenue(AppsFlyerProperties.ONELINK_ID, str);
            return null;
        }
        AFb1bSDK aFb1bSDKCopydefault = aFb1tSDK.getCurrencyIso4217Code().copydefault();
        String[] strArr = new String[1];
        strArr[1] = str;
        aFb1bSDKCopydefault.getMediationNetwork("setAppInviteOneLink", strArr);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str != null) {
            i = values + 43;
            AFKeystoreWrapper = i % 128;
            if (i % 2 == 0) {
                str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID));
                throw null;
            }
            if (!str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            }
        }
        getRevenue(AppsFlyerProperties.ONELINK_ID, str);
        return null;
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        values = (AFKeystoreWrapper + 67) % 128;
        getRevenue(AppsFlyerProperties.ONELINK_ID, str);
        return null;
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        final AppsFlyerRequestListener appsFlyerRequestListener = (AppsFlyerRequestListener) objArr[3];
        if (aFb1tSDK.getCurrencyIso4217Code().mo5230i().getCurrencyIso4217Code()) {
            return null;
        }
        if (!aFb1tSDK.hashCode) {
            int i = AFKeystoreWrapper + 111;
            values = i % 128;
            if (i % 2 == 0) {
                component1("start");
                throw null;
            }
            component1("start");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
                return null;
            }
        }
        aFb1tSDK.getCurrencyIso4217Code(context);
        final AFh1qSDK aFh1qSDKComponent4 = aFb1tSDK.getCurrencyIso4217Code().component4();
        aFh1qSDKComponent4.getMediationNetwork(AFa1pSDK.getMonetizationNetwork(context));
        if (aFb1tSDK.copy == null) {
            Application applicationM5217f_ = AFb1vSDK.m5217f_(context);
            if (applicationM5217f_ == null) {
                int i2 = AFKeystoreWrapper + 109;
                values = i2 % 128;
                if (i2 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            values = (AFKeystoreWrapper + 19) % 128;
            aFb1tSDK.copy = applicationM5217f_;
        }
        aFb1tSDK.getCurrencyIso4217Code().copydefault().getMediationNetwork("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
        String str2 = AFAdRevenueData;
        aFLogger.m5255i(aFg1cSDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.15.0", str2));
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(str2);
        aFLogger.m5255i(aFg1cSDK, sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(aFb1tSDK.getCurrencyIso4217Code().getRevenue());
        if (!TextUtils.isEmpty(str)) {
            aFb1tSDK.getCurrencyIso4217Code().AFKeystoreWrapper().component1 = str;
            AFb1kSDK.AFAdRevenueData(str);
        } else if (TextUtils.isEmpty(aFb1tSDK.getCurrencyIso4217Code().AFKeystoreWrapper().component1)) {
            values = (AFKeystoreWrapper + 53) % 128;
            areAllFieldsValid();
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
            }
            return null;
        }
        aFb1tSDK.getCurrencyIso4217Code().component2().getCurrencyIso4217Code(aFb1tSDK.component3());
        aFb1tSDK.component4();
        AFAdRevenueData(new Object[]{aFb1tSDK.copy.getBaseContext()}, -1468835504, 1468835526, (int) System.currentTimeMillis());
        aFb1tSDK.getCurrencyIso4217Code().mo5228d().getRevenue();
        aFb1tSDK.copydefault.mo5230i().getCurrencyIso4217Code(context, new AFd1wSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFb1tSDK.5
            @Override // com.appsflyer.internal.AFd1wSDK.AFa1zSDK
            public final void getMediationNetwork(@NonNull AFh1sSDK aFh1sSDK) {
                aFh1qSDKComponent4.getRevenue();
                AFd1fSDK currencyIso4217Code = AFb1tSDK.this.getCurrencyIso4217Code();
                currencyIso4217Code.component2().getCurrencyIso4217Code(AFb1tSDK.AFAdRevenueData(AFb1tSDK.this));
                AFb1tSDK.getRevenue(AFb1tSDK.this);
                int monetizationNetwork = currencyIso4217Code.getMediationNetwork().getRevenue.getMonetizationNetwork("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (monetizationNetwork < 2) {
                    AFb1tSDK.this.getCurrencyIso4217Code().component1().getRevenue();
                }
                AFh1mSDK aFh1mSDK = new AFh1mSDK();
                if (aFh1sSDK != null) {
                    AFb1tSDK.this.getCurrencyIso4217Code().unregisterClient().m5221p_(AFc1kSDK.getCurrencyIso4217Code(aFh1mSDK), aFh1sSDK.getRevenue, currencyIso4217Code.valueOf().getCurrencyIso4217Code);
                }
                AFb1tSDK aFb1tSDK2 = AFb1tSDK.this;
                aFh1mSDK.getRevenue = appsFlyerRequestListener;
                aFb1tSDK2.getMonetizationNetwork(aFh1mSDK, aFh1sSDK);
            }

            @Override // com.appsflyer.internal.AFd1wSDK.AFa1zSDK
            public final void getMonetizationNetwork() {
                Context context2 = AFb1tSDK.this.getCurrencyIso4217Code().valueOf().getCurrencyIso4217Code;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1qSDK aFh1qSDK = aFh1qSDKComponent4;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = aFh1qSDK.component1;
                if (j != 0) {
                    long j2 = jCurrentTimeMillis - j;
                    if (j2 > 0 && j2 < 1000) {
                        j2 = 1000;
                    }
                    long j3 = j2 / 1000;
                    aFh1qSDK.hashCode = j3;
                    aFh1qSDK.getMediationNetwork.getRevenue("prev_session_dur", j3);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFb1tSDK.this.getCurrencyIso4217Code().afDebugLog().getMonetizationNetwork();
                AFb1bSDK aFb1bSDKCopydefault = AFb1tSDK.this.getCurrencyIso4217Code().copydefault();
                if (aFb1bSDKCopydefault.component2()) {
                    aFb1bSDKCopydefault.getMonetizationNetwork();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        aFb1bSDKCopydefault.mo5197m_(context2.getPackageName(), context2.getPackageManager());
                    }
                    aFb1bSDKCopydefault.AFAdRevenueData();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFb1tSDK.this.getCurrencyIso4217Code().component1().getCurrencyIso4217Code();
                AFb1tSDK.this.getCurrencyIso4217Code().mo5232w().getCurrencyIso4217Code();
            }
        });
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038 A[Catch: JSONException -> 0x0027, TRY_ENTER, TryCatch #0 {JSONException -> 0x0027, blocks: (B:4:0x0023, B:11:0x0038, B:12:0x003c, B:15:0x0042), top: B:24:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x003c A[Catch: JSONException -> 0x0027, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0027, blocks: (B:4:0x0023, B:11:0x0038, B:12:0x003c, B:15:0x0042), top: B:24:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0042 A[Catch: JSONException -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0027, blocks: (B:4:0x0023, B:11:0x0038, B:12:0x003c, B:15:0x0042), top: B:24:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    private static /* synthetic */ Object component3(Object[] objArr) {
        int i;
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
                if (str2 != null) {
                    i = AFKeystoreWrapper + 95;
                    values = i % 128;
                    if (i % 2 != 0) {
                        jSONObject.put("c", str2);
                        throw null;
                    }
                    jSONObject.put("c", str2);
                }
                if (str3 != null) {
                    jSONObject.put("af_siteid", str3);
                }
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        } else {
            if (str2 != null) {
                i = AFKeystoreWrapper + 95;
                values = i % 128;
                if (i % 2 != 0) {
                    jSONObject.put("c", str2);
                    throw null;
                }
                jSONObject.put("c", str2);
            }
            if (str3 != null) {
                jSONObject.put("af_siteid", str3);
            }
        }
        if (!jSONObject.has("pid")) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            return null;
        }
        values = (AFKeystoreWrapper + 99) % 128;
        getRevenue("preInstallName", jSONObject.toString());
        return null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        if (aFb1tSDK.component1 > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - aFb1tSDK.component1;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String mediationNetwork = getMediationNetwork(simpleDateFormat, aFb1tSDK.component1);
            String mediationNetwork2 = getMediationNetwork(simpleDateFormat, aFb1tSDK.component2);
            if (jCurrentTimeMillis < aFb1tSDK.component4) {
                int i = AFKeystoreWrapper + 85;
                values = i % 128;
                if (i % 2 == 0) {
                    aFb1tSDK.isStopped();
                    throw null;
                }
                if (!aFb1tSDK.isStopped()) {
                    AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", mediationNetwork, mediationNetwork2, Long.valueOf(jCurrentTimeMillis), Long.valueOf(aFb1tSDK.component4)));
                    return Boolean.TRUE;
                }
            }
            if (!aFb1tSDK.isStopped()) {
                values = (AFKeystoreWrapper + 15) % 128;
                AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", mediationNetwork, mediationNetwork2, Long.valueOf(jCurrentTimeMillis)));
            }
            AFKeystoreWrapper = (values + 97) % 128;
        } else if (!aFb1tSDK.isStopped()) {
            int i2 = AFKeystoreWrapper + 91;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                AFLogger.afInfoLog("Sending first launch for this session!");
                int i3 = 54 / 0;
            } else {
                AFLogger.afInfoLog("Sending first launch for this session!");
            }
        }
        values = (AFKeystoreWrapper + 107) % 128;
        return Boolean.FALSE;
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        int i = AFKeystoreWrapper + 71;
        values = i % 128;
        if (i % 2 == 0) {
            aFb1tSDK.start(context, str, null);
            throw null;
        }
        aFb1tSDK.start(context, str, null);
        int i2 = AFKeystoreWrapper + 27;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) objArr[1];
        Map map = (Map) objArr[2];
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = (AppsFlyerInAppPurchaseValidationCallback) objArr[3];
        AFe1aSDK aFe1aSDKCopy = aFb1tSDK.copydefault.copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new RunnableC09595(new AFf1lSDK(aFb1tSDK.copydefault, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i = AFKeystoreWrapper + 115;
        values = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        AFg1zSDK aFg1zSDK = (AFg1zSDK) objArr[1];
        values = (AFKeystoreWrapper + 85) % 128;
        AFd1fSDK currencyIso4217Code = aFb1tSDK.getCurrencyIso4217Code();
        if (aFg1zSDK == AFg1zSDK.SUCCESS) {
            int i = values + 81;
            AFKeystoreWrapper = i % 128;
            if (i % 2 != 0) {
                currencyIso4217Code.afDebugLog().getCurrencyIso4217Code();
                int i2 = 90 / 0;
            } else {
                currencyIso4217Code.afDebugLog().getCurrencyIso4217Code();
            }
            values = (AFKeystoreWrapper + 3) % 128;
        }
        if (currencyIso4217Code.copydefault().getCurrencyIso4217Code()) {
            currencyIso4217Code.mo5231v().getMonetizationNetwork();
            return null;
        }
        currencyIso4217Code.mo5231v().getCurrencyIso4217Code();
        return null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String str = (String) objArr[0];
        if (str == null) {
            return null;
        }
        if (str.matches("fb\\d*?://authorize.*") && str.contains("access_token")) {
            int i = values + 9;
            AFKeystoreWrapper = i % 128;
            if (i % 2 != 0) {
                getMonetizationNetwork(str).length();
                throw null;
            }
            String monetizationNetwork = getMonetizationNetwork(str);
            if (monetizationNetwork.length() != 0) {
                ArrayList arrayList = new ArrayList();
                if (monetizationNetwork.contains("&")) {
                    arrayList = new ArrayList(Arrays.asList(monetizationNetwork.split("&")));
                    AFKeystoreWrapper = (values + 41) % 128;
                } else {
                    arrayList.add(monetizationNetwork);
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i2 = AFKeystoreWrapper + 51;
                    values = i2 % 128;
                    if (i2 % 2 == 0) {
                        ((String) it.next()).contains("access_token");
                        throw null;
                    }
                    String str2 = (String) it.next();
                    if (str2.contains("access_token")) {
                        it.remove();
                    } else {
                        if (sb.length() != 0) {
                            sb.append("&");
                        } else if (!str2.startsWith("?")) {
                            AFKeystoreWrapper = (values + 123) % 128;
                            sb.append("?");
                        }
                        sb.append(str2);
                        values = (AFKeystoreWrapper + 33) % 128;
                    }
                }
                return str.replace(monetizationNetwork, sb.toString());
            }
        }
        return str;
    }

    private static void getMediationNetwork(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            int i = 0;
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                while (i < jSONArray.length()) {
                    int i2 = values + 45;
                    AFKeystoreWrapper = i2 % 128;
                    if (i2 % 2 != 0) {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                        i += 48;
                    } else {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                        i++;
                    }
                }
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (true) {
                if (!itKeys2.hasNext() || str != null) {
                    break loop2;
                }
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i3 = 0;
                    while (i3 < jSONArray2.length()) {
                        int i4 = values + 49;
                        AFKeystoreWrapper = i4 % 128;
                        if (i4 % 2 == 0) {
                            if (jSONArray2.getLong(i3) == ((Long) arrayList.get(0)).longValue()) {
                                break;
                            }
                            if (jSONArray2.getLong(i3) == ((Long) arrayList.get(1)).longValue()) {
                                break;
                            }
                            break;
                            break;
                        }
                        if (jSONArray2.getLong(i3) == ((Long) arrayList.get(1)).longValue()) {
                            break;
                        }
                        if (jSONArray2.getLong(i3) == ((Long) arrayList.get(1)).longValue() || jSONArray2.getLong(i3) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            break;
                        }
                        i3++;
                        str = next;
                    }
                } catch (JSONException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                }
            }
        }
        if (str != null) {
            int i5 = values + 43;
            AFKeystoreWrapper = i5 % 128;
            if (i5 % 2 == 0) {
                jSONObject.remove(str);
            } else {
                jSONObject.remove(str);
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
    private void getRevenue(AFa1mSDK aFa1mSDK) {
        String strAFAdRevenueData;
        long j;
        int i = AFKeystoreWrapper + 3;
        values = i % 128;
        if (i % 2 == 0) {
            Context context = getCurrencyIso4217Code().valueOf().getCurrencyIso4217Code;
            throw null;
        }
        Context context2 = getCurrencyIso4217Code().valueOf().getCurrencyIso4217Code;
        if (context2 == null) {
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        String str = getCurrencyIso4217Code().AFKeystoreWrapper().component1;
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1mSDK.getRevenue;
        if (str != null) {
            AFKeystoreWrapper = (values + 15) % 128;
            if (str.length() != 0) {
                AFd1rSDK revenue = getRevenue(context2);
                AppsFlyerProperties.getInstance().saveProperties(revenue);
                if (!getCurrencyIso4217Code().AFKeystoreWrapper().getMonetizationNetwork()) {
                    AFLogger.afInfoLog("sendWithEvent from activity: ".concat(context2.getClass().getName()));
                    values = (AFKeystoreWrapper + 101) % 128;
                }
                boolean zAFAdRevenueData = aFa1mSDK.AFAdRevenueData();
                Map<String, ?> mapAFAdRevenueData = AFAdRevenueData(aFa1mSDK);
                if (!isStopped()) {
                    AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
                    values = (AFKeystoreWrapper + 121) % 128;
                }
                int i2 = 0;
                int revenue2 = getRevenue(revenue, false);
                AFj1mSDK aFj1mSDK = new AFj1mSDK(getCurrencyIso4217Code().getMediationNetwork());
                boolean zAFAdRevenueData2 = aFa1mSDK.AFAdRevenueData();
                boolean z = aFa1mSDK instanceof AFh1rSDK;
                boolean z2 = aFa1mSDK instanceof AFh1nSDK;
                if (aFa1mSDK instanceof AFh1oSDK) {
                    strAFAdRevenueData = aFj1mSDK.getMonetizationNetwork.AFAdRevenueData(AFj1mSDK.getMonetizationNetwork);
                } else {
                    AFKeystoreWrapper = (values + 85) % 128;
                    if (z2) {
                        strAFAdRevenueData = aFj1mSDK.getMonetizationNetwork.AFAdRevenueData(AFj1mSDK.getMonetizationNetwork);
                    } else if (z) {
                        strAFAdRevenueData = aFj1mSDK.getMonetizationNetwork.AFAdRevenueData(AFj1mSDK.AFAdRevenueData);
                    } else if (zAFAdRevenueData2) {
                        int monetizationNetwork = aFj1mSDK.getRevenue.getRevenue.getMonetizationNetwork("appsFlyerCount", 0);
                        AFj1lSDK aFj1lSDK = aFj1mSDK.getMonetizationNetwork;
                        strAFAdRevenueData = monetizationNetwork < 2 ? aFj1lSDK.AFAdRevenueData(AFj1mSDK.getCurrencyIso4217Code) : aFj1lSDK.AFAdRevenueData(AFj1mSDK.component4);
                    } else {
                        strAFAdRevenueData = aFj1mSDK.getMonetizationNetwork.AFAdRevenueData(AFj1mSDK.areAllFieldsValid);
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(strAFAdRevenueData);
                sb.append(aFj1mSDK.getRevenue.AFAdRevenueData.getCurrencyIso4217Code.getPackageName());
                String mediationNetwork = aFj1mSDK.getMediationNetwork(AFj1mSDK.getMonetizationNetwork(sb.toString(), z));
                getMonetizationNetwork(mapAFAdRevenueData);
                AFc1rSDK aFc1rSDK = new AFc1rSDK(getCurrencyIso4217Code(), aFa1mSDK.getMonetizationNetwork(mediationNetwork).getMediationNetwork(mapAFAdRevenueData).getMonetizationNetwork(revenue2), getCurrencyIso4217Code().mo5228d().AFAdRevenueData());
                if (zAFAdRevenueData) {
                    AFj1zSDK[] aFj1zSDKArr = (AFj1zSDK[]) AFAdRevenueData(new Object[]{this}, 877185266, -877185249, System.identityHashCode(this));
                    int length = aFj1zSDKArr.length;
                    int i3 = 0;
                    while (i2 < length) {
                        AFj1zSDK aFj1zSDK = aFj1zSDKArr[i2];
                        if (aFj1zSDK.component3 == AFj1zSDK.AFa1zSDK.STARTED) {
                            StringBuilder sb2 = new StringBuilder("Failed to get ");
                            sb2.append(aFj1zSDK.getMonetizationNetwork);
                            sb2.append(" referrer, wait ...");
                            AFLogger.afDebugLog(sb2.toString());
                            i3 = 1;
                        }
                        i2++;
                    }
                    if (getCurrencyIso4217Code().mo5228d().getMonetizationNetwork()) {
                        AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                        i2 = 1;
                    } else {
                        i2 = i3;
                    }
                    if (getCurrencyIso4217Code().AFKeystoreWrapper().getCurrencyIso4217Code()) {
                        AFKeystoreWrapper = (values + 55) % 128;
                        i2 = 1;
                    }
                }
                ScheduledExecutorService currencyIso4217Code = getCurrencyIso4217Code().getCurrencyIso4217Code();
                if (i2 != 0) {
                    int i4 = values + 7;
                    AFKeystoreWrapper = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    j = 500;
                } else {
                    j = 0;
                }
                AFj1oSDK.getRevenue(currencyIso4217Code, aFc1rSDK, j, TimeUnit.MILLISECONDS);
                return;
            }
        }
        AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
        AFLogger.afInfoLog("AppsFlyer will not track this event.");
        if (appsFlyerRequestListener != null) {
            AFKeystoreWrapper = (values + 111) % 128;
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r0 = com.appsflyer.internal.AFb1tSDK.AFKeystoreWrapper + 51;
        com.appsflyer.internal.AFb1tSDK.values = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if ((r0 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r0 = r1.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        com.appsflyer.internal.AFe1fSDK.getMonetizationNetwork(new com.appsflyer.internal.AFe1iSDK(r0, r6.trim()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (com.appsflyer.internal.AFc1tSDK.getRevenue(r6) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (com.appsflyer.internal.AFc1tSDK.getRevenue(r6) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r1 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object hashCode(Object[] objArr) {
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = values + 77;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            int i2 = 25 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX INFO: renamed from: i_ */
    public static synchronized SharedPreferences m5209i_(Context context) {
        SharedPreferences sharedPreferences;
        AFb1tSDK monetizationNetwork;
        SharedPreferences sharedPreferences2;
        try {
            if (getMonetizationNetwork().toString == null) {
                int i = values + 17;
                AFKeystoreWrapper = i % 128;
                StrictMode.ThreadPolicy threadPolicy = i % 2;
                try {
                    if (threadPolicy != 0) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        monetizationNetwork = getMonetizationNetwork();
                        sharedPreferences2 = context.getApplicationContext().getSharedPreferences("appsflyer-data", 1);
                        threadPolicy = threadPolicyAllowThreadDiskReads;
                    } else {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        monetizationNetwork = getMonetizationNetwork();
                        sharedPreferences2 = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        threadPolicy = threadPolicyAllowThreadDiskReads2;
                    }
                    monetizationNetwork.toString = sharedPreferences2;
                    StrictMode.setThreadPolicy(threadPolicy);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
            }
            sharedPreferences = getMonetizationNetwork().toString;
            AFKeystoreWrapper = (values + 7) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
        return sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: j_ */
    public /* synthetic */ void m5210j_(Context context, Intent intent) {
        Uri data;
        getCurrencyIso4217Code(context);
        AFc1sSDK aFc1sSDKUnregisterClient = getCurrencyIso4217Code().unregisterClient();
        AFd1rSDK revenue = getCurrencyIso4217Code().getRevenue();
        if (intent != null) {
            values = (AFKeystoreWrapper + 65) % 128;
            if ("android.intent.action.VIEW".equals(intent.getAction())) {
                data = intent.getData();
            } else {
                data = null;
            }
        } else {
            data = null;
        }
        boolean z = (data == null || data.toString().isEmpty()) ? false : true;
        if (revenue.AFAdRevenueData("ddl_sent")) {
            int i = (values + 67) % 128;
            AFKeystoreWrapper = i;
            if (!z) {
                int i2 = i + 105;
                values = i2 % 128;
                if (i2 % 2 != 0) {
                    aFc1sSDKUnregisterClient.getCurrencyIso4217Code("No direct deep link", null);
                    return;
                } else {
                    aFc1sSDKUnregisterClient.getCurrencyIso4217Code("No direct deep link", null);
                    int i3 = 49 / 0;
                    return;
                }
            }
        }
        aFc1sSDKUnregisterClient.m5221p_(AFc1kSDK.getRevenue(aFc1sSDKUnregisterClient.areAllFieldsValid.mo5232w()), intent, context);
    }

    /* JADX INFO: renamed from: k_ */
    public static /* synthetic */ Application m5211k_(AFb1tSDK aFb1tSDK) {
        return (Application) AFAdRevenueData(new Object[]{aFb1tSDK}, 922507371, -922507364, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        AFKeystoreWrapper = (values + 1) % 128;
        String attributionId = aFb1tSDK.getAttributionId(context);
        int i = values + 53;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            return attributionId;
        }
        throw null;
    }

    private static /* synthetic */ Object values(Object[] objArr) {
        AFd1rSDK aFd1rSDK = (AFd1rSDK) objArr[0];
        String str = (String) objArr[1];
        int i = values + 11;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            aFd1rSDK.getCurrencyIso4217Code("CACHED_CHANNEL", null);
            throw null;
        }
        String currencyIso4217Code = aFd1rSDK.getCurrencyIso4217Code("CACHED_CHANNEL", null);
        if (currencyIso4217Code != null) {
            return currencyIso4217Code;
        }
        aFd1rSDK.getRevenue("CACHED_CHANNEL", str);
        values = (AFKeystoreWrapper + 115) % 128;
        return str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = getCurrencyIso4217Code().unregisterClient().getMediationNetwork;
        if (!list.contains(listAsList)) {
            int i = values + 49;
            AFKeystoreWrapper = i % 128;
            if (i % 2 != 0) {
                list.add(listAsList);
                throw null;
            }
            list.add(listAsList);
            AFKeystoreWrapper = (values + 87) % 128;
        }
        AFKeystoreWrapper = (values + 15) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        AFKeystoreWrapper = (values + 47) % 128;
        getCurrencyIso4217Code().copydefault().getMediationNetwork("anonymizeUser", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        int i = values + 49;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        values = (AFKeystoreWrapper + 31) % 128;
        AFc1sSDK aFc1sSDKUnregisterClient = getCurrencyIso4217Code().unregisterClient();
        aFc1sSDKUnregisterClient.AFAdRevenueData = str;
        aFc1sSDKUnregisterClient.getMonetizationNetwork = map;
        int i = values + 7;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            int i2 = 68 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        AFKeystoreWrapper = (values + 35) % 128;
        getCurrencyIso4217Code().mo5228d().AFAdRevenueData(z);
        AFKeystoreWrapper = (values + 59) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z) {
        AFKeystoreWrapper = (values + 5) % 128;
        getRevenue(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
        int i = values + 109;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            int i2 = 4 / 0;
        }
    }

    /* JADX INFO: renamed from: g_ */
    public final void m5212g_(Context context, Intent intent) {
        AFAdRevenueData(new Object[]{this, context, intent}, -375133356, 375133364, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Nullable
    public final String getAppsFlyerUID(@NonNull Context context) {
        getCurrencyIso4217Code().copydefault().getMediationNetwork("getAppsFlyerUID", new String[0]);
        if (context == null) {
            AFKeystoreWrapper = (values + 103) % 128;
            return null;
        }
        getCurrencyIso4217Code(context);
        AFd1pSDK mediationNetwork = getCurrencyIso4217Code().getMediationNetwork();
        String strAFAdRevenueData = AFb1lSDK.AFAdRevenueData(mediationNetwork.AFAdRevenueData, mediationNetwork.getRevenue);
        values = (AFKeystoreWrapper + 33) % 128;
        return strAFAdRevenueData;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        try {
            String mediationNetwork = new AFb1mSDK(context, getCurrencyIso4217Code()).getMediationNetwork();
            values = (AFKeystoreWrapper + 21) % 128;
            return mediationNetwork;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        AFKeystoreWrapper = (values + 71) % 128;
        String mediationNetwork = getCurrencyIso4217Code().values().getMediationNetwork();
        int i = AFKeystoreWrapper + 69;
        values = i % 128;
        if (i % 2 != 0) {
            return mediationNetwork;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i = values + 87;
        AFKeystoreWrapper = i % 128;
        int i2 = i % 2;
        AFe1fSDK aFe1fSDKValues = getCurrencyIso4217Code().values();
        if (i2 != 0) {
            aFe1fSDKValues.getMonetizationNetwork();
            throw null;
        }
        String monetizationNetwork = aFe1fSDKValues.getMonetizationNetwork();
        int i3 = AFKeystoreWrapper + 93;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return monetizationNetwork;
    }

    public final void getMonetizationNetwork(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        values = (AFKeystoreWrapper + 23) % 128;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String currencyIso4217Code = getRevenue(context).getCurrencyIso4217Code("extraReferrers", null);
            if (currencyIso4217Code == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(currencyIso4217Code);
                jSONArray = jSONObject2.has(str) ? new JSONArray((String) jSONObject2.get(str)) : new JSONArray();
                jSONObject = jSONObject2;
            }
            if (jSONArray.length() < 5) {
                jSONArray.put(jCurrentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                AFKeystoreWrapper = (values + 107) % 128;
                getMediationNetwork(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            getRevenue(context).getRevenue("extraReferrers", jSONObject.toString());
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            int i = values + 31;
            AFKeystoreWrapper = i % 128;
            if (i % 2 != 0) {
                int i2 = 0 / 0;
            }
            return string;
        }
        String revenue = getRevenue(context, "AF_STORE");
        if (revenue == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i3 = values + 119;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 99 / 0;
        }
        return revenue;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i = AFKeystoreWrapper + 105;
        values = i % 128;
        if (i % 2 == 0) {
            getCurrencyIso4217Code().copydefault().getMediationNetwork("getSdkVersion", new String[0]);
        } else {
            getCurrencyIso4217Code().copydefault().getMediationNetwork("getSdkVersion", new String[0]);
        }
        return AFd1pSDK.component3();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b A[LOOP:0: B:15:0x0065->B:17:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x00ab  */
    /* JADX INFO: renamed from: h_ */
    public final void m5213h_(Context context, AFc1kSDK aFc1kSDK, Uri uri, @Nullable Uri uri2) {
        Uri.Builder builderBuildUpon;
        Uri.Builder builderBuildUpon2;
        AFc1oSDK aFc1oSDK;
        getCurrencyIso4217Code(context);
        if (!aFc1kSDK.AFAdRevenueData("af_deeplink")) {
            String string = (String) AFAdRevenueData(new Object[]{uri.toString()}, 517046736, -517046734, (int) System.currentTimeMillis());
            AFc1sSDK aFc1sSDKUnregisterClient = getCurrencyIso4217Code().unregisterClient();
            String str = aFc1sSDKUnregisterClient.AFAdRevenueData;
            if (str != null) {
                int i = values + 19;
                AFKeystoreWrapper = i % 128;
                int i2 = i % 2;
                Map<String, String> map = aFc1sSDKUnregisterClient.getMonetizationNetwork;
                if (i2 != 0) {
                    int i3 = 81 / 0;
                    if (map != null) {
                        if (string.contains(str)) {
                            builderBuildUpon = Uri.parse(string).buildUpon();
                            builderBuildUpon2 = Uri.EMPTY.buildUpon();
                            for (Map.Entry<String, String> entry : aFc1sSDKUnregisterClient.getMonetizationNetwork.entrySet()) {
                                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                                builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                            }
                            string = builderBuildUpon.build().toString();
                            aFc1kSDK.getCurrencyIso4217Code.put("appended_query_params", builderBuildUpon2.build().getEncodedQuery());
                            aFc1oSDK = aFc1kSDK.getMediationNetwork;
                            if (aFc1oSDK != null) {
                                aFc1oSDK.getMediationNetwork(aFc1kSDK.getCurrencyIso4217Code);
                            }
                        }
                    }
                } else if (map != null) {
                    if (string.contains(str)) {
                        builderBuildUpon = Uri.parse(string).buildUpon();
                        builderBuildUpon2 = Uri.EMPTY.buildUpon();
                        while (r2.hasNext()) {
                            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                            builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                        }
                        string = builderBuildUpon.build().toString();
                        aFc1kSDK.getCurrencyIso4217Code.put("appended_query_params", builderBuildUpon2.build().getEncodedQuery());
                        aFc1oSDK = aFc1kSDK.getMediationNetwork;
                        if (aFc1oSDK != null) {
                            aFc1oSDK.getMediationNetwork(aFc1kSDK.getCurrencyIso4217Code);
                        }
                    }
                }
            }
            aFc1kSDK.getCurrencyIso4217Code.put("af_deeplink", string);
            AFc1oSDK aFc1oSDK2 = aFc1kSDK.getMediationNetwork;
            if (aFc1oSDK2 != null) {
                aFc1oSDK2.getMediationNetwork(aFc1kSDK.getCurrencyIso4217Code);
            }
        }
        HashMap map2 = new HashMap();
        map2.put(Link.TYPE, uri.toString());
        if (uri2 != null) {
            map2.put("original_link", uri2.toString());
        }
        AFb1vSDK.m5215d_(context, map2, uri);
        AFf1cSDK aFf1cSDK = new AFf1cSDK(getCurrencyIso4217Code(), UUID.randomUUID(), uri);
        if (aFf1cSDK.copydefault()) {
            aFc1kSDK.getCurrencyIso4217Code.put("isBrandedDomain", Boolean.TRUE);
            AFc1oSDK aFc1oSDK3 = aFc1kSDK.getMediationNetwork;
            if (aFc1oSDK3 != null) {
                AFKeystoreWrapper = (values + 49) % 128;
                aFc1oSDK3.getMediationNetwork(aFc1kSDK.getCurrencyIso4217Code);
            }
        }
        if (!aFf1cSDK.copy()) {
            getCurrencyIso4217Code().unregisterClient().AFAdRevenueData(map2);
            return;
        }
        aFf1cSDK.component3 = AFAdRevenueData(map2);
        AFe1aSDK aFe1aSDKCopy = getCurrencyIso4217Code().copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new RunnableC09595(aFf1cSDK));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        long j;
        if (this.hashCode) {
            int i = values + 89;
            AFKeystoreWrapper = i % 128;
            if (i % 2 != 0) {
                int i2 = 71 / 0;
            }
            return this;
        }
        this.hashCode = true;
        getCurrencyIso4217Code().AFKeystoreWrapper().component1 = str;
        AFb1kSDK.AFAdRevenueData(str);
        if (context != null) {
            getCurrencyIso4217Code(context);
            Application applicationM5217f_ = AFb1vSDK.m5217f_(context);
            if (applicationM5217f_ == null) {
                return this;
            }
            this.copy = applicationM5217f_;
            getCurrencyIso4217Code().AFInAppEventType().getMediationNetwork();
            getCurrencyIso4217Code().component4().AFAdRevenueData = System.currentTimeMillis();
            AFe1aSDK aFe1aSDKCopy = getCurrencyIso4217Code().copy();
            aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new RunnableC09595(new AFf1mSDK(getCurrencyIso4217Code())));
            AFi1xSDK aFi1xSDKAFLogger = getCurrencyIso4217Code().AFLogger();
            aFi1xSDKAFLogger.getMediationNetwork = Build.VERSION.SDK_INT >= 31 ? new AFi1rSDK(aFi1xSDKAFLogger.getRevenue) : new AFi1tSDK(aFi1xSDKAFLogger.getRevenue);
            getCurrencyIso4217Code().afDebugLog().getCurrencyIso4217Code(new AFd1bSDK.AFa1ySDK() { // from class: com.appsflyer.internal.c
                @Override // com.appsflyer.internal.AFd1bSDK.AFa1ySDK
                public final void onConfigurationChanged(boolean z) {
                    this.f4272a.getCurrencyIso4217Code(z);
                }
            });
            getCurrencyIso4217Code().component2().getCurrencyIso4217Code(component3());
            AFj1vSDK aFj1vSDKEquals = getCurrencyIso4217Code().equals();
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4273a.equals();
                }
            };
            AFi1gSDK monetizationNetwork = aFj1vSDKEquals.getMonetizationNetwork(runnable);
            Runnable currencyIso4217Code = aFj1vSDKEquals.getCurrencyIso4217Code(monetizationNetwork, runnable);
            aFj1vSDKEquals.getRevenue(monetizationNetwork);
            aFj1vSDKEquals.getRevenue(new AFj1ySDK(aFj1vSDKEquals.AFAdRevenueData.getMediationNetwork(), currencyIso4217Code));
            aFj1vSDKEquals.getRevenue(new AFi1cSDK(currencyIso4217Code, aFj1vSDKEquals.AFAdRevenueData, new AFi1jSDK()));
            aFj1vSDKEquals.getRevenue(new AFj1wSDK(currencyIso4217Code, aFj1vSDKEquals.AFAdRevenueData));
            aFj1vSDKEquals.AFAdRevenueData(currencyIso4217Code);
            if (!aFj1vSDKEquals.getCurrencyIso4217Code()) {
                Context context2 = aFj1vSDKEquals.AFAdRevenueData.valueOf().getCurrencyIso4217Code;
                AFd1fSDK aFd1fSDK = aFj1vSDKEquals.AFAdRevenueData;
                List<ResolveInfo> listQueryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                if (listQueryIntentContentProviders != null && !listQueryIntentContentProviders.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
                    while (it.hasNext()) {
                        ProviderInfo providerInfo = it.next().providerInfo;
                        if (providerInfo != null) {
                            arrayList.add(new AFi1bSDK(providerInfo, currencyIso4217Code, aFd1fSDK));
                        } else {
                            AFLogger.INSTANCE.m5257w(AFg1cSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        aFj1vSDKEquals.getMonetizationNetwork.addAll(arrayList);
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.PREINSTALL;
                        StringBuilder sb = new StringBuilder("Detected ");
                        sb.append(arrayList.size());
                        sb.append(" valid preinstall provider(s)");
                        aFLogger.m5250d(aFg1cSDK, sb.toString());
                    }
                }
            }
            for (AFj1zSDK aFj1zSDK : aFj1vSDKEquals.AFAdRevenueData()) {
                aFj1zSDK.getMonetizationNetwork(aFj1vSDKEquals.AFAdRevenueData.valueOf().getCurrencyIso4217Code);
            }
            AFi1mSDK aFi1mSDKAfInfoLog = getCurrencyIso4217Code().afInfoLog();
            if (aFi1mSDKAfInfoLog != null) {
                values = (AFKeystoreWrapper + 9) % 128;
                if (aFi1mSDKAfInfoLog.getCurrencyIso4217Code()) {
                    AFe1aSDK aFe1aSDKCopy2 = getCurrencyIso4217Code().copy();
                    aFe1aSDKCopy2.AFAdRevenueData.execute(aFe1aSDKCopy2.new RunnableC09595(new AFf1kSDK(aFi1mSDKAfInfoLog)));
                    AFKeystoreWrapper = (values + 93) % 128;
                }
            }
            final AFg1rSDK aFg1rSDKAFKeystoreWrapper = this.copydefault.AFKeystoreWrapper();
            AFd1pSDK mediationNetwork = getCurrencyIso4217Code().getMediationNetwork();
            aFg1rSDKAFKeystoreWrapper.getCurrencyIso4217Code = System.currentTimeMillis();
            AFg1sSDK aFg1sSDK = aFg1rSDKAFKeystoreWrapper.getMediationNetwork;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AFb1lSDK.AFAdRevenueData(mediationNetwork.AFAdRevenueData, mediationNetwork.getRevenue));
            sb2.append(aFg1rSDKAFKeystoreWrapper.getCurrencyIso4217Code);
            byte[] monetizationNetwork2 = AFb1iSDK.getMonetizationNetwork(sb2.toString());
            if (monetizationNetwork2 == null || monetizationNetwork2.length <= 0) {
                j = -1;
            } else {
                if (monetizationNetwork2.length > 8) {
                    monetizationNetwork2 = Arrays.copyOfRange(monetizationNetwork2, 0, 8);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.put(monetizationNetwork2);
                byteBufferAllocate.flip();
                j = byteBufferAllocate.getLong();
            }
            aFg1rSDKAFKeystoreWrapper.getMonetizationNetwork = aFg1sSDK.AFAdRevenueData(j, aFg1rSDKAFKeystoreWrapper.getRevenue.getCurrencyIso4217Code, new AFg1sSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFg1rSDK.1
                @Override // com.appsflyer.internal.AFg1sSDK.AFa1ySDK
                public final void AFAdRevenueData(String str2, Exception exc) {
                    AFg1rSDK.this.AFAdRevenueData = new ConcurrentHashMap();
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    AFg1rSDK.this.getMediationNetwork();
                    AFg1rSDK.this.AFAdRevenueData.put("error", message);
                    AFLogger.afErrorLog(str2, exc, true, true, false);
                }

                @Override // com.appsflyer.internal.AFg1sSDK.AFa1ySDK
                public final void getCurrencyIso4217Code(@NonNull String str2, @NonNull String str3) {
                    AFg1rSDK.this.AFAdRevenueData = new ConcurrentHashMap();
                    AFg1rSDK.this.AFAdRevenueData.put("signedData", str2);
                    AFg1rSDK.this.AFAdRevenueData.put(SocialOperation.GAME_SIGNATURE, str3);
                    AFg1rSDK.this.getMediationNetwork();
                    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                }
            });
        } else {
            AFLogger.INSTANCE.m5257w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
            AFKeystoreWrapper = (values + 69) % 128;
        }
        getCurrencyIso4217Code().copydefault().getMediationNetwork("init", str, appsFlyerConversionListener == null ? "null" : "conversionDataListener");
        AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.15.0", AFAdRevenueData));
        this.getMediationNetwork = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        AFKeystoreWrapper = (values + 47) % 128;
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
            values = (AFKeystoreWrapper + 71) % 128;
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        values = (AFKeystoreWrapper + 35) % 128;
        boolean monetizationNetwork = getCurrencyIso4217Code().AFKeystoreWrapper().getMonetizationNetwork();
        int i = values + 125;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(@NonNull AFAdRevenueData aFAdRevenueData, @Nullable Map<String, Object> map) {
        AFKeystoreWrapper = (values + 19) % 128;
        if (!this.hashCode) {
            component1("logAdRevenue");
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            values = (AFKeystoreWrapper + 107) % 128;
            AFLogger.INSTANCE.m5257w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
            return;
        }
        if (getCurrencyIso4217Code().AFKeystoreWrapper().getMonetizationNetwork()) {
            int i = AFKeystoreWrapper + 115;
            values = i % 128;
            if (i % 2 == 0) {
                AFLogger.INSTANCE.m5257w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
                throw null;
            }
            AFLogger.INSTANCE.m5257w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
            values = (AFKeystoreWrapper + 31) % 128;
            return;
        }
        if (!AFc1tSDK.getCurrencyIso4217Code(getCurrencyIso4217Code().AFKeystoreWrapper().component1)) {
            AFAdRevenueData(new Object[]{this, new AFh1rSDK(aFAdRevenueData, map)}, 155939583, -155939578, System.identityHashCode(this));
            return;
        }
        int i2 = AFKeystoreWrapper + 73;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            areAllFieldsValid();
        } else {
            areAllFieldsValid();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap map2 = map == null ? null : new HashMap(map);
        getCurrencyIso4217Code(context);
        AFh1kSDK aFh1kSDK = new AFh1kSDK();
        aFh1kSDK.component4 = str;
        aFh1kSDK.getRevenue = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put(BaseSei.f14624X, Float.valueOf(motionEvent.getX()));
                map4.put(BaseSei.f14625Y, Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.mo5196w(AFg1cSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1kSDK.getMediationNetwork(mapSingletonMap);
        }
        aFh1kSDK.getMonetizationNetwork = map2;
        AFb1bSDK aFb1bSDKCopydefault = getCurrencyIso4217Code().copydefault();
        Map map5 = aFh1kSDK.getMonetizationNetwork;
        if (map5 == null) {
            map5 = new HashMap();
        }
        aFb1bSDKCopydefault.getMediationNetwork("logEvent", str, new JSONObject(map5).toString());
        if (str == null) {
            AFAdRevenueData(context, AFh1xSDK.logEvent);
        }
        getMonetizationNetwork(aFh1kSDK, component1(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) {
        getCurrencyIso4217Code().copydefault().getMediationNetwork("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d2));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        getMonetizationNetwork(context, AFInAppEventType.LOCATION_COORDINATES, map);
        AFKeystoreWrapper = (values + 11) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        values = (AFKeystoreWrapper + 81) % 128;
        getCurrencyIso4217Code().copydefault().getMediationNetwork("logSession", new String[0]);
        getCurrencyIso4217Code().copydefault().getMediationNetwork();
        AFAdRevenueData(context, AFh1xSDK.logSession);
        getMonetizationNetwork(context, null, null);
        AFKeystoreWrapper = (values + 75) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        AFKeystoreWrapper = (values + 15) % 128;
        getCurrencyIso4217Code().mo5230i().AFAdRevenueData();
        int i = values + 23;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(@NonNull Context context, @NonNull URI uri) {
        int i = AFKeystoreWrapper + 19;
        int i2 = i % 128;
        values = i2;
        if (i % 2 == 0) {
            throw null;
        }
        if (uri != null) {
            AFKeystoreWrapper = (i2 + 113) % 128;
            if (!uri.toString().isEmpty()) {
                if (context != null) {
                    getCurrencyIso4217Code(context);
                    getCurrencyIso4217Code().unregisterClient().m5222q_(context, AFc1kSDK.getRevenue(getCurrencyIso4217Code().mo5232w()), Uri.parse(uri.toString()));
                    return;
                }
                AFc1sSDK aFc1sSDKUnregisterClient = getCurrencyIso4217Code().unregisterClient();
                StringBuilder sb = new StringBuilder("Context is \"");
                sb.append(context);
                sb.append("\"");
                aFc1sSDKUnregisterClient.getCurrencyIso4217Code(sb.toString(), DeepLinkResult.Error.NETWORK);
                AFKeystoreWrapper = (values + 41) % 128;
                return;
            }
        }
        AFc1sSDK aFc1sSDKUnregisterClient2 = getCurrencyIso4217Code().unregisterClient();
        StringBuilder sb2 = new StringBuilder("Link is \"");
        sb2.append(uri);
        sb2.append("\"");
        aFc1sSDKUnregisterClient2.getCurrencyIso4217Code(sb2.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull final Intent intent, @NonNull Context context) {
        int i = AFKeystoreWrapper;
        values = (i + 119) % 128;
        if (intent != null) {
            if (context == null) {
                getCurrencyIso4217Code().unregisterClient().getCurrencyIso4217Code("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            }
            final Context applicationContext = context.getApplicationContext();
            getCurrencyIso4217Code(applicationContext);
            getCurrencyIso4217Code().AFAdRevenueData().execute(new Runnable() { // from class: com.appsflyer.internal.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4276a.m5210j_(applicationContext, intent);
                }
            });
            return;
        }
        int i2 = i + 67;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            getCurrencyIso4217Code().unregisterClient().getCurrencyIso4217Code("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            throw null;
        }
        getCurrencyIso4217Code().unregisterClient().getCurrencyIso4217Code("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
        int i3 = values + 115;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 48 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = values + 111;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            getCurrencyIso4217Code().copydefault().getMediationNetwork("registerConversionListener", new String[1]);
            AFAdRevenueData(new Object[]{this, appsFlyerConversionListener}, 2118250749, -2118250749, System.identityHashCode(this));
        } else {
            getCurrencyIso4217Code().copydefault().getMediationNetwork("registerConversionListener", new String[0]);
            AFAdRevenueData(new Object[]{this, appsFlyerConversionListener}, 2118250749, -2118250749, System.identityHashCode(this));
        }
        AFKeystoreWrapper = (values + 31) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        getCurrencyIso4217Code().copydefault().getMediationNetwork("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            getCurrencyIso4217Code = appsFlyerInAppPurchaseValidatorListener;
            return;
        }
        int i = AFKeystoreWrapper + 117;
        values = i % 128;
        if (i % 2 == 0) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
            int i2 = 10 / 0;
        } else {
            AFLogger.afDebugLog("registerValidatorListener null listener");
        }
        int i3 = AFKeystoreWrapper + 121;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 37 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003b A[PHI: r2
      0x003b: PHI (r2v3 com.appsflyer.PurchaseHandler) = (r2v2 com.appsflyer.PurchaseHandler), (r2v10 com.appsflyer.PurchaseHandler) binds: [B:8:0x0039, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler purchaseHandlerAreAllFieldsValid;
        int i = AFKeystoreWrapper + 87;
        values = i % 128;
        if (i % 2 == 0) {
            getCurrencyIso4217Code(context);
            purchaseHandlerAreAllFieldsValid = getCurrencyIso4217Code().areAllFieldsValid();
            String[] strArr = new String[0];
            strArr[1] = "purchases";
            if (purchaseHandlerAreAllFieldsValid.getMonetizationNetwork(map, purchaseValidationCallback, strArr)) {
                AFf1pSDK aFf1pSDK = new AFf1pSDK(map, purchaseValidationCallback, purchaseHandlerAreAllFieldsValid.getMonetizationNetwork);
                AFe1aSDK aFe1aSDK = purchaseHandlerAreAllFieldsValid.AFAdRevenueData;
                aFe1aSDK.AFAdRevenueData.execute(aFe1aSDK.new RunnableC09595(aFf1pSDK));
            }
        } else {
            getCurrencyIso4217Code(context);
            purchaseHandlerAreAllFieldsValid = getCurrencyIso4217Code().areAllFieldsValid();
            if (purchaseHandlerAreAllFieldsValid.getMonetizationNetwork(map, purchaseValidationCallback, "purchases")) {
                AFf1pSDK aFf1pSDK2 = new AFf1pSDK(map, purchaseValidationCallback, purchaseHandlerAreAllFieldsValid.getMonetizationNetwork);
                AFe1aSDK aFe1aSDK2 = purchaseHandlerAreAllFieldsValid.AFAdRevenueData;
                aFe1aSDK2.AFAdRevenueData.execute(aFe1aSDK2.new RunnableC09595(aFf1pSDK2));
            }
        }
        int i2 = AFKeystoreWrapper + 97;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFAdRevenueData(new Object[]{this, context, map, purchaseValidationCallback}, -1743867813, 1743867823, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x017d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:8:0x0044  */
    /* JADX WARN: Code duplicated, block: B:9:0x005a  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPushNotificationData(@Nullable Activity activity) {
        long j;
        long jLongValue;
        if (activity != null) {
            values = (AFKeystoreWrapper + 105) % 128;
            if (activity.getIntent() != null) {
                AFb1bSDK aFb1bSDKCopydefault = getCurrencyIso4217Code().copydefault();
                String localClassName = activity.getLocalClassName();
                StringBuilder sb = new StringBuilder("activity_intent_");
                sb.append(activity.getIntent().toString());
                aFb1bSDKCopydefault.getMediationNetwork("sendPushNotificationData", localClassName, sb.toString());
            } else if (activity != null) {
                getCurrencyIso4217Code().copydefault().getMediationNetwork("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
            } else {
                getCurrencyIso4217Code().copydefault().getMediationNetwork("sendPushNotificationData", "activity_null");
            }
        } else if (activity != null) {
            getCurrencyIso4217Code().copydefault().getMediationNetwork("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            getCurrencyIso4217Code().copydefault().getMediationNetwork("sendPushNotificationData", "activity_null");
        }
        AFd1mSDK aFd1mSDKMo5229e = getCurrencyIso4217Code().mo5229e();
        String monetizationNetwork = getMonetizationNetwork(activity);
        aFd1mSDKMo5229e.AFAdRevenueData = monetizationNetwork;
        if (monetizationNetwork != null) {
            AFKeystoreWrapper = (values + 97) % 128;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.component3 == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.component3 = new ConcurrentHashMap();
                AFKeystoreWrapper = (values + 57) % 128;
                jLongValue = jCurrentTimeMillis;
                j = jLongValue;
            } else {
                try {
                    long j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    jLongValue = jCurrentTimeMillis;
                    for (Long l2 : this.component3.keySet()) {
                        try {
                            JSONObject jSONObject = new JSONObject(aFd1mSDKMo5229e.AFAdRevenueData);
                            JSONObject jSONObject2 = new JSONObject(this.component3.get(l2));
                            j = jCurrentTimeMillis;
                            try {
                                if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                    StringBuilder sb2 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                    sb2.append(jSONObject2);
                                    sb2.append(", new: ");
                                    sb2.append(jSONObject);
                                    sb2.append(")");
                                    AFLogger.afInfoLog(sb2.toString());
                                    aFd1mSDKMo5229e.AFAdRevenueData = null;
                                    return;
                                }
                                if (j - l2.longValue() > j2) {
                                    this.component3.remove(l2);
                                }
                                if (l2.longValue() <= jLongValue) {
                                    values = (AFKeystoreWrapper + 101) % 128;
                                    jLongValue = l2.longValue();
                                    AFKeystoreWrapper = (values + 7) % 128;
                                }
                                jCurrentTimeMillis = j;
                            } catch (Throwable th) {
                                th = th;
                                AFLogger.afErrorLog("Error while handling push notification measurement: ".concat(th.getClass().getSimpleName()), th);
                                if (this.component3.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                                    StringBuilder sb3 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                                    sb3.append(jLongValue);
                                    sb3.append(")");
                                    AFLogger.afInfoLog(sb3.toString());
                                    this.component3.remove(Long.valueOf(jLongValue));
                                }
                                this.component3.put(Long.valueOf(j), aFd1mSDKMo5229e.AFAdRevenueData);
                                start(activity);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j = jCurrentTimeMillis;
                        }
                    }
                    j = jCurrentTimeMillis;
                } catch (Throwable th3) {
                    th = th3;
                    j = jCurrentTimeMillis;
                    jLongValue = j;
                }
            }
            if (this.component3.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                StringBuilder sb4 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb4.append(jLongValue);
                sb4.append(")");
                AFLogger.afInfoLog(sb4.toString());
                this.component3.remove(Long.valueOf(jLongValue));
            }
            this.component3.put(Long.valueOf(j), aFd1mSDKMo5229e.AFAdRevenueData);
            start(activity);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        AFKeystoreWrapper = (values + 105) % 128;
        if (map != null) {
            getCurrencyIso4217Code().copydefault().getMediationNetwork("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            AFKeystoreWrapper = (values + 117) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        values = (AFKeystoreWrapper + 117) % 128;
        getCurrencyIso4217Code().copydefault().getMediationNetwork("setAndroidIdData", str);
        getCurrencyIso4217Code().mo5229e().getRevenue = str;
        int i = values + 29;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        AFKeystoreWrapper = (values + 73) % 128;
        getCurrencyIso4217Code().copydefault().getMediationNetwork("setAppId", str);
        getRevenue("appid", str);
        AFKeystoreWrapper = (values + 111) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        AFAdRevenueData(new Object[]{this, str}, 1443776899, -1443776890, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        AFAdRevenueData(new Object[]{this, Boolean.valueOf(z)}, 1925386951, -1925386948, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        values = (AFKeystoreWrapper + 79) % 128;
        getCurrencyIso4217Code().copydefault().getMediationNetwork("setCollectIMEI", String.valueOf(z));
        getRevenue(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        getRevenue(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
        int i = AFKeystoreWrapper + 15;
        values = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        int i = values + 25;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            AFb1bSDK aFb1bSDKCopydefault = getCurrencyIso4217Code().copydefault();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z);
            aFb1bSDKCopydefault.getMediationNetwork("setCollectOaid", strArr);
        } else {
            getCurrencyIso4217Code().copydefault().getMediationNetwork("setCollectOaid", String.valueOf(z));
        }
        getRevenue(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent) {
        values = (AFKeystoreWrapper + 73) % 128;
        Objects.requireNonNull(appsFlyerConsent);
        getCurrencyIso4217Code().mo5229e().component2 = appsFlyerConsent;
        int i = values + 11;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        values = (AFKeystoreWrapper + 79) % 128;
        getCurrencyIso4217Code().copydefault().getMediationNetwork("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        AFKeystoreWrapper = (values + 3) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        if (context != null) {
            AFKeystoreWrapper = (values + 55) % 128;
            if (!AFAdRevenueData()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                AFKeystoreWrapper = (values + 51) % 128;
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(getCurrencyIso4217Code().getRevenue());
            AFAdRevenueData(context, AFh1xSDK.setCustomerIdAndLogSession);
            String str2 = getCurrencyIso4217Code().AFKeystoreWrapper().component1;
            if (referrer == null) {
                int i = AFKeystoreWrapper + 67;
                values = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                referrer = "";
            }
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
            }
            AFAdRevenueData(new Object[]{this, context, referrer}, 2085500355, -2085500332, System.identityHashCode(this));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        AFKeystoreWrapper = (values + 25) % 128;
        getCurrencyIso4217Code().copydefault().getMediationNetwork("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getRevenue(AppsFlyerProperties.APP_USER_ID, str);
        getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i = values + 75;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        values = (AFKeystoreWrapper + 97) % 128;
        if (z) {
            logLevel = AFLogger.LogLevel.DEBUG;
            values = (AFKeystoreWrapper + 93) % 128;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        boolean z2;
        int i = AFKeystoreWrapper + 57;
        values = i % 128;
        if (i % 2 == 0) {
            AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
            throw null;
        }
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        if (z) {
            AFKeystoreWrapper = (values + 103) % 128;
            z2 = false;
        } else {
            z2 = true;
        }
        AFb1rSDK.AFAdRevenueData = Boolean.valueOf(z2);
        AFd1fSDK currencyIso4217Code = getCurrencyIso4217Code();
        currencyIso4217Code.mo5229e().component3 = z;
        if (z) {
            values = (AFKeystoreWrapper + 67) % 128;
            currencyIso4217Code.mo5229e().component4 = null;
        } else {
            AFe1aSDK aFe1aSDKCopy = currencyIso4217Code.copy();
            aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new RunnableC09595(new AFf1mSDK(getCurrencyIso4217Code())));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        AFAdRevenueData(new Object[]{this, Boolean.valueOf(z)}, 2142403549, -2142403533, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        values = (AFKeystoreWrapper + 41) % 128;
        getCurrencyIso4217Code().copydefault().getMediationNetwork("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        AFKeystoreWrapper = (values + 51) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(@Nullable String str, @NonNull String str2) {
        AFAdRevenueData(new Object[]{this, str, str2}, -1971399576, 1971399595, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        AFAdRevenueData(new Object[]{this, str}, -863171167, 863171171, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        AFKeystoreWrapper = (values + 5) % 128;
        getCurrencyIso4217Code().copydefault().getMediationNetwork("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        int i = values + 59;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        AFKeystoreWrapper = (values + 47) % 128;
        boolean z = false;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            int i = AFKeystoreWrapper + 19;
            values = i % 128;
            if (i % 2 != 0) {
                z = true;
            }
        }
        getCurrencyIso4217Code().copydefault().getMediationNetwork("log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (z) {
            getCurrencyIso4217Code().mo5231v().component1();
        } else {
            getCurrencyIso4217Code().mo5231v().getMediationNetwork();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        int i2 = AFKeystoreWrapper + 103;
        values = i2 % 128;
        int i3 = i2 % 2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (i3 != 0) {
            this.component4 = timeUnit.toMillis(i);
        } else {
            this.component4 = timeUnit.toMillis(i);
            int i4 = 10 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        AFKeystoreWrapper = (values + 43) % 128;
        getCurrencyIso4217Code().copydefault().getMediationNetwork("setOaidData", str);
        AFb1rSDK.getMonetizationNetwork = str;
        int i = values + 69;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        values = (AFKeystoreWrapper + 71) % 128;
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        getCurrencyIso4217Code().unregisterClient().component4 = strArr;
        values = (AFKeystoreWrapper + 115) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i = values;
        AFKeystoreWrapper = (i + 45) % 128;
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        AFKeystoreWrapper = (i + 3) % 128;
        String lowerCase = str.toLowerCase(Locale.getDefault());
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        String strConcat;
        AFd1mSDK aFd1mSDKMo5229e = getCurrencyIso4217Code().mo5229e();
        if (aFd1mSDKMo5229e.getMediationNetwork == null) {
            aFd1mSDKMo5229e.getMediationNetwork = new AFc1bSDK();
        }
        AFc1bSDK aFc1bSDK = aFd1mSDKMo5229e.getMediationNetwork;
        if (str != null) {
            int i = AFKeystoreWrapper + 69;
            values = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            if (!str.isEmpty()) {
                if (map == null || map.isEmpty()) {
                    if (aFc1bSDK.getMediationNetwork.remove(str) == null) {
                        int i2 = values + 41;
                        AFKeystoreWrapper = i2 % 128;
                        strConcat = "Partner data is missing or `null`";
                        if (i2 % 2 != 0) {
                            int i3 = 30 / 0;
                        }
                    } else {
                        strConcat = "Cleared partner data for ".concat(str);
                        values = (AFKeystoreWrapper + 75) % 128;
                    }
                    AFLogger.afWarnLog(strConcat);
                    return;
                }
                StringBuilder sb = new StringBuilder("Setting partner data for ");
                sb.append(str);
                sb.append(": ");
                sb.append(map);
                AFLogger.afDebugLog(sb.toString());
                int length = new JSONObject(map).toString().length();
                if (length <= 1000) {
                    aFc1bSDK.getMediationNetwork.put(str, map);
                    aFc1bSDK.getCurrencyIso4217Code.remove(str);
                    return;
                } else {
                    AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                    HashMap map2 = new HashMap();
                    map2.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                    aFc1bSDK.getCurrencyIso4217Code.put(str, map2);
                    return;
                }
            }
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        AFKeystoreWrapper = (values + 109) % 128;
        getCurrencyIso4217Code().mo5229e().getCurrencyIso4217Code = AFb1iSDK.getCurrencyIso4217Code(str);
        values = (AFKeystoreWrapper + 27) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        int i = AFKeystoreWrapper + 7;
        values = i % 128;
        if (i % 2 == 0) {
            Objects.requireNonNull(pluginInfo);
            getCurrencyIso4217Code().AFInAppEventParameterName().getRevenue(pluginInfo);
            throw null;
        }
        Objects.requireNonNull(pluginInfo);
        getCurrencyIso4217Code().AFInAppEventParameterName().getRevenue(pluginInfo);
        AFKeystoreWrapper = (values + 55) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFAdRevenueData(new Object[]{this, str, str2, str3}, -675764679, 675764691, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFKeystoreWrapper = (values + 65) % 128;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFc1sSDK aFc1sSDKUnregisterClient = getCurrencyIso4217Code().unregisterClient();
        aFc1sSDKUnregisterClient.component1.clear();
        aFc1sSDKUnregisterClient.component1.addAll(Arrays.asList(strArr));
        values = (AFKeystoreWrapper + 89) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        values = (AFKeystoreWrapper + 115) % 128;
        setSharingFilterForPartners(strArr);
        AFKeystoreWrapper = (values + 89) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        AFKeystoreWrapper = (values + 57) % 128;
        setSharingFilterForPartners("all");
        AFKeystoreWrapper = (values + 87) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        getCurrencyIso4217Code().mo5229e().getMonetizationNetwork = new AFd1uSDK(strArr);
        int i = values + 101;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        getCurrencyIso4217Code().copydefault().getMediationNetwork("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        AFKeystoreWrapper = (values + 31) % 128;
        String str = null;
        for (String str2 : strArr) {
            AFKeystoreWrapper = (values + 39) % 128;
            if (C09454.getMonetizationNetwork[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFb1iSDK.getCurrencyIso4217Code(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        values = (AFKeystoreWrapper + 35) % 128;
        start(context, null);
        int i = AFKeystoreWrapper + 123;
        values = i % 128;
        if (i % 2 == 0) {
            int i2 = 25 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        AFKeystoreWrapper = (values + 15) % 128;
        getCurrencyIso4217Code(context);
        final AFd1fSDK currencyIso4217Code = getCurrencyIso4217Code();
        currencyIso4217Code.AFKeystoreWrapper().component4 = z;
        currencyIso4217Code.AFAdRevenueData().submit(new Runnable() { // from class: com.appsflyer.internal.g
            @Override // java.lang.Runnable
            public final void run() {
                AFb1tSDK.AFAdRevenueData(currencyIso4217Code);
            }
        });
        if (z) {
            AFKeystoreWrapper = (values + 109) % 128;
            currencyIso4217Code.getRevenue().AFAdRevenueData("is_stop_tracking_used", true);
            values = (AFKeystoreWrapper + 55) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j) {
        values = (AFKeystoreWrapper + 99) % 128;
        getCurrencyIso4217Code().unregisterClient().getRevenue = deepLinkListener;
        getCurrencyIso4217Code().unregisterClient().component3 = j;
        int i = AFKeystoreWrapper + 19;
        values = i % 128;
        if (i % 2 == 0) {
            int i2 = 14 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        values = (AFKeystoreWrapper + 55) % 128;
        getCurrencyIso4217Code().copydefault().getMediationNetwork("unregisterConversionListener", new String[0]);
        this.getMediationNetwork = null;
        AFKeystoreWrapper = (values + 95) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getCurrencyIso4217Code(context);
        AFg1lSDK aFg1lSDK = new AFg1lSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.m5257w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.m5255i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFg1jSDK aFg1jSDKAFAdRevenueData = aFg1lSDK.AFAdRevenueData();
        if (aFg1jSDKAFAdRevenueData == null || !str.equals(aFg1jSDKAFAdRevenueData.AFAdRevenueData)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z = aFg1jSDKAFAdRevenueData == null || jCurrentTimeMillis - aFg1jSDKAFAdRevenueData.getCurrencyIso4217Code > 2000;
            AFg1jSDK aFg1jSDK = new AFg1jSDK(str, jCurrentTimeMillis, !z);
            aFg1lSDK.getRevenue.getRevenue("afUninstallToken", aFg1jSDK.AFAdRevenueData);
            aFg1lSDK.getRevenue.getRevenue("afUninstallToken_received_time", aFg1jSDK.getCurrencyIso4217Code);
            aFg1lSDK.getRevenue.AFAdRevenueData("afUninstallToken_queued", aFg1jSDK.getRevenue());
            if (z) {
                AFg1lSDK.AFAdRevenueData(str);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        String string;
        AFKeystoreWrapper = (values + 105) % 128;
        AFb1bSDK aFb1bSDKCopydefault = getCurrencyIso4217Code().copydefault();
        if (map == null) {
            int i = AFKeystoreWrapper + 117;
            values = i % 128;
            if (i % 2 == 0) {
                int i2 = 78 / 0;
            }
            string = "";
        } else {
            string = map.toString();
        }
        aFb1bSDKCopydefault.getMediationNetwork("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, string);
        if (!isStopped()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PURCHASE_VALIDATION;
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(str4);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(str5);
            aFLogger.m5255i(aFg1cSDK, sb.toString());
        }
        if (str != null && str4 != null) {
            int i3 = values + 11;
            AFKeystoreWrapper = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (str2 != null && str5 != null && str3 != null) {
                new Thread(new AFa1cSDK(context.getApplicationContext(), getCurrencyIso4217Code().AFKeystoreWrapper().component1, getCurrencyIso4217Code().getMediationNetwork(), str, str2, str3, str4, str5, map)).start();
                return;
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getCurrencyIso4217Code;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            int i4 = values + 17;
            AFKeystoreWrapper = i4 % 128;
            if (i4 % 2 == 0) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
            } else {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        int i = AFKeystoreWrapper + 55;
        values = i % 128;
        int i2 = i % 2;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
        AFKeystoreWrapper = (values + 19) % 128;
    }

    public class AFa1vSDK implements AFe1eSDK {
        private AFa1vSDK() {
        }

        private boolean getMediationNetwork() {
            return AFb1tSDK.this.getMediationNetwork != null;
        }

        @Override // com.appsflyer.internal.AFe1eSDK
        public final void getCurrencyIso4217Code(AFf1wSDK<?> aFf1wSDK) {
            if (aFf1wSDK instanceof AFf1dSDK) {
                AFb1tSDK.this.getCurrencyIso4217Code().component4().getRevenue(((AFf1gSDK) aFf1wSDK).component3.areAllFieldsValid);
            }
        }

        @Override // com.appsflyer.internal.AFe1eSDK
        public final void getMonetizationNetwork(AFf1wSDK<?> aFf1wSDK, AFe1dSDK aFe1dSDK) {
            JSONObject currencyIso4217Code;
            AFg1jSDK aFg1jSDKAFAdRevenueData;
            if (!(aFf1wSDK instanceof AFf1gSDK)) {
                if (!(aFf1wSDK instanceof AFg1dSDK) || aFe1dSDK == AFe1dSDK.SUCCESS) {
                    return;
                }
                AFg1gSDK aFg1gSDK = new AFg1gSDK(AFb1tSDK.this.getCurrencyIso4217Code());
                AFe1aSDK aFe1aSDKCopy = AFb1tSDK.this.getCurrencyIso4217Code().copy();
                aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new RunnableC09595(aFg1gSDK));
                return;
            }
            AFf1gSDK aFf1gSDK = (AFf1gSDK) aFf1wSDK;
            boolean z = aFf1wSDK instanceof AFf1dSDK;
            if (z && getMediationNetwork()) {
                AFf1dSDK aFf1dSDK = (AFf1dSDK) aFf1wSDK;
                if (aFf1dSDK.getMediationNetwork == AFe1dSDK.SUCCESS || aFf1dSDK.getRevenue == 1) {
                    AFg1dSDK aFg1dSDK = new AFg1dSDK(aFf1dSDK, AFb1tSDK.this.getCurrencyIso4217Code().getRevenue());
                    AFe1aSDK aFe1aSDKCopy2 = AFb1tSDK.this.getCurrencyIso4217Code().copy();
                    aFe1aSDKCopy2.AFAdRevenueData.execute(aFe1aSDKCopy2.new RunnableC09595(aFg1dSDK));
                }
            }
            if (aFe1dSDK == AFe1dSDK.SUCCESS) {
                AFb1tSDK aFb1tSDK = AFb1tSDK.this;
                aFb1tSDK.getRevenue((Application) AFb1tSDK.AFAdRevenueData(new Object[]{aFb1tSDK}, 922507371, -922507364, (int) System.currentTimeMillis())).getRevenue("sentSuccessfully", "true");
                if (!(aFf1wSDK instanceof AFf1bSDK) && (aFg1jSDKAFAdRevenueData = new AFg1lSDK(AFb1tSDK.m5211k_(AFb1tSDK.this)).AFAdRevenueData()) != null && aFg1jSDKAFAdRevenueData.getRevenue()) {
                    String str = aFg1jSDKAFAdRevenueData.AFAdRevenueData;
                    AFLogger.INSTANCE.m5250d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFg1lSDK.AFAdRevenueData(str);
                }
                ResponseNetwork responseNetwork = ((AFf1oSDK) aFf1gSDK).component1;
                if (responseNetwork != null && (currencyIso4217Code = AFc1uSDK.getCurrencyIso4217Code((String) responseNetwork.getBody())) != null) {
                    AFb1tSDK.getMediationNetwork(AFb1tSDK.this, currencyIso4217Code.optBoolean("send_background", false));
                }
                if (z) {
                    AFb1tSDK.getMediationNetwork(AFb1tSDK.this, System.currentTimeMillis());
                }
            }
        }

        public /* synthetic */ AFa1vSDK(AFb1tSDK aFb1tSDK, byte b) {
            this();
        }

        @Override // com.appsflyer.internal.AFe1eSDK
        public final void getMonetizationNetwork(AFf1wSDK<?> aFf1wSDK) {
        }
    }

    public class AFa1uSDK implements Runnable {
        private final AFa1mSDK getMonetizationNetwork;

        private AFa1uSDK(AFa1mSDK aFa1mSDK) {
            this.getMonetizationNetwork = aFa1mSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1tSDK.getCurrencyIso4217Code(AFb1tSDK.this, this.getMonetizationNetwork);
        }

        public /* synthetic */ AFa1uSDK(AFb1tSDK aFb1tSDK, AFa1mSDK aFa1mSDK, byte b) {
            this(aFa1mSDK);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, AppsFlyerRequestListener appsFlyerRequestListener) {
        AFAdRevenueData(new Object[]{this, context, str, appsFlyerRequestListener}, -1671072032, 1671072045, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        AFAdRevenueData(new Object[]{this, context, str}, 1806885587, -1806885569, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        int i = values + 115;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            subscribeForDeepLink(deepLinkListener, 3000L);
        } else {
            subscribeForDeepLink(deepLinkListener, 3000L);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() {
        AFAdRevenueData(new Object[]{this}, -281264795, 281264806, System.identityHashCode(this));
    }

    private synchronized AFg1ySDK component3() {
        AFg1ySDK aFg1ySDK;
        try {
            try {
                if (this.AFInAppEventType == null) {
                    int i = AFKeystoreWrapper + 13;
                    values = i % 128;
                    if (i % 2 != 0) {
                        this.AFInAppEventType = new AFg1ySDK() { // from class: com.appsflyer.internal.e
                            @Override // com.appsflyer.internal.AFg1ySDK
                            public final void onRemoteConfigUpdateFinished(AFg1zSDK aFg1zSDK) {
                                this.f4274a.getCurrencyIso4217Code(aFg1zSDK);
                            }
                        };
                    } else {
                        this.AFInAppEventType = new AFg1ySDK() { // from class: com.appsflyer.internal.e
                            @Override // com.appsflyer.internal.AFg1ySDK
                            public final void onRemoteConfigUpdateFinished(AFg1zSDK aFg1zSDK) {
                                this.f4274a.getCurrencyIso4217Code(aFg1zSDK);
                            }
                        };
                        throw null;
                    }
                }
                aFg1ySDK = this.AFInAppEventType;
                int i2 = values + 25;
                AFKeystoreWrapper = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aFg1ySDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String component3(Context context) {
        return (String) AFAdRevenueData(new Object[]{this, context}, -1328022662, 1328022682, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i = values + 125;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            getCurrencyIso4217Code().copydefault().getMediationNetwork("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        } else {
            getCurrencyIso4217Code().copydefault().getMediationNetwork("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            throw null;
        }
    }

    private static void areAllFieldsValid() {
        int i = values + 23;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            AFLogger.INSTANCE.m5257w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        } else {
            AFLogger.INSTANCE.m5257w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            throw null;
        }
    }

    @Nullable
    private AFh1sSDK component1(Context context) {
        int i = (values + 109) % 128;
        AFKeystoreWrapper = i;
        if (context instanceof Activity) {
            return new AFh1sSDK((Activity) context, getCurrencyIso4217Code().registerClient());
        }
        int i2 = i + 63;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
        return null;
    }

    public static AFb1tSDK getMonetizationNetwork() {
        int i = values + 99;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            return areAllFieldsValid;
        }
        throw null;
    }

    private static void component1(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.SDK_LIFECYCLE;
        StringBuilder sb = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb.append(str);
        sb.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.m5257w(aFg1cSDK, sb.toString());
        int i = AFKeystoreWrapper + 61;
        values = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private void getMonetizationNetwork(Context context, String str, Map<String, Object> map) {
        AFh1kSDK aFh1kSDK = new AFh1kSDK();
        aFh1kSDK.component4 = str;
        aFh1kSDK.getMonetizationNetwork = map;
        getMonetizationNetwork(aFh1kSDK, component1(context));
        int i = AFKeystoreWrapper + 69;
        values = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private boolean component1() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, 1186188642, -1186188628, System.identityHashCode(this))).booleanValue();
    }

    @VisibleForTesting
    public final void getMonetizationNetwork(@NonNull AFa1mSDK aFa1mSDK, @Nullable AFh1sSDK aFh1sSDK) {
        getMediationNetwork(aFa1mSDK, aFh1sSDK);
        if (getCurrencyIso4217Code().AFKeystoreWrapper().component1 == null) {
            int i = values + 55;
            AFKeystoreWrapper = i % 128;
            if (i % 2 == 0) {
                AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                AppsFlyerRequestListener appsFlyerRequestListener = aFa1mSDK.getRevenue;
                if (appsFlyerRequestListener != null) {
                    values = (AFKeystoreWrapper + 93) % 128;
                    appsFlyerRequestListener.onError(41, "No dev key");
                    values = (AFKeystoreWrapper + 77) % 128;
                    return;
                }
                return;
            }
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener2 = aFa1mSDK.getRevenue;
            throw null;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(getCurrencyIso4217Code().getRevenue());
        if (referrer == null) {
            AFKeystoreWrapper = (values + 45) % 128;
            referrer = "";
        }
        aFa1mSDK.component2 = referrer;
        AFAdRevenueData(new Object[]{this, aFa1mSDK}, 155939583, -155939578, System.identityHashCode(this));
    }

    private void component4() {
        values = (AFKeystoreWrapper + 55) % 128;
        if (AFf1qSDK.areAllFieldsValid()) {
            AFKeystoreWrapper = (values + 123) % 128;
            return;
        }
        AFd1fSDK currencyIso4217Code = getCurrencyIso4217Code();
        AFe1aSDK aFe1aSDKCopy = currencyIso4217Code.copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new RunnableC09595(new AFf1qSDK(currencyIso4217Code)));
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        AppsFlyerConversionListener appsFlyerConversionListener = (AppsFlyerConversionListener) objArr[1];
        int i = values + 79;
        int i2 = i % 128;
        AFKeystoreWrapper = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (appsFlyerConversionListener == null) {
            values = (i2 + 97) % 128;
            return null;
        }
        aFb1tSDK.getMediationNetwork = appsFlyerConversionListener;
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = values + 33;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            logEvent(context, str, map, null);
            int i2 = 31 / 0;
        } else {
            logEvent(context, str, map, null);
        }
    }

    private void getMonetizationNetwork(Map<String, Object> map) {
        AFKeystoreWrapper = (values + 27) % 128;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) || map.get("advertiserId") == null) {
            return;
        }
        try {
            if (AFc1tSDK.getCurrencyIso4217Code(getCurrencyIso4217Code().mo5229e().getRevenue) && map.remove("android_id") != null) {
                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
            }
            if (AFc1tSDK.getCurrencyIso4217Code(getCurrencyIso4217Code().AFKeystoreWrapper().areAllFieldsValid)) {
                int i = AFKeystoreWrapper + 113;
                values = i % 128;
                if (i % 2 != 0) {
                    if (map.remove(Device.IMEI) != null) {
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                    }
                } else {
                    map.remove(Device.IMEI);
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFAdRevenueData(new Object[]{this, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback}, -633808932, 633808947, System.identityHashCode(this));
    }

    public final AFd1fSDK getCurrencyIso4217Code() {
        int i = (values + 17) % 128;
        AFKeystoreWrapper = i;
        AFd1nSDK aFd1nSDK = this.copydefault;
        values = (i + 75) % 128;
        return aFd1nSDK;
    }

    public final void getCurrencyIso4217Code(@NonNull Context context) {
        AFd1nSDK aFd1nSDK = this.copydefault;
        if (context != null) {
            int i = values + 39;
            AFKeystoreWrapper = i % 128;
            if (i % 2 == 0) {
                AFd1kSDK aFd1kSDK = aFd1nSDK.getMediationNetwork;
                if (context != null) {
                    aFd1kSDK.getCurrencyIso4217Code = context.getApplicationContext();
                }
            } else {
                AFd1kSDK aFd1kSDK2 = aFd1nSDK.getMediationNetwork;
                throw null;
            }
        }
        AFKeystoreWrapper = (values + 77) % 128;
    }

    private static void getCurrencyIso4217Code(String str, boolean z) {
        int i = AFKeystoreWrapper + 75;
        values = i % 128;
        if (i % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, z);
            AFKeystoreWrapper = (values + 3) % 128;
        } else {
            AppsFlyerProperties.getInstance().set(str, z);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(boolean z) {
        int i = (AFKeystoreWrapper + 71) % 128;
        values = i;
        if (z) {
            int i2 = i + 39;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 == 0) {
                getCurrencyIso4217Code().mo5231v().getRevenue();
                return;
            } else {
                getCurrencyIso4217Code().mo5231v().getRevenue();
                throw null;
            }
        }
        getCurrencyIso4217Code().mo5231v().AFAdRevenueData();
        int i3 = AFKeystoreWrapper + 99;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 71 / 0;
        }
    }

    public static /* synthetic */ void getCurrencyIso4217Code(AFb1tSDK aFb1tSDK, AFa1mSDK aFa1mSDK) {
        int i = values + 103;
        AFKeystoreWrapper = i % 128;
        int i2 = i % 2;
        aFb1tSDK.getRevenue(aFa1mSDK);
        if (i2 != 0) {
            throw null;
        }
        values = (AFKeystoreWrapper + 85) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(AFg1zSDK aFg1zSDK) {
        AFAdRevenueData(new Object[]{this, aFg1zSDK}, -1795085152, 1795085173, System.identityHashCode(this));
    }

    private static String getCurrencyIso4217Code(@Nullable String str) {
        return (String) AFAdRevenueData(new Object[]{str}, 517046736, -517046734, (int) System.currentTimeMillis());
    }

    private static String getMonetizationNetwork(Activity activity) {
        int i = AFKeystoreWrapper;
        values = (i + 45) % 128;
        String string = null;
        if (activity != null) {
            values = (i + 31) % 128;
            Intent intent = activity.getIntent();
            if (intent != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras == null || (string = extras.getString("af")) == null) {
                        return string;
                    }
                    AFLogger.INSTANCE.m5257w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(string)));
                    extras.remove("af");
                    activity.setIntent(intent.putExtras(extras));
                    AFKeystoreWrapper = (values + 9) % 128;
                    return string;
                } catch (Throwable th) {
                    AFLogger.INSTANCE.m5251e(AFg1cSDK.ENGAGEMENT, th.getMessage(), th);
                }
            }
        }
        return string;
    }

    @VisibleForTesting
    private void getCurrencyIso4217Code(Context context, String str) {
        AFAdRevenueData(new Object[]{this, context, str}, 2085500355, -2085500332, System.identityHashCode(this));
    }

    private void getCurrencyIso4217Code(AppsFlyerConversionListener appsFlyerConversionListener) {
        AFAdRevenueData(new Object[]{this, appsFlyerConversionListener}, 2118250749, -2118250749, System.identityHashCode(this));
    }

    private static String getMonetizationNetwork(String str) {
        values = (AFKeystoreWrapper + 79) % 128;
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1) {
            return str.substring(iIndexOf);
        }
        AFKeystoreWrapper = (values + 41) % 128;
        return "";
    }

    @SuppressLint({"DiscouragedApi"})
    private static void getMonetizationNetwork(Context context) {
        AFAdRevenueData(new Object[]{context}, -1468835504, 1468835526, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        int i = AFKeystoreWrapper + 71;
        values = i % 128;
        int i2 = i % 2;
        Application application = aFb1tSDK.copy;
        if (i2 == 0) {
            int i3 = 5 / 0;
        }
        return application;
    }

    public static /* synthetic */ boolean getMediationNetwork(AFb1tSDK aFb1tSDK, boolean z) {
        int i = AFKeystoreWrapper;
        values = (i + 55) % 128;
        aFb1tSDK.equals = z;
        values = (i + 13) % 128;
        return z;
    }

    public static /* synthetic */ long getMediationNetwork(AFb1tSDK aFb1tSDK, long j) {
        int i = (values + 29) % 128;
        AFKeystoreWrapper = i;
        aFb1tSDK.component2 = j;
        values = (i + 37) % 128;
        return j;
    }

    public static String getMediationNetwork() {
        values = (AFKeystoreWrapper + 45) % 128;
        String revenue = getRevenue(AppsFlyerProperties.APP_USER_ID);
        int i = AFKeystoreWrapper + 79;
        values = i % 128;
        if (i % 2 != 0) {
            return revenue;
        }
        throw null;
    }

    private static void getMediationNetwork(@NonNull AFa1mSDK aFa1mSDK, @Nullable AFh1sSDK aFh1sSDK) {
        int i = values;
        AFKeystoreWrapper = (i + 75) % 128;
        if (aFh1sSDK != null) {
            int i2 = i + 77;
            AFKeystoreWrapper = i2 % 128;
            if (i2 % 2 == 0) {
                aFa1mSDK.getCurrencyIso4217Code = aFh1sSDK.AFAdRevenueData;
                aFa1mSDK.component1 = aFh1sSDK.getMediationNetwork;
            } else {
                aFa1mSDK.getCurrencyIso4217Code = aFh1sSDK.AFAdRevenueData;
                aFa1mSDK.component1 = aFh1sSDK.getMediationNetwork;
                throw null;
            }
        }
        int i3 = AFKeystoreWrapper + 5;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static String getMediationNetwork(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j));
        AFKeystoreWrapper = (values + 7) % 128;
        return str;
    }

    private void getMediationNetwork(String str) {
        byte b = 0;
        AFa1mSDK monetizationNetwork = new AFh1nSDK().getMonetizationNetwork(getCurrencyIso4217Code().getMediationNetwork().getRevenue.getMonetizationNetwork("appsFlyerCount", 0));
        monetizationNetwork.component2 = str;
        if (str != null) {
            AFKeystoreWrapper = (values + 75) % 128;
            if (str.length() <= 5 || !getCurrencyIso4217Code().equals().getCurrencyIso4217Code(monetizationNetwork)) {
                return;
            }
            AFj1oSDK.getRevenue(getCurrencyIso4217Code().getCurrencyIso4217Code(), new AFa1uSDK(this, monetizationNetwork, b), 5L, TimeUnit.MILLISECONDS);
            values = (AFKeystoreWrapper + 17) % 128;
        }
    }

    public static boolean getMediationNetwork(Context context) {
        int i = values + 95;
        AFKeystoreWrapper = i % 128;
        try {
            if (i % 2 == 0) {
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                    AFKeystoreWrapper = (values + 71) % 128;
                    return true;
                }
                try {
                    context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    return true;
                } catch (PackageManager.NameNotFoundException e) {
                    AFLogger.INSTANCE.m5251e(AFg1cSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e);
                    return false;
                }
            }
            GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
    }

    private static int getMediationNetwork(AFd1rSDK aFd1rSDK, boolean z) {
        int i = AFKeystoreWrapper + 9;
        values = i % 128;
        if (i % 2 != 0) {
            return getRevenue(aFd1rSDK, "appsFlyerInAppEventCount", z);
        }
        getRevenue(aFd1rSDK, "appsFlyerInAppEventCount", z);
        throw null;
    }

    public static String getMediationNetwork(AFd1rSDK aFd1rSDK, String str) {
        return (String) AFAdRevenueData(new Object[]{aFd1rSDK, str}, -787116836, 787116860, (int) System.currentTimeMillis());
    }

    private void getMediationNetwork(AFa1mSDK aFa1mSDK) {
        AFAdRevenueData(new Object[]{this, aFa1mSDK}, 155939583, -155939578, System.identityHashCode(this));
    }

    private static void component2(String str) {
        try {
            if (new JSONObject(str).has("pid")) {
                int i = values + 105;
                AFKeystoreWrapper = i % 128;
                if (i % 2 != 0) {
                    getRevenue("preInstallName", str);
                    int i2 = 7 / 0;
                    return;
                } else {
                    getRevenue("preInstallName", str);
                    return;
                }
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            AFKeystoreWrapper = (values + 101) % 128;
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
        }
    }

    @NonNull
    private AFj1zSDK[] component2() {
        return (AFj1zSDK[]) AFAdRevenueData(new Object[]{this}, 877185266, -877185249, System.identityHashCode(this));
    }

    private static void component2(Context context) {
        AFAdRevenueData(new Object[]{context}, 1168022835, -1168022834, (int) System.currentTimeMillis());
    }

    private static void getRevenue(String str, String str2) {
        int i = AFKeystoreWrapper + 53;
        values = i % 128;
        if (i % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
        } else {
            AppsFlyerProperties.getInstance().set(str, str2);
            throw null;
        }
    }

    private static String getRevenue(String str) {
        int i = values + 105;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            return AppsFlyerProperties.getInstance().getString(str);
        }
        AppsFlyerProperties.getInstance().getString(str);
        throw null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFb1tSDK aFb1tSDK = (AFb1tSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = values + 65;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            AFb1bSDK aFb1bSDKCopydefault = aFb1tSDK.getCurrencyIso4217Code().copydefault();
            String[] strArr = new String[0];
            strArr[0] = String.valueOf(zBooleanValue);
            aFb1bSDKCopydefault.getMediationNetwork("setCollectAndroidID", strArr);
        } else {
            aFb1tSDK.getCurrencyIso4217Code().copydefault().getMediationNetwork("setCollectAndroidID", String.valueOf(zBooleanValue));
        }
        getRevenue(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(zBooleanValue));
        getRevenue(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(zBooleanValue));
        int i2 = AFKeystoreWrapper + 15;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
        return null;
    }

    public static /* synthetic */ void getRevenue(AFb1tSDK aFb1tSDK) {
        AFKeystoreWrapper = (values + 63) % 128;
        aFb1tSDK.component4();
        int i = values + 17;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            int i2 = 43 / 0;
        }
    }

    public static Map<String, Object> getRevenue(Map<String, Object> map) {
        if (map.containsKey("meta")) {
            AFKeystoreWrapper = (values + 13) % 128;
            return (Map) map.get("meta");
        }
        HashMap map2 = new HashMap();
        map.put("meta", map2);
        values = (AFKeystoreWrapper + 29) % 128;
        return map2;
    }

    @Nullable
    @VisibleForTesting
    private String getRevenue(Context context, String str) {
        int i = (values + 7) % 128;
        AFKeystoreWrapper = i;
        if (context == null) {
            int i2 = i + 81;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 86 / 0;
            }
            return null;
        }
        getCurrencyIso4217Code(context);
        String revenue = getCurrencyIso4217Code().getMediationNetwork().getRevenue(str);
        AFKeystoreWrapper = (values + 3) % 128;
        return revenue;
    }

    public final AFd1rSDK getRevenue(Context context) {
        values = (AFKeystoreWrapper + 23) % 128;
        getCurrencyIso4217Code(context);
        AFd1rSDK revenue = getCurrencyIso4217Code().getRevenue();
        int i = AFKeystoreWrapper + 7;
        values = i % 128;
        if (i % 2 != 0) {
            return revenue;
        }
        throw null;
    }

    public static int getRevenue(AFd1rSDK aFd1rSDK, boolean z) {
        int i = AFKeystoreWrapper + 115;
        values = i % 128;
        if (i % 2 == 0) {
            getRevenue(aFd1rSDK, "appsFlyerCount", z);
            throw null;
        }
        int revenue = getRevenue(aFd1rSDK, "appsFlyerCount", z);
        int i2 = values + 33;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
        return revenue;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r0
      0x001b: PHI (r0v5 int) = (r0v4 int), (r0v8 int) binds: [B:8:0x0019, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    private static int getRevenue(AFd1rSDK aFd1rSDK, String str, boolean z) {
        int monetizationNetwork;
        int i = values + 57;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            monetizationNetwork = aFd1rSDK.getMonetizationNetwork(str, 1);
            if (z) {
                monetizationNetwork++;
                aFd1rSDK.AFAdRevenueData(str, monetizationNetwork);
            }
        } else {
            monetizationNetwork = aFd1rSDK.getMonetizationNetwork(str, 0);
            if (z) {
                monetizationNetwork++;
                aFd1rSDK.AFAdRevenueData(str, monetizationNetwork);
            }
        }
        AFKeystoreWrapper = (values + 25) % 128;
        return monetizationNetwork;
    }

    public static void getRevenue() {
        AFInAppEventParameterName = new int[]{-932735490, 1735446308, -1050099444, -1626315273, -1265534465, -1801709683, -1652143862, -534112504, -1451696957, 1464493626, 1290421090, 748206213, 657524458, -1371576600, -2031550464, -136735868, -1979143287, -288393603};
    }

    public static /* synthetic */ AFg1ySDK AFAdRevenueData(AFb1tSDK aFb1tSDK) {
        values = (AFKeystoreWrapper + 115) % 128;
        AFg1ySDK aFg1ySDKComponent3 = aFb1tSDK.component3();
        values = (AFKeystoreWrapper + 53) % 128;
        return aFg1ySDKComponent3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFAdRevenueData(AFd1fSDK aFd1fSDK) {
        values = (AFKeystoreWrapper + 19) % 128;
        aFd1fSDK.AFInAppEventType().getMonetizationNetwork();
        int i = AFKeystoreWrapper + 35;
        values = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0032 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public final boolean AFAdRevenueData() {
        int i;
        int i2 = AFKeystoreWrapper + 27;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
            if (AFAdRevenueData(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) {
                if (getMediationNetwork() == null) {
                    i = AFKeystoreWrapper + 7;
                    values = i % 128;
                    if (i % 2 == 0) {
                        return false;
                    }
                    return true;
                }
            }
        } else if (AFAdRevenueData(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) {
            if (getMediationNetwork() == null) {
                i = AFKeystoreWrapper + 7;
                values = i % 128;
                if (i % 2 == 0) {
                    return false;
                }
                return true;
            }
        }
        AFKeystoreWrapper = (values + 67) % 128;
        return false;
    }

    private void AFAdRevenueData(Context context, AFh1xSDK aFh1xSDK) {
        getCurrencyIso4217Code(context);
        AFh1qSDK aFh1qSDKComponent4 = getCurrencyIso4217Code().component4();
        AFh1uSDK monetizationNetwork = AFa1pSDK.getMonetizationNetwork(context);
        if (aFh1qSDKComponent4.getCurrencyIso4217Code()) {
            int i = values + 15;
            AFKeystoreWrapper = i % 128;
            int i2 = i % 2;
            Map<String, Object> map = aFh1qSDKComponent4.getRevenue;
            if (i2 != 0) {
                map.put("api_name", aFh1xSDK.toString());
                aFh1qSDKComponent4.getMediationNetwork(monetizationNetwork);
                int i3 = 79 / 0;
            } else {
                map.put("api_name", aFh1xSDK.toString());
                aFh1qSDKComponent4.getMediationNetwork(monetizationNetwork);
            }
            AFKeystoreWrapper = (values + 63) % 128;
        }
        aFh1qSDKComponent4.getRevenue();
    }

    @NonNull
    @WorkerThread
    public final Map<String, Object> AFAdRevenueData(AFa1mSDK aFa1mSDK) {
        String str;
        final Context context = getCurrencyIso4217Code().valueOf().getCurrencyIso4217Code;
        AFd1rSDK revenue = getRevenue(context);
        AFg1fSDK aFg1fSDKComponent3 = getCurrencyIso4217Code().component3();
        boolean zAFAdRevenueData = aFa1mSDK.AFAdRevenueData();
        Map<String, Object> map = aFa1mSDK.AFAdRevenueData;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        m5203a(new int[]{-2029743005, -1810686557, 2054987161, 1533781460, -918385603, 1220443193}, ImageFormat.getBitsPerPixel(0) + 13, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (!isStopped()) {
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (zAFAdRevenueData) {
                    int i = values + 87;
                    AFKeystoreWrapper = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 32 / 0;
                    }
                    str = "Launch";
                } else {
                    str = aFa1mSDK.component4;
                }
                sb.append(str);
                AFLogger.afInfoLog(sb.toString());
            } else {
                AFLogger.afInfoLog("Reporting has been stopped");
            }
            AFAdRevenueData(new Object[]{context}, 1168022835, -1168022834, (int) System.currentTimeMillis());
            aFg1fSDKComponent3.getCurrencyIso4217Code(map, isPreInstalledApp(context), new Function0() { // from class: com.appsflyer.internal.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f4266a.component3(context);
                }
            });
            int revenue2 = getRevenue(revenue, zAFAdRevenueData);
            int mediationNetwork = getMediationNetwork(revenue, aFa1mSDK.component4 != null);
            if (zAFAdRevenueData) {
                int i3 = values + 121;
                AFKeystoreWrapper = i3 % 128;
                if (i3 % 2 == 0 ? revenue2 == 1 : revenue2 == 1) {
                    AppsFlyerProperties.getInstance().getMediationNetwork = true;
                }
            }
            aFg1fSDKComponent3.getRevenue(map, revenue2, mediationNetwork);
            return map;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getLocalizedMessage(), th, true);
            return map;
        }
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        Context context = (Context) objArr[0];
        try {
            List listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!listAsList.contains("android.permission.INTERNET")) {
                AFLogger.INSTANCE.m5257w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
            }
            if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFKeystoreWrapper = (values + 101) % 128;
                AFLogger.INSTANCE.m5257w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32) {
                int i = AFKeystoreWrapper + 11;
                values = i % 128;
                if (i % 2 == 0) {
                    listAsList.contains("com.google.android.gms.permission.AD_ID");
                    throw null;
                }
                if (!listAsList.contains("com.google.android.gms.permission.AD_ID")) {
                    AFLogger.INSTANCE.m5257w(AFg1cSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                    AFKeystoreWrapper = (values + 43) % 128;
                }
            }
            return null;
        } catch (Exception e) {
            AFLogger.INSTANCE.m5251e(AFg1cSDK.GENERAL, "Exception while validation permissions. ", e);
            return null;
        }
    }

    private AFf1cSDK.AFa1zSDK AFAdRevenueData(final Map<String, String> map) {
        AFf1cSDK.AFa1zSDK aFa1zSDK = new AFf1cSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFb1tSDK.3
            @Override // com.appsflyer.internal.AFf1cSDK.AFa1zSDK
            public final void getMonetizationNetwork(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFb1tSDK.this.getCurrencyIso4217Code().unregisterClient().AFAdRevenueData(map);
            }

            @Override // com.appsflyer.internal.AFf1cSDK.AFa1zSDK
            public final void getRevenue(String str) {
                AFb1tSDK.this.getCurrencyIso4217Code().unregisterClient().getCurrencyIso4217Code(str, DeepLinkResult.Error.NETWORK);
            }
        };
        int i = AFKeystoreWrapper + 125;
        values = i % 128;
        if (i % 2 != 0) {
            return aFa1zSDK;
        }
        throw null;
    }

    private static boolean AFAdRevenueData(String str) {
        return ((Boolean) AFAdRevenueData(new Object[]{str}, -1656164040, 1656164046, (int) System.currentTimeMillis())).booleanValue();
    }
}
