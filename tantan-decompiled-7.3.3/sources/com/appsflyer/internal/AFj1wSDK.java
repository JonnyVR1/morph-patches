package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.google.android.libraries.places.api.model.PlaceTypes;
import io.agora.utils2.internal.CommonUtility;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1wSDK extends AFi1iSDK {
    private final AFd1fSDK AFAdRevenueData;

    public AFj1wSDK(Runnable runnable, AFd1fSDK aFd1fSDK) {
        super(PlaceTypes.STORE, "samsung", runnable);
        this.AFAdRevenueData = aFd1fSDK;
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void getMonetizationNetwork(Context context) {
        AFc1cSDK<Map<String, Object>> aFc1cSDK = new AFc1cSDK<Map<String, Object>>(context, this.AFAdRevenueData, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1wSDK.3
            /* JADX INFO: renamed from: D_ */
            private static void m5282D_(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }

            /* JADX INFO: renamed from: E_ */
            private static void m5283E_(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.AFc1cSDK
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> getMonetizationNetwork() {
                String string;
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.getMediationNetwork.getContentResolver();
                        StringBuilder sb = new StringBuilder(CommonUtility.PREFIX_URI);
                        sb.append(this.AFAdRevenueData);
                        cursorQuery = contentResolver.query(Uri.parse(sb.toString()), null, null, null, null);
                        if (cursorQuery != null) {
                            boolean zMoveToFirst = cursorQuery.moveToFirst();
                            AFj1wSDK aFj1wSDK = AFj1wSDK.this;
                            if (zMoveToFirst) {
                                aFj1wSDK.getMediationNetwork.put("response", "OK");
                                m5283E_("referrer", AFj1wSDK.this.getMediationNetwork, cursorQuery);
                                m5282D_("click_ts", AFj1wSDK.this.getMediationNetwork, cursorQuery);
                                m5282D_("install_begin_ts", AFj1wSDK.this.getMediationNetwork, cursorQuery);
                                m5282D_("install_end_ts", AFj1wSDK.this.getMediationNetwork, cursorQuery);
                                m5283E_("organic_keywords", AFj1wSDK.this.getMediationNetwork, cursorQuery);
                                m5283E_("attr_type", AFj1wSDK.this.getMediationNetwork, cursorQuery);
                                HashMap map = new HashMap();
                                int columnIndex = cursorQuery.getColumnIndex("instant");
                                if (columnIndex != -1 && (string = cursorQuery.getString(columnIndex)) != null) {
                                    map.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                                }
                                m5282D_("click_server_ts", map, cursorQuery);
                                m5282D_("install_begin_server_ts", map, cursorQuery);
                                m5283E_("install_version", map, cursorQuery);
                                if (!map.isEmpty()) {
                                    AFj1wSDK.this.getMediationNetwork.put("custom", map);
                                }
                            } else {
                                aFj1wSDK.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                        } else {
                            AFj1wSDK.this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e) {
                        AFj1wSDK.this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e.getMessage(), e, false, true);
                        if (0 != 0) {
                        }
                    }
                    String str = ((PackageItemInfo) this.getMediationNetwork.getPackageManager().resolveContentProvider(this.AFAdRevenueData, 128)).packageName;
                    AFj1wSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1vSDK.getRevenue(this.getMediationNetwork, str)));
                    AFj1wSDK.this.getMediationNetwork.put("api_ver_name", AFb1vSDK.getMonetizationNetwork(this.getMediationNetwork, str));
                    AFj1wSDK.this.AFAdRevenueData();
                    return AFj1wSDK.this.getMediationNetwork;
                } catch (Throwable th) {
                    if (0 == 0) {
                        throw th;
                    }
                    cursorQuery.close();
                    throw th;
                }
            }
        };
        AFd1rSDK revenue = this.AFAdRevenueData.getRevenue();
        AFb1tSDK.getMonetizationNetwork();
        if (AFb1tSDK.getRevenue(revenue, false) > 0 || !aFc1cSDK.getRevenue()) {
            return;
        }
        aFc1cSDK.getMonetizationNetwork.AFAdRevenueData().execute(aFc1cSDK.getRevenue);
        this.component4 = System.currentTimeMillis();
        this.component3 = AFj1zSDK.AFa1zSDK.STARTED;
        addObserver(new AFj1zSDK.C09834());
    }
}
