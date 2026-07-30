package p149l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes2.dex */
public class gkq0 {

    /* JADX INFO: renamed from: a */
    private static final AtomicReference<C17102c<hkq0>> f103213a = new AtomicReference<>(m126686o());

    /* JADX INFO: renamed from: b */
    public static final Pattern f103214b = Pattern.compile("([^\\s;]+)(.*)");

    /* JADX INFO: renamed from: c */
    public static final Pattern f103215c = Pattern.compile("(.*?charset\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* JADX INFO: renamed from: d */
    public static final Pattern f103216d = Pattern.compile("(\\<\\?xml\\s+.*?encoding\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* JADX INFO: renamed from: l.gkq0$a */
    public static class C17100a extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            gkq0.m126692u();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            gkq0.m126692u();
        }
    }

    /* JADX INFO: renamed from: l.gkq0$b */
    public static class CallableC17101b implements Callable<hkq0> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public hkq0 call() {
            NetworkInfo activeNetworkInfo;
            Context contextM161879b = nwq0.m161879b();
            if (contextM161879b == null) {
                return null;
            }
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) contextM161879b.getSystemService("connectivity");
                if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                    return null;
                }
                return new hkq0(activeNetworkInfo);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: l.gkq0$c */
    public static class C17102c<T> extends FutureTask<T> {

        /* JADX INFO: renamed from: a */
        private long f103217a;

        public C17102c(Callable<T> callable) {
            super(callable);
        }

        /* JADX INFO: renamed from: a */
        public boolean m126699a() {
            if (fvq0.m123356j(nwq0.m161879b())) {
                return true;
            }
            return isDone() && Math.abs(SystemClock.elapsedRealtime() - this.f103217a) > 1800000;
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            this.f103217a = SystemClock.elapsedRealtime();
            super.run();
        }
    }

    /* JADX INFO: renamed from: l.gkq0$d */
    public static final class C17103d extends FilterInputStream {

        /* JADX INFO: renamed from: a */
        private boolean f103218a;

        public C17103d(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int i3;
            if (!this.f103218a && (i3 = super.read(bArr, i, i2)) != -1) {
                return i3;
            }
            this.f103218a = true;
            return -1;
        }
    }

    /* JADX INFO: renamed from: l.gkq0$e */
    public static class C17104e {
    }

    /* JADX INFO: renamed from: A */
    public static boolean m126670A(Context context) {
        hkq0 hkq0VarM126688q = m126688q(context);
        if (hkq0VarM126688q == null || hkq0VarM126688q.m131578a() != 0) {
            return false;
        }
        String strM131584h = hkq0VarM126688q.m131584h();
        if (!"TD-SCDMA".equalsIgnoreCase(strM131584h) && !"CDMA2000".equalsIgnoreCase(strM131584h) && !"WCDMA".equalsIgnoreCase(strM131584h)) {
            switch (hkq0VarM126688q.m131583g()) {
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    break;
                case 4:
                case 7:
                case 11:
                case 13:
                default:
                    return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m126671B(Context context) {
        hkq0 hkq0VarM126688q = m126688q(context);
        if (hkq0VarM126688q == null || hkq0VarM126688q.m131578a() != 0) {
            return false;
        }
        int iM131583g = hkq0VarM126688q.m131583g();
        return iM131583g == 1 || iM131583g == 2 || iM131583g == 4 || iM131583g == 7 || iM131583g == 11;
    }

    /* JADX INFO: renamed from: a */
    public static int m126672a(Context context) {
        hkq0 hkq0VarM126687p = m126687p();
        if (hkq0VarM126687p == null) {
            return -1;
        }
        return hkq0VarM126687p.m131578a();
    }

    /* JADX INFO: renamed from: b */
    public static InputStream m126673b(Context context, URL url, boolean z, String str, String str2) {
        return m126674c(context, url, z, str, str2, null, null);
    }

    /* JADX INFO: renamed from: c */
    public static InputStream m126674c(Context context, URL url, boolean z, String str, String str2, Map<String, String> map, C17104e c17104e) throws IOException {
        if (context == null) {
            ig3.m135964a("context");
            return null;
        }
        if (url == null) {
            ig3.m135964a("url");
            return null;
        }
        if (!z) {
            url = new URL(m126679h(url.toString()));
        }
        try {
            HttpURLConnection.setFollowRedirects(true);
            HttpURLConnection httpURLConnectionM126682k = m126682k(context, url);
            httpURLConnectionM126682k.setConnectTimeout(10000);
            httpURLConnectionM126682k.setReadTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
            if (!TextUtils.isEmpty(str)) {
                httpURLConnectionM126682k.setRequestProperty("User-Agent", str);
            }
            if (str2 != null) {
                httpURLConnectionM126682k.setRequestProperty("Cookie", str2);
            }
            if (map != null) {
                for (String str3 : map.keySet()) {
                    httpURLConnectionM126682k.setRequestProperty(str3, map.get(str3));
                }
            }
            return new C17103d(httpURLConnectionM126682k.getInputStream());
        } catch (IOException e) {
            rhg0.m179353a("IOException:".concat(e.getClass().getSimpleName()));
            return null;
        } catch (Throwable th) {
            rhg0.m179353a(th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m126675d(Context context) {
        if (context == null) {
            context = nwq0.m161879b();
        }
        C17100a c17100a = null;
        if (context != null && !fvq0.m123356j(context)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
                C17100a c17100a2 = new C17100a();
                try {
                    ii5.m136340j(connectivityManager, networkRequestBuild, c17100a2);
                    return c17100a2;
                } catch (Throwable th) {
                    th = th;
                    c17100a = c17100a2;
                    ilq0.m137040m("exception occurred in adding network callback :" + th);
                    return c17100a;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return c17100a;
    }

    /* JADX INFO: renamed from: e */
    public static String m126676e(Context context) {
        if (m126695x(context)) {
            return "wifi";
        }
        hkq0 hkq0VarM126687p = m126687p();
        if (hkq0VarM126687p == null) {
            return "";
        }
        return (hkq0VarM126687p.m131581e() + "-" + hkq0VarM126687p.m131584h()).toLowerCase();
    }

    /* JADX INFO: renamed from: f */
    public static String m126677f(Context context, URL url) {
        return m126678g(context, url, false, null, "UTF-8", null);
    }

    /* JADX INFO: renamed from: g */
    public static String m126678g(Context context, URL url, boolean z, String str, String str2, String str3) throws Throwable {
        InputStream inputStreamM126673b;
        try {
            inputStreamM126673b = m126673b(context, url, z, str, str3);
            try {
                StringBuilder sb = new StringBuilder(1024);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamM126673b, str2));
                char[] cArr = new char[4096];
                while (true) {
                    int i = bufferedReader.read(cArr);
                    if (-1 == i) {
                        dxq0.m114018b(inputStreamM126673b);
                        return sb.toString();
                    }
                    sb.append(cArr, 0, i);
                }
            } catch (Throwable th) {
                th = th;
                dxq0.m114018b(inputStreamM126673b);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamM126673b = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m126679h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new String();
        return String.format("%s&key=%s", str, tlq0.m189623b(String.format("%sbe988a6134bc8254465424e5a70ef037", str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static String m126680i(String str, Map<String, String> map, File file, String str2) {
        if (!file.exists()) {
            return null;
        }
        String name = file.getName();
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setReadTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Connection", HttpHeaders.KEEP_ALIVE);
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.setFixedLengthStreamingMode(name.length() + 77 + ((int) file.length()) + str2.length());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes("--*****\r\n");
                dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str2 + "\";filename=\"" + file.getName() + "\"\r\n");
                dataOutputStream.writeBytes("\r\n");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        dataOutputStream.write(bArr, 0, i);
                        dataOutputStream.flush();
                        throw new IOException("IOException:" + e.getClass().getSimpleName());
                    }
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.writeBytes("--");
                    dataOutputStream.writeBytes("*****");
                    dataOutputStream.writeBytes("--");
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.flush();
                    StringBuffer stringBuffer = new StringBuffer();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new C17103d(httpURLConnection.getInputStream())));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                String string = stringBuffer.toString();
                                dxq0.m114018b(fileInputStream);
                                dxq0.m114018b(bufferedReader);
                                return string;
                            }
                            stringBuffer.append(line);
                        } catch (IOException e) {
                            e = e;
                        } catch (Throwable th) {
                            th = th;
                            throw new IOException(th.getMessage());
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                dxq0.m114018b(null);
                dxq0.m114018b(file);
                throw th3;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m126681j(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    stringBuffer.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    stringBuffer.append("=");
                    stringBuffer.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                    stringBuffer.append("&");
                } catch (UnsupportedEncodingException e) {
                    ilq0.m137040m("Failed to convert from params map to string: " + e);
                    ilq0.m137040m("map: " + map.toString());
                    return null;
                }
            }
        }
        if (stringBuffer.length() > 0) {
            stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: k */
    public static HttpURLConnection m126682k(Context context, URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    /* JADX INFO: renamed from: l */
    private static URL m126683l(String str) {
        return new URL(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static ekq0 m126684m(Context context, String str, String str2, Map<String, String> map, String str3) {
        boolean zEqualsIgnoreCase;
        BufferedReader bufferedReader;
        ekq0 ekq0Var = new ekq0();
        try {
            try {
                try {
                    HttpURLConnection httpURLConnectionM126682k = m126682k(context, m126683l(str));
                    httpURLConnectionM126682k.setConnectTimeout(10000);
                    httpURLConnectionM126682k.setReadTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
                    String str4 = str2;
                    if (str2 == 0) {
                        str4 = "GET";
                    }
                    httpURLConnectionM126682k.setRequestMethod(str4);
                    int i = 0;
                    if (map != null) {
                        zEqualsIgnoreCase = HttpHeaderValues.GZIP.equalsIgnoreCase(map.get("Content-Encoding"));
                        for (String str5 : map.keySet()) {
                            httpURLConnectionM126682k.setRequestProperty(str5, map.get(str5));
                        }
                    } else {
                        zEqualsIgnoreCase = false;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        httpURLConnectionM126682k.setDoOutput(true);
                        byte[] bytes = str3.getBytes();
                        OutputStream gZIPOutputStream = zEqualsIgnoreCase ? new GZIPOutputStream(httpURLConnectionM126682k.getOutputStream()) : httpURLConnectionM126682k.getOutputStream();
                        try {
                            gZIPOutputStream.write(bytes, 0, bytes.length);
                            gZIPOutputStream.flush();
                            gZIPOutputStream.close();
                        } catch (IOException e) {
                            e = e;
                        } catch (Throwable th) {
                            th = th;
                            throw new IOException(th.getMessage());
                        }
                    }
                    ekq0Var.f92003a = httpURLConnectionM126682k.getResponseCode();
                    ilq0.m137040m("Http POST Response Code: " + ekq0Var.f92003a);
                    while (true) {
                        String headerFieldKey = httpURLConnectionM126682k.getHeaderFieldKey(i);
                        String headerField = httpURLConnectionM126682k.getHeaderField(i);
                        if (headerFieldKey == null && headerField == null) {
                            try {
                                break;
                            } catch (IOException unused) {
                                bufferedReader = new BufferedReader(new InputStreamReader(new C17103d(httpURLConnectionM126682k.getErrorStream())));
                            }
                        } else {
                            ekq0Var.f92004b.put(headerFieldKey, headerField);
                            i += 2;
                        }
                        throw new IOException("err while request " + str + ":" + e.getClass().getSimpleName());
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(new C17103d(httpURLConnectionM126682k.getInputStream())));
                    try {
                        StringBuffer stringBuffer = new StringBuffer();
                        String property = System.getProperty("line.separator");
                        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                            stringBuffer.append(line);
                            stringBuffer.append(property);
                        }
                        ekq0Var.f92005c = stringBuffer.toString();
                        bufferedReader.close();
                        dxq0.m114018b(null);
                        dxq0.m114018b(null);
                        return ekq0Var;
                    } catch (IOException e2) {
                        e = e2;
                    } catch (Throwable th2) {
                        th = th2;
                        throw new IOException(th.getMessage());
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            dxq0.m114018b(null);
            dxq0.m114018b(str2);
            throw th4;
        }
    }

    /* JADX INFO: renamed from: n */
    public static ekq0 m126685n(Context context, String str, Map<String, String> map) {
        return m126684m(context, str, "POST", null, m126681j(map));
    }

    /* JADX INFO: renamed from: o */
    private static C17102c<hkq0> m126686o() {
        return new C17102c<>(new CallableC17101b());
    }

    /* JADX INFO: renamed from: p */
    public static hkq0 m126687p() {
        AtomicReference<C17102c<hkq0>> atomicReference = f103213a;
        C17102c<hkq0> c17102cM126686o = atomicReference.get();
        if (c17102cM126686o == null) {
            return null;
        }
        try {
            if (c17102cM126686o.m126699a()) {
                c17102cM126686o = m126686o();
                atomicReference.set(c17102cM126686o);
            }
            if (!c17102cM126686o.isDone()) {
                c17102cM126686o.run();
            }
            return c17102cM126686o.get();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static hkq0 m126688q(Context context) {
        return m126687p();
    }

    /* JADX INFO: renamed from: r */
    public static void m126689r() {
        m126692u();
    }

    /* JADX INFO: renamed from: s */
    public static void m126690s(Context context, Object obj) {
        if (context == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof ConnectivityManager.NetworkCallback) {
                ((ConnectivityManager) context.getSystemService("connectivity")).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj);
            }
        } catch (Throwable th) {
            ilq0.m137040m("exception occurred in removing network callback :" + th);
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m126691t(Context context) {
        return m126672a(context) >= 0;
    }

    /* JADX INFO: renamed from: u */
    public static void m126692u() {
        f103213a.set(m126686o());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: v */
    public static boolean m126693v(Context context) {
        boolean zHasCapability;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    zHasCapability = networkCapabilities.hasCapability(16);
                } else {
                    zHasCapability = false;
                }
            } catch (Exception unused) {
            }
        } else {
            zHasCapability = false;
        }
        return zHasCapability && m126694w(context);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m126694w(Context context) {
        hkq0 hkq0VarM126687p = m126687p();
        return hkq0VarM126687p != null && hkq0VarM126687p.m131582f();
    }

    /* JADX INFO: renamed from: x */
    public static boolean m126695x(Context context) {
        hkq0 hkq0VarM126687p = m126687p();
        return hkq0VarM126687p != null && 1 == hkq0VarM126687p.m131578a();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m126696y(Context context) {
        hkq0 hkq0VarM126688q = m126688q(context);
        return hkq0VarM126688q != null && hkq0VarM126688q.m131578a() == 0 && 20 == hkq0VarM126688q.m131583g();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m126697z(Context context) {
        hkq0 hkq0VarM126688q = m126688q(context);
        return hkq0VarM126688q != null && hkq0VarM126688q.m131578a() == 0 && 13 == hkq0VarM126688q.m131583g();
    }
}
