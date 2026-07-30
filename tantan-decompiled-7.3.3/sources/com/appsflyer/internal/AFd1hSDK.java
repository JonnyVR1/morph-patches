package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.p122io.TextStreamsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\u0005H'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\f\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u000b8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001c"}, m88121d2 = {"Lcom/appsflyer/internal/AFd1hSDK;", "", "", "p0", "", "", "p1", "", "p2", "<init>", "([BLjava/util/Map;I)V", "", "getMonetizationNetwork", "()Z", "getMediationNetwork", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/net/HttpURLConnection;", "", "(Ljava/net/HttpURLConnection;J)Z", "getRevenue", "[B", "AFAdRevenueData", "Lcom/appsflyer/internal/AFe1uSDK;", "()Lcom/appsflyer/internal/AFe1uSDK;", "Ljava/util/Map;", "Z", "getCurrencyIso4217Code", "I", "()Ljava/lang/String;", "areAllFieldsValid"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
public abstract class AFd1hSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final boolean getMediationNetwork;
    public int getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @Nullable
    public Map<String, String> getMonetizationNetwork;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    public byte[] AFAdRevenueData;

    public AFd1hSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i) {
        bArr.getClass();
        this.AFAdRevenueData = bArr;
        this.getMonetizationNetwork = map;
        this.getCurrencyIso4217Code = i;
        this.getMediationNetwork = true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0143  */
    private final boolean getMonetizationNetwork(HttpURLConnection httpURLConnection, long j) throws IOException {
        String strJoinToString$default;
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb = new StringBuilder();
        sb.append(httpURLConnection.getRequestMethod());
        sb.append(':');
        sb.append(httpURLConnection.getURL());
        StringBuilder sb2 = new StringBuilder(sb.toString());
        sb2.append("\n length: ");
        sb2.append(new String(this.AFAdRevenueData, Charsets.UTF_8).length());
        Map<String, String> map = this.getMonetizationNetwork;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
        }
        StringBuilder sb3 = new StringBuilder("HTTP: [");
        sb3.append(httpURLConnection.hashCode());
        sb3.append("] ");
        sb3.append((Object) sb2);
        String mediationNetwork = getMediationNetwork(sb3.toString());
        if (getGetMediationNetwork()) {
            AFLogger.afRDLog(mediationNetwork);
        } else {
            AFLogger.afVerboseLog(mediationNetwork);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.getCurrencyIso4217Code);
        httpURLConnection.setConnectTimeout(this.getCurrencyIso4217Code);
        httpURLConnection.addRequestProperty("Content-Type", getGetRevenue().getMonetizationNetwork);
        Map<String, String> map2 = this.getMonetizationNetwork;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.AFAdRevenueData.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.getClass();
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.AFAdRevenueData);
        bufferedOutputStream.close();
        InputStream inputStream = AFe1vSDK.getRevenue(httpURLConnection) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
            strJoinToString$default = CollectionsKt.joinToString$default(TextStreamsKt.m88313f(bufferedReader), null, null, null, 0, null, null, 63, null);
            bufferedReader.close();
            if (strJoinToString$default == null) {
                strJoinToString$default = "";
            }
        } else {
            strJoinToString$default = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        StringBuilder sb4 = new StringBuilder("response code:");
        sb4.append(httpURLConnection.getResponseCode());
        sb4.append(' ');
        sb4.append(httpURLConnection.getResponseMessage());
        sb4.append("\n\tbody:");
        sb4.append(strJoinToString$default);
        sb4.append("\n\ttook ");
        sb4.append(jCurrentTimeMillis);
        sb4.append("ms");
        String string = sb4.toString();
        StringBuilder sb5 = new StringBuilder("HTTP: [");
        sb5.append(httpURLConnection.hashCode());
        sb5.append("] ");
        sb5.append(string);
        String mediationNetwork2 = getMediationNetwork(sb5.toString());
        if (getGetMediationNetwork()) {
            AFLogger.afRDLog(mediationNetwork2);
        } else {
            AFLogger.afVerboseLog(mediationNetwork2);
        }
        return AFe1vSDK.getRevenue(httpURLConnection);
    }

    @JvmName
    @NotNull
    /* JADX INFO: renamed from: AFAdRevenueData */
    public abstract AFe1uSDK getGetRevenue();

    @JvmName
    @NotNull
    public abstract String getCurrencyIso4217Code();

    @NotNull
    public abstract String getMediationNetwork(@NotNull String str);

    @JvmName
    /* JADX INFO: renamed from: getRevenue, reason: from getter */
    public boolean getGetMediationNetwork() {
        return this.getMediationNetwork;
    }

    @WorkerThread
    public final boolean getMonetizationNetwork() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String currencyIso4217Code = getCurrencyIso4217Code();
            currencyIso4217Code.getClass();
            URLConnection uRLConnectionOpenConnection = new URL(currencyIso4217Code).openConnection();
            if (uRLConnectionOpenConnection != null) {
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    boolean monetizationNetwork = getMonetizationNetwork(httpURLConnection, jCurrentTimeMillis);
                    httpURLConnection.disconnect();
                    return monetizationNetwork;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        StringBuilder sb = new StringBuilder("error: ");
                        sb.append(th);
                        sb.append("\n\ttook ");
                        sb.append(jCurrentTimeMillis2);
                        sb.append("ms\n\t");
                        sb.append(th.getMessage());
                        String string = sb.toString();
                        StringBuilder sb2 = new StringBuilder("HTTP: [");
                        sb2.append(httpURLConnection != null ? httpURLConnection.hashCode() : 0);
                        sb2.append("] ");
                        sb2.append(string);
                        String mediationNetwork = getMediationNetwork(sb2.toString());
                        if (getGetMediationNetwork()) {
                            AFLogger.afRDLog(mediationNetwork);
                        } else {
                            AFLogger.afVerboseLog(mediationNetwork);
                        }
                        return false;
                    } finally {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (Throwable th3) {
            httpURLConnection = null;
            th = th3;
        }
    }
}
