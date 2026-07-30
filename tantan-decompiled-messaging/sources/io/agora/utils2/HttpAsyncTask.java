package io.agora.utils2;

import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class HttpAsyncTask extends AsyncTask<HttpAsyncTaskParam, Void, Void> {
    private static final int RESPONSE_COMPLETED = 1;
    private static final int RESPONSE_COMPLETED_REASON_NONE = 0;
    private static final int RESPONSE_COMPLETED_REASON_OTHER_ERROR = 4;
    private static final int RESPONSE_COMPLETED_REASON_SOCKET_TIMEOUT = 3;
    private static final int RESPONSE_COMPLETED_REASON_SUCCESS = 1;
    private static final int RESPONSE_COMPLETED_REASON_UNKNOWN_HOST = 2;
    private static final int RESPONSE_ON_GOING = 0;
    private static final int SIZE_FOR_CALLBACK = 16384;
    private static final String TAG = "HttpAsyncTask";
    private long nativeHandle;

    public HttpAsyncTask(long j) {
        this.nativeHandle = j;
    }

    private static native int nativeNotifyResponse(long j, int i, int i2, int i3, byte[] bArr, int i4, Map<String, String> map);

    private int notifyNativeResponse(int i, int i2, int i3, byte[] bArr, Map<String, String> map) {
        return nativeNotifyResponse(this.nativeHandle, i, i2, i3, bArr, bArr != null ? bArr.length : 0, map);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01e4 A[Catch: Exception -> 0x002f, SocketTimeoutException -> 0x0210, UnknownHostException -> 0x0217, TRY_ENTER, TryCatch #9 {SocketTimeoutException -> 0x0210, UnknownHostException -> 0x0217, Exception -> 0x002f, blocks: (B:7:0x001d, B:9:0x0028, B:10:0x002c, B:14:0x0037, B:16:0x003b, B:17:0x0043, B:19:0x0049, B:20:0x005f, B:22:0x0063, B:24:0x0069, B:26:0x006d, B:28:0x0073, B:29:0x00a9, B:31:0x00ad, B:33:0x00b3, B:34:0x00ba, B:36:0x00cc, B:37:0x00d4, B:39:0x00de, B:40:0x00e1, B:42:0x00e5, B:43:0x00f6, B:45:0x0105, B:46:0x010d, B:48:0x0113, B:56:0x0135, B:57:0x0139, B:59:0x013e, B:61:0x0142, B:64:0x0147, B:66:0x014d, B:112:0x01ee, B:69:0x015a, B:101:0x01c1, B:109:0x01e4, B:115:0x01f7, B:116:0x01fa, B:13:0x0032), top: B:133:0x001d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // android.os.AsyncTask
    public Void doInBackground(HttpAsyncTaskParam... httpAsyncTaskParamArr) throws Throwable {
        int i;
        HashMap map;
        DataInputStream dataInputStream;
        byte[] bArr;
        byte[] byteArray;
        byte[] bytes;
        DataInputStream dataInputStream2;
        String str;
        int i2 = 1;
        if (httpAsyncTaskParamArr.length < 1) {
            notifyNativeResponse(404, 1, 4, null, null);
            return null;
        }
        int i3 = 0;
        HttpAsyncTaskParam httpAsyncTaskParam = httpAsyncTaskParamArr[0];
        try {
            URL url = new URL(httpAsyncTaskParam.fullUrl);
            Proxy proxy = httpAsyncTaskParam.httpProxy;
            ?? r9 = (HttpURLConnection) (proxy != null ? url.openConnection(proxy) : url.openConnection());
            HashMap<String, String> map2 = httpAsyncTaskParam.headers;
            if (map2 != null) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    r9.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            String str2 = httpAsyncTaskParam.user;
            if (str2 != null && !str2.isEmpty() && (str = httpAsyncTaskParam.pass) != null && !str.isEmpty()) {
                String strEncodeToString = Base64.encodeToString((httpAsyncTaskParam.user + ":" + httpAsyncTaskParam.pass).getBytes(), 0);
                StringBuilder sb = new StringBuilder();
                sb.append("Basic ");
                sb.append(strEncodeToString);
                r9.setRequestProperty("Authorization", sb.toString());
            }
            String str3 = httpAsyncTaskParam.agent;
            if (str3 != null && !str3.isEmpty()) {
                r9.setRequestProperty("User-Agent", httpAsyncTaskParam.agent);
            }
            r9.setRequestMethod(httpAsyncTaskParam.method);
            r9.setDoInput(true);
            r9.setUseCaches(false);
            r9.setInstanceFollowRedirects(false);
            int i4 = httpAsyncTaskParam.timeout_millsec;
            if (i4 > 0) {
                r9.setConnectTimeout(i4);
                r9.setReadTimeout(httpAsyncTaskParam.timeout_millsec);
            }
            if ("POST".equals(httpAsyncTaskParam.method)) {
                r9.setDoOutput(true);
            }
            if (httpAsyncTaskParam.body != null) {
                DataOutputStream dataOutputStream = new DataOutputStream(r9.getOutputStream());
                dataOutputStream.write(httpAsyncTaskParam.body);
                dataOutputStream.flush();
            }
            int responseCode = r9.getResponseCode();
            Map<String, List<String>> headerFields = r9.getHeaderFields();
            HashMap map3 = new HashMap();
            if (headerFields != null) {
                for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                    String key = entry2.getKey();
                    String str4 = entry2.getValue().get(0);
                    if (key == null) {
                        key = "";
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    map3.put(key, str4);
                }
            }
            int i5 = 0;
            if (responseCode / 100 == 2 || responseCode / 100 == 3 || responseCode / 100 == 4) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[4096];
                    try {
                        try {
                            if (responseCode / 100 == 4) {
                                try {
                                    dataInputStream2 = new DataInputStream(r9.getErrorStream());
                                } catch (Exception e) {
                                    e = e;
                                    dataInputStream = null;
                                    bArr = null;
                                    map = map3;
                                    Log.e(TAG, "got exception " + e.toString());
                                    if (dataInputStream != null) {
                                        dataInputStream.close();
                                    }
                                    responseCode = 404;
                                    i2 = 4;
                                    byteArray = bArr;
                                    bytes = byteArray;
                                    i5 = i2;
                                    notifyNativeResponse(responseCode, 1, i5, bytes, map);
                                    return null;
                                }
                            } else {
                                dataInputStream2 = new DataInputStream(r9.getInputStream());
                            }
                            dataInputStream = dataInputStream2;
                            bArr = null;
                            try {
                                while (true) {
                                    try {
                                        int i6 = dataInputStream.read(bArr2);
                                        if (i6 <= 0) {
                                            map = map3;
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr2, i3, i6);
                                        if (byteArrayOutputStream.size() >= 16384) {
                                            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                            map = map3;
                                            try {
                                                if (notifyNativeResponse(responseCode, 0, 0, byteArray2, map) != 0) {
                                                    bArr = byteArray2;
                                                    break;
                                                }
                                                byteArrayOutputStream.reset();
                                                bArr = byteArray2;
                                                map3 = map;
                                            } catch (Exception e2) {
                                                e = e2;
                                                bArr = byteArray2;
                                            }
                                            Log.e(TAG, "got exception " + e.toString());
                                            if (dataInputStream != null) {
                                                dataInputStream.close();
                                            }
                                            responseCode = 404;
                                            i2 = 4;
                                            byteArray = bArr;
                                            bytes = byteArray;
                                            i5 = i2;
                                        }
                                        i3 = 0;
                                    } catch (Exception e3) {
                                        e = e3;
                                        map = map3;
                                    }
                                }
                                byteArray = byteArrayOutputStream.toByteArray();
                                dataInputStream.close();
                            } catch (Exception e4) {
                                e = e4;
                                Log.e(TAG, "got exception " + e.toString());
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                responseCode = 404;
                                i2 = 4;
                                byteArray = bArr;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r9 = 0;
                            if (r9 != 0) {
                                r9.close();
                            }
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        map = map3;
                        dataInputStream = null;
                        bArr = null;
                    }
                    bytes = byteArray;
                    i5 = i2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                String responseMessage = r9.getResponseMessage();
                bytes = responseMessage != null ? responseMessage.getBytes() : null;
                map = map3;
            }
            notifyNativeResponse(responseCode, 1, i5, bytes, map);
            return null;
        } catch (SocketTimeoutException unused) {
            Log.e(TAG, "got time out exception");
            i = 3;
            notifyNativeResponse(404, 1, i, null, null);
            return null;
        } catch (UnknownHostException unused2) {
            Log.e(TAG, "got unknown host exception");
            i = 2;
            notifyNativeResponse(404, 1, i, null, null);
            return null;
        } catch (Exception e6) {
            Log.e(TAG, "got exception " + e6.toString());
            i = 4;
            notifyNativeResponse(404, 1, i, null, null);
            return null;
        }
    }
}
