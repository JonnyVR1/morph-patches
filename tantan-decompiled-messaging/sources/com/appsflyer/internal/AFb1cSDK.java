package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.Device;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tencent.connect.common.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import org.eclipse.jetty.http.HttpStatus;
import org.json.JSONObject;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1cSDK implements AFb1bSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char component2 = 0;
    private static char component3 = 0;
    private static char copy = 0;
    private static int equals = 0;
    private static final int getMediationNetwork;
    private static int hashCode = 1;
    private static char toString;
    private final AFd1fSDK component1;
    private List<String> getMonetizationNetwork = new ArrayList();
    private boolean AFAdRevenueData = true;

    @NonNull
    private final Map<String, Object> getCurrencyIso4217Code = new HashMap();
    private boolean component4 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getRevenue = 0;
    private boolean areAllFieldsValid = false;

    static {
        areAllFieldsValid();
        getMediationNetwork = 98166;
        int i = equals + 85;
        hashCode = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public AFb1cSDK(AFd1fSDK aFd1fSDK) {
        this.component1 = aFd1fSDK;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0058 A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x003e, B:13:0x0058, B:16:0x0066, B:21:0x007d, B:26:0x0099), top: B:33:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0066 A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x003e, B:13:0x0058, B:16:0x0066, B:21:0x007d, B:26:0x0099), top: B:33:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:24:0x008b A[Catch: all -> 0x00a6, TRY_ENTER, TryCatch #1 {all -> 0x00a6, blocks: (B:3:0x0001, B:6:0x0046, B:8:0x004c, B:14:0x0060, B:17:0x006e, B:19:0x0077, B:24:0x008b, B:25:0x0094), top: B:35:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0094 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #1 {all -> 0x00a6, blocks: (B:3:0x0001, B:6:0x0046, B:8:0x004c, B:14:0x0060, B:17:0x006e, B:19:0x0077, B:24:0x008b, B:25:0x0094), top: B:35:0x0001 }] */
    private synchronized void AFAdRevenueData(String str, String str2, String str3) {
        int i;
        Map<String, Object> map;
        try {
            Map<String, Object> map2 = this.getCurrencyIso4217Code;
            Object[] objArr = new Object[1];
            m5188a("婹璸牍氲썥頋", 5 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
            map2.put(((String) objArr[0]).intern(), Build.BRAND);
            this.getCurrencyIso4217Code.put("model", Build.MODEL);
            this.getCurrencyIso4217Code.put("platform", "Android");
            this.getCurrencyIso4217Code.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                hashCode = (equals + 29) % 128;
                if (str.length() > 0) {
                    this.getCurrencyIso4217Code.put("advertiserId", str);
                }
                if (str2 != null) {
                    hashCode = (equals + 43) % 128;
                    if (str2.length() > 0) {
                        hashCode = (equals + 63) % 128;
                        this.getCurrencyIso4217Code.put(Device.IMEI, str2);
                    }
                }
                if (str3 != null && str3.length() > 0) {
                    int i2 = equals + 111;
                    hashCode = i2 % 128;
                    i = i2 % 2;
                    map = this.getCurrencyIso4217Code;
                    if (i == 0) {
                        map.put("android_id", str3);
                        int i3 = 87 / 0;
                    } else {
                        map.put("android_id", str3);
                    }
                    hashCode = (equals + 7) % 128;
                }
            } else {
                if (str2 != null) {
                    hashCode = (equals + 43) % 128;
                    if (str2.length() > 0) {
                        hashCode = (equals + 63) % 128;
                        this.getCurrencyIso4217Code.put(Device.IMEI, str2);
                    }
                }
                if (str3 != null) {
                    int i4 = equals + 111;
                    hashCode = i4 % 128;
                    i = i4 % 2;
                    map = this.getCurrencyIso4217Code;
                    if (i == 0) {
                        map.put("android_id", str3);
                        int i5 = 87 / 0;
                    } else {
                        map.put("android_id", str3);
                    }
                    hashCode = (equals + 7) % 128;
                }
            }
            throw th;
        } catch (Throwable unused) {
        }
    }

    private boolean AFInAppEventType() {
        int i = equals + 71;
        hashCode = i % 128;
        int i2 = i % 2;
        boolean zAFAdRevenueData = this.component1.getRevenue().AFAdRevenueData("participantInProxy");
        if (i2 == 0) {
            int i3 = 32 / 0;
        }
        return zAFAdRevenueData;
    }

    /* JADX INFO: renamed from: a */
    private static void m5188a(String str, int i, Object[] objArr) {
        char[] charArray;
        $10 = ($11 + 101) % 128;
        if (str != null) {
            charArray = str.toCharArray();
            $11 = ($10 + 11) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        AFj1aSDK aFj1aSDK = new AFj1aSDK();
        char[] cArr2 = new char[cArr.length];
        aFj1aSDK.getCurrencyIso4217Code = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i2 = aFj1aSDK.getCurrencyIso4217Code;
            if (i2 >= cArr.length) {
                String str2 = new String(cArr2, 0, i);
                $10 = ($11 + 39) % 128;
                objArr[0] = str2;
                return;
            }
            cArr3[0] = cArr[i2];
            cArr3[1] = cArr[i2 + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                $10 = ($11 + 121) % 128;
                char c = cArr3[1];
                char c2 = cArr3[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (((long) toString) ^ (-4684633429643392075L))))) ^ ((c2 >>> 5) + ((char) (((long) copy) ^ (-4684633429643392075L))))));
                cArr3[1] = c3;
                cArr3[0] = (char) (c2 - (((c3 >>> 5) + ((char) (((long) component3) ^ (-4684633429643392075L)))) ^ ((c3 + i3) ^ ((c3 << 4) + ((char) (((long) component2) ^ (-4684633429643392075L)))))));
                i3 -= 40503;
            }
            int i5 = aFj1aSDK.getCurrencyIso4217Code;
            cArr2[i5] = cArr3[0];
            cArr2[i5 + 1] = cArr3[1];
            aFj1aSDK.getCurrencyIso4217Code = i5 + 2;
        }
    }

    public static void areAllFieldsValid() {
        component2 = (char) 44121;
        component3 = (char) 52727;
        toString = (char) 17099;
        copy = (char) 4398;
    }

    @VisibleForTesting
    private static String component1() {
        return (String) getMonetizationNetwork(new Object[0], -684716836, 684716838, (int) System.currentTimeMillis());
    }

    private synchronized void component3() {
        try {
            int i = equals + 83;
            hashCode = i % 128;
            int i2 = i % 2;
            boolean z = this.areAllFieldsValid;
            try {
                if (i2 == 0) {
                    throw null;
                }
                if (z) {
                    return;
                }
                this.areAllFieldsValid = true;
                try {
                    getMediationNetwork("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                    int i3 = equals + 19;
                    hashCode = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                } catch (Throwable th) {
                    AFLogger.INSTANCE.m5244e(AFg1cSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @VisibleForTesting
    private static float component4() {
        float fNextFloat = new Random().nextFloat();
        equals = (hashCode + 115) % 128;
        return fNextFloat;
    }

    @NonNull
    private synchronized Map<String, Object> copy() {
        Map<String, Object> map;
        try {
            int i = hashCode + 117;
            equals = i % 128;
            int i2 = i % 2;
            Map<String, Object> map2 = this.getCurrencyIso4217Code;
            if (i2 != 0) {
                map2.put("data", this.getMonetizationNetwork);
                equals();
                map = this.getCurrencyIso4217Code;
                int i3 = 12 / 0;
            } else {
                map2.put("data", this.getMonetizationNetwork);
                equals();
                map = this.getCurrencyIso4217Code;
            }
            equals = (hashCode + 99) % 128;
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    private boolean copydefault() {
        int i = (hashCode + 97) % 128;
        equals = i;
        if (!this.component4) {
            return false;
        }
        int i2 = (i + 105) % 128;
        hashCode = i2;
        if (!this.AFAdRevenueData && !this.areAllFieldsValid) {
            return false;
        }
        equals = (i2 + 109) % 128;
        return true;
    }

    private synchronized void equals() {
        this.getMonetizationNetwork = new ArrayList();
        this.getRevenue = 0;
        int i = equals + 89;
        hashCode = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFb1cSDK aFb1cSDK = (AFb1cSDK) objArr[0];
        String str = (String) objArr[1];
        PackageManager packageManager = (PackageManager) objArr[2];
        int i = hashCode + 41;
        equals = i % 128;
        try {
            if (i % 2 != 0) {
                aFb1cSDK.component1.getMonetizationNetwork().getMediationNetwork(aFb1cSDK.m5189n_(str, packageManager), aFb1cSDK.component1.AFKeystoreWrapper().component1);
                throw null;
            }
            final AFe1wSDK mediationNetwork = aFb1cSDK.component1.getMonetizationNetwork().getMediationNetwork(aFb1cSDK.m5189n_(str, packageManager), aFb1cSDK.component1.AFKeystoreWrapper().component1);
            if (mediationNetwork != null) {
                aFb1cSDK.component1.AFAdRevenueData().execute(new Runnable() { // from class: com.appsflyer.internal.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        mediationNetwork.getMonetizationNetwork();
                    }
                });
                return null;
            }
            AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
            int i2 = equals + 11;
            hashCode = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
            return null;
        }
    }

    private synchronized void getMediationNetwork(String str, String str2, String... strArr) {
        String string;
        int i = hashCode + 79;
        equals = i % 128;
        if (i % 2 != 0) {
            copydefault();
            throw null;
        }
        if (!copydefault() || this.getRevenue >= 98304) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strJoin = TextUtils.join(", ", strArr);
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(jCurrentTimeMillis);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(Thread.currentThread().getId());
                sb.append(" _/AppsFlyer_6.15.0 [");
                sb.append(str);
                sb.append("] ");
                sb.append(str2);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(strJoin);
                string = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jCurrentTimeMillis);
                sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb2.append(Thread.currentThread().getId());
                sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb2.append(str2);
                sb2.append("/AppsFlyer_6.15.0 ");
                sb2.append(strJoin);
                string = sb2.toString();
            }
            int length = this.getRevenue + (string.length() << 1);
            int i2 = getMediationNetwork;
            boolean z = false;
            if (length > i2) {
                string = string.substring(0, (i2 - this.getRevenue) / 2);
                z = true;
            }
            this.getMonetizationNetwork.add(string);
            this.getRevenue += string.length() << 1;
            if (z) {
                hashCode = (equals + 17) % 128;
                this.getMonetizationNetwork.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                this.getRevenue += CipherSuite.TLS_PSK_WITH_RC4_128_SHA;
            }
        } catch (Throwable unused) {
        }
    }

    private boolean getRevenue(String str) {
        int i = equals + 73;
        hashCode = i % 128;
        if (i % 2 == 0) {
            AFc1tSDK.getRevenue(str);
            throw null;
        }
        if (AFc1tSDK.getRevenue(str)) {
            hashCode = (equals + 13) % 128;
            return true;
        }
        Context context = this.component1.getMediationNetwork().AFAdRevenueData.getCurrencyIso4217Code;
        return str.equals(AFb1vSDK.getMonetizationNetwork(context, context.getPackageName()));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: n_ */
    private Map<String, Object> m5189n_(String str, PackageManager packageManager) {
        int i = equals + 99;
        hashCode = i % 128;
        int i2 = i % 2;
        AFd1fSDK aFd1fSDK = this.component1;
        if (i2 == 0) {
            m5190o_(str, packageManager, aFd1fSDK.AFKeystoreWrapper(), this.component1.mo5219e());
            copy();
            throw null;
        }
        m5190o_(str, packageManager, aFd1fSDK.AFKeystoreWrapper(), this.component1.mo5219e());
        Map<String, Object> mapCopy = copy();
        equals = (hashCode + 89) % 128;
        return mapCopy;
    }

    /* JADX INFO: renamed from: o_ */
    private synchronized void m5190o_(String str, PackageManager packageManager, AFg1rSDK aFg1rSDK, AFd1mSDK aFd1mSDK) {
        try {
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.getCurrencyIso4217Code.clear();
            if (string != null) {
                try {
                    this.getCurrencyIso4217Code.putAll(AFa1pSDK.AFAdRevenueData(new JSONObject(string)));
                } catch (Throwable unused) {
                }
            } else {
                AFb1tSDK monetizationNetwork = AFb1tSDK.getMonetizationNetwork();
                AFh1pSDK aFh1pSDK = AFb1tSDK.getMonetizationNetwork().getCurrencyIso4217Code().getMediationNetwork().getMonetizationNetwork.component4;
                String str2 = null;
                AFb1ySDK aFb1ySDK = aFh1pSDK != null ? new AFb1ySDK(aFh1pSDK.AFAdRevenueData, aFh1pSDK.component2) : null;
                if (aFb1ySDK != null) {
                    int i = equals + 41;
                    hashCode = i % 128;
                    if (i % 2 == 0) {
                        String str3 = aFb1ySDK.AFAdRevenueData;
                        throw null;
                    }
                    str2 = aFb1ySDK.AFAdRevenueData;
                    throw th;
                }
                AFAdRevenueData(str2, aFg1rSDK.areAllFieldsValid, aFd1mSDK.getRevenue);
                StringBuilder sb = new StringBuilder("6.15.0.");
                sb.append(AFb1tSDK.AFAdRevenueData);
                AFAdRevenueData(sb.toString(), monetizationNetwork.getCurrencyIso4217Code().AFKeystoreWrapper().component1, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString(Oauth2AccessToken.KEY_UID));
                try {
                    getCurrencyIso4217Code(str, String.valueOf(packageManager.getPackageInfo(str, 0).versionCode), appsFlyerProperties.getString("channel"), appsFlyerProperties.getString("preInstallName"));
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getCurrencyIso4217Code).toString());
            }
            this.getCurrencyIso4217Code.put("launch_counter", String.valueOf(this.component1.getMediationNetwork().getRevenue.getMonetizationNetwork("appsFlyerCount", 0)));
            int i2 = hashCode + 59;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 50 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void valueOf() {
        int i = equals + 69;
        hashCode = i % 128;
        int i2 = i % 2;
        AFd1fSDK aFd1fSDK = this.component1;
        if (i2 != 0) {
            aFd1fSDK.getRevenue().getRevenue("participantInProxy");
        } else {
            aFd1fSDK.getRevenue().getRevenue("participantInProxy");
            int i3 = 57 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean component2() {
        int i = hashCode;
        boolean z = this.areAllFieldsValid;
        equals = (i + 109) % 128;
        return z;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void getMonetizationNetwork() {
        equals = (hashCode + 15) % 128;
        if (this.areAllFieldsValid || this.AFAdRevenueData) {
            this.areAllFieldsValid = false;
            this.AFAdRevenueData = false;
            try {
                getMediationNetwork("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                equals = (hashCode + 1) % 128;
            } catch (Throwable th) {
                AFLogger.INSTANCE.m5244e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
            }
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    /* JADX INFO: renamed from: m_ */
    public final void mo5187m_(String str, PackageManager packageManager) {
        getMonetizationNetwork(new Object[]{this, str, packageManager}, -1393762281, 1393762281, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        int i = hashCode + 19;
        equals = i % 128;
        if (i % 2 == 0) {
            return "6.15.0";
        }
        throw null;
    }

    private boolean getRevenue(@NonNull AFi1zSDK aFi1zSDK, @Nullable AFi1zSDK aFi1zSDK2) {
        if (aFi1zSDK.equals(aFi1zSDK2)) {
            hashCode = (equals + 63) % 128;
            return AFInAppEventType();
        }
        boolean zAFAdRevenueData = AFAdRevenueData(aFi1zSDK.AFAdRevenueData);
        getMonetizationNetwork(new Object[]{this, Boolean.valueOf(zAFAdRevenueData)}, -719842222, 719842223, System.identityHashCode(this));
        hashCode = (equals + 57) % 128;
        return zAFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void getRevenue() {
        equals = (hashCode + 31) % 128;
        this.AFAdRevenueData = false;
        AFAdRevenueData();
        equals();
        hashCode = (equals + 19) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return r2.getMediationNetwork;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r2 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r2 != null) goto L10;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.appsflyer.internal.AFi1zSDK getRevenue(@androidx.annotation.Nullable com.appsflyer.internal.AFh1aSDK r2) {
        /*
            if (r2 == 0) goto L1e
            int r0 = com.appsflyer.internal.AFb1cSDK.hashCode
            int r0 = r0 + 125
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1cSDK.equals = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L17
            com.appsflyer.internal.AFh1bSDK r2 = r2.getMonetizationNetwork
            r0 = 93
            int r0 = r0 / 0
            if (r2 == 0) goto L1e
            goto L1b
        L17:
            com.appsflyer.internal.AFh1bSDK r2 = r2.getMonetizationNetwork
            if (r2 == 0) goto L1e
        L1b:
            com.appsflyer.internal.AFi1zSDK r2 = r2.getMediationNetwork
            return r2
        L1e:
            int r2 = com.appsflyer.internal.AFb1cSDK.equals
            int r2 = r2 + 25
            int r2 = r2 % 128
            com.appsflyer.internal.AFb1cSDK.hashCode = r2
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1cSDK.getRevenue(com.appsflyer.internal.AFh1aSDK):com.appsflyer.internal.AFi1zSDK");
    }

    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i * (-813)) + (i2 * HttpStatus.REQUEST_TIMEOUT_408);
        int i5 = ~i2;
        int i6 = ~(i5 | i);
        int i7 = ~(i | i3);
        int i8 = i4 + ((i6 | i7) * (-814));
        int i9 = ~(i5 | (~i3));
        int i10 = ~i;
        int i11 = ~(i10 | i2);
        int i12 = i8 + ((i9 | i11 | i7) * HttpStatus.PROXY_AUTHENTICATION_REQUIRED_407) + (((~(i10 | i3)) | i11 | (~(i2 | i3))) * HttpStatus.PROXY_AUTHENTICATION_REQUIRED_407);
        if (i12 == 1) {
            return getMonetizationNetwork(objArr);
        }
        if (i12 != 2) {
            return i12 != 3 ? getCurrencyIso4217Code(objArr) : getMediationNetwork(objArr);
        }
        return getRevenue(objArr);
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void getMonetizationNetwork(Throwable th) {
        StackTraceElement[] stackTrace;
        int i;
        equals = (hashCode + 21) % 128;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = cause == null ? th.getMessage() : cause.getMessage();
        if (cause == null) {
            equals = (hashCode + 91) % 128;
            stackTrace = th.getStackTrace();
            i = hashCode + 95;
        } else {
            stackTrace = cause.getStackTrace();
            i = hashCode + 69;
        }
        equals = i % 128;
        getMediationNetwork("exception", simpleName, getMonetizationNetwork(message, stackTrace));
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void getMonetizationNetwork(String str, int i, String str2) {
        hashCode = (equals + 47) % 128;
        getMediationNetwork("server_response", str, String.valueOf(i), str2);
        equals = (hashCode + 53) % 128;
    }

    private static String[] getMonetizationNetwork(String str, StackTraceElement[] stackTraceElementArr) {
        int i = equals;
        hashCode = (i + 109) % 128;
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        int i2 = 1;
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        hashCode = (i + 1) % 128;
        while (i2 < stackTraceElementArr.length) {
            strArr[i2] = stackTraceElementArr[i2].toString();
            i2++;
            equals = (hashCode + 19) % 128;
        }
        return strArr;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFb1cSDK aFb1cSDK = (AFb1cSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = equals + 63;
        hashCode = i % 128;
        if (i % 2 == 0) {
            aFb1cSDK.component1.getRevenue().AFAdRevenueData("participantInProxy", zBooleanValue);
            int i2 = 13 / 0;
            return null;
        }
        aFb1cSDK.component1.getRevenue().AFAdRevenueData("participantInProxy", zBooleanValue);
        return null;
    }

    private static boolean getMonetizationNetwork(String str) {
        return ((Boolean) getMonetizationNetwork(new Object[]{str}, -1428106122, 1428106125, (int) System.currentTimeMillis())).booleanValue();
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean getCurrencyIso4217Code() {
        int i = hashCode + 89;
        equals = i % 128;
        int i2 = i % 2;
        AFd1fSDK aFd1fSDK = this.component1;
        if (i2 == 0) {
            boolean currencyIso4217Code = getCurrencyIso4217Code(getRevenue(aFd1fSDK.component2().getRevenue.getCurrencyIso4217Code), getRevenue(this.component1.component2().getRevenue.AFAdRevenueData));
            if (currencyIso4217Code) {
                int i3 = hashCode + 71;
                equals = i3 % 128;
                if (i3 % 2 != 0) {
                    component3();
                    throw null;
                }
                component3();
            } else {
                getRevenue();
                getMonetizationNetwork();
            }
            equals = (hashCode + 107) % 128;
            return currencyIso4217Code;
        }
        getCurrencyIso4217Code(getRevenue(aFd1fSDK.component2().getRevenue.getCurrencyIso4217Code), getRevenue(this.component1.component2().getRevenue.AFAdRevenueData));
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void getCurrencyIso4217Code(String str, String str2) {
        int i = equals + 17;
        hashCode = i % 128;
        if (i % 2 == 0) {
            getMediationNetwork("server_request", str, str2);
        } else {
            getMediationNetwork("server_request", str, str2);
        }
        equals = (hashCode + 45) % 128;
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3, String str4) {
        int i = equals + 77;
        hashCode = i % 128;
        try {
            if (i % 2 != 0) {
                if (str != null && str.length() > 0) {
                    int i2 = equals + 109;
                    hashCode = i2 % 128;
                    int i3 = i2 % 2;
                    Map<String, Object> map = this.getCurrencyIso4217Code;
                    if (i3 == 0) {
                        map.put(Constants.JumpUrlConstants.URL_KEY_APPID, str);
                        throw null;
                    }
                    map.put(Constants.JumpUrlConstants.URL_KEY_APPID, str);
                }
                if (str2 != null) {
                    hashCode = (equals + 5) % 128;
                    if (str2.length() > 0) {
                        this.getCurrencyIso4217Code.put("app_version", str2);
                    }
                }
                if (str3 != null && str3.length() > 0) {
                    equals = (hashCode + 3) % 128;
                    this.getCurrencyIso4217Code.put("channel", str3);
                }
                if (str4 != null && str4.length() > 0) {
                    this.getCurrencyIso4217Code.put("preInstall", str4);
                }
            } else {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized boolean getCurrencyIso4217Code(@Nullable AFi1zSDK aFi1zSDK, @Nullable AFi1zSDK aFi1zSDK2) {
        try {
            if (aFi1zSDK == null) {
                hashCode = (equals + 7) % 128;
                valueOf();
                return false;
            }
            if (!aFi1zSDK.AFAdRevenueData()) {
                equals = (hashCode + 5) % 128;
                return false;
            }
            if (this.component1.getMediationNetwork().getRevenue.getMonetizationNetwork("appsFlyerCount", 0) > aFi1zSDK.getCurrencyIso4217Code) {
                return false;
            }
            hashCode = (equals + 7) % 128;
            if (!getRevenue(aFi1zSDK, aFi1zSDK2)) {
                equals = (hashCode + 7) % 128;
                return false;
            }
            if (!getRevenue(aFi1zSDK.getMonetizationNetwork)) {
                equals = (hashCode + 93) % 128;
                return false;
            }
            if (getMonetizationNetwork(aFi1zSDK.getMediationNetwork)) {
                return true;
            }
            hashCode = (equals + 121) % 128;
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void AFAdRevenueData() {
        try {
            int i = hashCode + 109;
            equals = i % 128;
            int i2 = i % 2;
            Map<String, Object> map = this.getCurrencyIso4217Code;
            if (i2 != 0) {
                map.clear();
                this.getMonetizationNetwork.clear();
                this.getRevenue = 1;
            } else {
                map.clear();
                this.getMonetizationNetwork.clear();
                this.getRevenue = 0;
            }
            int i3 = hashCode + 119;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void AFAdRevenueData(String str, String str2, String str3, String str4) {
        try {
            this.getCurrencyIso4217Code.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, str);
            if (str2 != null) {
                try {
                    hashCode = (equals + 33) % 128;
                    if (str2.length() > 0) {
                        this.getCurrencyIso4217Code.put("devkey", str2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (str3 != null && str3.length() > 0) {
                int i = hashCode + 53;
                equals = i % 128;
                int i2 = i % 2;
                Map<String, Object> map = this.getCurrencyIso4217Code;
                if (i2 != 0) {
                    map.put("originalAppsFlyerId", str3);
                    throw null;
                }
                map.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.getCurrencyIso4217Code.put(Oauth2AccessToken.KEY_UID, str4);
                equals = (hashCode + 125) % 128;
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean AFAdRevenueData(float f) {
        double d = f;
        if (d >= 1.0d) {
            equals = (hashCode + 107) % 128;
            return true;
        }
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return component4() <= f;
        }
        int i = hashCode + 97;
        equals = i % 128;
        return i % 2 != 0;
    }

    private void AFAdRevenueData(boolean z) {
        getMonetizationNetwork(new Object[]{this, Boolean.valueOf(z)}, -719842222, 719842223, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void getMediationNetwork(String str, String str2) {
        int i = hashCode + 3;
        equals = i % 128;
        if (i % 2 == 0) {
            getMediationNetwork(null, str, str2);
            return;
        }
        String[] strArr = new String[0];
        strArr[0] = str2;
        getMediationNetwork(null, str, strArr);
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void getMediationNetwork() {
        int i = equals + 31;
        int i2 = i % 128;
        hashCode = i2;
        this.component4 = i % 2 == 0;
        int i3 = i2 + 43;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void getMediationNetwork(String str, String... strArr) {
        equals = (hashCode + 53) % 128;
        getMediationNetwork("public_api_call", str, strArr);
        equals = (hashCode + 69) % 128;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        String str = (String) objArr[0];
        if (AFc1tSDK.getRevenue(str)) {
            int i = hashCode + 99;
            equals = i % 128;
            return i % 2 != 0 ? Boolean.FALSE : Boolean.TRUE;
        }
        new AFe1zSDK();
        boolean currencyIso4217Code = AFe1zSDK.getCurrencyIso4217Code((String) getMonetizationNetwork(new Object[0], -684716836, 684716838, (int) System.currentTimeMillis()), str);
        int i2 = equals + 9;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return Boolean.valueOf(currencyIso4217Code);
        }
        throw null;
    }
}
