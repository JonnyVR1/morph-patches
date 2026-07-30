package com.cmic.sso.sdk.p017c.p018a;

import android.annotation.TargetApi;
import android.text.TextUtils;
import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.C1356b;
import com.cmic.sso.sdk.p017c.C1373c;
import com.cmic.sso.sdk.p017c.C1378d;
import com.cmic.sso.sdk.p017c.p019b.AbstractC1371g;
import com.cmic.sso.sdk.p017c.p019b.C1369e;
import com.cmic.sso.sdk.p017c.p019b.C1372h;
import com.cmic.sso.sdk.p017c.p020c.C1375b;
import com.cmic.sso.sdk.p017c.p020c.C1376c;
import com.cmic.sso.sdk.p017c.p021d.C1379a;
import com.cmic.sso.sdk.p017c.p021d.C1380b;
import com.cmic.sso.sdk.p017c.p021d.InterfaceC1381c;
import com.cmic.sso.sdk.p023e.C1386c;
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
public class C1360a implements InterfaceC1361b {

    /* JADX INFO: renamed from: a */
    private static C1373c f5596a;

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
    @Override // com.cmic.sso.sdk.p017c.p018a.InterfaceC1361b
    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    public void mo7143a(C1376c c1376c, InterfaceC1381c interfaceC1381c, C1339a c1339a) throws Throwable {
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
        C1386c.m7288b("ConnectionInterceptor", "请求地址: " + c1376c.m7222a());
        StringBuilder sb = new StringBuilder();
        try {
            String strM7222a = c1376c.m7222a();
            URL url = new URL(strM7222a);
            final String host = url.getHost();
            AbstractC1371g abstractC1371gM7235j = c1376c.m7235j();
            if ((abstractC1371gM7235j instanceof C1372h) || (abstractC1371gM7235j instanceof C1369e)) {
                String strM7022b = c1339a.m7022b("remote_ip");
                if (TextUtils.isEmpty(strM7022b)) {
                    z = false;
                } else {
                    url = new URL(strM7222a.replaceFirst(host, strM7022b));
                    z = true;
                }
            } else {
                z = false;
            }
            if (c1376c.m7232g() != null) {
                C1386c.m7288b("ConnectionInterceptor", "开始wifi下取号");
                httpURLConnection = (HttpURLConnection) c1376c.m7232g().openConnection(url);
            } else {
                C1386c.m7288b("ConnectionInterceptor", "使用当前网络环境发送请求");
                httpURLConnection = (HttpURLConnection) url.openConnection();
            }
            try {
                Map<String, String> mapM7228c = c1376c.m7228c();
                if (mapM7228c != null) {
                    try {
                        for (String str2 : mapM7228c.keySet()) {
                            boolean z2 = z;
                            httpURLConnection.addRequestProperty(str2, mapM7228c.get(str2));
                            z = z2;
                        }
                    } catch (Exception e) {
                        e = e;
                        outputStream = null;
                        inputStream = null;
                        responseCode = -1;
                        try {
                            e.printStackTrace();
                            C1386c.m7286a("ConnectionInterceptor", "请求失败: " + c1376c.m7222a());
                            c1339a.m7010a().f5704a.add(e);
                            if (e instanceof EOFException) {
                                i = 200050;
                            } else {
                                i = 102102;
                            }
                            responseCode = i;
                            if (e instanceof UnknownHostException) {
                                c1339a.m7015a("remote_ip", m7140a());
                            }
                            m7141a(outputStream);
                            m7141a(inputStream);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            C1386c.m7288b("ConnectionInterceptor", "responseCode: " + responseCode);
                            if (TextUtils.isEmpty(sb)) {
                                string2 = str;
                            } else {
                                string2 = sb.toString();
                            }
                            C1386c.m7288b("ConnectionInterceptor", "responseResult: ".concat(string2));
                            interfaceC1381c.mo7147a(C1379a.m7236a(responseCode));
                        } catch (Throwable th) {
                            th = th;
                            m7141a(outputStream);
                            m7141a(inputStream);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            C1386c.m7288b("ConnectionInterceptor", "responseCode: " + responseCode);
                            if (TextUtils.isEmpty(sb)) {
                                string = str;
                            } else {
                                string = sb.toString();
                            }
                            C1386c.m7288b("ConnectionInterceptor", "responseResult: ".concat(string));
                            if (responseCode != 200 || responseCode == 301 || responseCode == 302) {
                                interfaceC1381c.mo7148a((C1380b) null);
                            } else {
                                interfaceC1381c.mo7147a(C1379a.m7236a(responseCode));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = null;
                        inputStream = null;
                        responseCode = -1;
                        m7141a(outputStream);
                        m7141a(inputStream);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        C1386c.m7288b("ConnectionInterceptor", "responseCode: " + responseCode);
                        if (TextUtils.isEmpty(sb)) {
                            string = str;
                        } else {
                            string = sb.toString();
                        }
                        C1386c.m7288b("ConnectionInterceptor", "responseResult: ".concat(string));
                        if (responseCode != 200) {
                            interfaceC1381c.mo7148a((C1380b) null);
                        } else {
                            interfaceC1381c.mo7148a((C1380b) null);
                        }
                        throw th;
                    }
                }
                boolean z3 = z;
                if ((httpURLConnection instanceof HttpsURLConnection) && ((abstractC1371gM7235j instanceof C1372h) || (abstractC1371gM7235j instanceof C1369e))) {
                    if (z3) {
                        C1386c.m7288b("ConnectionInterceptor", "host = " + host);
                        httpURLConnection.setRequestProperty("Host", host);
                        C1386c.m7288b("ConnectionInterceptor", "need sni handle");
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(new C1378d((HttpsURLConnection) httpURLConnection, c1376c.m7232g(), c1339a));
                        ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostnameVerifier() { // from class: com.cmic.sso.sdk.c.a.a.1
                            @Override // javax.net.ssl.HostnameVerifier
                            public boolean verify(String str3, SSLSession sSLSession) {
                                return HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSession);
                            }
                        });
                    } else {
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(m7142a(abstractC1371gM7235j, c1339a));
                    }
                }
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setDefaultUseCaches(false);
                String strM7230e = c1376c.m7230e();
                httpURLConnection.setRequestMethod(strM7230e);
                httpURLConnection.setDoOutput(true);
                if (c1376c instanceof C1375b) {
                    httpURLConnection.connect();
                    ((C1375b) c1376c).m7220a(c1339a);
                }
                if (strM7230e.endsWith("POST")) {
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(c1376c.m7229d().getBytes("utf-8"));
                        outputStream.flush();
                    } catch (Exception e2) {
                        e = e2;
                        str = "";
                        inputStream = null;
                        responseCode = -1;
                        e.printStackTrace();
                        C1386c.m7286a("ConnectionInterceptor", "请求失败: " + c1376c.m7222a());
                        c1339a.m7010a().f5704a.add(e);
                        if (e instanceof EOFException) {
                            i = 200050;
                        } else {
                            i = 102102;
                        }
                        responseCode = i;
                        if ((e instanceof UnknownHostException) && ((c1376c.m7235j() instanceof C1372h) || (c1376c.m7235j() instanceof C1369e))) {
                            c1339a.m7015a("remote_ip", m7140a());
                        }
                        m7141a(outputStream);
                        m7141a(inputStream);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        C1386c.m7288b("ConnectionInterceptor", "responseCode: " + responseCode);
                        if (TextUtils.isEmpty(sb)) {
                            string2 = str;
                        } else {
                            string2 = sb.toString();
                        }
                        C1386c.m7288b("ConnectionInterceptor", "responseResult: ".concat(string2));
                        interfaceC1381c.mo7147a(C1379a.m7236a(responseCode));
                    } catch (Throwable th3) {
                        th = th3;
                        str = "";
                        inputStream = null;
                        responseCode = -1;
                        m7141a(outputStream);
                        m7141a(inputStream);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        C1386c.m7288b("ConnectionInterceptor", "responseCode: " + responseCode);
                        if (TextUtils.isEmpty(sb)) {
                            string = str;
                        } else {
                            string = sb.toString();
                        }
                        C1386c.m7288b("ConnectionInterceptor", "responseResult: ".concat(string));
                        if (responseCode != 200) {
                            interfaceC1381c.mo7148a((C1380b) null);
                        } else {
                            interfaceC1381c.mo7148a((C1380b) null);
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
                                        C1386c.m7286a("ConnectionInterceptor", "请求失败: " + c1376c.m7222a());
                                        c1339a.m7010a().f5704a.add(e);
                                        if (e instanceof EOFException) {
                                            i = 200050;
                                        } else {
                                            i = 102102;
                                        }
                                        responseCode = i;
                                        if (e instanceof UnknownHostException) {
                                            c1339a.m7015a("remote_ip", m7140a());
                                        }
                                        m7141a(outputStream);
                                        m7141a(inputStream);
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        C1386c.m7288b("ConnectionInterceptor", "responseCode: " + responseCode);
                                        if (TextUtils.isEmpty(sb)) {
                                            string2 = str;
                                        } else {
                                            string2 = sb.toString();
                                        }
                                        C1386c.m7288b("ConnectionInterceptor", "responseResult: ".concat(string2));
                                        interfaceC1381c.mo7147a(C1379a.m7236a(responseCode));
                                    } catch (Throwable th4) {
                                        th = th4;
                                        httpURLConnection = httpURLConnection2;
                                        m7141a(outputStream);
                                        m7141a(inputStream);
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        C1386c.m7288b("ConnectionInterceptor", "responseCode: " + responseCode);
                                        if (TextUtils.isEmpty(sb)) {
                                            string = str;
                                        } else {
                                            string = sb.toString();
                                        }
                                        C1386c.m7288b("ConnectionInterceptor", "responseResult: ".concat(string));
                                        if (responseCode != 200) {
                                            interfaceC1381c.mo7148a((C1380b) null);
                                        } else {
                                            interfaceC1381c.mo7148a((C1380b) null);
                                        }
                                        throw th;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    e.printStackTrace();
                                    C1386c.m7286a("ConnectionInterceptor", "请求失败: " + c1376c.m7222a());
                                    c1339a.m7010a().f5704a.add(e);
                                    if (e instanceof EOFException) {
                                        i = 200050;
                                    } else {
                                        i = 102102;
                                    }
                                    responseCode = i;
                                    if (e instanceof UnknownHostException) {
                                        c1339a.m7015a("remote_ip", m7140a());
                                    }
                                    m7141a(outputStream);
                                    m7141a(inputStream);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    C1386c.m7288b("ConnectionInterceptor", "responseCode: " + responseCode);
                                    if (TextUtils.isEmpty(sb)) {
                                        string2 = str;
                                    } else {
                                        string2 = sb.toString();
                                    }
                                    C1386c.m7288b("ConnectionInterceptor", "responseResult: ".concat(string2));
                                    interfaceC1381c.mo7147a(C1379a.m7236a(responseCode));
                                } catch (Throwable th5) {
                                    th = th5;
                                    m7141a(outputStream);
                                    m7141a(inputStream);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    C1386c.m7288b("ConnectionInterceptor", "responseCode: " + responseCode);
                                    if (TextUtils.isEmpty(sb)) {
                                        string = str;
                                    } else {
                                        string = sb.toString();
                                    }
                                    C1386c.m7288b("ConnectionInterceptor", "responseResult: ".concat(string));
                                    if (responseCode != 200) {
                                        interfaceC1381c.mo7148a((C1380b) null);
                                    } else {
                                        interfaceC1381c.mo7148a((C1380b) null);
                                    }
                                    throw th;
                                }
                            }
                            str = str;
                            httpURLConnection2 = httpURLConnection;
                            C1380b c1380b = new C1380b(responseCode, httpURLConnection2.getHeaderFields(), sb.toString());
                            m7141a(outputStream);
                            m7141a(inputStream);
                            httpURLConnection2.disconnect();
                            C1386c.m7288b("ConnectionInterceptor", "responseCode: " + responseCode);
                            C1386c.m7288b("ConnectionInterceptor", "responseResult: ".concat(TextUtils.isEmpty(sb) ? str : sb.toString()));
                            if (responseCode == 200 || responseCode == 301 || responseCode == 302) {
                                interfaceC1381c.mo7148a(c1380b);
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
                    C1386c.m7286a("ConnectionInterceptor", "请求失败: " + c1376c.m7222a());
                    c1339a.m7010a().f5704a.add(e);
                    if (e instanceof EOFException) {
                        i = 200050;
                    } else {
                        i = 102102;
                    }
                    responseCode = i;
                    if (e instanceof UnknownHostException) {
                        c1339a.m7015a("remote_ip", m7140a());
                    }
                    m7141a(outputStream);
                    m7141a(inputStream);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    C1386c.m7288b("ConnectionInterceptor", "responseCode: " + responseCode);
                    if (TextUtils.isEmpty(sb)) {
                        string2 = str;
                    } else {
                        string2 = sb.toString();
                    }
                    C1386c.m7288b("ConnectionInterceptor", "responseResult: ".concat(string2));
                    interfaceC1381c.mo7147a(C1379a.m7236a(responseCode));
                } catch (Throwable th8) {
                    th = th8;
                    str = "";
                    inputStream = null;
                    responseCode = -1;
                    m7141a(outputStream);
                    m7141a(inputStream);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    C1386c.m7288b("ConnectionInterceptor", "responseCode: " + responseCode);
                    if (TextUtils.isEmpty(sb)) {
                        string = str;
                    } else {
                        string = sb.toString();
                    }
                    C1386c.m7288b("ConnectionInterceptor", "responseResult: ".concat(string));
                    if (responseCode != 200) {
                        interfaceC1381c.mo7148a((C1380b) null);
                    } else {
                        interfaceC1381c.mo7148a((C1380b) null);
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
        interfaceC1381c.mo7147a(C1379a.m7236a(responseCode));
    }

    /* JADX INFO: renamed from: a */
    private void m7141a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private String m7140a() {
        return C1356b.f5585a[0] + "." + C1356b.f5585a[2] + "." + C1356b.f5585a[4] + "." + C1356b.f5585a[6];
    }

    /* JADX INFO: renamed from: a */
    public synchronized SSLSocketFactory m7142a(AbstractC1371g abstractC1371g, C1339a c1339a) {
        if (abstractC1371g instanceof C1369e) {
            C1373c c1373c = new C1373c(HttpsURLConnection.getDefaultSSLSocketFactory(), c1339a);
            if (f5596a == null) {
                f5596a = c1373c;
            }
            return c1373c;
        }
        if (f5596a == null) {
            f5596a = new C1373c(HttpsURLConnection.getDefaultSSLSocketFactory(), c1339a);
        }
        return f5596a;
    }
}
