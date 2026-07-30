package com.momo.xeengine.network;

import androidx.annotation.Keep;
import com.momo.xeengine.network.XHttpManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class XHttpManager {
    private final Map<Long, HttpURLConnection> callMap = new ConcurrentHashMap();
    private long callIndex = 0;
    private boolean enable = true;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20301a(XHttpManager xHttpManager, String str, long j, String str2, Map map, byte[] bArr, long j2) {
        xHttpManager.getClass();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            xHttpManager.callMap.put(Long.valueOf(j), httpURLConnection);
            httpURLConnection.setRequestMethod(str2);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (bArr != null && bArr.length > 0) {
                httpURLConnection.getOutputStream().write(bArr);
            }
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            byte[] byteArray = (200 > responseCode || responseCode >= 300) ? toByteArray(httpURLConnection.getErrorStream()) : toByteArray(httpURLConnection.getInputStream());
            httpURLConnection.disconnect();
            executeCallback(j2, responseCode, byteArray);
        } catch (Throwable th) {
            executeCallback(j2, -1, th.toString().getBytes());
        }
    }

    private static native void executeCallback(long j, int i, byte[] bArr);

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                inputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public long asyncRequest(final String str, final String str2, final Map<String, String> map, final byte[] bArr, final long j) {
        final long j2;
        if (!this.enable) {
            return -1L;
        }
        synchronized (this) {
            j2 = this.callIndex;
            this.callIndex = 1 + j2;
        }
        Thread thread = new Thread(new Runnable() { // from class: l.ucq0
            @Override // java.lang.Runnable
            public final void run() {
                XHttpManager.m20301a(this.f175844a, str, j2, str2, map, bArr, j);
            }
        });
        thread.setName("[XENGINE HTTP]" + j2);
        thread.start();
        return j2;
    }

    public void cancel(long j) {
        HttpURLConnection httpURLConnection = this.callMap.get(Long.valueOf(j));
        if (httpURLConnection != null) {
            this.callMap.remove(Long.valueOf(j));
            httpURLConnection.disconnect();
        }
    }

    public void close() {
        this.enable = false;
        Iterator<HttpURLConnection> it = this.callMap.values().iterator();
        while (it.hasNext()) {
            it.next().disconnect();
        }
        this.callMap.clear();
    }
}
