package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.p046p1.mobile.putong.core.data.Reason;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0012\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0012\u0010\u0016J\u000f\u0010\r\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\r\u0010\u0018J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0019J\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\tJ\u001d\u0010\u0012\u001a\u00020\u001b*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u0012\u0010\u001cR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0012\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\tR\u001b\u0010\u0014\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b \u0010\tR\u0014\u0010%\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0015\u0010\u001d\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b%\u0010&"}, m87232d2 = {"Lcom/appsflyer/internal/AFf1mSDK;", "Lcom/appsflyer/internal/AFf1wSDK;", "Lcom/appsflyer/internal/AFh1pSDK;", "Lcom/appsflyer/internal/AFd1fSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFd1fSDK;)V", "", Constants.COPY_TYPE, "()Z", "", "getMediationNetwork", "(I)Z", "getMonetizationNetwork", "getCurrencyIso4217Code", "Landroid/content/Context;", "Lcom/appsflyer/internal/AFf1mSDK$AFa1ySDK;", "p1", "getRevenue", "(Landroid/content/Context;Lcom/appsflyer/internal/AFf1mSDK$AFa1ySDK;)Z", "AFAdRevenueData", "", "()J", "Lcom/appsflyer/internal/AFe1dSDK;", "()Lcom/appsflyer/internal/AFe1dSDK;", "(Landroid/content/Context;)I", "", "", "(Lcom/appsflyer/internal/AFh1pSDK;Ljava/lang/String;)V", "component4", "Lcom/appsflyer/internal/AFh1pSDK;", "Lcom/appsflyer/internal/AFd1kSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFd1kSDK;", "Lcom/appsflyer/internal/AFd1pSDK;", "component2", "Lcom/appsflyer/internal/AFd1pSDK;", "component1", "Lkotlin/Lazy;", "Lcom/appsflyer/internal/AFd1mSDK;", "component3", "Lcom/appsflyer/internal/AFd1mSDK;", "AFa1vSDK", "AFa1ySDK"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public final class AFf1mSDK extends AFf1wSDK<AFh1pSDK> {

    /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    private final AFd1kSDK getCurrencyIso4217Code;

    /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
    @NotNull
    private final Lazy component4;

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    @NotNull
    private final AFd1pSDK getMediationNetwork;

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    @NotNull
    private final AFd1mSDK component1;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    @NotNull
    private final AFh1pSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: copy, reason: from kotlin metadata */
    @NotNull
    private final Lazy AFAdRevenueData;

    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, m87232d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", Reason.TYPE, "", "onSuccess", "kinds", "", "SDK_prodRelease"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
    public static final class AFa1tSDK implements CloudDevCallback {
        final /* synthetic */ AFa1ySDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1tSDK(AFa1ySDK aFa1ySDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1ySDK;
            this.$latch = countDownLatch;
        }

        public final void onError(@NotNull String reason) {
            reason.getClass();
            AFh1ySDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Could not fetch GAID using CloudDevSdk: " + reason, false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(@NotNull Map<String, String> kinds) {
            kinds.getClass();
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1mSDK(@NotNull AFd1fSDK aFd1fSDK) {
        super(AFf1zSDK.FETCH_ADVERTISING_ID, new AFf1zSDK[0], "FetchAdvertisingIdTask");
        aFd1fSDK.getClass();
        AFd1kSDK aFd1kSDKValueOf = aFd1fSDK.valueOf();
        aFd1kSDKValueOf.getClass();
        this.getCurrencyIso4217Code = aFd1kSDKValueOf;
        AFd1pSDK mediationNetwork = aFd1fSDK.getMediationNetwork();
        mediationNetwork.getClass();
        this.getMediationNetwork = mediationNetwork;
        AFd1mSDK aFd1mSDKMo5219e = aFd1fSDK.mo5219e();
        aFd1mSDKMo5219e.getClass();
        this.component1 = aFd1mSDKMo5219e;
        this.getMonetizationNetwork = new AFh1pSDK(null, null, null, null, null, null, null, null, 255, null);
        this.component4 = LazyKt__LazyJVMKt.m87229b(new Function0<Long>() { // from class: com.appsflyer.internal.AFf1mSDK.4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Long invoke() {
                Long lP;
                String revenue = AFf1mSDK.this.getMediationNetwork.getRevenue("com.appsflyer.fetch_ids.timeout");
                return Long.valueOf((revenue == null || (lP = StringsKt.m93390p(revenue)) == null) ? 1000L : lP.longValue());
            }
        });
        this.AFAdRevenueData = LazyKt__LazyJVMKt.m87229b(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1mSDK.5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1mSDK.this.getMediationNetwork.getRevenue("com.appsflyer.enable_instant_plays")));
            }
        });
    }

    private final boolean AFAdRevenueData(Context p0, AFa1ySDK p1) throws IllegalStateException {
        Unit unit;
        try {
            AdvertisingIdClient.C2070a advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p0);
            if (advertisingIdInfo != null) {
                p1.setAdvertisingId(advertisingIdInfo.m12233a());
                p1.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.m12234b()));
                p1.setAdvertisingIdWithGps(true);
                String advertisingId = p1.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    p1.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            p1.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            StringBuilder sb = new StringBuilder("Google Play Services is missing ");
            sb.append(th.getMessage());
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, sb.toString(), th, false, false, false, false, 88, null);
            StringBuilder gaidError = p1.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    @JvmName
    private final boolean areAllFieldsValid() {
        return ((Boolean) this.AFAdRevenueData.getValue()).booleanValue();
    }

    @JvmName
    private static boolean component1() {
        String string;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            if (th instanceof ClassNotFoundException) {
                string = "CloudDevSdk not found";
            } else {
                StringBuilder sb = new StringBuilder("Unexpected exception while checking if running in cloud environment: ");
                sb.append(th.getMessage());
                string = sb.toString();
            }
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, string, th, true, false, false, false, 112, null);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[LOOP:0: B:3:0x0005->B:15:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0048 A[EDGE_INSN: B:19:0x0048->B:16:0x0048 BREAK  A[LOOP:0: B:3:0x0005->B:15:0x0045], SYNTHETIC] */
    private final boolean copy() {
        boolean z = false;
        for (int i = 2; i > 0; i--) {
            if (areAllFieldsValid() && getCurrencyIso4217Code(i)) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else {
                if (getMediationNetwork(i)) {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
                } else {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                    z = false;
                }
                if (!z) {
                    break;
                }
            }
            z = true;
            if (!z) {
                break;
                break;
            }
        }
        this.component1.component4 = this.getMonetizationNetwork;
        return z;
    }

    private final boolean getCurrencyIso4217Code(int p0) {
        return getMonetizationNetwork(p0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004d  */
    private final boolean getMediationNetwork(int p0) {
        boolean z;
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        AFa1ySDK aFa1ySDK = new AFa1ySDK(null, null, false, null, 15, null);
        Context context = this.getCurrencyIso4217Code.getCurrencyIso4217Code;
        context.getClass();
        int iAFAdRevenueData = AFAdRevenueData(context);
        Context context2 = this.getCurrencyIso4217Code.getCurrencyIso4217Code;
        context2.getClass();
        if (!AFAdRevenueData(context2, aFa1ySDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.getCurrencyIso4217Code.getCurrencyIso4217Code;
                context3.getClass();
                if (getRevenue(context3, aFa1ySDK)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            String string = aFa1ySDK.getGaidError().toString();
            if (!StringsKt.m93438e0(string)) {
                String string2 = StringsKt.m93433Z0(string).toString();
                StringBuilder sb = new StringBuilder();
                sb.append(iAFAdRevenueData);
                sb.append(": ");
                sb.append(string2);
                string = sb.toString();
            }
            getRevenue(this.getMonetizationNetwork, string);
            if (!z) {
                return false;
            }
        }
        AFh1pSDK aFh1pSDK = this.getMonetizationNetwork;
        aFh1pSDK.AFAdRevenueData = aFa1ySDK.getAdvertisingId();
        aFh1pSDK.component2 = aFa1ySDK.isLimitAdTrackingEnabled();
        Boolean boolIsLimitAdTrackingEnabled = aFa1ySDK.isLimitAdTrackingEnabled();
        aFh1pSDK.getCurrencyIso4217Code = boolIsLimitAdTrackingEnabled != null ? Boolean.valueOf(!boolIsLimitAdTrackingEnabled.booleanValue()) : null;
        aFh1pSDK.getMediationNetwork = Boolean.valueOf(aFa1ySDK.getAdvertisingIdWithGps());
        aFh1pSDK.getMonetizationNetwork = Boolean.FALSE;
        aFh1pSDK.areAllFieldsValid = Boolean.valueOf(p0 != 2);
        return true;
    }

    @RequiresApi(23)
    private final boolean getMonetizationNetwork(int p0) {
        String string;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (component1()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.getCurrencyIso4217Code.getCurrencyIso4217Code;
            context.getClass();
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1ySDK aFa1ySDK = new AFa1ySDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.getCurrencyIso4217Code.getCurrencyIso4217Code;
                    context2.getClass();
                    cloudDevSdk2.request(context2, CollectionsKt.listOf("gaid"), new AFa1tSDK(aFa1ySDK, countDownLatch));
                    countDownLatch.await(((Number) this.component4.getValue()).longValue(), TimeUnit.MILLISECONDS);
                    if (aFa1ySDK.getGaidError().length() > 0) {
                        getRevenue(this.getMonetizationNetwork, aFa1ySDK.getGaidError().toString());
                    }
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            string = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th instanceof ClassNotFoundException) {
                            string = "CloudDevSdk not found";
                        } else {
                            StringBuilder sb = new StringBuilder("Unexpected exception while fetching GAID using Samsung Cloud Dev ");
                            sb.append(th.getMessage());
                            string = sb.toString();
                        }
                        AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, string, th, true, false, false, false, 112, null);
                        StringBuilder gaidError = aFa1ySDK.getGaidError();
                        gaidError.append(th.getClass().getSimpleName());
                        gaidError.append(" |");
                        if (aFa1ySDK.getGaidError().length() > 0) {
                        }
                    } catch (Throwable th2) {
                        if (aFa1ySDK.getGaidError().length() > 0) {
                            getRevenue(this.getMonetizationNetwork, aFa1ySDK.getGaidError().toString());
                        }
                        throw th2;
                    }
                }
                String advertisingId = aFa1ySDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AFh1pSDK aFh1pSDK = this.getMonetizationNetwork;
                aFh1pSDK.AFAdRevenueData = aFa1ySDK.getAdvertisingId();
                Boolean bool = Boolean.FALSE;
                aFh1pSDK.component2 = bool;
                Boolean bool2 = Boolean.TRUE;
                aFh1pSDK.getCurrencyIso4217Code = bool2;
                aFh1pSDK.getMediationNetwork = bool;
                aFh1pSDK.getMonetizationNetwork = bool2;
                aFh1pSDK.areAllFieldsValid = Boolean.valueOf(p0 != 2);
                return true;
            }
        }
        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    private final boolean getRevenue(Context p0, AFa1ySDK p1) throws IllegalStateException {
        try {
            AFa1bSDK.AFa1uSDK revenue = AFa1bSDK.getRevenue(p0);
            p1.setAdvertisingId(revenue.getRevenue);
            p1.setLimitAdTrackingEnabled(Boolean.valueOf(revenue.getCurrencyIso4217Code()));
            String advertisingId = p1.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                p1.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.INSTANCE != null) {
                return true;
            }
            p1.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            StringBuilder sb = new StringBuilder("Failed to fetch GAID: ");
            sb.append(th.getMessage());
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, sb.toString(), th, true, false, false, false, 64, null);
            StringBuilder gaidError = p1.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, localizedMessage, false, 4, null);
            return false;
        }
    }

    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b(\u0010)"}, m87232d2 = {"Lcom/appsflyer/internal/AFf1mSDK$AFa1ySDK;", "", "", "advertisingId", "", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFf1mSDK$AFa1ySDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
    public static final /* data */ class AFa1ySDK {

        @Nullable
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;

        @Nullable
        private Boolean isLimitAdTrackingEnabled;

        public /* synthetic */ AFa1ySDK(String str, Boolean bool, boolean z, StringBuilder sb, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new StringBuilder() : sb);
        }

        public static /* synthetic */ AFa1ySDK copy$default(AFa1ySDK aFa1ySDK, String str, Boolean bool, boolean z, StringBuilder sb, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aFa1ySDK.advertisingId;
            }
            if ((i & 2) != 0) {
                bool = aFa1ySDK.isLimitAdTrackingEnabled;
            }
            if ((i & 4) != 0) {
                z = aFa1ySDK.advertisingIdWithGps;
            }
            if ((i & 8) != 0) {
                sb = aFa1ySDK.gaidError;
            }
            return aFa1ySDK.copy(str, bool, z, sb);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        @NotNull
        public final AFa1ySDK copy(@Nullable String advertisingId, @Nullable Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, @NotNull StringBuilder gaidError) {
            gaidError.getClass();
            return new AFa1ySDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AFa1ySDK)) {
                return false;
            }
            AFa1ySDK aFa1ySDK = (AFa1ySDK) other;
            return Intrinsics.m87488d(this.advertisingId, aFa1ySDK.advertisingId) && Intrinsics.m87488d(this.isLimitAdTrackingEnabled, aFa1ySDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1ySDK.advertisingIdWithGps && Intrinsics.m87488d(this.gaidError, aFa1ySDK.gaidError);
        }

        @JvmName
        @Nullable
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        @JvmName
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @JvmName
        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v6 */
        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z = this.advertisingIdWithGps;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return ((iHashCode2 + r1) * 31) + this.gaidError.hashCode();
        }

        @JvmName
        @Nullable
        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        @JvmName
        public final void setAdvertisingId(@Nullable String str) {
            this.advertisingId = str;
        }

        @JvmName
        public final void setAdvertisingIdWithGps(boolean z) {
            this.advertisingIdWithGps = z;
        }

        @JvmName
        public final void setLimitAdTrackingEnabled(@Nullable Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "AFa1ySDK(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ')';
        }

        public AFa1ySDK(@Nullable String str, @Nullable Boolean bool, boolean z, @NotNull StringBuilder sb) {
            sb.getClass();
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z;
            this.gaidError = sb;
        }

        public AFa1ySDK() {
            this(null, null, false, null, 15, null);
        }
    }

    private static int AFAdRevenueData(Context p0) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(p0);
        } catch (Throwable th) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    @VisibleForTesting(otherwise = 4)
    public final long getRevenue() {
        return ((Number) this.component4.getValue()).longValue();
    }

    private static void getRevenue(AFh1pSDK aFh1pSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1pSDK.getRevenue;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" | ");
            sb.append(str);
            str = sb.toString();
        }
        aFh1pSDK.getRevenue = str;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    @VisibleForTesting(otherwise = 4)
    @NotNull
    public final AFe1dSDK getMonetizationNetwork() {
        AFe1dSDK aFe1dSDK;
        if (this.component1.getRevenue()) {
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1dSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean boolValueOf = Boolean.valueOf(copy());
        Boolean bool = Boolean.FALSE;
        if (CollectionsKt.listOf((Object[]) new Boolean[]{boolValueOf, bool, bool}).contains(Boolean.TRUE)) {
            aFe1dSDK = AFe1dSDK.SUCCESS;
        } else {
            aFe1dSDK = AFe1dSDK.FAILURE;
        }
        AFd1mSDK aFd1mSDK = this.component1;
        AFe1oSDK aFe1oSDK = new AFe1oSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
        StringBuilder sb = new StringBuilder("QUEUE: FetchAdvertisingIdTask: took ");
        sb.append(aFe1oSDK.AFAdRevenueData);
        sb.append("ms");
        AFh1ySDK.v$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
        aFd1mSDK.getMonetizationNetwork(aFe1oSDK);
        return aFe1dSDK;
    }
}
