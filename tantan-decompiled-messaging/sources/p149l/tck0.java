package p149l;

import com.clevertap.android.sdk.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Source;

/* JADX INFO: loaded from: classes2.dex */
public final class tck0 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f169450a;

    /* JADX INFO: renamed from: d */
    public static final gxc0 f169453d;

    /* JADX INFO: renamed from: e */
    public static final utc0 f169454e;

    /* JADX INFO: renamed from: k */
    public static final Method f169460k;

    /* JADX INFO: renamed from: l */
    public static final Pattern f169461l;

    /* JADX INFO: renamed from: b */
    public static final String[] f169451b = new String[0];

    /* JADX INFO: renamed from: c */
    public static final oxk f169452c = oxk.m166553j(new String[0]);

    /* JADX INFO: renamed from: f */
    public static final Options f169455f = Options.m221055of(ByteString.decodeHex("efbbbf"), ByteString.decodeHex("feff"), ByteString.decodeHex("fffe"), ByteString.decodeHex("0000ffff"), ByteString.decodeHex("ffff0000"));

    /* JADX INFO: renamed from: g */
    public static final Charset f169456g = Charset.forName("UTF-32BE");

    /* JADX INFO: renamed from: h */
    public static final Charset f169457h = Charset.forName("UTF-32LE");

    /* JADX INFO: renamed from: i */
    public static final TimeZone f169458i = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: j */
    public static final Comparator<String> f169459j = new tmq0();

    static {
        byte[] bArr = new byte[0];
        f169450a = bArr;
        Method declaredMethod = null;
        f169453d = gxc0.create((hyx) null, bArr);
        f169454e = utc0.create((hyx) null, bArr);
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f169460k = declaredMethod;
        f169461l = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* JADX INFO: renamed from: A */
    public static boolean m187988A(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m187989B(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public static X509TrustManager m187990C() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    /* JADX INFO: renamed from: D */
    public static boolean m187991D(cll cllVar, cll cllVar2) {
        return cllVar.m107522m().equals(cllVar2.m107522m()) && cllVar.m107527y() == cllVar2.m107527y() && cllVar.m107514I().equals(cllVar2.m107514I());
    }

    /* JADX INFO: renamed from: E */
    public static boolean m187992E(Source source, int i, TimeUnit timeUnit) throws IOException {
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = source.timeout().getHasDeadline() ? source.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
                return true;
            }
            source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
                return false;
            }
            source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: F */
    public static int m187993F(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: G */
    public static int m187994G(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: H */
    public static ThreadFactory m187995H(final String str, final boolean z) {
        return new ThreadFactory() { // from class: l.pck0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return tck0.m188000a(str, z, runnable);
            }
        };
    }

    /* JADX INFO: renamed from: I */
    public static List<hxk> m187996I(oxk oxkVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < oxkVar.m166559k(); i++) {
            arrayList.add(new hxk(oxkVar.m166556f(i), oxkVar.m166561m(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public static oxk m187997J(List<hxk> list) {
        oxk.C19066a c19066a = new oxk.C19066a();
        for (hxk hxkVar : list) {
            kxm.f125142a.mo144872b(c19066a, hxkVar.f109881a.utf8(), hxkVar.f109882b.utf8());
        }
        return c19066a.m166567e();
    }

    /* JADX INFO: renamed from: K */
    public static String m187998K(String str, int i, int i2) {
        int iM187993F = m187993F(str, i, i2);
        return str.substring(iM187993F, m187994G(str, iM187993F, i2));
    }

    /* JADX INFO: renamed from: L */
    public static boolean m187999L(String str) {
        return f169461l.matcher(str).matches();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Thread m188000a(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    /* JADX INFO: renamed from: b */
    public static void m188001b(Throwable th, Throwable th2) {
        Method method = f169460k;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Charset m188002c(BufferedSource bufferedSource, Charset charset) throws IOException {
        int iSelect = bufferedSource.select(f169455f);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iSelect == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iSelect == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iSelect == 3) {
            return f169456g;
        }
        if (iSelect == 4) {
            return f169457h;
        }
        shg0.m184191a();
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m188003d(String str) {
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty() || m188009j(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM188012m = (str.startsWith("[") && str.endsWith(Constants.AES_SUFFIX)) ? m188012m(str, 1, str.length() - 1) : m188012m(str, 0, str.length());
        if (inetAddressM188012m == null) {
            return null;
        }
        byte[] address = inetAddressM188012m.getAddress();
        if (address.length == 16) {
            return m188024y(address);
        }
        if (address.length == 4) {
            return inetAddressM188012m.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + "'");
    }

    /* JADX INFO: renamed from: e */
    public static int m188004e(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            ock0.m163533a(str, " < 0");
            return 0;
        }
        if (timeUnit == null) {
            jfd0.m141176a("unit == null");
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            ock0.m163533a(str, " too large.");
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        ock0.m163533a(str, " too small.");
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static void m188005f(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m188006g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m188007h(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m187988A(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static String[] m188008i(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m188009j(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static int m188010k(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: l */
    public static boolean m188011l(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char cCharAt = str.charAt(i5);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a A[LOOP:1: B:30:0x004d->B:34:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0060 A[EDGE_INSN: B:59:0x0060->B:35:0x0060 BREAK  A[LOOP:1: B:30:0x004d->B:34:0x005a], SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public static InetAddress m188012m(String str, int i, int i2) {
        int i3;
        int i4;
        int iM188010k;
        byte[] bArr = new byte[16];
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i < i2) {
            if (i5 == 16) {
                return null;
            }
            int i8 = i + 2;
            if (i8 <= i2 && str.regionMatches(i, "::", 0, 2)) {
                if (i6 != -1) {
                    return null;
                }
                i5 += 2;
                i6 = i5;
                if (i8 == i2) {
                    break;
                }
                i7 = i8;
                i3 = 0;
                i = i7;
                while (i < i2) {
                    iM188010k = m188010k(str.charAt(i));
                    if (iM188010k == -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + iM188010k;
                    i++;
                }
                i4 = i - i7;
                if (i4 != 0) {
                }
                return null;
            }
            if (i5 != 0) {
                if (!str.regionMatches(i, ":", 0, 1)) {
                    if (!str.regionMatches(i, ".", 0, 1) || !m188011l(str, i7, i2, bArr, i5 - 2)) {
                        return null;
                    }
                    i5 += 2;
                    break;
                }
                i++;
            }
            i7 = i;
            i3 = 0;
            i = i7;
            while (i < i2) {
                iM188010k = m188010k(str.charAt(i));
                if (iM188010k == -1) {
                    break;
                }
                i3 = (i3 << 4) + iM188010k;
                i++;
            }
            i4 = i - i7;
            if (i4 != 0 || i4 > 4) {
                return null;
            }
            int i9 = i5 + 1;
            bArr[i5] = (byte) ((i3 >>> 8) & 255);
            i5 += 2;
            bArr[i9] = (byte) (i3 & 255);
        }
        if (i5 != 16) {
            if (i6 == -1) {
                return null;
            }
            int i10 = i5 - i6;
            System.arraycopy(bArr, i6, bArr, 16 - i10, i10);
            Arrays.fill(bArr, i6, (16 - i5) + i6, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            shg0.m184191a();
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m188013n(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: o */
    public static int m188014o(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m188015p(Source source, int i, TimeUnit timeUnit) {
        try {
            return m187992E(source, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m188016q(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX INFO: renamed from: r */
    public static String m188017r(String str, String str2) {
        try {
            String property = System.getProperty(str);
            return property != null ? property : str2;
        } catch (AccessControlException unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m188018s(cll cllVar, boolean z) {
        String strM107522m;
        if (cllVar.m107522m().contains(":")) {
            strM107522m = "[" + cllVar.m107522m() + Constants.AES_SUFFIX;
        } else {
            strM107522m = cllVar.m107522m();
        }
        if (!z && cllVar.m107527y() == cll.m107498e(cllVar.m107514I())) {
            return strM107522m;
        }
        return strM107522m + ":" + cllVar.m107527y();
    }

    /* JADX INFO: renamed from: t */
    public static <T> List<T> m188019t(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @SafeVarargs
    /* JADX INFO: renamed from: u */
    public static <T> List<T> m188020u(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* JADX INFO: renamed from: v */
    public static <K, V> Map<K, V> m188021v(Map<K, V> map) {
        return map.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* JADX INFO: renamed from: w */
    public static int m188022w(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: x */
    public static int m188023x(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public static String m188024y(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        Buffer buffer = new Buffer();
        while (i2 < bArr.length) {
            if (i2 == i) {
                buffer.writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong(((bArr[i2] & 255) << 8) | (bArr[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return buffer.readUtf8();
    }

    /* JADX INFO: renamed from: z */
    public static String[] m188025z(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
