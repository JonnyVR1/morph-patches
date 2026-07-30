package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1nSDK {
    private final int getCurrencyIso4217Code;

    public AFe1nSDK(int i) {
        this.getCurrencyIso4217Code = i;
    }

    private static void AFAdRevenueData(AFe1jSDK aFe1jSDK, Throwable th, AFe1oSDK aFe1oSDK, boolean z) {
        StringBuilder sb = new StringBuilder("error: ");
        sb.append(th);
        sb.append("\n took ");
        sb.append(aFe1oSDK.AFAdRevenueData);
        sb.append("ms");
        String string = sb.toString();
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(aFe1jSDK.hashCode());
        sb2.append("] ");
        sb2.append(string);
        aFLogger.m5244e(aFg1cSDK, sb2.toString(), th, false, false, z);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    @NonNull
    private static String getCurrencyIso4217Code(HttpURLConnection httpURLConnection, boolean z) throws Throwable {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader = null;
        try {
            InputStream inputStream = z ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            if (inputStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z2 = true;
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            String string = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return string;
                        }
                        if (!z2) {
                            sb.append('\n');
                        }
                        sb.append(line);
                        z2 = false;
                    } catch (Throwable th) {
                        bufferedReader = bufferedReader2;
                        th = th;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        throw th;
    }

    public final AFe1kSDK<String> getRevenue(AFe1jSDK aFe1jSDK) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                byte[] mediationNetwork = aFe1jSDK.getMediationNetwork();
                StringBuilder sb = new StringBuilder();
                sb.append(aFe1jSDK.getMediationNetwork);
                sb.append(":");
                sb.append(aFe1jSDK.getRevenue);
                StringBuilder sb2 = new StringBuilder(sb.toString());
                byte[] mediationNetwork2 = aFe1jSDK.getMediationNetwork();
                if (aFe1jSDK.getRevenue() && mediationNetwork2 != null) {
                    String str = aFe1jSDK.getCurrencyIso4217Code() ? "<encrypted>" : new String(mediationNetwork2, Charset.defaultCharset());
                    sb2.append("\n payload: ");
                    sb2.append(str);
                }
                for (Map.Entry<String, String> entry : aFe1jSDK.getMonetizationNetwork.entrySet()) {
                    sb2.append("\n ");
                    sb2.append(entry.getKey());
                    sb2.append(": ");
                    sb2.append(entry.getValue());
                }
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append(aFe1jSDK.hashCode());
                sb3.append("] ");
                sb3.append((Object) sb2);
                AFLogger.INSTANCE.m5240d(AFg1cSDK.HTTP_CLIENT, sb3.toString());
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFe1jSDK.getRevenue).openConnection();
                try {
                    httpURLConnection2.setRequestMethod(aFe1jSDK.getMediationNetwork);
                    if (aFe1jSDK.AFAdRevenueData()) {
                        httpURLConnection2.setUseCaches(false);
                    }
                    if (!aFe1jSDK.component1()) {
                        httpURLConnection2.setInstanceFollowRedirects(false);
                    }
                    int i = this.getCurrencyIso4217Code;
                    int i2 = aFe1jSDK.component1;
                    if (i2 != -1) {
                        i = i2;
                    }
                    httpURLConnection2.setConnectTimeout(i);
                    httpURLConnection2.setReadTimeout(i);
                    httpURLConnection2.addRequestProperty("Content-Type", aFe1jSDK.getCurrencyIso4217Code() ? OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE : "application/json");
                    for (Map.Entry<String, String> entry2 : aFe1jSDK.getMonetizationNetwork.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (mediationNetwork != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(mediationNetwork.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb4.toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(mediationNetwork);
                                bufferedOutputStream2.close();
                            } catch (Throwable th) {
                                th = th;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    boolean z = httpURLConnection2.getResponseCode() / 100 == 2;
                    String currencyIso4217Code = aFe1jSDK.getMonetizationNetwork() ? getCurrencyIso4217Code(httpURLConnection2, z) : "";
                    AFe1oSDK aFe1oSDK = new AFe1oSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    StringBuilder sb5 = new StringBuilder("response code:");
                    sb5.append(httpURLConnection2.getResponseCode());
                    sb5.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb5.append(httpURLConnection2.getResponseMessage());
                    sb5.append("\n body:");
                    sb5.append(currencyIso4217Code);
                    sb5.append("\n took ");
                    sb5.append(aFe1oSDK.AFAdRevenueData);
                    sb5.append("ms");
                    String string = sb5.toString();
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb6 = new StringBuilder("[");
                    sb6.append(aFe1jSDK.hashCode());
                    sb6.append("] ");
                    sb6.append(string);
                    aFLogger.m5240d(aFg1cSDK, sb6.toString());
                    HashMap map = new HashMap(httpURLConnection2.getHeaderFields());
                    map.remove(null);
                    AFe1kSDK<String> aFe1kSDK = new AFe1kSDK<>(currencyIso4217Code, httpURLConnection2.getResponseCode(), z, map, aFe1oSDK);
                    httpURLConnection2.disconnect();
                    return aFe1kSDK;
                } catch (Exception e) {
                    e = e;
                    AFe1oSDK aFe1oSDK2 = new AFe1oSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    AFAdRevenueData(aFe1jSDK, e, aFe1oSDK2, false);
                    throw new HttpException(e, aFe1oSDK2);
                } catch (Throwable th3) {
                    th = th3;
                    AFe1oSDK aFe1oSDK3 = new AFe1oSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                    AFAdRevenueData(aFe1jSDK, th, aFe1oSDK3, true);
                    throw new HttpException(th, aFe1oSDK3);
                }
            } catch (Throwable th4) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th4;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
