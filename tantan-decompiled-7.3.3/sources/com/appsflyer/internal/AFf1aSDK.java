package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1aSDK extends AFf1wSDK<AFg1zSDK> {

    @Nullable
    public AFg1zSDK areAllFieldsValid;

    @Nullable
    public final AFg1ySDK component1;
    private final AFd1pSDK component2;
    private final AFg1xSDK component3;
    public AFh1dSDK component4;
    private final AFe1sSDK copy;
    private final String copydefault;
    private final AFg1vSDK equals;
    private final AFg1rSDK hashCode;
    private final AFg1tSDK toString;

    public AFf1aSDK(@NonNull AFg1xSDK aFg1xSDK, @NonNull AFd1pSDK aFd1pSDK, @NonNull AFg1rSDK aFg1rSDK, @NonNull AFg1tSDK aFg1tSDK, @NonNull AFe1sSDK aFe1sSDK, @NonNull AFg1vSDK aFg1vSDK, @NonNull String str, @Nullable AFg1ySDK aFg1ySDK) {
        super(AFf1zSDK.RC_CDN, new AFf1zSDK[0], "UpdateRemoteConfiguration");
        this.areAllFieldsValid = null;
        this.component3 = aFg1xSDK;
        this.component2 = aFd1pSDK;
        this.hashCode = aFg1rSDK;
        this.toString = aFg1tSDK;
        this.copy = aFe1sSDK;
        this.equals = aFg1vSDK;
        this.copydefault = str;
        this.component1 = aFg1ySDK;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    /* JADX WARN: Code duplicated, block: B:17:0x0064 A[Catch: all -> 0x00d3, IOException -> 0x00d7, TryCatch #5 {IOException -> 0x00d7, all -> 0x00d3, blocks: (B:15:0x005c, B:17:0x0064, B:19:0x008b, B:21:0x00b2, B:24:0x00be, B:27:0x00cc, B:29:0x00d0, B:34:0x00db, B:40:0x014a, B:50:0x0168, B:52:0x0179, B:54:0x017f, B:56:0x019e), top: B:76:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:19:0x008b A[Catch: all -> 0x00d3, IOException -> 0x00d7, TryCatch #5 {IOException -> 0x00d7, all -> 0x00d3, blocks: (B:15:0x005c, B:17:0x0064, B:19:0x008b, B:21:0x00b2, B:24:0x00be, B:27:0x00cc, B:29:0x00d0, B:34:0x00db, B:40:0x014a, B:50:0x0168, B:52:0x0179, B:54:0x017f, B:56:0x019e), top: B:76:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:50:0x0168 A[Catch: all -> 0x00d3, IOException -> 0x00d7, TryCatch #5 {IOException -> 0x00d7, all -> 0x00d3, blocks: (B:15:0x005c, B:17:0x0064, B:19:0x008b, B:21:0x00b2, B:24:0x00be, B:27:0x00cc, B:29:0x00d0, B:34:0x00db, B:40:0x014a, B:50:0x0168, B:52:0x0179, B:54:0x017f, B:56:0x019e), top: B:76:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:54:0x017f A[Catch: all -> 0x00d3, IOException -> 0x00d7, TryCatch #5 {IOException -> 0x00d7, all -> 0x00d3, blocks: (B:15:0x005c, B:17:0x0064, B:19:0x008b, B:21:0x00b2, B:24:0x00be, B:27:0x00cc, B:29:0x00d0, B:34:0x00db, B:40:0x014a, B:50:0x0168, B:52:0x0179, B:54:0x017f, B:56:0x019e), top: B:76:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:56:0x019e A[Catch: all -> 0x00d3, IOException -> 0x00d7, TRY_LEAVE, TryCatch #5 {IOException -> 0x00d7, all -> 0x00d3, blocks: (B:15:0x005c, B:17:0x0064, B:19:0x008b, B:21:0x00b2, B:24:0x00be, B:27:0x00cc, B:29:0x00d0, B:34:0x00db, B:40:0x014a, B:50:0x0168, B:52:0x0179, B:54:0x017f, B:56:0x019e), top: B:76:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:76:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private AFg1zSDK component1() throws InterruptedException, InterruptedIOException {
        String mediationNetwork;
        AFLogger aFLogger;
        AFg1cSDK aFg1cSDK;
        AFe1kSDK<AFh1aSDK> revenue;
        AFh1aSDK body;
        String currencyIso4217Code;
        String currencyIso4217Code2;
        String str;
        boolean revenue2;
        AFi1vSDK monetizationNetwork;
        String str2;
        AFh1bSDK aFh1bSDK;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str3 = this.copydefault;
        String str4 = this.hashCode.component1;
        if (str4 == null || str4.trim().length() == 0) {
            AFLogger.INSTANCE.m5257w(AFg1cSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else {
            if (str3 == null) {
                AFLogger.INSTANCE.m5257w(AFg1cSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
            } else {
                mediationNetwork = AFb1iSDK.getMediationNetwork(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str3, this.component2.AFAdRevenueData.getCurrencyIso4217Code.getPackageName()}), str4);
            }
            if (mediationNetwork == null) {
                AFLogger.INSTANCE.m5256v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFg1zSDK.FAILURE;
            }
            try {
                if (this.equals.getMediationNetwork()) {
                    AFLogger.INSTANCE.m5250d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                    return AFg1zSDK.USE_CACHED;
                }
                aFLogger = AFLogger.INSTANCE;
                aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
                aFLogger.m5255i(aFg1cSDK, "Cached config is expired, updating...");
                revenue = this.copy.getMonetizationNetwork(this.equals.getMonetizationNetwork(), this.equals.AFAdRevenueData(), mediationNetwork, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).getRevenue();
                if (revenue.isSuccessful()) {
                    getMonetizationNetwork(mediationNetwork, jCurrentTimeMillis, null, null, revenue);
                    StringBuilder sb = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                    sb.append(revenue.getStatusCode());
                    aFLogger.m5257w(aFg1cSDK, sb.toString());
                    return AFg1zSDK.FAILURE;
                }
                body = revenue.getBody();
                currencyIso4217Code = revenue.getCurrencyIso4217Code("x-amz-meta-af-auth-v1");
                String currencyIso4217Code3 = revenue.getCurrencyIso4217Code("X-Af-Date");
                currencyIso4217Code2 = revenue.getCurrencyIso4217Code("CF-Cache-Status");
                str = this.hashCode.component1;
                revenue2 = new AFg1uSDK().getRevenue(currencyIso4217Code3);
                if (str != null && str.trim().length() != 0) {
                    monetizationNetwork = this.component3.getMonetizationNetwork(body, currencyIso4217Code, mediationNetwork, str);
                    if (monetizationNetwork.AFAdRevenueData()) {
                        getMonetizationNetwork(mediationNetwork, jCurrentTimeMillis, monetizationNetwork.AFAdRevenueData, currencyIso4217Code2, revenue);
                        aFLogger.m5257w(aFg1cSDK, "fetched config is not valid (MITM?) refuse to use it.");
                        return AFg1zSDK.FAILURE;
                    }
                    if (!revenue2 && (aFh1bSDK = body.getMonetizationNetwork) != null) {
                        aFh1bSDK.getMediationNetwork = null;
                    }
                    long currencyIso4217Code4 = this.equals.getCurrencyIso4217Code();
                    StringBuilder sb2 = new StringBuilder("using max-age fallback: ");
                    sb2.append(currencyIso4217Code4);
                    sb2.append(" seconds");
                    aFLogger.m5256v(aFg1cSDK, sb2.toString());
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    AFg1tSDK aFg1tSDK = this.toString;
                    str2 = mediationNetwork;
                    try {
                        try {
                            aFg1tSDK.getMediationNetwork.getRevenue("af_remote_config", Base64.encodeToString(body.AFAdRevenueData.getBytes(Charset.defaultCharset()), 2));
                            aFg1tSDK.AFAdRevenueData = aFg1tSDK.getCurrencyIso4217Code;
                            aFg1tSDK.getMediationNetwork.getRevenue("af_rc_timestamp", jCurrentTimeMillis2);
                            aFg1tSDK.getMediationNetwork.getRevenue("af_rc_max_age", currencyIso4217Code4);
                            aFg1tSDK.getCurrencyIso4217Code = body;
                            aFg1tSDK.getMonetizationNetwork = jCurrentTimeMillis2;
                            aFg1tSDK.getRevenue = currencyIso4217Code4;
                            StringBuilder sb3 = new StringBuilder("Config successfully updated, timeToLive: ");
                            sb3.append(currencyIso4217Code4);
                            sb3.append(" seconds");
                            aFLogger.m5250d(aFg1cSDK, sb3.toString());
                            getMonetizationNetwork(str2, jCurrentTimeMillis, monetizationNetwork.AFAdRevenueData, currencyIso4217Code2, revenue);
                            return AFg1zSDK.SUCCESS;
                        } catch (IOException e) {
                            e = e;
                            mediationNetwork = str2;
                            jCurrentTimeMillis = jCurrentTimeMillis;
                            IOException iOException = e;
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK2 = AFg1cSDK.REMOTE_CONTROL;
                            StringBuilder sb4 = new StringBuilder("failed to fetch remote config: ");
                            sb4.append(iOException.getMessage());
                            aFLogger2.m5254e(aFg1cSDK2, sb4.toString(), iOException, true, false, false);
                            getCurrencyIso4217Code(mediationNetwork, jCurrentTimeMillis, iOException instanceof ParsingException ? ((ParsingException) iOException).getRawResponse() : null, null, null, null, iOException);
                            if (iOException.getCause() instanceof InterruptedIOException) {
                                throw ((InterruptedIOException) iOException.getCause());
                            }
                            return AFg1zSDK.FAILURE;
                        } catch (Throwable th) {
                            th = th;
                            mediationNetwork = str2;
                            jCurrentTimeMillis = jCurrentTimeMillis;
                            Throwable th2 = th;
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK3 = AFg1cSDK.REMOTE_CONTROL;
                            StringBuilder sb5 = new StringBuilder("failed to update remote config: ");
                            sb5.append(th2.getMessage());
                            aFLogger3.m5254e(aFg1cSDK3, sb5.toString(), th2, true, false, false);
                            getCurrencyIso4217Code(mediationNetwork, jCurrentTimeMillis, null, null, null, null, th2);
                            if (th2.getCause() instanceof InterruptedException) {
                                throw ((InterruptedException) th2.getCause());
                            }
                            return AFg1zSDK.FAILURE;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        mediationNetwork = str2;
                    } catch (Throwable th3) {
                        th = th3;
                        mediationNetwork = str2;
                    }
                }
                aFLogger.m5257w(aFg1cSDK, "Dev key is not set, SDK is not started.");
                return AFg1zSDK.FAILURE;
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        mediationNetwork = null;
        if (mediationNetwork == null) {
            AFLogger.INSTANCE.m5256v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
            return AFg1zSDK.FAILURE;
        }
        if (this.equals.getMediationNetwork()) {
            AFLogger.INSTANCE.m5250d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
            return AFg1zSDK.USE_CACHED;
        }
        aFLogger = AFLogger.INSTANCE;
        aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
        aFLogger.m5255i(aFg1cSDK, "Cached config is expired, updating...");
        revenue = this.copy.getMonetizationNetwork(this.equals.getMonetizationNetwork(), this.equals.AFAdRevenueData(), mediationNetwork, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).getRevenue();
        if (revenue.isSuccessful()) {
            getMonetizationNetwork(mediationNetwork, jCurrentTimeMillis, null, null, revenue);
            StringBuilder sb6 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
            sb6.append(revenue.getStatusCode());
            aFLogger.m5257w(aFg1cSDK, sb6.toString());
            return AFg1zSDK.FAILURE;
        }
        body = revenue.getBody();
        currencyIso4217Code = revenue.getCurrencyIso4217Code("x-amz-meta-af-auth-v1");
        String currencyIso4217Code5 = revenue.getCurrencyIso4217Code("X-Af-Date");
        currencyIso4217Code2 = revenue.getCurrencyIso4217Code("CF-Cache-Status");
        str = this.hashCode.component1;
        revenue2 = new AFg1uSDK().getRevenue(currencyIso4217Code5);
        if (str != null) {
            monetizationNetwork = this.component3.getMonetizationNetwork(body, currencyIso4217Code, mediationNetwork, str);
            if (monetizationNetwork.AFAdRevenueData()) {
                getMonetizationNetwork(mediationNetwork, jCurrentTimeMillis, monetizationNetwork.AFAdRevenueData, currencyIso4217Code2, revenue);
                aFLogger.m5257w(aFg1cSDK, "fetched config is not valid (MITM?) refuse to use it.");
                return AFg1zSDK.FAILURE;
            }
            if (!revenue2) {
                aFh1bSDK.getMediationNetwork = null;
            }
            long currencyIso4217Code6 = this.equals.getCurrencyIso4217Code();
            StringBuilder sb7 = new StringBuilder("using max-age fallback: ");
            sb7.append(currencyIso4217Code6);
            sb7.append(" seconds");
            aFLogger.m5256v(aFg1cSDK, sb7.toString());
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            AFg1tSDK aFg1tSDK2 = this.toString;
            str2 = mediationNetwork;
            aFg1tSDK2.getMediationNetwork.getRevenue("af_remote_config", Base64.encodeToString(body.AFAdRevenueData.getBytes(Charset.defaultCharset()), 2));
            aFg1tSDK2.AFAdRevenueData = aFg1tSDK2.getCurrencyIso4217Code;
            aFg1tSDK2.getMediationNetwork.getRevenue("af_rc_timestamp", jCurrentTimeMillis3);
            aFg1tSDK2.getMediationNetwork.getRevenue("af_rc_max_age", currencyIso4217Code6);
            aFg1tSDK2.getCurrencyIso4217Code = body;
            aFg1tSDK2.getMonetizationNetwork = jCurrentTimeMillis3;
            aFg1tSDK2.getRevenue = currencyIso4217Code6;
            StringBuilder sb8 = new StringBuilder("Config successfully updated, timeToLive: ");
            sb8.append(currencyIso4217Code6);
            sb8.append(" seconds");
            aFLogger.m5250d(aFg1cSDK, sb8.toString());
            getMonetizationNetwork(str2, jCurrentTimeMillis, monetizationNetwork.AFAdRevenueData, currencyIso4217Code2, revenue);
            return AFg1zSDK.SUCCESS;
        }
        aFLogger.m5257w(aFg1cSDK, "Dev key is not set, SDK is not started.");
        return AFg1zSDK.FAILURE;
    }

    private void getCurrencyIso4217Code(String str, long j, @Nullable AFe1kSDK<?> aFe1kSDK, AFh1aSDK aFh1aSDK, AFi1uSDK aFi1uSDK, @Nullable String str2, @Nullable Throwable th) {
        long j2;
        int statusCode;
        Throwable th2;
        if (aFe1kSDK != null) {
            j2 = aFe1kSDK.getCurrencyIso4217Code.AFAdRevenueData;
            statusCode = aFe1kSDK.getStatusCode();
        } else {
            j2 = 0;
            statusCode = 0;
        }
        int i = statusCode;
        if (th instanceof HttpException) {
            Throwable cause = th.getCause();
            j2 = ((HttpException) th).getMetrics().AFAdRevenueData;
            th2 = cause;
        } else {
            th2 = th;
        }
        this.component4 = new AFh1dSDK(aFh1aSDK != null ? aFh1aSDK.getMediationNetwork : null, str, j2, System.currentTimeMillis() - j, i, aFi1uSDK, str2, th2);
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    @NonNull
    public final AFe1dSDK getMonetizationNetwork() throws Exception {
        try {
            AFg1zSDK aFg1zSDKComponent1 = component1();
            this.areAllFieldsValid = aFg1zSDKComponent1;
            return aFg1zSDKComponent1 == AFg1zSDK.FAILURE ? AFe1dSDK.FAILURE : AFe1dSDK.SUCCESS;
        } catch (InterruptedIOException e) {
            e = e;
            AFLogger.INSTANCE.m5254e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.areAllFieldsValid = AFg1zSDK.FAILURE;
            return AFe1dSDK.TIMEOUT;
        } catch (InterruptedException e2) {
            e = e2;
            AFLogger.INSTANCE.m5254e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.areAllFieldsValid = AFg1zSDK.FAILURE;
            return AFe1dSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.areAllFieldsValid = AFg1zSDK.FAILURE;
            return AFe1dSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public final long getRevenue() {
        return 1500L;
    }

    private void getMonetizationNetwork(String str, long j, AFi1uSDK aFi1uSDK, @Nullable String str2, @Nullable AFe1kSDK<AFh1aSDK> aFe1kSDK) {
        getCurrencyIso4217Code(str, j, aFe1kSDK, aFe1kSDK != null ? aFe1kSDK.getBody() : null, aFi1uSDK, str2 != null ? str2 : null, null);
    }
}
