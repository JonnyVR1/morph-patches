package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nbr;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u000b\u001a\u00020\b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0015\u0010\f\u001a\u00020\b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0011\u0010\u000f\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0011\u0010\r\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000e"}, m88121d2 = {"Lcom/appsflyer/internal/AFe1fSDK;", "", "Lcom/appsflyer/internal/AFd1pSDK;", "p0", "Lcom/appsflyer/internal/AFd1rSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1pSDK;Lcom/appsflyer/internal/AFd1rSDK;)V", "", "areAllFieldsValid", "Lkotlin/Lazy;", "getCurrencyIso4217Code", "getRevenue", "getMediationNetwork", "()Ljava/lang/String;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFd1pSDK;", "getMonetizationNetwork", "", "()Z", "Lcom/appsflyer/internal/AFd1rSDK;", "component1", "component4", "AFa1zSDK"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
public final class AFe1fSDK {

    @Nullable
    private static AFe1iSDK component4;

    /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    private final Lazy getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    public final Lazy getRevenue;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    private final AFd1pSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    private final AFd1rSDK component1;

    /* JADX INFO: renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static String AFAdRevenueData = "https://%scdn-%ssettings.%s/android/v1/%s/settings";

    @NotNull
    public static String getMonetizationNetwork = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";

    @NotNull
    private static final List<String> component1 = CollectionsKt.listOf((Object[]) new String[]{"googleplay", "playstore", "googleplaystore"});

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFe1bSDK.values().length];
            iArr[AFe1bSDK.DEFAULT.ordinal()] = 1;
            iArr[AFe1bSDK.API.ordinal()] = 2;
            iArr[AFe1bSDK.RC.ordinal()] = 3;
            getCurrencyIso4217Code = iArr;
        }
    }

    public AFe1fSDK(@NotNull AFd1pSDK aFd1pSDK, @NotNull AFd1rSDK aFd1rSDK) {
        aFd1pSDK.getClass();
        aFd1rSDK.getClass();
        this.getMonetizationNetwork = aFd1pSDK;
        this.component1 = aFd1rSDK;
        this.getCurrencyIso4217Code = LazyKt__LazyJVMKt.m88118b(new Function0<String>() { // from class: com.appsflyer.internal.AFe1fSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String strConcat = (String) AFb1tSDK.AFAdRevenueData(new Object[]{AFe1fSDK.this.component1, AFe1fSDK.this.getMonetizationNetwork.component4()}, -787116836, 787116860, (int) System.currentTimeMillis());
                if (strConcat != null && !StringsKt.m94329e0(strConcat)) {
                    String string = StringsKt.m94324Z0(strConcat).toString();
                    List<String> currencyIso4217Code = Companion.getCurrencyIso4217Code();
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String lowerCase = string.toLowerCase(locale);
                    lowerCase.getClass();
                    if (currencyIso4217Code.contains(lowerCase)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        AFLogger.afWarnLog(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1)));
                        strConcat = "";
                    } else {
                        strConcat = "-".concat(string);
                    }
                }
                return StringsKt.m94324Z0(strConcat != null ? strConcat : "").toString();
            }
        });
        this.getRevenue = LazyKt__LazyJVMKt.m88118b(new Function0<String>() { // from class: com.appsflyer.internal.AFe1fSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String packageName = AFe1fSDK.this.getMonetizationNetwork.AFAdRevenueData.getCurrencyIso4217Code.getPackageName();
                packageName.getClass();
                return AFe1fSDK.getMonetizationNetwork(packageName, AFe1fSDK.AFAdRevenueData(AFe1fSDK.this));
            }
        });
    }

    public static final /* synthetic */ String AFAdRevenueData(AFe1fSDK aFe1fSDK) {
        return (String) aFe1fSDK.getCurrencyIso4217Code.getValue();
    }

    public static final /* synthetic */ String getMonetizationNetwork(String str, String str2) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String string = sb.toString();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        strEncodeToString.getClass();
        String lowerCase = strEncodeToString.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6).concat("-");
    }

    @JvmName
    @NotNull
    public final String getMediationNetwork() {
        int i = AFa1vSDK.getCurrencyIso4217Code[(AFAdRevenueData() ? AFe1bSDK.DEFAULT : AFe1bSDK.API).ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i == 2) {
            AFe1iSDK aFe1iSDK = component4;
            String str = aFe1iSDK != null ? aFe1iSDK.getRevenue : null;
            return str == null ? "" : str;
        }
        if (i == 3) {
            return "";
        }
        nbr.m162172a();
        return null;
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1fSDK$AFa1zSDK, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\u000b\u0010\u0011"}, m88121d2 = {"Lcom/appsflyer/internal/AFe1fSDK$AFa1zSDK;", "", "<init>", "()V", "", "", "component1", "Ljava/util/List;", "getCurrencyIso4217Code", "()Ljava/util/List;", "getMonetizationNetwork", "AFAdRevenueData", "Ljava/lang/String;", "getRevenue", "Lcom/appsflyer/internal/AFe1iSDK;", "component4", "Lcom/appsflyer/internal/AFe1iSDK;", "(Lcom/appsflyer/internal/AFe1iSDK;)V", "getMediationNetwork"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmName
        public static void AFAdRevenueData(@Nullable AFe1iSDK aFe1iSDK) {
            AFe1fSDK.component4 = aFe1iSDK;
        }

        @JvmName
        @NotNull
        public static List<String> getCurrencyIso4217Code() {
            return AFe1fSDK.component1;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmName
    public static boolean AFAdRevenueData() {
        return component4 == null;
    }

    @JvmName
    @NotNull
    public final String getMonetizationNetwork() {
        AFe1bSDK aFe1bSDK;
        if (AFAdRevenueData()) {
            aFe1bSDK = AFe1bSDK.DEFAULT;
        } else {
            aFe1bSDK = AFe1bSDK.API;
        }
        int i = AFa1vSDK.getCurrencyIso4217Code[aFe1bSDK.ordinal()];
        if (i == 1) {
            return (String) this.getRevenue.getValue();
        }
        if (i == 2) {
            AFe1iSDK aFe1iSDK = component4;
            String str = aFe1iSDK != null ? aFe1iSDK.AFAdRevenueData : null;
            return str == null ? "" : str;
        }
        if (i == 3) {
            return "";
        }
        nbr.m162172a();
        return null;
    }

    public static final void getMonetizationNetwork(@Nullable AFe1iSDK aFe1iSDK) {
        Companion.AFAdRevenueData(aFe1iSDK);
    }
}
