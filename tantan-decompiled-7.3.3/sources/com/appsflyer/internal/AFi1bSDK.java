package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.agora.utils2.internal.CommonUtility;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1bSDK extends AFj1zSDK {
    final ProviderInfo AFAdRevenueData;
    private final AFd1fSDK getCurrencyIso4217Code;

    public AFi1bSDK(ProviderInfo providerInfo, Runnable runnable, AFd1fSDK aFd1fSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getCurrencyIso4217Code = aFd1fSDK;
        this.AFAdRevenueData = providerInfo;
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: C_ */
    public static ContentProviderClient m5259C_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e) {
            AFLogger.INSTANCE.m5254e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e, false, true, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.m5254e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void getMonetizationNetwork(final Context context) {
        this.getCurrencyIso4217Code.AFAdRevenueData().execute(new Runnable() { // from class: com.appsflyer.internal.AFi1bSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                Cursor cursorQuery;
                AFi1bSDK aFi1bSDK = AFi1bSDK.this;
                aFi1bSDK.component4 = System.currentTimeMillis();
                aFi1bSDK.component3 = AFj1zSDK.AFa1zSDK.STARTED;
                aFi1bSDK.addObserver(new AFj1zSDK.C09834());
                StringBuilder sb = new StringBuilder(CommonUtility.PREFIX_URI);
                sb.append(AFi1bSDK.this.AFAdRevenueData.authority);
                sb.append("/transaction_id");
                Uri uri = Uri.parse(sb.toString());
                ContentProviderClient contentProviderClientM5259C_ = AFi1bSDK.m5259C_(context, uri);
                try {
                    if (contentProviderClientM5259C_ != null) {
                        StringBuilder sb2 = new StringBuilder("app_id=");
                        sb2.append(context.getPackageName());
                        cursorQuery = contentProviderClientM5259C_.query(uri, null, sb2.toString(), null, null);
                    } else {
                        cursorQuery = null;
                    }
                } catch (RemoteException e) {
                    AFLogger.INSTANCE.m5254e(AFg1cSDK.PREINSTALL, "Failed to query unstable content providerClient", e, false, true, false);
                    cursorQuery = null;
                } catch (DeadObjectException e2) {
                    AFLogger.INSTANCE.m5254e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e2, false, true, false);
                    cursorQuery = null;
                } catch (Throwable th) {
                    AFLogger.INSTANCE.m5254e(AFg1cSDK.PREINSTALL, "Error to get data from providerClient ", th, false, true, false);
                    cursorQuery = null;
                } finally {
                    contentProviderClientM5259C_.close();
                }
                if (cursorQuery != null) {
                    int columnIndex = cursorQuery.getColumnIndex(FirebaseAnalytics.Param.TRANSACTION_ID);
                    if (columnIndex == -1) {
                        AFLogger.INSTANCE.m5257w(AFg1cSDK.PREINSTALL, "Wrong column name");
                        AFi1bSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                    } else {
                        AFi1bSDK.this.getMediationNetwork.put("response", "OK");
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(columnIndex);
                            cursorQuery.close();
                            if (string != null && !string.isEmpty()) {
                                AFi1bSDK.this.getMediationNetwork.put("referrer", string);
                            }
                        }
                    }
                    cursorQuery.close();
                } else {
                    AFLogger.INSTANCE.m5257w(AFg1cSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                    AFi1bSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                }
                AFi1bSDK aFi1bSDK2 = AFi1bSDK.this;
                aFi1bSDK2.getMediationNetwork.put("api_ver", Long.valueOf(AFb1vSDK.getRevenue(context, ((PackageItemInfo) aFi1bSDK2.AFAdRevenueData).packageName)));
                AFi1bSDK aFi1bSDK3 = AFi1bSDK.this;
                aFi1bSDK3.getMediationNetwork.put("api_ver_name", AFb1vSDK.getMonetizationNetwork(context, ((PackageItemInfo) aFi1bSDK3.AFAdRevenueData).packageName));
                AFi1bSDK.this.AFAdRevenueData();
            }
        });
    }
}
