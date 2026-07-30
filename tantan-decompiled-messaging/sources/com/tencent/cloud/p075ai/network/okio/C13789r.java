package com.tencent.cloud.p075ai.network.okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p149l.dqi0;
import p149l.hg3;
import p149l.ig3;
import p149l.jfd0;
import p149l.jg3;
import p149l.qkq0;
import p149l.rhg0;
import p149l.shg0;
import p149l.y3g0;
import p149l.y9g0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.r */
/* JADX INFO: loaded from: classes13.dex */
public final class C13789r implements InterfaceC13778g {

    /* JADX INFO: renamed from: a */
    public final C13776e f57001a = new C13776e();

    /* JADX INFO: renamed from: b */
    public final InterfaceC13794w f57002b;

    /* JADX INFO: renamed from: c */
    public boolean f57003c;

    public C13789r(InterfaceC13794w interfaceC13794w) {
        if (interfaceC13794w != null) {
            this.f57002b = interfaceC13794w;
        } else {
            jfd0.m141176a("source == null");
            throw null;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: a */
    public int mo81896a(C13787p c13787p) throws EOFException {
        C13776e c13776e;
        if (this.f57003c) {
            qkq0.m175383a("closed");
            return 0;
        }
        do {
            C13776e c13776e2 = this.f57001a;
            C13790s c13790s = c13776e2.f56969a;
            ByteString[] byteStringArr = c13787p.f56997a;
            int length = byteStringArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                ByteString byteString = byteStringArr[i];
                int iMin = (int) Math.min(c13776e2.f56970b, byteString.size());
                if (iMin == 0 || c13776e2.m81913a(c13790s, c13790s.f57006b, byteString, 0, iMin)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return -1;
            }
            long size = c13787p.f56997a[i].size();
            c13776e = this.f57001a;
            if (size <= c13776e.f56970b) {
                c13776e.mo81927d(size);
                return i;
            }
        } while (this.f57002b.mo81631a(c13776e, 8192L) != -1);
        return -1;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: b */
    public boolean mo81921b(long j) {
        C13776e c13776e;
        if (j < 0) {
            y3g0.m212802a("byteCount < 0: ", j);
            return false;
        }
        if (this.f57003c) {
            qkq0.m175383a("closed");
            return false;
        }
        do {
            c13776e = this.f57001a;
            if (c13776e.f56970b >= j) {
                return true;
            }
        } while (this.f57002b.mo81631a(c13776e, 8192L) != -1);
        return false;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: c */
    public String mo81924c(long j) throws EOFException {
        if (j < 0) {
            y3g0.m212802a("limit < 0: ", j);
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM81970a = m81970a((byte) 10, 0L, j2);
        if (jM81970a != -1) {
            return this.f57001a.m81941i(jM81970a);
        }
        if (j2 < Long.MAX_VALUE && mo81921b(j2) && this.f57001a.m81937h(j2 - 1) == 13 && mo81921b(j2 + 1) && this.f57001a.m81937h(j2) == 10) {
            return this.f57001a.m81941i(j2);
        }
        C13776e c13776e = new C13776e();
        C13776e c13776e2 = this.f57001a;
        c13776e2.m81905a(c13776e, 0L, Math.min(32L, c13776e2.f56970b));
        jg3.m141218a(Math.min(this.f57001a.f56970b, j), c13776e.m81946m().hex());
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f57003c) {
            return;
        }
        this.f57003c = true;
        this.f57002b.close();
        this.f57001a.m81944k();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: d */
    public void mo81927d(long j) throws EOFException {
        if (this.f57003c) {
            qkq0.m175383a("closed");
            return;
        }
        while (j > 0) {
            C13776e c13776e = this.f57001a;
            if (c13776e.f56970b == 0 && this.f57002b.mo81631a(c13776e, 8192L) == -1) {
                hg3.m130807a();
                return;
            } else {
                long jMin = Math.min(j, this.f57001a.f56970b);
                this.f57001a.mo81927d(jMin);
                j -= jMin;
            }
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: e */
    public String mo81930e() {
        return mo81924c(Long.MAX_VALUE);
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: f */
    public void mo81933f(long j) throws EOFException {
        if (mo81921b(j)) {
            return;
        }
        hg3.m130807a();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: g */
    public boolean mo81935g() {
        if (!this.f57003c) {
            return this.f57001a.mo81935g() && this.f57002b.mo81631a(this.f57001a, 8192L) == -1;
        }
        qkq0.m175383a("closed");
        return false;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: h */
    public byte[] mo81939h() {
        this.f57001a.m81901a(this.f57002b);
        return this.f57001a.mo81939h();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f57003c;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: j */
    public short mo81943j() throws EOFException {
        mo81933f(2L);
        return C13796y.m81980a(this.f57001a.readShort());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        C13776e c13776e = this.f57001a;
        if (c13776e.f56970b == 0 && this.f57002b.mo81631a(c13776e, 8192L) == -1) {
            return -1;
        }
        return this.f57001a.read(byteBuffer);
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    public byte readByte() throws EOFException {
        mo81933f(1L);
        return this.f57001a.readByte();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    public void readFully(byte[] bArr) throws EOFException {
        try {
            mo81933f(bArr.length);
            this.f57001a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C13776e c13776e = this.f57001a;
                long j = c13776e.f56970b;
                if (j <= 0) {
                    throw e;
                }
                int iM81897a = c13776e.m81897a(bArr, i, (int) j);
                if (iM81897a == -1) {
                    shg0.m184191a();
                    return;
                }
                i += iM81897a;
            }
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    public int readInt() throws EOFException {
        mo81933f(4L);
        return this.f57001a.readInt();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    public long readLong() throws EOFException {
        mo81933f(8L);
        return this.f57001a.readLong();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    public short readShort() throws EOFException {
        mo81933f(2L);
        return this.f57001a.readShort();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
    public C13795x timeout() {
        return this.f57002b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f57002b + ")";
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: g */
    public byte[] mo81936g(long j) throws EOFException {
        if (mo81921b(j)) {
            return this.f57001a.mo81936g(j);
        }
        hg3.m130807a();
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: b */
    public void mo81920b(C13776e c13776e, long j) throws EOFException {
        try {
            if (mo81921b(j)) {
                C13776e c13776e2 = this.f57001a;
                long j2 = c13776e2.f56970b;
                if (j2 >= j) {
                    c13776e.write(c13776e2, j);
                    return;
                } else {
                    c13776e.write(c13776e2, j2);
                    hg3.m130807a();
                    return;
                }
            }
            throw new EOFException();
        } catch (EOFException e) {
            c13776e.m81901a(this.f57001a);
            throw e;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.r$a */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            C13789r c13789r = C13789r.this;
            if (!c13789r.f57003c) {
                return (int) Math.min(c13789r.f57001a.f56970b, 2147483647L);
            }
            rhg0.m179353a("closed");
            return 0;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C13789r.this.close();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (C13789r.this.f57003c) {
                rhg0.m179353a("closed");
                return 0;
            }
            C13796y.m81981a(bArr.length, i, i2);
            C13789r c13789r = C13789r.this;
            C13776e c13776e = c13789r.f57001a;
            if (c13776e.f56970b == 0 && c13789r.f57002b.mo81631a(c13776e, 8192L) == -1) {
                return -1;
            }
            return C13789r.this.f57001a.m81897a(bArr, i, i2);
        }

        public String toString() {
            return C13789r.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            C13789r c13789r = C13789r.this;
            if (!c13789r.f57003c) {
                C13776e c13776e = c13789r.f57001a;
                if (c13776e.f56970b == 0 && c13789r.f57002b.mo81631a(c13776e, 8192L) == -1) {
                    return -1;
                }
                return C13789r.this.f57001a.readByte() & 255;
            }
            rhg0.m179353a("closed");
            return 0;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: b */
    public int mo81914b() throws EOFException {
        mo81933f(4L);
        return C13796y.m81979a(this.f57001a.readInt());
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: d */
    public InputStream mo81926d() {
        return new a();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
    /* JADX INFO: renamed from: a */
    public long mo81631a(C13776e c13776e, long j) {
        if (c13776e == null) {
            ig3.m135964a("sink == null");
            return 0L;
        }
        if (j >= 0) {
            if (!this.f57003c) {
                C13776e c13776e2 = this.f57001a;
                if (c13776e2.f56970b == 0 && this.f57002b.mo81631a(c13776e2, 8192L) == -1) {
                    return -1L;
                }
                return this.f57001a.mo81631a(c13776e, Math.min(j, this.f57001a.f56970b));
            }
            qkq0.m175383a("closed");
            return 0L;
        }
        y3g0.m212802a("byteCount < 0: ", j);
        return 0L;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: a */
    public ByteString mo81902a(long j) throws EOFException {
        if (mo81921b(j)) {
            return this.f57001a.mo81902a(j);
        }
        hg3.m130807a();
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g, com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: a */
    public C13776e mo81904a() {
        return this.f57001a;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: a */
    public String mo81912a(Charset charset) {
        if (charset != null) {
            this.f57001a.m81901a(this.f57002b);
            C13776e c13776e = this.f57001a;
            c13776e.getClass();
            try {
                return c13776e.m81911a(c13776e.f56970b, charset);
            } catch (EOFException e) {
                y9g0.m213537a(e);
                return null;
            }
        }
        ig3.m135964a("charset == null");
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: a */
    public long mo81898a(byte b) {
        return m81970a(b, 0L, Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: a */
    public long m81970a(byte b, long j, long j2) {
        if (this.f57003c) {
            qkq0.m175383a("closed");
            return 0L;
        }
        if (j < 0 || j2 < j) {
            dqi0.m113073a("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)});
            return 0L;
        }
        long jMax = j;
        while (jMax < j2) {
            byte b2 = b;
            long j3 = j2;
            long jM81899a = this.f57001a.m81899a(b2, jMax, j3);
            if (jM81899a != -1) {
                return jM81899a;
            }
            C13776e c13776e = this.f57001a;
            long j4 = c13776e.f56970b;
            if (j4 >= j3 || this.f57002b.mo81631a(c13776e, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13778g
    /* JADX INFO: renamed from: c */
    public long mo81922c() throws EOFException {
        mo81933f(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo81921b(i2)) {
                break;
            }
            byte bM81937h = this.f57001a.m81937h(i);
            if ((bM81937h < 48 || bM81937h > 57) && ((bM81937h < 97 || bM81937h > 102) && (bM81937h < 65 || bM81937h > 70))) {
                if (i != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bM81937h)));
            }
            i = i2;
        }
        return this.f57001a.mo81922c();
    }
}
