package com.tencent.cloud.p075ai.network.okio;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p149l.ckq0;
import p149l.dqi0;
import p149l.gck0;
import p149l.gg3;
import p149l.hg3;
import p149l.ig3;
import p149l.jg3;
import p149l.k250;
import p149l.kg3;
import p149l.lg3;
import p149l.ohg0;
import p149l.qkq0;
import p149l.x9g0;
import p149l.y3g0;
import p149l.y9g0;
import p149l.yfq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.e */
/* JADX INFO: loaded from: classes13.dex */
public final class C13776e implements InterfaceC13778g, InterfaceC13777f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: c */
    public static final byte[] f56968c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: a */
    public C13790s f56969a;

    /* JADX INFO: renamed from: b */
    public long f56970b;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.e$b */
    public static final class b implements Closeable {

        /* JADX INFO: renamed from: a */
        public C13776e f56972a;

        /* JADX INFO: renamed from: b */
        public boolean f56973b;

        /* JADX INFO: renamed from: c */
        public C13790s f56974c;

        /* JADX INFO: renamed from: e */
        public byte[] f56976e;

        /* JADX INFO: renamed from: d */
        public long f56975d = -1;

        /* JADX INFO: renamed from: f */
        public int f56977f = -1;

        /* JADX INFO: renamed from: g */
        public int f56978g = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f56972a == null) {
                qkq0.m175383a("not attached to a buffer");
                return;
            }
            this.f56972a = null;
            this.f56974c = null;
            this.f56975d = -1L;
            this.f56976e = null;
            this.f56977f = -1;
            this.f56978g = -1;
        }

        /* JADX INFO: renamed from: h */
        public int m81948h(long j) {
            if (j >= -1) {
                C13776e c13776e = this.f56972a;
                long j2 = c13776e.f56970b;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.f56974c = null;
                        this.f56975d = j;
                        this.f56976e = null;
                        this.f56977f = -1;
                        this.f56978g = -1;
                        return -1;
                    }
                    C13790s c13790s = c13776e.f56969a;
                    C13790s c13790sM81972a = this.f56974c;
                    long j3 = 0;
                    if (c13790sM81972a != null) {
                        long j4 = this.f56975d - ((long) (this.f56977f - c13790sM81972a.f57006b));
                        if (j4 > j) {
                            c13790sM81972a = c13790s;
                            c13790s = c13790sM81972a;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        c13790sM81972a = c13790s;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            long j5 = ((long) (c13790sM81972a.f57007c - c13790sM81972a.f57006b)) + j3;
                            if (j < j5) {
                                break;
                            }
                            c13790sM81972a = c13790sM81972a.f57010f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            c13790s = c13790s.f57011g;
                            j2 -= (long) (c13790s.f57007c - c13790s.f57006b);
                        }
                        c13790sM81972a = c13790s;
                        j3 = j2;
                    }
                    if (this.f56973b && c13790sM81972a.f57008d) {
                        C13790s c13790s2 = new C13790s((byte[]) c13790sM81972a.f57005a.clone(), c13790sM81972a.f57006b, c13790sM81972a.f57007c, false, true);
                        C13776e c13776e2 = this.f56972a;
                        if (c13776e2.f56969a == c13790sM81972a) {
                            c13776e2.f56969a = c13790s2;
                        }
                        c13790sM81972a = c13790sM81972a.m81972a(c13790s2);
                        c13790sM81972a.f57011g.m81971a();
                    }
                    this.f56974c = c13790sM81972a;
                    this.f56975d = j;
                    this.f56976e = c13790sM81972a.f57005a;
                    int i = c13790sM81972a.f57006b + ((int) (j - j3));
                    this.f56977f = i;
                    int i2 = c13790sM81972a.f57007c;
                    this.f56978g = i2;
                    return i2 - i;
                }
            }
            lg3.m149750a("offset=%s > size=%s", new Object[]{Long.valueOf(j), Long.valueOf(this.f56972a.f56970b)});
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public C13776e m81906a(String str, int i, int i2) {
        char cCharAt;
        if (i < 0) {
            k250.m144273a("beginIndex < 0: ", i);
            return null;
        }
        if (i2 < i) {
            ckq0.m107426a("endIndex < beginIndex: ", i2, " < ", i);
            return null;
        }
        if (i2 > str.length()) {
            yfq0.m214580a("endIndex > string.length: ", i2, " > ", str.length());
            return null;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C13790s c13790sM81925d = m81925d(1);
                byte[] bArr = c13790sM81925d.f57005a;
                int i3 = c13790sM81925d.f57007c - i;
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
                int i5 = c13790sM81925d.f57007c;
                int i6 = (i3 + i) - i5;
                c13790sM81925d.f57007c = i5 + i6;
                this.f56970b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    mo81923c((cCharAt2 >> 6) | 192);
                    mo81923c((cCharAt2 & '?') | 128);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    mo81923c((cCharAt2 >> '\f') | 224);
                    mo81923c(((cCharAt2 >> 6) & 63) | 128);
                    mo81923c((cCharAt2 & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char cCharAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        mo81923c(63);
                        i = i7;
                    } else {
                        int i8 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        mo81923c((i8 >> 18) | 240);
                        mo81923c(((i8 >> 12) & 63) | 128);
                        mo81923c(((i8 >> 6) & 63) | 128);
                        mo81923c((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C13776e m81918b(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            ig3.m135964a("source == null");
            return null;
        }
        long j = i2;
        C13796y.m81981a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C13790s c13790sM81925d = m81925d(1);
            int iMin = Math.min(i3 - i, 8192 - c13790sM81925d.f57007c);
            System.arraycopy(bArr, i, c13790sM81925d.f57005a, c13790sM81925d.f57007c, iMin);
            i += iMin;
            c13790sM81925d.f57007c += iMin;
        }
        this.f56970b += j;
        return this;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: c */
    public long mo81922c() {
        int i;
        if (this.f56970b == 0) {
            qkq0.m175383a("size == 0");
            return 0L;
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C13790s c13790s = this.f56969a;
            byte[] bArr = c13790s.f57005a;
            int i3 = c13790s.f57006b;
            int i4 = c13790s.f57007c;
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
                        gg3.m125947a("Expected leading [0-9a-fA-F] character but was 0x", Integer.toHexString(b2));
                        return 0L;
                    }
                    i = b2 - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    gg3.m125947a("Number too large: ", new C13776e().mo81929e(j).mo81923c((int) b2).m81947n());
                    return 0L;
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f56969a = c13790s.m81971a();
                C13791t.m81976a(c13790s);
            } else {
                c13790s.f57006b = i3;
            }
            if (z) {
                break;
            }
        } while (this.f56969a != null);
        this.f56970b -= (long) i2;
        return j;
    }

    public Object clone() {
        C13776e c13776e = new C13776e();
        if (this.f56970b == 0) {
            return c13776e;
        }
        C13790s c13790sM81974b = this.f56969a.m81974b();
        c13776e.f56969a = c13790sM81974b;
        c13790sM81974b.f57011g = c13790sM81974b;
        c13790sM81974b.f57010f = c13790sM81974b;
        for (C13790s c13790s = this.f56969a.f57010f; c13790s != this.f56969a; c13790s = c13790s.f57010f) {
            c13776e.f56969a.f57011g.m81972a(c13790s.m81974b());
        }
        c13776e.f56970b = this.f56970b;
        return c13776e;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: d */
    public void mo81927d(long j) throws EOFException {
        while (j > 0) {
            C13790s c13790s = this.f56969a;
            if (c13790s == null) {
                hg3.m130807a();
                return;
            }
            int iMin = (int) Math.min(j, c13790s.f57007c - c13790s.f57006b);
            long j2 = iMin;
            this.f56970b -= j2;
            j -= j2;
            C13790s c13790s2 = this.f56969a;
            int i = c13790s2.f57006b + iMin;
            c13790s2.f57006b = i;
            if (i == c13790s2.f57007c) {
                this.f56969a = c13790s2.m81971a();
                C13791t.m81976a(c13790s2);
            }
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C13776e mo81923c(int i) {
        C13790s c13790sM81925d = m81925d(1);
        byte[] bArr = c13790sM81925d.f57005a;
        int i2 = c13790sM81925d.f57007c;
        c13790sM81925d.f57007c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f56970b++;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13776e)) {
            return false;
        }
        C13776e c13776e = (C13776e) obj;
        long j = this.f56970b;
        if (j != c13776e.f56970b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C13790s c13790s = this.f56969a;
        C13790s c13790s2 = c13776e.f56969a;
        int i = c13790s.f57006b;
        int i2 = c13790s2.f57006b;
        while (j2 < this.f56970b) {
            long jMin = Math.min(c13790s.f57007c - i, c13790s2.f57007c - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c13790s.f57005a[i] != c13790s2.f57005a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c13790s.f57007c) {
                c13790s = c13790s.f57010f;
                i = c13790s.f57006b;
            }
            if (i2 == c13790s2.f57007c) {
                c13790s2 = c13790s2.f57010f;
                i2 = c13790s2.f57006b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C13776e mo81919b(int i) {
        C13790s c13790sM81925d = m81925d(4);
        byte[] bArr = c13790sM81925d.f57005a;
        int i2 = c13790sM81925d.f57007c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c13790sM81925d.f57007c = i2 + 4;
        this.f56970b += 4;
        return this;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f, com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Flushable
    public void flush() {
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C13776e mo81908a(int i) {
        C13790s c13790sM81925d = m81925d(2);
        byte[] bArr = c13790sM81925d.f57005a;
        int i2 = c13790sM81925d.f57007c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c13790sM81925d.f57007c = i2 + 2;
        this.f56970b += 2;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C13776e m81938h(int i) {
        if (i < 128) {
            mo81923c(i);
            return this;
        }
        if (i < 2048) {
            mo81923c((i >> 6) | 192);
            mo81923c((i & 63) | 128);
            return this;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                mo81923c(63);
                return this;
            }
            mo81923c((i >> 12) | 224);
            mo81923c(((i >> 6) & 63) | 128);
            mo81923c((i & 63) | 128);
            return this;
        }
        if (i > 1114111) {
            kg3.m145878a("Unexpected code point: ", Integer.toHexString(i));
            return null;
        }
        mo81923c((i >> 18) | 240);
        mo81923c(((i >> 12) & 63) | 128);
        mo81923c(((i >> 6) & 63) | 128);
        mo81923c((i & 63) | 128);
        return this;
    }

    public int hashCode() {
        C13790s c13790s = this.f56969a;
        if (c13790s == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c13790s.f57007c;
            for (int i3 = c13790s.f57006b; i3 < i2; i3++) {
                i = (i * 31) + c13790s.f57005a[i3];
            }
            c13790s = c13790s.f57010f;
        } while (c13790s != this.f56969a);
        return i;
    }

    /* JADX INFO: renamed from: i */
    public String m81941i(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (m81937h(j2) == 13) {
                String strM81911a = m81911a(j2, C13796y.f57020a);
                mo81927d(2L);
                return strM81911a;
            }
        }
        String strM81911a2 = m81911a(j, C13796y.f57020a);
        mo81927d(1L);
        return strM81911a2;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C13776e mo81929e(long j) {
        if (j == 0) {
            return mo81923c(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C13790s c13790sM81925d = m81925d(iNumberOfTrailingZeros);
        byte[] bArr = c13790sM81925d.f57005a;
        int i = c13790sM81925d.f57007c;
        for (int i2 = (i + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f56968c[(int) (15 & j)];
            j >>>= 4;
        }
        c13790sM81925d.f57007c += iNumberOfTrailingZeros;
        this.f56970b += (long) iNumberOfTrailingZeros;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public void m81944k() {
        try {
            mo81927d(this.f56970b);
        } catch (EOFException e) {
            y9g0.m213537a(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public long m81945l() {
        long j = this.f56970b;
        if (j == 0) {
            return 0L;
        }
        C13790s c13790s = this.f56969a.f57011g;
        int i = c13790s.f57007c;
        return (i >= 8192 || !c13790s.f57009e) ? j : j - ((long) (i - c13790s.f57006b));
    }

    /* JADX INFO: renamed from: m */
    public ByteString m81946m() {
        return new ByteString(mo81939h());
    }

    /* JADX INFO: renamed from: n */
    public String m81947n() {
        try {
            return m81911a(this.f56970b, C13796y.f57020a);
        } catch (EOFException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C13790s c13790s = this.f56969a;
        if (c13790s == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c13790s.f57007c - c13790s.f57006b);
        byteBuffer.put(c13790s.f57005a, c13790s.f57006b, iMin);
        int i = c13790s.f57006b + iMin;
        c13790s.f57006b = i;
        this.f56970b -= (long) iMin;
        if (i == c13790s.f57007c) {
            this.f56969a = c13790s.m81971a();
            C13791t.m81976a(c13790s);
        }
        return iMin;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    public byte readByte() {
        long j = this.f56970b;
        if (j == 0) {
            qkq0.m175383a("size == 0");
            return (byte) 0;
        }
        C13790s c13790s = this.f56969a;
        int i = c13790s.f57006b;
        int i2 = c13790s.f57007c;
        int i3 = i + 1;
        byte b2 = c13790s.f57005a[i];
        this.f56970b = j - 1;
        if (i3 != i2) {
            c13790s.f57006b = i3;
            return b2;
        }
        this.f56969a = c13790s.m81971a();
        C13791t.m81976a(c13790s);
        return b2;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int iM81897a = m81897a(bArr, i, bArr.length - i);
            if (iM81897a == -1) {
                hg3.m130807a();
                return;
            }
            i += iM81897a;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    public int readInt() {
        long j = this.f56970b;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f56970b);
        }
        C13790s c13790s = this.f56969a;
        int i = c13790s.f57006b;
        int i2 = c13790s.f57007c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = c13790s.f57005a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f56970b = j - 4;
        if (i5 != i2) {
            c13790s.f57006b = i5;
            return i6;
        }
        this.f56969a = c13790s.m81971a();
        C13791t.m81976a(c13790s);
        return i6;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    public long readLong() {
        long j = this.f56970b;
        if (j < 8) {
            throw new IllegalStateException("size < 8: " + this.f56970b);
        }
        C13790s c13790s = this.f56969a;
        int i = c13790s.f57006b;
        int i2 = c13790s.f57007c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c13790s.f57005a;
        int i3 = i + 7;
        long j2 = ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (((long) bArr[i3]) & 255);
        this.f56970b = j - 8;
        if (i4 != i2) {
            c13790s.f57006b = i4;
            return j3;
        }
        this.f56969a = c13790s.m81971a();
        C13791t.m81976a(c13790s);
        return j3;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    public short readShort() {
        long j = this.f56970b;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f56970b);
        }
        C13790s c13790s = this.f56969a;
        int i = c13790s.f57006b;
        int i2 = c13790s.f57007c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = c13790s.f57005a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f56970b = j - 2;
        if (i5 == i2) {
            this.f56969a = c13790s.m81971a();
            C13791t.m81976a(c13790s);
        } else {
            c13790s.f57006b = i5;
        }
        return (short) i6;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
    public C13795x timeout() {
        return C13795x.f57016d;
    }

    public String toString() {
        long j = this.f56970b;
        if (j <= 2147483647L) {
            int i = (int) j;
            return (i == 0 ? ByteString.EMPTY : new C13792u(this, i)).toString();
        }
        gck0.m125517a("size > Integer.MAX_VALUE: ", this.f56970b);
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
    public void write(C13776e c13776e, long j) {
        C13790s c13790sM81975a;
        if (c13776e == null) {
            ig3.m135964a("source == null");
            return;
        }
        if (c13776e == this) {
            ig3.m135964a("source == this");
            return;
        }
        C13796y.m81981a(c13776e.f56970b, 0L, j);
        while (j > 0) {
            C13790s c13790s = c13776e.f56969a;
            if (j < c13790s.f57007c - c13790s.f57006b) {
                C13790s c13790s2 = this.f56969a;
                C13790s c13790s3 = c13790s2 != null ? c13790s2.f57011g : null;
                if (c13790s3 != null && c13790s3.f57009e) {
                    if ((((long) c13790s3.f57007c) + j) - ((long) (c13790s3.f57008d ? 0 : c13790s3.f57006b)) <= 8192) {
                        c13790s.m81973a(c13790s3, (int) j);
                        c13776e.f56970b -= j;
                        this.f56970b += j;
                        return;
                    }
                }
                int i = (int) j;
                c13790s.getClass();
                if (i <= 0 || i > c13790s.f57007c - c13790s.f57006b) {
                    x9g0.m207497a();
                    return;
                }
                if (i >= 1024) {
                    c13790sM81975a = c13790s.m81974b();
                } else {
                    c13790sM81975a = C13791t.m81975a();
                    System.arraycopy(c13790s.f57005a, c13790s.f57006b, c13790sM81975a.f57005a, 0, i);
                }
                c13790sM81975a.f57007c = c13790sM81975a.f57006b + i;
                c13790s.f57006b += i;
                c13790s.f57011g.m81972a(c13790sM81975a);
                c13776e.f56969a = c13790sM81975a;
            }
            C13790s c13790s4 = c13776e.f56969a;
            long j2 = c13790s4.f57007c - c13790s4.f57006b;
            c13776e.f56969a = c13790s4.m81971a();
            C13790s c13790s5 = this.f56969a;
            if (c13790s5 == null) {
                this.f56969a = c13790s4;
                c13790s4.f57011g = c13790s4;
                c13790s4.f57010f = c13790s4;
            } else {
                C13790s c13790sM81972a = c13790s5.f57011g.m81972a(c13790s4);
                C13790s c13790s6 = c13790sM81972a.f57011g;
                if (c13790s6 == c13790sM81972a) {
                    ohg0.m164364a();
                    return;
                } else if (c13790s6.f57009e) {
                    int i2 = c13790sM81972a.f57007c - c13790sM81972a.f57006b;
                    if (i2 <= (8192 - c13790s6.f57007c) + (c13790s6.f57008d ? 0 : c13790s6.f57006b)) {
                        c13790sM81972a.m81973a(c13790s6, i2);
                        c13790sM81972a.m81971a();
                        C13791t.m81976a(c13790sM81972a);
                    }
                }
            }
            c13776e.f56970b -= j2;
            this.f56970b += j2;
            j -= j2;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.e$a */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C13776e.this.f56970b, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            C13776e c13776e = C13776e.this;
            if (c13776e.f56970b > 0) {
                return c13776e.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C13776e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return C13776e.this.m81897a(bArr, i, i2);
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: e */
    public String mo81930e() {
        return mo81924c(Long.MAX_VALUE);
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: g */
    public byte[] mo81936g(long j) throws EOFException {
        C13796y.m81981a(this.f56970b, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        y3g0.m212802a("byteCount > Integer.MAX_VALUE: ", j);
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: g */
    public boolean mo81935g() {
        return this.f56970b == 0;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: i */
    public InterfaceC13777f mo81940i() {
        return this;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: f */
    public void mo81933f(long j) throws EOFException {
        if (this.f56970b >= j) {
            return;
        }
        hg3.m130807a();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: d */
    public InputStream mo81926d() {
        return new a();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: f */
    public InterfaceC13777f mo81932f() {
        return this;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: b */
    public boolean mo81921b(long j) {
        return this.f56970b >= j;
    }

    /* JADX INFO: renamed from: d */
    public C13790s m81925d(int i) {
        if (i >= 1 && i <= 8192) {
            C13790s c13790s = this.f56969a;
            if (c13790s == null) {
                C13790s c13790sM81975a = C13791t.m81975a();
                this.f56969a = c13790sM81975a;
                c13790sM81975a.f57011g = c13790sM81975a;
                c13790sM81975a.f57010f = c13790sM81975a;
                return c13790sM81975a;
            }
            C13790s c13790s2 = c13790s.f57011g;
            return (c13790s2.f57007c + i > 8192 || !c13790s2.f57009e) ? c13790s2.m81972a(C13791t.m81975a()) : c13790s2;
        }
        x9g0.m207497a();
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: b */
    public int mo81914b() {
        return C13796y.m81979a(readInt());
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: b */
    public void mo81920b(C13776e c13776e, long j) throws EOFException {
        long j2 = this.f56970b;
        if (j2 >= j) {
            c13776e.write(this, j);
        } else {
            c13776e.write(this, j2);
            hg3.m130807a();
        }
    }

    /* JADX INFO: renamed from: b */
    public C13776e m81915b(ByteString byteString) {
        if (byteString != null) {
            byteString.mo81889a(this);
            return this;
        }
        ig3.m135964a("byteString == null");
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13776e mo81909a(String str) {
        return m81906a(str, 0, str.length());
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13776e mo81910a(byte[] bArr) {
        if (bArr != null) {
            return m81918b(bArr, 0, bArr.length);
        }
        ig3.m135964a("source == null");
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: j */
    public short mo81943j() {
        return C13796y.m81980a(readShort());
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: h */
    public byte[] mo81939h() {
        try {
            return mo81936g(this.f56970b);
        } catch (EOFException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public byte m81937h(long j) {
        C13796y.m81981a(this.f56970b, j, 1L);
        long j2 = this.f56970b;
        long j3 = j2 - j;
        C13790s c13790s = this.f56969a;
        if (j3 > j) {
            long j4 = j;
            while (true) {
                int i = c13790s.f57007c;
                int i2 = c13790s.f57006b;
                long j5 = i - i2;
                if (j4 < j5) {
                    return c13790s.f57005a[i2 + ((int) j4)];
                }
                j4 -= j5;
                c13790s = c13790s.f57010f;
            }
        } else {
            long j6 = j - j2;
            C13790s c13790s2 = c13790s.f57011g;
            while (true) {
                int i3 = c13790s2.f57007c;
                int i4 = c13790s2.f57006b;
                j6 += (long) (i3 - i4);
                if (j6 >= 0) {
                    return c13790s2.f57005a[i4 + ((int) j6)];
                }
                c13790s2 = c13790s2.f57011g;
            }
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: c */
    public String mo81924c(long j) throws EOFException {
        if (j >= 0) {
            long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
            long jM81899a = m81899a((byte) 10, 0L, j2);
            if (jM81899a != -1) {
                return m81941i(jM81899a);
            }
            if (j2 < this.f56970b && m81937h(j2 - 1) == 13 && m81937h(j2) == 10) {
                return m81941i(j2);
            }
            C13776e c13776e = new C13776e();
            m81905a(c13776e, 0L, Math.min(32L, this.f56970b));
            jg3.m141218a(Math.min(this.f56970b, j), c13776e.m81946m().hex());
            return null;
        }
        y3g0.m212802a("limit < 0: ", j);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public C13776e m81905a(C13776e c13776e, long j, long j2) {
        if (c13776e != null) {
            long j3 = j;
            C13796y.m81981a(this.f56970b, j3, j2);
            if (j2 != 0) {
                c13776e.f56970b += j2;
                C13790s c13790s = this.f56969a;
                while (true) {
                    long j4 = c13790s.f57007c - c13790s.f57006b;
                    if (j3 < j4) {
                        break;
                    }
                    j3 -= j4;
                    c13790s = c13790s.f57010f;
                }
                C13790s c13790s2 = c13790s;
                long j5 = j2;
                while (j5 > 0) {
                    C13790s c13790sM81974b = c13790s2.m81974b();
                    int i = (int) (((long) c13790sM81974b.f57006b) + j3);
                    c13790sM81974b.f57006b = i;
                    c13790sM81974b.f57007c = Math.min(i + ((int) j5), c13790sM81974b.f57007c);
                    C13790s c13790s3 = c13776e.f56969a;
                    if (c13790s3 == null) {
                        c13790sM81974b.f57011g = c13790sM81974b;
                        c13790sM81974b.f57010f = c13790sM81974b;
                        c13776e.f56969a = c13790sM81974b;
                    } else {
                        c13790s3.f57011g.m81972a(c13790sM81974b);
                    }
                    j5 -= (long) (c13790sM81974b.f57007c - c13790sM81974b.f57006b);
                    c13790s2 = c13790s2.f57010f;
                    j3 = 0;
                }
            }
            return this;
        }
        ig3.m135964a("out == null");
        return null;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int iRemaining = byteBuffer.remaining();
            int i = iRemaining;
            while (i > 0) {
                C13790s c13790sM81925d = m81925d(1);
                int iMin = Math.min(i, 8192 - c13790sM81925d.f57007c);
                byteBuffer.get(c13790sM81925d.f57005a, c13790sM81925d.f57007c, iMin);
                i -= iMin;
                c13790sM81925d.f57007c += iMin;
            }
            this.f56970b += (long) iRemaining;
            return iRemaining;
        }
        ig3.m135964a("source == null");
        return 0;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: a */
    public ByteString mo81902a(long j) {
        return new ByteString(mo81936g(j));
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: a */
    public int mo81896a(C13787p c13787p) {
        C13776e c13776e;
        C13790s c13790s = this.f56969a;
        if (c13790s == null) {
            return c13787p.indexOf(ByteString.EMPTY);
        }
        ByteString[] byteStringArr = c13787p.f56997a;
        int length = byteStringArr.length;
        int i = 0;
        while (i < length) {
            ByteString byteString = byteStringArr[i];
            if (this.f56970b >= byteString.size()) {
                c13776e = this;
                if (c13776e.m81913a(c13790s, c13790s.f57006b, byteString, 0, byteString.size())) {
                    try {
                        c13776e.mo81927d(byteString.size());
                        return i;
                    } catch (EOFException e) {
                        y9g0.m213537a(e);
                        return 0;
                    }
                }
            } else {
                c13776e = this;
            }
            i++;
            this = c13776e;
        }
        return -1;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: a */
    public String mo81912a(Charset charset) {
        try {
            return m81911a(this.f56970b, charset);
        } catch (EOFException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m81911a(long j, Charset charset) {
        C13796y.m81981a(this.f56970b, 0L, j);
        if (charset == null) {
            ig3.m135964a("charset == null");
            return null;
        }
        if (j > 2147483647L) {
            y3g0.m212802a("byteCount > Integer.MAX_VALUE: ", j);
            return null;
        }
        if (j == 0) {
            return "";
        }
        C13790s c13790s = this.f56969a;
        int i = c13790s.f57006b;
        if (((long) i) + j > c13790s.f57007c) {
            return new String(mo81936g(j), charset);
        }
        String str = new String(c13790s.f57005a, i, (int) j, charset);
        int i2 = (int) (((long) c13790s.f57006b) + j);
        c13790s.f57006b = i2;
        this.f56970b -= j;
        if (i2 == c13790s.f57007c) {
            this.f56969a = c13790s.m81971a();
            C13791t.m81976a(c13790s);
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public int m81897a(byte[] bArr, int i, int i2) {
        C13796y.m81981a(bArr.length, i, i2);
        C13790s c13790s = this.f56969a;
        if (c13790s == null) {
            return -1;
        }
        int iMin = Math.min(i2, c13790s.f57007c - c13790s.f57006b);
        System.arraycopy(c13790s.f57005a, c13790s.f57006b, bArr, i, iMin);
        int i3 = c13790s.f57006b + iMin;
        c13790s.f57006b = i3;
        this.f56970b -= (long) iMin;
        if (i3 == c13790s.f57007c) {
            this.f56969a = c13790s.m81971a();
            C13791t.m81976a(c13790s);
        }
        return iMin;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g, com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: a */
    public C13776e mo81904a() {
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C13776e m81907a(String str, int i, int i2, Charset charset) {
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        }
        if (i2 >= i) {
            if (i2 > str.length()) {
                yfq0.m214580a("endIndex > string.length: ", i2, " > ", str.length());
                return null;
            }
            if (charset != null) {
                if (charset.equals(C13796y.f57020a)) {
                    return m81906a(str, i, i2);
                }
                byte[] bytes = str.substring(i, i2).getBytes(charset);
                return m81918b(bytes, 0, bytes.length);
            }
            ig3.m135964a("charset == null");
            return null;
        }
        ckq0.m107426a("endIndex < beginIndex: ", i2, " < ", i);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public long m81901a(InterfaceC13794w interfaceC13794w) {
        long j = 0;
        if (interfaceC13794w == null) {
            ig3.m135964a("source == null");
            return 0L;
        }
        while (true) {
            long jMo81631a = interfaceC13794w.mo81631a(this, 8192L);
            if (jMo81631a == -1) {
                return j;
            }
            j += jMo81631a;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
    /* JADX INFO: renamed from: a */
    public long mo81631a(C13776e c13776e, long j) {
        if (c13776e == null) {
            ig3.m135964a("sink == null");
            return 0L;
        }
        if (j >= 0) {
            long j2 = this.f56970b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            c13776e.write(this, j);
            return j;
        }
        y3g0.m212802a("byteCount < 0: ", j);
        return 0L;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: a */
    public long mo81898a(byte b2) {
        return m81899a(b2, 0L, Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: a */
    public long m81899a(byte b2, long j, long j2) {
        C13790s c13790s;
        long j3 = 0;
        if (j >= 0 && j2 >= j) {
            long j4 = this.f56970b;
            long j5 = j2 > j4 ? j4 : j2;
            if (j == j5 || (c13790s = this.f56969a) == null) {
                return -1L;
            }
            if (j4 - j < j) {
                while (j4 > j) {
                    c13790s = c13790s.f57011g;
                    j4 -= (long) (c13790s.f57007c - c13790s.f57006b);
                }
            } else {
                while (true) {
                    long j6 = ((long) (c13790s.f57007c - c13790s.f57006b)) + j3;
                    if (j6 >= j) {
                        break;
                    }
                    c13790s = c13790s.f57010f;
                    j3 = j6;
                }
                j4 = j3;
            }
            long j7 = j;
            while (j4 < j5) {
                byte[] bArr = c13790s.f57005a;
                int iMin = (int) Math.min(c13790s.f57007c, (((long) c13790s.f57006b) + j5) - j4);
                for (int i = (int) ((((long) c13790s.f57006b) + j7) - j4); i < iMin; i++) {
                    if (bArr[i] == b2) {
                        return ((long) (i - c13790s.f57006b)) + j4;
                    }
                }
                j4 += (long) (c13790s.f57007c - c13790s.f57006b);
                c13790s = c13790s.f57010f;
                j7 = j4;
            }
            return -1L;
        }
        dqi0.m113073a("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f56970b), Long.valueOf(j), Long.valueOf(j2)});
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public long m81900a(ByteString byteString) {
        int i;
        int i2;
        C13790s c13790s = this.f56969a;
        if (c13790s == null) {
            return -1L;
        }
        long j = this.f56970b;
        long j2 = 0;
        if (j >= 0) {
            j = 0;
            while (true) {
                long j3 = ((long) (c13790s.f57007c - c13790s.f57006b)) + j;
                if (j3 >= 0) {
                    break;
                }
                c13790s = c13790s.f57010f;
                j = j3;
            }
        } else {
            while (j > 0) {
                c13790s = c13790s.f57011g;
                j -= (long) (c13790s.f57007c - c13790s.f57006b);
            }
        }
        if (byteString.size() == 2) {
            byte b2 = byteString.getByte(0);
            byte b3 = byteString.getByte(1);
            while (j < this.f56970b) {
                byte[] bArr = c13790s.f57005a;
                i = (int) ((((long) c13790s.f57006b) + j2) - j);
                int i3 = c13790s.f57007c;
                while (i < i3) {
                    byte b4 = bArr[i];
                    if (b4 == b2 || b4 == b3) {
                        i2 = c13790s.f57006b;
                    } else {
                        i++;
                    }
                }
                j2 = ((long) (c13790s.f57007c - c13790s.f57006b)) + j;
                c13790s = c13790s.f57010f;
                j = j2;
            }
            return -1L;
        }
        byte[] bArrMo81890a = byteString.mo81890a();
        while (j < this.f56970b) {
            byte[] bArr2 = c13790s.f57005a;
            i = (int) ((((long) c13790s.f57006b) + j2) - j);
            int i4 = c13790s.f57007c;
            while (i < i4) {
                byte b5 = bArr2[i];
                for (byte b6 : bArrMo81890a) {
                    if (b5 == b6) {
                        i2 = c13790s.f57006b;
                    }
                }
                i++;
            }
            j2 = ((long) (c13790s.f57007c - c13790s.f57006b)) + j;
            c13790s = c13790s.f57010f;
            j = j2;
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81913a(C13790s c13790s, int i, ByteString byteString, int i2, int i3) {
        int i4 = c13790s.f57007c;
        byte[] bArr = c13790s.f57005a;
        while (i2 < i3) {
            if (i == i4) {
                C13790s c13790s2 = c13790s.f57010f;
                byte[] bArr2 = c13790s2.f57005a;
                i = c13790s2.f57006b;
                c13790s = c13790s2;
                i4 = c13790s2.f57007c;
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
    public b m81903a(b bVar) {
        if (bVar.f56972a == null) {
            bVar.f56972a = this;
            bVar.f56973b = true;
            return bVar;
        }
        qkq0.m175383a("already attached to a buffer");
        return null;
    }
}
