package com.tencent.cloud.p075ai.network.okhttp3.internal;

import com.clevertap.android.sdk.Constants;
import com.tencent.cloud.p075ai.network.okhttp3.C13766o;
import com.tencent.cloud.p075ai.network.okhttp3.C13767p;
import com.tencent.cloud.p075ai.network.okhttp3.MediaType;
import com.tencent.cloud.p075ai.network.okhttp3.RequestBody;
import com.tencent.cloud.p075ai.network.okhttp3.ResponseBody;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http2.C13730c;
import com.tencent.cloud.p075ai.network.okio.ByteString;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.cloud.p075ai.network.okio.C13787p;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13778g;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13794w;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
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
import p149l.ig3;
import p149l.jfd0;
import p149l.ock0;
import p149l.shg0;
import p149l.tmq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.c */
/* JADX INFO: loaded from: classes13.dex */
public final class C13706c {

    /* JADX INFO: renamed from: a */
    public static final byte[] f56455a = new byte[0];

    /* JADX INFO: renamed from: b */
    public static final C13766o f56456b;

    /* JADX INFO: renamed from: c */
    public static final ResponseBody f56457c;

    /* JADX INFO: renamed from: d */
    public static final RequestBody f56458d;

    /* JADX INFO: renamed from: e */
    public static final C13787p f56459e;

    /* JADX INFO: renamed from: f */
    public static final Charset f56460f;

    /* JADX INFO: renamed from: g */
    public static final Charset f56461g;

    /* JADX INFO: renamed from: h */
    public static final TimeZone f56462h;

    /* JADX INFO: renamed from: i */
    public static final Comparator<String> f56463i;

    /* JADX INFO: renamed from: j */
    public static final Method f56464j;

    /* JADX INFO: renamed from: k */
    public static final Pattern f56465k;

