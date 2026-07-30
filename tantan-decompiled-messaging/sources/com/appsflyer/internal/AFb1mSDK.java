package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.Nullable;
import io.agora.utils2.internal.CommonUtility;

/* JADX INFO: loaded from: classes.dex */
final class AFb1mSDK extends AFc1cSDK<String> {
    public AFb1mSDK(Context context, AFd1fSDK aFd1fSDK) {
        super(context, aFd1fSDK, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1cSDK
    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
    public String getMonetizationNetwork() throws Throwable {
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.getMediationNetwork.getContentResolver();
            StringBuilder sb = new StringBuilder(CommonUtility.PREFIX_URI);
            sb.append(this.AFAdRevenueData);
            Cursor cursorQuery = contentResolver.query(Uri.parse(sb.toString()), new String[]{"aid"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("aid"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    @Nullable
    public final /* synthetic */ String AFAdRevenueData() {
        this.getMonetizationNetwork.AFAdRevenueData().execute(this.getRevenue);
        return (String) super.AFAdRevenueData();
    }

    @Nullable
    public final String getMediationNetwork() {
        this.getMonetizationNetwork.AFAdRevenueData().execute(this.getRevenue);
        return (String) super.AFAdRevenueData();
    }
}
