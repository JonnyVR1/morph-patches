package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nbr;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1aSDK extends AFi1hSDK {

    @NotNull
    private final AFd1pSDK AFAdRevenueData;

    @NotNull
    private final AFi1eSDK areAllFieldsValid;

    @NotNull
    private final Runnable component2;

    @Nullable
    private String copydefault;

    @NotNull
    private final ExecutorService getCurrencyIso4217Code;

    public /* synthetic */ class AFa1zSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFi1eSDK.values().length];
            iArr[AFi1eSDK.FACEBOOK.ordinal()] = 1;
            iArr[AFi1eSDK.INSTAGRAM.ordinal()] = 2;
            iArr[AFi1eSDK.FACEBOOK_LITE.ordinal()] = 3;
            getRevenue = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFi1aSDK(@NotNull AFd1pSDK aFd1pSDK, @NotNull ExecutorService executorService, @NotNull AFi1eSDK aFi1eSDK, @NotNull Runnable runnable, @NotNull Runnable runnable2) {
        String str;
        aFd1pSDK.getClass();
        executorService.getClass();
        aFi1eSDK.getClass();
        runnable.getClass();
        runnable2.getClass();
        int i = AFi1dSDK.AFa1vSDK.AFAdRevenueData[aFi1eSDK.ordinal()];
        if (i == 1) {
            str = "facebook";
        } else if (i == 2) {
            str = "instagram";
        } else {
            if (i != 3) {
                nbr.m162172a();
                throw null;
            }
            str = "facebook_lite";
        }
        super("app", str, aFd1pSDK, runnable);
        this.AFAdRevenueData = aFd1pSDK;
        this.getCurrencyIso4217Code = executorService;
        this.areAllFieldsValid = aFi1eSDK;
        this.component2 = runnable2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d A[PHI: r0
      0x008d: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v13 java.lang.String), (r0v19 java.lang.String) binds: [B:14:0x003c, B:23:0x0063, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    private final boolean AFAdRevenueData(Context context) {
        String str;
        if (!getMonetizationNetwork()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String revenue = this.AFAdRevenueData.getRevenue("com.facebook.sdk.ApplicationId");
        String strW0 = revenue != null ? StringsKt.m94347w0(revenue, "fb") : null;
        if (strW0 == null || strW0.length() == 0) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            strW0 = null;
        }
        if (strW0 == null) {
            String strAFAdRevenueData = this.AFAdRevenueData.AFAdRevenueData("facebook_application_id");
            strW0 = strAFAdRevenueData != null ? StringsKt.m94347w0(strAFAdRevenueData, "fb") : null;
            if (strW0 == null || strW0.length() == 0) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                strW0 = null;
            }
            if (strW0 == null) {
                String revenue2 = this.AFAdRevenueData.getRevenue("com.appsflyer.FacebookApplicationId");
                strW0 = revenue2 != null ? StringsKt.m94347w0(revenue2, "fb") : null;
                if (strW0 == null || strW0.length() == 0) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    strW0 = null;
                }
                str = strW0 != null ? strW0 : null;
            }
        }
        this.copydefault = str;
        if (str == null) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (getMediationNetwork(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    private static boolean component1(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:70:0x0212 A[PHI: r19
      0x0212: PHI (r19v3 android.content.ContentProviderClient) = 
      (r19v2 android.content.ContentProviderClient)
      (r19v4 android.content.ContentProviderClient)
      (r19v4 android.content.ContentProviderClient)
     binds: [B:80:0x0256, B:69:0x0210, B:74:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0224  */
    /* JADX WARN: Code duplicated, block: B:79:0x0253  */
    public static final void getCurrencyIso4217Code(AFi1aSDK aFi1aSDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Cursor cursor;
        Cursor cursor2;
        Uri uri;
        String string;
        String str;
        aFi1aSDK.getClass();
        context.getClass();
        aFi1aSDK.component4 = System.currentTimeMillis();
        aFi1aSDK.component3 = AFj1zSDK.AFa1zSDK.STARTED;
        aFi1aSDK.addObserver(new AFj1zSDK.C09834());
        String str2 = aFi1aSDK.copydefault;
        str2.getClass();
        try {
            AFi1eSDK aFi1eSDK = aFi1aSDK.areAllFieldsValid;
            int[] iArr = AFa1zSDK.getRevenue;
            int i = iArr[aFi1eSDK.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (component1(context)) {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                        uri = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/".concat(String.valueOf(str2)));
                    } else {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                        uri = null;
                    }
                } else if (getRevenue(context)) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                    uri = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(String.valueOf(str2)));
                } else {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                    uri = null;
                }
            } else if (getCurrencyIso4217Code(context)) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                uri = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/".concat(String.valueOf(str2)));
            } else {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                uri = null;
            }
            if (uri != null) {
                contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.query(uri, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex("install_referrer");
                                if (columnIndex != -1) {
                                    string = cursorQuery.getString(columnIndex);
                                } else {
                                    AFLogger aFLogger = AFLogger.INSTANCE;
                                    AFg1cSDK aFg1cSDK = AFg1cSDK.META_REFERRER;
                                    StringBuilder sb = new StringBuilder("No such column, ");
                                    sb.append(aFi1aSDK.areAllFieldsValid);
                                    sb.append(" provider");
                                    AFh1ySDK.d$default(aFLogger, aFg1cSDK, sb.toString(), false, 4, null);
                                    string = null;
                                }
                                if (string != null) {
                                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.META_REFERRER;
                                    StringBuilder sb2 = new StringBuilder("Collected ");
                                    sb2.append(aFi1aSDK.areAllFieldsValid);
                                    sb2.append(" attribution data.");
                                    AFh1ySDK.d$default(aFLogger2, aFg1cSDK2, sb2.toString(), false, 4, null);
                                    Map<String, Object> map = aFi1aSDK.getMediationNetwork;
                                    map.getClass();
                                    map.put("response", "OK");
                                    Map<String, Object> map2 = aFi1aSDK.getMediationNetwork;
                                    map2.getClass();
                                    map2.put("referrer", string);
                                    int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                                    Long lValueOf = columnIndex2 != -1 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
                                    if (lValueOf != null) {
                                        aFi1aSDK.getMediationNetwork.put("click_ts", Long.valueOf(lValueOf.longValue()));
                                    }
                                    int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
                                    Integer numValueOf = columnIndex3 != -1 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
                                    if (numValueOf != null) {
                                        aFi1aSDK.getMediationNetwork.put("meta_custom", MapsKt.mutableMapOf(TuplesKt.m88129a("is_ct", Integer.valueOf(numValueOf.intValue()))));
                                    }
                                    int i2 = iArr[aFi1aSDK.areAllFieldsValid.ordinal()];
                                    if (i2 == 1) {
                                        str = "com.facebook.katana";
                                    } else if (i2 == 2) {
                                        str = "com.instagram.android";
                                    } else {
                                        if (i2 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        str = "com.facebook.lite";
                                    }
                                    Map<String, Object> map3 = aFi1aSDK.getMediationNetwork;
                                    map3.getClass();
                                    map3.put("api_ver", Long.valueOf(AFb1vSDK.getRevenue(context, str)));
                                    Map<String, Object> map4 = aFi1aSDK.getMediationNetwork;
                                    map4.getClass();
                                    map4.put("api_ver_name", AFb1vSDK.getMonetizationNetwork(context, str));
                                }
                                cursorQuery.close();
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } else {
                                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            }
                        } catch (Throwable th2) {
                            cursor = cursorQuery;
                            th = th2;
                            try {
                                AFLogger aFLogger3 = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK3 = AFg1cSDK.META_REFERRER;
                                StringBuilder sb3 = new StringBuilder("Error while collecting Meta Install Referrer for ");
                                sb3.append(aFi1aSDK.areAllFieldsValid.name());
                                sb3.append(" provider");
                                AFh1ySDK.e$default(aFLogger3, aFg1cSDK3, sb3.toString(), th, false, false, false, false, 120, null);
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } catch (Throwable th3) {
                                Cursor cursor3 = cursor;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                                throw th3;
                            }
                        }
                    } else {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor = null;
                    AFLogger aFLogger4 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK4 = AFg1cSDK.META_REFERRER;
                    StringBuilder sb4 = new StringBuilder("Error while collecting Meta Install Referrer for ");
                    sb4.append(aFi1aSDK.areAllFieldsValid.name());
                    sb4.append(" provider");
                    AFh1ySDK.e$default(aFLogger4, aFg1cSDK4, sb4.toString(), th, false, false, false, false, 120, null);
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    aFi1aSDK.AFAdRevenueData();
                    aFi1aSDK.component2.run();
                }
            }
        } catch (Throwable th5) {
            th = th5;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        }
        aFi1aSDK.AFAdRevenueData();
        aFi1aSDK.component2.run();
    }

    private final boolean getMediationNetwork(Context context) {
        int i = AFa1zSDK.getRevenue[this.areAllFieldsValid.ordinal()];
        if (i == 1) {
            return getCurrencyIso4217Code(context);
        }
        if (i == 2) {
            return getRevenue(context);
        }
        if (i == 3) {
            return component1(context);
        }
        nbr.m162172a();
        return false;
    }

    private static boolean getRevenue(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    @SuppressLint({"NewApi"})
    public final void getMonetizationNetwork(@NotNull final Context context) {
        context.getClass();
        if (AFAdRevenueData(context)) {
            this.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.z
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1aSDK.getCurrencyIso4217Code(this.f4308a, context);
                }
            });
        } else {
            this.component2.run();
        }
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }
}
