package com.tencent.open.p104a;

import android.text.TextUtils;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import com.tencent.open.log.SLog;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: renamed from: com.tencent.open.a.b */
/* JADX INFO: loaded from: classes2.dex */
class C14351b implements InterfaceC14350a {

    /* JADX INFO: renamed from: a */
    private int f60169a = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;

    /* JADX INFO: renamed from: b */
    private int f60170b = 30000;

    /* JADX INFO: renamed from: c */
    private final String f60171c;

    public C14351b(String str) {
        this.f60171c = str;
    }

    /* JADX INFO: renamed from: b */
    private static void m84219b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC14356g m84220a(String str, Map<String, String> map, String str2, byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        int i;
        String string;
        InputStream inputStream2;
        Map<String, String> map2 = map;
        SLog.m84309i("DefaultHttpServiceImpl", "文件上传");
        String string2 = UUID.randomUUID().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + string2);
                m84218a(httpURLConnection);
                httpURLConnection.connect();
                DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                if (map2 != null) {
                    try {
                        if (map2.size() > 0) {
                            Iterator<String> it = map2.keySet().iterator();
                            while (it.hasNext()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                String strEncode = URLEncoder.encode(it.next(), "UTF-8");
                                String strEncode2 = URLEncoder.encode(map2.get(strEncode), "UTF-8");
                                stringBuffer.append("--");
                                stringBuffer.append(string2);
                                stringBuffer.append("\r\n");
                                stringBuffer.append("Content-Disposition: form-data; name=\"");
                                stringBuffer.append(strEncode);
                                stringBuffer.append("\"");
                                stringBuffer.append("\r\n");
                                stringBuffer.append("\r\n");
                                stringBuffer.append(strEncode2);
                                stringBuffer.append("\r\n");
                                String string3 = stringBuffer.toString();
                                SLog.m84309i("DefaultHttpServiceImpl", strEncode + "=" + string3 + "##");
                                dataOutputStream2.write(string3.getBytes());
                                map2 = map;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream = dataOutputStream2;
                        byteArrayOutputStream = null;
                        inputStream = null;
                    }
                }
                if (bArr == null || bArr.length <= 0) {
                    i = 0;
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("--");
                    stringBuffer2.append(string2);
                    stringBuffer2.append("\r\n");
                    stringBuffer2.append("Content-Disposition: form-data; name=\"" + str2 + "\"; filename=\"" + str2 + "\"\r\n");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Content-Type: application/octet-stream; charset=UTF-8");
                    sb.append("\r\n");
                    stringBuffer2.append(sb.toString());
                    stringBuffer2.append("\r\n");
                    dataOutputStream2.write(stringBuffer2.toString().getBytes());
                    dataOutputStream2.write(bArr, 0, bArr.length);
                    dataOutputStream2.write("\r\n".getBytes());
                    byte[] bytes = ("--" + string2 + "--\r\n").getBytes();
                    dataOutputStream2.write(bytes);
                    int length = bytes.length;
                    dataOutputStream2.flush();
                    i = length;
                }
                int responseCode = httpURLConnection.getResponseCode();
                SLog.m84309i("DefaultHttpServiceImpl", responseCode + "");
                if (responseCode == 200) {
                    InputStream inputStream3 = httpURLConnection.getInputStream();
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int i2 = inputStream3.read(bArr2);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i2);
                                dataOutputStream = dataOutputStream2;
                                m84217a(dataOutputStream);
                                m84217a(inputStream);
                                m84217a(byteArrayOutputStream);
                                m84219b(httpURLConnection);
                                throw th;
                            }
                            string = byteArrayOutputStream.toString();
                            inputStream2 = inputStream3;
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStream3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStream3;
                        dataOutputStream = dataOutputStream2;
                        byteArrayOutputStream = null;
                    }
                } else {
                    string = httpURLConnection.getResponseCode() + "";
                    byteArrayOutputStream = null;
                    inputStream2 = null;
                }
                try {
                    C14352c c14352c = new C14352c(httpURLConnection, string, httpURLConnection.getContentLength(), i, httpURLConnection.getResponseCode(), "");
                    m84217a(dataOutputStream2);
                    m84217a(inputStream2);
                    m84217a(byteArrayOutputStream);
                    m84219b(httpURLConnection);
                    return c14352c;
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = inputStream2;
                }
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = null;
                dataOutputStream = null;
            }
        } catch (Throwable th6) {
            th = th6;
            byteArrayOutputStream = null;
            dataOutputStream = null;
            httpURLConnection = null;
        }
    }

    @Override // com.tencent.open.p104a.InterfaceC14350a
    /* JADX INFO: renamed from: a */
    public InterfaceC14356g mo84211a(String str, String str2) throws IOException {
        SLog.m84309i("DefaultHttpServiceImpl", "get. ");
        if (!TextUtils.isEmpty(str2)) {
            int iIndexOf = str2.indexOf("?");
            if (iIndexOf == -1) {
                str = str + "?";
            } else if (iIndexOf != str.length() - 1) {
                str = str.concat("&");
            }
            str = str.concat(str2);
        }
        return m84215a(str, str2.length());
    }

    @Override // com.tencent.open.p104a.InterfaceC14350a
    /* JADX INFO: renamed from: a */
    public InterfaceC14356g mo84212a(String str, Map<String, String> map) throws IOException {
        SLog.m84309i("DefaultHttpServiceImpl", "post. ");
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append('&');
            }
            sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            sb.append('=');
            sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }
        String string = sb.toString();
        return m84216a(str, string.length(), string);
    }

    @Override // com.tencent.open.p104a.InterfaceC14350a
    /* JADX INFO: renamed from: a */
    public InterfaceC14356g mo84213a(String str, Map<String, String> map, Map<String, byte[]> map2) throws IOException {
        if (map2 != null && map2.size() > 0) {
            Iterator<Map.Entry<String, byte[]>> it = map2.entrySet().iterator();
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<String, byte[]> next = it.next();
            return m84220a(str, map, next.getKey(), next.getValue());
        }
        return mo84212a(str, map);
    }

    /* JADX INFO: renamed from: a */
    private void m84218a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f60171c);
        httpURLConnection.setConnectTimeout(this.f60169a);
        httpURLConnection.setReadTimeout(this.f60170b);
        httpURLConnection.setRequestProperty("Accept-Language", "zh-CN");
        httpURLConnection.setRequestProperty("Connection", HttpHeaders.KEEP_ALIVE);
        httpURLConnection.setRequestProperty("Charset", "UTF-8");
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC14356g m84215a(String str, int i) throws Throwable {
        Throwable th;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        C14352c c14352c;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                m84218a(httpURLConnection);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i2 = inputStream.read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr, 0, i2);
                            }
                            c14352c = new C14352c(httpURLConnection, byteArrayOutputStream2.toString(), httpURLConnection.getContentLength(), i, httpURLConnection.getResponseCode(), "");
                            m84217a(byteArrayOutputStream2);
                            m84217a(inputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            m84217a(byteArrayOutputStream);
                            m84217a(inputStream);
                            m84219b(httpURLConnection);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    String responseMessage = httpURLConnection.getResponseMessage();
                    if (responseMessage == null) {
                        responseMessage = "请求失败 code:" + httpURLConnection.getResponseCode();
                    }
                    c14352c = new C14352c(httpURLConnection, "", httpURLConnection.getContentLength(), i, httpURLConnection.getResponseCode(), responseMessage);
                    m84217a((Closeable) null);
                    m84217a((Closeable) null);
                }
                m84219b(httpURLConnection);
                return c14352c;
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            httpURLConnection = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC14356g m84216a(String str, int i, String str2) throws Throwable {
        Throwable th;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        C14352c c14352c;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("POST");
                m84218a(httpURLConnection);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestProperty("Content-Type", MimeTypes.FORM_ENCODED);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
                outputStreamWriter.write(str2);
                outputStreamWriter.flush();
                httpURLConnection.connect();
                int contentLength = httpURLConnection.getContentLength();
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i2 = inputStream.read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr, 0, i2);
                            }
                            c14352c = new C14352c(httpURLConnection, byteArrayOutputStream2.toString(), contentLength, i, httpURLConnection.getResponseCode(), "");
                            m84217a(byteArrayOutputStream2);
                            m84217a(inputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            m84217a(byteArrayOutputStream);
                            m84217a(inputStream);
                            m84219b(httpURLConnection);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    String responseMessage = httpURLConnection.getResponseMessage();
                    if (responseMessage == null) {
                        responseMessage = "Unknown fail: " + httpURLConnection.getResponseCode();
                    }
                    c14352c = new C14352c(httpURLConnection, "", 0, i, httpURLConnection.getResponseCode(), responseMessage);
                    m84217a((Closeable) null);
                    m84217a((Closeable) null);
                }
                m84219b(httpURLConnection);
                return c14352c;
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            httpURLConnection = null;
        }
    }

    @Override // com.tencent.open.p104a.InterfaceC14350a
    /* JADX INFO: renamed from: a */
    public void mo84214a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        this.f60169a = (int) j;
        this.f60170b = (int) j2;
    }

    /* JADX INFO: renamed from: a */
    private static void m84217a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
