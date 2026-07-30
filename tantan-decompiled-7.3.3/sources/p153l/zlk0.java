package p153l;

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
public final class zlk0 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f204946a;

    /* JADX INFO: renamed from: d */
    public static final k5d0 f204949d;

    /* JADX INFO: renamed from: e */
    public static final z1d0 f204950e;

    /* JADX INFO: renamed from: k */
    public static final Method f204956k;

    /* JADX INFO: renamed from: l */
    public static final Pattern f204957l;

    /* JADX INFO: renamed from: b */
    public static final String[] f204947b = new String[0];

    /* JADX INFO: renamed from: c */
    public static final e0l f204948c = e0l.m118872j(new String[0]);

    /* JADX INFO: renamed from: f */
    public static final Options f204951f = Options.m222322of(ByteString.decodeHex("efbbbf"), ByteString.decodeHex("feff"), ByteString.decodeHex("fffe"), ByteString.decodeHex("0000ffff"), ByteString.decodeHex("ffff0000"));

    /* JADX INFO: renamed from: g */
    public static final Charset f204952g = Charset.forName("UTF-32BE");

    /* JADX INFO: renamed from: h */
    public static final Charset f204953h = Charset.forName("UTF-32LE");

    /* JADX INFO: renamed from: i */
    public static final TimeZone f204954i = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: j */
    public static final Comparator<String> f204955j = new zvq0();

    static {
        byte[] bArr = new byte[0];
        f204946a = bArr;
        Method declaredMethod = null;
        f204949d = k5d0.create((e7y) null, bArr);
        f204950e = z1d0.create((e7y) null, bArr);
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f204956k = declaredMethod;
        f204957l = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* JADX INFO: renamed from: A */
    public static boolean m220227A(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m220228B(Comparator<String> comparator, String[] strArr, String[] strArr2) {
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
    public static X509TrustManager m220229C() {
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
    public static boolean m220230D(rnl rnlVar, rnl rnlVar2) {
        return rnlVar.m182286m().equals(rnlVar2.m182286m()) && rnlVar.m182291y() == rnlVar2.m182291y() && rnlVar.m182278I().equals(rnlVar2.m182278I());
    }

    /* JADX INFO: renamed from: E */
    public static boolean m220231E(Source source, int i, TimeUnit timeUnit) throws IOException {
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
    public static int m220232F(String str, int i, int i2) {
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
    public static int m220233G(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: H */
    public static ThreadFactory m220234H(final String str, final boolean z) {
        return new ThreadFactory() { // from class: l.vlk0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return zlk0.m220239a(str, z, runnable);
            }
        };
    }

    /* JADX INFO: renamed from: I */
    public static List<xzk> m220235I(e0l e0lVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < e0lVar.m118878k(); i++) {
            arrayList.add(new xzk(e0lVar.m118875f(i), e0lVar.m118880m(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public static e0l m220236J(List<xzk> list) {
        e0l.C16674a c16674a = new e0l.C16674a();
        for (xzk xzkVar : list) {
            kzm.f129436a.mo152193b(c16674a, xzkVar.f196884a.utf8(), xzkVar.f196885b.utf8());
        }
        return c16674a.m118886e();
    }

    /* JADX INFO: renamed from: K */
    public static String m220237K(String str, int i, int i2) {
        int iM220232F = m220232F(str, i, i2);
        return str.substring(iM220232F, m220233G(str, iM220232F, i2));
    }

    /* JADX INFO: renamed from: L */
    public static boolean m220238L(String str) {
        return f204957l.matcher(str).matches();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Thread m220239a(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    /* JADX INFO: renamed from: b */
    public static void m220240b(Throwable th, Throwable th2) {
        Method method = f204956k;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Charset m220241c(BufferedSource bufferedSource, Charset charset) throws IOException {
        int iSelect = bufferedSource.select(f204951f);
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
            return f204952g;
        }
        if (iSelect == 4) {
            return f204953h;
        }
        aqg0.m99478a();
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m220242d(String str) {
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty() || m220248j(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM220251m = (str.startsWith("[") && str.endsWith(Constants.AES_SUFFIX)) ? m220251m(str, 1, str.length() - 1) : m220251m(str, 0, str.length());
        if (inetAddressM220251m == null) {
            return null;
        }
        byte[] address = inetAddressM220251m.getAddress();
        if (address.length == 16) {
            return m220263y(address);
        }
        if (address.length == 4) {
            return inetAddressM220251m.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + "'");
    }

    /* JADX INFO: renamed from: e */
    public static int m220243e(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            ulk0.m196558a(str, " < 0");
            return 0;
        }
        if (timeUnit == null) {
            mnd0.m159157a("unit == null");
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            ulk0.m196558a(str, " too large.");
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        ulk0.m196558a(str, " too small.");
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static void m220244f(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m220245g(Closeable closeable) {
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
    public static void m220246h(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m220227A(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static String[] m220247i(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m220248j(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static int m220249k(char c) {
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
    public static boolean m220250l(String str, int i, int i2, byte[] bArr, int i3) {
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
    public static InetAddress m220251m(String str, int i, int i2) {
        int i3;
        int i4;
        int iM220249k;
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
                    iM220249k = m220249k(str.charAt(i));
                    if (iM220249k == -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + iM220249k;
                    i++;
                }
                i4 = i - i7;
                if (i4 != 0) {
                }
                return null;
            }
            if (i5 != 0) {
                if (!str.regionMatches(i, ":", 0, 1)) {
                    if (!str.regionMatches(i, ".", 0, 1) || !m220250l(str, i7, i2, bArr, i5 - 2)) {
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
                iM220249k = m220249k(str.charAt(i));
                if (iM220249k == -1) {
                    break;
                }
                i3 = (i3 << 4) + iM220249k;
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
            aqg0.m99478a();
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m220252n(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: o */
    public static int m220253o(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m220254p(Source source, int i, TimeUnit timeUnit) {
        try {
            return m220231E(source, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m220255q(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX INFO: renamed from: r */
    public static String m220256r(String str, String str2) {
        try {
            String property = System.getProperty(str);
            return property != null ? property : str2;
        } catch (AccessControlException unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m220257s(rnl rnlVar, boolean z) {
        String strM182286m;
        if (rnlVar.m182286m().contains(":")) {
            strM182286m = "[" + rnlVar.m182286m() + Constants.AES_SUFFIX;
        } else {
            strM182286m = rnlVar.m182286m();
        }
        if (!z && rnlVar.m182291y() == rnl.m182262e(rnlVar.m182278I())) {
            return strM182286m;
        }
        return strM182286m + ":" + rnlVar.m182291y();
    }

    /* JADX INFO: renamed from: t */
    public static <T> List<T> m220258t(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @SafeVarargs
    /* JADX INFO: renamed from: u */
    public static <T> List<T> m220259u(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* JADX INFO: renamed from: v */
    public static <K, V> Map<K, V> m220260v(Map<K, V> map) {
        return map.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* JADX INFO: renamed from: w */
    public static int m220261w(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: x */
    public static int m220262x(String str) {
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
    public static String m220263y(byte[] bArr) {
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
    public static String[] m220264z(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
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
