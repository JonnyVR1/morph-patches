package com.apm.lite.p009j;

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
import org.json.JSONException;
import org.json.JSONObject;
import p149l.diq0;
import p149l.fg3;
import p149l.gvq0;
import p149l.hrq0;
import p149l.kwq0;
import p149l.lvq0;
import p149l.mu40;
import p149l.ptq0;
import p149l.puq0;
import p149l.woq0;

/* JADX INFO: renamed from: com.apm.lite.j.e */
/* JADX INFO: loaded from: classes.dex */
public class C0922e {

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
    private static String m5113a(String str, String str2) {
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
    private static String m5114b(String str, Map map) {
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
                    sb.append(m5126n(entry.getKey().toString(), "UTF-8"));
                    sb.append("=");
                    sb.append(m5126n(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: c */
    public static lvq0 m5115c(long j, String str, byte[] bArr, a aVar, String str2, boolean z) {
        return m5116d(j, str, bArr, aVar, str2, z, false);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0065 A[PHI: r9
      0x0065: PHI (r9v8 java.lang.String) = (r9v6 java.lang.String), (r9v9 java.lang.String) binds: [B:33:0x0070, B:30:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d */
    public static lvq0 m5116d(long j, String str, byte[] bArr, a aVar, String str2, boolean z, boolean z2) throws IOException {
        String str3;
        String str4;
        if (mu40.m156375d()) {
            return new lvq0(201);
        }
        if (str == null) {
            return new lvq0(201);
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (a.GZIP == aVar && length > 128) {
            bArr = m5130r(bArr);
            str3 = HttpHeaderValues.GZIP;
        } else if (a.DEFLATER != aVar || length <= 128) {
            str3 = null;
        } else {
            bArr = m5125m(bArr);
            str3 = "deflate";
        }
        String str5 = str3;
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            return new lvq0(202);
        }
        if (!z) {
            return m5120h(str, bArr2, str2, str5, "POST", true, false, z2);
        }
        byte[] bArrM171375a = ptq0.m171375a(bArr2);
        if (bArrM171375a != null) {
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
            bArr2 = bArrM171375a;
        }
        return m5120h(str, bArr2, str2, str5, "POST", true, true, z2);
    }

    /* JADX INFO: renamed from: e */
    public static lvq0 m5117e(String str, String str2, boolean z) {
        return m5118f(str, str2, m5121i(), z);
    }

    /* JADX INFO: renamed from: f */
    public static lvq0 m5118f(String str, String str2, boolean z, boolean z2) {
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                return m5116d(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, str, str2.getBytes(), a.GZIP, "application/json; charset=utf-8", z, z2);
            }
            return new lvq0(201);
        } catch (Throwable th) {
            kwq0.m147634g(th);
            return new lvq0(207, th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static lvq0 m5119g(String str, String str2, File... fileArr) {
        return m5127o(str, str2, fileArr);
    }

    /* JADX INFO: renamed from: h */
    private static lvq0 m5120h(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        return m5128p(str, bArr, str2, str3, str4, z, z2, z3);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m5121i() {
        return TextUtils.equals("sdk", "app");
    }

    /* JADX INFO: renamed from: j */
    public static boolean m5122j(String str, String str2, String str3, String str4, List<String> list) {
        if (mu40.m156375d()) {
            return false;
        }
        try {
            HashMap map = new HashMap();
            map.put("aid", str2);
            String strM204858l = woq0.m204858l(str2);
            if (!TextUtils.isEmpty(strM204858l)) {
                map.put("x-auth-token", strM204858l);
            }
            puq0 puq0Var = new puq0(str, "UTF-8", map, false);
            puq0Var.m171472c("aid", str2);
            puq0Var.m171472c("device_id", str3);
            puq0Var.m171472c("os", "Android");
            puq0Var.m171472c("process_name", str4);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                File file = new File(it.next());
                if (file.exists()) {
                    HashMap map2 = new HashMap();
                    map2.put("logtype", "alog");
                    map2.put("scene", "crash");
                    puq0Var.m171471b(file.getName(), file, map2);
                }
            }
            try {
                return new JSONObject(puq0Var.m171470a()).optInt("errno", -1) == 200;
            } catch (JSONException unused) {
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    private static byte[] m5123k(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    gvq0.m128290a(byteArrayOutputStream);
                }
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: l */
    public static byte[] m5124l(String str, Map<String, String> map, byte[] bArr) {
        try {
            return m5115c(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, m5114b(str, map), bArr, a.GZIP, "application/json; charset=utf-8", false).m151904b();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    private static byte[] m5125m(byte[] bArr) {
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
    private static String m5126n(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            fg3.m121203a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static lvq0 m5127o(String str, String str2, File... fileArr) {
        if (mu40.m156375d()) {
            return new lvq0(201);
        }
        try {
            puq0 puq0Var = new puq0(m5113a(str, "have_dump=true".concat(m5121i() ? "&encrypt=true" : "")), "UTF-8", true);
            puq0Var.m171473d("json", str2, true);
            puq0Var.m171475f("file", fileArr);
            try {
                return new lvq0(0, new JSONObject(puq0Var.m171470a()));
            } catch (JSONException e) {
                return new lvq0(0, e);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return new lvq0(207);
        }
    }

    /* JADX INFO: renamed from: p */
    private static lvq0 m5128p(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        InputStream inputStream;
        byte[] bArrM5123k;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        GZIPInputStream gZIPInputStream = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                diq0.m111907a(httpURLConnection2);
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
                httpURLConnection2.setRequestProperty("Accept-Encoding", HttpHeaderValues.GZIP);
                if (str4 == null) {
                    throw new IllegalArgumentException("request method is not null");
                }
                if (z3) {
                    String strM204861q = woq0.m204861q();
                    if (!TextUtils.isEmpty(strM204861q)) {
                        httpURLConnection2.setRequestProperty("aid", strM204861q);
                        String strM204858l = woq0.m204858l(strM204861q);
                        if (!TextUtils.isEmpty(strM204858l)) {
                            httpURLConnection2.setRequestProperty("x-auth-token", strM204858l);
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
                            gvq0.m128290a(dataOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            gvq0.m128290a(dataOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dataOutputStream = null;
                    }
                }
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode != 200) {
                    lvq0 lvq0Var = new lvq0(206, "http response code " + responseCode);
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused) {
                    }
                    gvq0.m128290a(null);
                    return lvq0Var;
                }
                InputStream inputStream2 = httpURLConnection2.getInputStream();
                try {
                    if (HttpHeaderValues.GZIP.equalsIgnoreCase(httpURLConnection2.getContentEncoding())) {
                        try {
                            GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream2);
                            try {
                                bArrM5123k = m5123k(gZIPInputStream2);
                                gvq0.m128290a(gZIPInputStream2);
                            } catch (Throwable th3) {
                                th = th3;
                                gZIPInputStream = gZIPInputStream2;
                                gvq0.m128290a(gZIPInputStream);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        bArrM5123k = m5123k(inputStream2);
                    }
                    lvq0 lvq0VarM5132t = m5132t(bArrM5123k);
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused2) {
                    }
                    gvq0.m128290a(inputStream2);
                    return lvq0VarM5132t;
                } catch (Throwable th5) {
                    httpURLConnection = httpURLConnection2;
                    inputStream = inputStream2;
                    th = th5;
                    try {
                        kwq0.m147633f(th);
                        return new lvq0(207, th);
                    } finally {
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused3) {
                            }
                        }
                        gvq0.m128290a(inputStream);
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
    public static boolean m5129q() {
        return TextUtils.equals("sdk", "app");
    }

    /* JADX INFO: renamed from: r */
    private static byte[] m5130r(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                kwq0.m147634g(th);
                return null;
            } finally {
                gZIPOutputStream.close();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m5131s() {
        return hrq0.m132702k().m143399c();
    }

    /* JADX INFO: renamed from: t */
    private static lvq0 m5132t(byte[] bArr) {
        return new lvq0(204, bArr);
    }

    /* JADX INFO: renamed from: u */
    public static String m5133u() {
        return hrq0.m132702k().m143397a();
    }

    /* JADX INFO: renamed from: v */
    public static String m5134v() {
        return hrq0.m132702k().m143401e();
    }

    /* JADX INFO: renamed from: w */
    public static String m5135w() {
        return hrq0.m132702k().m143404h();
    }
}
