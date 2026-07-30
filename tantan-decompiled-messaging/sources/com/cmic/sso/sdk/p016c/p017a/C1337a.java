package com.cmic.sso.sdk.p016c.p017a;

import android.annotation.TargetApi;
import android.text.TextUtils;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.C1333b;
import com.cmic.sso.sdk.p016c.C1350c;
import com.cmic.sso.sdk.p016c.C1355d;
import com.cmic.sso.sdk.p016c.p018b.AbstractC1348g;
import com.cmic.sso.sdk.p016c.p018b.C1346e;
import com.cmic.sso.sdk.p016c.p018b.C1349h;
import com.cmic.sso.sdk.p016c.p019c.C1352b;
import com.cmic.sso.sdk.p016c.p019c.C1353c;
import com.cmic.sso.sdk.p016c.p020d.C1356a;
import com.cmic.sso.sdk.p016c.p020d.C1357b;
import com.cmic.sso.sdk.p016c.p020d.InterfaceC1358c;
import com.cmic.sso.sdk.p022e.C1363c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C1337a implements InterfaceC1338b {

    /* JADX INFO: renamed from: a */
    private static C1350c f5559a;

    /* JADX WARN: Code duplicated, block: B:113:0x0257  */
    /* JADX WARN: Code duplicated, block: B:115:0x025c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0264 A[Catch: all -> 0x0275, TryCatch #12 {all -> 0x0275, blocks: (B:111:0x022f, B:116:0x0260, B:118:0x0264, B:120:0x026c, B:125:0x0277), top: B:150:0x022f }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0286  */
    /* JADX WARN: Code duplicated, block: B:131:0x029e  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    @Override // com.cmic.sso.sdk.p016c.p017a.InterfaceC1338b
    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public void mo7089a(C1353c c1353c, InterfaceC1358c interfaceC1358c, C1316a c1316a) throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        InputStream inputStream;
        int responseCode;
        String string;
        int i;
        String string2;
        boolean z;
        HttpURLConnection httpURLConnection2;
        String str = "";
        C1363c.m7234b("ConnectionInterceptor", "请求地址: " + c1353c.m7168a());
        StringBuilder sb = new StringBuilder();
        try {
            String strM7168a = c1353c.m7168a();
            URL url = new URL(strM7168a);
            final String host = url.getHost();
            AbstractC1348g abstractC1348gM7181j = c1353c.m7181j();
            if ((abstractC1348gM7181j instanceof C1349h) || (abstractC1348gM7181j instanceof C1346e)) {
                String strM6968b = c1316a.m6968b("remote_ip");
                if (TextUtils.isEmpty(strM6968b)) {
                    z = false;
                } else {
                    url = new URL(strM7168a.replaceFirst(host, strM6968b));
                    z = true;
                }
            } else {
                z = false;
            }
            if (c1353c.m7178g() != null) {
                C1363c.m7234b("ConnectionInterceptor", "开始wifi下取号");
                httpURLConnection = (HttpURLConnection) c1353c.m7178g().openConnection(url);
            } else {
                C1363c.m7234b("ConnectionInterceptor", "使用当前网络环境发送请求");
                httpURLConnection = (HttpURLConnection) url.openConnection();
            }
            try {
                Map<String, String> mapM7174c = c1353c.m7174c();
                if (mapM7174c != null) {
                    try {
                        for (String str2 : mapM7174c.keySet()) {
                            boolean z2 = z;
                            httpURLConnection.addRequestProperty(str2, mapM7174c.get(str2));
                            z = z2;
                        }
                    } catch (Exception e) {
                        e = e;
                        outputStream = null;
                        inputStream = null;
                        responseCode = -1;
                        try {
                            e.printStackTrace();
                            C1363c.m7232a("ConnectionInterceptor", "请求失败: " + c1353c.m7168a());
                            c1316a.m6956a().f5667a.add(e);
                            if (e instanceof EOFException) {
                                i = 200050;
                            } else {
                                i = 102102;
                            }
                            responseCode = i;
                            if (e instanceof UnknownHostException) {
                                c1316a.m6961a("remote_ip", m7086a());
                            }
                            m7087a(outputStream);
                            m7087a(inputStream);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            C1363c.m7234b("ConnectionInterceptor", "responseCode: " + responseCode);
                            if (TextUtils.isEmpty(sb)) {
                                string2 = str;
                            } else {
                                string2 = sb.toString();
                            }
                            C1363c.m7234b("ConnectionInterceptor", "responseResult: ".concat(string2));
                            interfaceC1358c.mo7093a(C1356a.m7182a(responseCode));
                        } catch (Throwable th) {
                            th = th;
                            m7087a(outputStream);
                            m7087a(inputStream);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            C1363c.m7234b("ConnectionInterceptor", "responseCode: " + responseCode);
                            if (TextUtils.isEmpty(sb)) {
                                string = str;
                            } else {
                                string = sb.toString();
                            }
                            C1363c.m7234b("ConnectionInterceptor", "responseResult: ".concat(string));
                            if (responseCode != 200 || responseCode == 301 || responseCode == 302) {
                                interfaceC1358c.mo7094a((C1357b) null);
                            } else {
                                interfaceC1358c.mo7093a(C1356a.m7182a(responseCode));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = null;
                        inputStream = null;
                        responseCode = -1;
                        m7087a(outputStream);
                        m7087a(inputStream);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        C1363c.m7234b("ConnectionInterceptor", "responseCode: " + responseCode);
                        if (TextUtils.isEmpty(sb)) {
                            string = str;
                        } else {
                            string = sb.toString();
                        }
                        C1363c.m7234b("ConnectionInterceptor", "responseResult: ".concat(string));
                        if (responseCode != 200) {
                            interfaceC1358c.mo7094a((C1357b) null);
                        } else {
                            interfaceC1358c.mo7094a((C1357b) null);
                        }
                        throw th;
                    }
                }
                boolean z3 = z;
                if ((httpURLConnection instanceof HttpsURLConnection) && ((abstractC1348gM7181j instanceof C1349h) || (abstractC1348gM7181j instanceof C1346e))) {
                    if (z3) {
                        C1363c.m7234b("ConnectionInterceptor", "host = " + host);
                        httpURLConnection.setRequestProperty("Host", host);
                        C1363c.m7234b("ConnectionInterceptor", "need sni handle");
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(new C1355d((HttpsURLConnection) httpURLConnection, c1353c.m7178g(), c1316a));
                        ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostnameVerifier() { // from class: com.cmic.sso.sdk.c.a.a.1
                            @Override // javax.net.ssl.HostnameVerifier
                            public boolean verify(String str3, SSLSession sSLSession) {
                                return HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSession);
                            }
                        });
                    } else {
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(m7088a(abstractC1348gM7181j, c1316a));
                    }
                }
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setDefaultUseCaches(false);
                String strM7176e = c1353c.m7176e();
                httpURLConnection.setRequestMethod(strM7176e);
                httpURLConnection.setDoOutput(true);
                if (c1353c instanceof C1352b) {
                    httpURLConnection.connect();
                    ((C1352b) c1353c).m7166a(c1316a);
                }
                if (strM7176e.endsWith("POST")) {
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(c1353c.m7175d().getBytes("utf-8"));
                        outputStream.flush();
                    } catch (Exception e2) {
                        e = e2;
                        str = "";
                        inputStream = null;
                        responseCode = -1;
                        e.printStackTrace();
                        C1363c.m7232a("ConnectionInterceptor", "请求失败: " + c1353c.m7168a());
                        c1316a.m6956a().f5667a.add(e);
                        if (e instanceof EOFException) {
                            i = 200050;
                        } else {
                            i = 102102;
                        }
                        responseCode = i;
                        if ((e instanceof UnknownHostException) && ((c1353c.m7181j() instanceof C1349h) || (c1353c.m7181j() instanceof C1346e))) {
                            c1316a.m6961a("remote_ip", m7086a());
                        }
                        m7087a(outputStream);
                        m7087a(inputStream);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        C1363c.m7234b("ConnectionInterceptor", "responseCode: " + responseCode);
                        if (TextUtils.isEmpty(sb)) {
                            string2 = str;
                        } else {
                            string2 = sb.toString();
                        }
                        C1363c.m7234b("ConnectionInterceptor", "responseResult: ".concat(string2));
                        interfaceC1358c.mo7093a(C1356a.m7182a(responseCode));
                    } catch (Throwable th3) {
                        th = th3;
                        str = "";
                        inputStream = null;
                        responseCode = -1;
                        m7087a(outputStream);
                        m7087a(inputStream);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        C1363c.m7234b("ConnectionInterceptor", "responseCode: " + responseCode);
                        if (TextUtils.isEmpty(sb)) {
                            string = str;
                        } else {
                            string = sb.toString();
                        }
                        C1363c.m7234b("ConnectionInterceptor", "responseResult: ".concat(string));
                        if (responseCode != 200) {
                            interfaceC1358c.mo7094a((C1357b) null);
                        } else {
                            interfaceC1358c.mo7094a((C1357b) null);
                        }
                        throw th;
                    }
                } else {
                    outputStream = null;
                }
                try {
                    responseCode = httpURLConnection.getResponseCode();
                    try {
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int i2 = inputStream.read(bArr);
                                if (i2 <= 0) {
                                    break;
                                }
                                str = str;
                                try {
                                    httpURLConnection2 = httpURLConnection;
                                    try {
                                        sb.append(new String(bArr, 0, i2, "utf-8"));
                                        str = str;
                                        httpURLConnection = httpURLConnection2;
                                    } catch (Exception e3) {
                                        e = e3;
                                        httpURLConnection = httpURLConnection2;
                                        e.printStackTrace();
                                        C1363c.m7232a("ConnectionInterceptor", "请求失败: " + c1353c.m7168a());
                                        c1316a.m6956a().f5667a.add(e);
                                        if (e instanceof EOFException) {
                                            i = 200050;
                                        } else {
                                            i = 102102;
                                        }
                                        responseCode = i;
                                        if (e instanceof UnknownHostException) {
                                            c1316a.m6961a("remote_ip", m7086a());
                                        }
                                        m7087a(outputStream);
                                        m7087a(inputStream);
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        C1363c.m7234b("ConnectionInterceptor", "responseCode: " + responseCode);
                                        if (TextUtils.isEmpty(sb)) {
                                            string2 = str;
                                        } else {
                                            string2 = sb.toString();
                                        }
                                        C1363c.m7234b("ConnectionInterceptor", "responseResult: ".concat(string2));
                                        interfaceC1358c.mo7093a(C1356a.m7182a(responseCode));
                                    } catch (Throwable th4) {
                                        th = th4;
                                        httpURLConnection = httpURLConnection2;
                                        m7087a(outputStream);
                                        m7087a(inputStream);
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        C1363c.m7234b("ConnectionInterceptor", "responseCode: " + responseCode);
                                        if (TextUtils.isEmpty(sb)) {
                                            string = str;
                                        } else {
                                            string = sb.toString();
                                        }
                                        C1363c.m7234b("ConnectionInterceptor", "responseResult: ".concat(string));
                                        if (responseCode != 200) {
                                            interfaceC1358c.mo7094a((C1357b) null);
                                        } else {
                                            interfaceC1358c.mo7094a((C1357b) null);
                                        }
                                        throw th;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    e.printStackTrace();
                                    C1363c.m7232a("ConnectionInterceptor", "请求失败: " + c1353c.m7168a());
                                    c1316a.m6956a().f5667a.add(e);
                                    if (e instanceof EOFException) {
                                        i = 200050;
                                    } else {
                                        i = 102102;
                                    }
                                    responseCode = i;
                                    if (e instanceof UnknownHostException) {
                                        c1316a.m6961a("remote_ip", m7086a());
                                    }
                                    m7087a(outputStream);
                                    m7087a(inputStream);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    C1363c.m7234b("ConnectionInterceptor", "responseCode: " + responseCode);
                                    if (TextUtils.isEmpty(sb)) {
                                        string2 = str;
                                    } else {
                                        string2 = sb.toString();
                                    }
                                    C1363c.m7234b("ConnectionInterceptor", "responseResult: ".concat(string2));
                                    interfaceC1358c.mo7093a(C1356a.m7182a(responseCode));
                                } catch (Throwable th5) {
                                    th = th5;
                                    m7087a(outputStream);
                                    m7087a(inputStream);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    C1363c.m7234b("ConnectionInterceptor", "responseCode: " + responseCode);
                                    if (TextUtils.isEmpty(sb)) {
                                        string = str;
                                    } else {
                                        string = sb.toString();
                                    }
                                    C1363c.m7234b("ConnectionInterceptor", "responseResult: ".concat(string));
                                    if (responseCode != 200) {
                                        interfaceC1358c.mo7094a((C1357b) null);
                                    } else {
                                        interfaceC1358c.mo7094a((C1357b) null);
                                    }
                                    throw th;
                                }
                            }
                            str = str;
                            httpURLConnection2 = httpURLConnection;
                            C1357b c1357b = new C1357b(responseCode, httpURLConnection2.getHeaderFields(), sb.toString());
                            m7087a(outputStream);
                            m7087a(inputStream);
                            httpURLConnection2.disconnect();
                            C1363c.m7234b("ConnectionInterceptor", "responseCode: " + responseCode);
                            C1363c.m7234b("ConnectionInterceptor", "responseResult: ".concat(TextUtils.isEmpty(sb) ? str : sb.toString()));
                            if (responseCode == 200 || responseCode == 301 || responseCode == 302) {
                                interfaceC1358c.mo7094a(c1357b);
                                return;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            str = str;
                        } catch (Throwable th6) {
                            th = th6;
                            str = str;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        str = "";
                        inputStream = null;
                    } catch (Throwable th7) {
                        th = th7;
                        str = "";
                        inputStream = null;
                    }
                } catch (Exception e7) {
                    e = e7;
                    str = "";
                    inputStream = null;
                    responseCode = -1;
                    e.printStackTrace();
                    C1363c.m7232a("ConnectionInterceptor", "请求失败: " + c1353c.m7168a());
                    c1316a.m6956a().f5667a.add(e);
                    if (e instanceof EOFException) {
                        i = 200050;
                    } else {
                        i = 102102;
                    }
                    responseCode = i;
                    if (e instanceof UnknownHostException) {
                        c1316a.m6961a("remote_ip", m7086a());
                    }
                    m7087a(outputStream);
                    m7087a(inputStream);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    C1363c.m7234b("ConnectionInterceptor", "responseCode: " + responseCode);
                    if (TextUtils.isEmpty(sb)) {
                        string2 = str;
                    } else {
                        string2 = sb.toString();
                    }
                    C1363c.m7234b("ConnectionInterceptor", "responseResult: ".concat(string2));
                    interfaceC1358c.mo7093a(C1356a.m7182a(responseCode));
                } catch (Throwable th8) {
                    th = th8;
                    str = "";
                    inputStream = null;
                    responseCode = -1;
                    m7087a(outputStream);
                    m7087a(inputStream);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    C1363c.m7234b("ConnectionInterceptor", "responseCode: " + responseCode);
                    if (TextUtils.isEmpty(sb)) {
                        string = str;
                    } else {
                        string = sb.toString();
                    }
                    C1363c.m7234b("ConnectionInterceptor", "responseResult: ".concat(string));
                    if (responseCode != 200) {
                        interfaceC1358c.mo7094a((C1357b) null);
                    } else {
                        interfaceC1358c.mo7094a((C1357b) null);
                    }
                    throw th;
                }
            } catch (Exception e8) {
                e = e8;
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Exception e9) {
            e = e9;
            httpURLConnection = null;
        } catch (Throwable th10) {
            th = th10;
            httpURLConnection = null;
        }
        interfaceC1358c.mo7093a(C1356a.m7182a(responseCode));
    }

    /* JADX INFO: renamed from: a */
    private void m7087a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private String m7086a() {
        return C1333b.f5548a[0] + "." + C1333b.f5548a[2] + "." + C1333b.f5548a[4] + "." + C1333b.f5548a[6];
    }

    /* JADX INFO: renamed from: a */
    public synchronized SSLSocketFactory m7088a(AbstractC1348g abstractC1348g, C1316a c1316a) {
        if (abstractC1348g instanceof C1346e) {
            C1350c c1350c = new C1350c(HttpsURLConnection.getDefaultSSLSocketFactory(), c1316a);
            if (f5559a == null) {
                f5559a = c1350c;
            }
            return c1350c;
        }
        if (f5559a == null) {
            f5559a = new C1350c(HttpsURLConnection.getDefaultSSLSocketFactory(), c1316a);
        }
        return f5559a;
    }
}
