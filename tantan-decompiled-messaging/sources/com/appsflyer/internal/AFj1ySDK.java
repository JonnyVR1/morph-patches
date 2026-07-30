package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1ySDK extends AFi1hSDK {
    public AFj1ySDK(AFd1pSDK aFd1pSDK, Runnable runnable) {
        super(PlaceTypes.STORE, HardwareEarMonitorUtils.MANUFACTURER_XIAOMI, aFd1pSDK, runnable);
    }

    private boolean getCurrencyIso4217Code() {
        if (!getMonetizationNetwork()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.m5240d(AFg1cSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.INSTANCE.m5246v(AFg1cSDK.REFERRER, "Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.m5241e(AFg1cSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void getMonetizationNetwork(final Context context) {
        if (getCurrencyIso4217Code()) {
            this.component4 = System.currentTimeMillis();
            this.component3 = AFj1zSDK.AFa1zSDK.STARTED;
            addObserver(new AFj1zSDK.C09794());
            final GetAppsReferrerClient getAppsReferrerClientBuild = GetAppsReferrerClient.Companion.newBuilder(context).build();
            getAppsReferrerClientBuild.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFj1ySDK.2
                public final void onGetAppsReferrerSetupFinished(int i) {
                    AFj1ySDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1vSDK.getRevenue(context, "com.xiaomi.mipicks")));
                    AFj1ySDK.this.getMediationNetwork.put("api_ver_name", AFb1vSDK.getMonetizationNetwork(context, "com.xiaomi.mipicks"));
                    if (i == -1) {
                        AFLogger.INSTANCE.m5247w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFj1ySDK.this.getMediationNetwork.put("response", "SERVICE_DISCONNECTED");
                    } else if (i == 0) {
                        AFj1ySDK aFj1ySDK = AFj1ySDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = getAppsReferrerClientBuild;
                        aFj1ySDK.getMediationNetwork.put("response", "OK");
                        try {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
                            aFLogger.m5240d(aFg1cSDK, "XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFj1ySDK.getMediationNetwork.put("referrer", installReferrer2);
                                }
                                aFj1ySDK.getMediationNetwork.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFj1ySDK.getMediationNetwork.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap map = new HashMap();
                                map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                map.put("install_version", installReferrer.getInstallVersion());
                                aFj1ySDK.getMediationNetwork.put("xiaomi_custom", map);
                            } else {
                                aFLogger.m5247w(aFg1cSDK, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK2 = AFg1cSDK.REFERRER;
                            StringBuilder sb = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb.append(th.getMessage());
                            aFLogger2.m5247w(aFg1cSDK2, sb.toString());
                        }
                    } else if (i == 1) {
                        AFj1ySDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                        AFLogger.INSTANCE.m5247w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer not supported");
                    } else if (i == 2) {
                        AFLogger.INSTANCE.m5247w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFj1ySDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                    } else if (i == 3) {
                        AFLogger.INSTANCE.m5247w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1ySDK.this.getMediationNetwork.put("response", "DEVELOPER_ERROR");
                    } else if (i != 4) {
                        AFLogger.INSTANCE.m5247w(AFg1cSDK.REFERRER, "responseCode not found.");
                    } else {
                        AFLogger.INSTANCE.m5247w(AFg1cSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1ySDK.this.getMediationNetwork.put("response", "PERMISSION_ERROR");
                    }
                    AFLogger.INSTANCE.m5240d(AFg1cSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                    AFj1ySDK.this.AFAdRevenueData();
                    getAppsReferrerClientBuild.endConnection();
                }

                public final void onGetAppsServiceDisconnected() {
                }
            });
        }
    }
}
