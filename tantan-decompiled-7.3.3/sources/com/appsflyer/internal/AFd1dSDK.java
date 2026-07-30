package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Build;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.google.android.exoplayer2.PlaybackException;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tencent.connect.common.Constants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1dSDK implements AFd1bSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long copydefault = -4232289787541845876L;
    private static int equals = 1;
    private static int hashCode;

    @NotNull
    private final Lazy AFAdRevenueData;

    @NotNull
    private final Lazy areAllFieldsValid;

    @Nullable
    private AFd1bSDK.AFa1ySDK component1;

    @NotNull
    private final String component2;

    @NotNull
    private final Lazy component3;

    @NotNull
    private final Lazy component4;

    @NotNull
    private AFd1fSDK getCurrencyIso4217Code;

    @NotNull
    private final Lazy getMediationNetwork;

    @NotNull
    private final Lazy getMonetizationNetwork;

    @NotNull
    private final Lazy getRevenue;

    public AFd1dSDK(@NotNull AFd1fSDK aFd1fSDK) {
        aFd1fSDK.getClass();
        this.getCurrencyIso4217Code = aFd1fSDK;
        this.getMonetizationNetwork = LazyKt__LazyJVMKt.m88118b(new Function0<AFg1wSDK>() { // from class: com.appsflyer.internal.AFd1dSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFg1wSDK invoke() {
                AFg1wSDK aFg1wSDKComponent2 = AFd1dSDK.getMediationNetwork(AFd1dSDK.this).component2();
                aFg1wSDKComponent2.getClass();
                return aFg1wSDKComponent2;
            }
        });
        this.getMediationNetwork = LazyKt__LazyJVMKt.m88118b(new Function0<AFd1pSDK>() { // from class: com.appsflyer.internal.AFd1dSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AFd1pSDK invoke() {
                AFd1pSDK mediationNetwork = AFd1dSDK.getMediationNetwork(AFd1dSDK.this).getMediationNetwork();
                mediationNetwork.getClass();
                return mediationNetwork;
            }
        });
        this.AFAdRevenueData = LazyKt__LazyJVMKt.m88118b(new Function0<AFd1rSDK>() { // from class: com.appsflyer.internal.AFd1dSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFd1rSDK invoke() {
                AFd1rSDK revenue = AFd1dSDK.getMediationNetwork(AFd1dSDK.this).getRevenue();
                revenue.getClass();
                return revenue;
            }
        });
        this.getRevenue = LazyKt__LazyJVMKt.m88118b(new Function0<AFg1rSDK>() { // from class: com.appsflyer.internal.AFd1dSDK.10
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFg1rSDK invoke() {
                AFg1rSDK aFg1rSDKAFKeystoreWrapper = AFd1dSDK.getMediationNetwork(AFd1dSDK.this).AFKeystoreWrapper();
                aFg1rSDKAFKeystoreWrapper.getClass();
                return aFg1rSDKAFKeystoreWrapper;
            }
        });
        this.component3 = LazyKt__LazyJVMKt.m88118b(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFd1dSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService executorServiceAFAdRevenueData = AFd1dSDK.getMediationNetwork(AFd1dSDK.this).AFAdRevenueData();
                executorServiceAFAdRevenueData.getClass();
                return executorServiceAFAdRevenueData;
            }
        });
        this.component2 = "6.15.0";
        this.areAllFieldsValid = LazyKt__LazyJVMKt.m88118b(new Function0<AFd1jSDK>() { // from class: com.appsflyer.internal.AFd1dSDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFd1jSDK invoke() {
                AFd1kSDK aFd1kSDKValueOf = AFd1dSDK.getMediationNetwork(AFd1dSDK.this).valueOf();
                aFd1kSDKValueOf.getClass();
                return new AFd1jSDK(aFd1kSDKValueOf);
            }
        });
        this.component4 = LazyKt__LazyJVMKt.m88118b(new Function0<AFd1eSDK>() { // from class: com.appsflyer.internal.AFd1dSDK.6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AFd1eSDK invoke() {
                return new AFd1eSDK(AFd1dSDK.this.AFAdRevenueData());
            }
        });
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFd1dSDK aFd1dSDK = (AFd1dSDK) objArr[0];
        AFh1fSDK aFh1fSDK = (AFh1fSDK) objArr[1];
        Object[] objArr2 = new Object[1];
        m5224a("\ue4bc뵣\u0efb\ue4de\uf4b6괿鷔熤쉄", 1 - Color.red(0), objArr2);
        Pair pairM88129a = TuplesKt.m88129a(((String) objArr2[0]).intern(), Build.BRAND);
        Pair pairM88129a2 = TuplesKt.m88129a("model", Build.MODEL);
        Pair pairM88129a3 = TuplesKt.m88129a(Constants.JumpUrlConstants.URL_KEY_APPID, aFd1dSDK.getRevenue().AFAdRevenueData.getCurrencyIso4217Code.getPackageName());
        Pair pairM88129a4 = TuplesKt.m88129a("p_ex", new AFb1aSDK().AFAdRevenueData());
        Pair pairM88129a5 = TuplesKt.m88129a("api", String.valueOf(Build.VERSION.SDK_INT));
        Pair pairM88129a6 = TuplesKt.m88129a("sdk", aFd1dSDK.component2);
        AFd1pSDK revenue = aFd1dSDK.getRevenue();
        Map mapMapOf = MapsKt.mapOf(pairM88129a, pairM88129a2, pairM88129a3, pairM88129a4, pairM88129a5, pairM88129a6, TuplesKt.m88129a(Oauth2AccessToken.KEY_UID, AFb1lSDK.AFAdRevenueData(revenue.AFAdRevenueData, revenue.getRevenue)), TuplesKt.m88129a("exc_config", aFh1fSDK.getCurrencyIso4217Code()));
        int i = equals + 15;
        hashCode = i % 128;
        if (i % 2 == 0) {
            return mapMapOf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: a */
    private static void m5224a(String str, int i, Object[] objArr) {
        Object charArray = str;
        if (str != null) {
            $10 = ($11 + 63) % 128;
            charArray = str.toCharArray();
        }
        AFk1tSDK aFk1tSDK = new AFk1tSDK();
        char[] currencyIso4217Code = AFk1tSDK.getCurrencyIso4217Code(copydefault ^ (-4831753853641670357L), (char[]) charArray, i);
        aFk1tSDK.AFAdRevenueData = 4;
        while (true) {
            int i2 = aFk1tSDK.AFAdRevenueData;
            if (i2 >= currencyIso4217Code.length) {
                objArr[0] = new String(currencyIso4217Code, 4, currencyIso4217Code.length - 4);
                return;
            }
            $10 = ($11 + 33) % 128;
            int i3 = i2 - 4;
            aFk1tSDK.getCurrencyIso4217Code = i3;
            currencyIso4217Code[i2] = (char) (((long) (currencyIso4217Code[i2] ^ currencyIso4217Code[i2 % 4])) ^ (((long) i3) * (copydefault ^ (-4831753853641670357L))));
            aFk1tSDK.AFAdRevenueData = i2 + 1;
        }
    }

    private final ExecutorService areAllFieldsValid() {
        int i = hashCode + 61;
        equals = i % 128;
        int i2 = i % 2;
        ExecutorService executorService = (ExecutorService) this.component3.getValue();
        if (i2 != 0) {
            return executorService;
        }
        throw null;
    }

    @NotNull
    private AFd1aSDK component1() {
        int i = equals + 9;
        hashCode = i % 128;
        int i2 = i % 2;
        AFd1aSDK aFd1aSDK = (AFd1aSDK) this.component4.getValue();
        if (i2 == 0) {
            return aFd1aSDK;
        }
        throw null;
    }

    private final AFd1rSDK component2() {
        int i = equals + 103;
        hashCode = i % 128;
        int i2 = i % 2;
        AFd1rSDK aFd1rSDK = (AFd1rSDK) this.AFAdRevenueData.getValue();
        if (i2 != 0) {
            int i3 = 63 / 0;
        }
        int i4 = equals + 121;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return aFd1rSDK;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r2
      0x0021: PHI (r2v4 com.appsflyer.internal.AFh1aSDK) = (r2v3 com.appsflyer.internal.AFh1aSDK), (r2v12 com.appsflyer.internal.AFh1aSDK) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    private final AFh1fSDK component3() {
        AFh1aSDK aFh1aSDK;
        AFh1bSDK aFh1bSDK;
        int i = hashCode + 41;
        equals = i % 128;
        int i2 = i % 2;
        AFg1wSDK mediationNetwork = getMediationNetwork();
        if (i2 == 0) {
            aFh1aSDK = mediationNetwork.getRevenue.getCurrencyIso4217Code;
            int i3 = 70 / 0;
            if (aFh1aSDK != null) {
                aFh1bSDK = aFh1aSDK.getMonetizationNetwork;
                if (aFh1bSDK != null) {
                    return aFh1bSDK.getCurrencyIso4217Code;
                }
            }
        } else {
            aFh1aSDK = mediationNetwork.getRevenue.getCurrencyIso4217Code;
            if (aFh1aSDK != null) {
                aFh1bSDK = aFh1aSDK.getMonetizationNetwork;
                if (aFh1bSDK != null) {
                    return aFh1bSDK.getCurrencyIso4217Code;
                }
            }
        }
        equals = (hashCode + 79) % 128;
        return null;
    }

    private final AFg1rSDK component4() {
        hashCode = (equals + 99) % 128;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) this.getRevenue.getValue();
        hashCode = (equals + 61) % 128;
        return aFg1rSDK;
    }

    private final void copy() {
        AFh1fSDK aFh1fSDKComponent3 = component3();
        if (aFh1fSDKComponent3 == null) {
            hashCode = (equals + 97) % 128;
            return;
        }
        if (!getRevenue(aFh1fSDKComponent3)) {
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
            equals = (hashCode + 41) % 128;
            return;
        }
        String str = component4().component1;
        if (str != null) {
            String string = new JSONObject(getMonetizationNetwork((Map) getCurrencyIso4217Code(new Object[]{this, aFh1fSDKComponent3}, 685429613, -685429613, System.identityHashCode(this)), AFAdRevenueData().getRevenue())).toString();
            string.getClass();
            getCurrencyIso4217Code(new Object[]{this, string, str}, 570911366, -570911364, System.identityHashCode(this));
            equals = (hashCode + 53) % 128;
        }
    }

    private final synchronized void copydefault() {
        boolean currencyIso4217Code;
        try {
            AFh1fSDK aFh1fSDKComponent3 = component3();
            if (aFh1fSDKComponent3 != null) {
                if (aFh1fSDKComponent3.getMonetizationNetwork == -1) {
                    component2().getRevenue("af_send_exc_to_server_window");
                } else if (component2().AFAdRevenueData("af_send_exc_to_server_window", -1L) == -1) {
                    AFAdRevenueData(aFh1fSDKComponent3);
                }
                currencyIso4217Code = getCurrencyIso4217Code(aFh1fSDKComponent3);
            } else {
                hashCode = (equals + 33) % 128;
                currencyIso4217Code = false;
            }
            AFd1bSDK.AFa1ySDK aFa1ySDK = this.component1;
            if (aFa1ySDK != null) {
                equals = (hashCode + 41) % 128;
                aFa1ySDK.onConfigurationChanged(currencyIso4217Code);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ed A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5 A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0101 A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0106  */
    /* JADX WARN: Code duplicated, block: B:65:0x010d A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0119 A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x012a A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x013b A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0161 A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x016c A[Catch: all -> 0x000a, TRY_LEAVE, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x018d A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a9 A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01ba A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ce A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d4 A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01df A[Catch: all -> 0x000a, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01e4 A[Catch: all -> 0x000a, TRY_LEAVE, TryCatch #0 {all -> 0x000a, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0038, B:16:0x0041, B:18:0x004d, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x0072, B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x008e, B:39:0x009c, B:41:0x00a2, B:43:0x00a8, B:45:0x00be, B:47:0x00cc, B:49:0x00d2, B:51:0x00e0, B:53:0x00e6, B:55:0x00e9, B:57:0x00ef, B:59:0x00f5, B:61:0x0101, B:63:0x0107, B:65:0x010d, B:67:0x0119, B:74:0x012a, B:89:0x01ca, B:91:0x01ce, B:93:0x01d4, B:95:0x01df, B:96:0x01e4, B:98:0x01e8, B:76:0x013b, B:78:0x0161, B:80:0x016c, B:85:0x018c, B:86:0x018d, B:87:0x01a9, B:71:0x0122, B:44:0x00b5, B:21:0x0054, B:88:0x01ba, B:97:0x01e7, B:82:0x0189), top: B:105:0x0001, inners: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x01ed, please report this as an issue */
    private final synchronized void equals() {
        AFd1bSDK.AFa1ySDK aFa1ySDK;
        AFh1fSDK aFh1fSDKComponent3;
        int i;
        AFh1fSDK aFh1fSDKComponent4;
        Integer numValueOf;
        AFh1fSDK aFh1fSDKComponent5;
        Pair<Integer, Integer> pairAFAdRevenueData;
        AFh1fSDK aFh1fSDKComponent6;
        Pair<Integer, Integer> revenue;
        int i2;
        String str;
        String str2;
        String str3;
        int i3;
        int iIntValue;
        int iIntValue2;
        String value;
        String value2;
        Integer intOrNull;
        String value3;
        Integer intOrNull2;
        try {
            AFh1fSDK aFh1fSDKComponent7 = component3();
            if ((aFh1fSDKComponent7 != null ? aFh1fSDKComponent7.getRevenue : -1L) < System.currentTimeMillis() / 1000) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                component2().getRevenue("af_send_exc_to_server_window");
                AFAdRevenueData().getMonetizationNetwork();
                return;
            }
            AFh1fSDK aFh1fSDKComponent8 = component3();
            boolean currencyIso4217Code = false;
            if (aFh1fSDKComponent8 == null) {
                component2().getRevenue("af_send_exc_to_server_window");
                AFAdRevenueData().getMonetizationNetwork();
                aFa1ySDK = this.component1;
                if (aFa1ySDK != null) {
                    aFh1fSDKComponent3 = component3();
                    if (aFh1fSDKComponent3 != null) {
                        i = hashCode + 99;
                        equals = i % 128;
                        if (i % 2 == 0) {
                            getCurrencyIso4217Code(aFh1fSDKComponent3);
                            throw null;
                        }
                        currencyIso4217Code = getCurrencyIso4217Code(aFh1fSDKComponent3);
                    }
                    aFa1ySDK.onConfigurationChanged(currencyIso4217Code);
                    return;
                }
                return;
            }
            int i4 = equals + 49;
            hashCode = i4 % 128;
            if (i4 % 2 == 0) {
                if (getMediationNetwork(aFh1fSDKComponent8)) {
                    aFh1fSDKComponent4 = component3();
                    if (aFh1fSDKComponent4 != null) {
                        numValueOf = null;
                    } else {
                        numValueOf = null;
                    }
                    aFh1fSDKComponent5 = component3();
                    if (aFh1fSDKComponent5 != null) {
                        hashCode = (equals + 25) % 128;
                        str2 = aFh1fSDKComponent5.getCurrencyIso4217Code;
                        if (str2 != null) {
                            pairAFAdRevenueData = AFe1ySDK.AFAdRevenueData(str2);
                        } else {
                            pairAFAdRevenueData = null;
                        }
                    } else {
                        pairAFAdRevenueData = null;
                    }
                    aFh1fSDKComponent6 = component3();
                    if (aFh1fSDKComponent6 != null) {
                        hashCode = (equals + 67) % 128;
                        str = aFh1fSDKComponent6.getCurrencyIso4217Code;
                        if (str != null) {
                            revenue = AFe1ySDK.getRevenue(str);
                        } else {
                            revenue = null;
                        }
                    } else {
                        revenue = null;
                    }
                    if (numValueOf != null) {
                        if (pairAFAdRevenueData != null) {
                            hashCode = (equals + 93) % 128;
                            AFAdRevenueData().getCurrencyIso4217Code(pairAFAdRevenueData.getFirst().intValue(), pairAFAdRevenueData.getSecond().intValue());
                        } else if (revenue != null) {
                            i2 = hashCode + 123;
                            equals = i2 % 128;
                            if (i2 % 2 == 0) {
                                AFAdRevenueData().getCurrencyIso4217Code(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                                int i5 = 27 / 0;
                            } else {
                                AFAdRevenueData().getCurrencyIso4217Code(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                            }
                        } else {
                            component2().getRevenue("af_send_exc_to_server_window");
                            AFAdRevenueData().getMonetizationNetwork();
                        }
                    }
                    if (pairAFAdRevenueData == null) {
                        AFAdRevenueData().getMediationNetwork(this.component2);
                    } else if (pairAFAdRevenueData != null) {
                        hashCode = (equals + 93) % 128;
                        AFAdRevenueData().getCurrencyIso4217Code(pairAFAdRevenueData.getFirst().intValue(), pairAFAdRevenueData.getSecond().intValue());
                    } else if (revenue != null) {
                        i2 = hashCode + 123;
                        equals = i2 % 128;
                        if (i2 % 2 == 0) {
                            AFAdRevenueData().getCurrencyIso4217Code(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                            int i6 = 27 / 0;
                        } else {
                            AFAdRevenueData().getCurrencyIso4217Code(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                        }
                    } else {
                        component2().getRevenue("af_send_exc_to_server_window");
                        AFAdRevenueData().getMonetizationNetwork();
                    }
                } else {
                    component2().getRevenue("af_send_exc_to_server_window");
                    AFAdRevenueData().getMonetizationNetwork();
                }
                aFa1ySDK = this.component1;
                if (aFa1ySDK != null) {
                    aFh1fSDKComponent3 = component3();
                    if (aFh1fSDKComponent3 != null) {
                        i = hashCode + 99;
                        equals = i % 128;
                        if (i % 2 == 0) {
                            getCurrencyIso4217Code(aFh1fSDKComponent3);
                            throw null;
                        }
                        currencyIso4217Code = getCurrencyIso4217Code(aFh1fSDKComponent3);
                    }
                    aFa1ySDK.onConfigurationChanged(currencyIso4217Code);
                    return;
                }
                return;
            }
            if (getMediationNetwork(aFh1fSDKComponent8)) {
                component2().getRevenue("af_send_exc_to_server_window");
                AFAdRevenueData().getMonetizationNetwork();
            } else {
                aFh1fSDKComponent4 = component3();
                if (aFh1fSDKComponent4 != null || (str3 = aFh1fSDKComponent4.getCurrencyIso4217Code) == null) {
                    numValueOf = null;
                } else {
                    MatchResult matchResultMatchEntire = new Regex("(\\d+).(\\d+).(\\d+).*").matchEntire(str3);
                    if (matchResultMatchEntire != null) {
                        MatchGroup matchGroup = matchResultMatchEntire.getGroups().get(1);
                        int iIntValue3 = ((matchGroup == null || (value3 = matchGroup.getValue()) == null || (intOrNull2 = StringsKt.toIntOrNull(value3)) == null) ? 0 : intOrNull2.intValue()) * PlaybackException.CUSTOM_ERROR_CODE_BASE;
                        MatchGroup matchGroup2 = matchResultMatchEntire.getGroups().get(2);
                        if (matchGroup2 == null || (value2 = matchGroup2.getValue()) == null || (intOrNull = StringsKt.toIntOrNull(value2)) == null) {
                            hashCode = (equals + 121) % 128;
                            iIntValue = 0;
                        } else {
                            equals = (hashCode + 117) % 128;
                            iIntValue = intOrNull.intValue();
                        }
                        int i7 = iIntValue3 + (iIntValue * 1000);
                        MatchGroup matchGroup3 = matchResultMatchEntire.getGroups().get(3);
                        if (matchGroup3 == null || (value = matchGroup3.getValue()) == null) {
                            iIntValue2 = 0;
                        } else {
                            hashCode = (equals + 121) % 128;
                            Integer intOrNull3 = StringsKt.toIntOrNull(value);
                            if (intOrNull3 != null) {
                                iIntValue2 = intOrNull3.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                        }
                        i3 = i7 + iIntValue2;
                    } else {
                        i3 = -1;
                    }
                    numValueOf = Integer.valueOf(i3);
                }
                aFh1fSDKComponent5 = component3();
                if (aFh1fSDKComponent5 != null) {
                    hashCode = (equals + 25) % 128;
                    str2 = aFh1fSDKComponent5.getCurrencyIso4217Code;
                    if (str2 != null) {
                        pairAFAdRevenueData = AFe1ySDK.AFAdRevenueData(str2);
                    } else {
                        pairAFAdRevenueData = null;
                    }
                } else {
                    pairAFAdRevenueData = null;
                }
                aFh1fSDKComponent6 = component3();
                if (aFh1fSDKComponent6 != null) {
                    hashCode = (equals + 67) % 128;
                    str = aFh1fSDKComponent6.getCurrencyIso4217Code;
                    if (str != null) {
                        revenue = AFe1ySDK.getRevenue(str);
                    } else {
                        revenue = null;
                    }
                } else {
                    revenue = null;
                }
                if (numValueOf != null && numValueOf.intValue() == -1) {
                    if (pairAFAdRevenueData != null) {
                        hashCode = (equals + 93) % 128;
                        AFAdRevenueData().getCurrencyIso4217Code(pairAFAdRevenueData.getFirst().intValue(), pairAFAdRevenueData.getSecond().intValue());
                    } else if (revenue != null) {
                        i2 = hashCode + 123;
                        equals = i2 % 128;
                        if (i2 % 2 == 0) {
                            AFAdRevenueData().getCurrencyIso4217Code(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                            int i8 = 27 / 0;
                        } else {
                            AFAdRevenueData().getCurrencyIso4217Code(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                        }
                    } else {
                        component2().getRevenue("af_send_exc_to_server_window");
                        AFAdRevenueData().getMonetizationNetwork();
                    }
                } else if (pairAFAdRevenueData == null) {
                    AFAdRevenueData().getMediationNetwork(this.component2);
                } else if (pairAFAdRevenueData != null) {
                    hashCode = (equals + 93) % 128;
                    AFAdRevenueData().getCurrencyIso4217Code(pairAFAdRevenueData.getFirst().intValue(), pairAFAdRevenueData.getSecond().intValue());
                } else if (revenue != null) {
                    i2 = hashCode + 123;
                    equals = i2 % 128;
                    if (i2 % 2 == 0) {
                        AFAdRevenueData().getCurrencyIso4217Code(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                        int i9 = 27 / 0;
                    } else {
                        AFAdRevenueData().getCurrencyIso4217Code(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                    }
                } else {
                    component2().getRevenue("af_send_exc_to_server_window");
                    AFAdRevenueData().getMonetizationNetwork();
                }
            }
            aFa1ySDK = this.component1;
            if (aFa1ySDK != null) {
                aFh1fSDKComponent3 = component3();
                if (aFh1fSDKComponent3 != null) {
                    i = hashCode + 99;
                    equals = i % 128;
                    if (i % 2 == 0) {
                        getCurrencyIso4217Code(aFh1fSDKComponent3);
                        throw null;
                    }
                    currencyIso4217Code = getCurrencyIso4217Code(aFh1fSDKComponent3);
                }
                aFa1ySDK.onConfigurationChanged(currencyIso4217Code);
                return;
            }
            return;
            throw th;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (i * (-520)) + (i2 * 522) + ((~(i4 | i2 | i3)) * 521);
        int i6 = ~(i | (~i2));
        int i7 = i5 + (i6 * (-1042)) + ((i6 | (~(i2 | (~i3) | i4))) * 521);
        if (i7 == 1) {
            return getMediationNetwork(objArr);
        }
        if (i7 == 2) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i7 != 3) {
            return i7 != 4 ? AFAdRevenueData(objArr) : getMonetizationNetwork(objArr);
        }
        final AFd1dSDK aFd1dSDK = (AFd1dSDK) objArr[0];
        final Throwable th = (Throwable) objArr[1];
        final String str = (String) objArr[2];
        equals = (hashCode + 35) % 128;
        th.getClass();
        str.getClass();
        aFd1dSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.j
            @Override // java.lang.Runnable
            public final void run() {
                AFd1dSDK.getMonetizationNetwork(this.f4285a, th, str);
            }
        });
        hashCode = (equals + 27) % 128;
        return null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFd1dSDK aFd1dSDK = (AFd1dSDK) objArr[0];
        int i = hashCode;
        int i2 = i + 81;
        equals = i2 % 128;
        int i3 = i2 % 2;
        AFd1fSDK aFd1fSDK = aFd1dSDK.getCurrencyIso4217Code;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i + 23;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return aFd1fSDK;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1dSDK aFd1dSDK = (AFd1dSDK) objArr[0];
        AFh1fSDK aFh1fSDK = (AFh1fSDK) objArr[1];
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jAFAdRevenueData = aFd1dSDK.component2().AFAdRevenueData("af_send_exc_to_server_window", -1L);
        if (aFh1fSDK.getRevenue < jCurrentTimeMillis / 1000) {
            return Boolean.FALSE;
        }
        if (jAFAdRevenueData != -1) {
            equals = (hashCode + 69) % 128;
            if (jAFAdRevenueData >= jCurrentTimeMillis) {
                int monetizationNetwork = aFd1dSDK.component2().getMonetizationNetwork("af_send_exc_min", -1);
                if (monetizationNetwork != -1) {
                    int i = hashCode + 125;
                    equals = i % 128;
                    if (i % 2 == 0) {
                        aFd1dSDK.AFAdRevenueData().AFAdRevenueData();
                        throw null;
                    }
                    if (aFd1dSDK.AFAdRevenueData().AFAdRevenueData() >= monetizationNetwork) {
                        return Boolean.valueOf(aFd1dSDK.getMediationNetwork(aFh1fSDK));
                    }
                }
                return Boolean.FALSE;
            }
        }
        equals = (hashCode + 29) % 128;
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFd1dSDK aFd1dSDK) {
        int i = equals + 7;
        hashCode = i % 128;
        if (i % 2 != 0) {
            aFd1dSDK.getClass();
            aFd1dSDK.equals();
            int i2 = 53 / 0;
        } else {
            aFd1dSDK.getClass();
            aFd1dSDK.equals();
        }
        hashCode = (equals + 49) % 128;
    }

    private final AFg1wSDK getMediationNetwork() {
        int i = equals + 39;
        hashCode = i % 128;
        int i2 = i % 2;
        AFg1wSDK aFg1wSDK = (AFg1wSDK) this.getMonetizationNetwork.getValue();
        if (i2 != 0) {
            throw null;
        }
        hashCode = (equals + 9) % 128;
        return aFg1wSDK;
    }

    private final boolean getMediationNetwork(AFh1fSDK aFh1fSDK) {
        new AFe1zSDK();
        String str = this.component2;
        String str2 = aFh1fSDK.getCurrencyIso4217Code;
        str2.getClass();
        boolean currencyIso4217Code = AFe1zSDK.getCurrencyIso4217Code(str, str2);
        equals = (hashCode + 43) % 128;
        return currencyIso4217Code;
    }

    private final AFd1pSDK getRevenue() {
        equals = (hashCode + 71) % 128;
        AFd1pSDK aFd1pSDK = (AFd1pSDK) this.getMediationNetwork.getValue();
        int i = equals + 93;
        hashCode = i % 128;
        if (i % 2 == 0) {
            return aFd1pSDK;
        }
        throw null;
    }

    public static final /* synthetic */ AFd1fSDK getMediationNetwork(AFd1dSDK aFd1dSDK) {
        return (AFd1fSDK) getCurrencyIso4217Code(new Object[]{aFd1dSDK}, 690638901, -690638900, (int) System.currentTimeMillis());
    }

    private final boolean getRevenue(AFh1fSDK aFh1fSDK) {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this, aFh1fSDK}, 1110962136, -1110962132, System.identityHashCode(this))).booleanValue();
    }

    @WorkerThread
    private final void getRevenue(String str, String str2) {
        getCurrencyIso4217Code(new Object[]{this, str, str2}, 570911366, -570911364, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1bSDK
    public final void getCurrencyIso4217Code(@Nullable AFd1bSDK.AFa1ySDK aFa1ySDK) {
        int i = equals + 75;
        hashCode = i % 128;
        if (i % 2 == 0) {
            this.component1 = aFa1ySDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.l
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1dSDK.getRevenue(this.f4293a);
                }
            });
            hashCode = (equals + 3) % 128;
        } else {
            this.component1 = aFa1ySDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.l
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1dSDK.getRevenue(this.f4293a);
                }
            });
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1bSDK
    public final void getCurrencyIso4217Code() {
        equals = (hashCode + 45) % 128;
        areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.i
            @Override // java.lang.Runnable
            public final void run() {
                AFd1dSDK.getMonetizationNetwork(this.f4282a);
            }
        });
        int i = equals + 9;
        hashCode = i % 128;
        if (i % 2 != 0) {
            int i2 = 1 / 0;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1dSDK aFd1dSDK = (AFd1dSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        equals = (hashCode + 67) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        aFd1dSDK.component1().AFAdRevenueData(bytes, MapsKt.mapOf(TuplesKt.m88129a("Authorization", AFb1iSDK.getMediationNetwork(str, str2))), 2000);
        int i = equals + 75;
        hashCode = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1bSDK
    public final void getMonetizationNetwork() {
        int i = hashCode + 27;
        equals = i % 128;
        if (i % 2 != 0) {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.k
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1dSDK.AFAdRevenueData(this.f4290a);
                }
            });
        } else {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.k
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1dSDK.AFAdRevenueData(this.f4290a);
                }
            });
            throw null;
        }
    }

    private final boolean getCurrencyIso4217Code(AFh1fSDK aFh1fSDK) {
        equals = (hashCode + 89) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jAFAdRevenueData = component2().AFAdRevenueData("af_send_exc_to_server_window", -1L);
        if (aFh1fSDK.getRevenue >= jCurrentTimeMillis / 1000 && jAFAdRevenueData != -1) {
            int i = equals + 19;
            hashCode = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            if (jAFAdRevenueData >= jCurrentTimeMillis) {
                return getMediationNetwork(aFh1fSDK);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1dSDK aFd1dSDK) {
        hashCode = (equals + 13) % 128;
        aFd1dSDK.getClass();
        aFd1dSDK.copydefault();
        int i = equals + 97;
        hashCode = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static Map<String, Object> getMonetizationNetwork(Map<String, ? extends Object> map, List<AFd1gSDK> list) {
        equals = (hashCode + 105) % 128;
        Map<String, Object> mapMapOf = MapsKt.mapOf(TuplesKt.m88129a("deviceInfo", map), TuplesKt.m88129a("excs", AFe1vSDK.getMonetizationNetwork(list)));
        equals = (hashCode + 19) % 128;
        return mapMapOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1dSDK aFd1dSDK, Throwable th, String str) {
        aFd1dSDK.getClass();
        th.getClass();
        str.getClass();
        AFh1fSDK aFh1fSDKComponent3 = aFd1dSDK.component3();
        if (aFh1fSDKComponent3 != null) {
            if (!aFd1dSDK.getCurrencyIso4217Code(aFh1fSDKComponent3)) {
                hashCode = (equals + 81) % 128;
                return;
            }
            int i = (hashCode + 125) % 128;
            equals = i;
            int i2 = i + 19;
            hashCode = i2 % 128;
            if (i2 % 2 == 0) {
                aFd1dSDK.AFAdRevenueData().getMonetizationNetwork(th, str);
            } else {
                aFd1dSDK.AFAdRevenueData().getMonetizationNetwork(th, str);
                throw null;
            }
        }
    }

    private final Map<String, String> getMonetizationNetwork(AFh1fSDK aFh1fSDK) {
        return (Map) getCurrencyIso4217Code(new Object[]{this, aFh1fSDK}, 685429613, -685429613, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1dSDK aFd1dSDK) {
        hashCode = (equals + 123) % 128;
        aFd1dSDK.getClass();
        aFd1dSDK.copy();
        equals = (hashCode + 93) % 128;
    }

    private final void AFAdRevenueData(AFh1fSDK aFh1fSDK) {
        int i;
        long jCurrentTimeMillis;
        int i2 = equals + 9;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (i3 != 0) {
            i = aFh1fSDK.AFAdRevenueData;
            jCurrentTimeMillis = System.currentTimeMillis() * timeUnit.toMillis(aFh1fSDK.getMonetizationNetwork);
        } else {
            i = aFh1fSDK.AFAdRevenueData;
            jCurrentTimeMillis = System.currentTimeMillis() + timeUnit.toMillis(aFh1fSDK.getMonetizationNetwork);
        }
        AFd1rSDK aFd1rSDKComponent2 = component2();
        aFd1rSDKComponent2.getRevenue("af_send_exc_to_server_window", jCurrentTimeMillis);
        aFd1rSDKComponent2.AFAdRevenueData("af_send_exc_min", i);
    }

    @NotNull
    public final AFd1iSDK AFAdRevenueData() {
        int i = equals + 9;
        hashCode = i % 128;
        int i2 = i % 2;
        AFd1iSDK aFd1iSDK = (AFd1iSDK) this.areAllFieldsValid.getValue();
        if (i2 != 0) {
            throw null;
        }
        int i3 = equals + 101;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
        }
        return aFd1iSDK;
    }

    @Override // com.appsflyer.internal.AFd1bSDK
    public final void AFAdRevenueData(@NotNull Throwable th, @NotNull String str) {
        getCurrencyIso4217Code(new Object[]{this, th, str}, -419122992, 419122995, System.identityHashCode(this));
    }
}
