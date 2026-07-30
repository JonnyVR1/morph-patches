package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1iSDK extends AFf1wSDK<Map<String, Object>> {
    private static final int areAllFieldsValid = 2000;
    private final Context component1;
    private final Uri component2;
    private Map<String, Object> component3;
    private final AFc1kSDK component4;
    private final List<String> copydefault;

    public AFf1iSDK(@NonNull Context context, @NonNull AFc1kSDK aFc1kSDK, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFf1zSDK.RESOLVE_ESP, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "ResolveEsp");
        this.component1 = context;
        this.component4 = aFc1kSDK;
        this.component2 = uri;
        this.copydefault = list;
    }

    private boolean AFAdRevenueData(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(this.copydefault);
        AFLogger.afRDLog(sb.toString());
        try {
            return this.copydefault.contains(new URL(str).getHost());
        } catch (MalformedURLException e) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: u_ */
    private static Map<String, Object> m5244u_(Uri uri) {
        HashMap map = new HashMap();
        try {
            StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
            sb.append(uri.toString());
            AFLogger.afDebugLog(sb.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = areAllFieldsValid;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.15.0");
            int responseCode = httpURLConnection.getResponseCode();
            map.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put(ShareConstants.RES_PATH, httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return map;
        } catch (Throwable th) {
            map.put("error", th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
            return map;
        }
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    @NonNull
    public final AFe1dSDK getMonetizationNetwork() throws Exception {
        Integer num = null;
        if (!AFAdRevenueData(this.component2.toString())) {
            AFb1tSDK.getMonetizationNetwork().m5213h_(this.component1, this.component4, this.component2, null);
            return AFe1dSDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.component2.toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String str = null;
        while (i < 5) {
            Map<String, Object> mapM5244u_ = m5244u_(Uri.parse(string));
            String str2 = (String) mapM5244u_.get(ShareConstants.RES_PATH);
            Integer num2 = (Integer) mapM5244u_.get(NotificationCompat.CATEGORY_STATUS);
            String str3 = (String) mapM5244u_.get("error");
            if (str2 == null || !AFAdRevenueData(str2)) {
                str = str3;
                string = str2;
                num = num2;
                break;
            }
            if (i < 4) {
                arrayList.add(str2);
            }
            i++;
            str = str3;
            string = str2;
            num = num2;
        }
        HashMap map = new HashMap();
        map.put(ShareConstants.RES_PATH, string != null ? string : "");
        map.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            map.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            map.put("redirects", arrayList);
        }
        map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        synchronized (this.component4) {
            this.component4.AFAdRevenueData("af_deeplink_r", map);
            this.component4.AFAdRevenueData("af_deeplink", this.component2.toString());
        }
        AFb1tSDK.getMonetizationNetwork().m5213h_(this.component1, this.component4, string != null ? Uri.parse(string) : this.component2, this.component2);
        this.component3 = map;
        return AFe1dSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public final long getRevenue() {
        return Constants.ONE_MIN_IN_MILLIS;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public final boolean AFAdRevenueData() {
        return false;
    }
}
