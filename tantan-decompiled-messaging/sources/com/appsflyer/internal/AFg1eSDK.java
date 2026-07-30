package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Device;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1eSDK implements AFg1fSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventType = 0;
    private static char[] valueOf = {13586, 13684, 13634, 13649, 13648, 13647, 13637, 13639, 13646, 13640, 13680, 13684, 13639, 13642, 13651, 13737, 13372, 13373, 13370, 13372};
    private static int values = 1;

    @NotNull
    private final AFi1lSDK AFAdRevenueData;

    @NotNull
    private final Lazy AFKeystoreWrapper;

    @NotNull
    private final AFg1rSDK areAllFieldsValid;

    @NotNull
    private final AFd1pSDK component1;

    @NotNull
    private final AFh1qSDK component2;

    @NotNull
    private final AFd1rSDK component3;

    @NotNull
    private final AFi1xSDK component4;

    @NotNull
    private final Lazy copy;

    @NotNull
    private final AFg1kSDK copydefault;

    @NotNull
    private final AFd1mSDK equals;

    @NotNull
    private final AFd1vSDK getCurrencyIso4217Code;

    @NotNull
    private final AFb1zSDK getMediationNetwork;

    @NotNull
    private final Context getMonetizationNetwork;

    @NotNull
    private final AFj1uSDK getRevenue;

    @NotNull
    private final AFb1aSDK hashCode;

    @NotNull
    private final AFd1kSDK toString;

    public AFg1eSDK(@NotNull Context context, @NotNull AFi1lSDK aFi1lSDK, @NotNull AFd1vSDK aFd1vSDK, @NotNull AFj1uSDK aFj1uSDK, @NotNull AFb1zSDK aFb1zSDK, @NotNull AFh1qSDK aFh1qSDK, @NotNull AFd1rSDK aFd1rSDK, @NotNull AFd1pSDK aFd1pSDK, @NotNull AFi1xSDK aFi1xSDK, @NotNull AFg1rSDK aFg1rSDK, @NotNull AFb1aSDK aFb1aSDK, @NotNull AFd1kSDK aFd1kSDK, @NotNull AFg1kSDK aFg1kSDK, @NotNull AFd1mSDK aFd1mSDK) {
        context.getClass();
        aFi1lSDK.getClass();
        aFd1vSDK.getClass();
        aFj1uSDK.getClass();
        aFb1zSDK.getClass();
        aFh1qSDK.getClass();
        aFd1rSDK.getClass();
        aFd1pSDK.getClass();
        aFi1xSDK.getClass();
        aFg1rSDK.getClass();
        aFb1aSDK.getClass();
        aFd1kSDK.getClass();
        aFg1kSDK.getClass();
        aFd1mSDK.getClass();
        this.getMonetizationNetwork = context;
        this.AFAdRevenueData = aFi1lSDK;
        this.getCurrencyIso4217Code = aFd1vSDK;
        this.getRevenue = aFj1uSDK;
        this.getMediationNetwork = aFb1zSDK;
        this.component2 = aFh1qSDK;
        this.component3 = aFd1rSDK;
        this.component1 = aFd1pSDK;
        this.component4 = aFi1xSDK;
        this.areAllFieldsValid = aFg1rSDK;
        this.hashCode = aFb1aSDK;
        this.toString = aFd1kSDK;
        this.copydefault = aFg1kSDK;
        this.equals = aFd1mSDK;
        this.copy = LazyKt__LazyJVMKt.m87229b(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1eSDK.2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFKeystoreWrapper = LazyKt__LazyJVMKt.m87229b(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1eSDK.1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private final String AFInAppEventParameterName() {
        File monetizationNetwork = getMonetizationNetwork(getCurrencyIso4217Code("ro.appsflyer.preinstall.path"));
        if (getCurrencyIso4217Code(monetizationNetwork)) {
            AFInAppEventType = (values + 119) % 128;
            monetizationNetwork = getMonetizationNetwork(getRevenue("AF_PRE_INSTALL_PATH"));
        }
        if (getCurrencyIso4217Code(monetizationNetwork)) {
            monetizationNetwork = getMonetizationNetwork("/data/local/tmp/pre_install.appsflyer");
        }
        if (getCurrencyIso4217Code(monetizationNetwork)) {
            int i = values + 75;
            AFInAppEventType = i % 128;
            if (i % 2 != 0) {
                monetizationNetwork = getMonetizationNetwork("/etc/pre_install.appsflyer");
                int i2 = 48 / 0;
            } else {
                monetizationNetwork = getMonetizationNetwork("/etc/pre_install.appsflyer");
            }
        }
        if (getCurrencyIso4217Code(monetizationNetwork)) {
            AFInAppEventType = (values + 67) % 128;
            return null;
        }
        String packageName = this.getMonetizationNetwork.getPackageName();
        packageName.getClass();
        return (String) getCurrencyIso4217Code(new Object[]{monetizationNetwork, packageName}, -1411509274, 1411509275, (int) System.currentTimeMillis());
    }

    private static void AFInAppEventType(@NotNull Map<String, Object> map) {
        int i = values + 31;
        AFInAppEventType = i % 128;
        if (i % 2 != 0) {
            map.getClass();
            AFb1gSDK.getCurrencyIso4217Code();
            AFb1gSDK.getRevenue();
            throw null;
        }
        map.getClass();
        Object currencyIso4217Code = AFb1gSDK.getCurrencyIso4217Code();
        String revenue = AFb1gSDK.getRevenue();
        if (currencyIso4217Code != null) {
            int i2 = AFInAppEventType + 51;
            int i3 = i2 % 128;
            values = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (revenue != null) {
                AFInAppEventType = (i3 + 123) % 128;
                if (Integer.parseInt(revenue) > 0) {
                    AFInAppEventType = (values + 1) % 128;
                    map.put("reinstallCounter", revenue);
                    map.put("originalAppsflyerId", currencyIso4217Code);
                }
            }
        }
    }

    private final boolean AFKeystoreWrapper() {
        if (!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            AFInAppEventType = (values + 53) % 128;
            if (!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                AFb1tSDK.getMonetizationNetwork();
                return !AFb1tSDK.getMediationNetwork(this.getMonetizationNetwork);
            }
        }
        values = (AFInAppEventType + 37) % 128;
        return true;
    }

    private void AFLogger(@NotNull Map<String, Object> map) {
        map.getClass();
        AFb1ySDK aFb1ySDKM5191b_ = AFb1rSDK.m5191b_(this.getMonetizationNetwork.getContentResolver());
        if (aFb1ySDKM5191b_ == null) {
            AFInAppEventType = (values + 107) % 128;
            return;
        }
        values = (AFInAppEventType + 73) % 128;
        map.put("amazon_aid", aFb1ySDKM5191b_.AFAdRevenueData);
        map.put("amazon_aid_limit", String.valueOf(aFb1ySDKM5191b_.getMediationNetwork));
    }

    /* JADX INFO: renamed from: a */
    private static void m5235a(int[] iArr, boolean z, String str, Object[] objArr) throws UnsupportedEncodingException {
        String str2 = str;
        $11 = ($10 + 5) % 128;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1xSDK aFk1xSDK = new AFk1xSDK();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = valueOf;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                cArr2[i5] = (char) (((long) cArr[i5]) ^ 1680572615822685474L);
                i5++;
                $11 = ($10 + 83) % 128;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr != null) {
            int i6 = $10 + 53;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            char[] cArr4 = new char[i2];
            aFk1xSDK.getCurrencyIso4217Code = 0;
            char c = 0;
            while (true) {
                int i8 = aFk1xSDK.getCurrencyIso4217Code;
                if (i8 >= i2) {
                    break;
                }
                if (bArr[i8] == 1) {
                    $10 = ($11 + 59) % 128;
                    cArr4[i8] = (char) (((cArr3[i8] * 2) + 1) - c);
                } else {
                    cArr4[i8] = (char) ((cArr3[i8] * 2) - c);
                }
                c = cArr4[i8];
                aFk1xSDK.getCurrencyIso4217Code = i8 + 1;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i9 = i2 - i4;
            System.arraycopy(cArr5, 0, cArr3, i9, i4);
            System.arraycopy(cArr5, i4, cArr3, 0, i9);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            aFk1xSDK.getCurrencyIso4217Code = 0;
            $10 = ($11 + 21) % 128;
            while (true) {
                int i10 = aFk1xSDK.getCurrencyIso4217Code;
                if (i10 >= i2) {
                    break;
                }
                $11 = ($10 + 29) % 128;
                cArr6[i10] = cArr3[(i2 - i10) - 1];
                aFk1xSDK.getCurrencyIso4217Code = i10 + 1;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            $10 = ($11 + 119) % 128;
            aFk1xSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i11 = aFk1xSDK.getCurrencyIso4217Code;
                if (i11 >= i2) {
                    break;
                }
                cArr3[i11] = (char) (cArr3[i11] - iArr[2]);
                aFk1xSDK.getCurrencyIso4217Code = i11 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private final void areAllFieldsValid(Map<String, Object> map) {
        int i = AFInAppEventType + 71;
        values = i % 128;
        if (i % 2 == 0) {
            ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).isOtherSdkStringDisabled();
            throw null;
        }
        if (!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).isOtherSdkStringDisabled()) {
            int i2 = AFInAppEventType + 5;
            values = i2 % 128;
            int i3 = i2 % 2;
            AFd1vSDK aFd1vSDK = this.getCurrencyIso4217Code;
            if (i3 == 0) {
                map.put("batteryLevel", String.valueOf(aFd1vSDK.getMonetizationNetwork(this.getMonetizationNetwork).getMonetizationNetwork));
                int i4 = 15 / 0;
            } else {
                map.put("batteryLevel", String.valueOf(aFd1vSDK.getMonetizationNetwork(this.getMonetizationNetwork).getMonetizationNetwork));
            }
        }
        int i5 = AFInAppEventType + 121;
        values = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1eSDK aFg1eSDK = (AFg1eSDK) objArr[0];
        int i = AFInAppEventType + 117;
        values = i % 128;
        if (i % 2 != 0) {
            return AFb1vSDK.m5206e_(aFg1eSDK.getMonetizationNetwork.getApplicationContext().getPackageManager(), aFg1eSDK.getMonetizationNetwork.getApplicationContext().getPackageName());
        }
        int i2 = 22 / 0;
        return AFb1vSDK.m5206e_(aFg1eSDK.getMonetizationNetwork.getApplicationContext().getPackageManager(), aFg1eSDK.getMonetizationNetwork.getApplicationContext().getPackageName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r6.length() == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object component2(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            com.appsflyer.internal.AFg1eSDK r1 = (com.appsflyer.internal.AFg1eSDK) r1
            r2 = 1
            r6 = r6[r2]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            int r3 = java.lang.System.identityHashCode(r1)
            r4 = -1797995787(0xffffffff94d4c2f5, float:-2.1483427E-26)
            r5 = 1797995794(0x6b2b3d12, float:2.0701471E26)
            java.lang.Object r2 = getCurrencyIso4217Code(r2, r4, r5, r3)
            com.appsflyer.AppsFlyerProperties r2 = (com.appsflyer.AppsFlyerProperties) r2
            java.lang.String r3 = "collectAndroidId"
            boolean r0 = r2.getBoolean(r3, r0)
            r2 = 0
            if (r0 == 0) goto L5c
            if (r6 == 0) goto L40
            int r0 = com.appsflyer.internal.AFg1eSDK.values
            int r0 = r0 + 23
            int r3 = r0 % 128
            com.appsflyer.internal.AFg1eSDK.AFInAppEventType = r3
            int r0 = r0 % 2
            if (r0 != 0) goto L3c
            int r0 = r6.length()
            if (r0 != 0) goto L5c
            goto L40
        L3c:
            r6.length()
            throw r2
        L40:
            int r6 = com.appsflyer.internal.AFg1eSDK.values
            int r6 = r6 + 25
            int r0 = r6 % 128
            com.appsflyer.internal.AFg1eSDK.AFInAppEventType = r0
            int r6 = r6 % 2
            if (r6 != 0) goto L58
            boolean r6 = r1.AFKeystoreWrapper()
            if (r6 == 0) goto L57
            java.lang.String r6 = r1.copy()
            return r6
        L57:
            return r2
        L58:
            r1.AFKeystoreWrapper()
            throw r2
        L5c:
            if (r6 == 0) goto L5f
            return r6
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1eSDK.component2(java.lang.Object[]):java.lang.Object");
    }

    private static void component3(@NotNull Map<String, Object> map) throws UnsupportedEncodingException {
        AFInAppEventType = (values + 63) % 128;
        map.getClass();
        Object[] objArr = new Object[1];
        m5235a(new int[]{15, 5, 181, 3}, true, "\u0000\u0001\u0000\u0000\u0000", objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put(Device.TYPE, Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        values = (AFInAppEventType + 57) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r3 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r3 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        com.appsflyer.internal.AFg1eSDK.values = (com.appsflyer.internal.AFg1eSDK.AFInAppEventType + 11) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean component4() {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFg1eSDK.AFInAppEventType
            int r0 = r0 + 121
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1eSDK.values = r1
            int r0 = r0 % 2
            com.appsflyer.internal.AFd1rSDK r3 = r3.component3
            r1 = 0
            java.lang.String r2 = "appsFlyerCount"
            boolean r3 = r3.getCurrencyIso4217Code(r2)
            if (r0 != 0) goto L1a
            r0 = 7
            int r0 = r0 / r1
            if (r3 != 0) goto L26
            goto L1c
        L1a:
            if (r3 != 0) goto L26
        L1c:
            int r3 = com.appsflyer.internal.AFg1eSDK.AFInAppEventType
            int r3 = r3 + 11
            int r3 = r3 % 128
            com.appsflyer.internal.AFg1eSDK.values = r3
            r3 = 1
            return r3
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1eSDK.component4():boolean");
    }

    @SuppressLint({"HardwareIds"})
    private final String copy() {
        String currencyIso4217Code = this.component3.getCurrencyIso4217Code("androidIdCached", null);
        try {
            String string = Settings.Secure.getString(this.getMonetizationNetwork.getContentResolver(), "android_id");
            if (string != null) {
                values = (AFInAppEventType + 27) % 128;
                return string;
            }
        } catch (Exception e) {
            AFLogger.afErrorLog(e.getMessage(), e);
        }
        if (currencyIso4217Code == null) {
            int i = values + 57;
            AFInAppEventType = i % 128;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i2 = values + 53;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            AFLogger.afDebugLog("use cached AndroidId: ".concat(String.valueOf(currencyIso4217Code)));
            return currencyIso4217Code;
        }
        AFLogger.afDebugLog("use cached AndroidId: ".concat(String.valueOf(currencyIso4217Code)));
        throw null;
    }

    private final void copydefault(Map<String, Object> map) {
        int i = (values + 67) % 128;
        AFInAppEventType = i;
        int i2 = i + 87;
        values = i2 % 128;
        int i3 = i2 % 2;
        Context context = this.getMonetizationNetwork;
        if (i3 == 0) {
            throw null;
        }
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            AFInAppEventType = (values + 3) % 128;
            map.put("tv", Boolean.TRUE);
        }
        int i4 = values + 101;
        AFInAppEventType = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m5236d(@NotNull Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, -2016950660, 2016950665, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: e */
    private void m5237e(@NotNull Map<String, Object> map) {
        int i = values + 75;
        AFInAppEventType = i % 128;
        if (i % 2 != 0) {
            map.getClass();
            this.component3.getCurrencyIso4217Code("is_stop_tracking_used");
            throw null;
        }
        map.getClass();
        if (this.component3.getCurrencyIso4217Code("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.component3.AFAdRevenueData("is_stop_tracking_used")));
            values = (AFInAppEventType + 27) % 128;
        }
    }

    @Nullable
    private String equals() {
        int i = values + 111;
        AFInAppEventType = i % 128;
        if (i % 2 != 0) {
            ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getString("preInstallName");
            throw null;
        }
        String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getString("preInstallName");
        if (string != null) {
            return string;
        }
        if (this.component3.getCurrencyIso4217Code("preInstallName")) {
            string = this.component3.getCurrencyIso4217Code("preInstallName", null);
            values = (AFInAppEventType + 7) % 128;
        } else {
            if (component4()) {
                string = AFInAppEventParameterName();
                if (string == null) {
                    string = getRevenue("AF_PRE_INSTALL_NAME");
                }
                AFInAppEventType = (values + 19) % 128;
            }
            if (string != null) {
                this.component3.getRevenue("preInstallName", string);
                AFInAppEventType = (values + 85) % 128;
            }
        }
        if (string != null) {
            values = (AFInAppEventType + 3) % 128;
            ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).set("preInstallName", string);
        }
        return string;
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i * 306) + 610 + (i2 * 306) + (((~(i | i2)) | (~(i | i3))) * HttpStatus.USE_PROXY_305) + (((~(i | (~i3))) | (~i2)) * HttpStatus.USE_PROXY_305);
        String str = null;
        switch (i4) {
            case 1:
                return getMediationNetwork(objArr);
            case 2:
                return getRevenue(objArr);
            case 3:
                return getMonetizationNetwork(objArr);
            case 4:
                return getCurrencyIso4217Code(objArr);
            case 5:
                AFg1eSDK aFg1eSDK = (AFg1eSDK) objArr[0];
                Map map = (Map) objArr[1];
                AFInAppEventType = (values + 53) % 128;
                map.getClass();
                boolean mediationNetwork = AFg1lSDK.getMediationNetwork(aFg1eSDK.getMonetizationNetwork);
                AFLogger.afDebugLog("didConfigureTokenRefreshService=".concat(String.valueOf(mediationNetwork)));
                if (!mediationNetwork) {
                    values = (AFInAppEventType + 51) % 128;
                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                }
                map.put("registeredUninstall", Boolean.valueOf(AFg1lSDK.getCurrencyIso4217Code(aFg1eSDK.component3)));
                return null;
            case 6:
                return component1(objArr);
            case 7:
                return component4(objArr);
            case 8:
                AFg1eSDK aFg1eSDK2 = (AFg1eSDK) objArr[0];
                Map map2 = (Map) objArr[1];
                map2.getClass();
                AFh1qSDK aFh1qSDK = aFg1eSDK2.component2;
                HashMap map3 = new HashMap(aFh1qSDK.getCurrencyIso4217Code);
                aFh1qSDK.getCurrencyIso4217Code.clear();
                aFg1eSDK2.component2.getMediationNetwork.getRevenue("gcd");
                if (!map3.isEmpty()) {
                    values = (AFInAppEventType + 79) % 128;
                    Map<String, Object> revenue = AFb1tSDK.getRevenue((Map<String, Object>) map2);
                    revenue.getClass();
                    revenue.put("gcd", map3);
                }
                return null;
            case 9:
                return component2(objArr);
            case 10:
                return areAllFieldsValid(objArr);
            case 11:
                AFg1eSDK aFg1eSDK3 = (AFg1eSDK) objArr[0];
                AFInAppEventType = (values + 61) % 128;
                if (aFg1eSDK3.component3.getCurrencyIso4217Code("INSTALL_STORE")) {
                    return aFg1eSDK3.component3.getCurrencyIso4217Code("INSTALL_STORE", null);
                }
                if (aFg1eSDK3.component4()) {
                    AFInAppEventType = (values + 21) % 128;
                    str = (String) getCurrencyIso4217Code(new Object[]{aFg1eSDK3}, -1610220091, 1610220091, System.identityHashCode(aFg1eSDK3));
                }
                aFg1eSDK3.component3.getRevenue("INSTALL_STORE", str);
                return str;
            case 12:
                AFg1eSDK aFg1eSDK4 = (AFg1eSDK) objArr[0];
                Map map4 = (Map) objArr[1];
                map4.getClass();
                String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1eSDK4}, -1797995787, 1797995794, System.identityHashCode(aFg1eSDK4))).getString(AppsFlyerProperties.ONELINK_ID);
                String string2 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1eSDK4}, -1797995787, 1797995794, System.identityHashCode(aFg1eSDK4))).getString(AppsFlyerProperties.ONELINK_VERSION);
                if (string != null) {
                    values = (AFInAppEventType + 71) % 128;
                    map4.put("onelink_id", string);
                    AFInAppEventType = (values + 23) % 128;
                }
                if (string2 != null) {
                    map4.put("onelink_ver", string2);
                    values = (AFInAppEventType + 83) % 128;
                }
                return null;
            default:
                return AFAdRevenueData(objArr);
        }
    }

    private void getMediationNetwork(@NotNull Map<String, Object> map, @Nullable String str) {
        map.getClass();
        if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i = values + 39;
            AFInAppEventType = i % 128;
            if (i % 2 != 0) {
                map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                throw null;
            }
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            int i2 = values + 65;
            AFInAppEventType = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 34 / 0;
                return;
            }
            return;
        }
        String strAFAdRevenueData = this.areAllFieldsValid.AFAdRevenueData(this.component3);
        if (strAFAdRevenueData != null) {
            AFInAppEventType = (values + 67) % 128;
            if (strAFAdRevenueData.length() != 0) {
                map.put(Device.IMEI, strAFAdRevenueData);
            }
        }
        String str2 = (String) getCurrencyIso4217Code(new Object[]{this, str}, -2025693211, 2025693220, System.identityHashCode(this));
        if (str2 != null) {
            AFInAppEventType = (values + 55) % 128;
            this.component3.getRevenue("androidIdCached", str2);
            map.put("android_id", str2);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFb1ySDK revenue = AFb1rSDK.getRevenue(this.getMonetizationNetwork);
        if (revenue != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = revenue.getMonetizationNetwork;
            bool.getClass();
            linkedHashMap.put("isManual", bool);
            String str3 = revenue.AFAdRevenueData;
            str3.getClass();
            linkedHashMap.put("val", str3);
            Boolean bool2 = revenue.getMediationNetwork;
            if (bool2 != null) {
                linkedHashMap.put("isLat", bool2);
            }
            map.put(Device.OAID, linkedHashMap);
        }
    }

    private final void getMonetizationNetwork(Map<String, Object> map) {
        values = (AFInAppEventType + 21) % 128;
        try {
            PackageInfo packageInfo = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 0);
            int monetizationNetwork = this.component3.getMonetizationNetwork("versionCode", 0);
            int i = packageInfo.versionCode;
            if (i > monetizationNetwork) {
                this.component3.AFAdRevenueData("versionCode", i);
            }
            map.put("app_version_code", String.valueOf(packageInfo.versionCode));
            Context context = this.component1.AFAdRevenueData.getCurrencyIso4217Code;
            map.put("app_version_name", AFb1vSDK.getMonetizationNetwork(context, context.getPackageName()));
            map.put("targetSDKver", Integer.valueOf(this.component1.AFAdRevenueData.getCurrencyIso4217Code.getApplicationInfo().targetSdkVersion));
            long j = packageInfo.firstInstallTime;
            long j2 = packageInfo.lastUpdateTime;
            map.put("date1", AFAdRevenueData().format(new Date(j)));
            map.put("date2", AFAdRevenueData().format(new Date(j2)));
            Object[] objArr = new Object[1];
            m5235a(new int[]{0, 15, 0, 7}, true, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", objArr);
            String strIntern = ((String) objArr[0]).intern();
            SimpleDateFormat simpleDateFormatAFAdRevenueData = AFAdRevenueData();
            simpleDateFormatAFAdRevenueData.getClass();
            map.put(strIntern, getMonetizationNetwork(simpleDateFormatAFAdRevenueData));
            values = (AFInAppEventType + 95) % 128;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    private final void hashCode(Map<String, Object> map) {
        int i = AFInAppEventType + 75;
        values = i % 128;
        int i2 = i % 2;
        Context context = this.getMonetizationNetwork;
        if (i2 == 0) {
            int i3 = 32 / 0;
            if (AFh1zSDK.getRevenue(context)) {
                map.put("inst_app", Boolean.TRUE);
            }
        } else if (AFh1zSDK.getRevenue(context)) {
            map.put("inst_app", Boolean.TRUE);
        }
        values = (AFInAppEventType + 111) % 128;
    }

    private void registerClient(@NotNull Map<String, Object> map) {
        int i = AFInAppEventType + 107;
        values = i % 128;
        if (i % 2 == 0) {
            map.getClass();
            String str = this.areAllFieldsValid.component1;
            throw null;
        }
        map.getClass();
        String str2 = this.areAllFieldsValid.component1;
        if (str2 != null) {
            values = (AFInAppEventType + 93) % 128;
            if (str2.length() != 0) {
                map.put("appsflyerKey", str2);
                return;
            }
        }
        values = (AFInAppEventType + 113) % 128;
    }

    private void toString(@NotNull Map<String, Object> map) {
        map.getClass();
        long j = this.component2.hashCode;
        if (j != 0) {
            AFInAppEventType = (values + 115) % 128;
            map.put("prev_session_dur", Long.valueOf(j));
        }
        values = (AFInAppEventType + 41) % 128;
    }

    private void unregisterClient(@NotNull Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, -1438502043, 1438502046, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: v_ */
    private static PackageInfo m5238v_(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        int i = AFInAppEventType + 39;
        values = i % 128;
        if (i % 2 != 0 ? Build.VERSION.SDK_INT < 33 : Build.VERSION.SDK_INT < 101) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            packageInfo.getClass();
            return packageInfo;
        }
        int i2 = values + 115;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 != 0) {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(1L));
            packageInfo2.getClass();
            return packageInfo2;
        }
        PackageInfo packageInfo3 = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
        packageInfo3.getClass();
        return packageInfo3;
    }

    private void valueOf(@NotNull Map<String, Object> map) {
        values = (AFInAppEventType + 17) % 128;
        map.getClass();
        String strComponent4 = this.component1.component4();
        String str = (String) getCurrencyIso4217Code(new Object[]{this.component3, strComponent4}, -1963229837, 1963229839, (int) System.currentTimeMillis());
        boolean z = false;
        boolean z2 = (str == null || Intrinsics.m87488d(str, strComponent4)) ? false : true;
        if (str == null && strComponent4 != null) {
            AFInAppEventType = (values + 15) % 128;
            z = true;
        }
        if (z2 || z) {
            map.put("af_latestchannel", strComponent4);
        }
        String str2 = (String) getCurrencyIso4217Code(new Object[]{this}, 1909933605, -1909933594, System.identityHashCode(this));
        if (str2 != null) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            map.put("af_installstore", lowerCase);
            AFInAppEventType = (values + 89) % 128;
        }
        String strEquals = equals();
        if (strEquals != null) {
            Locale locale2 = Locale.getDefault();
            locale2.getClass();
            String lowerCase2 = strEquals.toLowerCase(locale2);
            lowerCase2.getClass();
            map.put("af_preinstall_name", lowerCase2);
        }
        String str3 = (String) getCurrencyIso4217Code(new Object[]{this}, -1610220091, 1610220091, System.identityHashCode(this));
        if (str3 != null) {
            int i = AFInAppEventType + 117;
            values = i % 128;
            if (i % 2 != 0) {
                Locale locale3 = Locale.getDefault();
                locale3.getClass();
                String lowerCase3 = str3.toLowerCase(locale3);
                lowerCase3.getClass();
                map.put("af_currentstore", lowerCase3);
                return;
            }
            Locale locale4 = Locale.getDefault();
            locale4.getClass();
            String lowerCase4 = str3.toLowerCase(locale4);
            lowerCase4.getClass();
            map.put("af_currentstore", lowerCase4);
            throw null;
        }
    }

    private void values(@NotNull Map<String, Object> map) {
        values = (AFInAppEventType + 97) % 128;
        map.getClass();
        String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
        if (string == null || string.length() == 0) {
            AFInAppEventType = (values + 79) % 128;
        } else {
            values = (AFInAppEventType + 77) % 128;
            map.put(AppsFlyerProperties.EXTENSION, string);
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void AFAdRevenueData(@NotNull AFa1mSDK aFa1mSDK) throws UnsupportedEncodingException {
        values = (AFInAppEventType + 21) % 128;
        aFa1mSDK.getClass();
        Map<String, Object> revenue = aFa1mSDK.getRevenue();
        revenue.getClass();
        getRevenue(revenue, aFa1mSDK.AFAdRevenueData());
        component3(revenue);
        AFInAppEventParameterName(revenue);
        AFAdRevenueData(revenue);
        getMediationNetwork(revenue, this.equals.getRevenue);
        AFLogger(revenue);
        revenue.put("cell", MapsKt.mapOf(TuplesKt.m87240a("mcc", Integer.valueOf(this.getMonetizationNetwork.getResources().getConfiguration().mcc)), TuplesKt.m87240a("mnc", Integer.valueOf(this.getMonetizationNetwork.getResources().getConfiguration().mnc))));
        revenue.put("sig", (String) getCurrencyIso4217Code(new Object[]{this}, -576090873, 576090879, System.identityHashCode(this)));
        revenue.put("last_boot_time", Long.valueOf(component3()));
        revenue.put("disk", (String) getCurrencyIso4217Code(new Object[0], -1921408424, 1921408434, (int) System.currentTimeMillis()));
        int i = AFInAppEventType + 65;
        values = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    @Override // com.appsflyer.internal.AFg1fSDK
    public final void getRevenue(@NotNull AFa1mSDK aFa1mSDK) {
        boolean zM87488d;
        AFInAppEventType = (values + 21) % 128;
        aFa1mSDK.getClass();
        if (this.component1.component2()) {
            AFh1pSDK aFh1pSDK = this.component1.getMonetizationNetwork.component4;
            if (aFh1pSDK == null) {
                AFInAppEventType = (values + 101) % 128;
                return;
            }
            String str = aFh1pSDK.getRevenue;
            if (str != null) {
                int i = AFInAppEventType + 5;
                values = i % 128;
                if (i % 2 == 0) {
                    str.length();
                    throw null;
                }
                if (str.length() == 0) {
                    values = (AFInAppEventType + 49) % 128;
                } else {
                    AFInAppEventType = (values + 119) % 128;
                    aFa1mSDK.getMonetizationNetwork("gaidError", aFh1pSDK.getRevenue);
                }
            } else {
                values = (AFInAppEventType + 49) % 128;
            }
            String str2 = aFh1pSDK.AFAdRevenueData;
            if (str2 != null && aFh1pSDK.getCurrencyIso4217Code != null) {
                AFInAppEventType = (values + 53) % 128;
                aFa1mSDK.getMonetizationNetwork("advertiserId", str2);
                aFa1mSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(aFh1pSDK.getCurrencyIso4217Code));
                aFa1mSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(aFh1pSDK.getMediationNetwork));
            }
        } else {
            Map<String, Object> revenue = AFb1tSDK.getRevenue(aFa1mSDK.getRevenue());
            revenue.getClass();
            revenue.put("ad_ids_disabled", Boolean.TRUE);
        }
        AFh1pSDK aFh1pSDK2 = this.component1.getMonetizationNetwork.component4;
        if (aFh1pSDK2 != null) {
            int i2 = AFInAppEventType + 69;
            values = i2 % 128;
            int i3 = i2 % 2;
            Boolean bool = aFh1pSDK2.areAllFieldsValid;
            if (i3 == 0) {
                Intrinsics.m87488d(bool, Boolean.TRUE);
                throw null;
            }
            zM87488d = Intrinsics.m87488d(bool, Boolean.TRUE);
        } else {
            zM87488d = false;
        }
        aFa1mSDK.getMonetizationNetwork("GAID_retry", String.valueOf(zM87488d));
        if (CollectionsKt.listOf((Object[]) new AFf1zSDK[]{AFf1zSDK.CONVERSION, AFf1zSDK.LAUNCH}).contains(aFa1mSDK.getCurrencyIso4217Code())) {
            AFe1oSDK aFe1oSDK = this.equals.areAllFieldsValid;
            if (aFe1oSDK == null) {
                values = (AFInAppEventType + 55) % 128;
                return;
            }
            Map<String, Object> revenue2 = AFb1tSDK.getRevenue(aFa1mSDK.getRevenue());
            revenue2.getClass();
            revenue2.put("fetchAdIdLatency", Long.valueOf(aFe1oSDK.AFAdRevenueData));
        }
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1eSDK aFg1eSDK = (AFg1eSDK) objArr[0];
        values = (AFInAppEventType + 47) % 128;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) aFg1eSDK.copy.getValue();
        int i = AFInAppEventType + 83;
        values = i % 128;
        if (i % 2 != 0) {
            return appsFlyerProperties;
        }
        throw null;
    }

    private void component4(@NotNull Map<String, ? extends Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, 2043171630, -2043171622, System.identityHashCode(this));
    }

    private final void component1(Map<String, Object> map) {
        values = (AFInAppEventType + 25) % 128;
        AFd1vSDK.AFa1ySDK monetizationNetwork = this.getCurrencyIso4217Code.getMonetizationNetwork(this.getMonetizationNetwork);
        float f = monetizationNetwork.getMonetizationNetwork;
        String str = monetizationNetwork.AFAdRevenueData;
        map.put("btl", String.valueOf(f));
        if (str != null) {
            AFInAppEventType = (values + 87) % 128;
            map.put("btch", str);
        }
    }

    @Nullable
    private String component1() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, -1610220091, 1610220091, System.identityHashCode(this));
    }

    private boolean copydefault() {
        values = (AFInAppEventType + 115) % 128;
        boolean z = Boolean.parseBoolean(this.component3.getCurrencyIso4217Code("sentSuccessfully", null));
        AFInAppEventType = (values + 111) % 128;
        return z;
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        values = (AFInAppEventType + 47) % 128;
        map.getClass();
        map.putAll(this.copydefault.getMonetizationNetwork());
        values = (AFInAppEventType + 83) % 128;
    }

    private static long component3() {
        values = (AFInAppEventType + 9) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        values = (AFInAppEventType + 119) % 128;
        return jCurrentTimeMillis;
    }

    private void copy(@NotNull Map<String, Object> map) {
        int i = AFInAppEventType + 125;
        values = i % 128;
        if (i % 2 != 0) {
            map.getClass();
            map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            int i2 = AFInAppEventType + 33;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        map.getClass();
        map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        throw null;
    }

    @Nullable
    private String component2() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, 1909933605, -1909933594, System.identityHashCode(this));
    }

    private void component2(@NotNull Map<String, Object> map) {
        getCurrencyIso4217Code(new Object[]{this, map}, -230224396, 230224408, System.identityHashCode(this));
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        StringBuilder sb = new StringBuilder();
        sb.append((long) (availableBlocksLong / dPow));
        sb.append('/');
        sb.append((long) (blockCountLong / dPow));
        String string = sb.toString();
        int i = AFInAppEventType + 87;
        values = i % 128;
        if (i % 2 != 0) {
            return string;
        }
        throw null;
    }

    private static void AFInAppEventParameterName(@NotNull Map<String, Object> map) {
        map.getClass();
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
            values = (AFInAppEventType + 95) % 128;
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
            values = (AFInAppEventType + 39) % 128;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e2);
        }
        try {
            map.put("country", Locale.getDefault().getCountry());
            int i = values + 37;
            AFInAppEventType = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e3);
        }
    }

    @NotNull
    private static String areAllFieldsValid() {
        return (String) getCurrencyIso4217Code(new Object[0], -1921408424, 1921408434, (int) System.currentTimeMillis());
    }

    private void equals(@NotNull Map<String, Object> map) {
        long j;
        map.getClass();
        long jAFAdRevenueData = this.component3.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.component3.getRevenue("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
        if (jAFAdRevenueData > 0) {
            int i = AFInAppEventType + 97;
            int i2 = i % 128;
            values = i2;
            int i3 = i % 2;
            j = (jCurrentTimeMillis - jAFAdRevenueData) / 1000;
            AFInAppEventType = (i2 + 73) % 128;
        } else {
            values = (AFInAppEventType + 77) % 128;
            j = -1;
        }
        map.put("timepassedsincelastlaunch", String.valueOf(j));
    }

    private final SimpleDateFormat AFAdRevenueData() {
        int i = AFInAppEventType + 3;
        values = i % 128;
        int i2 = i % 2;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFKeystoreWrapper.getValue();
        if (i2 != 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void AFAdRevenueData(@NotNull Map<String, Object> map) {
        AFi1ySDK monetizationNetwork;
        map.getClass();
        AFi1wSDK aFi1wSDK = this.component4.getMediationNetwork;
        if (aFi1wSDK != null) {
            monetizationNetwork = aFi1wSDK.getMonetizationNetwork();
        } else {
            AFInAppEventType = (values + 23) % 128;
            monetizationNetwork = null;
        }
        if (monetizationNetwork != null) {
            map.put("network", monetizationNetwork.AFAdRevenueData);
            map.put("ivc", Boolean.valueOf(monetizationNetwork.getCurrencyIso4217Code()));
            if (((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                return;
            }
            int i = (values + 95) % 128;
            AFInAppEventType = i;
            String str = monetizationNetwork.getRevenue;
            if (str != null) {
                map.put("operator", str);
            } else {
                values = (i + 61) % 128;
            }
            String str2 = monetizationNetwork.getCurrencyIso4217Code;
            if (str2 != null) {
                map.put("carrier", str2);
            }
        }
    }

    private static void getMonetizationNetwork(@NotNull Map<String, Object> map, @Nullable String str) {
        map.getClass();
        if (str != null) {
            values = (AFInAppEventType + 89) % 128;
            map.put("phone", str);
        }
        int i = values + 39;
        AFInAppEventType = i % 128;
        if (i % 2 != 0) {
            int i2 = 29 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    @Nullable
    public final Long getMonetizationNetwork() throws PackageManager.NameNotFoundException {
        int i = values + 117;
        AFInAppEventType = i % 128;
        int i2 = i % 2;
        AFd1kSDK aFd1kSDK = this.toString;
        if (i2 == 0) {
            Context context = aFd1kSDK.getCurrencyIso4217Code;
            if (context == null) {
                return null;
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                String packageName = context.getPackageName();
                packageName.getClass();
                PackageInfo packageInfoM5238v_ = m5238v_(packageManager, packageName);
                if (packageInfoM5238v_ != null) {
                    int i3 = values + 31;
                    AFInAppEventType = i3 % 128;
                    if (i3 % 2 == 0) {
                        return Long.valueOf(packageInfoM5238v_.firstInstallTime);
                    }
                    long j = packageInfoM5238v_.firstInstallTime;
                    throw null;
                }
            }
            int i4 = AFInAppEventType + 73;
            values = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }
        Context context2 = aFd1kSDK.getCurrencyIso4217Code;
        throw null;
    }

    private void AFAdRevenueData(@NotNull Map<String, Object> map, @NotNull String str) {
        int i = AFInAppEventType + 119;
        values = i % 128;
        try {
            if (i % 2 != 0) {
                map.getClass();
                str.getClass();
                String currencyIso4217Code = this.component3.getCurrencyIso4217Code("prev_event_name", null);
                if (currencyIso4217Code != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prev_event_timestamp", this.component3.AFAdRevenueData("prev_event_timestamp", -1L));
                    jSONObject.put("prev_event_name", currencyIso4217Code);
                    map.put("prev_event", jSONObject);
                    AFInAppEventType = (values + 73) % 128;
                }
                this.component3.getRevenue("prev_event_name", str);
                this.component3.getRevenue("prev_event_timestamp", System.currentTimeMillis());
                return;
            }
            map.getClass();
            str.getClass();
            this.component3.getCurrencyIso4217Code("prev_event_name", null);
            throw null;
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void getMediationNetwork(@NotNull Map<String, Object> map) {
        Object objM223820constructorimpl;
        map.getClass();
        String str = this.equals.AFAdRevenueData;
        if (str != null) {
            if (map.get("af_deeplink") != null) {
                int i = AFInAppEventType + 85;
                values = i % 128;
                if (i % 2 == 0) {
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                    throw null;
                }
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    objM223820constructorimpl = Result.m223820constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
                }
                Throwable thM223823exceptionOrNullimpl = Result.m223823exceptionOrNullimpl(objM223820constructorimpl);
                if (thM223823exceptionOrNullimpl != null) {
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", thM223823exceptionOrNullimpl, false, false, false, false, 120, null);
                } else {
                    AFInAppEventType = (values + 67) % 128;
                }
                Result.m223819boximpl(objM223820constructorimpl);
            }
        }
        this.equals.AFAdRevenueData = null;
        int i2 = AFInAppEventType + 89;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @NotNull
    private String getMonetizationNetwork(@NotNull SimpleDateFormat simpleDateFormat) {
        String currencyIso4217Code;
        String str;
        int i = AFInAppEventType + 95;
        values = i % 128;
        if (i % 2 == 0) {
            simpleDateFormat.getClass();
            currencyIso4217Code = this.component3.getCurrencyIso4217Code("appsFlyerFirstInstall", null);
            int i2 = 69 / 0;
            if (currencyIso4217Code == null) {
                AFInAppEventType = (values + 55) % 128;
                if (component4()) {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    str = simpleDateFormat.format(new Date());
                } else {
                    values = (AFInAppEventType + 79) % 128;
                    str = "";
                }
                currencyIso4217Code = str;
                this.component3.getRevenue("appsFlyerFirstInstall", currencyIso4217Code);
            }
        } else {
            simpleDateFormat.getClass();
            currencyIso4217Code = this.component3.getCurrencyIso4217Code("appsFlyerFirstInstall", null);
            if (currencyIso4217Code == null) {
                AFInAppEventType = (values + 55) % 128;
                if (component4()) {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    str = simpleDateFormat.format(new Date());
                } else {
                    values = (AFInAppEventType + 79) % 128;
                    str = "";
                }
                currencyIso4217Code = str;
                this.component3.getRevenue("appsFlyerFirstInstall", currencyIso4217Code);
            }
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "AppsFlyer: first launch date: ".concat(String.valueOf(currencyIso4217Code)), false, 4, null);
        currencyIso4217Code.getClass();
        return currencyIso4217Code;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFg1eSDK aFg1eSDK = (AFg1eSDK) objArr[0];
        int i = AFInAppEventType + 29;
        values = i % 128;
        if (i % 2 == 0) {
            String string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1eSDK}, -1797995787, 1797995794, System.identityHashCode(aFg1eSDK))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            int i2 = 64 / 0;
            if (string != null) {
                return string;
            }
        } else {
            String string2 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1eSDK}, -1797995787, 1797995794, System.identityHashCode(aFg1eSDK))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string2 != null) {
                return string2;
            }
        }
        String revenue = aFg1eSDK.getRevenue("AF_STORE");
        values = (AFInAppEventType + 57) % 128;
        return revenue;
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void getMediationNetwork(@NotNull AFa1mSDK aFa1mSDK) {
        values = (AFInAppEventType + 97) % 128;
        aFa1mSDK.getClass();
        Map<String, Object> revenue = aFa1mSDK.getRevenue();
        if (aFa1mSDK.AFAdRevenueData()) {
            AFInAppEventType = (values + 63) % 128;
            String str = aFa1mSDK.component2;
            AFd1mSDK aFd1mSDK = this.equals;
            getRevenue(aFa1mSDK, str, aFd1mSDK.getCurrencyIso4217Code, aFd1mSDK.getMediationNetwork);
        } else if (!(aFa1mSDK instanceof AFh1hSDK)) {
            revenue.getClass();
            String str2 = aFa1mSDK.component4;
            str2.getClass();
            AFAdRevenueData(revenue, str2);
        }
        if (CollectionsKt.listOf((Object[]) new AFf1zSDK[]{AFf1zSDK.CONVERSION, AFf1zSDK.LAUNCH, AFf1zSDK.INAPP}).contains(aFa1mSDK.getCurrencyIso4217Code())) {
            int i = values + 27;
            AFInAppEventType = i % 128;
            if (i % 2 == 0) {
                revenue.getClass();
                copy(revenue);
            } else {
                revenue.getClass();
                copy(revenue);
                throw null;
            }
        }
        revenue.getClass();
        registerClient(revenue);
        AFInAppEventType(revenue);
        AFKeystoreWrapper(revenue);
        values(revenue);
        getCurrencyIso4217Code(new Object[]{this, revenue}, -1438502043, 1438502046, System.identityHashCode(this));
        getCurrencyIso4217Code(revenue, aFa1mSDK.AFAdRevenueData());
        getCurrencyIso4217Code(new Object[]{this, revenue}, -2016950660, 2016950665, System.identityHashCode(this));
        m5237e(revenue);
        getCurrencyIso4217Code(revenue, aFa1mSDK);
        revenue.put("af_events_api", "1");
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFg1eSDK aFg1eSDK = (AFg1eSDK) objArr[0];
        Map map = (Map) objArr[1];
        AFInAppEventType = (values + 3) % 128;
        map.getClass();
        try {
            String strAFAdRevenueData = AFb1lSDK.AFAdRevenueData(aFg1eSDK.toString, aFg1eSDK.component3);
            if (strAFAdRevenueData != null) {
                int i = values + 3;
                AFInAppEventType = i % 128;
                if (i % 2 == 0) {
                    map.put(Oauth2AccessToken.KEY_UID, strAFAdRevenueData);
                    return null;
                }
                map.put(Oauth2AccessToken.KEY_UID, strAFAdRevenueData);
                int i2 = 94 / 0;
                return null;
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("ERROR: could not get uid ");
            sb.append(th.getMessage());
            AFLogger.afErrorLog(sb.toString(), th);
        }
        int i3 = AFInAppEventType + 11;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
        return null;
    }

    private static File getMonetizationNetwork(String str) {
        if (str != null) {
            int i = AFInAppEventType + 31;
            values = i % 128;
            try {
                if (i % 2 != 0) {
                    if (StringsKt.m93433Z0(str).toString().length() > 0) {
                        return new File(StringsKt.m93433Z0(str).toString());
                    }
                } else {
                    StringsKt.m93433Z0(str).toString().length();
                    throw null;
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        values = (AFInAppEventType + 51) % 128;
        return null;
    }

    private static void getMediationNetwork(@NotNull Map<String, Object> map, boolean z) {
        int i = AFInAppEventType + 39;
        values = i % 128;
        if (i % 2 != 0) {
            map.getClass();
            map.put("af_preinstalled", String.valueOf(z));
            values = (AFInAppEventType + 75) % 128;
        } else {
            map.getClass();
            map.put("af_preinstalled", String.valueOf(z));
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x005f A[EXC_TOP_SPLITTER, PHI: r2
      0x005f: PHI (r2v7 java.io.InputStreamReader) = (r2v12 java.io.InputStreamReader), (r2v13 java.io.InputStreamReader) binds: [B:22:0x005d, B:31:0x0084] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r0 = new java.util.Properties();
        r2 = new java.io.InputStreamReader(new java.io.FileInputStream(r1), java.nio.charset.Charset.defaultCharset());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r0.load(r2);
        com.appsflyer.AFLogger.afInfoLog("Found PreInstall property!");
        r6 = r0.getProperty(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        r6 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r6 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r6.getMessage(), r6);
        r2 = r2;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r2 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        r2.close();
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r6.getMessage(), r6);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        r6 = new java.lang.StringBuilder("PreInstall file wasn't found: ");
        r6.append(r1.getAbsolutePath());
        com.appsflyer.AFLogger.afDebugLog(r6.toString());
        r2 = r2;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r2 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        if (r2 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        r0 = com.appsflyer.internal.AFg1eSDK.AFInAppEventType + 23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        com.appsflyer.internal.AFg1eSDK.values = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        r0 = com.appsflyer.internal.AFg1eSDK.AFInAppEventType + 61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r1 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        com.appsflyer.internal.AFg1eSDK.AFInAppEventType = (r2 + 55) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getMediationNetwork(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            java.io.File r1 = (java.io.File) r1
            r2 = 1
            r6 = r6[r2]
            java.lang.String r6 = (java.lang.String) r6
            int r2 = com.appsflyer.internal.AFg1eSDK.values
            int r3 = r2 + 43
            int r4 = r3 % 128
            com.appsflyer.internal.AFg1eSDK.AFInAppEventType = r4
            int r3 = r3 % 2
            r4 = 0
            if (r3 == 0) goto L1d
            r3 = 72
            int r3 = r3 / r0
            if (r1 != 0) goto L26
            goto L1f
        L1d:
            if (r1 != 0) goto L26
        L1f:
            int r2 = r2 + 55
            int r2 = r2 % 128
            com.appsflyer.internal.AFg1eSDK.AFInAppEventType = r2
            return r4
        L26:
            java.util.Properties r0 = new java.util.Properties     // Catch: java.lang.Throwable -> L54 java.io.FileNotFoundException -> L6e
            r0.<init>()     // Catch: java.lang.Throwable -> L54 java.io.FileNotFoundException -> L6e
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L54 java.io.FileNotFoundException -> L6e
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L54 java.io.FileNotFoundException -> L6e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L54 java.io.FileNotFoundException -> L6e
            java.nio.charset.Charset r5 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L54 java.io.FileNotFoundException -> L6e
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L54 java.io.FileNotFoundException -> L6e
            r0.load(r2)     // Catch: java.lang.Throwable -> L52 java.io.FileNotFoundException -> L6f
            java.lang.String r3 = "Found PreInstall property!"
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch: java.lang.Throwable -> L52 java.io.FileNotFoundException -> L6f
            java.lang.String r6 = r0.getProperty(r6)     // Catch: java.lang.Throwable -> L52 java.io.FileNotFoundException -> L6f
            r2.close()     // Catch: java.lang.Throwable -> L49
            return r6
        L49:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r1, r0)
            return r6
        L52:
            r6 = move-exception
            goto L56
        L54:
            r6 = move-exception
            r2 = r4
        L56:
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L6c
            com.appsflyer.AFLogger.afErrorLog(r0, r6)     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L87
        L5f:
            r2.close()     // Catch: java.lang.Throwable -> L63
            goto L87
        L63:
            r6 = move-exception
            java.lang.String r0 = r6.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r6)
            goto L87
        L6c:
            r6 = move-exception
            goto L88
        L6e:
            r2 = r4
        L6f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "PreInstall file wasn't found: "
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L6c
            r6.append(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L6c
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch: java.lang.Throwable -> L6c
            if (r2 == 0) goto L87
            goto L5f
        L87:
            return r4
        L88:
            if (r2 == 0) goto L9f
            r2.close()     // Catch: java.lang.Throwable -> L96
            int r0 = com.appsflyer.internal.AFg1eSDK.AFInAppEventType
            int r0 = r0 + 23
        L91:
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1eSDK.values = r0
            goto La4
        L96:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r1, r0)
            goto La4
        L9f:
            int r0 = com.appsflyer.internal.AFg1eSDK.AFInAppEventType
            int r0 = r0 + 61
            goto L91
        La4:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1eSDK.getMediationNetwork(java.lang.Object[]):java.lang.Object");
    }

    private final void getRevenue(Map<String, Object> map) {
        try {
            long j = this.getMonetizationNetwork.getPackageManager().getPackageInfo(this.getMonetizationNetwork.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j)));
            AFInAppEventType = (values + 61) % 128;
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e);
        }
    }

    private void getRevenue(@NotNull Map<String, Object> map, boolean z) {
        map.getClass();
        HashMap map2 = new HashMap();
        map2.put("cpu_abi", getCurrencyIso4217Code("ro.product.cpu.abi"));
        map2.put("cpu_abi2", getCurrencyIso4217Code("ro.product.cpu.abi2"));
        map2.put("arch", getCurrencyIso4217Code("os.arch"));
        map2.put("build_display_id", getCurrencyIso4217Code("ro.build.display.id"));
        if (z) {
            AFInAppEventType = (values + 101) % 128;
            component1(map2);
            if (this.component1.getRevenue.getMonetizationNetwork("appsFlyerCount", 0) <= 2) {
                int i = AFInAppEventType + 17;
                values = i % 128;
                int i2 = i % 2;
                AFj1uSDK aFj1uSDK = this.getRevenue;
                if (i2 == 0) {
                    map2.putAll(aFj1uSDK.getMediationNetwork());
                    throw null;
                }
                map2.putAll(aFj1uSDK.getMediationNetwork());
            }
        }
        map2.put("dim", this.getMediationNetwork.getMonetizationNetwork(this.getMonetizationNetwork));
        map.put("deviceData", map2);
        int i3 = AFInAppEventType + 109;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static String getMediationNetwork(AFd1rSDK aFd1rSDK, String str) {
        return (String) getCurrencyIso4217Code(new Object[]{aFd1rSDK, str}, -1963229837, 1963229839, (int) System.currentTimeMillis());
    }

    private final String getMediationNetwork(String str) {
        return (String) getCurrencyIso4217Code(new Object[]{this, str}, -2025693211, 2025693220, System.identityHashCode(this));
    }

    private final AppsFlyerProperties getMediationNetwork() {
        return (AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final long getRevenue() {
        AFInAppEventType = (values + 65) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = AFInAppEventType + 67;
        values = i % 128;
        if (i % 2 != 0) {
            return jCurrentTimeMillis;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void getRevenue(@NotNull Map<String, Object> map, int i, int i2) {
        values = (AFInAppEventType + 43) % 128;
        map.getClass();
        map.put(Counter.TYPE, String.valueOf(i));
        map.put("iaecounter", String.valueOf(i2));
        map.put("isFirstCall", String.valueOf(!copydefault()));
        AFInAppEventType = (values + 85) % 128;
    }

    private void getRevenue(@NotNull AFa1mSDK aFa1mSDK, @Nullable String str, @Nullable String str2, @Nullable AFc1bSDK aFc1bSDK) {
        int i = values + 53;
        AFInAppEventType = i % 128;
        if (i % 2 == 0) {
            aFa1mSDK.getClass();
            Map<String, Object> revenue = aFa1mSDK.getRevenue();
            if (aFa1mSDK.getCurrencyIso4217Code() == AFf1zSDK.CONVERSION) {
                revenue.getClass();
                areAllFieldsValid(revenue);
                copydefault(revenue);
                hashCode(revenue);
                AFb1gSDK.getCurrencyIso4217Code(this.toString, this.component3);
            }
            revenue.getClass();
            equals(revenue);
            getCurrencyIso4217Code(new Object[]{this, revenue}, -230224396, 230224408, System.identityHashCode(this));
            getCurrencyIso4217Code(new Object[]{this, revenue}, 2043171630, -2043171622, System.identityHashCode(this));
            getMonetizationNetwork(revenue, str2);
            getCurrencyIso4217Code(new Object[]{this, revenue, str}, 1881859410, -1881859406, System.identityHashCode(this));
            toString(revenue);
            if (aFc1bSDK != null) {
                AFInAppEventType = (values + 37) % 128;
                aFc1bSDK.getCurrencyIso4217Code(revenue);
                return;
            }
            return;
        }
        aFa1mSDK.getClass();
        aFa1mSDK.getRevenue();
        aFa1mSDK.getCurrencyIso4217Code();
        AFf1zSDK aFf1zSDK = AFf1zSDK.RC_CDN;
        throw null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1rSDK aFd1rSDK = (AFd1rSDK) objArr[0];
        String str = (String) objArr[1];
        int i = values + 77;
        AFInAppEventType = i % 128;
        if (i % 2 == 0) {
            String currencyIso4217Code = aFd1rSDK.getCurrencyIso4217Code("CACHED_CHANNEL", null);
            if (currencyIso4217Code != null) {
                values = (AFInAppEventType + 79) % 128;
                return currencyIso4217Code;
            }
            aFd1rSDK.getRevenue("CACHED_CHANNEL", str);
            return str;
        }
        aFd1rSDK.getCurrencyIso4217Code("CACHED_CHANNEL", null);
        throw null;
    }

    private final String getRevenue(String str) {
        int i = values + 63;
        AFInAppEventType = i % 128;
        int i2 = i % 2;
        AFd1pSDK aFd1pSDK = this.component1;
        if (i2 != 0) {
            aFd1pSDK.getRevenue(str);
            throw null;
        }
        String revenue = aFd1pSDK.getRevenue(str);
        AFInAppEventType = (values + 113) % 128;
        return revenue;
    }

    private void getRevenue(@NotNull Map<String, Object> map, @Nullable String str) {
        getCurrencyIso4217Code(new Object[]{this, map, str}, 1881859410, -1881859406, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        Object obj;
        map.getClass();
        Object string = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getString("appid");
        if (string != null) {
            map.put("appid", string);
        }
        String string2 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            AFInAppEventType = (values + 29) % 128;
            if (string2.length() != 3) {
                StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb.append(string2);
                sb.append("' is not a legal value.");
                AFLogger.afWarnLog(sb.toString());
            }
            map.put(FirebaseAnalytics.Param.CURRENCY, string2);
        }
        Object string3 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            map.put("isUpdate", string3);
            AFInAppEventType = (values + 11) % 128;
        }
        Object string4 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        }
        Object string5 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            map.put("appUserId", string5);
        }
        Object string6 = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        }
        AFd1uSDK aFd1uSDK = this.equals.getMonetizationNetwork;
        if (aFd1uSDK == null || (obj = aFd1uSDK.getCurrencyIso4217Code) == null) {
            return;
        }
        map.put("sharing_filter", obj);
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map, boolean z, @NotNull Function0<String> function0) {
        int i = AFInAppEventType + 107;
        values = i % 128;
        if (i % 2 != 0) {
            map.getClass();
            function0.getClass();
            getRevenue(map);
            getMonetizationNetwork(map);
            valueOf(map);
            getMediationNetwork(map, z);
            getCurrencyIso4217Code(map, function0);
            AFInAppEventType = (values + 45) % 128;
            return;
        }
        map.getClass();
        function0.getClass();
        getRevenue(map);
        getMonetizationNetwork(map);
        valueOf(map);
        getMediationNetwork(map, z);
        getCurrencyIso4217Code(map, function0);
        throw null;
    }

    private void getCurrencyIso4217Code(@NotNull Map<String, Object> map, boolean z) {
        values = (AFInAppEventType + 39) % 128;
        map.getClass();
        map.put("platformextension", this.hashCode.AFAdRevenueData());
        if (z) {
            AFInAppEventType = (values + 95) % 128;
            map.put("platform_extension_v2", this.AFAdRevenueData.getMonetizationNetwork());
        }
        AFInAppEventType = (values + 59) % 128;
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void getCurrencyIso4217Code(@NotNull AFa1mSDK aFa1mSDK) {
        AFInAppEventType = (values + 33) % 128;
        aFa1mSDK.getClass();
        Map<String, Object> revenue = aFa1mSDK.getRevenue();
        revenue.getClass();
        revenue.put("open_referrer", aFa1mSDK.getCurrencyIso4217Code);
        String str = aFa1mSDK.component1;
        if (str != null && !StringsKt.m93438e0(str)) {
            revenue.put("af_web_referrer", aFa1mSDK.component1);
        }
        int i = AFInAppEventType + 61;
        values = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFg1eSDK aFg1eSDK = (AFg1eSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        values = (AFInAppEventType + 103) % 128;
        map.getClass();
        if (str != null && str.length() != 0) {
            map.put("referrer", str);
        }
        String currencyIso4217Code = aFg1eSDK.component3.getCurrencyIso4217Code("extraReferrers", null);
        if (currencyIso4217Code != null) {
            map.put("extraReferrers", currencyIso4217Code);
        }
        String referrer = ((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{aFg1eSDK}, -1797995787, 1797995794, System.identityHashCode(aFg1eSDK))).getReferrer(aFg1eSDK.component3);
        if (referrer != null && referrer.length() != 0) {
            int i = AFInAppEventType + 73;
            values = i % 128;
            if (i % 2 == 0) {
                map.get("referrer");
                throw null;
            }
            if (map.get("referrer") == null) {
                int i2 = values + 41;
                AFInAppEventType = i2 % 128;
                if (i2 % 2 != 0) {
                    map.put("referrer", referrer);
                    throw null;
                }
                map.put("referrer", referrer);
            }
        }
        values = (AFInAppEventType + 77) % 128;
        return null;
    }

    private void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @NotNull Function0<String> function0) {
        int i = values + 123;
        AFInAppEventType = i % 128;
        if (i % 2 != 0) {
            map.getClass();
            function0.getClass();
            if (!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, false)) {
                return;
            }
        } else {
            map.getClass();
            function0.getClass();
            if (!((AppsFlyerProperties) getCurrencyIso4217Code(new Object[]{this}, -1797995787, 1797995794, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
                return;
            }
        }
        String str = null;
        try {
            this.getMonetizationNetwork.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
            String strInvoke = function0.invoke();
            AFInAppEventType = (values + 93) % 128;
            str = strInvoke;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("com.facebook.katana not found", e, true);
            AFLogger.afWarnLog("Exception while collecting facebook's attribution ID. ");
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting facebook's attribution ID. ", th);
        }
        if (str != null) {
            int i2 = values + 117;
            AFInAppEventType = i2 % 128;
            if (i2 % 2 != 0) {
                map.put("fb", str);
                int i3 = 12 / 0;
            } else {
                map.put("fb", str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (r7 != null) goto L11;
     */
    @android.annotation.SuppressLint({"PrivateApi"})
    @androidx.annotation.VisibleForTesting
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getCurrencyIso4217Code(@org.jetbrains.annotations.Nullable java.lang.String r7) {
        /*
            int r0 = com.appsflyer.internal.AFg1eSDK.AFInAppEventType
            int r0 = r0 + 47
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1eSDK.values = r1
            int r0 = r0 % 2
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r2 = "get"
            java.lang.String r3 = "android.os.SystemProperties"
            r4 = 0
            if (r0 != 0) goto L2e
            java.lang.Class r0 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L2c
            r6 = 1
            r5[r6] = r1     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r0 = r0.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2c
            r1[r6] = r7     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r0.invoke(r4, r4)     // Catch: java.lang.Throwable -> L2c
            if (r7 == 0) goto L4f
            goto L44
        L2c:
            r7 = move-exception
            goto L57
        L2e:
            java.lang.Class r0 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r0.invoke(r4, r7)     // Catch: java.lang.Throwable -> L2c
            if (r7 == 0) goto L4f
        L44:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L2c
            int r0 = com.appsflyer.internal.AFg1eSDK.values
            int r0 = r0 + 55
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1eSDK.AFInAppEventType = r0
            return r7
        L4f:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            throw r7     // Catch: java.lang.Throwable -> L2c
        L57:
            java.lang.String r0 = r7.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1eSDK.getCurrencyIso4217Code(java.lang.String):java.lang.String");
    }

    private static boolean getCurrencyIso4217Code(File file) {
        if (file != null) {
            int i = AFInAppEventType + 17;
            values = i % 128;
            if (i % 2 == 0) {
                file.exists();
                throw null;
            }
            if (file.exists()) {
                return false;
            }
        }
        values = (AFInAppEventType + 95) % 128;
        return true;
    }

    private static void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @NotNull AFa1mSDK aFa1mSDK) {
        map.getClass();
        aFa1mSDK.getClass();
        String str = aFa1mSDK.component4;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFa1mSDK.getMonetizationNetwork;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private static String getCurrencyIso4217Code(File file, String str) {
        return (String) getCurrencyIso4217Code(new Object[]{file, str}, -1411509274, 1411509275, (int) System.currentTimeMillis());
    }

    @Nullable
    private String getCurrencyIso4217Code() throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        return (String) getCurrencyIso4217Code(new Object[]{this}, -576090873, 576090879, System.identityHashCode(this));
    }
}
