package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class AFi1gSDK extends AFi1hSDK {

    @NonNull
    private final ExecutorService AFAdRevenueData;
    public final Map<String, Object> getCurrencyIso4217Code;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1gSDK$5 */
    public class C09695 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        public C09695(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.m5240d(AFg1cSDK.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i) {
            ExecutorService executorService = AFi1gSDK.this.AFAdRevenueData;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.b0
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1gSDK.this.AFAdRevenueData(installReferrerClient, context, i);
                }
            });
        }
    }

    public AFi1gSDK(@NonNull Runnable runnable, @NonNull ExecutorService executorService, @NonNull AFd1pSDK aFd1pSDK) {
        super(PlaceTypes.STORE, "google", aFd1pSDK, runnable);
        this.getCurrencyIso4217Code = new HashMap();
        this.AFAdRevenueData = executorService;
    }

    @VisibleForTesting
    @WorkerThread
    public final void AFAdRevenueData(InstallReferrerClient installReferrerClient, Context context, int i) {
        this.getCurrencyIso4217Code.put("code", String.valueOf(i));
        this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1vSDK.getRevenue(context, "com.android.vending")));
        this.getMediationNetwork.put("api_ver_name", AFb1vSDK.getMonetizationNetwork(context, "com.android.vending"));
        if (i == -1) {
            AFLogger.INSTANCE.m5247w(AFg1cSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.getMediationNetwork.put("response", "SERVICE_DISCONNECTED");
        } else if (i == 0) {
            this.getMediationNetwork.put("response", "OK");
            try {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
                aFLogger.m5240d(aFg1cSDK, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.getCurrencyIso4217Code.put("val", installReferrer2);
                        this.getMediationNetwork.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.getCurrencyIso4217Code.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.getMediationNetwork.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.getCurrencyIso4217Code.put("install", Long.toString(installBeginTimestampSeconds));
                    this.getMediationNetwork.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap map = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.getCurrencyIso4217Code.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        map.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e);
                    }
                    try {
                        map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        map.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e2) {
                        AFLogger.INSTANCE.m5243e(AFg1cSDK.REFERRER, "some method not exist", e2, false, false);
                    }
                    if (!map.isEmpty()) {
                        this.getMediationNetwork.put("google_custom", map);
                    }
                    installReferrerClient.endConnection();
                } else {
                    aFLogger.m5247w(aFg1cSDK, "ReferrerClient: InstallReferrer is not ready");
                    this.getCurrencyIso4217Code.put(NotificationCompat.CATEGORY_ERROR, "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
                sb.append(th.getMessage());
                aFLogger2.m5247w(aFg1cSDK2, sb.toString());
                this.getCurrencyIso4217Code.put(NotificationCompat.CATEGORY_ERROR, th.getMessage());
                aFLogger2.m5243e(aFg1cSDK2, "Failed to get install referrer", th, false, false);
            }
        } else if (i == 1) {
            this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.m5247w(AFg1cSDK.REFERRER, "InstallReferrer not supported");
        } else if (i == 2) {
            AFLogger.INSTANCE.m5247w(AFg1cSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i != 3) {
            AFLogger.INSTANCE.m5247w(AFg1cSDK.REFERRER, "responseCode not found.");
        } else {
            AFLogger.INSTANCE.m5247w(AFg1cSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.getMediationNetwork.put("response", "DEVELOPER_ERROR");
        }
        AFLogger.INSTANCE.m5240d(AFg1cSDK.REFERRER, "Install Referrer collected locally");
        AFAdRevenueData();
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void getMonetizationNetwork(Context context) {
        if (AFAdRevenueData(context)) {
            this.component4 = System.currentTimeMillis();
            this.component3 = AFj1zSDK.AFa1zSDK.STARTED;
            addObserver(new AFj1zSDK.C09794());
            try {
                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.m5240d(AFg1cSDK.REFERRER, "Connecting to Install Referrer Library...");
                installReferrerClientBuild.startConnection(new C09695(installReferrerClientBuild, context));
            } catch (Throwable th) {
                AFLogger.INSTANCE.m5241e(AFg1cSDK.REFERRER, "referrerClient -> startConnection", th);
            }
        }
    }

    private boolean AFAdRevenueData(@NonNull Context context) {
        if (!getMonetizationNetwork()) {
            return false;
        }
        try {
            if (AFb1vSDK.getCurrencyIso4217Code(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.m5240d(AFg1cSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.m5240d(AFg1cSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e);
            AFLogger.INSTANCE.m5246v(AFg1cSDK.REFERRER, "Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.m5241e(AFg1cSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }
}