    static {
        String[] strArr = (String[]) new String[0].clone();
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str == null) {
                ig3.m135964a("Headers cannot be null");
                return;
            }
            strArr[i] = str.trim();
        }
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            String str2 = strArr[i2];
            String str3 = strArr[i2 + 1];
            C13766o.m81841a(str2);
            C13766o.m81842a(str3, str2);
        }
        f56456b = new C13766o(strArr);
        byte[] bArr = f56455a;
        Method declaredMethod = null;
        f56457c = ResponseBody.create((MediaType) null, bArr);
        f56458d = RequestBody.create((MediaType) null, bArr);
        f56459e = new C13787p((ByteString[]) new ByteString[]{ByteString.decodeHex("efbbbf"), ByteString.decodeHex("feff"), ByteString.decodeHex("fffe"), ByteString.decodeHex("0000ffff"), ByteString.decodeHex("ffff0000")}.clone());
        f56460f = Charset.forName("UTF-32BE");
        f56461g = Charset.forName("UTF-32LE");
        f56462h = TimeZone.getTimeZone("GMT");
        f56463i = new tmq0();
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f56464j = declaredMethod;
        f56465k = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb A[LOOP:1: B:59:0x00ae->B:63:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x00c1 A[EDGE_INSN: B:90:0x00c1->B:64:0x00c1 BREAK  A[LOOP:1: B:59:0x00ae->B:63:0x00bb], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static InetAddress m81607a(String str, int i, int i2) {
        InetAddress inetAddress;
        InetAddress inetAddress2;
        int i3;
        int i4;
        int iM81598a;
        byte[] bArr = new byte[16];
        int i5 = i;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            InetAddress inetAddress3 = null;
            if (i5 >= i2) {
                inetAddress = null;
                break;
            }
            if (i6 == 16) {
                return null;
            }
            int i9 = i5 + 2;
            if (i9 <= i2 && str.regionMatches(i5, "::", 0, 2)) {
                if (i7 != -1) {
                    return null;
                }
                i6 += 2;
                i7 = i6;
                inetAddress = null;
                if (i9 == i2) {
                    break;
                }
                i8 = i9;
                i3 = 0;
                i5 = i8;
                while (i5 < i2) {
                    iM81598a = m81598a(str.charAt(i5));
                    if (iM81598a == -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + iM81598a;
                    i5++;
                }
                i4 = i5 - i8;
                if (i4 != 0) {
                }
                return inetAddress;
            }
            if (i6 == 0) {
                inetAddress = null;
                i8 = i5;
            } else {
                if (!str.regionMatches(i5, ":", 0, 1)) {
                    if (!str.regionMatches(i5, ".", 0, 1)) {
                        return null;
                    }
                    int i10 = i6 - 2;
                    int i11 = i10;
                    while (i8 < i2) {
                        if (i11 != 16) {
                            if (i11 != i10) {
                                if (str.charAt(i8) == '.') {
                                    i8++;
                                }
                            }
                            int i12 = 0;
                            int i13 = i8;
                            while (true) {
                                if (i13 >= i2) {
                                    inetAddress2 = inetAddress3;
                                    break;
                                }
                                char cCharAt = str.charAt(i13);
                                inetAddress2 = inetAddress3;
                                if (cCharAt < '0' || cCharAt > '9') {
                                    break;
                                }
                                if ((i12 == 0 && i8 != i13) || (i12 = ((i12 * 10) + cCharAt) - 48) > 255) {
                                    return inetAddress2;
                                }
                                i13++;
                                inetAddress3 = inetAddress2;
                            }
                            if (i13 - i8 == 0) {
                                return inetAddress2;
                            }
                            bArr[i11] = (byte) i12;
                            inetAddress3 = inetAddress2;
                            i11++;
                            i8 = i13;
                        }
                        return inetAddress3;
                    }
                    inetAddress = inetAddress3;
                    if (i11 == i6 + 2) {
                        i6 += 2;
                        break;
                    }
                    return inetAddress;
                }
                i8 = i5 + 1;
                inetAddress = null;
            }
            i3 = 0;
            i5 = i8;
            while (i5 < i2) {
                iM81598a = m81598a(str.charAt(i5));
                if (iM81598a == -1) {
                    break;
                }
                i3 = (i3 << 4) + iM81598a;
                i5++;
            }
            i4 = i5 - i8;
            if (i4 != 0 || i4 > 4) {
                return inetAddress;
            }
            int i14 = i6 + 1;
            bArr[i6] = (byte) (255 & (i3 >>> 8));
            i6 += 2;
            bArr[i14] = (byte) (i3 & 255);
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return inetAddress;
            }
            int i15 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i15, i15);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            shg0.m184191a();
            return inetAddress;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m81624b(InterfaceC13794w interfaceC13794w, int i, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        long jMo81953c = interfaceC13794w.timeout().mo81954d() ? interfaceC13794w.timeout().mo81953c() - jNanoTime : Long.MAX_VALUE;
        interfaceC13794w.timeout().mo81950a(Math.min(jMo81953c, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C13776e c13776e = new C13776e();
            while (interfaceC13794w.mo81631a(c13776e, 8192L) != -1) {
                c13776e.m81944k();
            }
            if (jMo81953c == Long.MAX_VALUE) {
                interfaceC13794w.timeout().mo81949a();
                return true;
            }
            interfaceC13794w.timeout().mo81950a(jNanoTime + jMo81953c);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo81953c == Long.MAX_VALUE) {
                interfaceC13794w.timeout().mo81949a();
                return false;
            }
            interfaceC13794w.timeout().mo81950a(jNanoTime + jMo81953c);
            return false;
        } catch (Throwable th) {
            if (jMo81953c == Long.MAX_VALUE) {
                interfaceC13794w.timeout().mo81949a();
            } else {
                interfaceC13794w.timeout().mo81950a(jNanoTime + jMo81953c);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m81626c(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static String m81627d(String str, int i, int i2) {
        int iM81622b = m81622b(str, i, i2);
        return str.substring(iM81622b, m81626c(str, iM81622b, i2));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m81625b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
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

    /* JADX INFO: renamed from: b */
    public static int m81622b(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m81621b(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static C13766o m81623b(List<C13730c> list) {
        C13766o.a aVar = new C13766o.a();
        for (C13730c c13730c : list) {
            AbstractC13704a.f56453a.mo81584a(aVar, c13730c.f56627a.utf8(), c13730c.f56628b.utf8());
        }
        return new C13766o(aVar);
    }

    /* JADX INFO: renamed from: a */
    public static void m81614a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m81615a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m81616a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m81619a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m81618a(InterfaceC13794w interfaceC13794w, int i, TimeUnit timeUnit) {
        try {
            return m81624b(interfaceC13794w, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> List<T> m81609a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> Map<K, V> m81611a(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    @SafeVarargs
    /* JADX INFO: renamed from: a */
    public static <T> List<T> m81610a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* JADX INFO: renamed from: a */
    public static ThreadFactory m81612a(final String str, final boolean z) {
        return new ThreadFactory() { // from class: l.umq0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C13706c.m81606a(str, z, runnable);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Thread m81606a(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    /* JADX INFO: renamed from: a */
    public static String[] m81620a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
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

    /* JADX INFO: renamed from: a */
    public static boolean m81619a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static int m81602a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static int m81600a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m81599a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static String m81604a(String str) {
        InetAddress inetAddressM81607a;
        int i = -1;
        int i2 = 0;
        if (str.contains(":")) {
            if (str.startsWith("[") && str.endsWith(Constants.AES_SUFFIX)) {
                inetAddressM81607a = m81607a(str, 1, str.length() - 1);
            } else {
                inetAddressM81607a = m81607a(str, 0, str.length());
            }
            if (inetAddressM81607a == null) {
                return null;
            }
            byte[] address = inetAddressM81607a.getAddress();
            if (address.length == 16) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                C13776e c13776e = new C13776e();
                while (i2 < address.length) {
                    if (i2 == i) {
                        c13776e.mo81923c(58);
                        i2 += i4;
                        if (i2 == 16) {
                            c13776e.mo81923c(58);
                        }
                    } else {
                        if (i2 > 0) {
                            c13776e.mo81923c(58);
                        }
                        c13776e.mo81929e(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                        i2 += 2;
                    }
                }
                return c13776e.m81947n();
            }
            if (address.length == 4) {
                return inetAddressM81607a.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            while (i2 < lowerCase.length()) {
                char cCharAt = lowerCase.charAt(i2);
                i2 = (cCharAt > 31 && cCharAt < 127 && " #%/:?@[\\]".indexOf(cCharAt) == -1) ? i2 + 1 : 0;
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m81605a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX INFO: renamed from: a */
    public static Charset m81608a(InterfaceC13778g interfaceC13778g, Charset charset) {
        int iMo81896a = interfaceC13778g.mo81896a(f56459e);
        if (iMo81896a == -1) {
            return charset;
        }
        if (iMo81896a == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iMo81896a == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iMo81896a == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iMo81896a == 3) {
            return f56460f;
        }
        if (iMo81896a == 4) {
            return f56461g;
        }
        shg0.m184191a();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static int m81601a(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            ock0.m163533a(str, " < 0");
            return 0;
        }
        if (timeUnit != null) {
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
        jfd0.m141176a("unit == null");
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static String m81603a(C13767p c13767p, boolean z) {
        boolean zContains = c13767p.f56912d.contains(":");
        String str = c13767p.f56912d;
        if (zContains) {
            str = "[" + str + Constants.AES_SUFFIX;
        }
        if (!z && c13767p.f56913e == C13767p.m81852a(c13767p.f56909a)) {
            return str;
        }
        return str + ":" + c13767p.f56913e;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m81617a(C13767p c13767p, C13767p c13767p2) {
        return c13767p.f56912d.equals(c13767p2.f56912d) && c13767p.f56913e == c13767p2.f56913e && c13767p.f56909a.equals(c13767p2.f56909a);
    }

    /* JADX INFO: renamed from: a */
    public static int m81598a(char c) {
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

    /* JADX INFO: renamed from: a */
    public static X509TrustManager m81613a() {
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
}
