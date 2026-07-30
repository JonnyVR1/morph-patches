package com.apm.lite.p010j;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.b350;
import p153l.cyq0;
import p153l.irq0;
import p153l.m4r0;
import p153l.n0r0;
import p153l.q5r0;
import p153l.r4r0;
import p153l.tg3;
import p153l.v2r0;
import p153l.v3r0;

/* JADX INFO: renamed from: com.apm.lite.j.e */
/* JADX INFO: loaded from: classes.dex */
public class C0926e {

    /* JADX INFO: renamed from: a */
    public static boolean f4193a = false;

    /* JADX INFO: renamed from: com.apm.lite.j.e$a */
    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);


        /* JADX INFO: renamed from: d */
        final int f4198d;

        a(int i) {
            this.f4198d = i;
        }
    }

    /* JADX INFO: renamed from: com.apm.lite.j.e$b */
    public enum b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);


        /* JADX INFO: renamed from: l */
        final int f4211l;

        b(int i) {
            this.f4211l = i;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m5123a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str.concat("?");
                }
            } else if (!str.endsWith("&")) {
                str = str.concat("&");
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m5124b(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb.toString().endsWith("?")) {
                        sb.append("&");
                    }
                    sb.append(m5136n(entry.getKey().toString(), "UTF-8"));
                    sb.append("=");
                    sb.append(m5136n(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: c */
    public static r4r0 m5125c(long j, String str, byte[] bArr, a aVar, String str2, boolean z) {
        return m5126d(j, str, bArr, aVar, str2, z, false);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0065 A[PHI: r9
      0x0065: PHI (r9v8 java.lang.String) = (r9v6 java.lang.String), (r9v9 java.lang.String) binds: [B:33:0x0070, B:30:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d */
    public static r4r0 m5126d(long j, String str, byte[] bArr, a aVar, String str2, boolean z, boolean z2) throws IOException {
        String str3;
        String str4;
        if (b350.m102272d()) {
            return new r4r0(201);
        }
        if (str == null) {
            return new r4r0(201);
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (a.GZIP == aVar && length > 128) {
            bArr = m5140r(bArr);
            str3 = HttpHeaderValues.GZIP;
        } else if (a.DEFLATER != aVar || length <= 128) {
            str3 = null;
        } else {
            bArr = m5135m(bArr);
            str3 = "deflate";
        }
        String str5 = str3;
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            return new r4r0(202);
        }
        if (!z) {
            return m5130h(str, bArr2, str2, str5, "POST", true, false, z2);
        }
        byte[] bArrM199144a = v2r0.m199144a(bArr2);
        if (bArrM199144a != null) {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                str4 = "?";
                if (!str.endsWith("?")) {
                    str = str.concat(str4);
                }
            } else {
                str4 = "&";
                if (!str.endsWith("&")) {
                    str = str.concat(str4);
                }
            }
            str = str.concat("tt_data=a");
            str2 = "application/octet-stream;tt-data=a";
            bArr2 = bArrM199144a;
        }
        return m5130h(str, bArr2, str2, str5, "POST", true, true, z2);
    }

    /* JADX INFO: renamed from: e */
    public static r4r0 m5127e(String str, String str2, boolean z) {
        return m5128f(str, str2, m5131i(), z);
    }

    /* JADX INFO: renamed from: f */
    public static r4r0 m5128f(String str, String str2, boolean z, boolean z2) {
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                return m5126d(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, str, str2.getBytes(), a.GZIP, "application/json; charset=utf-8", z, z2);
            }
            return new r4r0(201);
        } catch (Throwable th) {
            q5r0.m175517g(th);
            return new r4r0(207, th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static r4r0 m5129g(String str, String str2, File... fileArr) {
        return m5137o(str, str2, fileArr);
    }

    /* JADX INFO: renamed from: h */
    private static r4r0 m5130h(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        return m5138p(str, bArr, str2, str3, str4, z, z2, z3);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m5131i() {
        return TextUtils.equals("sdk", "app");
    }

    /* JADX INFO: renamed from: j */
    public static boolean m5132j(String str, String str2, String str3, String str4, List<String> list) {
        if (b350.m102272d()) {
            return false;
        }
        try {
            HashMap map = new HashMap();
            map.put("aid", str2);
            String strM113211l = cyq0.m113211l(str2);
            if (!TextUtils.isEmpty(strM113211l)) {
                map.put("x-auth-token", strM113211l);
            }
            v3r0 v3r0Var = new v3r0(str, "UTF-8", map, false);
            v3r0Var.m199623c("aid", str2);
            v3r0Var.m199623c("device_id", str3);
            v3r0Var.m199623c("os", "Android");
            v3r0Var.m199623c("process_name", str4);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                File file = new File(it.next());
                if (file.exists()) {
                    HashMap map2 = new HashMap();
                    map2.put("logtype", "alog");
                    map2.put("scene", "crash");
                    v3r0Var.m199622b(file.getName(), file, map2);
                }
            }
            try {
                return new JSONObject(v3r0Var.m199621a()).optInt("errno", -1) == 200;
            } catch (JSONException unused) {
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    private static byte[] m5133k(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    m4r0.m157051a(byteArrayOutputStream);
                }
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: l */
    public static byte[] m5134l(String str, Map<String, String> map, byte[] bArr) {
        try {
            return m5125c(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, m5124b(str, map), bArr, a.GZIP, "application/json; charset=utf-8", false).m179817b();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    private static byte[] m5135m(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: n */
    private static String m5136n(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            tg3.m191013a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static r4r0 m5137o(String str, String str2, File... fileArr) {
        if (b350.m102272d()) {
            return new r4r0(201);
        }
        try {
            v3r0 v3r0Var = new v3r0(m5123a(str, "have_dump=true".concat(m5131i() ? "&encrypt=true" : "")), "UTF-8", true);
            v3r0Var.m199624d("json", str2, true);
            v3r0Var.m199626f("file", fileArr);
            try {
                return new r4r0(0, new JSONObject(v3r0Var.m199621a()));
            } catch (JSONException e) {
                return new r4r0(0, e);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return new r4r0(207);
        }
    }

    /* JADX INFO: renamed from: p */
    private static r4r0 m5138p(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        InputStream inputStream;
        byte[] bArrM5133k;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        GZIPInputStream gZIPInputStream = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                irq0.m141848a(httpURLConnection2);
                if (z) {
                    httpURLConnection2.setDoOutput(true);
                } else {
                    httpURLConnection2.setDoOutput(false);
                }
                if (str2 != null) {
                    httpURLConnection2.setRequestProperty("Content-Type", str2);
                }
                if (str3 != null) {
                    httpURLConnection2.setRequestProperty("Content-Encoding", str3);
                }
                httpURLConnection2.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, HttpHeaderValues.GZIP);
                if (str4 == null) {
                    throw new IllegalArgumentException("request method is not null");
                }
                if (z3) {
                    String strM113214q = cyq0.m113214q();
                    if (!TextUtils.isEmpty(strM113214q)) {
                        httpURLConnection2.setRequestProperty("aid", strM113214q);
                        String strM113211l = cyq0.m113211l(strM113214q);
                        if (!TextUtils.isEmpty(strM113211l)) {
                            httpURLConnection2.setRequestProperty("x-auth-token", strM113211l);
                        }
                    }
                }
                httpURLConnection2.setRequestMethod(str4);
                if (bArr != null && bArr.length > 0) {
                    try {
                        dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            dataOutputStream.write(bArr);
                            dataOutputStream.flush();
                            m4r0.m157051a(dataOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            m4r0.m157051a(dataOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dataOutputStream = null;
                    }
                }
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode != 200) {
                    r4r0 r4r0Var = new r4r0(206, "http response code " + responseCode);
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused) {
                    }
                    m4r0.m157051a(null);
                    return r4r0Var;
                }
                InputStream inputStream2 = httpURLConnection2.getInputStream();
                try {
                    if (HttpHeaderValues.GZIP.equalsIgnoreCase(httpURLConnection2.getContentEncoding())) {
                        try {
                            GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream2);
                            try {
                                bArrM5133k = m5133k(gZIPInputStream2);
                                m4r0.m157051a(gZIPInputStream2);
                            } catch (Throwable th3) {
                                th = th3;
                                gZIPInputStream = gZIPInputStream2;
                                m4r0.m157051a(gZIPInputStream);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        bArrM5133k = m5133k(inputStream2);
                    }
                    r4r0 r4r0VarM5142t = m5142t(bArrM5133k);
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused2) {
                    }
                    m4r0.m157051a(inputStream2);
                    return r4r0VarM5142t;
                } catch (Throwable th5) {
                    httpURLConnection = httpURLConnection2;
                    inputStream = inputStream2;
                    th = th5;
                    try {
                        q5r0.m175516f(th);
                        return new r4r0(207, th);
                    } finally {
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused3) {
                            }
                        }
                        m4r0.m157051a(inputStream);
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                httpURLConnection = httpURLConnection2;
                inputStream = null;
            }
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m5139q() {
        return TextUtils.equals("sdk", "app");
    }

    /* JADX INFO: renamed from: r */
    private static byte[] m5140r(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                q5r0.m175517g(th);
                return null;
            } finally {
                gZIPOutputStream.close();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m5141s() {
        return n0r0.m161024k().m169520c();
    }

    /* JADX INFO: renamed from: t */
    private static r4r0 m5142t(byte[] bArr) {
        return new r4r0(204, bArr);
    }

    /* JADX INFO: renamed from: u */
    public static String m5143u() {
        return n0r0.m161024k().m169518a();
    }

    /* JADX INFO: renamed from: v */
    public static String m5144v() {
        return n0r0.m161024k().m169522e();
    }

    /* JADX INFO: renamed from: w */
    public static String m5145w() {
        return n0r0.m161024k().m169525h();
    }
}
