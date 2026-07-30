package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.p006os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import com.appsflyer.AFLogger;
import com.tencent.connect.common.Constants;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import p153l.i760;
import p153l.iox;
import p153l.jox;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(33)
public final class AFf1jSDK extends AFf1wSDK<Unit> {

    @NotNull
    private final String areAllFieldsValid;

    @NotNull
    private final AFd1kSDK component1;

    @NotNull
    private final AFg1rSDK component2;

    @NotNull
    private final AFd1pSDK component3;

    @NotNull
    private final AFg1fSDK component4;

    public static final class AFa1tSDK implements OutcomeReceiver {
        private /* synthetic */ AFf1jSDK AFAdRevenueData;
        private /* synthetic */ Ref.ObjectRef<AFe1dSDK> getMediationNetwork;
        private /* synthetic */ CountDownLatch getRevenue;

        public AFa1tSDK(Ref.ObjectRef<AFe1dSDK> objectRef, CountDownLatch countDownLatch, AFf1jSDK aFf1jSDK) {
            this.getMediationNetwork = objectRef;
            this.getRevenue = countDownLatch;
            this.AFAdRevenueData = aFf1jSDK;
        }

        public final /* synthetic */ void onError(Throwable th) {
            Exception exc = (Exception) th;
            exc.getClass();
            AFf1jSDK.getMonetizationNetwork(exc);
            this.getRevenue.countDown();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, com.appsflyer.internal.AFe1dSDK] */
        public final void onResult(@NotNull Object obj) {
            obj.getClass();
            this.getMediationNetwork.element = AFe1dSDK.SUCCESS;
            this.getRevenue.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1jSDK(@NotNull AFd1fSDK aFd1fSDK, @NotNull String str) {
        super(AFf1zSDK.REGISTER_TRIGGER, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.CONVERSION}, "RegisterTrigger");
        aFd1fSDK.getClass();
        str.getClass();
        this.areAllFieldsValid = str;
        AFd1pSDK mediationNetwork = aFd1fSDK.getMediationNetwork();
        mediationNetwork.getClass();
        this.component3 = mediationNetwork;
        AFd1kSDK aFd1kSDKValueOf = aFd1fSDK.valueOf();
        aFd1kSDKValueOf.getClass();
        this.component1 = aFd1kSDKValueOf;
        AFg1fSDK aFg1fSDKComponent3 = aFd1fSDK.component3();
        aFg1fSDKComponent3.getClass();
        this.component4 = aFg1fSDKComponent3;
        AFg1rSDK aFg1rSDKAFKeystoreWrapper = aFd1fSDK.AFKeystoreWrapper();
        aFg1rSDKAFKeystoreWrapper.getClass();
        this.component2 = aFg1rSDKAFKeystoreWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.appsflyer.internal.AFe1dSDK] */
    @Override // com.appsflyer.internal.AFf1wSDK
    @SuppressLint({"NewApi"})
    @NotNull
    public final AFe1dSDK getMonetizationNetwork() {
        MeasurementManager measurementManagerM146483a;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = AFe1dSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.component1.getCurrencyIso4217Code;
            if (context != null && (measurementManagerM146483a = jox.m146483a(context.getSystemService(iox.m141358a()))) != null) {
                new AFj1mSDK(this.component3, null, 2, null);
                Uri.Builder builderBuildUpon = Uri.parse(AFj1mSDK.getCurrencyIso4217Code()).buildUpon();
                Pair pairM88129a = TuplesKt.m88129a("event_name", this.areAllFieldsValid);
                Pair pairM88129a2 = TuplesKt.m88129a(Constants.JumpUrlConstants.URL_KEY_APPID, this.component3.AFAdRevenueData.getCurrencyIso4217Code.getPackageName());
                Context context2 = this.component3.AFAdRevenueData.getCurrencyIso4217Code;
                Map mapMutableMapOf = MapsKt.mutableMapOf(pairM88129a, pairM88129a2, TuplesKt.m88129a("app_version", AFb1vSDK.getMonetizationNetwork(context2, context2.getPackageName())), TuplesKt.m88129a(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, AFd1pSDK.getRevenue()), TuplesKt.m88129a("api_version", AFd1pSDK.getCurrencyIso4217Code()), TuplesKt.m88129a("timestamp", String.valueOf(this.component4.getRevenue())), TuplesKt.m88129a("request_id", AFd1pSDK.AFAdRevenueData()));
                AFd1pSDK aFd1pSDK = this.component3;
                String strAFAdRevenueData = AFb1lSDK.AFAdRevenueData(aFd1pSDK.AFAdRevenueData, aFd1pSDK.getRevenue);
                if (strAFAdRevenueData != null) {
                    mapMutableMapOf.put("appsflyer_id", strAFAdRevenueData);
                }
                Long monetizationNetwork = this.component4.getMonetizationNetwork();
                if (monetizationNetwork != null) {
                    mapMutableMapOf.put("install_time", String.valueOf(monetizationNetwork.longValue()));
                }
                for (Map.Entry entry : mapMutableMapOf.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri uriBuild = builderBuildUpon.build();
                uriBuild.getClass();
                measurementManagerM146483a.registerTrigger(uriBuild, AFd1qSDK.getRevenue(), i760.m138915a(new AFa1tSDK(objectRef, countDownLatch, this)));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            getMonetizationNetwork(th);
        }
        return (AFe1dSDK) objectRef.element;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public final long getRevenue() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getMonetizationNetwork(Throwable th) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.PRIVACY_SANDBOX;
        StringBuilder sb = new StringBuilder("Error occurred: ");
        sb.append(th.getMessage());
        aFLogger.mo5193e(aFg1cSDK, sb.toString(), th, false, false, false, true);
    }
}
