package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.google.android.libraries.places.api.model.PlaceTypes;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1cSDK extends AFi1hSDK {
    private final AFd1fSDK AFAdRevenueData;
    private final AFi1fSDK getCurrencyIso4217Code;

    public AFi1cSDK(Runnable runnable, AFd1fSDK aFd1fSDK, AFi1fSDK aFi1fSDK) {
        super(PlaceTypes.STORE, HardwareEarMonitorUtils.MANUFACTURER_HUAWEI, aFd1fSDK.getMediationNetwork(), runnable);
        this.AFAdRevenueData = aFd1fSDK;
        this.getCurrencyIso4217Code = aFi1fSDK;
    }

    private boolean getMediationNetwork(Context context) {
        if (!getMonetizationNetwork()) {
            AFLogger.INSTANCE.m5240d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getCurrencyIso4217Code.getMediationNetwork(context)) {
            AFLogger.INSTANCE.m5240d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getCurrencyIso4217Code.getRevenue(context)) {
            return true;
        }
        AFLogger.INSTANCE.m5240d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(Context context) {
        this.component4 = System.currentTimeMillis();
        this.component3 = AFj1zSDK.AFa1zSDK.STARTED;
        addObserver(new AFj1zSDK.C09794());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.getMediationNetwork.put("api_ver", Long.valueOf(AFb1vSDK.getRevenue(context, str)));
        this.getMediationNetwork.put("api_ver_name", AFb1vSDK.getMonetizationNetwork(context, str));
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursorQuery != null) {
                boolean zMoveToFirst = cursorQuery.moveToFirst();
                Map<String, Object> map = this.getMediationNetwork;
                if (zMoveToFirst) {
                    map.put("response", "OK");
                    this.getMediationNetwork.put("referrer", cursorQuery.getString(0));
                    this.getMediationNetwork.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
                    this.getMediationNetwork.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
                    if (cursorQuery.getColumnCount() > 3) {
                        this.getMediationNetwork.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
                        HashMap map2 = new HashMap();
                        String string = cursorQuery.getString(4);
                        if (string != null) {
                            map2.put("track_id", string);
                        }
                        map2.put("referrer_ex", cursorQuery.getString(5));
                        this.getMediationNetwork.put("huawei_custom", map2);
                    }
                } else {
                    map.put("response", "FEATURE_NOT_SUPPORTED");
                }
            } else {
                this.getMediationNetwork.put("response", "SERVICE_UNAVAILABLE");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable th) {
            try {
                this.getMediationNetwork.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.m5243e(AFg1cSDK.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, true);
                if (0 != 0) {
                }
            } catch (Throwable th2) {
                if (0 == 0) {
                    throw th2;
                }
                cursorQuery.close();
                throw th2;
            }
        }
        AFAdRevenueData();
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void getMonetizationNetwork(final Context context) {
        if (getMediationNetwork(context)) {
            this.AFAdRevenueData.AFAdRevenueData().execute(new Runnable() { // from class: com.appsflyer.internal.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4264a.getRevenue(context);
                }
            });
        }
    }
}
