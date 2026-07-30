package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import p153l.mnd0;

/* JADX INFO: loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e */
    public static final byte[] f206781e = {42};

    /* JADX INFO: renamed from: f */
    public static final String[] f206782f = new String[0];

    /* JADX INFO: renamed from: g */
    public static final String[] f206783g = {"*"};

    /* JADX INFO: renamed from: h */
    public static final PublicSuffixDatabase f206784h = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f206785a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f206786b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c */
    public byte[] f206787c;

    /* JADX INFO: renamed from: d */
    public byte[] f206788d;

    /* JADX INFO: renamed from: a */
    public static String m222310a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, StandardCharsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static PublicSuffixDatabase m222311c() {
        return f206784h;
    }

    /* JADX INFO: renamed from: b */
    public final String[] m222312b(String[] strArr) {
        String str;
        String strM222310a;
        String strM222310a2;
        if (this.f206785a.get() || !this.f206785a.compareAndSet(false, true)) {
            try {
                this.f206786b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m222315f();
        }
        synchronized (this) {
            if (this.f206787c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i = 0; i < strArr.length; i++) {
            bArr[i] = strArr[i].getBytes(StandardCharsets.UTF_8);
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= length) {
                strM222310a = null;
                break;
            }
            strM222310a = m222310a(this.f206787c, bArr, i2);
            if (strM222310a != null) {
                break;
            }
            i2++;
        }
        if (length <= 1) {
            strM222310a2 = null;
            break;
        }
        byte[][] bArr2 = (byte[][]) bArr.clone();
        int i3 = 0;
        while (true) {
            if (i3 >= bArr2.length - 1) {
                strM222310a2 = null;
                break;
            }
            bArr2[i3] = f206781e;
            strM222310a2 = m222310a(this.f206787c, bArr2, i3);
            if (strM222310a2 != null) {
                break;
            }
            i3++;
        }
        if (strM222310a2 != null) {
            for (int i4 = 0; i4 < length - 1; i4++) {
                String strM222310a3 = m222310a(this.f206788d, bArr, i4);
                if (strM222310a3 != null) {
                    str = strM222310a3;
                    break;
                }
            }
        }
        if (str != null) {
            return "!".concat(str).split("\\.");
        }
        if (strM222310a == null && strM222310a2 == null) {
            return f206783g;
        }
        String[] strArrSplit = strM222310a != null ? strM222310a.split("\\.") : f206782f;
        String[] strArrSplit2 = strM222310a2 != null ? strM222310a2.split("\\.") : f206782f;
        return strArrSplit.length > strArrSplit2.length ? strArrSplit : strArrSplit2;
    }

    /* JADX INFO: renamed from: d */
    public String m222313d(String str) {
        int length;
        int length2;
        if (str == null) {
            mnd0.m159157a("domain == null");
            return null;
        }
        String[] strArrSplit = IDN.toUnicode(str).split("\\.");
        String[] strArrM222312b = m222312b(strArrSplit);
        if (strArrSplit.length == strArrM222312b.length && strArrM222312b[0].charAt(0) != '!') {
            return null;
        }
        if (strArrM222312b[0].charAt(0) == '!') {
            length = strArrSplit.length;
            length2 = strArrM222312b.length;
        } else {
            length = strArrSplit.length;
            length2 = strArrM222312b.length + 1;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit2 = str.split("\\.");
        for (int i = length - length2; i < strArrSplit2.length; i++) {
            sb.append(strArrSplit2[i]);
            sb.append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public final void m222314e() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        BufferedSource bufferedSourceBuffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
        try {
            byte[] bArr = new byte[bufferedSourceBuffer.readInt()];
            bufferedSourceBuffer.readFully(bArr);
            byte[] bArr2 = new byte[bufferedSourceBuffer.readInt()];
            bufferedSourceBuffer.readFully(bArr2);
            bufferedSourceBuffer.close();
            synchronized (this) {
                this.f206787c = bArr;
                this.f206788d = bArr2;
            }
            this.f206786b.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m222315f() {
        boolean z = false;
        while (true) {
            try {
                try {
                    m222314e();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    Platform.get().log(5, "Failed to read public suffix list", e);
                    if (!z) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!z) {
            return;
        }
        Thread.currentThread().interrupt();
    }
}
