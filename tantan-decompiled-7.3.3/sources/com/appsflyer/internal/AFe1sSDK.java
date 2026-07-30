package com.appsflyer.internal;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.ConnectionResult;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.User;
import com.tencent.connect.common.Constants;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1sSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    public static String AFAdRevenueData = null;
    private static int areAllFieldsValid = 0;
    private static int component1 = 0;
    private static int component2 = 1;

    @VisibleForTesting
    private static String getMonetizationNetwork;
    private final AFe1fSDK component4;
    private final AppsFlyerProperties getCurrencyIso4217Code;
    private final AFd1pSDK getMediationNetwork;
    private final AFe1tSDK getRevenue;

    static {
        getMonetizationNetwork();
        AFAdRevenueData = "https://%sgcdsdk.%s/install_data/v5.0/";
        getMonetizationNetwork = "https://%sonelink.%s/shortlink-sdk/v2";
        int i = component2 + 21;
        areAllFieldsValid = i % 128;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
    }

    public AFe1sSDK(AFe1tSDK aFe1tSDK, AFd1pSDK aFd1pSDK, AppsFlyerProperties appsFlyerProperties, AFe1fSDK aFe1fSDK) {
        this.getRevenue = aFe1tSDK;
        this.getMediationNetwork = aFd1pSDK;
        this.getCurrencyIso4217Code = appsFlyerProperties;
        this.component4 = aFe1fSDK;
    }

    /* JADX INFO: renamed from: a */
    private static void m5240a(int i, String str, int i2, boolean z, int i3, Object[] objArr) {
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1ySDK aFk1ySDK = new AFk1ySDK();
        char[] cArr2 = new char[i];
        aFk1ySDK.AFAdRevenueData = 0;
        while (true) {
            int i4 = aFk1ySDK.AFAdRevenueData;
            if (i4 >= i) {
                break;
            }
            $11 = ($10 + 93) % 128;
            char c = cArr[i4];
            aFk1ySDK.getRevenue = c;
            char c2 = (char) (c + i3);
            cArr2[i4] = c2;
            cArr2[i4] = (char) (c2 - ((int) (((long) component1) ^ (-1352391636899190530L))));
            aFk1ySDK.AFAdRevenueData = i4 + 1;
        }
        if (i2 > 0) {
            $11 = ($10 + 7) % 128;
            aFk1ySDK.getMediationNetwork = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            int i5 = aFk1ySDK.getMediationNetwork;
            System.arraycopy(cArr3, 0, cArr2, i - i5, i5);
            int i6 = aFk1ySDK.getMediationNetwork;
            System.arraycopy(cArr3, i6, cArr2, 0, i - i6);
        }
        if (z) {
            $11 = ($10 + 23) % 128;
            char[] cArr4 = new char[i];
            aFk1ySDK.AFAdRevenueData = 0;
            while (true) {
                int i7 = aFk1ySDK.AFAdRevenueData;
                if (i7 >= i) {
                    break;
                }
                cArr4[i7] = cArr2[(i - i7) - 1];
                aFk1ySDK.AFAdRevenueData = i7 + 1;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = (~i) | (~i3);
        int i5 = (i * (-518)) + (i2 * (-518)) + (((~i4) | i2) * 519) + (((~(i4 | i2)) | (~(i | i2 | i3))) * (-519)) + ((i | (~(i2 | i3))) * 519);
        if (i5 == 1) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i5 == 2) {
            return getRevenue(objArr);
        }
        AFe1sSDK aFe1sSDK = (AFe1sSDK) objArr[0];
        String str = (String) objArr[1];
        Map map = (Map) objArr[2];
        String str2 = (String) objArr[3];
        UUID uuid = (UUID) objArr[4];
        String str3 = (String) objArr[5];
        String string = uuid.toString();
        HashMap map2 = new HashMap();
        map2.put("ttl", User.ID_TEAM_ACCOUNT);
        map2.put("uuid", string);
        map2.put("data", map);
        map2.put("meta", aFe1sSDK.getRevenue());
        if (str2 != null) {
            component2 = (areAllFieldsValid + 7) % 128;
            map2.put("brand_domain", str2);
        }
        String string2 = AFa1pSDK.getRevenue((Map<String, ?>) map2).toString();
        HashMap map3 = new HashMap();
        Object[] objArr2 = new Object[1];
        m5240a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, "\ufff3ￍ\u0006￡\u0005\u0012\u0015\u0014\u0001\u000e\u0007\t", MotionEvent.axisFromString("") + 5, true, TextUtils.indexOf("", "", 0, 0) + 230, objArr2);
        map3.put(((String) objArr2[0]).intern(), (String) getMediationNetwork(new Object[]{str3, string, new String[]{"POST", string2}}, 1194027912, -1194027910, (int) System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getMonetizationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getMonetizationNetwork().getHostName()));
        sb.append("/");
        sb.append(str);
        AFe1rSDK currencyIso4217Code = aFe1sSDK.getCurrencyIso4217Code(new AFe1jSDK(sb.toString(), string2.getBytes(Charset.defaultCharset()), "POST", map3, false), (AFe1gSDK) new AFe1lSDK(), true);
        component2 = (areAllFieldsValid + 93) % 128;
        return currencyIso4217Code;
    }

    @VisibleForTesting
    private Map<String, Object> getRevenue() {
        HashMap map = new HashMap();
        map.put("build_number", "6.15.0");
        map.put(Counter.TYPE, Integer.valueOf(this.getMediationNetwork.getRevenue.getMonetizationNetwork("appsFlyerCount", 0)));
        map.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        m5240a((ViewConfiguration.getScrollBarSize() >> 8) + 5, "\ufffb\u000b\ufffa\u0007�", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 5, false, (KeyEvent.getMaxKeyCode() >> 16) + 237, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.getMediationNetwork.AFAdRevenueData.getCurrencyIso4217Code;
        map.put("app_version_name", AFb1vSDK.getMonetizationNetwork(context, context.getPackageName()));
        map.put(Constants.JumpUrlConstants.URL_KEY_APPID, this.getMediationNetwork.AFAdRevenueData.getCurrencyIso4217Code.getPackageName());
        map.put("platformextension", new AFb1aSDK().AFAdRevenueData());
        int i = component2 + 45;
        areAllFieldsValid = i % 128;
        if (i % 2 != 0) {
            int i2 = 23 / 0;
        }
        return map;
    }

    public final AFe1rSDK<String> AFAdRevenueData(@NonNull String str) {
        AFe1jSDK aFe1jSDK = new AFe1jSDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFe1jSDK.component1 = 10000;
        aFe1jSDK.getCurrencyIso4217Code = false;
        AFe1rSDK<String> revenue = getRevenue(aFe1jSDK, new AFe1lSDK());
        areAllFieldsValid = (component2 + 57) % 128;
        return revenue;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008f  */
    @Nullable
    public final AFe1rSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str, @Nullable String str2) throws Throwable {
        String strAFAdRevenueData;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1tSDK.AFLogger;
            Object method = map2.get(744390222);
            if (method == null) {
                method = ((Class) AFa1tSDK.getCurrencyIso4217Code((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 72, 33 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("getRevenue", Map.class, String.class);
                map2.put(744390222, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            AFj1mSDK aFj1mSDK = new AFj1mSDK(this.getMediationNetwork);
            if (str2 == null || str2.length() == 0) {
                areAllFieldsValid = (component2 + 103) % 128;
                strAFAdRevenueData = aFj1mSDK.getMonetizationNetwork.AFAdRevenueData("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
            } else {
                component2 = (areAllFieldsValid + 49) % 128;
                if (new Regex("4.?(\\d+)?.?(\\d+)").matches(str2) || new Regex("3.?(\\d+)?.?(\\d+)").matches(str2)) {
                    areAllFieldsValid = (component2 + 103) % 128;
                    strAFAdRevenueData = aFj1mSDK.getMonetizationNetwork.AFAdRevenueData("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
                } else {
                    strAFAdRevenueData = aFj1mSDK.getMonetizationNetwork.AFAdRevenueData("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strAFAdRevenueData);
            sb.append(aFj1mSDK.getRevenue.AFAdRevenueData.getCurrencyIso4217Code.getPackageName());
            return getRevenue(new AFe1jSDK(aFj1mSDK.getMediationNetwork(sb.toString()), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1lSDK());
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Exception e) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                return null;
            }
        }
    }

    @Nullable
    public final AFe1rSDK<String> getMonetizationNetwork(Map<String, Object> map, String str) {
        byte[] bArr;
        int i = component2 + 117;
        areAllFieldsValid = i % 128;
        try {
            if (i % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1tSDK.AFLogger;
                    Object method = map2.get(744390222);
                    if (method == null) {
                        method = ((Class) AFa1tSDK.getCurrencyIso4217Code(ExpandableListView.getPackedPositionType(0L) + 73, 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8))).getMethod("getRevenue", Map.class, String.class);
                        map2.put(744390222, method);
                    }
                    bArr = (byte[]) ((Method) method).invoke(null, objArr);
                    int i2 = 31 / 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                try {
                    Object[] objArr2 = {map, str};
                    Map map3 = AFa1tSDK.AFLogger;
                    Object method2 = map3.get(744390222);
                    if (method2 == null) {
                        method2 = ((Class) AFa1tSDK.getCurrencyIso4217Code(KeyEvent.getDeadChar(0, 0) + 73, 33 - (KeyEvent.getMaxKeyCode() >> 16), (char) View.combineMeasuredStates(0, 0))).getMethod("getRevenue", Map.class, String.class);
                        map3.put(744390222, method2);
                    }
                    bArr = (byte[]) ((Method) method2).invoke(null, objArr2);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            byte[] bArr2 = bArr;
            AFj1mSDK aFj1mSDK = new AFj1mSDK(this.getMediationNetwork);
            String strAFAdRevenueData = aFj1mSDK.getMonetizationNetwork.AFAdRevenueData("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=");
            StringBuilder sb = new StringBuilder();
            sb.append(strAFAdRevenueData);
            sb.append(aFj1mSDK.getRevenue.AFAdRevenueData.getCurrencyIso4217Code.getPackageName());
            AFe1rSDK<String> revenue = getRevenue(new AFe1jSDK(sb.toString(), bArr2, "POST", Collections.EMPTY_MAP, true), new AFe1lSDK());
            areAllFieldsValid = (component2 + 85) % 128;
            return revenue;
        } catch (Throwable th3) {
            AFLogger.INSTANCE.m5253e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed", th3, false, false);
            return null;
        }
    }

    private <T> AFe1rSDK<T> getRevenue(AFe1jSDK aFe1jSDK, AFe1gSDK<T> aFe1gSDK) {
        int i = areAllFieldsValid + 51;
        component2 = i % 128;
        if (i % 2 != 0) {
            return getCurrencyIso4217Code(aFe1jSDK, aFe1gSDK, getCurrencyIso4217Code());
        }
        getCurrencyIso4217Code(aFe1jSDK, aFe1gSDK, getCurrencyIso4217Code());
        throw null;
    }

    public final AFe1rSDK<Map<String, Object>> getRevenue(String str, String str2) {
        String packageName = this.getMediationNetwork.AFAdRevenueData.getCurrencyIso4217Code.getPackageName();
        AFd1pSDK aFd1pSDK = this.getMediationNetwork;
        AFe1rSDK<Map<String, Object>> revenue = getRevenue(AFe1qSDK.getMonetizationNetwork(packageName, AFb1lSDK.AFAdRevenueData(aFd1pSDK.AFAdRevenueData, aFd1pSDK.getRevenue), str, str2), new AFe1mSDK());
        int i = component2 + 73;
        areAllFieldsValid = i % 128;
        if (i % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        ArrayList arrayList = new ArrayList(Arrays.asList((String[]) objArr[2]));
        arrayList.add(1, "v2");
        String strJoin = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String mediationNetwork = AFb1iSDK.getMediationNetwork(strJoin, sb.toString());
        int i = areAllFieldsValid + 65;
        component2 = i % 128;
        if (i % 2 != 0) {
            return mediationNetwork;
        }
        throw null;
    }

    @Nullable
    public final AFe1rSDK<String> getCurrencyIso4217Code(AFa1mSDK aFa1mSDK, String str, AFd1kSDK aFd1kSDK) {
        byte[] bArr;
        int i = areAllFieldsValid + 23;
        component2 = i % 128;
        try {
            if (i % 2 != 0) {
                try {
                    Object[] objArr = {aFa1mSDK, str, aFd1kSDK};
                    Map map = AFa1tSDK.AFLogger;
                    Object method = map.get(-1040358563);
                    if (method == null) {
                        method = ((Class) AFa1tSDK.getCurrencyIso4217Code(72 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.lastIndexOf("", '0', 0) + 34, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))).getMethod("getCurrencyIso4217Code", AFa1mSDK.class, String.class, AFd1kSDK.class);
                        map.put(-1040358563, method);
                    }
                    bArr = (byte[]) ((Method) method).invoke(null, objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                try {
                    Object[] objArr2 = {aFa1mSDK, str, aFd1kSDK};
                    Map map2 = AFa1tSDK.AFLogger;
                    Object method2 = map2.get(-1040358563);
                    if (method2 == null) {
                        method2 = ((Class) AFa1tSDK.getCurrencyIso4217Code((ViewConfiguration.getTapTimeout() >> 16) + 73, 33 - TextUtils.getTrimmedLength(""), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("getCurrencyIso4217Code", AFa1mSDK.class, String.class, AFd1kSDK.class);
                        map2.put(-1040358563, method2);
                    }
                    bArr = (byte[]) ((Method) method2).invoke(null, objArr2);
                    int i2 = 21 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            return getRevenue(new AFe1jSDK(aFa1mSDK.component3, bArr, "POST", Collections.EMPTY_MAP, aFa1mSDK.getMonetizationNetwork()), new AFe1lSDK());
        } catch (Throwable th3) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", th3);
            return null;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFe1sSDK aFe1sSDK = (AFe1sSDK) objArr[0];
        AFh1lSDK aFh1lSDK = (AFh1lSDK) objArr[1];
        AFe1rSDK revenue = aFe1sSDK.getRevenue(new AFe1jSDK(aFh1lSDK.component3, aFh1lSDK.getMediationNetwork(), "POST", Collections.EMPTY_MAP, true), new AFe1lSDK());
        int i = areAllFieldsValid + 121;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 17 / 0;
        }
        return revenue;
    }

    private boolean getCurrencyIso4217Code() {
        int i = areAllFieldsValid + 67;
        component2 = i % 128;
        int i2 = i % 2;
        AppsFlyerProperties appsFlyerProperties = this.getCurrencyIso4217Code;
        if (i2 != 0 ? appsFlyerProperties.getBoolean(AppsFlyerProperties.HTTP_CACHE, true) : appsFlyerProperties.getBoolean(AppsFlyerProperties.HTTP_CACHE, false)) {
            int i3 = component2 + 37;
            areAllFieldsValid = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 77 / 0;
            }
            return false;
        }
        int i5 = areAllFieldsValid + 57;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return true;
    }

    private <T> AFe1rSDK<T> getCurrencyIso4217Code(AFe1jSDK aFe1jSDK, AFe1gSDK<T> aFe1gSDK, boolean z) {
        aFe1jSDK.AFAdRevenueData = z;
        AFe1tSDK aFe1tSDK = this.getRevenue;
        AFe1rSDK<T> aFe1rSDK = new AFe1rSDK<>(aFe1jSDK, aFe1tSDK.AFAdRevenueData, aFe1tSDK.getCurrencyIso4217Code, aFe1gSDK);
        component2 = (areAllFieldsValid + 115) % 128;
        return aFe1rSDK;
    }

    private static String getCurrencyIso4217Code(String str, String str2, String... strArr) {
        return (String) getMediationNetwork(new Object[]{str, str2, strArr}, 1194027912, -1194027910, (int) System.currentTimeMillis());
    }

    @NonNull
    public final AFe1rSDK<AFh1aSDK> getMonetizationNetwork(boolean z, boolean z2, @NonNull String str, int i) {
        String str2;
        int i2 = component2 + 29;
        areAllFieldsValid = i2 % 128;
        int i3 = i2 % 2;
        AFe1fSDK aFe1fSDK = this.component4;
        if (i3 == 0) {
            str.getClass();
            String str3 = z ? AFe1fSDK.getMonetizationNetwork : AFe1fSDK.AFAdRevenueData;
            String str4 = "";
            if (!z2) {
                str2 = "";
            } else {
                component2 = (areAllFieldsValid + 65) % 128;
                str2 = "stg";
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            if (AFe1fSDK.AFAdRevenueData()) {
                str4 = (String) aFe1fSDK.getRevenue.getValue();
            }
            AFe1jSDK aFe1jSDK = new AFe1jSDK(String.format(str3, Arrays.copyOf(new Object[]{str4, str2, aFe1fSDK.getMediationNetwork(), str}, 4)), "GET");
            aFe1jSDK.component1 = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            AFe1rSDK<AFh1aSDK> revenue = getRevenue(aFe1jSDK, new AFe1pSDK());
            component2 = (areAllFieldsValid + 61) % 128;
            return revenue;
        }
        str.getClass();
        throw null;
    }

    @NonNull
    public final AFe1rSDK<AFc1jSDK> getMonetizationNetwork(AFc1qSDK aFc1qSDK) {
        AFe1rSDK<AFc1jSDK> revenue = getRevenue(new AFe1jSDK(aFc1qSDK.component3, AFa1pSDK.getRevenue((Map<String, ?>) aFc1qSDK.getRevenue()).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFc1qSDK.getMonetizationNetwork()), new AFc1pSDK());
        int i = component2 + 123;
        areAllFieldsValid = i % 128;
        if (i % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    public static void getMonetizationNetwork() {
        component1 = -1251334024;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009a  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b2  */
    @Nullable
    public final AFe1rSDK<String> getMediationNetwork(Map<String, Object> map, String str, @Nullable String str2) throws Throwable {
        int i;
        AFj1lSDK aFj1lSDK;
        String strAFAdRevenueData;
        component2 = (areAllFieldsValid + 39) % 128;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1tSDK.AFLogger;
            Object method = map2.get(744390222);
            if (method == null) {
                method = ((Class) AFa1tSDK.getCurrencyIso4217Code((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 73, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1))).getMethod("getRevenue", Map.class, String.class);
                map2.put(744390222, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            AFj1mSDK aFj1mSDK = new AFj1mSDK(this.getMediationNetwork);
            if (str2 != null) {
                areAllFieldsValid = (component2 + 109) % 128;
                if (str2.length() != 0 && !new Regex("4.?(\\d+)?.?(\\d+)").matches(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").matches(str2)) {
                    strAFAdRevenueData = aFj1mSDK.getMonetizationNetwork.AFAdRevenueData("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                } else {
                    int i2 = component2 + 7;
                    areAllFieldsValid = i2 % 128;
                    i = i2 % 2;
                    aFj1lSDK = aFj1mSDK.getMonetizationNetwork;
                    if (i != 0) {
                        String strAFAdRevenueData2 = aFj1lSDK.AFAdRevenueData("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                        int i3 = 9 / 0;
                        strAFAdRevenueData = strAFAdRevenueData2;
                    } else {
                        strAFAdRevenueData = aFj1lSDK.AFAdRevenueData("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                    }
                }
            } else {
                int i4 = component2 + 7;
                areAllFieldsValid = i4 % 128;
                i = i4 % 2;
                aFj1lSDK = aFj1mSDK.getMonetizationNetwork;
                if (i != 0) {
                    String strAFAdRevenueData3 = aFj1lSDK.AFAdRevenueData("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                    int i5 = 9 / 0;
                    strAFAdRevenueData = strAFAdRevenueData3;
                } else {
                    strAFAdRevenueData = aFj1lSDK.AFAdRevenueData("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strAFAdRevenueData);
            sb.append(aFj1mSDK.getRevenue.AFAdRevenueData.getCurrencyIso4217Code.getPackageName());
            return getRevenue(new AFe1jSDK(aFj1mSDK.getMediationNetwork(sb.toString()), bArr, "POST", Collections.EMPTY_MAP, true), new AFe1lSDK());
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Exception e) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                return null;
            }
        }
    }

    public final AFe1rSDK<Map<String, String>> getMediationNetwork(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String string = uuid.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(getMonetizationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getMonetizationNetwork().getHostName()));
        sb.append("/");
        sb.append(str);
        sb.append("?id=");
        sb.append(str2);
        String string2 = sb.toString();
        Map<String, Object> revenue = getRevenue();
        String strValueOf = String.valueOf(revenue.get("build_number"));
        HashMap map = new HashMap();
        map.put("Af-UUID", uuid.toString());
        map.put("Af-Meta-Sdk-Ver", strValueOf);
        map.put("Af-Meta-Counter", String.valueOf(revenue.get(Counter.TYPE)));
        map.put("Af-Meta-Model", String.valueOf(revenue.get("model")));
        map.put("Af-Meta-Platform", String.valueOf(revenue.get("platformextension")));
        map.put("Af-Meta-System-Version", String.valueOf(revenue.get("sdk")));
        Object[] objArr = new Object[1];
        m5240a(12 - Drawable.resolveOpacity(0, 0), "\ufff3ￍ\u0006￡\u0005\u0012\u0015\u0014\u0001\u000e\u0007\t", 3 - TextUtils.lastIndexOf("", '0'), true, (ViewConfiguration.getPressedStateDuration() >> 16) + 230, objArr);
        map.put(((String) objArr[0]).intern(), (String) getMediationNetwork(new Object[]{str3, string, new String[]{"GET", string, str, str2, strValueOf}}, 1194027912, -1194027910, (int) System.currentTimeMillis()));
        AFe1rSDK<Map<String, String>> revenue2 = getRevenue(new AFe1jSDK(string2, null, "GET", map, false), new AFe1hSDK());
        int i = areAllFieldsValid + 15;
        component2 = i % 128;
        if (i % 2 != 0) {
            return revenue2;
        }
        throw null;
    }

    @Nullable
    public final AFe1wSDK getMediationNetwork(Map<String, Object> map, String str) throws Throwable {
        try {
            try {
                Object[] objArr = {map, str};
                Map map2 = AFa1tSDK.AFLogger;
                Object method = map2.get(744390222);
                if (method == null) {
                    method = ((Class) AFa1tSDK.getCurrencyIso4217Code(View.resolveSize(0, 0) + 73, 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("getRevenue", Map.class, String.class);
                    map2.put(744390222, method);
                }
                byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
                if (bArr != null) {
                    areAllFieldsValid = (component2 + 25) % 128;
                    return new AFe1wSDK(this.getMediationNetwork, bArr);
                }
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: failed to create bytes", new IllegalArgumentException("failed to create bytes from proxyData"));
                component2 = (areAllFieldsValid + 13) % 128;
                return null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
            return null;
        }
    }

    public final AFe1rSDK<String> getMediationNetwork(@NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @NonNull UUID uuid, @NonNull String str3) {
        return (AFe1rSDK) getMediationNetwork(new Object[]{this, str, map, str2, uuid, str3}, -670735838, 670735838, System.identityHashCode(this));
    }

    public final AFe1rSDK<String> getMediationNetwork(AFh1lSDK aFh1lSDK) {
        return (AFe1rSDK) getMediationNetwork(new Object[]{this, aFh1lSDK}, -527989819, 527989820, System.identityHashCode(this));
    }
}
