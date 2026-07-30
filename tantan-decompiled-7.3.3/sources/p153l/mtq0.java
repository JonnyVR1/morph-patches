package p153l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
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
public class mtq0 {

    /* JADX INFO: renamed from: a */
    private static final AtomicReference<C18705c<ntq0>> f138651a = new AtomicReference<>(m160039o());

    /* JADX INFO: renamed from: b */
    public static final Pattern f138652b = Pattern.compile("([^\\s;]+)(.*)");

    /* JADX INFO: renamed from: c */
    public static final Pattern f138653c = Pattern.compile("(.*?charset\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* JADX INFO: renamed from: d */
    public static final Pattern f138654d = Pattern.compile("(\\<\\?xml\\s+.*?encoding\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* JADX INFO: renamed from: l.mtq0$a */
    public static class C18703a extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            mtq0.m160045u();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            mtq0.m160045u();
        }
    }

    /* JADX INFO: renamed from: l.mtq0$b */
    public static class CallableC18704b implements Callable<ntq0> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ntq0 call() {
            NetworkInfo activeNetworkInfo;
            Context contextM189418b = t5r0.m189418b();
            if (contextM189418b == null) {
                return null;
            }
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) contextM189418b.getSystemService("connectivity");
                if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                    return null;
                }
                return new ntq0(activeNetworkInfo);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: l.mtq0$c */
    public static class C18705c<T> extends FutureTask<T> {

        /* JADX INFO: renamed from: a */
        private long f138655a;

        public C18705c(Callable<T> callable) {
            super(callable);
        }

        /* JADX INFO: renamed from: a */
        public boolean m160052a() {
            if (l4r0.m152825j(t5r0.m189418b())) {
                return true;
            }
            return isDone() && Math.abs(SystemClock.elapsedRealtime() - this.f138655a) > 1800000;
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            this.f138655a = SystemClock.elapsedRealtime();
            super.run();
        }
    }

    /* JADX INFO: renamed from: l.mtq0$d */
    public static final class C18706d extends FilterInputStream {

        /* JADX INFO: renamed from: a */
        private boolean f138656a;

        public C18706d(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int i3;
            if (!this.f138656a && (i3 = super.read(bArr, i, i2)) != -1) {
                return i3;
            }
            this.f138656a = true;
            return -1;
        }
    }

    /* JADX INFO: renamed from: l.mtq0$e */
    public static class C18707e {
    }

    /* JADX INFO: renamed from: A */
    public static boolean m160023A(Context context) {
        ntq0 ntq0VarM160041q = m160041q(context);
        if (ntq0VarM160041q == null || ntq0VarM160041q.m164750a() != 0) {
            return false;
        }
        String strM164756h = ntq0VarM160041q.m164756h();
        if (!"TD-SCDMA".equalsIgnoreCase(strM164756h) && !"CDMA2000".equalsIgnoreCase(strM164756h) && !"WCDMA".equalsIgnoreCase(strM164756h)) {
            switch (ntq0VarM160041q.m164755g()) {
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
    public static boolean m160024B(Context context) {
        ntq0 ntq0VarM160041q = m160041q(context);
        if (ntq0VarM160041q == null || ntq0VarM160041q.m164750a() != 0) {
            return false;
        }
        int iM164755g = ntq0VarM160041q.m164755g();
        return iM164755g == 1 || iM164755g == 2 || iM164755g == 4 || iM164755g == 7 || iM164755g == 11;
    }

    /* JADX INFO: renamed from: a */
    public static int m160025a(Context context) {
        ntq0 ntq0VarM160040p = m160040p();
        if (ntq0VarM160040p == null) {
            return -1;
        }
        return ntq0VarM160040p.m164750a();
    }

    /* JADX INFO: renamed from: b */
    public static InputStream m160026b(Context context, URL url, boolean z, String str, String str2) {
        return m160027c(context, url, z, str, str2, null, null);
    }

    /* JADX INFO: renamed from: c */
    public static InputStream m160027c(Context context, URL url, boolean z, String str, String str2, Map<String, String> map, C18707e c18707e) throws IOException {
        if (context == null) {
            wg3.m206174a("context");
            return null;
        }
        if (url == null) {
            wg3.m206174a("url");
            return null;
        }
        if (!z) {
            url = new URL(m160032h(url.toString()));
        }
        try {
            HttpURLConnection.setFollowRedirects(true);
            HttpURLConnection httpURLConnectionM160035k = m160035k(context, url);
            httpURLConnectionM160035k.setConnectTimeout(10000);
            httpURLConnectionM160035k.setReadTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
            if (!TextUtils.isEmpty(str)) {
                httpURLConnectionM160035k.setRequestProperty("User-Agent", str);
            }
            if (str2 != null) {
                httpURLConnectionM160035k.setRequestProperty(HttpHeaders.COOKIE, str2);
            }
            if (map != null) {
                for (String str3 : map.keySet()) {
                    httpURLConnectionM160035k.setRequestProperty(str3, map.get(str3));
                }
            }
            return new C18706d(httpURLConnectionM160035k.getInputStream());
        } catch (IOException e) {
            zpg0.m220844a("IOException:".concat(e.getClass().getSimpleName()));
            return null;
        } catch (Throwable th) {
            zpg0.m220844a(th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m160028d(Context context) {
        if (context == null) {
            context = t5r0.m189418b();
        }
        C18703a c18703a = null;
        if (context != null && !l4r0.m152825j(context)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
                C18703a c18703a2 = new C18703a();
                try {
                    jj5.m145016j(connectivityManager, networkRequestBuild, c18703a2);
                    return c18703a2;
                } catch (Throwable th) {
                    th = th;
                    c18703a = c18703a2;
                    ouq0.m169393m("exception occurred in adding network callback :" + th);
                    return c18703a;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return c18703a;
    }

    /* JADX INFO: renamed from: e */
    public static String m160029e(Context context) {
        if (m160048x(context)) {
            return "wifi";
        }
        ntq0 ntq0VarM160040p = m160040p();
        if (ntq0VarM160040p == null) {
            return "";
        }
        return (ntq0VarM160040p.m164753e() + "-" + ntq0VarM160040p.m164756h()).toLowerCase();
    }

    /* JADX INFO: renamed from: f */
    public static String m160030f(Context context, URL url) {
        return m160031g(context, url, false, null, "UTF-8", null);
    }

    /* JADX INFO: renamed from: g */
    public static String m160031g(Context context, URL url, boolean z, String str, String str2, String str3) throws Throwable {
        InputStream inputStreamM160026b;
        try {
            inputStreamM160026b = m160026b(context, url, z, str, str3);
            try {
                StringBuilder sb = new StringBuilder(1024);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamM160026b, str2));
                char[] cArr = new char[4096];
                while (true) {
                    int i = bufferedReader.read(cArr);
                    if (-1 == i) {
                        j6r0.m143691b(inputStreamM160026b);
                        return sb.toString();
                    }
                    sb.append(cArr, 0, i);
                }
            } catch (Throwable th) {
                th = th;
                j6r0.m143691b(inputStreamM160026b);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamM160026b = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m160032h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new String();
        return String.format("%s&key=%s", str, zuq0.m221701b(String.format("%sbe988a6134bc8254465424e5a70ef037", str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static String m160033i(String str, Map<String, String> map, File file, String str2) {
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
                httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
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
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new C18706d(httpURLConnection.getInputStream())));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                String string = stringBuffer.toString();
                                j6r0.m143691b(fileInputStream);
                                j6r0.m143691b(bufferedReader);
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
                j6r0.m143691b(null);
                j6r0.m143691b(file);
                throw th3;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m160034j(Map<String, String> map) {
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
                    ouq0.m169393m("Failed to convert from params map to string: " + e);
                    ouq0.m169393m("map: " + map.toString());
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
    public static HttpURLConnection m160035k(Context context, URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    /* JADX INFO: renamed from: l */
    private static URL m160036l(String str) {
        return new URL(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static ktq0 m160037m(Context context, String str, String str2, Map<String, String> map, String str3) {
        boolean zEqualsIgnoreCase;
        BufferedReader bufferedReader;
        ktq0 ktq0Var = new ktq0();
        try {
            try {
                try {
                    HttpURLConnection httpURLConnectionM160035k = m160035k(context, m160036l(str));
                    httpURLConnectionM160035k.setConnectTimeout(10000);
                    httpURLConnectionM160035k.setReadTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
                    String str4 = str2;
                    if (str2 == 0) {
                        str4 = "GET";
                    }
                    httpURLConnectionM160035k.setRequestMethod(str4);
                    int i = 0;
                    if (map != null) {
                        zEqualsIgnoreCase = HttpHeaderValues.GZIP.equalsIgnoreCase(map.get("Content-Encoding"));
                        for (String str5 : map.keySet()) {
                            httpURLConnectionM160035k.setRequestProperty(str5, map.get(str5));
                        }
                    } else {
                        zEqualsIgnoreCase = false;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        httpURLConnectionM160035k.setDoOutput(true);
                        byte[] bytes = str3.getBytes();
                        OutputStream gZIPOutputStream = zEqualsIgnoreCase ? new GZIPOutputStream(httpURLConnectionM160035k.getOutputStream()) : httpURLConnectionM160035k.getOutputStream();
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
                    ktq0Var.f128728a = httpURLConnectionM160035k.getResponseCode();
                    ouq0.m169393m("Http POST Response Code: " + ktq0Var.f128728a);
                    while (true) {
                        String headerFieldKey = httpURLConnectionM160035k.getHeaderFieldKey(i);
                        String headerField = httpURLConnectionM160035k.getHeaderField(i);
                        if (headerFieldKey == null && headerField == null) {
                            try {
                                break;
                            } catch (IOException unused) {
                                bufferedReader = new BufferedReader(new InputStreamReader(new C18706d(httpURLConnectionM160035k.getErrorStream())));
                            }
                        } else {
                            ktq0Var.f128729b.put(headerFieldKey, headerField);
                            i += 2;
                        }
                        throw new IOException("err while request " + str + ":" + e.getClass().getSimpleName());
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(new C18706d(httpURLConnectionM160035k.getInputStream())));
                    try {
                        StringBuffer stringBuffer = new StringBuffer();
                        String property = System.getProperty("line.separator");
                        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                            stringBuffer.append(line);
                            stringBuffer.append(property);
                        }
                        ktq0Var.f128730c = stringBuffer.toString();
                        bufferedReader.close();
                        j6r0.m143691b(null);
                        j6r0.m143691b(null);
                        return ktq0Var;
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
            j6r0.m143691b(null);
            j6r0.m143691b(str2);
            throw th4;
        }
    }

    /* JADX INFO: renamed from: n */
    public static ktq0 m160038n(Context context, String str, Map<String, String> map) {
        return m160037m(context, str, "POST", null, m160034j(map));
    }

    /* JADX INFO: renamed from: o */
    private static C18705c<ntq0> m160039o() {
        return new C18705c<>(new CallableC18704b());
    }

    /* JADX INFO: renamed from: p */
    public static ntq0 m160040p() {
        AtomicReference<C18705c<ntq0>> atomicReference = f138651a;
        C18705c<ntq0> c18705cM160039o = atomicReference.get();
        if (c18705cM160039o == null) {
            return null;
        }
        try {
            if (c18705cM160039o.m160052a()) {
                c18705cM160039o = m160039o();
                atomicReference.set(c18705cM160039o);
            }
            if (!c18705cM160039o.isDone()) {
                c18705cM160039o.run();
            }
            return c18705cM160039o.get();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static ntq0 m160041q(Context context) {
        return m160040p();
    }

    /* JADX INFO: renamed from: r */
    public static void m160042r() {
        m160045u();
    }

    /* JADX INFO: renamed from: s */
    public static void m160043s(Context context, Object obj) {
        if (context == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof ConnectivityManager.NetworkCallback) {
                ((ConnectivityManager) context.getSystemService("connectivity")).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj);
            }
        } catch (Throwable th) {
            ouq0.m169393m("exception occurred in removing network callback :" + th);
        }
    }

    /* JADX INFO: renamed from: t */
    public static boolean m160044t(Context context) {
        return m160025a(context) >= 0;
    }

    /* JADX INFO: renamed from: u */
    public static void m160045u() {
        f138651a.set(m160039o());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: v */
    public static boolean m160046v(Context context) {
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
        return zHasCapability && m160047w(context);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m160047w(Context context) {
        ntq0 ntq0VarM160040p = m160040p();
        return ntq0VarM160040p != null && ntq0VarM160040p.m164754f();
    }

    /* JADX INFO: renamed from: x */
    public static boolean m160048x(Context context) {
        ntq0 ntq0VarM160040p = m160040p();
        return ntq0VarM160040p != null && 1 == ntq0VarM160040p.m164750a();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m160049y(Context context) {
        ntq0 ntq0VarM160041q = m160041q(context);
        return ntq0VarM160041q != null && ntq0VarM160041q.m164750a() == 0 && 20 == ntq0VarM160041q.m164755g();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m160050z(Context context) {
        ntq0 ntq0VarM160041q = m160041q(context);
        return ntq0VarM160041q != null && ntq0VarM160041q.m164750a() == 0 && 13 == ntq0VarM160041q.m164755g();
    }
}
