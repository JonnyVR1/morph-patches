package com.tencent.cloud.p080ai.network.okio;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p153l.dpq0;
import p153l.fcg0;
import p153l.fig0;
import p153l.gig0;
import p153l.gzi0;
import p153l.itq0;
import p153l.mlk0;
import p153l.ug3;
import p153l.vg3;
import p153l.wg3;
import p153l.wpg0;
import p153l.wtq0;
import p153l.xg3;
import p153l.yg3;
import p153l.za50;
import p153l.zg3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.e */
/* JADX INFO: loaded from: classes12.dex */
public final class C13939e implements InterfaceC13941g, InterfaceC13940f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: c */
    public static final byte[] f57816c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: a */
    public C13953s f57817a;

    /* JADX INFO: renamed from: b */
    public long f57818b;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.e$b */
    public static final class b implements Closeable {

        /* JADX INFO: renamed from: a */
        public C13939e f57820a;

        /* JADX INFO: renamed from: b */
        public boolean f57821b;

        /* JADX INFO: renamed from: c */
        public C13953s f57822c;

        /* JADX INFO: renamed from: e */
        public byte[] f57824e;

        /* JADX INFO: renamed from: d */
        public long f57823d = -1;

        /* JADX INFO: renamed from: f */
        public int f57825f = -1;

        /* JADX INFO: renamed from: g */
        public int f57826g = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f57820a == null) {
                wtq0.m207906a("not attached to a buffer");
                return;
            }
            this.f57820a = null;
            this.f57822c = null;
            this.f57823d = -1L;
            this.f57824e = null;
            this.f57825f = -1;
            this.f57826g = -1;
        }

        /* JADX INFO: renamed from: h */
        public int m83131h(long j) {
            if (j >= -1) {
                C13939e c13939e = this.f57820a;
                long j2 = c13939e.f57818b;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.f57822c = null;
                        this.f57823d = j;
                        this.f57824e = null;
                        this.f57825f = -1;
                        this.f57826g = -1;
                        return -1;
                    }
                    C13953s c13953s = c13939e.f57817a;
                    C13953s c13953sM83155a = this.f57822c;
                    long j3 = 0;
                    if (c13953sM83155a != null) {
                        long j4 = this.f57823d - ((long) (this.f57825f - c13953sM83155a.f57854b));
                        if (j4 > j) {
                            c13953sM83155a = c13953s;
                            c13953s = c13953sM83155a;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        c13953sM83155a = c13953s;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            long j5 = ((long) (c13953sM83155a.f57855c - c13953sM83155a.f57854b)) + j3;
                            if (j < j5) {
                                break;
                            }
                            c13953sM83155a = c13953sM83155a.f57858f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            c13953s = c13953s.f57859g;
                            j2 -= (long) (c13953s.f57855c - c13953s.f57854b);
                        }
                        c13953sM83155a = c13953s;
                        j3 = j2;
                    }
                    if (this.f57821b && c13953sM83155a.f57856d) {
                        C13953s c13953s2 = new C13953s((byte[]) c13953sM83155a.f57853a.clone(), c13953sM83155a.f57854b, c13953sM83155a.f57855c, false, true);
                        C13939e c13939e2 = this.f57820a;
                        if (c13939e2.f57817a == c13953sM83155a) {
                            c13939e2.f57817a = c13953s2;
                        }
                        c13953sM83155a = c13953sM83155a.m83155a(c13953s2);
                        c13953sM83155a.f57859g.m83154a();
                    }
                    this.f57822c = c13953sM83155a;
                    this.f57823d = j;
                    this.f57824e = c13953sM83155a.f57853a;
                    int i = c13953sM83155a.f57854b + ((int) (j - j3));
                    this.f57825f = i;
                    int i2 = c13953sM83155a.f57855c;
                    this.f57826g = i2;
                    return i2 - i;
                }
            }
            zg3.m219589a("offset=%s > size=%s", new Object[]{Long.valueOf(j), Long.valueOf(this.f57820a.f57818b)});
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public C13939e m83089a(String str, int i, int i2) {
        char cCharAt;
        if (i < 0) {
            za50.m219101a("beginIndex < 0: ", i);
            return null;
        }
        if (i2 < i) {
            itq0.m142074a("endIndex < beginIndex: ", i2, " < ", i);
            return null;
        }
        if (i2 > str.length()) {
            dpq0.m117417a("endIndex > string.length: ", i2, " > ", str.length());
            return null;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C13953s c13953sM83108d = m83108d(1);
                byte[] bArr = c13953sM83108d.f57853a;
                int i3 = c13953sM83108d.f57855c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c13953sM83108d.f57855c;
                int i6 = (i3 + i) - i5;
                c13953sM83108d.f57855c = i5 + i6;
                this.f57818b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    mo83106c((cCharAt2 >> 6) | 192);
                    mo83106c((cCharAt2 & '?') | 128);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    mo83106c((cCharAt2 >> '\f') | 224);
                    mo83106c(((cCharAt2 >> 6) & 63) | 128);
                    mo83106c((cCharAt2 & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char cCharAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        mo83106c(63);
                        i = i7;
                    } else {
                        int i8 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        mo83106c((i8 >> 18) | 240);
                        mo83106c(((i8 >> 12) & 63) | 128);
                        mo83106c(((i8 >> 6) & 63) | 128);
                        mo83106c((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C13939e m83101b(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            wg3.m206174a("source == null");
            return null;
        }
        long j = i2;
        C13959y.m83164a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C13953s c13953sM83108d = m83108d(1);
            int iMin = Math.min(i3 - i, 8192 - c13953sM83108d.f57855c);
            System.arraycopy(bArr, i, c13953sM83108d.f57853a, c13953sM83108d.f57855c, iMin);
            i += iMin;
            c13953sM83108d.f57855c += iMin;
        }
        this.f57818b += j;
        return this;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: c */
    public long mo83105c() {
        int i;
        if (this.f57818b == 0) {
            wtq0.m207906a("size == 0");
            return 0L;
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C13953s c13953s = this.f57817a;
            byte[] bArr = c13953s.f57853a;
            int i3 = c13953s.f57854b;
            int i4 = c13953s.f57855c;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    i = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i = b2 - 87;
                } else {
                    if (b2 < 65 || b2 > 70) {
                        if (i2 != 0) {
                            z = true;
                            break;
                        }
                        ug3.m195884a("Expected leading [0-9a-fA-F] character but was 0x", Integer.toHexString(b2));
                        return 0L;
                    }
                    i = b2 - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    ug3.m195884a("Number too large: ", new C13939e().mo83112e(j).mo83106c((int) b2).m83130n());
                    return 0L;
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f57817a = c13953s.m83154a();
                C13954t.m83159a(c13953s);
            } else {
                c13953s.f57854b = i3;
            }
            if (z) {
                break;
            }
        } while (this.f57817a != null);
        this.f57818b -= (long) i2;
        return j;
    }

    public Object clone() {
        C13939e c13939e = new C13939e();
        if (this.f57818b == 0) {
            return c13939e;
        }
        C13953s c13953sM83157b = this.f57817a.m83157b();
        c13939e.f57817a = c13953sM83157b;
        c13953sM83157b.f57859g = c13953sM83157b;
        c13953sM83157b.f57858f = c13953sM83157b;
        for (C13953s c13953s = this.f57817a.f57858f; c13953s != this.f57817a; c13953s = c13953s.f57858f) {
            c13939e.f57817a.f57859g.m83155a(c13953s.m83157b());
        }
        c13939e.f57818b = this.f57818b;
        return c13939e;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: d */
    public void mo83110d(long j) throws EOFException {
        while (j > 0) {
            C13953s c13953s = this.f57817a;
            if (c13953s == null) {
                vg3.m201207a();
                return;
            }
            int iMin = (int) Math.min(j, c13953s.f57855c - c13953s.f57854b);
            long j2 = iMin;
            this.f57818b -= j2;
            j -= j2;
            C13953s c13953s2 = this.f57817a;
            int i = c13953s2.f57854b + iMin;
            c13953s2.f57854b = i;
            if (i == c13953s2.f57855c) {
                this.f57817a = c13953s2.m83154a();
                C13954t.m83159a(c13953s2);
            }
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C13939e mo83106c(int i) {
        C13953s c13953sM83108d = m83108d(1);
        byte[] bArr = c13953sM83108d.f57853a;
        int i2 = c13953sM83108d.f57855c;
        c13953sM83108d.f57855c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f57818b++;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13939e)) {
            return false;
        }
        C13939e c13939e = (C13939e) obj;
        long j = this.f57818b;
        if (j != c13939e.f57818b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C13953s c13953s = this.f57817a;
        C13953s c13953s2 = c13939e.f57817a;
        int i = c13953s.f57854b;
        int i2 = c13953s2.f57854b;
        while (j2 < this.f57818b) {
            long jMin = Math.min(c13953s.f57855c - i, c13953s2.f57855c - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c13953s.f57853a[i] != c13953s2.f57853a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c13953s.f57855c) {
                c13953s = c13953s.f57858f;
                i = c13953s.f57854b;
            }
            if (i2 == c13953s2.f57855c) {
                c13953s2 = c13953s2.f57858f;
                i2 = c13953s2.f57854b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C13939e mo83102b(int i) {
        C13953s c13953sM83108d = m83108d(4);
        byte[] bArr = c13953sM83108d.f57853a;
        int i2 = c13953sM83108d.f57855c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c13953sM83108d.f57855c = i2 + 4;
        this.f57818b += 4;
        return this;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f, com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Flushable
    public void flush() {
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C13939e mo83091a(int i) {
        C13953s c13953sM83108d = m83108d(2);
        byte[] bArr = c13953sM83108d.f57853a;
        int i2 = c13953sM83108d.f57855c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c13953sM83108d.f57855c = i2 + 2;
        this.f57818b += 2;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C13939e m83121h(int i) {
        if (i < 128) {
            mo83106c(i);
            return this;
        }
        if (i < 2048) {
            mo83106c((i >> 6) | 192);
            mo83106c((i & 63) | 128);
            return this;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                mo83106c(63);
                return this;
            }
            mo83106c((i >> 12) | 224);
            mo83106c(((i >> 6) & 63) | 128);
            mo83106c((i & 63) | 128);
            return this;
        }
        if (i > 1114111) {
            yg3.m215829a("Unexpected code point: ", Integer.toHexString(i));
            return null;
        }
        mo83106c((i >> 18) | 240);
        mo83106c(((i >> 12) & 63) | 128);
        mo83106c(((i >> 6) & 63) | 128);
        mo83106c((i & 63) | 128);
        return this;
    }

    public int hashCode() {
        C13953s c13953s = this.f57817a;
        if (c13953s == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c13953s.f57855c;
            for (int i3 = c13953s.f57854b; i3 < i2; i3++) {
                i = (i * 31) + c13953s.f57853a[i3];
            }
            c13953s = c13953s.f57858f;
        } while (c13953s != this.f57817a);
        return i;
    }

    /* JADX INFO: renamed from: i */
    public String m83124i(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (m83120h(j2) == 13) {
                String strM83094a = m83094a(j2, C13959y.f57868a);
                mo83110d(2L);
                return strM83094a;
            }
        }
        String strM83094a2 = m83094a(j, C13959y.f57868a);
        mo83110d(1L);
        return strM83094a2;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C13939e mo83112e(long j) {
        if (j == 0) {
            return mo83106c(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C13953s c13953sM83108d = m83108d(iNumberOfTrailingZeros);
        byte[] bArr = c13953sM83108d.f57853a;
        int i = c13953sM83108d.f57855c;
        for (int i2 = (i + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f57816c[(int) (15 & j)];
            j >>>= 4;
        }
        c13953sM83108d.f57855c += iNumberOfTrailingZeros;
        this.f57818b += (long) iNumberOfTrailingZeros;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public void m83127k() {
        try {
            mo83110d(this.f57818b);
        } catch (EOFException e) {
            gig0.m130323a(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public long m83128l() {
        long j = this.f57818b;
        if (j == 0) {
            return 0L;
        }
        C13953s c13953s = this.f57817a.f57859g;
        int i = c13953s.f57855c;
        return (i >= 8192 || !c13953s.f57857e) ? j : j - ((long) (i - c13953s.f57854b));
    }

    /* JADX INFO: renamed from: m */
    public ByteString m83129m() {
        return new ByteString(mo83122h());
    }

    /* JADX INFO: renamed from: n */
    public String m83130n() {
        try {
            return m83094a(this.f57818b, C13959y.f57868a);
        } catch (EOFException e) {
            gig0.m130323a(e);
            return null;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C13953s c13953s = this.f57817a;
        if (c13953s == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c13953s.f57855c - c13953s.f57854b);
        byteBuffer.put(c13953s.f57853a, c13953s.f57854b, iMin);
        int i = c13953s.f57854b + iMin;
        c13953s.f57854b = i;
        this.f57818b -= (long) iMin;
        if (i == c13953s.f57855c) {
            this.f57817a = c13953s.m83154a();
            C13954t.m83159a(c13953s);
        }
        return iMin;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    public byte readByte() {
        long j = this.f57818b;
        if (j == 0) {
            wtq0.m207906a("size == 0");
            return (byte) 0;
        }
        C13953s c13953s = this.f57817a;
        int i = c13953s.f57854b;
        int i2 = c13953s.f57855c;
        int i3 = i + 1;
        byte b2 = c13953s.f57853a[i];
        this.f57818b = j - 1;
        if (i3 != i2) {
            c13953s.f57854b = i3;
            return b2;
        }
        this.f57817a = c13953s.m83154a();
        C13954t.m83159a(c13953s);
        return b2;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int iM83080a = m83080a(bArr, i, bArr.length - i);
            if (iM83080a == -1) {
                vg3.m201207a();
                return;
            }
            i += iM83080a;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    public int readInt() {
        long j = this.f57818b;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f57818b);
        }
        C13953s c13953s = this.f57817a;
        int i = c13953s.f57854b;
        int i2 = c13953s.f57855c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = c13953s.f57853a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f57818b = j - 4;
        if (i5 != i2) {
            c13953s.f57854b = i5;
            return i6;
        }
        this.f57817a = c13953s.m83154a();
        C13954t.m83159a(c13953s);
        return i6;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    public long readLong() {
        long j = this.f57818b;
        if (j < 8) {
            throw new IllegalStateException("size < 8: " + this.f57818b);
        }
        C13953s c13953s = this.f57817a;
        int i = c13953s.f57854b;
        int i2 = c13953s.f57855c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c13953s.f57853a;
        int i3 = i + 7;
        long j2 = ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (((long) bArr[i3]) & 255);
        this.f57818b = j - 8;
        if (i4 != i2) {
            c13953s.f57854b = i4;
            return j3;
        }
        this.f57817a = c13953s.m83154a();
        C13954t.m83159a(c13953s);
        return j3;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    public short readShort() {
        long j = this.f57818b;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f57818b);
        }
        C13953s c13953s = this.f57817a;
        int i = c13953s.f57854b;
        int i2 = c13953s.f57855c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = c13953s.f57853a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f57818b = j - 2;
        if (i5 == i2) {
            this.f57817a = c13953s.m83154a();
            C13954t.m83159a(c13953s);
        } else {
            c13953s.f57854b = i5;
        }
        return (short) i6;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
    public C13958x timeout() {
        return C13958x.f57864d;
    }

    public String toString() {
        long j = this.f57818b;
        if (j <= 2147483647L) {
            int i = (int) j;
            return (i == 0 ? ByteString.EMPTY : new C13955u(this, i)).toString();
        }
        mlk0.m158922a("size > Integer.MAX_VALUE: ", this.f57818b);
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
    public void write(C13939e c13939e, long j) {
        C13953s c13953sM83158a;
        if (c13939e == null) {
            wg3.m206174a("source == null");
            return;
        }
        if (c13939e == this) {
            wg3.m206174a("source == this");
            return;
        }
        C13959y.m83164a(c13939e.f57818b, 0L, j);
        while (j > 0) {
            C13953s c13953s = c13939e.f57817a;
            if (j < c13953s.f57855c - c13953s.f57854b) {
                C13953s c13953s2 = this.f57817a;
                C13953s c13953s3 = c13953s2 != null ? c13953s2.f57859g : null;
                if (c13953s3 != null && c13953s3.f57857e) {
                    if ((((long) c13953s3.f57855c) + j) - ((long) (c13953s3.f57856d ? 0 : c13953s3.f57854b)) <= 8192) {
                        c13953s.m83156a(c13953s3, (int) j);
                        c13939e.f57818b -= j;
                        this.f57818b += j;
                        return;
                    }
                }
                int i = (int) j;
                c13953s.getClass();
                if (i <= 0 || i > c13953s.f57855c - c13953s.f57854b) {
                    fig0.m125680a();
                    return;
                }
                if (i >= 1024) {
                    c13953sM83158a = c13953s.m83157b();
                } else {
                    c13953sM83158a = C13954t.m83158a();
                    System.arraycopy(c13953s.f57853a, c13953s.f57854b, c13953sM83158a.f57853a, 0, i);
                }
                c13953sM83158a.f57855c = c13953sM83158a.f57854b + i;
                c13953s.f57854b += i;
                c13953s.f57859g.m83155a(c13953sM83158a);
                c13939e.f57817a = c13953sM83158a;
            }
            C13953s c13953s4 = c13939e.f57817a;
            long j2 = c13953s4.f57855c - c13953s4.f57854b;
            c13939e.f57817a = c13953s4.m83154a();
            C13953s c13953s5 = this.f57817a;
            if (c13953s5 == null) {
                this.f57817a = c13953s4;
                c13953s4.f57859g = c13953s4;
                c13953s4.f57858f = c13953s4;
            } else {
                C13953s c13953sM83155a = c13953s5.f57859g.m83155a(c13953s4);
                C13953s c13953s6 = c13953sM83155a.f57859g;
                if (c13953s6 == c13953sM83155a) {
                    wpg0.m207458a();
                    return;
                } else if (c13953s6.f57857e) {
                    int i2 = c13953sM83155a.f57855c - c13953sM83155a.f57854b;
                    if (i2 <= (8192 - c13953s6.f57855c) + (c13953s6.f57856d ? 0 : c13953s6.f57854b)) {
                        c13953sM83155a.m83156a(c13953s6, i2);
                        c13953sM83155a.m83154a();
                        C13954t.m83159a(c13953sM83155a);
                    }
                }
            }
            c13939e.f57818b -= j2;
            this.f57818b += j2;
            j -= j2;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.e$a */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C13939e.this.f57818b, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            C13939e c13939e = C13939e.this;
            if (c13939e.f57818b > 0) {
                return c13939e.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C13939e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return C13939e.this.m83080a(bArr, i, i2);
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: e */
    public String mo83113e() {
        return mo83107c(Long.MAX_VALUE);
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: g */
    public byte[] mo83119g(long j) throws EOFException {
        C13959y.m83164a(this.f57818b, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        fcg0.m125008a("byteCount > Integer.MAX_VALUE: ", j);
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: g */
    public boolean mo83118g() {
        return this.f57818b == 0;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: i */
    public InterfaceC13940f mo83123i() {
        return this;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: f */
    public void mo83116f(long j) throws EOFException {
        if (this.f57818b >= j) {
            return;
        }
        vg3.m201207a();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: d */
    public InputStream mo83109d() {
        return new a();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: f */
    public InterfaceC13940f mo83115f() {
        return this;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: b */
    public boolean mo83104b(long j) {
        return this.f57818b >= j;
    }

    /* JADX INFO: renamed from: d */
    public C13953s m83108d(int i) {
        if (i >= 1 && i <= 8192) {
            C13953s c13953s = this.f57817a;
            if (c13953s == null) {
                C13953s c13953sM83158a = C13954t.m83158a();
                this.f57817a = c13953sM83158a;
                c13953sM83158a.f57859g = c13953sM83158a;
                c13953sM83158a.f57858f = c13953sM83158a;
                return c13953sM83158a;
            }
            C13953s c13953s2 = c13953s.f57859g;
            return (c13953s2.f57855c + i > 8192 || !c13953s2.f57857e) ? c13953s2.m83155a(C13954t.m83158a()) : c13953s2;
        }
        fig0.m125680a();
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: b */
    public int mo83097b() {
        return C13959y.m83162a(readInt());
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: b */
    public void mo83103b(C13939e c13939e, long j) throws EOFException {
        long j2 = this.f57818b;
        if (j2 >= j) {
            c13939e.write(this, j);
        } else {
            c13939e.write(this, j2);
            vg3.m201207a();
        }
    }

    /* JADX INFO: renamed from: b */
    public C13939e m83098b(ByteString byteString) {
        if (byteString != null) {
            byteString.mo83072a(this);
            return this;
        }
        wg3.m206174a("byteString == null");
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13939e mo83092a(String str) {
        return m83089a(str, 0, str.length());
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13939e mo83093a(byte[] bArr) {
        if (bArr != null) {
            return m83101b(bArr, 0, bArr.length);
        }
        wg3.m206174a("source == null");
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: j */
    public short mo83126j() {
        return C13959y.m83163a(readShort());
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: h */
    public byte[] mo83122h() {
        try {
            return mo83119g(this.f57818b);
        } catch (EOFException e) {
            gig0.m130323a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public byte m83120h(long j) {
        C13959y.m83164a(this.f57818b, j, 1L);
        long j2 = this.f57818b;
        long j3 = j2 - j;
        C13953s c13953s = this.f57817a;
        if (j3 > j) {
            long j4 = j;
            while (true) {
                int i = c13953s.f57855c;
                int i2 = c13953s.f57854b;
                long j5 = i - i2;
                if (j4 < j5) {
                    return c13953s.f57853a[i2 + ((int) j4)];
                }
                j4 -= j5;
                c13953s = c13953s.f57858f;
            }
        } else {
            long j6 = j - j2;
            C13953s c13953s2 = c13953s.f57859g;
            while (true) {
                int i3 = c13953s2.f57855c;
                int i4 = c13953s2.f57854b;
                j6 += (long) (i3 - i4);
                if (j6 >= 0) {
                    return c13953s2.f57853a[i4 + ((int) j6)];
                }
                c13953s2 = c13953s2.f57859g;
            }
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: c */
    public String mo83107c(long j) throws EOFException {
        if (j >= 0) {
            long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
            long jM83082a = m83082a((byte) 10, 0L, j2);
            if (jM83082a != -1) {
                return m83124i(jM83082a);
            }
            if (j2 < this.f57818b && m83120h(j2 - 1) == 13 && m83120h(j2) == 10) {
                return m83124i(j2);
            }
            C13939e c13939e = new C13939e();
            m83088a(c13939e, 0L, Math.min(32L, this.f57818b));
            xg3.m210876a(Math.min(this.f57818b, j), c13939e.m83129m().hex());
            return null;
        }
        fcg0.m125008a("limit < 0: ", j);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public C13939e m83088a(C13939e c13939e, long j, long j2) {
        if (c13939e != null) {
            long j3 = j;
            C13959y.m83164a(this.f57818b, j3, j2);
            if (j2 != 0) {
                c13939e.f57818b += j2;
                C13953s c13953s = this.f57817a;
                while (true) {
                    long j4 = c13953s.f57855c - c13953s.f57854b;
                    if (j3 < j4) {
                        break;
                    }
                    j3 -= j4;
                    c13953s = c13953s.f57858f;
                }
                C13953s c13953s2 = c13953s;
                long j5 = j2;
                while (j5 > 0) {
                    C13953s c13953sM83157b = c13953s2.m83157b();
                    int i = (int) (((long) c13953sM83157b.f57854b) + j3);
                    c13953sM83157b.f57854b = i;
                    c13953sM83157b.f57855c = Math.min(i + ((int) j5), c13953sM83157b.f57855c);
                    C13953s c13953s3 = c13939e.f57817a;
                    if (c13953s3 == null) {
                        c13953sM83157b.f57859g = c13953sM83157b;
                        c13953sM83157b.f57858f = c13953sM83157b;
                        c13939e.f57817a = c13953sM83157b;
                    } else {
                        c13953s3.f57859g.m83155a(c13953sM83157b);
                    }
                    j5 -= (long) (c13953sM83157b.f57855c - c13953sM83157b.f57854b);
                    c13953s2 = c13953s2.f57858f;
                    j3 = 0;
                }
            }
            return this;
        }
        wg3.m206174a("out == null");
        return null;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int iRemaining = byteBuffer.remaining();
            int i = iRemaining;
            while (i > 0) {
                C13953s c13953sM83108d = m83108d(1);
                int iMin = Math.min(i, 8192 - c13953sM83108d.f57855c);
                byteBuffer.get(c13953sM83108d.f57853a, c13953sM83108d.f57855c, iMin);
                i -= iMin;
                c13953sM83108d.f57855c += iMin;
            }
            this.f57818b += (long) iRemaining;
            return iRemaining;
        }
        wg3.m206174a("source == null");
        return 0;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: a */
    public ByteString mo83085a(long j) {
        return new ByteString(mo83119g(j));
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: a */
    public int mo83079a(C13950p c13950p) {
        C13939e c13939e;
        C13953s c13953s = this.f57817a;
        if (c13953s == null) {
            return c13950p.indexOf(ByteString.EMPTY);
        }
        ByteString[] byteStringArr = c13950p.f57845a;
        int length = byteStringArr.length;
        int i = 0;
        while (i < length) {
            ByteString byteString = byteStringArr[i];
            if (this.f57818b >= byteString.size()) {
                c13939e = this;
                if (c13939e.m83096a(c13953s, c13953s.f57854b, byteString, 0, byteString.size())) {
                    try {
                        c13939e.mo83110d(byteString.size());
                        return i;
                    } catch (EOFException e) {
                        gig0.m130323a(e);
                        return 0;
                    }
                }
            } else {
                c13939e = this;
            }
            i++;
            this = c13939e;
        }
        return -1;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: a */
    public String mo83095a(Charset charset) {
        try {
            return m83094a(this.f57818b, charset);
        } catch (EOFException e) {
            gig0.m130323a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m83094a(long j, Charset charset) {
        C13959y.m83164a(this.f57818b, 0L, j);
        if (charset == null) {
            wg3.m206174a("charset == null");
            return null;
        }
        if (j > 2147483647L) {
            fcg0.m125008a("byteCount > Integer.MAX_VALUE: ", j);
            return null;
        }
        if (j == 0) {
            return "";
        }
        C13953s c13953s = this.f57817a;
        int i = c13953s.f57854b;
        if (((long) i) + j > c13953s.f57855c) {
            return new String(mo83119g(j), charset);
        }
        String str = new String(c13953s.f57853a, i, (int) j, charset);
        int i2 = (int) (((long) c13953s.f57854b) + j);
        c13953s.f57854b = i2;
        this.f57818b -= j;
        if (i2 == c13953s.f57855c) {
            this.f57817a = c13953s.m83154a();
            C13954t.m83159a(c13953s);
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public int m83080a(byte[] bArr, int i, int i2) {
        C13959y.m83164a(bArr.length, i, i2);
        C13953s c13953s = this.f57817a;
        if (c13953s == null) {
            return -1;
        }
        int iMin = Math.min(i2, c13953s.f57855c - c13953s.f57854b);
        System.arraycopy(c13953s.f57853a, c13953s.f57854b, bArr, i, iMin);
        int i3 = c13953s.f57854b + iMin;
        c13953s.f57854b = i3;
        this.f57818b -= (long) iMin;
        if (i3 == c13953s.f57855c) {
            this.f57817a = c13953s.m83154a();
            C13954t.m83159a(c13953s);
        }
        return iMin;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g, com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: a */
    public C13939e mo83087a() {
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C13939e m83090a(String str, int i, int i2, Charset charset) {
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        }
        if (i2 >= i) {
            if (i2 > str.length()) {
                dpq0.m117417a("endIndex > string.length: ", i2, " > ", str.length());
                return null;
            }
            if (charset != null) {
                if (charset.equals(C13959y.f57868a)) {
                    return m83089a(str, i, i2);
                }
                byte[] bytes = str.substring(i, i2).getBytes(charset);
                return m83101b(bytes, 0, bytes.length);
            }
            wg3.m206174a("charset == null");
            return null;
        }
        itq0.m142074a("endIndex < beginIndex: ", i2, " < ", i);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public long m83084a(InterfaceC13957w interfaceC13957w) {
        long j = 0;
        if (interfaceC13957w == null) {
            wg3.m206174a("source == null");
            return 0L;
        }
        while (true) {
            long jMo82814a = interfaceC13957w.mo82814a(this, 8192L);
            if (jMo82814a == -1) {
                return j;
            }
            j += jMo82814a;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
    /* JADX INFO: renamed from: a */
    public long mo82814a(C13939e c13939e, long j) {
        if (c13939e == null) {
            wg3.m206174a("sink == null");
            return 0L;
        }
        if (j >= 0) {
            long j2 = this.f57818b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            c13939e.write(this, j);
            return j;
        }
        fcg0.m125008a("byteCount < 0: ", j);
        return 0L;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13941g
    /* JADX INFO: renamed from: a */
    public long mo83081a(byte b2) {
        return m83082a(b2, 0L, Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: a */
    public long m83082a(byte b2, long j, long j2) {
        C13953s c13953s;
        long j3 = 0;
        if (j >= 0 && j2 >= j) {
            long j4 = this.f57818b;
            long j5 = j2 > j4 ? j4 : j2;
            if (j == j5 || (c13953s = this.f57817a) == null) {
                return -1L;
            }
            if (j4 - j < j) {
                while (j4 > j) {
                    c13953s = c13953s.f57859g;
                    j4 -= (long) (c13953s.f57855c - c13953s.f57854b);
                }
            } else {
                while (true) {
                    long j6 = ((long) (c13953s.f57855c - c13953s.f57854b)) + j3;
                    if (j6 >= j) {
                        break;
                    }
                    c13953s = c13953s.f57858f;
                    j3 = j6;
                }
                j4 = j3;
            }
            long j7 = j;
            while (j4 < j5) {
                byte[] bArr = c13953s.f57853a;
                int iMin = (int) Math.min(c13953s.f57855c, (((long) c13953s.f57854b) + j5) - j4);
                for (int i = (int) ((((long) c13953s.f57854b) + j7) - j4); i < iMin; i++) {
                    if (bArr[i] == b2) {
                        return ((long) (i - c13953s.f57854b)) + j4;
                    }
                }
                j4 += (long) (c13953s.f57855c - c13953s.f57854b);
                c13953s = c13953s.f57858f;
                j7 = j4;
            }
            return -1L;
        }
        gzi0.m133102a("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f57818b), Long.valueOf(j), Long.valueOf(j2)});
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public long m83083a(ByteString byteString) {
        int i;
        int i2;
        C13953s c13953s = this.f57817a;
        if (c13953s == null) {
            return -1L;
        }
        long j = this.f57818b;
        long j2 = 0;
        if (j >= 0) {
            j = 0;
            while (true) {
                long j3 = ((long) (c13953s.f57855c - c13953s.f57854b)) + j;
                if (j3 >= 0) {
                    break;
                }
                c13953s = c13953s.f57858f;
                j = j3;
            }
        } else {
            while (j > 0) {
                c13953s = c13953s.f57859g;
                j -= (long) (c13953s.f57855c - c13953s.f57854b);
            }
        }
        if (byteString.size() == 2) {
            byte b2 = byteString.getByte(0);
            byte b3 = byteString.getByte(1);
            while (j < this.f57818b) {
                byte[] bArr = c13953s.f57853a;
                i = (int) ((((long) c13953s.f57854b) + j2) - j);
                int i3 = c13953s.f57855c;
                while (i < i3) {
                    byte b4 = bArr[i];
                    if (b4 == b2 || b4 == b3) {
                        i2 = c13953s.f57854b;
                    } else {
                        i++;
                    }
                }
                j2 = ((long) (c13953s.f57855c - c13953s.f57854b)) + j;
                c13953s = c13953s.f57858f;
                j = j2;
            }
            return -1L;
        }
        byte[] bArrMo83073a = byteString.mo83073a();
        while (j < this.f57818b) {
            byte[] bArr2 = c13953s.f57853a;
            i = (int) ((((long) c13953s.f57854b) + j2) - j);
            int i4 = c13953s.f57855c;
            while (i < i4) {
                byte b5 = bArr2[i];
                for (byte b6 : bArrMo83073a) {
                    if (b5 == b6) {
                        i2 = c13953s.f57854b;
                    }
                }
                i++;
            }
            j2 = ((long) (c13953s.f57855c - c13953s.f57854b)) + j;
            c13953s = c13953s.f57858f;
            j = j2;
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83096a(C13953s c13953s, int i, ByteString byteString, int i2, int i3) {
        int i4 = c13953s.f57855c;
        byte[] bArr = c13953s.f57853a;
        while (i2 < i3) {
            if (i == i4) {
                C13953s c13953s2 = c13953s.f57858f;
                byte[] bArr2 = c13953s2.f57853a;
                i = c13953s2.f57854b;
                c13953s = c13953s2;
                i4 = c13953s2.f57855c;
                bArr = bArr2;
            }
            if (bArr[i] != byteString.getByte(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public b m83086a(b bVar) {
        if (bVar.f57820a == null) {
            bVar.f57820a = this;
            bVar.f57821b = true;
            return bVar;
        }
        wtq0.m207906a("already attached to a buffer");
        return null;
    }
}
